package com.revolut.feature.revolutpay.impl.ui.summary_screen;

import com.revolut.feature.revolutpay.api.shared.domain.models.AcceptPaymentParams;
import com.revolut.feature.revolutpay.impl.ui.summary_screen.RevolutPaySummaryScreenContract$OutputData;
import gim.i;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import p8c.a;
import p8c.g;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends i implements Function2 {
    public int u;
    public final /* synthetic */ f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ AcceptPaymentParams f84562w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f84563x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ l6c.c f84564y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(f fVar, AcceptPaymentParams acceptPaymentParams, boolean z, l6c.c cVar, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
        this.f84562w = acceptPaymentParams;
        this.f84563x = z;
        this.f84564y = cVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new a(this.v, this.f84562w, this.f84563x, this.f84564y, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        f fVar = this.v;
        if (i == 0) {
            o.b(obj2);
            p8c.c cVar = fVar.f84576w;
            this.u = 1;
            obj2 = ((g) cVar).Z2(this.f84562w, this.f84563x, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.b(obj2);
        }
        p8c.a aVar2 = (p8c.a) obj2;
        boolean z = aVar2 instanceof a.C1296a;
        l6c.c cVar2 = this.f84564y;
        if (z) {
            fVar.S2(cVar2.f192387b);
        } else if (aVar2 instanceof a.b) {
            fVar.C2(new RevolutPaySummaryScreenContract$OutputData.PaymentFailure(null));
        } else {
            if (!(aVar2 instanceof p8c.b)) {
                throw new NoWhenBranchMatchedException();
            }
            fVar.L2(cVar2.f192387b, ((p8c.b) aVar2).f234140a);
        }
        return Unit.f186387a;
    }
}
