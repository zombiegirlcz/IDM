package com.revolut.feature.tab.accounts.impl.ui.tab;

import cge.g;
import com.revolut.feature.tab.accounts.impl.ui.tab.TabAccountsScreenContract$ModalStep;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import wa7.m;
import yhm.o;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends i implements Function2 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ TabAccountsScreenContract$ModalStep f89698w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, TabAccountsScreenContract$ModalStep tabAccountsScreenContract$ModalStep, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f89698w = tabAccountsScreenContract$ModalStep;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new c(this.v, this.f89698w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((c) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        d dVar = this.v;
        if (i == 0) {
            o.b(obj2);
            m mVar = dVar.A;
            String str = ((TabAccountsScreenContract$ModalStep.UnhideAccount) this.f89698w).f89683a;
            this.u = 1;
            if (mVar.m(str, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        dVar.S2(new g(20));
        return Unit.f186387a;
    }
}
