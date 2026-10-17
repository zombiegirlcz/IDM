package cj6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.external_accounts.impl.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import nii.y0;
import nii.z;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ n f24617w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(n nVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f24617w = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new k(this.f24617w, continuation, 0);
            default:
                return new k(this.f24617w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        Object objQ;
        n nVar;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    n nVar2 = this.f24617w;
                    j jVar = new j(nVar2, null, 1);
                    this.v = 1;
                    if (nVar2.p2(this, jVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                n nVar3 = this.f24617w;
                Continuation continuation = null;
                if (i2 == 0) {
                    o.b(obj2);
                    up4.h hVar = new up4.h(3);
                    c64.d dVar = new c64.d(nVar3, continuation, 8);
                    this.v = 1;
                    objQ = n14.k.Q(nVar3, null, null, hVar, dVar, this, 3);
                    nVar = nVar3;
                    if (objQ == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    nVar = nVar3;
                    objQ = obj2;
                }
                nii.e eVar = (nii.e) objQ;
                if (eVar instanceof nii.c) {
                    throw ((nii.c) eVar).f216123a;
                }
                if (!(eVar instanceof nii.d)) {
                    throw new NoWhenBranchMatchedException();
                }
                Pair pair = (Pair) ((nii.d) eVar).f216133a;
                ei6.d dVar2 = (ei6.d) pair.f186385a;
                ri6.d dVar3 = (ri6.d) pair.f186386b;
                if (dVar3 == null) {
                    yji.l.a1(nVar, nVar.X1(new y0(null, new z(new TextLocalisedClause(R$string.oba_authorize_account_not_found_title, null, null, 14), new TextLocalisedClause(R$string.oba_authorize_account_not_found_subtitle, null, null, 14), new TextLocalisedClause(com.revolut.retail.common.ui.R$string.common_action_done, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 5)), null, null, new l(nVar, null), 3);
                } else {
                    nVar.H2(nVar.f24621s, new c7e.i(dVar3, dVar2, 25));
                }
                return Unit.f186387a;
        }
    }
}
