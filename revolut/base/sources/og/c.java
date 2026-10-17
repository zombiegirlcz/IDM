package og;

import ch.qos.logback.core.CoreConstants;
import com.google.gson.JsonIOException;
import com.google.gson.internal.j;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import te0.w;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f224953a;

    static {
        w aVar;
        try {
            aVar = new b();
        } catch (ReflectiveOperationException unused) {
            aVar = new a();
        }
        f224953a = aVar;
    }

    public static void a(AccessibleObject accessibleObject, StringBuilder sb6) {
        sb6.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
        Class<?>[] parameterTypes = accessibleObject instanceof Method ? ((Method) accessibleObject).getParameterTypes() : ((Constructor) accessibleObject).getParameterTypes();
        for (int i = 0; i < parameterTypes.length; i++) {
            if (i > 0) {
                sb6.append(", ");
            }
            sb6.append(parameterTypes[i].getSimpleName());
        }
        sb6.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public static String b(Constructor constructor) {
        StringBuilder sb6 = new StringBuilder(constructor.getDeclaringClass().getName());
        a(constructor, sb6);
        return sb6.toString();
    }

    public static String c(Field field) {
        return field.getDeclaringClass().getName() + "#" + field.getName();
    }

    public static String d(AccessibleObject accessibleObject, boolean z) {
        String str;
        if (accessibleObject instanceof Field) {
            str = "field '" + c((Field) accessibleObject) + "'";
        } else if (accessibleObject instanceof Method) {
            Method method = (Method) accessibleObject;
            StringBuilder sb6 = new StringBuilder(method.getName());
            a(method, sb6);
            str = "method '" + method.getDeclaringClass().getName() + "#" + sb6.toString() + "'";
        } else if (accessibleObject instanceof Constructor) {
            str = "constructor '" + b((Constructor) accessibleObject) + "'";
        } else {
            str = "<unknown AccessibleObject> " + accessibleObject.toString();
        }
        if (!z || !Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }

    public static String e(Exception exc2) {
        if (!exc2.getClass().getName().equals("java.lang.reflect.InaccessibleObjectException")) {
            return "";
        }
        String message = exc2.getMessage();
        return "\nSee " + j.f((message == null || !message.contains("to module com.google.gson")) ? "reflection-inaccessible" : "reflection-inaccessible-to-module-gson");
    }

    public static void f(AccessibleObject accessibleObject) {
        try {
            accessibleObject.setAccessible(true);
        } catch (Exception e) {
            StringBuilder sbX = com.google.android.gms.internal.mlkit_vision_face.a.x("Failed making ", d(accessibleObject, false), " accessible; either increase its visibility or write a custom TypeAdapter for its declaring type.");
            sbX.append(e(e));
            throw new JsonIOException(sbX.toString(), e);
        }
    }
}
