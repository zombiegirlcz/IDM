package pnh;

import ael.b1;
import ael.x0;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class y extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.wealth.ui.impl.trades.b f237805w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f237806x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y(com.revolut.feature.wealth.ui.impl.trades.b bVar, String str, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f237805w = bVar;
        this.f237806x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new y(this.f237805w, this.f237806x, continuation, 0);
            case 1:
                return new y(this.f237805w, this.f237806x, continuation, 1);
            case 2:
                return new y(this.f237805w, this.f237806x, continuation, 2);
            case 3:
                return new y(this.f237805w, this.f237806x, continuation, 3);
            default:
                return new y(this.f237805w, this.f237806x, continuation, 4);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((y) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                com.revolut.feature.wealth.ui.impl.trades.b bVar = this.f237805w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    b1 b1Var = (b1) bVar.o;
                    b1Var.getClass();
                    String id10 = this.f237806x;
                    Intrinsics.checkNotNullParameter(id10, "id");
                    ufm.c cVar = new ufm.c(new x0(b1Var, id10, 0), 0);
                    Intrinsics.checkNotNullExpressionValue(cVar, "defer(...)");
                    ufm.i iVar = new ufm.i(b1Var.d(cVar), new aed.f(new a7b.r(b1Var, 26), 19), 0);
                    Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
                    rfm.f0 f0VarS = zi0.c.s(ue0.e.I(iVar, h0.f322473a, new pmj.b(29)));
                    this.v = 1;
                    obj2 = nim.a.b(f0VarS, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                }
                File file = (File) obj2;
                Intrinsics.h(file);
                f9i.c cVar2 = new f9i.c(new f9i.d(file));
                this.v = 2;
                if (bVar.G1(cVar2, this) == aVar) {
                    return aVar;
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.wealth.ui.impl.trades.b bVar2 = this.f237805w;
                    y yVar = new y(bVar2, this.f237806x, null, 0);
                    this.v = 1;
                    if (bVar2.p2(this, yVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                com.revolut.feature.wealth.ui.impl.trades.b bVar3 = this.f237805w;
                t tVar = new t(bVar3, 1);
                ack.n nVar = new ack.n(19);
                y yVar2 = new y(bVar3, this.f237806x, null, 1);
                this.v = 1;
                Object objP = n14.k.P(bVar3.X(), null, tVar, nVar, yVar2, this);
                return objP == aVar3 ? aVar3 : objP;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    f9i.c cVar3 = new f9i.c(new f9i.e(this.f237806x, false));
                    this.v = 1;
                    if (this.f237805w.G1(cVar3, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.feature.wealth.ui.impl.trades.b bVar4 = this.f237805w;
                    y yVar3 = new y(bVar4, this.f237806x, null, 3);
                    this.v = 1;
                    if (bVar4.p2(this, yVar3) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
