package xkf;

import com.revolut.feature.support.api.SupportApi$Toggles$ShowAllTroubleshooters;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l1 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q1 f306728w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(q1 q1Var, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f306728w = q1Var;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new l1(this.f306728w, continuation, 0);
            default:
                return new l1(this.f306728w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((l1) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        boolean z = false;
        q1 q1Var = this.f306728w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                uvl.c cVar = q1Var.z;
                this.v = 1;
                pff.a aVar2 = (pff.a) cVar.f283492b;
                String entityId = ((klf.h0) cVar.f283491a).f185494j;
                zhm.f0 f0Var = zhm.f0.f322471a;
                Intrinsics.checkNotNullParameter(entityId, "entityId");
                Intrinsics.checkNotNullParameter("transfer-delivery", "scenario");
                w4l.j loadingStrategy = w4l.j.f294644c;
                vkm.d dVarA = aVar2.a(entityId, f0Var, false, loadingStrategy);
                tff.d dVar = aVar2.f235577a;
                dVar.getClass();
                Intrinsics.checkNotNullParameter("transfer-delivery", "scenario");
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                Object objX = vkm.q.x(mo3.a.e(rd0.e.n(zi0.c.w(nim.a.v(zh9.u0.m(dVarA, dVar.f.b("transfer-delivery", loadingStrategy)), new pd4.u(26))), zhm.h0.f322473a), new xce.d(21), new xce.d(22)), this);
                return objX == aVar ? aVar : objX;
            default:
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
                uvl.c cVar2 = q1Var.z;
                this.v = 1;
                pff.a aVar4 = (pff.a) cVar2.f283492b;
                String str = ((klf.h0) cVar2.f283491a).f185494j;
                zhm.f0 f0Var2 = zhm.f0.f322471a;
                od0.a aVar5 = od0.a.f224253a;
                if (od0.a.e()) {
                    if (((jte.d) ((gte.a) cVar2.f283493c)).c(SupportApi$Toggles$ShowAllTroubleshooters.f89343a)) {
                        z = true;
                    }
                }
                Object objX2 = vkm.q.x(new wyd.f(mo3.a.g(aVar4.a(str, f0Var2, z, w4l.i.f294643c), null, new xce.d(23), 1), (kgm.i) cVar2.d, 11), this);
                return objX2 == aVar3 ? aVar3 : objX2;
        }
    }
}
