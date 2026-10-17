package kim;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public class a extends jim.a {

    /* JADX INFO: renamed from: kim.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkim/a$a;", "", "kotlin-stdlib-jdk8"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C1051a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final C1051a f184252a = new C1051a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Integer f184253b;

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
            f184253b = num;
        }
    }

    public static boolean c(int i) {
        Integer num = C1051a.f184253b;
        return num == null || num.intValue() >= i;
    }
}
