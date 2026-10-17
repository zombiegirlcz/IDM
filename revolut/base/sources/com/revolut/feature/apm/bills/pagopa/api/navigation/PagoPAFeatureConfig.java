package com.revolut.feature.apm.bills.pagopa.api.navigation;

import com.revolut.feature.apm.bills.pagopa.api.models.PagoPABill;
import com.revolut.feature.apm.bills.pagopa.api.navigation.PagoPAFlowDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/bills/pagopa/api/navigation/PagoPAFeatureConfig;", "Lcom/revolut/kompot/bridge/navigation/KompotBridgeFeatureConfig;", "BillConfirmation", "BillManualInput", "Lcom/revolut/feature/apm/bills/pagopa/api/navigation/PagoPAFeatureConfig$BillConfirmation;", "Lcom/revolut/feature/apm/bills/pagopa/api/navigation/PagoPAFeatureConfig$BillManualInput;", "feature_apm_bills_pagopa_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PagoPAFeatureConfig extends KompotBridgeFeatureConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/bills/pagopa/api/navigation/PagoPAFeatureConfig$BillConfirmation;", "Lcom/revolut/feature/apm/bills/pagopa/api/navigation/PagoPAFeatureConfig;", "", "toString", "()Ljava/lang/String;", "feature_apm_bills_pagopa_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BillConfirmation extends PagoPAFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final PagoPABill f61480g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BillConfirmation(PagoPABill bill) {
            super(new PagoPAFlowDestination(new PagoPAFlowDestination.StartType.BillConfirmation(bill)));
            Intrinsics.checkNotNullParameter(bill, "bill");
            this.f61480g = bill;
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof BillConfirmation) && Intrinsics.f(this.f61480g, ((BillConfirmation) obj2).f61480g);
        }

        @Override // com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
        public final int hashCode() {
            return this.f61480g.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/apm/bills/pagopa/api/navigation/PagoPAFeatureConfig$BillManualInput;", "Lcom/revolut/feature/apm/bills/pagopa/api/navigation/PagoPAFeatureConfig;", "<init>", "()V", "feature_apm_bills_pagopa_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class BillManualInput extends PagoPAFeatureConfig {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final BillManualInput f61481g = new BillManualInput();

        private BillManualInput() {
            super(new PagoPAFlowDestination(PagoPAFlowDestination.StartType.BillManualInput.f61485a));
        }
    }

    public PagoPAFeatureConfig(PagoPAFlowDestination pagoPAFlowDestination) {
        super((ActivityAnimation) null, (ParcelableDestination) pagoPAFlowDestination, false, (Integer) null, 0, 37);
    }
}
