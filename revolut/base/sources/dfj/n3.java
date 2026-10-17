package dfj;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes11.dex */
public final class n3 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ q3 f114052w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f114053x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f114054y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n3(q3 q3Var, String str, String str2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f114052w = q3Var;
        this.f114053x = str;
        this.f114054y = str2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n3(this.f114052w, this.f114053x, this.f114054y, continuation, 0);
            default:
                return new n3(this.f114052w, this.f114053x, this.f114054y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((n3) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        String str = this.f114054y;
        String str2 = this.f114053x;
        q3 q3Var = this.f114052w;
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
                nfj.v1 v1Var = q3Var.f114082a;
                this.v = 1;
                v1Var.getClass();
                nfj.t1 t1Var = new nfj.t1(v1Var, str2, str, null);
                skm.p0 p0Var = skm.p0.f264001a;
                Object objJ = skm.e0.J(elm.f.f127540b, t1Var, this);
                return objJ == aVar ? aVar : objJ;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 != 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                nfj.v1 v1Var2 = q3Var.f114082a;
                this.v = 1;
                v1Var2.getClass();
                nfj.u1 u1Var = new nfj.u1(v1Var2, str2, str, null);
                skm.p0 p0Var2 = skm.p0.f264001a;
                Object objJ2 = skm.e0.J(elm.f.f127540b, u1Var, this);
                return objJ2 == aVar2 ? aVar2 : objJ2;
        }
    }
}
