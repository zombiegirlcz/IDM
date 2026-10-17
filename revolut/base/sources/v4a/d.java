package v4a;

import com.revolut.feature.payments.who_to_transfer.api.common.WhoToTransferFilter;
import com.revolut.feature.payments.who_to_transfer.impl.common.transfer_action.WhoToTransferActionItem;
import com.revolut.feature.payments.who_to_transfer.impl.transfer.selection.RecipientSelectionScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import jq9.t;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ RecipientSelectionScreen f285996w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(RecipientSelectionScreen recipientSelectionScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f285996w = recipientSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                d dVar = new d(this.f285996w, continuation, 0);
                dVar.v = obj2;
                return dVar;
            case 1:
                d dVar2 = new d(this.f285996w, continuation, 1);
                dVar2.v = obj2;
                return dVar2;
            case 2:
                d dVar3 = new d(this.f285996w, continuation, 2);
                dVar3.v = obj2;
                return dVar3;
            default:
                d dVar4 = new d(this.f285996w, continuation, 3);
                dVar4.v = obj2;
                return dVar4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((d) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        RecipientSelectionScreen recipientSelectionScreen = this.f285996w;
        switch (i) {
            case 0:
                String str = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f fVarT2 = recipientSelectionScreen.T2();
                Intrinsics.h(str);
                String input = d0.F0(str).toString();
                m mVar = (m) fVarT2;
                mVar.getClass();
                Intrinsics.checkNotNullParameter(input, "input");
                mVar.F.d(input);
                break;
            case 1:
                WhoToTransferFilter selectedFilter = (WhoToTransferFilter) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f fVarT22 = recipientSelectionScreen.T2();
                Intrinsics.h(selectedFilter);
                m mVar2 = (m) fVarT22;
                mVar2.getClass();
                Intrinsics.checkNotNullParameter(selectedFilter, "selectedFilter");
                mVar2.l2(new v06.i(mVar2, selectedFilter, null, 8), new yi5.b(26));
                break;
            case 2:
                Object item = this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f fVarT23 = recipientSelectionScreen.T2();
                Intrinsics.h(item);
                m mVar3 = (m) fVarT23;
                mVar3.getClass();
                Intrinsics.checkNotNullParameter(item, "item");
                if (item instanceof WhoToTransferActionItem) {
                    mVar3.A2((WhoToTransferActionItem) item);
                } else if (item instanceof t) {
                    mVar3.z2((t) item);
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException(j6.a.q("Item is not supported: ", m.D2(item)));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                break;
            default:
                Object item2 = this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                f fVarT24 = recipientSelectionScreen.T2();
                Intrinsics.h(item2);
                m mVar4 = (m) fVarT24;
                mVar4.getClass();
                Intrinsics.checkNotNullParameter(item2, "item");
                mVar4.l2(new v06.i(mVar4, item2, null, 9), new yi5.b(26));
                break;
        }
        return Unit.f186387a;
    }
}
