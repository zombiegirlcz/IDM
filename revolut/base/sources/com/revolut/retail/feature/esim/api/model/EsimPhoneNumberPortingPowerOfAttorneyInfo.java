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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimPhoneNumberPortingPowerOfAttorneyInfo;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimPhoneNumberPortingPowerOfAttorneyInfo implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimPhoneNumberPortingPowerOfAttorneyInfo> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1 f100374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f100375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f100376c;
    public final EsimHyperText d;
    public final ArrayList e;
    public final ArrayList f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f100377g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final EsimPhoneNumberPortingPreferredSchedule f100378h;
    public final EsimPhoneNumberPortingPowerOfAttorneyTerms i;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            a1 a1VarValueOf = parcel.readInt() == 0 ? null : a1.valueOf(parcel.readString());
            String string = parcel.readString();
            String string2 = parcel.readString();
            EsimHyperText<?, ?> esimHyperTextCreateFromParcel = EsimHyperText.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            int iA2 = 0;
            while (iA2 != i) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(EsimPhoneNumberPortingServiceProvider.CREATOR, parcel, arrayList, iA2, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            int iA3 = 0;
            while (iA3 != i2) {
                iA3 = org.bouncycastle.jcajce.provider.digest.a.a(EsimPhoneNumberPortingOwnerAccountType.CREATOR, parcel, arrayList2, iA3, 1);
            }
            int i3 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i3);
            while (iA != i3) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(EsimPhoneNumberPortingContractType.CREATOR, parcel, arrayList3, iA, 1);
            }
            return new EsimPhoneNumberPortingPowerOfAttorneyInfo(a1VarValueOf, string, string2, esimHyperTextCreateFromParcel, arrayList, arrayList2, arrayList3, EsimPhoneNumberPortingPreferredSchedule.CREATOR.createFromParcel(parcel), EsimPhoneNumberPortingPowerOfAttorneyTerms.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimPhoneNumberPortingPowerOfAttorneyInfo[i];
        }
    }

    public EsimPhoneNumberPortingPowerOfAttorneyInfo(a1 a1Var, String str, String title, EsimHyperText subtitle, ArrayList serviceProviders, ArrayList ownerAccountTypes, ArrayList contractType, EsimPhoneNumberPortingPreferredSchedule preferredSchedule, EsimPhoneNumberPortingPowerOfAttorneyTerms terms) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(serviceProviders, "serviceProviders");
        Intrinsics.checkNotNullParameter(ownerAccountTypes, "ownerAccountTypes");
        Intrinsics.checkNotNullParameter(contractType, "contractType");
        Intrinsics.checkNotNullParameter(preferredSchedule, "preferredSchedule");
        Intrinsics.checkNotNullParameter(terms, "terms");
        this.f100374a = a1Var;
        this.f100375b = str;
        this.f100376c = title;
        this.d = subtitle;
        this.e = serviceProviders;
        this.f = ownerAccountTypes;
        this.f100377g = contractType;
        this.f100378h = preferredSchedule;
        this.i = terms;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimPhoneNumberPortingPowerOfAttorneyInfo)) {
            return false;
        }
        EsimPhoneNumberPortingPowerOfAttorneyInfo esimPhoneNumberPortingPowerOfAttorneyInfo = (EsimPhoneNumberPortingPowerOfAttorneyInfo) obj2;
        return this.f100374a == esimPhoneNumberPortingPowerOfAttorneyInfo.f100374a && Intrinsics.f(this.f100375b, esimPhoneNumberPortingPowerOfAttorneyInfo.f100375b) && Intrinsics.f(this.f100376c, esimPhoneNumberPortingPowerOfAttorneyInfo.f100376c) && Intrinsics.f(this.d, esimPhoneNumberPortingPowerOfAttorneyInfo.d) && this.e.equals(esimPhoneNumberPortingPowerOfAttorneyInfo.e) && this.f.equals(esimPhoneNumberPortingPowerOfAttorneyInfo.f) && this.f100377g.equals(esimPhoneNumberPortingPowerOfAttorneyInfo.f100377g) && Intrinsics.f(this.f100378h, esimPhoneNumberPortingPowerOfAttorneyInfo.f100378h) && Intrinsics.f(this.i, esimPhoneNumberPortingPowerOfAttorneyInfo.i);
    }

    public final int hashCode() {
        a1 a1Var = this.f100374a;
        int iHashCode = (a1Var == null ? 0 : a1Var.hashCode()) * 31;
        String str = this.f100375b;
        return this.i.hashCode() + ((this.f100378h.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f100377g, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f, com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, (this.d.hashCode() + p.a.c((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.f100376c)) * 31, 31), 31), 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        a1 a1Var = this.f100374a;
        if (a1Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(a1Var.name());
        }
        dest.writeString(this.f100375b);
        dest.writeString(this.f100376c);
        this.d.writeToParcel(dest, i);
        Iterator itY = j6.a.y(this.e, dest);
        while (itY.hasNext()) {
            ((EsimPhoneNumberPortingServiceProvider) itY.next()).writeToParcel(dest, i);
        }
        Iterator itY2 = j6.a.y(this.f, dest);
        while (itY2.hasNext()) {
            ((EsimPhoneNumberPortingOwnerAccountType) itY2.next()).writeToParcel(dest, i);
        }
        Iterator itY3 = j6.a.y(this.f100377g, dest);
        while (itY3.hasNext()) {
            ((EsimPhoneNumberPortingContractType) itY3.next()).writeToParcel(dest, i);
        }
        this.f100378h.writeToParcel(dest, i);
        this.i.writeToParcel(dest, i);
    }
}
