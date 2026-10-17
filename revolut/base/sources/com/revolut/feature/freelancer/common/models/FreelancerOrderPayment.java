package com.revolut.feature.freelancer.common.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lr6.p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/FreelancerOrderPayment;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "lr6/p", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerOrderPayment implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FreelancerOrderPayment> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f73309b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreelancerOrderPayment(parcel.readString(), p.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerOrderPayment[i];
        }
    }

    public FreelancerOrderPayment(String id10, p state) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f73308a = id10;
        this.f73309b = state;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerOrderPayment)) {
            return false;
        }
        FreelancerOrderPayment freelancerOrderPayment = (FreelancerOrderPayment) obj2;
        return Intrinsics.f(this.f73308a, freelancerOrderPayment.f73308a) && this.f73309b == freelancerOrderPayment.f73309b;
    }

    public final int hashCode() {
        return this.f73309b.hashCode() + (this.f73308a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73308a);
        dest.writeString(this.f73309b.name());
    }
}
