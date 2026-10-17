package eye;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import org.jetbrains.annotations.NotNull;
import u80.p;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f130848a;

    public b(g topupMoneyUtils) {
        Intrinsics.checkNotNullParameter(topupMoneyUtils, "topupMoneyUtils");
        this.f130848a = topupMoneyUtils;
    }

    public final dj0.d a(String amount, String currency) {
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(currency, "currencyCode");
        if (d0.W(amount)) {
            xi0.b.Companion.getClass();
            return new dj0.d(-1L, xi0.a.a(currency));
        }
        g gVar = this.f130848a;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(currency, "currency");
        p pVar = p.f278066a;
        long jA = p.a(amount, currency, gVar.f130857a, null);
        xi0.b.Companion.getClass();
        return new dj0.d(jA, xi0.a.a(currency));
    }
}
