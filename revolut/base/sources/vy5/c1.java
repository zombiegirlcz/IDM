package vy5;

import ip0.um0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c1 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ cc7.l f293143w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c1(cc7.l lVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f293143w = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c1 c1Var = new c1(this.f293143w, continuation, 0);
                c1Var.v = obj2;
                return c1Var;
            default:
                c1 c1Var2 = new c1(this.f293143w, continuation, 1);
                c1Var2.v = obj2;
                return c1Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        um0 um0Var = (um0) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((c1) create(um0Var, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        cc7.l lVar = this.f293143w;
        switch (i) {
            case 0:
                um0 model = (um0) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                w wVar = (w) lVar.f22957n;
                Intrinsics.h(model);
                wVar.getClass();
                Intrinsics.checkNotNullParameter(model, "model");
                String str = model.f166695a;
                if (Intrinsics.f(str, "deactivate_pocket_options") || Intrinsics.f(str, "hide_pocket_options")) {
                    j60.a.v(wVar.o, true, null, 2);
                }
                break;
            default:
                um0 model2 = (um0) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                w wVar2 = (w) lVar.f22957n;
                Intrinsics.h(model2);
                wVar2.getClass();
                Intrinsics.checkNotNullParameter(model2, "model");
                String str2 = model2.f166695a;
                if (Intrinsics.f(str2, "deactivate_pocket_options") || Intrinsics.f(str2, "hide_pocket_options")) {
                    j60.a.v(wVar2.o, true, null, 2);
                    Object obj3 = model2.d;
                    io3.d dVar = obj3 instanceof io3.d ? (io3.d) obj3 : null;
                    if (dVar != null) {
                        wVar2.T2(new o(wVar2, dVar, null), new yi5.b(27));
                    }
                }
                break;
        }
        return Unit.f186387a;
    }
}
