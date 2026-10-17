package com.revolut.feature.profile.impl.ui.details.email.check_inbox;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/profile/impl/ui/details/email/check_inbox/CheckInboxScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "retail_feature_profile_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CheckInboxScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CheckInboxScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f81390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81391b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CheckInboxScreenContract$InputData(parcel.readLong(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CheckInboxScreenContract$InputData[i];
        }
    }

    public CheckInboxScreenContract$InputData(long j2, String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        this.f81390a = j2;
        this.f81391b = email;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CheckInboxScreenContract$InputData)) {
            return false;
        }
        CheckInboxScreenContract$InputData checkInboxScreenContract$InputData = (CheckInboxScreenContract$InputData) obj2;
        return this.f81390a == checkInboxScreenContract$InputData.f81390a && Intrinsics.f(this.f81391b, checkInboxScreenContract$InputData.f81391b);
    }

    public final int hashCode() {
        return this.f81391b.hashCode() + (Long.hashCode(this.f81390a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f81390a);
        dest.writeString(this.f81391b);
    }
}
