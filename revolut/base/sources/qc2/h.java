package qc2;

import com.revolut.core.ui_kit.delegates.t;
import com.revolut.feature.apm.qvik.impl.ui.home.area.QvikHomeAreaScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import qa9.r;

/* JADX INFO: loaded from: classes20.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ QvikHomeAreaScreen f244524w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(QvikHomeAreaScreen qvikHomeAreaScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f244524w = qvikHomeAreaScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                h hVar = new h(this.f244524w, continuation, 0);
                hVar.v = obj2;
                return hVar;
            default:
                h hVar2 = new h(this.f244524w, continuation, 1);
                hVar2.v = obj2;
                return hVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((h) create((a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((h) create((t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        QvikHomeAreaScreen qvikHomeAreaScreen = this.f244524w;
        switch (i) {
            case 0:
                a aVar = (a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e eVarE3 = qvikHomeAreaScreen.d();
                Intrinsics.h(aVar);
                ((n) eVarE3).J2(aVar);
                return Unit.f186387a;
            default:
                t clickData = (t) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                e eVarE32 = qvikHomeAreaScreen.d();
                Intrinsics.h(clickData);
                n nVar = (n) eVarE32;
                nVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                h12.k kVarB = ((u12.a) nVar.f244531t).b(clickData);
                if (Intrinsics.f(kVarB, h12.i.f148450a)) {
                    ((pn3.b) nVar.f244532w).c(nVar, new r(nVar, 13));
                } else if (Intrinsics.f(kVarB, h12.j.f148451a)) {
                    nVar.l2(new pwb.p(nVar, null, 27), new yi5.b(26));
                } else if (kVarB != null) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
        }
    }
}
