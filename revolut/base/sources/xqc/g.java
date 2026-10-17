package xqc;

import aqc.j;
import com.revolut.feature.salary_switch.impl.models.v2.Institution;
import do3.q;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import mpd.p;
import mqc.r;
import skm.e0;
import skm.p0;
import vkm.j2;
import yhm.o;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ h f308152w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f308152w = hVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.f308152w, continuation, 0);
            case 1:
                return new g(this.f308152w, continuation, 1);
            default:
                return new g(this.f308152w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((g) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        Continuation continuation = null;
        h hVar = this.f308152w;
        int i2 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                j jVar = hVar.f308153p;
                d dVar = (d) ((j2) hVar.f308154q.f22677a).getValue();
                kqc.h hVar2 = kqc.h.PCPS;
                Institution institution = dVar.f308149c.f85248a;
                kqc.b bVar = kqc.b.BUSINESS;
                String str = dVar.f308147a;
                kqc.d dVar2 = kqc.d.TAX_ID;
                String strB = hVar.o.b(dVar.f308148b);
                wi0.b.Companion.getClass();
                kqc.i iVar = new kqc.i(hVar2, institution, new kqc.a(bVar, str, new kqc.c(dVar2, strB)));
                this.v = 1;
                r rVar = jVar.f8318a;
                rVar.getClass();
                p pVar = new p(rVar, iVar, continuation, 3);
                p0 p0Var = p0.f264001a;
                Object objJ = e0.J(elm.f.f127540b, pVar, this);
                return objJ == aVar ? aVar : objJ;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                g gVar = new g(hVar, continuation, 0);
                this.v = 1;
                Object objT = q.t(hVar, gVar, this);
                return objT == aVar2 ? aVar2 : objT;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    o.b(obj2);
                    g gVar2 = new g(hVar, continuation, i2);
                    this.v = 1;
                    obj2 = u0.b0(hVar.X(), "REVIEW_DETAILS_SUBMIT_TAG", gVar2, this);
                    if (obj2 == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                hVar.C2(new e((String) obj2));
                return Unit.f186387a;
        }
    }
}
