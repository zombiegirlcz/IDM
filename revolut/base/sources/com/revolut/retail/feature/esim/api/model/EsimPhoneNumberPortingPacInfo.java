package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dej.a1;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimPhoneNumberPortingPacInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimPhoneNumberPortingPacInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimPhoneNumberPortingPacInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1 f100369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f100370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f100371c;
    public final EsimHyperText d;
    public final EsimHyperText e;
    public final EsimPhoneNumberPortingCredentialIssuer f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final EsimPhoneNumberPortingPreferredSchedule f100372g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f100373h;
    public final EsimPhoneNumberPortingAttribute i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            a1 a1VarValueOf = parcel.readInt() == 0 ? null : a1.valueOf(parcel.readString());
            String string = parcel.readString();
            String string2 = parcel.readString();
            Parcelable.Creator<EsimHyperText<?, ?>> creator = EsimHyperText.CREATOR;
            EsimHyperText<?, ?> esimHyperTextCreateFromParcel = creator.createFromParcel(parcel);
            EsimHyperText<?, ?> esimHyperTextCreateFromParcel2 = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
            EsimPhoneNumberPortingCredentialIssuer esimPhoneNumberPortingCredentialIssuerCreateFromParcel = parcel.readInt() != 0 ? EsimPhoneNumberPortingCredentialIssuer.CREATOR.createFromParcel(parcel) : null;
            EsimPhoneNumberPortingPreferredSchedule esimPhoneNumberPortingPreferredScheduleCreateFromParcel = EsimPhoneNumberPortingPreferredSchedule.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(EsimPhoneNumberPortingScheduleOption.CREATOR, parcel, arrayList, iA, 1);
            }
            return new EsimPhoneNumberPortingPacInfo(a1VarValueOf, string, string2, esimHyperTextCreateFromParcel, esimHyperTextCreateFromParcel2, esimPhoneNumberPortingCredentialIssuerCreateFromParcel, esimPhoneNumberPortingPreferredScheduleCreateFromParcel, arrayList, EsimPhoneNumberPortingAttribute.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimPhoneNumberPortingPacInfo[i];
        }
    }

    public EsimPhoneNumberPortingPacInfo(a1 a1Var, String str, String title, EsimHyperText subtitle, EsimHyperText esimHyperText, EsimPhoneNumberPortingCredentialIssuer esimPhoneNumberPortingCredentialIssuer, EsimPhoneNumberPortingPreferredSchedule preferredSchedule, ArrayList preferredScheduleOptions, EsimPhoneNumberPortingAttribute code) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(preferredSchedule, "preferredSchedule");
        Intrinsics.checkNotNullParameter(preferredScheduleOptions, "preferredScheduleOptions");
        Intrinsics.checkNotNullParameter(code, "code");
        this.f100369a = a1Var;
        this.f100370b = str;
        this.f100371c = title;
        this.d = subtitle;
        this.e = esimHyperText;
        this.f = esimPhoneNumberPortingCredentialIssuer;
        this.f100372g = preferredSchedule;
        this.f100373h = preferredScheduleOptions;
        this.i = code;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimPhoneNumberPortingPacInfo)) {
            return false;
        }
        EsimPhoneNumberPortingPacInfo esimPhoneNumberPortingPacInfo = (EsimPhoneNumberPortingPacInfo) obj2;
        return this.f100369a == esimPhoneNumberPortingPacInfo.f100369a && Intrinsics.f(this.f100370b, esimPhoneNumberPortingPacInfo.f100370b) && Intrinsics.f(this.f100371c, esimPhoneNumberPortingPacInfo.f100371c) && Intrinsics.f(this.d, esimPhoneNumberPortingPacInfo.d) && Intrinsics.f(this.e, esimPhoneNumberPortingPacInfo.e) && Intrinsics.f(this.f, esimPhoneNumberPortingPacInfo.f) && Intrinsics.f(this.f100372g, esimPhoneNumberPortingPacInfo.f100372g) && this.f100373h.equals(esimPhoneNumberPortingPacInfo.f100373h) && Intrinsics.f(this.i, esimPhoneNumberPortingPacInfo.i);
    }

    public final int hashCode() {
        a1 a1Var = this.f100369a;
        int iHashCode = (a1Var == null ? 0 : a1Var.hashCode()) * 31;
        String str = this.f100370b;
        int iHashCode2 = (this.d.hashCode() + p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f100371c)) * 31;
        EsimHyperText esimHyperText = this.e;
        int iHashCode3 = (iHashCode2 + (esimHyperText == null ? 0 : esimHyperText.hashCode())) * 31;
        EsimPhoneNumberPortingCredentialIssuer esimPhoneNumberPortingCredentialIssuer = this.f;
        return this.i.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f100373h, (this.f100372g.hashCode() + ((iHashCode3 + (esimPhoneNumberPortingCredentialIssuer != null ? esimPhoneNumberPortingCredentialIssuer.hashCode() : 0)) * 31)) * 31, 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        a1 a1Var = this.f100369a;
        if (a1Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(a1Var.name());
        }
        dest.writeString(this.f100370b);
        dest.writeString(this.f100371c);
        this.d.writeToParcel(dest, i);
        EsimHyperText esimHyperText = this.e;
        if (esimHyperText == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimHyperText.writeToParcel(dest, i);
        }
        EsimPhoneNumberPortingCredentialIssuer esimPhoneNumberPortingCredentialIssuer = this.f;
        if (esimPhoneNumberPortingCredentialIssuer == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimPhoneNumberPortingCredentialIssuer.writeToParcel(dest, i);
        }
        this.f100372g.writeToParcel(dest, i);
        Iterator itY = j6.a.y(this.f100373h, dest);
        while (itY.hasNext()) {
            ((EsimPhoneNumberPortingScheduleOption) itY.next()).writeToParcel(dest, i);
        }
        this.i.writeToParcel(dest, i);
    }
}
