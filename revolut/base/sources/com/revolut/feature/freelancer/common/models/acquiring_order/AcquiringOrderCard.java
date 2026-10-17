package com.revolut.feature.freelancer.common.models.acquiring_order;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/acquiring_order/AcquiringOrderCard;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AcquiringOrderCard implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f73344b;

    @NotNull
    public static final Parcelable.Creator<AcquiringOrderCard> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AcquiringOrderCard(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AcquiringOrderCard[i];
        }
    }

    public AcquiringOrderCard(String str, String lastFour) {
        Intrinsics.checkNotNullParameter(lastFour, "lastFour");
        this.f73343a = str;
        this.f73344b = lastFour;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AcquiringOrderCard)) {
            return false;
        }
        AcquiringOrderCard acquiringOrderCard = (AcquiringOrderCard) obj2;
        return Intrinsics.f(this.f73343a, acquiringOrderCard.f73343a) && Intrinsics.f(this.f73344b, acquiringOrderCard.f73344b);
    }

    public final int hashCode() {
        String str = this.f73343a;
        return this.f73344b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73343a);
        dest.writeString(this.f73344b);
    }
}
