package com.revolut.feature.payments.who_to_transfer.impl.ui.chats;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.payments.who_to_transfer.impl.ui.chats.ChatTransferScreenContract$ModalStep;
import com.revolut.feature.transfer.core.R$string;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mii.k;
import pfm.r;
import r21.h;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends i implements Function1 {
    public int u;
    public final /* synthetic */ f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ChatTransferScreenContract$ModalStep f80163w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, ChatTransferScreenContract$ModalStep chatTransferScreenContract$ModalStep, Continuation continuation) {
        super(1, continuation);
        this.v = fVar;
        this.f80163w = chatTransferScreenContract$ModalStep;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.v, this.f80163w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        f fVar = this.v;
        if (i == 0) {
            o.b(obj2);
            d3j.b bVar = fVar.f80169d0;
            String id10 = ((ChatTransferScreenContract$ModalStep.DeleteBankChatDialog) this.f80163w).f80153a.f132329a;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(id10, "id");
            r rVarD = ((h) bVar.f111211a).d(id10);
            this.u = 1;
            if (nim.a.a(rVarD, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return fVar.X1(new k("BENEFICIARY_CHAT_DELETED", new TextLocalisedClause(R$string.payments_core_toast_recipient_deleted, null, null, 14), null, null, null, 28));
    }
}
