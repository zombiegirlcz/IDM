package iim;

import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.f0;
import zhm.p;

/* JADX INFO: loaded from: classes13.dex */
public class a {

    /* JADX INFO: renamed from: iim.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: classes14.dex */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Liim/a$a;", "", "kotlin-stdlib"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0925a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0925a f161639a = new C0925a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Method f161640b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Method f161641c;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            Intrinsics.h(methods);
            int length = methods.length;
            int i = 0;
            int i2 = 0;
            while (true) {
                method = null;
                if (i2 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i2];
                if (Intrinsics.f(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
                    Intrinsics.checkNotNullParameter(parameterTypes, "<this>");
                    if (Intrinsics.f(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                        break;
                    }
                }
                i2++;
            }
            f161640b = method2;
            int length2 = methods.length;
            while (true) {
                if (i >= length2) {
                    break;
                }
                Method method3 = methods[i];
                if (Intrinsics.f(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
                i++;
            }
            f161641c = method;
        }
    }

    public void a(Throwable cause, Throwable exception) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Method method = C0925a.f161640b;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    public List b(Throwable exception) {
        Object objInvoke;
        List listC;
        Intrinsics.checkNotNullParameter(exception, "exception");
        Method method = C0925a.f161641c;
        return (method == null || (objInvoke = method.invoke(exception, null)) == null || (listC = p.c((Throwable[]) objInvoke)) == null) ? f0.f322471a : listC;
    }
}
