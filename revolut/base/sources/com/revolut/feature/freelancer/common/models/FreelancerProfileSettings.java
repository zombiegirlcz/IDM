package com.revolut.feature.freelancer.common.models;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/freelancer/common/models/FreelancerProfileSettings;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerProfileSettings implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FreelancerProfileSettings> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f73324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f73325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f73326c;
    public final String d;
    public final long e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f73327g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f73328h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FreelancerProfileSettings(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerProfileSettings[i];
        }
    }

    public FreelancerProfileSettings(long j2, String supportPhone, String supportEmail, String tradeName, String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(supportPhone, "supportPhone");
        Intrinsics.checkNotNullParameter(supportEmail, "supportEmail");
        Intrinsics.checkNotNullParameter(tradeName, "tradeName");
        this.f73324a = supportPhone;
        this.f73325b = supportEmail;
        this.f73326c = tradeName;
        this.d = str;
        this.e = j2;
        this.f = str2;
        this.f73327g = str3;
        this.f73328h = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerProfileSettings)) {
            return false;
        }
        FreelancerProfileSettings freelancerProfileSettings = (FreelancerProfileSettings) obj2;
        return Intrinsics.f(this.f73324a, freelancerProfileSettings.f73324a) && Intrinsics.f(this.f73325b, freelancerProfileSettings.f73325b) && Intrinsics.f(this.f73326c, freelancerProfileSettings.f73326c) && Intrinsics.f(this.d, freelancerProfileSettings.d) && this.e == freelancerProfileSettings.e && Intrinsics.f(this.f, freelancerProfileSettings.f) && Intrinsics.f(this.f73327g, freelancerProfileSettings.f73327g) && Intrinsics.f(this.f73328h, freelancerProfileSettings.f73328h);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f73324a.hashCode() * 31, 31, this.f73325b), 31, this.f73326c);
        String str = this.d;
        int iC2 = d.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        String str2 = this.f;
        int iHashCode = (iC2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f73327g;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f73328h;
        return iHashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f73324a);
        dest.writeString(this.f73325b);
        dest.writeString(this.f73326c);
        dest.writeString(this.d);
        dest.writeLong(this.e);
        dest.writeString(this.f);
        dest.writeString(this.f73327g);
        dest.writeString(this.f73328h);
    }
}
