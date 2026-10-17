package v25;

import aii.u;
import efm.r;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import uyd.y;

/* JADX INFO: loaded from: classes22.dex */
public final class i extends gim.i implements Function1 {
    public o u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f285652w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f285653x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(o oVar, String str, Continuation continuation) {
        super(1, continuation);
        this.f285652w = oVar;
        this.f285653x = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new i(this.f285652w, this.f285653x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((i) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        o oVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            o oVar2 = this.f285652w;
            r rVarG = m70.a.g(oVar2.f285665n.a(this.f285653x, w4l.h.f294642c), null, new g(0), 1);
            h hVar = h.f;
            r map = rVarG.map(new y(3));
            Intrinsics.checkNotNullExpressionValue(map, "map(...)");
            this.u = oVar2;
            this.v = 1;
            Object objC = nim.a.c(map, this);
            if (objC == aVar) {
                return aVar;
            }
            oVar = oVar2;
            obj2 = objC;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oVar = this.u;
            yhm.o.b(obj2);
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "awaitFirst(...)");
        oVar.A2((u) obj2);
        return Unit.f186387a;
    }
}
