package srd;

import cli.y;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.custom_asset_details.CustomAssetDetailsController;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.home.TotalWealthContract$Events;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CustomAssetDetailsController v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(CustomAssetDetailsController customAssetDetailsController, Continuation continuation) {
        super(2, continuation);
        this.v = customAssetDetailsController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        i iVar = new i(this.v, continuation);
        iVar.u = obj2;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((i) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ActionsView.Item item = (ActionsView.Item) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        String str = item.f58316a;
        boolean zF = Intrinsics.f(str, "adjust_value_button");
        CustomAssetDetailsController customAssetDetailsController = this.v;
        if (zF) {
            ((q) customAssetDetailsController.R2()).J2(null);
        } else if (Intrinsics.f(str, "edit_asset_button")) {
            q qVar = (q) customAssetDetailsController.R2();
            aii.o oVarL1 = qVar.l1();
            y yVar = qVar.f265183q;
            oVarL1.M0(new TotalWealthContract$Events.NavigateToEditAsset(((a) ((j2) yVar.f22677a).getValue()).f265160a, ((a) ((j2) yVar.f22677a).getValue()).f265161b, 12));
        }
        return Unit.f186387a;
    }
}
