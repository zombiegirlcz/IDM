package ir4;

import ack.n;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import n14.k;
import nii.c0;
import yhm.o;

/* JADX INFO: loaded from: classes22.dex */
public final class d extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.card.impl.ui.direct_debit.b f168002w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(com.revolut.feature.credit.card.impl.ui.direct_debit.b bVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f168002w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new d(this.f168002w, continuation, 0);
            default:
                return new d(this.f168002w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((d) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objF0;
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i != 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                n nVar = new n(26);
                com.revolut.feature.credit.card.impl.ui.direct_debit.b bVar = this.f168002w;
                a3b.h hVar = new a3b.h(bVar, 25);
                c0 c0Var = new c0(new TextLocalisedClause(R$string.credit_common_loading_title, null, null, 14), null, null, false, null, false, false, null, 1918);
                c cVar = new c(bVar, null);
                this.v = 1;
                Object objS = k.S(bVar.X(), c0Var, hVar, nVar, cVar, this);
                return objS == aVar ? aVar : objS;
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                com.revolut.feature.credit.card.impl.ui.direct_debit.b bVar2 = this.f168002w;
                if (i2 == 0) {
                    o.b(obj2);
                    d dVar = new d(bVar2, null, 0);
                    this.v = 1;
                    objF0 = ue8.c.f0(bVar2, dVar, this);
                    if (objF0 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    objF0 = obj2;
                }
                nii.h hVar2 = (nii.h) objF0;
                if (hVar2 instanceof nii.g) {
                    bVar2.C2(h.f168005a);
                } else if (!(hVar2 instanceof nii.f)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
        }
    }
}
