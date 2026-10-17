package com.revolut.feature.credit.card.impl.ui.autopay.flow.settings;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/impl/ui/autopay/flow/settings/CreditCardAutopaySettingsFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardAutopaySettingsFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CreditCardAutopaySettingsFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tp4.a f69040b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditCardAutopaySettingsFlowContract$InputData(parcel.readString(), tp4.a.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardAutopaySettingsFlowContract$InputData[i];
        }
    }

    public CreditCardAutopaySettingsFlowContract$InputData(String facilityId, tp4.a closeNavigationType) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(closeNavigationType, "closeNavigationType");
        this.f69039a = facilityId;
        this.f69040b = closeNavigationType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardAutopaySettingsFlowContract$InputData)) {
            return false;
        }
        CreditCardAutopaySettingsFlowContract$InputData creditCardAutopaySettingsFlowContract$InputData = (CreditCardAutopaySettingsFlowContract$InputData) obj2;
        return Intrinsics.f(this.f69039a, creditCardAutopaySettingsFlowContract$InputData.f69039a) && this.f69040b == creditCardAutopaySettingsFlowContract$InputData.f69040b;
    }

    public final int hashCode() {
        return this.f69040b.hashCode() + (this.f69039a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f69039a);
        dest.writeString(this.f69040b.name());
    }
}
