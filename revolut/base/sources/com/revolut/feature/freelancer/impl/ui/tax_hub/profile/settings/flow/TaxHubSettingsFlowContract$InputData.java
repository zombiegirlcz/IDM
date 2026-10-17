package com.revolut.feature.freelancer.impl.ui.tax_hub.profile.settings.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import ds6.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/freelancer/impl/ui/tax_hub/profile/settings/flow/TaxHubSettingsFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TaxHubSettingsFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TaxHubSettingsFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f74360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f74361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f74362c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TaxHubSettingsFlowContract$InputData(j.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TaxHubSettingsFlowContract$InputData[i];
        }
    }

    public TaxHubSettingsFlowContract$InputData(j taxType, String str, boolean z) {
        Intrinsics.checkNotNullParameter(taxType, "taxType");
        this.f74360a = taxType;
        this.f74361b = str;
        this.f74362c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TaxHubSettingsFlowContract$InputData)) {
            return false;
        }
        TaxHubSettingsFlowContract$InputData taxHubSettingsFlowContract$InputData = (TaxHubSettingsFlowContract$InputData) obj2;
        return this.f74360a == taxHubSettingsFlowContract$InputData.f74360a && Intrinsics.f(this.f74361b, taxHubSettingsFlowContract$InputData.f74361b) && this.f74362c == taxHubSettingsFlowContract$InputData.f74362c;
    }

    public final int hashCode() {
        int iHashCode = this.f74360a.hashCode() * 31;
        String str = this.f74361b;
        return Boolean.hashCode(this.f74362c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f74360a.name());
        dest.writeString(this.f74361b);
        dest.writeInt(this.f74362c ? 1 : 0);
    }
}
