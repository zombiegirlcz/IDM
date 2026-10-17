package gjb;

import a0.d;
import com.revolut.feature.tab.accounts.models.ProductId;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f144248a = p.a.p("Total-", ProductId.TEEN.getId(), ProductId.SAVINGS.getId());

    public static final class a {
        private a() {
        }
    }

    public static String a(String teenId) {
        Intrinsics.checkNotNullParameter(teenId, "teenId");
        return d.r(f144248a, teenId);
    }

    public static boolean b(String accountId) {
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        return a0.H(accountId, f144248a, false);
    }
}
