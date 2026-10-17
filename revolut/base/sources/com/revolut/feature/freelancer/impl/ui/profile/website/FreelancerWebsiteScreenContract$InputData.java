package com.revolut.feature.freelancer.impl.ui.profile.website;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/freelancer/impl/ui/profile/website/FreelancerWebsiteScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerWebsiteScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<FreelancerWebsiteScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gs6.a f74076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f74077c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreelancerWebsiteScreenContract$InputData(parcel.readString(), gs6.a.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerWebsiteScreenContract$InputData[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FreelancerWebsiteScreenContract$InputData() {
        this(null, 0 == true ? 1 : 0, false, 7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerWebsiteScreenContract$InputData)) {
            return false;
        }
        FreelancerWebsiteScreenContract$InputData freelancerWebsiteScreenContract$InputData = (FreelancerWebsiteScreenContract$InputData) obj2;
        return Intrinsics.f(this.f74075a, freelancerWebsiteScreenContract$InputData.f74075a) && this.f74076b == freelancerWebsiteScreenContract$InputData.f74076b && this.f74077c == freelancerWebsiteScreenContract$InputData.f74077c;
    }

    public final int hashCode() {
        String str = this.f74075a;
        return Boolean.hashCode(this.f74077c) + ((this.f74076b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f74075a);
        dest.writeString(this.f74076b.name());
        dest.writeInt(this.f74077c ? 1 : 0);
    }

    public FreelancerWebsiteScreenContract$InputData(String str, gs6.a urlVerificationMode, boolean z) {
        Intrinsics.checkNotNullParameter(urlVerificationMode, "urlVerificationMode");
        this.f74075a = str;
        this.f74076b = urlVerificationMode;
        this.f74077c = z;
    }

    public /* synthetic */ FreelancerWebsiteScreenContract$InputData(String str, gs6.a aVar, boolean z, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? gs6.a.REGULAR : aVar, (i & 4) != 0 ? false : z);
    }
}
