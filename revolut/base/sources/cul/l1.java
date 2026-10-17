package cul;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final class l1 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f109132w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ oki.h f109133x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(int i, Continuation continuation, oki.h hVar, boolean z) {
        super(1, continuation);
        this.u = i;
        this.f109133x = hVar;
        this.f109132w = z;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l1(0, continuation, (com.revolut.trading.orders.ui.invest.placement.screens.edit.e) this.f109133x, this.f109132w);
            case 1:
                return new l1(1, continuation, (em3.e) this.f109133x, this.f109132w);
            case 2:
                return new l1(2, continuation, (com.revolut.feature.card.verification.impl.flow.card_penny_topup.b) this.f109133x, this.f109132w);
            case 3:
                return new l1(3, continuation, (ip4.l) this.f109133x, this.f109132w);
            case 4:
                return new l1(4, continuation, (com.revolut.feature.tax_residency.impl.v2.ui.fatca_flow.a) this.f109133x, this.f109132w);
            case 5:
                return new l1(5, continuation, (xg7.i) this.f109133x, this.f109132w);
            case 6:
                return new l1(6, continuation, (com.revolut.feature.retail.savings.impl.ui.details.a) this.f109133x, this.f109132w);
            default:
                return new l1(7, continuation, (com.revolut.feature.apm.aani.impl.ui.settings.a) this.f109133x, this.f109132w);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((l1) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:129:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x030f  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cul.l1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
