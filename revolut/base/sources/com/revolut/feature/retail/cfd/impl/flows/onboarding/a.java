package com.revolut.feature.retail.cfd.impl.flows.onboarding;

import a2b.d;
import com.revolut.feature.retail.cfd.impl.flows.onboarding.CfdOnboardingFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import oki.h;
import v2b.e;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends i implements Function2 {
    public int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ b f82166w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation continuation) {
        super(2, continuation);
        this.f82166w = bVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        a aVar = new a(this.f82166w, continuation);
        aVar.v = obj2;
        return aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((yja.b) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        b bVar = this.f82166w;
        yki.a aVar = bVar.f82168q;
        yja.b bVar2 = (yja.b) this.v;
        fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        if (i == 0) {
            o.b(obj2);
            int i2 = e.f285691a[bVar2.ordinal()];
            if (i2 == 1 || i2 == 2) {
                h.D2(aVar);
            } else if (i2 == 3) {
                bVar.C2(d.DISMISSED);
            } else {
                if (i2 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                this.v = null;
                this.u = 1;
                obj2 = b.I2(bVar, this);
                if (obj2 == aVar2) {
                    return aVar2;
                }
            }
            return Unit.f186387a;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o.b(obj2);
        if (obj2 == hel.b.GB) {
            h.w2(aVar, CfdOnboardingFlowContract$Step.RiskWarning.f82162a, ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        } else {
            bVar.C2(d.RISK_ACKNOWLEDGED);
        }
        return Unit.f186387a;
    }
}
