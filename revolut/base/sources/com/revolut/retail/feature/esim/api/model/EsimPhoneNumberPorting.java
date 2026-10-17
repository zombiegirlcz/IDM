package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dej.a1;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimPhoneNumberPorting;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimPhoneNumberPorting implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimPhoneNumberPorting> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f100331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f100332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f100333c;
    public final String d;
    public final ArrayList e;
    public final EsimPhoneNumberPortingInstruction f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final EsimCheckoutPortingSteps f100334g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f100335h;
    public final EsimPhoneNumberPortingPacInfo i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final EsimPhoneNumberPortingPowerOfAttorneyInfo f100336j;
    public final EsimPhoneNumberPortingDynamicForm k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final EsimPhoneNumberPortingOtp f100337l;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int iA = 0;
            boolean z = parcel.readInt() != 0;
            int i = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i);
            int iC = 0;
            while (iC != i) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList2, iC, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                arrayList = new ArrayList(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    arrayList.add(a1.valueOf(parcel.readString()));
                }
            }
            String string = parcel.readString();
            int i5 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i5);
            while (iA != i5) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(EsimPhoneNumberPortingInstruction.CREATOR, parcel, arrayList3, iA, 1);
            }
            return new EsimPhoneNumberPorting(z, arrayList2, arrayList, string, arrayList3, parcel.readInt() == 0 ? null : EsimPhoneNumberPortingInstruction.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : EsimCheckoutPortingSteps.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : EsimPhoneNumberPortingPacInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : EsimPhoneNumberPortingPowerOfAttorneyInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : EsimPhoneNumberPortingDynamicForm.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? EsimPhoneNumberPortingOtp.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimPhoneNumberPorting[i];
        }
    }

    public EsimPhoneNumberPorting(boolean z, ArrayList eligiblePhoneCountries, ArrayList arrayList, String str, ArrayList instructions, EsimPhoneNumberPortingInstruction esimPhoneNumberPortingInstruction, EsimCheckoutPortingSteps esimCheckoutPortingSteps, String str2, EsimPhoneNumberPortingPacInfo esimPhoneNumberPortingPacInfo, EsimPhoneNumberPortingPowerOfAttorneyInfo esimPhoneNumberPortingPowerOfAttorneyInfo, EsimPhoneNumberPortingDynamicForm esimPhoneNumberPortingDynamicForm, EsimPhoneNumberPortingOtp esimPhoneNumberPortingOtp) {
        Intrinsics.checkNotNullParameter(eligiblePhoneCountries, "eligiblePhoneCountries");
        Intrinsics.checkNotNullParameter(instructions, "instructions");
        this.f100331a = z;
        this.f100332b = eligiblePhoneCountries;
        this.f100333c = arrayList;
        this.d = str;
        this.e = instructions;
        this.f = esimPhoneNumberPortingInstruction;
        this.f100334g = esimCheckoutPortingSteps;
        this.f100335h = str2;
        this.i = esimPhoneNumberPortingPacInfo;
        this.f100336j = esimPhoneNumberPortingPowerOfAttorneyInfo;
        this.k = esimPhoneNumberPortingDynamicForm;
        this.f100337l = esimPhoneNumberPortingOtp;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimPhoneNumberPorting)) {
            return false;
        }
        EsimPhoneNumberPorting esimPhoneNumberPorting = (EsimPhoneNumberPorting) obj2;
        return this.f100331a == esimPhoneNumberPorting.f100331a && this.f100332b.equals(esimPhoneNumberPorting.f100332b) && Intrinsics.f(this.f100333c, esimPhoneNumberPorting.f100333c) && Intrinsics.f(this.d, esimPhoneNumberPorting.d) && this.e.equals(esimPhoneNumberPorting.e) && Intrinsics.f(this.f, esimPhoneNumberPorting.f) && Intrinsics.f(this.f100334g, esimPhoneNumberPorting.f100334g) && Intrinsics.f(this.f100335h, esimPhoneNumberPorting.f100335h) && Intrinsics.f(this.i, esimPhoneNumberPorting.i) && Intrinsics.f(this.f100336j, esimPhoneNumberPorting.f100336j) && Intrinsics.f(this.k, esimPhoneNumberPorting.k) && Intrinsics.f(this.f100337l, esimPhoneNumberPorting.f100337l);
    }

    public final int hashCode() {
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.f100332b, Boolean.hashCode(this.f100331a) * 31, 31);
        List list = this.f100333c;
        int iHashCode = (iB + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.d;
        int iB2 = com.google.android.gms.internal.mlkit_vision_face.a.b(this.e, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        EsimPhoneNumberPortingInstruction esimPhoneNumberPortingInstruction = this.f;
        int iHashCode2 = (iB2 + (esimPhoneNumberPortingInstruction == null ? 0 : esimPhoneNumberPortingInstruction.hashCode())) * 31;
        EsimCheckoutPortingSteps esimCheckoutPortingSteps = this.f100334g;
        int iHashCode3 = (iHashCode2 + (esimCheckoutPortingSteps == null ? 0 : esimCheckoutPortingSteps.hashCode())) * 31;
        String str2 = this.f100335h;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        EsimPhoneNumberPortingPacInfo esimPhoneNumberPortingPacInfo = this.i;
        int iHashCode5 = (iHashCode4 + (esimPhoneNumberPortingPacInfo == null ? 0 : esimPhoneNumberPortingPacInfo.hashCode())) * 31;
        EsimPhoneNumberPortingPowerOfAttorneyInfo esimPhoneNumberPortingPowerOfAttorneyInfo = this.f100336j;
        int iHashCode6 = (iHashCode5 + (esimPhoneNumberPortingPowerOfAttorneyInfo == null ? 0 : esimPhoneNumberPortingPowerOfAttorneyInfo.hashCode())) * 31;
        EsimPhoneNumberPortingDynamicForm esimPhoneNumberPortingDynamicForm = this.k;
        int iHashCode7 = (iHashCode6 + (esimPhoneNumberPortingDynamicForm == null ? 0 : esimPhoneNumberPortingDynamicForm.hashCode())) * 31;
        EsimPhoneNumberPortingOtp esimPhoneNumberPortingOtp = this.f100337l;
        return iHashCode7 + (esimPhoneNumberPortingOtp != null ? esimPhoneNumberPortingOtp.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f100331a ? 1 : 0);
        Iterator itY = j6.a.y(this.f100332b, dest);
        while (itY.hasNext()) {
            dest.writeSerializable((Serializable) itY.next());
        }
        List list = this.f100333c;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeString(((a1) itQ.next()).name());
            }
        }
        dest.writeString(this.d);
        Iterator itY2 = j6.a.y(this.e, dest);
        while (itY2.hasNext()) {
            ((EsimPhoneNumberPortingInstruction) itY2.next()).writeToParcel(dest, i);
        }
        EsimPhoneNumberPortingInstruction esimPhoneNumberPortingInstruction = this.f;
        if (esimPhoneNumberPortingInstruction == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimPhoneNumberPortingInstruction.writeToParcel(dest, i);
        }
        EsimCheckoutPortingSteps esimCheckoutPortingSteps = this.f100334g;
        if (esimCheckoutPortingSteps == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimCheckoutPortingSteps.writeToParcel(dest, i);
        }
        dest.writeString(this.f100335h);
        EsimPhoneNumberPortingPacInfo esimPhoneNumberPortingPacInfo = this.i;
        if (esimPhoneNumberPortingPacInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimPhoneNumberPortingPacInfo.writeToParcel(dest, i);
        }
        EsimPhoneNumberPortingPowerOfAttorneyInfo esimPhoneNumberPortingPowerOfAttorneyInfo = this.f100336j;
        if (esimPhoneNumberPortingPowerOfAttorneyInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimPhoneNumberPortingPowerOfAttorneyInfo.writeToParcel(dest, i);
        }
        EsimPhoneNumberPortingDynamicForm esimPhoneNumberPortingDynamicForm = this.k;
        if (esimPhoneNumberPortingDynamicForm == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimPhoneNumberPortingDynamicForm.writeToParcel(dest, i);
        }
        EsimPhoneNumberPortingOtp esimPhoneNumberPortingOtp = this.f100337l;
        if (esimPhoneNumberPortingOtp == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimPhoneNumberPortingOtp.writeToParcel(dest, i);
        }
    }
}
