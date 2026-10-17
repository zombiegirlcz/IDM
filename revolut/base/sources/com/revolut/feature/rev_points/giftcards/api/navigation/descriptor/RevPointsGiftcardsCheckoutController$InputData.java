package com.revolut.feature.rev_points.giftcards.api.navigation.descriptor;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.models.RevPoints;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/rev_points/giftcards/api/navigation/descriptor/RevPointsGiftcardsCheckoutController$InputData", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_giftcards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevPointsGiftcardsCheckoutController$InputData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RevPointsGiftcardsCheckoutController$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f83668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f83669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RevPoints f83670c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevPointsGiftcardsCheckoutController$InputData(parcel.readString(), parcel.readString(), (RevPoints) parcel.readParcelable(RevPointsGiftcardsCheckoutController$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsGiftcardsCheckoutController$InputData[i];
        }
    }

    public RevPointsGiftcardsCheckoutController$InputData(String voucherGroupId, String selectedVoucherId, RevPoints selectedVoucherPointsAmount) {
        Intrinsics.checkNotNullParameter(voucherGroupId, "voucherGroupId");
        Intrinsics.checkNotNullParameter(selectedVoucherId, "selectedVoucherId");
        Intrinsics.checkNotNullParameter(selectedVoucherPointsAmount, "selectedVoucherPointsAmount");
        this.f83668a = voucherGroupId;
        this.f83669b = selectedVoucherId;
        this.f83670c = selectedVoucherPointsAmount;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevPointsGiftcardsCheckoutController$InputData)) {
            return false;
        }
        RevPointsGiftcardsCheckoutController$InputData revPointsGiftcardsCheckoutController$InputData = (RevPointsGiftcardsCheckoutController$InputData) obj2;
        return Intrinsics.f(this.f83668a, revPointsGiftcardsCheckoutController$InputData.f83668a) && Intrinsics.f(this.f83669b, revPointsGiftcardsCheckoutController$InputData.f83669b) && Intrinsics.f(this.f83670c, revPointsGiftcardsCheckoutController$InputData.f83670c);
    }

    public final int hashCode() {
        return this.f83670c.f83960a.hashCode() + p.a.c(this.f83668a.hashCode() * 31, 31, this.f83669b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f83668a);
        dest.writeString(this.f83669b);
        dest.writeParcelable(this.f83670c, i);
    }
}
