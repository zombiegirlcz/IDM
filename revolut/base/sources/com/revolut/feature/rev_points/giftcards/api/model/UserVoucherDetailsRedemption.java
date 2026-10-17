package com.revolut.feature.rev_points.giftcards.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/giftcards/api/model/UserVoucherDetailsRedemption;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_giftcards_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserVoucherDetailsRedemption implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UserVoucherDetailsRedemption> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f83636a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f83637b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f83638c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UserVoucherDetailsRedemption(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UserVoucherDetailsRedemption[i];
        }
    }

    public UserVoucherDetailsRedemption(String str, String str2, String str3) {
        this.f83636a = str;
        this.f83637b = str2;
        this.f83638c = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UserVoucherDetailsRedemption)) {
            return false;
        }
        UserVoucherDetailsRedemption userVoucherDetailsRedemption = (UserVoucherDetailsRedemption) obj2;
        return Intrinsics.f(this.f83636a, userVoucherDetailsRedemption.f83636a) && Intrinsics.f(this.f83637b, userVoucherDetailsRedemption.f83637b) && Intrinsics.f(this.f83638c, userVoucherDetailsRedemption.f83638c);
    }

    public final int hashCode() {
        String str = this.f83636a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f83637b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f83638c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f83636a);
        dest.writeString(this.f83637b);
        dest.writeString(this.f83638c);
    }
}
