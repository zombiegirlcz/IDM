package v54;

import c84.t;
import com.revolut.feature.credit.application.plugins.api.models.birth_place.BirthCity;
import com.revolut.feature.credit.application.plugins.impl.ui.birth_place.flow.BirthPlaceRootFlowContract$State;
import ft3.h1;
import gim.i;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kp0.w0;
import mp6.j;
import p24.p;
import skm.e0;
import skm.p0;
import vkm.j2;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class f extends i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.birth_place.flow.a f286155w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(com.revolut.feature.credit.application.plugins.impl.ui.birth_place.flow.a aVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f286155w = aVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new f(this.f286155w, continuation, 0);
            default:
                return new f(this.f286155w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((f) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objJ;
        int i = this.u;
        com.revolut.feature.credit.application.plugins.impl.ui.birth_place.flow.a aVar = this.f286155w;
        switch (i) {
            case 0:
                qki.d dVar = aVar.f67176t;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    o.b(obj2);
                    hw3.a aVar3 = aVar.f67173q;
                    wi0.b bVar = ((BirthPlaceRootFlowContract$State) ((j2) dVar.f22677a).getValue()).f67165a;
                    BirthCity birthCity = ((BirthPlaceRootFlowContract$State) ((j2) dVar.f22677a).getValue()).f67166b;
                    h1 h1VarF = w0.F(aVar.f67172p.f67164a);
                    this.v = 1;
                    p pVar = aVar3.f156052a;
                    String str = bVar.f297794a;
                    String str2 = birthCity.f66301a;
                    String str3 = birthCity.f66302b;
                    pVar.getClass();
                    j jVar = new j(13, (Serializable) str2, (Object) pVar, (Object) h1VarF, (Object) str3, str, (Continuation) null);
                    p0 p0Var = p0.f264001a;
                    objJ = e0.J(elm.f.f127540b, jVar, this);
                    if (objJ == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        o.b(obj2);
                        return Unit.f186387a;
                    }
                    o.b(obj2);
                    objJ = obj2;
                }
                this.v = 2;
                if (t.N2(aVar, (it3.d) objJ, this, 2) == aVar2) {
                    return aVar2;
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    f fVar = new f(aVar, null, 0);
                    this.v = 1;
                    if (aVar.p2(this, fVar) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
