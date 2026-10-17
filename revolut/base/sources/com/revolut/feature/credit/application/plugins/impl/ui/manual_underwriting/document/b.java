package com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting.document;

import elm.f;
import ft3.h1;
import gim.i;
import hw3.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import ot1.p;
import skm.e0;
import skm.p0;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f67930w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(d dVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f67930w = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new b(this.f67930w, continuation, 0);
            default:
                return new b(this.f67930w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        Continuation continuation = null;
        d dVar = this.f67930w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    d0 d0Var = dVar.o;
                    h1 h1VarA9 = dVar.f67937x.a9();
                    this.v = 1;
                    q34.d dVar2 = (q34.d) d0Var.f156059a;
                    dVar2.getClass();
                    q34.c cVar = new q34.c(dVar2, h1VarA9, continuation, 0);
                    p0 p0Var = p0.f264001a;
                    obj2 = e0.J(f.f127540b, cVar, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                d.J2(dVar, new p(dVar, (it3.d) obj2, 29));
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                c cVar2 = new c(dVar, null);
                this.v = 1;
                Object objB = pu7.a.B(dVar.k, "upload documents", cVar2, this);
                return objB == aVar2 ? aVar2 : objB;
        }
    }
}
