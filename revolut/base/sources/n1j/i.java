package n1j;

import com.revolut.retail.feature.balance.picker.impl.balance_picker_v2.BalancePickerScreen;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ BalancePickerScreen f211386w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(BalancePickerScreen balancePickerScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f211386w = balancePickerScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                i iVar = new i(this.f211386w, continuation, 0);
                iVar.v = obj2;
                return iVar;
            case 1:
                i iVar2 = new i(this.f211386w, continuation, 1);
                iVar2.v = obj2;
                return iVar2;
            default:
                i iVar3 = new i(this.f211386w, continuation, 2);
                iVar3.v = obj2;
                return iVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((i) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((i) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((i) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        BalancePickerScreen balancePickerScreen = this.f211386w;
        switch (i) {
            case 0:
                String input = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarE3 = balancePickerScreen.k3();
                Intrinsics.h(input);
                com.revolut.retail.feature.balance.picker.impl.balance_picker_v2.c cVar = (com.revolut.retail.feature.balance.picker.impl.balance_picker_v2.c) oVarE3;
                cVar.getClass();
                Intrinsics.checkNotNullParameter(input, "input");
                cVar.D.k(input);
                break;
            case 1:
                ty0.a clickData = (ty0.a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarE32 = balancePickerScreen.k3();
                Intrinsics.h(clickData);
                com.revolut.retail.feature.balance.picker.impl.balance_picker_v2.c cVar2 = (com.revolut.retail.feature.balance.picker.impl.balance_picker_v2.c) oVarE32;
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                Object obj3 = clickData.d;
                if (obj3 instanceof p) {
                    cVar2.l2(new b0(cVar2, obj3, null), new yi5.b(26));
                } else {
                    IllegalArgumentException illegalArgumentException = new IllegalArgumentException(a0.d.m(obj3, "Unknown click data parcel "));
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                }
                break;
            default:
                String selectedTabId = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                o oVarE33 = balancePickerScreen.k3();
                Intrinsics.h(selectedTabId);
                com.revolut.retail.feature.balance.picker.impl.balance_picker_v2.c cVar3 = (com.revolut.retail.feature.balance.picker.impl.balance_picker_v2.c) oVarE33;
                cVar3.getClass();
                Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
                cVar3.E.k(selectedTabId);
                break;
        }
        return Unit.f186387a;
    }
}
