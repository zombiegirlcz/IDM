package com.revolut.feature.payments.groups.impl.ui_chat.flow;

import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.groups.impl.ui_chat.flow.GroupChatFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import yhm.o;
import zjh.f;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends i implements Function1 {
    public b u;
    public yki.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f79357w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ b f79358x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.f79358x = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.f79358x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        b bVar;
        yki.i iVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.f79357w;
        if (i == 0) {
            o.b(obj2);
            bVar = this.f79358x;
            yki.i iVar2 = bVar.f79360q;
            f fVar = bVar.f79359p;
            PaymentGroup paymentGroup = bVar.o.f79354a;
            this.u = bVar;
            this.v = iVar2;
            this.f79357w = 1;
            Object objA = ((q2a.f) fVar.f322835b).a(paymentGroup.f79285a, this);
            if (objA == aVar) {
                return aVar;
            }
            iVar = iVar2;
            obj2 = objA;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            iVar = this.v;
            bVar = this.u;
            o.b(obj2);
        }
        h.u2(bVar, iVar, new GroupChatFlowContract$Step.Chat((NavBarWithContainerBackground) obj2), null, 6);
        return Unit.f186387a;
    }
}
