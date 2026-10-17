package com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2;

import com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2.CreditLinkedAccountsV2FlowContract$Step;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import oki.h;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends i implements Function2 {
    public int u;
    public final /* synthetic */ d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f67839w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f67839w = z;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.v, this.f67839w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        d dVar = this.v;
        if (i == 0) {
            o.b(obj2);
            ad4.d dVar2 = new ad4.d(dVar, null, 5);
            this.u = 1;
            obj2 = dVar.p2(this, dVar2);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        gd4.a aVar2 = (gd4.a) obj2;
        h.t2(dVar, dVar.f67845w, new CreditLinkedAccountsV2FlowContract$Step.LinkExternalAccount(aVar2.f143065a, aVar2.f143066b, this.f67839w), true, null, false, 12);
        return Unit.f186387a;
    }
}
