package vdl;

import hcl.v2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ o f288003w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(o oVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f288003w = oVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                n nVar = new n(this.f288003w, continuation, 0);
                nVar.v = obj2;
                return nVar;
            default:
                n nVar2 = new n(this.f288003w, continuation, 1);
                nVar2.v = obj2;
                return nVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                if (obj2 != null) {
                    throw new ClassCastException();
                }
                ((n) create(null, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
                throw null;
            default:
                return ((n) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                if (this.v != null) {
                    throw new ClassCastException();
                }
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                throw null;
            default:
                String str = (String) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                hcl.s0 s0VarA = this.f288003w.k.a(str);
                if (s0VarA == null) {
                    return null;
                }
                Object obj3 = tcl.i.f269885a;
                Intrinsics.checkNotNullParameter(s0VarA, "<this>");
                jo3.b bVar = s0VarA.f151147b;
                dj0.d dVarV = bVar != null ? hx7.a.v(bVar) : null;
                Long l2 = s0VarA.f151148c;
                v2 v2Var = s0VarA.d;
                nel.f0 f0VarB = v2Var != null ? tcl.i.b(v2Var) : null;
                v2 v2Var2 = s0VarA.e;
                nel.f0 f0VarB2 = v2Var2 != null ? tcl.i.b(v2Var2) : null;
                v2 v2Var3 = s0VarA.f;
                return new nel.w(dVarV, l2, f0VarB, f0VarB2, v2Var3 != null ? tcl.i.b(v2Var3) : null, s0VarA.f151149g);
        }
    }
}
