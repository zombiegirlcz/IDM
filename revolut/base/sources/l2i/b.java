package l2i;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import u80.o;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f191795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w80.a f191796b;

    public b(w80.b amountFormatter, w80.a bigIntegerAmountFormatter, o moneyPrefixFormatter) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(bigIntegerAmountFormatter, "bigIntegerAmountFormatter");
        Intrinsics.checkNotNullParameter(moneyPrefixFormatter, "moneyPrefixFormatter");
        this.f191795a = amountFormatter;
        this.f191796b = bigIntegerAmountFormatter;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.delegates.CenteredAmountDelegate.Model a(java.lang.String r31, q0i.d r32) {
        /*
            Method dump skipped, instruction units count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l2i.b.a(java.lang.String, q0i.d):com.revolut.core.ui_kit.delegates.CenteredAmountDelegate$Model");
    }

    public final String b(q0i.h hVar) {
        if (hVar instanceof q0i.g) {
            return o.b(new u80.g(((q0i.g) hVar).f241297a, u80.e.UNSIGNED, u80.b.SYMBOL, 8)).toString();
        }
        if (!(hVar instanceof q0i.f)) {
            throw new NoWhenBranchMatchedException();
        }
        dj0.b bVar = ((q0i.f) hVar).f241296a;
        return o.a(bVar.f115079a, bVar.f115080b, u80.e.UNSIGNED, u80.b.SYMBOL).toString();
    }
}
