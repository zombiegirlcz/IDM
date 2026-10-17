package n33;

import b93.f;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature.card_order_new.api.CardOrderAccountWrapper;
import com.revolut.feature.checkout.models.CheckoutParams;
import com.revolut.feature.post_activation.api.PostActivationApi$Toggles$PostActivationVirtualCardThemeSelection;
import grl.k9;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class j2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f211744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zn3.a f211745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r2 f211746c;
    public final /* synthetic */ h93.l0 d;

    public /* synthetic */ j2(zn3.a aVar, r2 r2Var, h93.l0 l0Var, int i) {
        this.f211744a = i;
        this.f211745b = aVar;
        this.f211746c = r2Var;
        this.d = l0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f211744a) {
            case 0:
                n2 n2Var = (n2) obj2;
                zn3.a aVar = this.f211745b;
                int i = aVar == null ? -1 : o2.f211776a[aVar.ordinal()];
                r2 r2Var = this.f211746c;
                h93.l0 l0Var = this.d;
                if (i != 1) {
                    return r2Var.h(l0Var, n2Var);
                }
                gte.a aVar2 = r2Var.f211801n;
                w wVar = r2Var.e;
                if (((jte.d) aVar2).c(PostActivationApi$Toggles$PostActivationVirtualCardThemeSelection.f80933c)) {
                    pfm.h hVar = new pfm.h(new aed.d(r2Var, n2Var, b93.e.VIRTUAL, l0Var, 7), 2);
                    Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                    return hVar;
                }
                s2 s2Var = (s2) wVar;
                CheckoutParams.CardOrder cardOrder = new CheckoutParams.CardOrder(new f.a(l0Var, 3), n2Var != null ? n2Var.f211769a : r2Var.d(), com.revolut.feature.card_order_new.api.a.a((CardOrderAccountWrapper) s2Var.w0().get()));
                mm.d dVar = r2Var.f;
                te0.e eVarX0 = s2Var.x0();
                AnalyticsProduct.Companion companion = AnalyticsProduct.INSTANCE;
                k9 k9Var = frl.a.f137496c;
                companion.getClass();
                AnalyticsProduct.Companion.a(k9Var);
                return dVar.c0(new rh3.c(cardOrder, null, (AnalyticsProduct) te0.w.M(eVarX0, new AnalyticsProduct.Retail(k9Var)), 2));
            default:
                n2 n2Var2 = (n2) obj2;
                zn3.a aVar3 = this.f211745b;
                int i2 = aVar3 == null ? -1 : o2.f211776a[aVar3.ordinal()];
                r2 r2Var2 = this.f211746c;
                h93.l0 l0Var2 = this.d;
                if (i2 != 1) {
                    return r2Var2.g(l0Var2, n2Var2);
                }
                pfm.h hVar2 = new pfm.h(new aed.d(r2Var2, n2Var2, b93.e.PHYSICAL, l0Var2, 7), 2);
                Intrinsics.checkNotNullExpressionValue(hVar2, "fromAction(...)");
                return hVar2;
        }
    }
}
