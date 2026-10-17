package m2f;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import vkm.j2;

/* JADX INFO: loaded from: classes8.dex */
public final class c0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public String v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f201966w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.a f201967x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f201968y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.a aVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f201967x = aVar;
        this.f201968y = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c0(this.f201967x, this.f201968y, continuation, 0);
            default:
                return new c0(this.f201967x, this.f201968y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c0) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String str;
        String str2;
        switch (this.u) {
            case 0:
                com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.a aVar = this.f201967x;
                cli.y yVar = aVar.E;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i = this.f201966w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    String str3 = ((l) ((j2) yVar.f22677a).getValue()).f201980h;
                    aVar.H2(yVar, new lu6.p(this.f201968y, 5));
                    this.v = str3;
                    this.f201966w = 1;
                    if (do3.q.J(this) == aVar2) {
                        return aVar2;
                    }
                    str = str3;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = this.v;
                    yhm.o.b(obj2);
                }
                aVar.H2(yVar, new lu6.p(str, 6));
                return Unit.f186387a;
            default:
                com.revolut.feature.trade_rev_points.impl.ui.screen.transfer.a aVar3 = this.f201967x;
                cli.y yVar2 = aVar3.E;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.f201966w;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    String str4 = ((l) ((j2) yVar2.f22677a).getValue()).f;
                    aVar3.H2(yVar2, new lu6.p(this.f201968y, 7));
                    this.v = str4;
                    this.f201966w = 1;
                    if (do3.q.J(this) == aVar4) {
                        return aVar4;
                    }
                    str2 = str4;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str2 = this.v;
                    yhm.o.b(obj2);
                }
                aVar3.H2(yVar2, new lu6.p(str2, 8));
                return Unit.f186387a;
        }
    }
}
