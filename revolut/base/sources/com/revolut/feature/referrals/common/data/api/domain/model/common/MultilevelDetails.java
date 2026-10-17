package com.revolut.feature.referrals.common.data.api.domain.model.common;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/referrals/common/data/api/domain/model/common/MultilevelDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_referrals_common_data_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MultilevelDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MultilevelDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MultilevelDetailsInfo f81747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MultilevelDetailsInfo f81748b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Parcelable.Creator<MultilevelDetailsInfo> creator = MultilevelDetailsInfo.CREATOR;
            return new MultilevelDetails(creator.createFromParcel(parcel), creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MultilevelDetails[i];
        }
    }

    public MultilevelDetails(MultilevelDetailsInfo banner, MultilevelDetailsInfo modal) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(modal, "modal");
        this.f81747a = banner;
        this.f81748b = modal;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof MultilevelDetails)) {
            return false;
        }
        MultilevelDetails multilevelDetails = (MultilevelDetails) obj2;
        return Intrinsics.f(this.f81747a, multilevelDetails.f81747a) && Intrinsics.f(this.f81748b, multilevelDetails.f81748b);
    }

    public final int hashCode() {
        return this.f81748b.hashCode() + (this.f81747a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f81747a.writeToParcel(dest, i);
        this.f81748b.writeToParcel(dest, i);
    }
}
