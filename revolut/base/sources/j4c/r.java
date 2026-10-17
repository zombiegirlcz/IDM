package j4c;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes6.dex */
public final class r extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f171354w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f171355x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f171356y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(u uVar, String str, String str2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f171354w = uVar;
        this.f171355x = str;
        this.f171356y = str2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new r(this.f171354w, this.f171355x, this.f171356y, continuation, 0);
            default:
                return new r(this.f171354w, this.f171355x, this.f171356y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((r) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        u uVar = this.f171354w;
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
                n3c.a aVar2 = uVar.f171362q;
                this.v = 1;
                k3c.p pVar = (k3c.p) aVar2.f211978a;
                pVar.getClass();
                i4g.d dVar = new i4g.d(21, pVar, this.f171355x, "RECEIPT", this.f171356y, null);
                p0 p0Var = p0.f264001a;
                Object objJ = e0.J(elm.f.f127540b, dVar, this);
                return objJ == aVar ? aVar : objJ;
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
                n3c.a aVar4 = uVar.f171362q;
                this.v = 1;
                k3c.p pVar2 = (k3c.p) aVar4.f211978a;
                pVar2.getClass();
                i4g.d dVar2 = new i4g.d(21, pVar2, this.f171355x, "REFUND", this.f171356y, null);
                p0 p0Var2 = p0.f264001a;
                Object objJ2 = e0.J(elm.f.f127540b, dVar2, this);
                return objJ2 == aVar3 ? aVar3 : objJ2;
        }
    }
}
