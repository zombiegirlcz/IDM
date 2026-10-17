package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dej.a1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimPhoneNumberPortingOtp;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimPhoneNumberPortingOtp implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimPhoneNumberPortingOtp> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1 f100360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f100361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f100362c;
    public final EsimHyperText d;
    public final boolean e;
    public final EsimPhoneNumberPortingAttribute f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f100363g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final EsimHyperText f100364h;
    public final EsimPhoneNumberPortingSwitchStrategy i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            a1 a1VarValueOf = parcel.readInt() == 0 ? null : a1.valueOf(parcel.readString());
            String string = parcel.readString();
            String string2 = parcel.readString();
            Parcelable.Creator<EsimHyperText<?, ?>> creator = EsimHyperText.CREATOR;
            return new EsimPhoneNumberPortingOtp(a1VarValueOf, string, string2, creator.createFromParcel(parcel), parcel.readInt() != 0, EsimPhoneNumberPortingAttribute.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() != 0 ? EsimPhoneNumberPortingSwitchStrategy.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimPhoneNumberPortingOtp[i];
        }
    }

    public EsimPhoneNumberPortingOtp(a1 a1Var, String str, String title, EsimHyperText subtitle, boolean z, EsimPhoneNumberPortingAttribute code, String refreshLabel, EsimHyperText esimHyperText, EsimPhoneNumberPortingSwitchStrategy esimPhoneNumberPortingSwitchStrategy) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(refreshLabel, "refreshLabel");
        this.f100360a = a1Var;
        this.f100361b = str;
        this.f100362c = title;
        this.d = subtitle;
        this.e = z;
        this.f = code;
        this.f100363g = refreshLabel;
        this.f100364h = esimHyperText;
        this.i = esimPhoneNumberPortingSwitchStrategy;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimPhoneNumberPortingOtp)) {
            return false;
        }
        EsimPhoneNumberPortingOtp esimPhoneNumberPortingOtp = (EsimPhoneNumberPortingOtp) obj2;
        return this.f100360a == esimPhoneNumberPortingOtp.f100360a && Intrinsics.f(this.f100361b, esimPhoneNumberPortingOtp.f100361b) && Intrinsics.f(this.f100362c, esimPhoneNumberPortingOtp.f100362c) && Intrinsics.f(this.d, esimPhoneNumberPortingOtp.d) && this.e == esimPhoneNumberPortingOtp.e && Intrinsics.f(this.f, esimPhoneNumberPortingOtp.f) && Intrinsics.f(this.f100363g, esimPhoneNumberPortingOtp.f100363g) && Intrinsics.f(this.f100364h, esimPhoneNumberPortingOtp.f100364h) && Intrinsics.f(this.i, esimPhoneNumberPortingOtp.i);
    }

    public final int hashCode() {
        a1 a1Var = this.f100360a;
        int iHashCode = (a1Var == null ? 0 : a1Var.hashCode()) * 31;
        String str = this.f100361b;
        int iC = p.a.c((this.f.hashCode() + j6.a.c((this.d.hashCode() + p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f100362c)) * 31, 31, this.e)) * 31, 31, this.f100363g);
        EsimHyperText esimHyperText = this.f100364h;
        int iHashCode2 = (iC + (esimHyperText == null ? 0 : esimHyperText.hashCode())) * 31;
        EsimPhoneNumberPortingSwitchStrategy esimPhoneNumberPortingSwitchStrategy = this.i;
        return iHashCode2 + (esimPhoneNumberPortingSwitchStrategy != null ? esimPhoneNumberPortingSwitchStrategy.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        a1 a1Var = this.f100360a;
        if (a1Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(a1Var.name());
        }
        dest.writeString(this.f100361b);
        dest.writeString(this.f100362c);
        this.d.writeToParcel(dest, i);
        dest.writeInt(this.e ? 1 : 0);
        this.f.writeToParcel(dest, i);
        dest.writeString(this.f100363g);
        EsimHyperText esimHyperText = this.f100364h;
        if (esimHyperText == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimHyperText.writeToParcel(dest, i);
        }
        EsimPhoneNumberPortingSwitchStrategy esimPhoneNumberPortingSwitchStrategy = this.i;
        if (esimPhoneNumberPortingSwitchStrategy == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimPhoneNumberPortingSwitchStrategy.writeToParcel(dest, i);
        }
    }
}
