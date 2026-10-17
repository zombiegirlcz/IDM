package com.revolut.feature.payments.who_to_transfer.impl.ui.chats;

import com.revolut.feature.payments.who_to_transfer.impl.ui.chats.ChatTransferScreenContract$ModalStep;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import g5a.j;
import g5a.n;
import g5a.r;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends i implements Function1 {
    public f u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ r f80165w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ f f80166x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(r rVar, f fVar, Continuation continuation) {
        super(1, continuation);
        this.f80165w = rVar;
        this.f80166x = fVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.f80165w, this.f80166x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        f fVar = this.f80166x;
        com.revolut.kompot.navigable.vc.modal.a aVar = fVar.i0;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            o.b(obj2);
            r rVar = this.f80165w;
            if (!(rVar instanceof n)) {
                boolean z = rVar instanceof j;
                ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
                if (z) {
                    h.v2(aVar, new ChatTransferScreenContract$ModalStep.DeleteRevolutContactChatDialog(((j) rVar).f140707a), bottom_dialog);
                    return Unit.f186387a;
                }
                if (rVar instanceof g5a.h) {
                    h.v2(aVar, new ChatTransferScreenContract$ModalStep.DeleteBankChatDialog(((g5a.h) rVar).f140705a), bottom_dialog);
                    return Unit.f186387a;
                }
                if (!(rVar instanceof g5a.i)) {
                    throw new NoWhenBranchMatchedException();
                }
                h.v2(aVar, new ChatTransferScreenContract$ModalStep.DeleteCardChatDialog(((g5a.i) rVar).f140706a), bottom_dialog);
                return Unit.f186387a;
            }
            this.u = fVar;
            this.v = 1;
            obj2 = fVar.f80175s.a((n) rVar, this);
            if (obj2 == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = this.u;
            o.b(obj2);
        }
        return fVar.C1(new BridgeDestination((NaviCommand) obj2));
    }
}
