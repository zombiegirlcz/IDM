package com.revolut.feature.freelancer.api.navigation;

import aii.e;
import android.os.Parcel;
import android.os.Parcelable;
import hr6.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/freelancer/api/navigation/FreelancerBizFeatureDescriptor$AccountRestrictionDescriptor", "", "Laii/q;", "Lhr6/d;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerBizFeatureDescriptor$AccountRestrictionDescriptor implements e, d, Parcelable {

    @NotNull
    public static final Parcelable.Creator<FreelancerBizFeatureDescriptor$AccountRestrictionDescriptor> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lr6.d f73257a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreelancerBizFeatureDescriptor$AccountRestrictionDescriptor(lr6.d.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerBizFeatureDescriptor$AccountRestrictionDescriptor[i];
        }
    }

    public FreelancerBizFeatureDescriptor$AccountRestrictionDescriptor(lr6.d bannerType) {
        Intrinsics.checkNotNullParameter(bannerType, "bannerType");
        this.f73257a = bannerType;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final lr6.d getF73257a() {
        return this.f73257a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof FreelancerBizFeatureDescriptor$AccountRestrictionDescriptor) && this.f73257a == ((FreelancerBizFeatureDescriptor$AccountRestrictionDescriptor) obj2).f73257a;
    }

    public final int hashCode() {
        return this.f73257a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73257a.name());
    }
}
