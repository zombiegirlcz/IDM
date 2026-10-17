package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dej.u0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimPhoneNumberPortingAttribute;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimPhoneNumberPortingAttribute implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimPhoneNumberPortingAttribute> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f100339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f100340c;
    public final EsimHyperText d;
    public final u0 e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final EsimPhoneNumberPortingAttributesValidation f100341g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimPhoneNumberPortingAttribute(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : EsimHyperText.CREATOR.createFromParcel(parcel), u0.valueOf(parcel.readString()), parcel.readString(), EsimPhoneNumberPortingAttributesValidation.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimPhoneNumberPortingAttribute[i];
        }
    }

    public EsimPhoneNumberPortingAttribute(String key, String label, String str, EsimHyperText esimHyperText, u0 dataType, String str2, EsimPhoneNumberPortingAttributesValidation validation) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(dataType, "dataType");
        Intrinsics.checkNotNullParameter(validation, "validation");
        this.f100338a = key;
        this.f100339b = label;
        this.f100340c = str;
        this.d = esimHyperText;
        this.e = dataType;
        this.f = str2;
        this.f100341g = validation;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimPhoneNumberPortingAttribute)) {
            return false;
        }
        EsimPhoneNumberPortingAttribute esimPhoneNumberPortingAttribute = (EsimPhoneNumberPortingAttribute) obj2;
        return Intrinsics.f(this.f100338a, esimPhoneNumberPortingAttribute.f100338a) && Intrinsics.f(this.f100339b, esimPhoneNumberPortingAttribute.f100339b) && Intrinsics.f(this.f100340c, esimPhoneNumberPortingAttribute.f100340c) && Intrinsics.f(this.d, esimPhoneNumberPortingAttribute.d) && this.e == esimPhoneNumberPortingAttribute.e && Intrinsics.f(this.f, esimPhoneNumberPortingAttribute.f) && Intrinsics.f(this.f100341g, esimPhoneNumberPortingAttribute.f100341g);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f100338a.hashCode() * 31, 31, this.f100339b);
        String str = this.f100340c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        EsimHyperText esimHyperText = this.d;
        int iHashCode2 = (this.e.hashCode() + ((iHashCode + (esimHyperText == null ? 0 : esimHyperText.hashCode())) * 31)) * 31;
        String str2 = this.f;
        return this.f100341g.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100338a);
        dest.writeString(this.f100339b);
        dest.writeString(this.f100340c);
        EsimHyperText esimHyperText = this.d;
        if (esimHyperText == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimHyperText.writeToParcel(dest, i);
        }
        dest.writeString(this.e.name());
        dest.writeString(this.f);
        this.f100341g.writeToParcel(dest, i);
    }
}
