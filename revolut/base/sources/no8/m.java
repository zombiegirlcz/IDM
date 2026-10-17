package no8;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.j2;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.junior_settings.impl.ui_kompot.logout_confirmation.b f217957w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(com.revolut.feature.junior_settings.impl.ui_kompot.logout_confirmation.b bVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f217957w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m(this.f217957w, continuation, 0);
            case 1:
                return new m(this.f217957w, continuation, 1);
            case 2:
                return new m(this.f217957w, continuation, 2);
            default:
                return new m(this.f217957w, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((m) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    com.revolut.feature.junior_settings.impl.ui_kompot.logout_confirmation.b bVar = this.f217957w;
                    k18.c cVar = bVar.f77305p;
                    String str = ((f) ((j2) bVar.f77306q.f22677a).getValue()).f217948a;
                    this.v = 1;
                    if (cVar.n(str, this) == aVar) {
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
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    com.revolut.feature.junior_settings.impl.ui_kompot.logout_confirmation.b bVar2 = this.f217957w;
                    m mVar = new m(bVar2, null, 0);
                    this.v = 1;
                    if (u0.b0(bVar2.X(), "LOADING_TAG_LOG_OUT_ACTION", mVar, this) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    com.revolut.feature.junior_settings.impl.ui_kompot.logout_confirmation.b bVar3 = this.f217957w;
                    kgm.c cVar2 = bVar3.o;
                    String str2 = ((f) ((j2) bVar3.f77306q.f22677a).getValue()).f217948a;
                    this.v = 1;
                    if (cVar2.k(str2, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    o.b(obj2);
                    com.revolut.feature.junior_settings.impl.ui_kompot.logout_confirmation.b bVar4 = this.f217957w;
                    m mVar2 = new m(bVar4, null, 2);
                    this.v = 1;
                    if (u0.b0(bVar4.X(), "LOADING_TAG_LOG_OUT_ACTION", mVar2, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
