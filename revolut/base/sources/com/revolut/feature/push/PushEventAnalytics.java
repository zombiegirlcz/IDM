package com.revolut.feature.push;

import android.os.Parcel;
import android.os.Parcelable;
import ipa.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/push/PushEventAnalytics;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_push_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PushEventAnalytics implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PushEventAnalytics> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f81481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f81483c;
    public final String d;
    public final String e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PushEventAnalytics(h.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PushEventAnalytics[i];
        }
    }

    public PushEventAnalytics(h pushCategory, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(pushCategory, "pushCategory");
        this.f81481a = pushCategory;
        this.f81482b = str;
        this.f81483c = str2;
        this.d = str3;
        this.e = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PushEventAnalytics)) {
            return false;
        }
        PushEventAnalytics pushEventAnalytics = (PushEventAnalytics) obj2;
        return this.f81481a == pushEventAnalytics.f81481a && Intrinsics.f(this.f81482b, pushEventAnalytics.f81482b) && Intrinsics.f(this.f81483c, pushEventAnalytics.f81483c) && Intrinsics.f(this.d, pushEventAnalytics.d) && Intrinsics.f(this.e, pushEventAnalytics.e);
    }

    public final int hashCode() {
        int iHashCode = this.f81481a.hashCode() * 31;
        String str = this.f81482b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f81483c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f81481a.name());
        dest.writeString(this.f81482b);
        dest.writeString(this.f81483c);
        dest.writeString(this.d);
        dest.writeString(this.e);
    }
}
