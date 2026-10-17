package zje;

import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.feature.tab.crypto.impl.ui.v2.TabCryptoFlowV2;
import com.revolut.feature.tab.crypto.impl.ui.v2.TabCryptoFlowV2Contract$FlowState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class h extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TabCryptoFlowV2 f322795w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(TabCryptoFlowV2 tabCryptoFlowV2, Continuation continuation) {
        super(2, continuation);
        this.f322795w = tabCryptoFlowV2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        h hVar = new h(this.f322795w, continuation);
        hVar.v = obj2;
        return hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((h) create((ActionsView.Item) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        ActionsView.Item item = (ActionsView.Item) this.v;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            yhm.o.b(obj2);
            n nVarE3 = this.f322795w.R2();
            Intrinsics.h(item);
            this.v = null;
            this.u = 1;
            Object objA0 = ((eke.b) nVarE3.f322807q).A0(((TabCryptoFlowV2Contract$FlowState) ((j2) nVarE3.u.f22677a).getValue()).f89811a.f, item, this);
            if (objA0 != aVar) {
                objA0 = Unit.f186387a;
            }
            if (objA0 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }
}
