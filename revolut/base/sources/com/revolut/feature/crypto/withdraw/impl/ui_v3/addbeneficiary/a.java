package com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary;

import aq5.g;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.CryptoAddBeneficiaryFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import oki.h;
import pfm.z;
import wk5.n;
import yhm.o;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i implements Function1 {
    public int u;
    public final /* synthetic */ b v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(1, continuation);
        this.v = bVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new a(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((a) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        b bVar = this.v;
        if (i == 0) {
            o.b(obj2);
            z zVarK = bVar.o.k();
            this.u = 1;
            obj2 = nim.a.b(zVarK, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        n nVar = (n) obj2;
        int i2 = nVar == null ? -1 : g.f8265a[nVar.ordinal()];
        if (i2 == 1) {
            bVar.K2();
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            h.w2(bVar.v, CryptoAddBeneficiaryFlowContract$Step.Restricted.f71216a, ModalDestination.Style.POPUP.f98311a);
        }
        return Unit.f186387a;
    }
}
