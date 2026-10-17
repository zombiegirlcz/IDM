package com.revolut.feature.freelancer.common.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/FreelancerAccountClosure;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerAccountClosure implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FreelancerAccountClosure> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FreelancerAccountClosureState f73265a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreelancerAccountClosure((FreelancerAccountClosureState) parcel.readParcelable(FreelancerAccountClosure.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerAccountClosure[i];
        }
    }

    public FreelancerAccountClosure(FreelancerAccountClosureState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.f73265a = state;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof FreelancerAccountClosure) && Intrinsics.f(this.f73265a, ((FreelancerAccountClosure) obj2).f73265a);
    }

    public final int hashCode() {
        return this.f73265a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f73265a, i);
    }
}
