package com.revolut.feature.onboarding.api.user_under_18;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/onboarding/api/user_under_18/UserUnder18Data;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_onboarding_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserUnder18Data implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<UserUnder18Data> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f78230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f78231b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UserUnder18Data(parcel.readInt() != 0, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UserUnder18Data[i];
        }
    }

    public UserUnder18Data(boolean z, int i) {
        this.f78230a = z;
        this.f78231b = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UserUnder18Data)) {
            return false;
        }
        UserUnder18Data userUnder18Data = (UserUnder18Data) obj2;
        return this.f78230a == userUnder18Data.f78230a && this.f78231b == userUnder18Data.f78231b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f78231b) + (Boolean.hashCode(this.f78230a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f78230a ? 1 : 0);
        dest.writeInt(this.f78231b);
    }
}
