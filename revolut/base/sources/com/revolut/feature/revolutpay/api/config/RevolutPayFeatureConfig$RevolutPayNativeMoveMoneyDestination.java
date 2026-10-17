package com.revolut.feature.revolutpay.api.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u6c.l;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/revolutpay/api/config/RevolutPayFeatureConfig$RevolutPayNativeMoveMoneyDestination", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevolutPayFeatureConfig$RevolutPayNativeMoveMoneyDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<RevolutPayFeatureConfig$RevolutPayNativeMoveMoneyDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84285b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f84286c;
    public final String d;
    public final long e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevolutPayFeatureConfig$RevolutPayNativeMoveMoneyDestination(parcel.readString(), parcel.readString(), l.valueOf(parcel.readString()), parcel.readString(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevolutPayFeatureConfig$RevolutPayNativeMoveMoneyDestination[i];
        }
    }

    public RevolutPayFeatureConfig$RevolutPayNativeMoveMoneyDestination(String str, String str2, l moveMoneyTarget, String str3, long j2) {
        Intrinsics.checkNotNullParameter(moveMoneyTarget, "moveMoneyTarget");
        this.f84284a = str;
        this.f84285b = str2;
        this.f84286c = moveMoneyTarget;
        this.d = str3;
        this.e = j2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final l getF84286c() {
        return this.f84286c;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF84285b() {
        return this.f84285b;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF84284a() {
        return this.f84284a;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getE() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevolutPayFeatureConfig$RevolutPayNativeMoveMoneyDestination)) {
            return false;
        }
        RevolutPayFeatureConfig$RevolutPayNativeMoveMoneyDestination revolutPayFeatureConfig$RevolutPayNativeMoveMoneyDestination = (RevolutPayFeatureConfig$RevolutPayNativeMoveMoneyDestination) obj2;
        return Intrinsics.f(this.f84284a, revolutPayFeatureConfig$RevolutPayNativeMoveMoneyDestination.f84284a) && Intrinsics.f(this.f84285b, revolutPayFeatureConfig$RevolutPayNativeMoveMoneyDestination.f84285b) && this.f84286c == revolutPayFeatureConfig$RevolutPayNativeMoveMoneyDestination.f84286c && Intrinsics.f(this.d, revolutPayFeatureConfig$RevolutPayNativeMoveMoneyDestination.d) && this.e == revolutPayFeatureConfig$RevolutPayNativeMoveMoneyDestination.e;
    }

    /* JADX INFO: renamed from: getPocketId, reason: from getter */
    public final String getD() {
        return this.d;
    }

    public final int hashCode() {
        String str = this.f84284a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f84285b;
        int iHashCode2 = (this.f84286c.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.d;
        return Long.hashCode(this.e) + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84284a);
        dest.writeString(this.f84285b);
        dest.writeString(this.f84286c.name());
        dest.writeString(this.d);
        dest.writeLong(this.e);
    }
}
