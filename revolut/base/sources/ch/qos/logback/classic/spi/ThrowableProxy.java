package ch.qos.logback.classic.spi;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class ThrowableProxy implements IThrowableProxy {
    private static final Method GET_SUPPRESSED_METHOD;
    private static final StackTraceElementProxy[] NO_STACK_TRACE;
    private static final ThrowableProxy[] NO_SUPPRESSED;
    private boolean calculatedPackageData;
    private ThrowableProxy cause;
    private String className;
    int commonFrames;
    private String message;
    private transient PackagingDataCalculator packagingDataCalculator;
    StackTraceElementProxy[] stackTraceElementProxyArray;
    private ThrowableProxy[] suppressed;
    private Throwable throwable;

    static {
        Method method = null;
        try {
            method = Throwable.class.getMethod("getSuppressed", null);
        } catch (NoSuchMethodException unused) {
        }
        GET_SUPPRESSED_METHOD = method;
        NO_SUPPRESSED = new ThrowableProxy[0];
        NO_STACK_TRACE = new StackTraceElementProxy[0];
    }

    public ThrowableProxy(Throwable th10) {
        this(th10, Collections.newSetFromMap(new IdentityHashMap(1)));
    }

    public void calculatePackagingData() {
        PackagingDataCalculator packagingDataCalculator;
        if (this.calculatedPackageData || (packagingDataCalculator = getPackagingDataCalculator()) == null) {
            return;
        }
        this.calculatedPackageData = true;
        packagingDataCalculator.calculate(this);
    }

    public void fullDump() {
        StringBuilder sb6 = new StringBuilder();
        for (StackTraceElementProxy stackTraceElementProxy : this.stackTraceElementProxyArray) {
            String string = stackTraceElementProxy.toString();
            sb6.append('\t');
            sb6.append(string);
            ThrowableProxyUtil.subjoinPackagingData(sb6, stackTraceElementProxy);
            sb6.append(CoreConstants.LINE_SEPARATOR);
        }
        System.out.println(sb6.toString());
    }

    @Override // ch.qos.logback.classic.spi.IThrowableProxy
    public IThrowableProxy getCause() {
        return this.cause;
    }

    @Override // ch.qos.logback.classic.spi.IThrowableProxy
    public String getClassName() {
        return this.className;
    }

    @Override // ch.qos.logback.classic.spi.IThrowableProxy
    public int getCommonFrames() {
        return this.commonFrames;
    }

    @Override // ch.qos.logback.classic.spi.IThrowableProxy
    public String getMessage() {
        return this.message;
    }

    public PackagingDataCalculator getPackagingDataCalculator() {
        if (this.throwable != null && this.packagingDataCalculator == null) {
            this.packagingDataCalculator = new PackagingDataCalculator();
        }
        return this.packagingDataCalculator;
    }

    @Override // ch.qos.logback.classic.spi.IThrowableProxy
    public StackTraceElementProxy[] getStackTraceElementProxyArray() {
        return this.stackTraceElementProxyArray;
    }

    @Override // ch.qos.logback.classic.spi.IThrowableProxy
    public IThrowableProxy[] getSuppressed() {
        return this.suppressed;
    }

    public Throwable getThrowable() {
        return this.throwable;
    }

    private ThrowableProxy(Throwable th10, Set<Throwable> set) {
        this.suppressed = NO_SUPPRESSED;
        this.calculatedPackageData = false;
        this.throwable = th10;
        this.className = th10.getClass().getName();
        this.message = th10.getMessage();
        this.stackTraceElementProxyArray = ThrowableProxyUtil.steArrayToStepArray(th10.getStackTrace());
        if (set.contains(th10)) {
            this.className = "CIRCULAR REFERENCE:".concat(th10.getClass().getName());
            this.stackTraceElementProxyArray = NO_STACK_TRACE;
            return;
        }
        set.add(th10);
        Throwable cause = th10.getCause();
        if (cause != null) {
            ThrowableProxy throwableProxy = new ThrowableProxy(cause, set);
            this.cause = throwableProxy;
            throwableProxy.commonFrames = ThrowableProxyUtil.findNumberOfCommonFrames(cause.getStackTrace(), this.stackTraceElementProxyArray);
        }
        Method method = GET_SUPPRESSED_METHOD;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(th10, null);
                if (objInvoke instanceof Throwable[]) {
                    Throwable[] thArr = (Throwable[]) objInvoke;
                    if (thArr.length > 0) {
                        this.suppressed = new ThrowableProxy[thArr.length];
                        for (int i = 0; i < thArr.length; i++) {
                            this.suppressed[i] = new ThrowableProxy(thArr[i], set);
                            this.suppressed[i].commonFrames = ThrowableProxyUtil.findNumberOfCommonFrames(thArr[i].getStackTrace(), this.stackTraceElementProxyArray);
                        }
                    }
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }
}
