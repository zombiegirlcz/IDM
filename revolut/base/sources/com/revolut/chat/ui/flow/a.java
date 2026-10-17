package com.revolut.chat.ui.flow;

import com.revolut.chat.ui.flow.ChatFlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import q30.h;
import v30.c0;
import yhm.o;

/* JADX INFO: loaded from: classes19.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ChatFlowContract$Step f51155w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, ChatFlowContract$Step chatFlowContract$Step, Continuation continuation) {
        super(2, continuation);
        this.v = eVar;
        this.f51155w = chatFlowContract$Step;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f51155w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            q30.a aVar2 = this.v.f51159p;
            c0 c0Var = ((ChatFlowContract$Step.IntroVideo) this.f51155w).f51154a;
            this.u = 1;
            if (((h) aVar2).e(c0Var, this) == aVar) {
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
