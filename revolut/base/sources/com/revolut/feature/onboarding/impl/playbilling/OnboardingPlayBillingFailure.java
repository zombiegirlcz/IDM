package com.revolut.feature.onboarding.impl.playbilling;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0006\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0006\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/revolut/feature/onboarding/impl/playbilling/OnboardingPlayBillingFailure;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "SessionReleased", "BillingSetupError", "ServiceDisconnected", "BillingConfigError", "EmptyBillingCountryCode", "Timeout", "Lcom/revolut/feature/onboarding/impl/playbilling/OnboardingPlayBillingFailure$BillingConfigError;", "Lcom/revolut/feature/onboarding/impl/playbilling/OnboardingPlayBillingFailure$BillingSetupError;", "Lcom/revolut/feature/onboarding/impl/playbilling/OnboardingPlayBillingFailure$EmptyBillingCountryCode;", "Lcom/revolut/feature/onboarding/impl/playbilling/OnboardingPlayBillingFailure$ServiceDisconnected;", "Lcom/revolut/feature/onboarding/impl/playbilling/OnboardingPlayBillingFailure$SessionReleased;", "Lcom/revolut/feature/onboarding/impl/playbilling/OnboardingPlayBillingFailure$Timeout;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class OnboardingPlayBillingFailure extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78521a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/onboarding/impl/playbilling/OnboardingPlayBillingFailure$BillingConfigError;", "Lcom/revolut/feature/onboarding/impl/playbilling/OnboardingPlayBillingFailure;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BillingConfigError extends OnboardingPlayBillingFailure {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/onboarding/impl/playbilling/OnboardingPlayBillingFailure$BillingSetupError;", "Lcom/revolut/feature/onboarding/impl/playbilling/OnboardingPlayBillingFailure;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BillingSetupError extends OnboardingPlayBillingFailure {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/onboarding/impl/playbilling/OnboardingPlayBillingFailure$EmptyBillingCountryCode;", "Lcom/revolut/feature/onboarding/impl/playbilling/OnboardingPlayBillingFailure;", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class EmptyBillingCountryCode extends OnboardingPlayBillingFailure {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/impl/playbilling/OnboardingPlayBillingFailure$ServiceDisconnected;", "Lcom/revolut/feature/onboarding/impl/playbilling/OnboardingPlayBillingFailure;", "<init>", "()V", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ServiceDisconnected extends OnboardingPlayBillingFailure {
        public ServiceDisconnected() {
            super("Billing service disconnected (SERVICE_DISCONNECTED, code=-1)");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/impl/playbilling/OnboardingPlayBillingFailure$SessionReleased;", "Lcom/revolut/feature/onboarding/impl/playbilling/OnboardingPlayBillingFailure;", "<init>", "()V", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SessionReleased extends OnboardingPlayBillingFailure {
        public SessionReleased() {
            super("OnboardingPlayBillingSession released");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/onboarding/impl/playbilling/OnboardingPlayBillingFailure$Timeout;", "Lcom/revolut/feature/onboarding/impl/playbilling/OnboardingPlayBillingFailure;", "<init>", "()V", "feature_retail_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Timeout extends OnboardingPlayBillingFailure {
        public Timeout() {
            super("Play billing operation timed out");
        }
    }

    public OnboardingPlayBillingFailure(String str) {
        super(str, null);
        this.f78521a = str;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.f78521a;
    }
}
