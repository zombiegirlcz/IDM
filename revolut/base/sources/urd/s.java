package urd;

import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.custom_asset_details_v2.CustomAssetDetailsV2Controller;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class s extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ CustomAssetDetailsV2Controller v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(CustomAssetDetailsV2Controller customAssetDetailsV2Controller, Continuation continuation) {
        super(2, continuation);
        this.v = customAssetDetailsV2Controller;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        s sVar = new s(this.v, continuation);
        sVar.u = obj2;
        return sVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s) create((RowDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        RowDelegate.Model model = (RowDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        if (Intrinsics.f(model.f53228a, "remove_asset")) {
            x xVar = (x) this.v.d();
            aii.o oVarL1 = xVar.l1();
            cli.y yVar = xVar.f282301s;
            String str = ((a) ((j2) yVar.f22677a).getValue()).f282264a.f99216a;
            Object obj3 = ((a) ((j2) yVar.f22677a).getValue()).f282264a.i.get("assetName");
            String str2 = obj3 instanceof String ? (String) obj3 : null;
            if (str2 == null) {
                str2 = "";
            }
            oVarL1.M0(new yrd.b(str, str2));
        }
        return Unit.f186387a;
    }
}
