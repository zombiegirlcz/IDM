package bg2;

import com.revolut.feature.apm.core.models.transfers.payments.ApmQuoteLimits;
import kl.c0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class n implements cli.n {

    @NotNull
    public static final m Companion = new m();
    public static final Regex f = new Regex("^[a-zA-Z0-9 -]*$");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yof.d f15067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w80.b f15068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l80.e f15069c;
    public final c0 d;
    public final tn9.a e;

    public n(yof.d transferAmountMapper, u80.o moneyPrefixFormatter, w80.b amountFormatter, l80.e dateProvider, c0 beneficiaryNavBarMapper, tn9.a paymentCounterpartyMapper) {
        Intrinsics.checkNotNullParameter(transferAmountMapper, "transferAmountMapper");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(beneficiaryNavBarMapper, "beneficiaryNavBarMapper");
        Intrinsics.checkNotNullParameter(paymentCounterpartyMapper, "paymentCounterpartyMapper");
        this.f15067a = transferAmountMapper;
        this.f15068b = amountFormatter;
        this.f15069c = dateProvider;
        this.d = beneficiaryNavBarMapper;
        this.e = paymentCounterpartyMapper;
    }

    public static boolean a(g gVar) {
        dj0.d dVar;
        long j2 = gVar.f15052a.f115082a;
        ApmQuoteLimits apmQuoteLimits = gVar.f15058l;
        Long lValueOf = (apmQuoteLimits == null || (dVar = apmQuoteLimits.f62225a) == null) ? null : Long.valueOf(dVar.f115082a);
        return lValueOf != null && j2 > 0 && j2 < lValueOf.longValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0368  */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r84) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 921
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.n.c(cli.j):cli.o");
    }
}
