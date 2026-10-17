package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dej.a1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimPhoneNumberPortingDynamicForm;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimPhoneNumberPortingDynamicForm implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimPhoneNumberPortingDynamicForm> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1 f100350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f100351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f100352c;
    public final EsimHyperText d;
    public final EsimHyperText e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f100353g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f100354h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f100355j;
    public final EsimPhoneNumberPortingPreferredSchedule k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List f100356l;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            ArrayList arrayList5;
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            a1 a1VarValueOf = parcel.readInt() == 0 ? null : a1.valueOf(parcel.readString());
            String string = parcel.readString();
            String string2 = parcel.readString();
            Parcelable.Creator<EsimHyperText<?, ?>> creator = EsimHyperText.CREATOR;
            EsimHyperText<?, ?> esimHyperTextCreateFromParcel = creator.createFromParcel(parcel);
            EsimHyperText<?, ?> esimHyperTextCreateFromParcel2 = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
            int iA = 0;
            boolean z3 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i);
                int iA2 = 0;
                while (iA2 != i) {
                    iA2 = org.bouncycastle.jcajce.provider.digest.a.a(EsimPhoneNumberPortingServiceProvider.CREATOR, parcel, arrayList6, iA2, 1);
                }
                arrayList = arrayList6;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i2 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i2);
                int iA3 = 0;
                while (iA3 != i2) {
                    iA3 = org.bouncycastle.jcajce.provider.digest.a.a(EsimPhoneNumberPortingOwnerAccountType.CREATOR, parcel, arrayList7, iA3, 1);
                }
                arrayList2 = arrayList7;
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i3 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(i3);
                int iA4 = 0;
                while (iA4 != i3) {
                    iA4 = org.bouncycastle.jcajce.provider.digest.a.a(EsimPhoneNumberPortingContractType.CREATOR, parcel, arrayList8, iA4, 1);
                }
                arrayList3 = arrayList8;
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i5 = parcel.readInt();
                ArrayList arrayList9 = new ArrayList(i5);
                int iA5 = 0;
                while (iA5 != i5) {
                    iA5 = org.bouncycastle.jcajce.provider.digest.a.a(EsimPhoneNumberPortingScheduleOption.CREATOR, parcel, arrayList9, iA5, 1);
                }
                arrayList4 = arrayList9;
            }
            EsimPhoneNumberPortingPreferredSchedule esimPhoneNumberPortingPreferredScheduleCreateFromParcel = EsimPhoneNumberPortingPreferredSchedule.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() != 0) {
                int i6 = parcel.readInt();
                arrayList5 = new ArrayList(i6);
                while (true) {
                    z = z3;
                    if (iA == i6) {
                        break;
                    }
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(EsimPhoneNumberPortingAttribute.CREATOR, parcel, arrayList5, iA, 1);
                    z3 = z;
                }
            } else {
                arrayList5 = null;
                z = z3;
            }
            return new EsimPhoneNumberPortingDynamicForm(a1VarValueOf, string, string2, esimHyperTextCreateFromParcel, esimHyperTextCreateFromParcel2, z, arrayList, arrayList2, arrayList3, arrayList4, esimPhoneNumberPortingPreferredScheduleCreateFromParcel, arrayList5);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimPhoneNumberPortingDynamicForm[i];
        }
    }

    public EsimPhoneNumberPortingDynamicForm(a1 a1Var, String str, String title, EsimHyperText subtitle, EsimHyperText esimHyperText, boolean z, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, EsimPhoneNumberPortingPreferredSchedule preferredSchedule, ArrayList arrayList5) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(preferredSchedule, "preferredSchedule");
        this.f100350a = a1Var;
        this.f100351b = str;
        this.f100352c = title;
        this.d = subtitle;
        this.e = esimHyperText;
        this.f = z;
        this.f100353g = arrayList;
        this.f100354h = arrayList2;
        this.i = arrayList3;
        this.f100355j = arrayList4;
        this.k = preferredSchedule;
        this.f100356l = arrayList5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimPhoneNumberPortingDynamicForm)) {
            return false;
        }
        EsimPhoneNumberPortingDynamicForm esimPhoneNumberPortingDynamicForm = (EsimPhoneNumberPortingDynamicForm) obj2;
        return this.f100350a == esimPhoneNumberPortingDynamicForm.f100350a && Intrinsics.f(this.f100351b, esimPhoneNumberPortingDynamicForm.f100351b) && Intrinsics.f(this.f100352c, esimPhoneNumberPortingDynamicForm.f100352c) && Intrinsics.f(this.d, esimPhoneNumberPortingDynamicForm.d) && Intrinsics.f(this.e, esimPhoneNumberPortingDynamicForm.e) && this.f == esimPhoneNumberPortingDynamicForm.f && Intrinsics.f(this.f100353g, esimPhoneNumberPortingDynamicForm.f100353g) && Intrinsics.f(this.f100354h, esimPhoneNumberPortingDynamicForm.f100354h) && Intrinsics.f(this.i, esimPhoneNumberPortingDynamicForm.i) && Intrinsics.f(this.f100355j, esimPhoneNumberPortingDynamicForm.f100355j) && Intrinsics.f(this.k, esimPhoneNumberPortingDynamicForm.k) && Intrinsics.f(this.f100356l, esimPhoneNumberPortingDynamicForm.f100356l);
    }

    public final int hashCode() {
        a1 a1Var = this.f100350a;
        int iHashCode = (a1Var == null ? 0 : a1Var.hashCode()) * 31;
        String str = this.f100351b;
        int iHashCode2 = (this.d.hashCode() + p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f100352c)) * 31;
        EsimHyperText esimHyperText = this.e;
        int iC = j6.a.c((iHashCode2 + (esimHyperText == null ? 0 : esimHyperText.hashCode())) * 31, 31, this.f);
        List list = this.f100353g;
        int iHashCode3 = (iC + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.f100354h;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.i;
        int iHashCode5 = (iHashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.f100355j;
        int iHashCode6 = (this.k.hashCode() + ((iHashCode5 + (list4 == null ? 0 : list4.hashCode())) * 31)) * 31;
        List list5 = this.f100356l;
        return iHashCode6 + (list5 != null ? list5.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        a1 a1Var = this.f100350a;
        if (a1Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(a1Var.name());
        }
        dest.writeString(this.f100351b);
        dest.writeString(this.f100352c);
        this.d.writeToParcel(dest, i);
        EsimHyperText esimHyperText = this.e;
        if (esimHyperText == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimHyperText.writeToParcel(dest, i);
        }
        dest.writeInt(this.f ? 1 : 0);
        List list = this.f100353g;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((EsimPhoneNumberPortingServiceProvider) itQ.next()).writeToParcel(dest, i);
            }
        }
        List list2 = this.f100354h;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ2 = v0.a.q(dest, 1, list2);
            while (itQ2.hasNext()) {
                ((EsimPhoneNumberPortingOwnerAccountType) itQ2.next()).writeToParcel(dest, i);
            }
        }
        List list3 = this.i;
        if (list3 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ3 = v0.a.q(dest, 1, list3);
            while (itQ3.hasNext()) {
                ((EsimPhoneNumberPortingContractType) itQ3.next()).writeToParcel(dest, i);
            }
        }
        List list4 = this.f100355j;
        if (list4 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ4 = v0.a.q(dest, 1, list4);
            while (itQ4.hasNext()) {
                ((EsimPhoneNumberPortingScheduleOption) itQ4.next()).writeToParcel(dest, i);
            }
        }
        this.k.writeToParcel(dest, i);
        List list5 = this.f100356l;
        if (list5 == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ5 = v0.a.q(dest, 1, list5);
        while (itQ5.hasNext()) {
            ((EsimPhoneNumberPortingAttribute) itQ5.next()).writeToParcel(dest, i);
        }
    }
}
