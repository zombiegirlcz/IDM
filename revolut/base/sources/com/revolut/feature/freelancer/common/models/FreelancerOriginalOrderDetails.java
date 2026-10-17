package com.revolut.feature.freelancer.common.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lr6.k;
import lr6.r;
import lr6.s;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/FreelancerOriginalOrderDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerOriginalOrderDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FreelancerOriginalOrderDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f73319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f73320c;
    public final r d;
    public final k e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreelancerOriginalOrderDetails(parcel.readString(), parcel.readString(), s.valueOf(parcel.readString()), r.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : k.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerOriginalOrderDetails[i];
        }
    }

    public FreelancerOriginalOrderDetails(String id10, String str, s type, r state, k kVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f73318a = id10;
        this.f73319b = str;
        this.f73320c = type;
        this.d = state;
        this.e = kVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerOriginalOrderDetails)) {
            return false;
        }
        FreelancerOriginalOrderDetails freelancerOriginalOrderDetails = (FreelancerOriginalOrderDetails) obj2;
        return Intrinsics.f(this.f73318a, freelancerOriginalOrderDetails.f73318a) && Intrinsics.f(this.f73319b, freelancerOriginalOrderDetails.f73319b) && this.f73320c == freelancerOriginalOrderDetails.f73320c && this.d == freelancerOriginalOrderDetails.d && this.e == freelancerOriginalOrderDetails.e;
    }

    public final int hashCode() {
        int iHashCode = this.f73318a.hashCode() * 31;
        String str = this.f73319b;
        int iHashCode2 = (this.d.hashCode() + ((this.f73320c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        k kVar = this.e;
        return iHashCode2 + (kVar != null ? kVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73318a);
        dest.writeString(this.f73319b);
        dest.writeString(this.f73320c.name());
        dest.writeString(this.d.name());
        k kVar = this.e;
        if (kVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(kVar.name());
        }
    }
}
