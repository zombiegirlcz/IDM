package p5k;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tof.f3;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class x implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f233190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f233191b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kgm.i f233192c;
    public final p d;

    public x(y transferBreakdownTitlesMapper, k5i.c exchangeCurrencyRateMapper, f paymentBreakdownFeesTaxesMapper, kgm.i transferBreakdownTotalAmountCalculator, p transferBreakdownInterestMapper) {
        Intrinsics.checkNotNullParameter(transferBreakdownTitlesMapper, "transferBreakdownTitlesMapper");
        Intrinsics.checkNotNullParameter(exchangeCurrencyRateMapper, "exchangeCurrencyRateMapper");
        Intrinsics.checkNotNullParameter(paymentBreakdownFeesTaxesMapper, "paymentBreakdownFeesTaxesMapper");
        Intrinsics.checkNotNullParameter(transferBreakdownTotalAmountCalculator, "transferBreakdownTotalAmountCalculator");
        Intrinsics.checkNotNullParameter(transferBreakdownInterestMapper, "transferBreakdownInterestMapper");
        this.f233190a = transferBreakdownTitlesMapper;
        this.f233191b = paymentBreakdownFeesTaxesMapper;
        this.f233192c = transferBreakdownTotalAmountCalculator;
        this.d = transferBreakdownInterestMapper;
    }

    public final List b(dj0.d recipientAmount, v vVar, dj0.d exchangeAmount, dj0.d fees, f3 f3Var, prf.g gVar, z3l.a aVar, dj0.d dVar, z3l.a aVar2, o recipientValueTitleMode) {
        Intrinsics.checkNotNullParameter(recipientAmount, "recipientAmount");
        Intrinsics.checkNotNullParameter(exchangeAmount, "exchangeAmount");
        Intrinsics.checkNotNullParameter(fees, "fees");
        Intrinsics.checkNotNullParameter(recipientValueTitleMode, "recipientValueTitleMode");
        n9l.a aVar3 = vVar != null ? vVar.f233187a : null;
        return ((aVar3 == null || Intrinsics.f(aVar3.f213661a, aVar3.f213662b)) && Intrinsics.f(recipientAmount, exchangeAmount) && !(f3Var != null && f3Var.f272744a && f3Var.f272745b == null) && fees.k() && (aVar == null || aVar.f319298a.isEmpty())) ? f0.f322471a : w.a(this, recipientAmount, vVar, exchangeAmount, fees, f3Var, false, gVar, aVar, dVar, aVar2, null, recipientValueTitleMode, null, null, 26624);
    }
}
