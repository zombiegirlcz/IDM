package com.revolut.feature.freelancer.impl.network.errorhandling;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0005\u0005\u0006\u0007\b\tB\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0005\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/revolut/feature/freelancer/impl/network/errorhandling/FreelancerServerError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<init>", "()V", "PendingOnboarding", "PendingPreOnboarding", "NoMerchantFound", "InvoiceNumberTaken", "AccountClosurePrerequisitesNotMet", "Lcom/revolut/feature/freelancer/impl/network/errorhandling/FreelancerServerError$AccountClosurePrerequisitesNotMet;", "Lcom/revolut/feature/freelancer/impl/network/errorhandling/FreelancerServerError$InvoiceNumberTaken;", "Lcom/revolut/feature/freelancer/impl/network/errorhandling/FreelancerServerError$NoMerchantFound;", "Lcom/revolut/feature/freelancer/impl/network/errorhandling/FreelancerServerError$PendingOnboarding;", "Lcom/revolut/feature/freelancer/impl/network/errorhandling/FreelancerServerError$PendingPreOnboarding;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class FreelancerServerError extends Exception {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/freelancer/impl/network/errorhandling/FreelancerServerError$AccountClosurePrerequisitesNotMet;", "Lcom/revolut/feature/freelancer/impl/network/errorhandling/FreelancerServerError;", "", "toString", "()Ljava/lang/String;", "com/revolut/feature/freelancer/impl/network/errorhandling/a", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AccountClosurePrerequisitesNotMet extends FreelancerServerError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f73533a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final jo3.a f73534b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Long f73535c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AccountClosurePrerequisitesNotMet(a reason, jo3.a aVar, Long l2) {
            super(0);
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.f73533a = reason;
            this.f73534b = aVar;
            this.f73535c = l2;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AccountClosurePrerequisitesNotMet)) {
                return false;
            }
            AccountClosurePrerequisitesNotMet accountClosurePrerequisitesNotMet = (AccountClosurePrerequisitesNotMet) obj2;
            return this.f73533a == accountClosurePrerequisitesNotMet.f73533a && Intrinsics.f(this.f73534b, accountClosurePrerequisitesNotMet.f73534b) && Intrinsics.f(this.f73535c, accountClosurePrerequisitesNotMet.f73535c);
        }

        public final int hashCode() {
            int iHashCode = this.f73533a.hashCode() * 31;
            jo3.a aVar = this.f73534b;
            int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            Long l2 = this.f73535c;
            return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/impl/network/errorhandling/FreelancerServerError$InvoiceNumberTaken;", "Lcom/revolut/feature/freelancer/impl/network/errorhandling/FreelancerServerError;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InvoiceNumberTaken extends FreelancerServerError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73536a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f73537b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f73538c;

        public InvoiceNumberTaken() {
            this(null, null, null);
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof InvoiceNumberTaken)) {
                return false;
            }
            InvoiceNumberTaken invoiceNumberTaken = (InvoiceNumberTaken) obj2;
            return Intrinsics.f(this.f73536a, invoiceNumberTaken.f73536a) && Intrinsics.f(this.f73537b, invoiceNumberTaken.f73537b) && Intrinsics.f(this.f73538c, invoiceNumberTaken.f73538c);
        }

        public final int hashCode() {
            String str = this.f73536a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f73537b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f73538c;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public InvoiceNumberTaken(String str, String str2, String str3) {
            super(0);
            this.f73536a = str;
            this.f73537b = str2;
            this.f73538c = str3;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/network/errorhandling/FreelancerServerError$NoMerchantFound;", "Lcom/revolut/feature/freelancer/impl/network/errorhandling/FreelancerServerError;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NoMerchantFound extends FreelancerServerError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NoMerchantFound f73539a = new NoMerchantFound();

        private NoMerchantFound() {
            super(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/network/errorhandling/FreelancerServerError$PendingOnboarding;", "Lcom/revolut/feature/freelancer/impl/network/errorhandling/FreelancerServerError;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PendingOnboarding extends FreelancerServerError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PendingOnboarding f73540a = new PendingOnboarding();

        private PendingOnboarding() {
            super(0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/freelancer/impl/network/errorhandling/FreelancerServerError$PendingPreOnboarding;", "Lcom/revolut/feature/freelancer/impl/network/errorhandling/FreelancerServerError;", "<init>", "()V", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class PendingPreOnboarding extends FreelancerServerError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final PendingPreOnboarding f73541a = new PendingPreOnboarding();

        private PendingPreOnboarding() {
            super(0);
        }
    }

    public /* synthetic */ FreelancerServerError(int i) {
        this();
    }

    private FreelancerServerError() {
    }
}
