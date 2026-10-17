package nya;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class k0 extends gim.i implements Function2 {
    public /* synthetic */ long u;
    public final /* synthetic */ com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.d v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ pwa.m f220741w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f220742x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.d dVar, pwa.m mVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.v = dVar;
        this.f220741w = mVar;
        this.f220742x = z;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        k0 k0Var = new k0(this.v, this.f220741w, this.f220742x, continuation);
        k0Var.u = ((Number) obj2).longValue();
        return k0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((k0) create(Long.valueOf(((Number) obj2).longValue()), (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        long j2 = this.u;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        com.revolut.feature.referrals.shared.ui.impl.ui.invite_campaign.home.d dVar = this.v;
        dVar.H2(dVar.E, new no.h0(this.f220741w, j2, this.f220742x));
        return Unit.f186387a;
    }
}
