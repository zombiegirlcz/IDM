package hea;

import com.revolut.core.model.account.AccountId;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nii.t1;

/* JADX INFO: loaded from: classes5.dex */
public final class x extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.pockets.impl.details_v2.pocket_details.a f151674w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ io3.d f151675x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ AccountId f151676y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar, io3.d dVar, AccountId accountId, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f151674w = aVar;
        this.f151675x = dVar;
        this.f151676y = accountId;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new x(this.f151674w, this.f151675x, this.f151676y, continuation, 0);
            default:
                return new x(this.f151674w, this.f151675x, this.f151676y, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((x) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar;
        Object objQ;
        final int i = 1;
        switch (this.u) {
            case 0:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    return obj2;
                }
                yhm.o.b(obj2);
                final int i3 = 0;
                final com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar3 = this.f151674w;
                final io3.d dVar = this.f151675x;
                t1 t1Var = new t1() { // from class: hea.v
                    @Override // nii.p1
                    public final nii.m0 a(Object obj3) {
                        switch (i3) {
                            case 0:
                                io3.d dVarA = io3.d.a(dVar, null, io3.k.ACTIVE, 0L, null, 8388575);
                                com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar4 = aVar3;
                                aVar4.H2(aVar4.U, new afa.s(dVarA, 5));
                                aVar4.f80858p.getClass();
                                return gea.a.a(true);
                            default:
                                aVar3.f80858p.getClass();
                                nii.j0 j0VarA = gea.a.a(false);
                                if (dVar.i > 0) {
                                    return j0VarA;
                                }
                                return null;
                        }
                    }
                };
                w wVar = new w(aVar3, dVar, this.f151676y, null, 0);
                this.v = 1;
                Object objQ2 = n14.k.Q(aVar3, null, null, t1Var, wVar, this, 3);
                return objQ2 == aVar2 ? aVar2 : objQ2;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                final com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar5 = this.f151674w;
                Continuation continuation = null;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    final io3.d dVar2 = this.f151675x;
                    t1 t1Var2 = new t1() { // from class: hea.v
                        @Override // nii.p1
                        public final nii.m0 a(Object obj3) {
                            switch (i) {
                                case 0:
                                    io3.d dVarA = io3.d.a(dVar2, null, io3.k.ACTIVE, 0L, null, 8388575);
                                    com.revolut.feature.pockets.impl.details_v2.pocket_details.a aVar42 = aVar5;
                                    aVar42.H2(aVar42.U, new afa.s(dVarA, 5));
                                    aVar42.f80858p.getClass();
                                    return gea.a.a(true);
                                default:
                                    aVar5.f80858p.getClass();
                                    nii.j0 j0VarA = gea.a.a(false);
                                    if (dVar2.i > 0) {
                                        return j0VarA;
                                    }
                                    return null;
                            }
                        }
                    };
                    w wVar2 = new w(aVar5, dVar2, this.f151676y, continuation, 1);
                    aVar = aVar5;
                    this.v = 1;
                    objQ = n14.k.Q(aVar, null, null, t1Var2, wVar2, this, 3);
                    if (objQ == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                    objQ = obj2;
                    aVar = aVar5;
                }
                nii.e eVar = (nii.e) objQ;
                if (eVar instanceof nii.d) {
                    aVar.B2();
                } else {
                    if (!(eVar instanceof nii.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Throwable th10 = ((nii.c) eVar).f216123a;
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, th10, h0Var);
                }
                return Unit.f186387a;
        }
    }
}
