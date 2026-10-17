package qe1;

import cli.y;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_tax_rate.a f245055w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_tax_rate.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f245055w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.f245055w, continuation, 0);
            default:
                return new h(this.f245055w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((h) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_tax_rate.a aVar2 = this.f245055w;
                    nd1.c cVar = aVar2.f60811p;
                    String str = aVar2.o.f60809a.f60694a;
                    this.v = 1;
                    Object objB = cVar.f214281a.b(str, this);
                    if (objB != aVar) {
                        objB = Unit.f186387a;
                    }
                    if (objB == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                com.revolut.feature.acquiring.lite_pos.impl.ui.screen.edit_tax_rate.a aVar3 = this.f245055w;
                y yVar = aVar3.f60813r;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    nd1.c cVar2 = aVar3.f60811p;
                    String str2 = aVar3.o.f60809a.f60694a;
                    String str3 = ((e) ((j2) yVar.f22677a).getValue()).f245050a;
                    String str4 = ((e) ((j2) yVar.f22677a).getValue()).f245051b;
                    this.v = 1;
                    Object objC = cVar2.f214281a.c(str2, str3, str4, this);
                    if (objC != aVar4) {
                        objC = Unit.f186387a;
                    }
                    if (objC == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
