package com.revolut.feature.freelancer.impl.ui.extension;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import mr6.g;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FreelancerAccountClosureControllerModelExtensionImpl$AccountClosureException extends Throwable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/extension/FreelancerAccountClosureControllerModelExtensionImpl$AccountClosureException$Failure;", "Lcom/revolut/feature/freelancer/impl/ui/extension/FreelancerAccountClosureControllerModelExtensionImpl$AccountClosureException;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Failure extends FreelancerAccountClosureControllerModelExtensionImpl$AccountClosureException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f73808a;

        public Failure(g reason) {
            Intrinsics.checkNotNullParameter(reason, "reason");
            this.f73808a = reason;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature/freelancer/impl/ui/extension/FreelancerAccountClosureControllerModelExtensionImpl$AccountClosureException$NegativeBalance;", "Lcom/revolut/feature/freelancer/impl/ui/extension/FreelancerAccountClosureControllerModelExtensionImpl$AccountClosureException;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NegativeBalance extends FreelancerAccountClosureControllerModelExtensionImpl$AccountClosureException {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f73809a;

        public NegativeBalance(String currency) {
            Intrinsics.checkNotNullParameter(currency, "currency");
            this.f73809a = currency;
        }
    }

    private FreelancerAccountClosureControllerModelExtensionImpl$AccountClosureException() {
    }
}
