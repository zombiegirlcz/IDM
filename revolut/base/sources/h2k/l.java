package h2k;

import efm.r;
import ffk.t;
import gzg.a0;
import i3k.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i3k.e f148869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f148870b;

    public l(i3k.e repository, t pricingPlanInteractor, yik.h pricingPlanStringMapper) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanStringMapper, "pricingPlanStringMapper");
        this.f148869a = repository;
        this.f148870b = pricingPlanInteractor;
    }

    public final vkm.d a(long j2, wi0.b recipientCountry, xi0.b senderCurrency, xi0.b recipientCurrency) {
        Intrinsics.checkNotNullParameter(senderCurrency, "senderCurrency");
        Intrinsics.checkNotNullParameter(recipientCountry, "recipientCountry");
        Intrinsics.checkNotNullParameter(recipientCurrency, "recipientCurrency");
        t tVar = this.f148870b;
        r rVarQ = tVar.q();
        m mVar = (m) this.f148869a;
        mVar.getClass();
        Intrinsics.checkNotNullParameter(senderCurrency, "senderCurrency");
        Intrinsics.checkNotNullParameter(recipientCountry, "recipientCountry");
        Intrinsics.checkNotNullParameter(recipientCurrency, "recipientCurrency");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return rd0.e.b(nim.a.w(kli.a.i(rVarQ, mVar.f158257l.e(new i3k.k(j2, recipientCountry, senderCurrency, recipientCurrency), loadingStrategy), tVar.n()), new a0(this, 20)));
    }
}
