package com.revolut.feature.kyc.impl.trustdock.icchip.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/kyc/impl/trustdock/icchip/screen/TrustdockIcChipScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TrustdockIcChipScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TrustdockIcChipScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77884b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TrustdockIcChipScreenContract$InputData(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TrustdockIcChipScreenContract$InputData[i];
        }
    }

    public TrustdockIcChipScreenContract$InputData(String packageId, String projectId) {
        Intrinsics.checkNotNullParameter(packageId, "packageId");
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        this.f77883a = packageId;
        this.f77884b = projectId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TrustdockIcChipScreenContract$InputData)) {
            return false;
        }
        TrustdockIcChipScreenContract$InputData trustdockIcChipScreenContract$InputData = (TrustdockIcChipScreenContract$InputData) obj2;
        return Intrinsics.f(this.f77883a, trustdockIcChipScreenContract$InputData.f77883a) && Intrinsics.f(this.f77884b, trustdockIcChipScreenContract$InputData.f77884b);
    }

    public final int hashCode() {
        return this.f77884b.hashCode() + (this.f77883a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f77883a);
        dest.writeString(this.f77884b);
    }
}
