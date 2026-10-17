package gcm;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes13.dex */
public final class w4 implements r2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f142928b = Logger.getLogger(w4.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Constructor f142929c;
    public static final Method d;
    public static final RuntimeException e;
    public static final Object[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f142930a;

    static {
        Method method;
        Constructor<?> constructor;
        try {
            Class<?> cls = Class.forName("java.util.concurrent.atomic.LongAdder");
            method = cls.getMethod("add", Long.TYPE);
            try {
                cls.getMethod("sum", null);
                Constructor<?>[] constructors = cls.getConstructors();
                int length = constructors.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        constructor = null;
                        break;
                    }
                    constructor = constructors[i];
                    if (constructor.getParameterTypes().length == 0) {
                        break;
                    } else {
                        i++;
                    }
                }
                th = null;
            } catch (Throwable th10) {
                th = th10;
                f142928b.log(Level.FINE, "LongAdder can not be found via reflection, this is normal for JDK7 and below", th);
                constructor = null;
            }
        } catch (Throwable th11) {
            th = th11;
            method = null;
        }
        if (th != null || constructor == null) {
            f142929c = null;
            d = null;
            e = new RuntimeException(th);
        } else {
            f142929c = constructor;
            d = method;
            e = null;
        }
        f = new Object[]{1L};
    }

    public w4() {
        RuntimeException runtimeException = e;
        if (runtimeException != null) {
            throw runtimeException;
        }
        try {
            this.f142930a = f142929c.newInstance(null);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InstantiationException e4) {
            throw new RuntimeException(e4);
        } catch (InvocationTargetException e5) {
            throw new RuntimeException(e5);
        }
    }

    @Override // gcm.r2
    public final void e() {
        try {
            d.invoke(this.f142930a, f);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e4) {
            throw new RuntimeException(e4);
        }
    }
}
