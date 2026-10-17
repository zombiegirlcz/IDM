package akk;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.feature.topup_screen.api.feature_config.TopUpCheckoutFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.common.existing_preorder_warning.ExistingPreorderWarningFlow;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class e extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ ExistingPreorderWarningFlow v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ExistingPreorderWarningFlow existingPreorderWarningFlow, Continuation continuation) {
        super(2, continuation);
        this.v = existingPreorderWarningFlow;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        e eVar = new e(this.v, continuation);
        eVar.u = obj2;
        return eVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((LargeActionButtonDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        LargeActionButtonDelegate.Model model = (LargeActionButtonDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        g gVar = (g) this.v.N.getValue();
        Intrinsics.h(model);
        p pVar = (p) gVar;
        j60.a aVar2 = pVar.f5987r;
        Intrinsics.checkNotNullParameter(model, "model");
        String str = model.f52613a;
        Object obj3 = model.i;
        switch (str.hashCode()) {
            case -833592531:
                if (str.equals("LIST_ID_CANCEL_CREDIT_PLAN")) {
                    pVar.l2(new n(pVar, null, 0), new yi5.b(26));
                }
                break;
            case -107941261:
                if (str.equals("LIST_ID_CONTINUE_CURRENT_ORDER")) {
                    pVar.C1(u0.b(new FeatureCommand(new TopUpCheckoutFeatureConfig(pVar.o.f5975a, null, null, 28))));
                }
                break;
            case 771394336:
                if (str.equals("LIST_ID_REPLACE_ORDER")) {
                    pVar.l2(new n(pVar, null, 1), new yi5.b(26));
                }
                break;
            case 790641634:
                if (str.equals("LIST_ID_ORDER_CREDIT_CARD")) {
                    j60.a.v(aVar2, false, null, 3);
                    f fVar = obj3 instanceof f ? (f) obj3 : null;
                    if (fVar != null) {
                        pVar.C2(new k(fVar.f5972a, fVar.f5974c));
                    } else {
                        h0 h0Var = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "ExistingPreorderWarningFlowModel", "Can't handle order credit card action: parcel is incorrect", null, h0Var);
                    }
                }
                break;
            case 1362027341:
                if (str.equals("LIST_ID_ACTIVATE_CREDIT_CARD")) {
                    j60.a.v(aVar2, false, null, 3);
                    f fVar2 = obj3 instanceof f ? (f) obj3 : null;
                    if (fVar2 != null) {
                        String str2 = fVar2.f5973b;
                        if (str2 != null) {
                            pVar.C2(new i(str2));
                        } else {
                            h0 h0Var2 = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                            rd0.d.a(rd0.c.ERROR, "ExistingPreorderWarningFlowModel", "No card id to activate provided", null, h0Var2);
                        }
                    } else {
                        h0 h0Var3 = h0.f322473a;
                        CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                        rd0.d.a(rd0.c.ERROR, "ExistingPreorderWarningFlowModel", "Can't handle activate credit card action: parcel is incorrect", null, h0Var3);
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
