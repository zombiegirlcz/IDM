package nyb;

import hha.z0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f220788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f220789b;

    public /* synthetic */ g(i iVar, int i) {
        this.f220788a = i;
        this.f220789b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f220788a) {
            case 0:
                hha.d it8 = (hha.d) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                i iVar = this.f220789b;
                ffk.t tVar = iVar.f220796b;
                w4l.i loadingStrategy = w4l.i.f294643c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                pfk.p0 p0Var = (pfk.p0) tVar.f134850a;
                p0Var.getClass();
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                return pd.b.r(nim.a.w(p0Var.f235676n.e(Unit.f186387a, loadingStrategy), new nxa.v(24)), new g(iVar, 1));
            case 1:
                z0 earningRate = (z0) obj2;
                Intrinsics.checkNotNullParameter(earningRate, "earningRate");
                i iVar2 = this.f220789b;
                return pd.b.r(iVar2.f220796b.r(earningRate.f152378a), new g(iVar2, 2));
            default:
                hha.d upsellPricingPlan = (hha.d) obj2;
                Intrinsics.checkNotNullParameter(upsellPricingPlan, "upsellPricingPlan");
                return nim.a.w(this.f220789b.f220795a.a(upsellPricingPlan, false), new clk.a(upsellPricingPlan, 18));
        }
    }
}
