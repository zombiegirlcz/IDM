package com.revolut.feature.apm.spin.impl.ui.transfer;

import com.revolut.feature.apm.core.models.recipients.ApmContact;
import com.revolut.feature.apm.core.models.recipients.SpinContact;
import com.revolut.feature.apm.spin.impl.ui.transfer.SpinTransferFlowContract$Step;
import gim.i;
import java.io.Serializable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import rd2.c;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends i implements Function2 {
    public SpinContact u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f62890w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.f62890w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.f62890w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        SpinContact spinContact;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        b bVar = this.f62890w;
        if (i == 0) {
            o.b(obj2);
            SpinContact spinContact2 = bVar.o.f62887a;
            ApmContact.SimpleState simpleState = spinContact2.f;
            if (!Intrinsics.f(simpleState, ApmContact.State.ACTIVE.f62099a)) {
                if (!Intrinsics.f(simpleState, ApmContact.State.DELETED.f62100a)) {
                    throw new NoWhenBranchMatchedException();
                }
                h.u2(bVar, bVar.f62894s, new SpinTransferFlowContract$Step.Chat(spinContact2), null, 6);
                return Unit.f186387a;
            }
            c cVar = bVar.f62891p;
            this.u = spinContact2;
            this.v = 1;
            Serializable serializableB = cVar.b(spinContact2, this);
            if (serializableB == aVar) {
                return aVar;
            }
            spinContact = spinContact2;
            obj2 = serializableB;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            spinContact = this.u;
            o.b(obj2);
        }
        f5j.a aVar2 = (f5j.a) obj2;
        if (aVar2 != null) {
            h.u2(bVar, bVar.f62894s, new SpinTransferFlowContract$Step.Transfer(aVar2), null, 6);
        } else {
            h.u2(bVar, bVar.f62894s, new SpinTransferFlowContract$Step.Chat(spinContact), null, 6);
        }
        return Unit.f186387a;
    }
}
