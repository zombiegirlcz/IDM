package com.revolut.retail.feature.pricing_plans.waitlist.impl.interactor;

import com.revolut.retail.feature.pricing_plans.waitlist.api.model.PricingPlanWaitlistEntry;
import gok.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/waitlist/impl/interactor/WaitlistDomainException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "feature_retail_pricing_plans_waitlist_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WaitlistDomainException extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PricingPlanWaitlistEntry f103681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f103682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HttpException f103683c;

    public WaitlistDomainException(PricingPlanWaitlistEntry entry, a errorReason, HttpException httpException) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(errorReason, "errorReason");
        this.f103681a = entry;
        this.f103682b = errorReason;
        this.f103683c = httpException;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f103683c;
    }
}
