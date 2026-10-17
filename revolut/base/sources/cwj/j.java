package cwj;

import com.revolut.domain.interactors.experiments.ExperimentsFetchingInteractor$ExperimentType;
import com.revolut.feature.onboarding.api.onboarding.OnboardingLanguageChangePromptDestination;
import com.revolut.retail.feature.impl.userauth.flow.UserOnboardingFlowContract$State;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import pfm.t;
import skm.e0;
import vkm.j2;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.retail.feature.impl.userauth.flow.f f109839w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(com.revolut.retail.feature.impl.userauth.flow.f fVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f109839w = fVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.f109839w, continuation, 0);
            case 1:
                return new j(this.f109839w, continuation, 1);
            case 2:
                return new j(this.f109839w, continuation, 2);
            case 3:
                return new j(this.f109839w, continuation, 3);
            case 4:
                return new j(this.f109839w, continuation, 4);
            case 5:
                return new j(this.f109839w, continuation, 5);
            default:
                return new j(this.f109839w, continuation, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        int i2 = 0;
        Continuation continuation = null;
        com.revolut.retail.feature.impl.userauth.flow.f fVar = this.f109839w;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    if (fVar.z.a(((UserOnboardingFlowContract$State) ((j2) fVar.L.f22677a).getValue()).f101655c.getCountry())) {
                        return fVar.C1(new OnboardingLanguageChangePromptDestination(false));
                    }
                    this.v = 1;
                    if (com.revolut.retail.feature.impl.userauth.flow.f.J2(fVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    k kVar = new k(fVar, continuation, i2);
                    this.v = 1;
                    if (fVar.p2(this, kVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 2:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.v;
                try {
                    if (i6 == 0) {
                        yhm.o.b(obj2);
                        pfm.a aVarI = fVar.G.i();
                        this.v = 1;
                        if (nim.a.a(aVarI, this) == aVar3) {
                            return aVar3;
                        }
                    } else {
                        if (i6 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                    }
                    Unit unit = Unit.f186387a;
                    break;
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e2, h0Var);
                }
                return Unit.f186387a;
            case 3:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.v;
                try {
                    if (i21 == 0) {
                        yhm.o.b(obj2);
                        t tVarA = jte.c.a(fVar.f101681x, ExperimentsFetchingInteractor$ExperimentType.FIREBASE, 2);
                        this.v = 1;
                        if (nim.a.a(tVarA, this) == aVar4) {
                            return aVar4;
                        }
                    } else {
                        if (i21 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                    }
                    Unit unit2 = Unit.f186387a;
                    break;
                } catch (CancellationException e4) {
                    throw e4;
                } catch (Exception e5) {
                    h0 h0Var2 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e5, h0Var2);
                }
                return Unit.f186387a;
            case 4:
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i22 = this.v;
                try {
                    if (i22 == 0) {
                        yhm.o.b(obj2);
                        efm.b bVarI = ((cpj.b) fVar.f101682y).i();
                        this.v = 1;
                        if (nim.a.a(bVarI, this) == aVar5) {
                            return aVar5;
                        }
                    } else {
                        if (i22 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        yhm.o.b(obj2);
                    }
                    Unit unit3 = Unit.f186387a;
                    break;
                } catch (CancellationException e6) {
                    throw e6;
                } catch (Exception e22) {
                    h0 h0Var3 = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e22, h0Var3);
                }
                return Unit.f186387a;
            case 5:
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                int i32 = this.v;
                if (i32 == 0) {
                    yhm.o.b(obj2);
                    com.revolut.retail.feature.impl.userauth.flow.e eVar = new com.revolut.retail.feature.impl.userauth.flow.e(fVar, null);
                    this.v = 1;
                    if (fVar.p2(this, eVar) == aVar6) {
                        return aVar6;
                    }
                } else {
                    if (i32 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar7 = fim.a.COROUTINE_SUSPENDED;
                int i33 = this.v;
                if (i33 == 0) {
                    yhm.o.b(obj2);
                    this.v = 1;
                    if (e0.G(new cvi.j(fVar, continuation, 4), this) == aVar7) {
                        return aVar7;
                    }
                } else {
                    if (i33 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
