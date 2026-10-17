package com.revolut.feature.payments.splitbill.impl.ui_new.link_context.qr.flow;

import com.revolut.feature.payments.splitbill.impl.ui_new.link_context.qr.flow.SplitBillQrFlowContract$Step;
import dj0.d;
import e1a.f;
import fnc.s;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ c v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ SplitBillQrFlowContract$Step.EditSplit f79870w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ d f79871x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(c cVar, SplitBillQrFlowContract$Step.EditSplit editSplit, d dVar, Continuation continuation) {
        super(1, continuation);
        this.v = cVar;
        this.f79870w = editSplit;
        this.f79871x = dVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, this.f79870w, this.f79871x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
            return obj2;
        }
        o.b(obj2);
        s sVar = this.v.f79875p;
        String str = this.f79870w.f79866a;
        this.u = 1;
        f fVar = (f) sVar.f136657b;
        fVar.getClass();
        e1a.d dVar = new e1a.d(fVar, str, this.f79871x, null, 1);
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, dVar, this);
        return objJ == aVar ? aVar : objJ;
    }
}
