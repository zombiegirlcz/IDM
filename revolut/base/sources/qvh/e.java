package qvh;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import mvh.a;
import skm.e0;
import skm.p0;
import yhm.o;
import zuh.m;

/* JADX INFO: loaded from: classes10.dex */
public final class e extends i implements Function1 {
    public int u;
    public final /* synthetic */ g v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f249702w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, String str, Continuation continuation) {
        super(1, continuation);
        this.v = gVar;
        this.f249702w = str;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new e(this.v, this.f249702w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((e) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        g gVar = this.v;
        if (i == 0) {
            o.b(obj2);
            jvh.a aVar = gVar.f249703p;
            this.u = 1;
            zuh.o oVar = aVar.f178883a;
            oVar.getClass();
            m mVar = new m(oVar, this.f249702w, null, 3);
            p0 p0Var = p0.f264001a;
            Object objJ = e0.J(elm.f.f127540b, mVar, this);
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
            if (objJ != obj3) {
                objJ = Unit.f186387a;
            }
            if (objJ == obj3) {
                return obj3;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        gVar.C2(a.c.f209255a);
        return Unit.f186387a;
    }
}
