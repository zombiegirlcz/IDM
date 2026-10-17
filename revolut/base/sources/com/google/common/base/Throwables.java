package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class Throwables {

    @J2ktIncompatible
    @GwtIncompatible
    private static final String JAVA_LANG_ACCESS_CLASSNAME = "sun.misc.JavaLangAccess";

    @VisibleForTesting
    @J2ktIncompatible
    @GwtIncompatible
    static final String SHARED_SECRETS_CLASSNAME = "sun.misc.SharedSecrets";

    @J2ktIncompatible
    @GwtIncompatible
    private static final Method getStackTraceDepthMethod;

    @J2ktIncompatible
    @GwtIncompatible
    private static final Method getStackTraceElementMethod;

    /* JADX INFO: renamed from: jla, reason: collision with root package name */
    @J2ktIncompatible
    @GwtIncompatible
    private static final Object f49178jla;

    static {
        Object jla2 = getJLA();
        f49178jla = jla2;
        getStackTraceElementMethod = jla2 == null ? null : getGetMethod();
        getStackTraceDepthMethod = jla2 != null ? getSizeMethod(jla2) : null;
    }

    private Throwables() {
    }

    public static List<Throwable> getCausalChain(Throwable th10) {
        Preconditions.checkNotNull(th10);
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(th10);
        boolean z = false;
        Throwable cause = th10;
        while (true) {
            th10 = th10.getCause();
            if (th10 == null) {
                return Collections.unmodifiableList(arrayList);
            }
            arrayList.add(th10);
            if (th10 == cause) {
                throw new IllegalArgumentException("Loop in causal chain detected.", th10);
            }
            if (z) {
                cause = cause.getCause();
            }
            z = !z;
        }
    }

    @GwtIncompatible
    public static <X extends Throwable> X getCauseAs(Throwable th10, Class<X> cls) {
        try {
            return cls.cast(th10.getCause());
        } catch (ClassCastException e) {
            e.initCause(th10);
            throw e;
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    private static Method getGetMethod() {
        return getJlaMethod("getStackTraceElement", Throwable.class, Integer.TYPE);
    }

    @J2ktIncompatible
    @GwtIncompatible
    private static Object getJLA() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", null).invoke(null, null);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    private static Method getJlaMethod(String str, Class<?>... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Throwable getRootCause(Throwable th10) {
        boolean z = false;
        Throwable cause = th10;
        while (true) {
            Throwable cause2 = th10.getCause();
            if (cause2 == null) {
                return th10;
            }
            if (cause2 == cause) {
                throw new IllegalArgumentException("Loop in causal chain detected.", cause2);
            }
            if (z) {
                cause = cause.getCause();
            }
            z = !z;
            th10 = cause2;
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    private static Method getSizeMethod(Object obj2) {
        try {
            Method jlaMethod = getJlaMethod("getStackTraceDepth", Throwable.class);
            if (jlaMethod == null) {
                return null;
            }
            jlaMethod.invoke(obj2, new Throwable());
            return jlaMethod;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    @GwtIncompatible
    public static String getStackTraceAsString(Throwable th10) {
        StringWriter stringWriter = new StringWriter();
        th10.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @J2ktIncompatible
    @GwtIncompatible
    public static Object invokeAccessibleNonThrowingMethod(Method method, Object obj2, Object... objArr) {
        try {
            return method.invoke(obj2, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e2) {
            throw propagate(e2.getCause());
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    private static List<StackTraceElement> jlaStackTrace(final Throwable th10) {
        Preconditions.checkNotNull(th10);
        return new AbstractList<StackTraceElement>() { // from class: com.google.common.base.Throwables.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                Method method = Throwables.getStackTraceDepthMethod;
                java.util.Objects.requireNonNull(method);
                Object obj2 = Throwables.f49178jla;
                java.util.Objects.requireNonNull(obj2);
                return ((Integer) Throwables.invokeAccessibleNonThrowingMethod(method, obj2, th10)).intValue();
            }

            @Override // java.util.AbstractList, java.util.List
            public StackTraceElement get(int i) {
                Method method = Throwables.getStackTraceElementMethod;
                java.util.Objects.requireNonNull(method);
                Object obj2 = Throwables.f49178jla;
                java.util.Objects.requireNonNull(obj2);
                return (StackTraceElement) Throwables.invokeAccessibleNonThrowingMethod(method, obj2, th10, Integer.valueOf(i));
            }
        };
    }

    @J2ktIncompatible
    @GwtIncompatible
    @Deprecated
    public static List<StackTraceElement> lazyStackTrace(Throwable th10) {
        return lazyStackTraceIsLazy() ? jlaStackTrace(th10) : Collections.unmodifiableList(Arrays.asList(th10.getStackTrace()));
    }

    @J2ktIncompatible
    @GwtIncompatible
    @Deprecated
    public static boolean lazyStackTraceIsLazy() {
        return (getStackTraceElementMethod == null || getStackTraceDepthMethod == null) ? false : true;
    }

    @J2ktIncompatible
    @GwtIncompatible
    @Deprecated
    public static RuntimeException propagate(Throwable th10) {
        throwIfUnchecked(th10);
        throw new RuntimeException(th10);
    }

    @GwtIncompatible
    @Deprecated
    @J2ktIncompatible
    public static <X extends Throwable> void propagateIfInstanceOf(Throwable th10, Class<X> cls) throws Throwable {
        if (th10 != null) {
            throwIfInstanceOf(th10, cls);
        }
    }

    @J2ktIncompatible
    @GwtIncompatible
    @Deprecated
    public static void propagateIfPossible(Throwable th10) {
        if (th10 != null) {
            throwIfUnchecked(th10);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    @GwtIncompatible
    public static <X extends Throwable> void throwIfInstanceOf(Throwable th10, Class<X> cls) throws Throwable {
        Preconditions.checkNotNull(th10);
        if (cls.isInstance(th10)) {
            throw cls.cast(th10);
        }
    }

    public static void throwIfUnchecked(Throwable th10) {
        Preconditions.checkNotNull(th10);
        if (th10 instanceof RuntimeException) {
            throw ((RuntimeException) th10);
        }
        if (th10 instanceof Error) {
            throw ((Error) th10);
        }
    }

    @GwtIncompatible
    @Deprecated
    @J2ktIncompatible
    public static <X extends Throwable> void propagateIfPossible(Throwable th10, Class<X> cls) throws Throwable {
        propagateIfInstanceOf(th10, cls);
        propagateIfPossible(th10);
    }

    @GwtIncompatible
    @Deprecated
    @J2ktIncompatible
    public static <X1 extends Throwable, X2 extends Throwable> void propagateIfPossible(Throwable th10, Class<X1> cls, Class<X2> cls2) throws Throwable {
        Preconditions.checkNotNull(cls2);
        propagateIfInstanceOf(th10, cls);
        propagateIfPossible(th10, cls2);
    }
}
