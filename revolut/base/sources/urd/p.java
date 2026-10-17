package urd;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.custom_asset_details_v2.CustomAssetDetailsV2Controller;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.TotalWealthContract$Events;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class p extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CustomAssetDetailsV2Controller v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(CustomAssetDetailsV2Controller customAssetDetailsV2Controller, Continuation continuation) {
        super(2, continuation);
        this.v = customAssetDetailsV2Controller;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        p pVar = new p(this.v, continuation);
        pVar.u = obj2;
        return pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((p) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ActionsView.Item item = (ActionsView.Item) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String str = item.f58316a;
        boolean zF = Intrinsics.f(str, "adjust_value_button");
        CustomAssetDetailsV2Controller customAssetDetailsV2Controller = this.v;
        if (zF) {
            x xVar = (x) customAssetDetailsV2Controller.d();
            cli.y yVar = xVar.f282301s;
            j2 j2Var = (j2) yVar.f22677a;
            j2 j2Var2 = (j2) yVar.f22677a;
            dj0.d dVar = ((a) j2Var.getValue()).f282264a.f99218c;
            if (dVar != null) {
                xVar.l1().M0(new TotalWealthContract$Events.AdjustCurrentValue(dVar, ((a) j2Var2.getValue()).f282264a.f99216a, ((a) j2Var2.getValue()).f282264a.k));
            }
        } else if (Intrinsics.f(str, "edit_asset_button")) {
            x xVar2 = (x) customAssetDetailsV2Controller.d();
            aii.o oVarL1 = xVar2.l1();
            cli.y yVar2 = xVar2.f282301s;
            oVarL1.M0(new TotalWealthContract$Events.NavigateToEditAsset(((a) ((j2) yVar2.f22677a).getValue()).f282264a, ((a) ((j2) yVar2.f22677a).getValue()).f282265b, 12));
        }
        return Unit.f186387a;
    }
}
