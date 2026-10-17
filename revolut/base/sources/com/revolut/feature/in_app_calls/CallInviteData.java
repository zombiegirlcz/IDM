package com.revolut.feature.in_app_calls;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/in_app_calls/CallInviteData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_in_app_calls_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CallInviteData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CallInviteData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f74775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f74776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f74777c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CallInviteData(parcel.readString(), parcel.readString(), (UUID) parcel.readSerializable(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CallInviteData[i];
        }
    }

    public CallInviteData(String str, String str2, UUID uuid, String str3) {
        this.f74775a = uuid;
        this.f74776b = str;
        this.f74777c = str2;
        this.d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CallInviteData)) {
            return false;
        }
        CallInviteData callInviteData = (CallInviteData) obj2;
        return Intrinsics.f(this.f74775a, callInviteData.f74775a) && Intrinsics.f(this.f74776b, callInviteData.f74776b) && Intrinsics.f(this.f74777c, callInviteData.f74777c) && Intrinsics.f(this.d, callInviteData.d);
    }

    public final int hashCode() {
        UUID uuid = this.f74775a;
        int iHashCode = (uuid == null ? 0 : uuid.hashCode()) * 31;
        String str = this.f74776b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f74777c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f74775a);
        dest.writeString(this.f74776b);
        dest.writeString(this.f74777c);
        dest.writeString(this.d);
    }
}
