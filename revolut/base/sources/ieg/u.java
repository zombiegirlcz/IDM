package ieg;

import com.revolut.data.model.Data;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class u extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.b f160737w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.b bVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f160737w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                u uVar = new u(this.f160737w, continuation, 0);
                uVar.v = obj2;
                return uVar;
            case 1:
                u uVar2 = new u(this.f160737w, continuation, 1);
                uVar2.v = obj2;
                return uVar2;
            default:
                u uVar3 = new u(this.f160737w, continuation, 2);
                uVar3.v = obj2;
                return uVar3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((u) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((u) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((u) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 20;
        com.revolut.feature.travel.hotels.impl.ui_kompot.screen.rooms_selection.b bVar = this.f160737w;
        switch (i) {
            case 0:
                Pair pair = (Pair) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Data data = (Data) pair.f186385a;
                Pair pair2 = (Pair) pair.f186386b;
                Object obj3 = pair2.f186385a;
                Intrinsics.checkNotNullExpressionValue(obj3, "component1(...)");
                Data data2 = (Data) obj3;
                Object obj4 = pair2.f186386b;
                Intrinsics.checkNotNullExpressionValue(obj4, "component2(...)");
                xag.c cVar = (xag.c) obj4;
                Throwable error = data2.getError();
                if (error != null) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, error, h0Var);
                }
                bVar.H2(bVar.f94025y, new hsa.l(data, i2, data2, cVar));
                break;
            case 1:
                Data data3 = (Data) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                bVar.H2(bVar.f94025y, new i6f.h0(data3, 20));
                break;
            default:
                Pair pair3 = (Pair) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                Object obj5 = pair3.f186385a;
                Intrinsics.checkNotNullExpressionValue(obj5, "component1(...)");
                Object obj6 = pair3.f186386b;
                Intrinsics.checkNotNullExpressionValue(obj6, "component2(...)");
                bVar.H2(bVar.f94025y, new beg.n((Data) obj5, (xag.c) obj6, 1));
                break;
        }
        return Unit.f186387a;
    }
}
