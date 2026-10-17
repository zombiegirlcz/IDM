package ona;

import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import vkm.q;
import yhm.o;
import zh9.u0;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ i f226925w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(i iVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f226925w = iVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.f226925w, continuation, 0);
            default:
                return new h(this.f226925w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((h) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                i iVar = this.f226925w;
                if (i == 0) {
                    o.b(obj2);
                    jhi.b bVarG = mo3.a.g(nim.a.v(rd0.e.n(rd0.e.b(iVar.u.a()), h0.f322473a), new f(iVar, 1)), null, new ol6.b(22), 1);
                    this.v = 1;
                    obj2 = q.z(bVarG, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                NaviCommand naviCommand = (NaviCommand) obj2;
                if (naviCommand != null) {
                    return iVar.C1(u0.b(naviCommand));
                }
                return null;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                i iVar2 = this.f226925w;
                h hVar = new h(iVar2, null, 0);
                this.v = 1;
                Object objB = pu7.a.B(iVar2.k, "rate_app_clicked", hVar, this);
                return objB == aVar2 ? aVar2 : objB;
        }
    }
}
