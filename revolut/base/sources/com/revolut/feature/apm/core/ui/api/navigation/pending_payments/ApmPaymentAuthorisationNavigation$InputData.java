package com.revolut.feature.apm.core.ui.api.navigation.pending_payments;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.apm.core.api.product.ApmProduct;
import com.revolut.feature.apm.core.models.payments_authorisations.ApmPaymentAuthorisationPendingAction;
import com.revolut.feature.apm.core.models.payments_authorisations.ui.ApmPaymentAuthorisationUi;
import com.revolut.feature.apm.core.models.transfers.ApmPaymentMethod;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/apm/core/ui/api/navigation/pending_payments/ApmPaymentAuthorisationNavigation$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ApmPaymentAuthorisationNavigation$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ApmPaymentAuthorisationNavigation$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmProduct f62315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ApmPaymentMethod f62316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ApmPaymentAuthorisationPendingAction f62317c;
    public final ApmPaymentAuthorisationUi d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApmPaymentAuthorisationNavigation$InputData((ApmProduct) parcel.readParcelable(ApmPaymentAuthorisationNavigation$InputData.class.getClassLoader()), (ApmPaymentMethod) parcel.readParcelable(ApmPaymentAuthorisationNavigation$InputData.class.getClassLoader()), (ApmPaymentAuthorisationPendingAction) parcel.readParcelable(ApmPaymentAuthorisationNavigation$InputData.class.getClassLoader()), (ApmPaymentAuthorisationUi) parcel.readParcelable(ApmPaymentAuthorisationNavigation$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ApmPaymentAuthorisationNavigation$InputData[i];
        }
    }

    public ApmPaymentAuthorisationNavigation$InputData(ApmProduct apmProduct, ApmPaymentMethod apmPaymentMethod, ApmPaymentAuthorisationPendingAction pendingPayment, ApmPaymentAuthorisationUi uiConfig) {
        Intrinsics.checkNotNullParameter(apmProduct, "apmProduct");
        Intrinsics.checkNotNullParameter(apmPaymentMethod, "apmPaymentMethod");
        Intrinsics.checkNotNullParameter(pendingPayment, "pendingPayment");
        Intrinsics.checkNotNullParameter(uiConfig, "uiConfig");
        this.f62315a = apmProduct;
        this.f62316b = apmPaymentMethod;
        this.f62317c = pendingPayment;
        this.d = uiConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ApmPaymentAuthorisationNavigation$InputData)) {
            return false;
        }
        ApmPaymentAuthorisationNavigation$InputData apmPaymentAuthorisationNavigation$InputData = (ApmPaymentAuthorisationNavigation$InputData) obj2;
        return Intrinsics.f(this.f62315a, apmPaymentAuthorisationNavigation$InputData.f62315a) && Intrinsics.f(this.f62316b, apmPaymentAuthorisationNavigation$InputData.f62316b) && Intrinsics.f(this.f62317c, apmPaymentAuthorisationNavigation$InputData.f62317c) && Intrinsics.f(this.d, apmPaymentAuthorisationNavigation$InputData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f62317c.hashCode() + ((this.f62316b.hashCode() + (this.f62315a.hashCode() * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f62315a, i);
        dest.writeParcelable(this.f62316b, i);
        dest.writeParcelable(this.f62317c, i);
        dest.writeParcelable(this.d, i);
    }
}
