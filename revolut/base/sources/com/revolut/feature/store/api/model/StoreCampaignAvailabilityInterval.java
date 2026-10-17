package com.revolut.feature.store.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/store/api/model/StoreCampaignAvailabilityInterval;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_store_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StoreCampaignAvailabilityInterval implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StoreCampaignAvailabilityInterval> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f88435c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StoreCampaignAvailabilityInterval(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoreCampaignAvailabilityInterval[i];
        }
    }

    public StoreCampaignAvailabilityInterval(String start, String end2, boolean z) {
        Intrinsics.checkNotNullParameter(start, "start");
        Intrinsics.checkNotNullParameter(end2, "end");
        this.f88433a = start;
        this.f88434b = end2;
        this.f88435c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof StoreCampaignAvailabilityInterval)) {
            return false;
        }
        StoreCampaignAvailabilityInterval storeCampaignAvailabilityInterval = (StoreCampaignAvailabilityInterval) obj2;
        return Intrinsics.f(this.f88433a, storeCampaignAvailabilityInterval.f88433a) && Intrinsics.f(this.f88434b, storeCampaignAvailabilityInterval.f88434b) && this.f88435c == storeCampaignAvailabilityInterval.f88435c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f88435c) + p.a.c(this.f88433a.hashCode() * 31, 31, this.f88434b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f88433a);
        dest.writeString(this.f88434b);
        dest.writeInt(this.f88435c ? 1 : 0);
    }
}
