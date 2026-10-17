package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dej.l1;
import dej.n1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimProfileDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "InstallationType", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimProfileDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimProfileDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f100434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f100435c;
    public final String d;
    public final String e;
    public final n1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f100436g;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimProfileDetails$InstallationType;", "Landroid/os/Parcelable;", "ActivationCode", "ActivationCodeIccId", "InstallationLink", "Lcom/revolut/retail/feature/esim/api/model/EsimProfileDetails$InstallationType$ActivationCode;", "Lcom/revolut/retail/feature/esim/api/model/EsimProfileDetails$InstallationType$ActivationCodeIccId;", "Lcom/revolut/retail/feature/esim/api/model/EsimProfileDetails$InstallationType$InstallationLink;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InstallationType extends Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimProfileDetails$InstallationType$ActivationCode;", "Lcom/revolut/retail/feature/esim/api/model/EsimProfileDetails$InstallationType;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ActivationCode implements InstallationType {

            @NotNull
            public static final Parcelable.Creator<ActivationCode> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f100437a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ActivationCode(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ActivationCode[i];
                }
            }

            public ActivationCode(String lpa2) {
                Intrinsics.checkNotNullParameter(lpa2, "lpa");
                this.f100437a = lpa2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof ActivationCode) && Intrinsics.f(this.f100437a, ((ActivationCode) obj2).f100437a);
            }

            public final int hashCode() {
                return this.f100437a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f100437a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimProfileDetails$InstallationType$ActivationCodeIccId;", "Lcom/revolut/retail/feature/esim/api/model/EsimProfileDetails$InstallationType;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ActivationCodeIccId implements InstallationType {

            @NotNull
            public static final Parcelable.Creator<ActivationCodeIccId> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f100438a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ActivationCodeIccId(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ActivationCodeIccId[i];
                }
            }

            public ActivationCodeIccId(String lpa2) {
                Intrinsics.checkNotNullParameter(lpa2, "lpa");
                this.f100438a = lpa2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof ActivationCodeIccId) && Intrinsics.f(this.f100438a, ((ActivationCodeIccId) obj2).f100438a);
            }

            public final int hashCode() {
                return this.f100438a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f100438a);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimProfileDetails$InstallationType$InstallationLink;", "Lcom/revolut/retail/feature/esim/api/model/EsimProfileDetails$InstallationType;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class InstallationLink implements InstallationType {

            @NotNull
            public static final Parcelable.Creator<InstallationLink> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f100439a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new InstallationLink(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new InstallationLink[i];
                }
            }

            public InstallationLink(String url2) {
                Intrinsics.checkNotNullParameter(url2, "url");
                this.f100439a = url2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof InstallationLink) && Intrinsics.f(this.f100439a, ((InstallationLink) obj2).f100439a);
            }

            public final int hashCode() {
                return this.f100439a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeString(this.f100439a);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimProfileDetails(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), n1.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimProfileDetails[i];
        }
    }

    public EsimProfileDetails(String iccId, String lpa2, String matchingCode, String str, String smdp, n1 installationType, String str2) {
        Intrinsics.checkNotNullParameter(iccId, "iccId");
        Intrinsics.checkNotNullParameter(lpa2, "lpa");
        Intrinsics.checkNotNullParameter(matchingCode, "matchingCode");
        Intrinsics.checkNotNullParameter(smdp, "smdp");
        Intrinsics.checkNotNullParameter(installationType, "installationType");
        this.f100433a = iccId;
        this.f100434b = lpa2;
        this.f100435c = matchingCode;
        this.d = str;
        this.e = smdp;
        this.f = installationType;
        this.f100436g = str2;
    }

    public final InstallationType a() {
        int i = l1.f113586a[this.f.ordinal()];
        String str = this.f100434b;
        if (i == 1) {
            return new InstallationType.ActivationCodeIccId(str);
        }
        if (i == 2) {
            return new InstallationType.ActivationCode(str);
        }
        if (i != 3) {
            if (i == 4) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        String str2 = this.f100436g;
        if (str2 != null) {
            return new InstallationType.InstallationLink(str2);
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimProfileDetails)) {
            return false;
        }
        EsimProfileDetails esimProfileDetails = (EsimProfileDetails) obj2;
        return Intrinsics.f(this.f100433a, esimProfileDetails.f100433a) && Intrinsics.f(this.f100434b, esimProfileDetails.f100434b) && Intrinsics.f(this.f100435c, esimProfileDetails.f100435c) && Intrinsics.f(this.d, esimProfileDetails.d) && Intrinsics.f(this.e, esimProfileDetails.e) && this.f == esimProfileDetails.f && Intrinsics.f(this.f100436g, esimProfileDetails.f100436g);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f100433a.hashCode() * 31, 31, this.f100434b), 31, this.f100435c);
        String str = this.d;
        int iHashCode = (this.f.hashCode() + p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.e)) * 31;
        String str2 = this.f100436g;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100433a);
        dest.writeString(this.f100434b);
        dest.writeString(this.f100435c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f.name());
        dest.writeString(this.f100436g);
    }
}
