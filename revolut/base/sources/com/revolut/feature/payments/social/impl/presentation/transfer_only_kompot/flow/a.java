package com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.flow;

import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.feature.payments.social.api.model.ChatTransferRecipient;
import com.revolut.feature.payments.social.impl.presentation.transfer_only_kompot.flow.TransferOnlyChatFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import om4.d0;
import q2a.f;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends i implements Function1 {
    public b u;
    public yki.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ChatTransferRecipient f79793w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f79794x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ b f79795y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.f79795y = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.f79795y, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        yki.i iVar;
        b bVar;
        ChatTransferRecipient chatTransferRecipient;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.f79794x;
        if (i == 0) {
            o.b(obj2);
            b bVar2 = this.f79795y;
            iVar = bVar2.f79799s;
            ChatTransferRecipient chatTransferRecipient2 = bVar2.o.f79789a;
            d0 d0Var = bVar2.f79797q;
            this.u = bVar2;
            this.v = iVar;
            this.f79793w = chatTransferRecipient2;
            this.f79794x = 1;
            d0Var.getClass();
            Object objA = ((f) d0Var.f226551b).a(rz9.a.a(chatTransferRecipient2), this);
            if (objA == aVar) {
                return aVar;
            }
            bVar = bVar2;
            obj2 = objA;
            chatTransferRecipient = chatTransferRecipient2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            chatTransferRecipient = this.f79793w;
            iVar = this.v;
            bVar = this.u;
            o.b(obj2);
        }
        h.u2(bVar, iVar, new TransferOnlyChatFlowContract$Step.ChatScreen(chatTransferRecipient, (NavBarWithContainerBackground) obj2), null, 6);
        return Unit.f186387a;
    }
}
