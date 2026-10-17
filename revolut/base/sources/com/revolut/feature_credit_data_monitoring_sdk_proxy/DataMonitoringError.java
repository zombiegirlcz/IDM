package com.revolut.feature_credit_data_monitoring_sdk_proxy;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/revolut/feature_credit_data_monitoring_sdk_proxy/DataMonitoringError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "SdkError", "SdkDisabled", "InvalidStateError", "Lcom/revolut/feature_credit_data_monitoring_sdk_proxy/DataMonitoringError$InvalidStateError;", "Lcom/revolut/feature_credit_data_monitoring_sdk_proxy/DataMonitoringError$SdkDisabled;", "Lcom/revolut/feature_credit_data_monitoring_sdk_proxy/DataMonitoringError$SdkError;", "feature_credit_data_monitoring_sdk_proxy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class DataMonitoringError extends Exception {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature_credit_data_monitoring_sdk_proxy/DataMonitoringError$InvalidStateError;", "Lcom/revolut/feature_credit_data_monitoring_sdk_proxy/DataMonitoringError;", "<init>", "()V", "feature_credit_data_monitoring_sdk_proxy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InvalidStateError extends DataMonitoringError {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InvalidStateError f96651a = new InvalidStateError();

        private InvalidStateError() {
            super("Operation attempted in invalid state", null);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature_credit_data_monitoring_sdk_proxy/DataMonitoringError$SdkDisabled;", "Lcom/revolut/feature_credit_data_monitoring_sdk_proxy/DataMonitoringError;", "feature_credit_data_monitoring_sdk_proxy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SdkDisabled extends DataMonitoringError {
        public SdkDisabled() {
            this(null);
        }

        public SdkDisabled(Exception exc2) {
            super("Monitoring SDK is not installed", exc2);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/revolut/feature_credit_data_monitoring_sdk_proxy/DataMonitoringError$SdkError;", "Lcom/revolut/feature_credit_data_monitoring_sdk_proxy/DataMonitoringError;", "feature_credit_data_monitoring_sdk_proxy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SdkError extends DataMonitoringError {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SdkError(Throwable cause) {
            super("Monitoring SDK failed", cause);
            Intrinsics.checkNotNullParameter(cause, "cause");
        }
    }
}
