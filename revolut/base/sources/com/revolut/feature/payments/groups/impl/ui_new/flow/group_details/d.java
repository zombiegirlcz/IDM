package com.revolut.feature.payments.groups.impl.ui_new.flow.group_details;

import com.revolut.feature.payments.groups.impl.ui_new.flow.group_details.GroupDetailsFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends i implements Function2 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ GroupDetailsFlowContract$Step.UntrustedGroupPrompt f79471w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, GroupDetailsFlowContract$Step.UntrustedGroupPrompt untrustedGroupPrompt, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
        this.f79471w = untrustedGroupPrompt;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new d(this.v, this.f79471w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((d) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            GroupDetailsFlowContract$Step.UntrustedGroupPrompt untrustedGroupPrompt = this.f79471w;
            e eVar = this.v;
            c cVar = new c(eVar, untrustedGroupPrompt, null);
            this.u = 1;
            if (u0.b0(eVar.X(), "PRIMARY_BUTTON_LOADING_TAG", cVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
