package com.revolut.analytics.tracking.v3;

import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import yhm.o;

/* JADX INFO: loaded from: classes17.dex */
public final class b extends gim.i implements Function2 {
    public final /* synthetic */ c u;
    public final /* synthetic */ String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ w0 f50310w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, String str, w0 w0Var, Continuation continuation) {
        super(2, continuation);
        this.u = cVar;
        this.v = str;
        this.f50310w = w0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new b(this.u, this.v, this.f50310w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        o.b(obj2);
        c cVar = this.u;
        Object objC = cVar.f50312b.c();
        return new ho.b(objC != null ? cVar.f50313c.e(objC).f281496a : null, ((uo.o) cVar.d).e(objC, AnalyticsProduct.Shared.Environment.f), this.v, this.f50310w);
    }
}
