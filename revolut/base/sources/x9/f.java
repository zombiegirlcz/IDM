package x9;

import ch.qos.logback.core.CoreConstants;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.databind.JavaType;
import java.lang.annotation.Annotation;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import v9.o0;

/* JADX INFO: loaded from: classes16.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Annotation[] f303505a = new Annotation[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d[] f303506b = new d[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Iterator f303507c = Collections.emptyIterator();

    public static void a(Class cls, Class cls2, ArrayList arrayList) {
        if (cls == cls2 || cls == null || cls == Object.class || arrayList.contains(cls)) {
            return;
        }
        arrayList.add(cls);
        for (Class<?> cls3 : cls.getInterfaces()) {
            a(cls3, cls2, arrayList);
        }
        a(cls.getSuperclass(), cls2, arrayList);
    }

    public static void b(Class cls, Throwable th10) {
        String name = cls.getName();
        String name2 = th10.getClass().getName();
        String message = th10.getMessage();
        StringBuilder sbM = v0.a.m("Failed on call to `getDeclaredMethods()` on class `", name, "`, problem: (", name2, ") ");
        sbM.append(message);
        throw new IllegalArgumentException(sbM.toString(), th10);
    }

    public static String c(String str) {
        if (str == null) {
            return "[null]";
        }
        StringBuilder sb6 = new StringBuilder(str.length() + 2);
        sb6.append(CoreConstants.SINGLE_QUOTE_CHAR);
        sb6.append(str);
        sb6.append(CoreConstants.SINGLE_QUOTE_CHAR);
        return sb6.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void d(Member member, boolean z) {
        AccessibleObject accessibleObject = (AccessibleObject) member;
        try {
            Class<?> declaringClass = member.getDeclaringClass();
            if (Modifier.isPublic(member.getModifiers()) && Modifier.isPublic(declaringClass.getModifiers()) && (!z || p(declaringClass))) {
                return;
            }
            accessibleObject.setAccessible(true);
        } catch (SecurityException e) {
            if (accessibleObject.isAccessible()) {
                return;
            }
            throw new IllegalArgumentException("Cannot access " + member + " (from class " + member.getDeclaringClass().getName() + "; failed to set access: " + e.getMessage());
        } catch (RuntimeException e2) {
            if (!"InaccessibleObjectException".equals(e2.getClass().getSimpleName())) {
                throw e2;
            }
            String simpleName = member.getClass().getSimpleName();
            String name = member.getName();
            String strS = s(member.getDeclaringClass());
            String name2 = e2.getClass().getName();
            String message = e2.getMessage();
            StringBuilder sbM = v0.a.m("Failed to call `setAccess()` on ", simpleName, " '", name, "' (of class ");
            j6.a.D(sbM, strS, ") due to `", name2, "`, problem: ");
            sbM.append(message);
            throw new IllegalArgumentException(sbM.toString(), e2);
        }
    }

    public static String e(Object obj2) {
        if (obj2 == null) {
            return "[null]";
        }
        return s(obj2 instanceof Class ? (Class) obj2 : obj2.getClass());
    }

    public static Object f(Class cls, boolean z) {
        Constructor declaredConstructor;
        try {
            declaredConstructor = cls.getDeclaredConstructor(null);
            if (z) {
                d(declaredConstructor, z);
            } else if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
                throw new IllegalArgumentException("Default constructor for " + cls.getName() + " is not accessible (non-public?): not allowed to try modify access via Reflection: cannot instantiate type");
            }
        } catch (NoSuchMethodException unused) {
            declaredConstructor = null;
        } catch (Exception e) {
            e = e;
            String str = "Failed to find default constructor of class " + cls.getName() + ", problem: " + e.getMessage();
            while (e.getCause() != null) {
                e = e.getCause();
            }
            u(e);
            if (e instanceof Error) {
                throw ((Error) e);
            }
            throw new IllegalArgumentException(str, e);
        }
        if (declaredConstructor == null) {
            throw new IllegalArgumentException(j6.a.o(cls, new StringBuilder("Class "), " has no default (no arg) constructor"));
        }
        try {
            return declaredConstructor.newInstance(null);
        } catch (Exception e2) {
            e = e2;
            String str2 = "Failed to instantiate class " + cls.getName() + ", problem: " + e.getMessage();
            while (e.getCause() != null) {
                e = e.getCause();
            }
            u(e);
            if (e instanceof Error) {
                throw ((Error) e);
            }
            throw new IllegalArgumentException(str2, e);
        }
    }

    public static String g(Throwable th10) {
        return th10 instanceof JacksonException ? ((JacksonException) th10).a() : (!(th10 instanceof InvocationTargetException) || th10.getCause() == null) ? th10.getMessage() : th10.getCause().getMessage();
    }

    public static Annotation[] h(Class cls) {
        return r(cls) ? f303505a : cls.getDeclaredAnnotations();
    }

    public static ArrayList i(Class cls, Class cls2, boolean z) {
        ArrayList arrayList = new ArrayList(8);
        if (cls != null && cls != cls2) {
            if (z) {
                arrayList.add(cls);
            }
            while (true) {
                cls = cls.getSuperclass();
                if (cls == null || cls == cls2) {
                    break;
                }
                arrayList.add(cls);
            }
        }
        return arrayList;
    }

    public static Method[] j(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e) {
            ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
            if (contextClassLoader == null) {
                throw null;
            }
            try {
                try {
                    return contextClassLoader.loadClass(cls.getName()).getDeclaredMethods();
                } finally {
                }
            } catch (ClassNotFoundException e2) {
                e.addSuppressed(e2);
                throw null;
            }
        } finally {
        }
    }

    public static d[] k(Class cls) {
        if (cls.isInterface() || r(cls)) {
            return f303506b;
        }
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        int length = declaredConstructors.length;
        d[] dVarArr = new d[length];
        for (int i = 0; i < length; i++) {
            dVarArr[i] = new d(declaredConstructors[i]);
        }
        return dVarArr;
    }

    public static Class l(Class cls) {
        if (!Modifier.isStatic(cls.getModifiers())) {
            try {
                if ((r(cls) || cls.getEnclosingMethod() == null) && !r(cls)) {
                    return cls.getEnclosingClass();
                }
                return null;
            } catch (SecurityException unused) {
            }
        }
        return null;
    }

    public static String m(JavaType javaType) {
        if (javaType == null) {
            return "[null]";
        }
        StringBuilder sb6 = new StringBuilder(80);
        sb6.append('`');
        sb6.append(javaType.N());
        sb6.append('`');
        return sb6.toString();
    }

    public static boolean n(Object obj2, Class cls) {
        return obj2 != null && obj2.getClass() == cls;
    }

    public static boolean o(Class cls) {
        return cls == Void.class || cls == Void.TYPE || cls == l9.l.class;
    }

    public static boolean p(Class cls) {
        String name = cls.getName();
        return name.startsWith("java.") || name.startsWith("javax.");
    }

    public static boolean q(k9.k kVar) {
        return kVar == null || kVar.getClass().getAnnotation(l9.a.class) != null;
    }

    public static boolean r(Class cls) {
        return cls == Object.class || cls.isPrimitive();
    }

    public static String s(Class cls) {
        if (cls == null) {
            return "[null]";
        }
        int i = 0;
        while (cls.isArray()) {
            i++;
            cls = cls.getComponentType();
        }
        String simpleName = cls.isPrimitive() ? cls.getSimpleName() : cls.getName();
        if (i > 0) {
            StringBuilder sb6 = new StringBuilder(simpleName);
            do {
                sb6.append("[]");
                i--;
            } while (i > 0);
            simpleName = sb6.toString();
        }
        if (simpleName == null) {
            return "[null]";
        }
        StringBuilder sb9 = new StringBuilder(simpleName.length() + 2);
        sb9.append('`');
        sb9.append(simpleName);
        sb9.append('`');
        return sb9.toString();
    }

    public static Class t(Class cls) {
        if (cls.isPrimitive()) {
            return cls;
        }
        if (cls == Integer.class) {
            return Integer.TYPE;
        }
        if (cls == Long.class) {
            return Long.TYPE;
        }
        if (cls == Boolean.class) {
            return Boolean.TYPE;
        }
        if (cls == Double.class) {
            return Double.TYPE;
        }
        if (cls == Float.class) {
            return Float.TYPE;
        }
        if (cls == Byte.class) {
            return Byte.TYPE;
        }
        if (cls == Short.class) {
            return Short.TYPE;
        }
        if (cls == Character.class) {
            return Character.TYPE;
        }
        return null;
    }

    public static void u(Throwable th10) {
        if (th10 instanceof RuntimeException) {
            throw ((RuntimeException) th10);
        }
    }

    public static void v(Class cls, o0 o0Var, String str) {
        if (o0Var.getClass() != cls) {
            throw new IllegalStateException(v0.a.i(v0.a.m("Sub-class ", o0Var.getClass().getName(), " (of class ", cls.getName(), ") must override method '"), str, "'"));
        }
    }
}
