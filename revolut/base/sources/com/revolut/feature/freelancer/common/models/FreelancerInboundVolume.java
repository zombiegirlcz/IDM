package com.revolut.feature.freelancer.common.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m72.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/FreelancerInboundVolume;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerInboundVolume implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FreelancerInboundVolume> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f73286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f73287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f73288c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreelancerInboundVolume(parcel.readString(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerInboundVolume[i];
        }
    }

    public FreelancerInboundVolume(String currency, Long l2, Long l3) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f73286a = l2;
        this.f73287b = l3;
        this.f73288c = currency;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerInboundVolume)) {
            return false;
        }
        FreelancerInboundVolume freelancerInboundVolume = (FreelancerInboundVolume) obj2;
        return Intrinsics.f(this.f73286a, freelancerInboundVolume.f73286a) && Intrinsics.f(this.f73287b, freelancerInboundVolume.f73287b) && Intrinsics.f(this.f73288c, freelancerInboundVolume.f73288c);
    }

    public final int hashCode() {
        Long l2 = this.f73286a;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        Long l3 = this.f73287b;
        return this.f73288c.hashCode() + ((iHashCode + (l3 != null ? l3.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Long l2 = this.f73286a;
        if (l2 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l2);
        }
        Long l3 = this.f73287b;
        if (l3 == null) {
            dest.writeInt(0);
        } else {
            b.A(dest, 1, l3);
        }
        dest.writeString(this.f73288c);
    }
}
