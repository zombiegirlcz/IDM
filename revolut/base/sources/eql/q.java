package eql;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes12.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ c0 f128517w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(c0 c0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f128517w = c0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q(this.f128517w, continuation, 0);
            case 1:
                return new q(this.f128517w, continuation, 1);
            default:
                return new q(this.f128517w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        c0 c0Var = this.f128517w;
        switch (i) {
            case 0:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    akl.z zVar = c0Var.f128494q;
                    this.v = 1;
                    zVar.getClass();
                    akl.y yVar = new akl.y(zVar, null, 3);
                    p0 p0Var = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, yVar, this);
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == obj3) {
                        return obj3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                c0.e3(c0Var);
                return Unit.f186387a;
            case 1:
                Object obj4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    akl.z zVar2 = c0Var.f128494q;
                    this.v = 1;
                    zVar2.getClass();
                    akl.y yVar2 = new akl.y(zVar2, null, 4);
                    p0 p0Var2 = p0.f264001a;
                    Object objJ2 = e0.J(elm.f.f127540b, yVar2, this);
                    if (objJ2 != obj4) {
                        objJ2 = Unit.f186387a;
                    }
                    if (objJ2 == obj4) {
                        return obj4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                c0.f3(c0Var);
                return Unit.f186387a;
            default:
                Object obj5 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    akl.z zVar3 = c0Var.f128494q;
                    this.v = 1;
                    zVar3.getClass();
                    akl.y yVar3 = new akl.y(zVar3, null, 5);
                    p0 p0Var3 = p0.f264001a;
                    Object objJ3 = e0.J(elm.f.f127540b, yVar3, this);
                    if (objJ3 != obj5) {
                        objJ3 = Unit.f186387a;
                    }
                    if (objJ3 == obj5) {
                        return obj5;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                c0.g3(c0Var);
                return Unit.f186387a;
        }
    }
}
