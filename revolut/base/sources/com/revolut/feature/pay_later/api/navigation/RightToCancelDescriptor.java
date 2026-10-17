package com.revolut.feature.pay_later.api.navigation;

import aii.q;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.ParcelableControllerDescriptor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/pay_later/api/navigation/RightToCancelDescriptor;", "Lcom/revolut/kompot/common/ParcelableControllerDescriptor;", "Laii/q;", "", "toString", "()Ljava/lang/String;", "feature_pay_later_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RightToCancelDescriptor implements ParcelableControllerDescriptor<q> {

    @NotNull
    public static final Parcelable.Creator<RightToCancelDescriptor> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78847a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RightToCancelDescriptor(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RightToCancelDescriptor[i];
        }
    }

    public RightToCancelDescriptor(String facilityId) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        this.f78847a = facilityId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof RightToCancelDescriptor) && Intrinsics.f(this.f78847a, ((RightToCancelDescriptor) obj2).f78847a);
    }

    public final int hashCode() {
        return this.f78847a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f78847a);
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final String getF78847a() {
        return this.f78847a;
    }
}
