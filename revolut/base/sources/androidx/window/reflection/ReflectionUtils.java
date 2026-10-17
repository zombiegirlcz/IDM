package androidx.window.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import nim.a;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0010\u001a\u00020\u00072\u0010\u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u0006H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0016\u001a\u00020\u0007*\u00020\u00112\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u0007*\u00020\u00112\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\fH\u0000¢\u0006\u0004\b\u0014\u0010\u0017R\u0018\u0010\u001a\u001a\u00020\u0007*\u00020\u00118@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Landroidx/window/reflection/ReflectionUtils;", "", "<init>", "()V", "", "errorMessage", "Lkotlin/Function0;", "", "block", "validateReflection$window_release", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Z", "validateReflection", "Ljava/lang/Class;", "classLoader", "checkIsPresent$window_release", "(Lkotlin/jvm/functions/Function0;)Z", "checkIsPresent", "Ljava/lang/reflect/Method;", "Lkotlin/reflect/KClass;", "clazz", "doesReturn$window_release", "(Ljava/lang/reflect/Method;Lkotlin/reflect/KClass;)Z", "doesReturn", "(Ljava/lang/reflect/Method;Ljava/lang/Class;)Z", "isPublic$window_release", "(Ljava/lang/reflect/Method;)Z", "isPublic", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ReflectionUtils {

    @NotNull
    public static final ReflectionUtils INSTANCE = new ReflectionUtils();

    private ReflectionUtils() {
    }

    public static final boolean validateReflection$window_release(@NotNull String errorMessage, @NotNull Function0<Boolean> block) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            boolean zBooleanValue = ((Boolean) block.invoke()).booleanValue();
            if (!zBooleanValue) {
            }
            return zBooleanValue;
        } catch (ClassNotFoundException unused) {
            String str = "ClassNotFound: " + errorMessage;
            return false;
        } catch (NoSuchFieldException unused2) {
            String str2 = "NoSuchField: " + errorMessage;
            return false;
        } catch (NoSuchMethodException unused3) {
            String str3 = "NoSuchMethod: " + errorMessage;
            return false;
        }
    }

    public final boolean checkIsPresent$window_release(@NotNull Function0<? extends Class<?>> classLoader) {
        Intrinsics.checkNotNullParameter(classLoader, "classLoader");
        try {
            classLoader.invoke();
            return true;
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            return false;
        }
    }

    public final boolean doesReturn$window_release(@NotNull Method method, @NotNull KClass clazz) {
        Intrinsics.checkNotNullParameter(method, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return doesReturn$window_release(method, a.o(clazz));
    }

    public final boolean isPublic$window_release(@NotNull Method method) {
        Intrinsics.checkNotNullParameter(method, "<this>");
        return Modifier.isPublic(method.getModifiers());
    }

    public final boolean doesReturn$window_release(@NotNull Method method, @NotNull Class<?> clazz) {
        Intrinsics.checkNotNullParameter(method, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return method.getReturnType().equals(clazz);
    }
}
