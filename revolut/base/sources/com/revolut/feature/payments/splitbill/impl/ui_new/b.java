package com.revolut.feature.payments.splitbill.impl.ui_new;

import com.revolut.feature.payments.splitbill.impl.ui_new.SplitBillsFlowContract$Step;
import gim.i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ e u;
    public final /* synthetic */ ArrayList v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ List f79852w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, ArrayList arrayList, List list, Continuation continuation) {
        super(2, continuation);
        this.u = eVar;
        this.v = arrayList;
        this.f79852w = list;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, this.v, this.f79852w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        this.u.E2(new SplitBillsFlowContract$Step.CreateGroup(this.v, this.f79852w), true, null, false);
        return Unit.f186387a;
    }
}
