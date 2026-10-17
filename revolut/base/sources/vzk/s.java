package vzk;

import hul.f0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;
import vzk.l;

/* JADX INFO: loaded from: classes12.dex */
public final class s extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ u v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ xel.e f293567w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(u uVar, xel.e eVar, Continuation continuation) {
        super(1, continuation);
        this.v = uVar;
        this.f293567w = eVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new s(this.v, this.f293567w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((s) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object obj3 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        u uVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            uVar.x2(new o(uVar, 3));
            kye.e eVar = uVar.f293568p;
            this.u = 1;
            hyk.l lVar = (hyk.l) eVar.f190729b;
            lVar.getClass();
            f0 f0Var = new f0(lVar, this.f293567w, null, 23);
            p0 p0Var = p0.f264001a;
            Object objJ = e0.J(elm.f.f127540b, f0Var, this);
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
            yhm.o.b(obj2);
        }
        uVar.v2(l.b.f293555a);
        uVar.x2(new o(uVar, 4));
        return Unit.f186387a;
    }
}
