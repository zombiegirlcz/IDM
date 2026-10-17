package com.revolut.feature.credit.help.api.navigation.self_service;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import ft3.j1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/help/api/navigation/self_service/ForbearanceSelfServiceInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_help_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ForbearanceSelfServiceInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ForbearanceSelfServiceInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j1 f70005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f70006b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ForbearanceSelfServiceInputData(j1.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ForbearanceSelfServiceInputData[i];
        }
    }

    public ForbearanceSelfServiceInputData(j1 productType, String originalFacilityId) {
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(originalFacilityId, "originalFacilityId");
        this.f70005a = productType;
        this.f70006b = originalFacilityId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ForbearanceSelfServiceInputData)) {
            return false;
        }
        ForbearanceSelfServiceInputData forbearanceSelfServiceInputData = (ForbearanceSelfServiceInputData) obj2;
        return this.f70005a == forbearanceSelfServiceInputData.f70005a && Intrinsics.f(this.f70006b, forbearanceSelfServiceInputData.f70006b);
    }

    public final int hashCode() {
        return this.f70006b.hashCode() + (this.f70005a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f70005a.name());
        dest.writeString(this.f70006b);
    }
}
