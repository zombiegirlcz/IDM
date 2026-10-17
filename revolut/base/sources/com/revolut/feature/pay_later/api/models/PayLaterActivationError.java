package com.revolut.feature.pay_later.api.models;

import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\b\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\b\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/revolut/feature/pay_later/api/models/PayLaterActivationError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "Cancelled", "Terminated", "Outstanding", "Overdue", "UnknownError", "FacilityNotCreated", "NoEligibleCards", "MaxPurchaseAmountTooLow", "Lcom/revolut/feature/pay_later/api/models/PayLaterActivationError$Cancelled;", "Lcom/revolut/feature/pay_later/api/models/PayLaterActivationError$FacilityNotCreated;", "Lcom/revolut/feature/pay_later/api/models/PayLaterActivationError$MaxPurchaseAmountTooLow;", "Lcom/revolut/feature/pay_later/api/models/PayLaterActivationError$NoEligibleCards;", "Lcom/revolut/feature/pay_later/api/models/PayLaterActivationError$Outstanding;", "Lcom/revolut/feature/pay_later/api/models/PayLaterActivationError$Overdue;", "Lcom/revolut/feature/pay_later/api/models/PayLaterActivationError$Terminated;", "Lcom/revolut/feature/pay_later/api/models/PayLaterActivationError$UnknownError;", "feature_pay_later_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PayLaterActivationError extends Exception {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pay_later/api/models/PayLaterActivationError$Cancelled;", "Lcom/revolut/feature/pay_later/api/models/PayLaterActivationError;", "<init>", "()V", "feature_pay_later_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Cancelled extends PayLaterActivationError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Cancelled f78808a = new Cancelled();

        private Cancelled() {
            super(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pay_later/api/models/PayLaterActivationError$FacilityNotCreated;", "Lcom/revolut/feature/pay_later/api/models/PayLaterActivationError;", "<init>", "()V", "feature_pay_later_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class FacilityNotCreated extends PayLaterActivationError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final FacilityNotCreated f78809a = new FacilityNotCreated();

        private FacilityNotCreated() {
            super(0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pay_later/api/models/PayLaterActivationError$MaxPurchaseAmountTooLow;", "Lcom/revolut/feature/pay_later/api/models/PayLaterActivationError;", "", "toString", "()Ljava/lang/String;", "feature_pay_later_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MaxPurchaseAmountTooLow extends PayLaterActivationError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f78810a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MaxPurchaseAmountTooLow(d minAmount) {
            super(0);
            Intrinsics.checkNotNullParameter(minAmount, "minAmount");
            this.f78810a = minAmount;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MaxPurchaseAmountTooLow) && Intrinsics.f(this.f78810a, ((MaxPurchaseAmountTooLow) obj2).f78810a);
        }

        public final int hashCode() {
            return this.f78810a.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pay_later/api/models/PayLaterActivationError$NoEligibleCards;", "Lcom/revolut/feature/pay_later/api/models/PayLaterActivationError;", "<init>", "()V", "feature_pay_later_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NoEligibleCards extends PayLaterActivationError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NoEligibleCards f78811a = new NoEligibleCards();

        private NoEligibleCards() {
            super(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pay_later/api/models/PayLaterActivationError$Outstanding;", "Lcom/revolut/feature/pay_later/api/models/PayLaterActivationError;", "<init>", "()V", "feature_pay_later_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Outstanding extends PayLaterActivationError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Outstanding f78812a = new Outstanding();

        private Outstanding() {
            super(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pay_later/api/models/PayLaterActivationError$Overdue;", "Lcom/revolut/feature/pay_later/api/models/PayLaterActivationError;", "<init>", "()V", "feature_pay_later_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Overdue extends PayLaterActivationError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Overdue f78813a = new Overdue();

        private Overdue() {
            super(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pay_later/api/models/PayLaterActivationError$Terminated;", "Lcom/revolut/feature/pay_later/api/models/PayLaterActivationError;", "<init>", "()V", "feature_pay_later_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Terminated extends PayLaterActivationError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Terminated f78814a = new Terminated();

        private Terminated() {
            super(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pay_later/api/models/PayLaterActivationError$UnknownError;", "Lcom/revolut/feature/pay_later/api/models/PayLaterActivationError;", "<init>", "()V", "feature_pay_later_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UnknownError extends PayLaterActivationError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UnknownError f78815a = new UnknownError();

        private UnknownError() {
            super(0);
        }
    }

    public /* synthetic */ PayLaterActivationError(int i) {
        this();
    }

    private PayLaterActivationError() {
    }
}
