package com.revolut.feature.payments.who_to_transfer.impl.ui.chats;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.payments.who_to_transfer.impl.R$string;
import com.revolut.feature.payments.who_to_transfer.impl.ui.chats.ChatTransferScreenContract$ModalStep;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import mii.k;
import pfm.r;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends i implements Function1 {
    public int u;
    public final /* synthetic */ f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ChatTransferScreenContract$ModalStep f80162w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(f fVar, ChatTransferScreenContract$ModalStep chatTransferScreenContract$ModalStep, Continuation continuation) {
        super(1, continuation);
        this.v = fVar;
        this.f80162w = chatTransferScreenContract$ModalStep;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new b(this.v, this.f80162w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((b) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        f fVar = this.v;
        if (i == 0) {
            o.b(obj2);
            r rVarB = fVar.f80168b0.b(((ChatTransferScreenContract$ModalStep.DeleteRevolutContactChatDialog) this.f80162w).f80155a);
            this.u = 1;
            if (nim.a.a(rVarB, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return fVar.X1(new k("REVOLUT_CONTACT_CHAT_DELETED", new TextLocalisedClause(R$string.payments_chat_delete_chat_toast_title, null, null, 14), null, null, null, 28));
    }
}
