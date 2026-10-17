package com.revolut.feature.freelancer.api.exception;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/api/exception/FreelancerCurrencyException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "PaymentLink", "Lcom/revolut/feature/freelancer/api/exception/FreelancerCurrencyException$PaymentLink;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class FreelancerCurrencyException extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73174a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/api/exception/FreelancerCurrencyException$PaymentLink;", "Lcom/revolut/feature/freelancer/api/exception/FreelancerCurrencyException;", "<init>", "()V", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PaymentLink extends FreelancerCurrencyException {
    }

    public FreelancerCurrencyException() {
        super("Payment link currency cannot be resolved");
        this.f73174a = "Payment link currency cannot be resolved";
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f73174a;
    }
}
