package xab;

import com.revolut.feature.retail.legacy.login.impl.login.LoginFragment;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ LoginFragment f303837w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(LoginFragment loginFragment, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f303837w = loginFragment;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.f303837w, continuation, 0);
            case 1:
                return new n(this.f303837w, continuation, 1);
            case 2:
                return new n(this.f303837w, continuation, 2);
            case 3:
                return new n(this.f303837w, continuation, 3);
            case 4:
                return new n(this.f303837w, continuation, 4);
            case 5:
                return new n(this.f303837w, continuation, 5);
            default:
                return new n(this.f303837w, continuation, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        boolean zBooleanValue;
        int i = this.u;
        LoginFragment loginFragment = this.f303837w;
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
                lwl.e eVar = (lwl.e) loginFragment.S0.getValue();
                this.v = 1;
                Object objB = eVar.f200484a.b(this);
                return objB == aVar ? aVar : objB;
            case 1:
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
                this.v = 1;
                Object objA = ((cn0.c) loginFragment.V().A.get()).a(this);
                return objA == aVar2 ? aVar2 : objA;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                this.v = 1;
                cn0.e eVar2 = loginFragment.f82685r0;
                if (eVar2 != null) {
                    Object objA2 = eVar2.a(this);
                    return objA2 == aVar3 ? aVar3 : objA2;
                }
                Intrinsics.r("primaryAuthCredentialsTypeProvider");
                throw null;
            case 3:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    ie9.d dVarN = loginFragment.N();
                    this.v = 1;
                    ie9.h hVar = (ie9.h) dVarN;
                    hVar.getClass();
                    ie9.g gVar = new ie9.g(hVar, null, 1);
                    skm.p0 p0Var = skm.p0.f264001a;
                    Object objJ = skm.e0.J(elm.f.f127540b, gVar, this);
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == obj3) {
                        return obj3;
                    }
                } else {
                    if (i6 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (LoginFragment.E(loginFragment, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                if (i22 == 0) {
                    yhm.o.b(obj2);
                    if (!loginFragment.requireActivity().isTaskRoot()) {
                        zBooleanValue = false;
                        return Boolean.valueOf(zBooleanValue);
                    }
                    ffa.a aVar6 = (ffa.a) loginFragment.O0.getValue();
                    this.v = 1;
                    obj2 = ((lfa.b) aVar6).b(this);
                    if (obj2 == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i22 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                zBooleanValue = ((Boolean) obj2).booleanValue();
                return Boolean.valueOf(zBooleanValue);
            default:
                Object obj4 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    bjl.u0 u0Var = (bjl.u0) loginFragment.f82675d1.getValue();
                    this.v = 1;
                    xjl.u uVar = (xjl.u) u0Var;
                    uVar.getClass();
                    skm.p0 p0Var2 = skm.p0.f264001a;
                    Object objJ2 = skm.e0.J(elm.f.f127540b, new xb4.e(uVar, null, 4), this);
                    if (objJ2 != obj4) {
                        objJ2 = Unit.f186387a;
                    }
                    if (objJ2 == obj4) {
                        return obj4;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
