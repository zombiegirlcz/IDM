package f2h;

import com.revolut.feature.wealth.asset.selection.impl.ui.flow.AssetSelectionFlowController;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes9.dex */
public final class c extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AssetSelectionFlowController f131786w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(AssetSelectionFlowController assetSelectionFlowController, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f131786w = assetSelectionFlowController;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c(this.f131786w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            default:
                c cVar2 = new c(this.f131786w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        String str = (String) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c) create(str, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object value;
        int i = this.u;
        AssetSelectionFlowController assetSelectionFlowController = this.f131786w;
        switch (i) {
            case 0:
                String pageId = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                e eVarE3 = assetSelectionFlowController.R2();
                Intrinsics.h(pageId);
                com.revolut.feature.wealth.asset.selection.impl.ui.flow.a aVar2 = (com.revolut.feature.wealth.asset.selection.impl.ui.flow.a) eVarE3;
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(pageId, "pageId");
                aVar2.H2(aVar2.f95399r, new e2j.i(pageId, 29));
                break;
            default:
                String query = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                e eVarE32 = assetSelectionFlowController.R2();
                Intrinsics.h(query);
                com.revolut.feature.wealth.asset.selection.impl.ui.flow.a aVar4 = (com.revolut.feature.wealth.asset.selection.impl.ui.flow.a) eVarE32;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                e2h.a aVar5 = aVar4.f95398q;
                aVar5.getClass();
                Intrinsics.checkNotNullParameter(query, "query");
                j2 j2Var = aVar5.f122094a;
                do {
                    value = j2Var.getValue();
                } while (!j2Var.h(value, zi0.c.P(query, false, null, 3)));
                break;
        }
        return Unit.f186387a;
    }
}
