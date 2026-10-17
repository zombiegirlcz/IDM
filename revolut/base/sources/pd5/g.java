package pd5;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f235102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f235103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f235104c;
    public final List d;
    public final Set e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f235105g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f235106h;

    public g(xi0.b id10, String addressUrl, String transactionUrl, List availableWithdrawalBlockchains, Set availableDeFiWithdrawalBlockchains, List availableDepositBlockchains, Map minimumDeposit, j jVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(addressUrl, "addressUrl");
        Intrinsics.checkNotNullParameter(transactionUrl, "transactionUrl");
        Intrinsics.checkNotNullParameter(availableWithdrawalBlockchains, "availableWithdrawalBlockchains");
        Intrinsics.checkNotNullParameter(availableDeFiWithdrawalBlockchains, "availableDeFiWithdrawalBlockchains");
        Intrinsics.checkNotNullParameter(availableDepositBlockchains, "availableDepositBlockchains");
        Intrinsics.checkNotNullParameter(minimumDeposit, "minimumDeposit");
        this.f235102a = id10;
        this.f235103b = addressUrl;
        this.f235104c = transactionUrl;
        this.d = availableWithdrawalBlockchains;
        this.e = availableDeFiWithdrawalBlockchains;
        this.f = availableDepositBlockchains;
        this.f235105g = minimumDeposit;
        this.f235106h = jVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f235102a.equals(gVar.f235102a) && Intrinsics.f(this.f235103b, gVar.f235103b) && Intrinsics.f(this.f235104c, gVar.f235104c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && this.f235105g.equals(gVar.f235105g) && Intrinsics.f(this.f235106h, gVar.f235106h);
    }

    public final int hashCode() {
        int iB = p.a.b(p.a.d(p.a.f(p.a.d(p.a.c(p.a.c(this.f235102a.hashCode() * 31, 31, this.f235103b), 31, this.f235104c), 31, this.d), 31, this.e), 31, this.f), 31, this.f235105g);
        j jVar = this.f235106h;
        return iB + (jVar == null ? 0 : jVar.f235111a.hashCode());
    }
}
