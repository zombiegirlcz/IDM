package tz1;

import com.revolut.feature.apm.core.api.product.ApmBlik;
import com.revolut.feature.apm.core.api.product.ApmMultibanco;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class c extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ d f275732w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f275733x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(d dVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f275732w = dVar;
        this.f275733x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c(this.f275732w, this.f275733x, continuation, 0);
            case 1:
                return new c(this.f275732w, this.f275733x, continuation, 1);
            default:
                return new c(this.f275732w, this.f275733x, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((c) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    cx1.a aVar2 = this.f275732w.f275736c;
                    this.v = 1;
                    if (((g) aVar2).b(this.f275733x, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    cx1.a aVar4 = this.f275732w.f275736c;
                    ApmBlik apmBlik = ApmBlik.f61809c;
                    this.v = 1;
                    if (((g) aVar4).a(apmBlik, this.f275733x, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    cx1.a aVar6 = this.f275732w.f275736c;
                    ApmMultibanco apmMultibanco = ApmMultibanco.f61815c;
                    this.v = 1;
                    if (((g) aVar6).a(apmMultibanco, this.f275733x, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
