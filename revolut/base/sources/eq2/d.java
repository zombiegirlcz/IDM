package eq2;

import cli.y;
import com.revolut.core.ui_kit.delegates.SelectableDelegate;
import com.revolut.feature.bank_account_switching.impl.ui.target_account_selection.BankAccountSwitchingTargetSelectionScreen;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends gim.i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ BankAccountSwitchingTargetSelectionScreen v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(BankAccountSwitchingTargetSelectionScreen bankAccountSwitchingTargetSelectionScreen, Continuation continuation) {
        super(2, continuation);
        this.v = bankAccountSwitchingTargetSelectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        d dVar = new d(this.v, continuation);
        dVar.u = obj2;
        return dVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((SelectableDelegate.Model) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SelectableDelegate.Model model = (SelectableDelegate.Model) this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        h hVar = (h) this.v.Q.getValue();
        String listId = model.f53304a;
        y yVar = hVar.o;
        Intrinsics.checkNotNullParameter(listId, "listId");
        hVar.H2(yVar, new ei8.d(Intrinsics.f(listId, "ID_PERSONAL_ACCOUNT") ? wn2.a.PERSONAL : Intrinsics.f(listId, "ID_JOINT_ACCOUNT") ? wn2.a.JOINT : ((e) ((j2) yVar.f22677a).getValue()).f128226b, 28));
        return Unit.f186387a;
    }
}
