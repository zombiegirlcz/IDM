package com.revolut.feature.payments.groups.impl.ui_new.flow.group_details;

import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.payments.groups.impl.ui_new.flow.group_details.GroupDetailsFlowContract$Step;
import er9.x;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class c extends i implements Function1 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ GroupDetailsFlowContract$Step.UntrustedGroupPrompt f79470w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, GroupDetailsFlowContract$Step.UntrustedGroupPrompt untrustedGroupPrompt, Continuation continuation) {
        super(1, continuation);
        this.v = eVar;
        this.f79470w = untrustedGroupPrompt;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new c(this.v, this.f79470w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((c) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        e eVar = this.v;
        if (i == 0) {
            o.b(obj2);
            f fVar = eVar.f79473q;
            String str = this.f79470w.f79469b;
            this.u = 1;
            obj2 = ((x) ((mr9.a) fVar.f79476l).f208082a).d(str, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        h.t2(eVar, eVar.f79475s, new GroupDetailsFlowContract$Step.Chat((PaymentGroup) obj2), false, null, false, 12);
        return Unit.f186387a;
    }
}
