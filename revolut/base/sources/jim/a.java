package jim;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.p;

/* JADX INFO: loaded from: classes13.dex */
public class a extends iim.a {

    /* JADX INFO: renamed from: jim.a$a, reason: collision with other inner class name */
    /* JADX INFO: loaded from: classes14.dex */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ljim/a$a;", "", "kotlin-stdlib-jdk7"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0993a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C0993a f174611a = new C0993a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Integer f174612b;

        static {
            Object obj2;
            Integer num = null;
            try {
                obj2 = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj2 instanceof Integer ? (Integer) obj2 : null;
            if (num2 != null && num2.intValue() > 0) {
                num = num2;
            }
            f174612b = num;
        }
    }

    @Override // iim.a
    public final void a(Throwable cause, Throwable exception) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Intrinsics.checkNotNullParameter(exception, "exception");
        Integer num = C0993a.f174612b;
        if (num == null || num.intValue() >= 19) {
            cause.addSuppressed(exception);
        } else {
            super.a(cause, exception);
        }
    }

    @Override // iim.a
    public final List b(Throwable exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        Integer num = C0993a.f174612b;
        if (num != null && num.intValue() < 19) {
            return super.b(exception);
        }
        Throwable[] suppressed = exception.getSuppressed();
        Intrinsics.checkNotNullExpressionValue(suppressed, "getSuppressed(...)");
        return p.c(suppressed);
    }
}
