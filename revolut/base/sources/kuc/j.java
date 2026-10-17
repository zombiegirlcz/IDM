package kuc;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import pfm.m;
import pfm.t;
import rp0.p0;
import te0.w;
import yhm.o;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends gim.i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f189775w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(l lVar, Continuation continuation) {
        super(2, continuation);
        this.f189775w = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        j jVar = new j(this.f189775w, continuation);
        jVar.v = obj2;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j) create((p0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        efm.b bVarL;
        p0.a aVar = (p0.a) this.v;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            boolean zF = Intrinsics.f(aVar.f256150a, "PROMPT_ID_ENABLE_BLOCK");
            l lVar = this.f189775w;
            if (zF) {
                m67.e eVar = lVar.f189778m.f181652a;
                t tVarL = new pfm.h(w.i0(eVar.f203030a.setGamblingBlock(new l67.c(true))), 4).l(new m67.a(eVar, 1));
                Intrinsics.checkNotNullExpressionValue(tVarL, "doOnComplete(...)");
                bVarL = o70.a.g(tVarL).l(new h(lVar, 0));
            } else {
                bVarL = m.f235744a;
            }
            i iVar = new i(lVar, bVarL, null, 0);
            this.v = null;
            this.u = 1;
            if (lVar.Y2(this, iVar) == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        return Unit.f186387a;
    }
}
