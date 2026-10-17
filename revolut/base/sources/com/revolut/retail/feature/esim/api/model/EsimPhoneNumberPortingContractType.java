package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimPhoneNumberPortingContractType;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimPhoneNumberPortingContractType implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimPhoneNumberPortingContractType> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f100346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f100347c;
    public final ArrayList d;
    public final List e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String str = EsimPortingContractTypeCode.CREATOR.createFromParcel(parcel).f100415a;
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i);
            int iA = 0;
            int iA2 = 0;
            while (iA2 != i) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(EsimPhoneNumberPortingScheduleOption.CREATOR, parcel, arrayList2, iA2, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i2 = parcel.readInt();
                arrayList = new ArrayList(i2);
                while (iA != i2) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(EsimPhoneNumberPortingAttribute.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            return new EsimPhoneNumberPortingContractType(str, string, string2, arrayList2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimPhoneNumberPortingContractType[i];
        }
    }

    public EsimPhoneNumberPortingContractType(String type, String text, String str, ArrayList preferredScheduleOptions, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(preferredScheduleOptions, "preferredScheduleOptions");
        this.f100345a = type;
        this.f100346b = text;
        this.f100347c = str;
        this.d = preferredScheduleOptions;
        this.e = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimPhoneNumberPortingContractType)) {
            return false;
        }
        EsimPhoneNumberPortingContractType esimPhoneNumberPortingContractType = (EsimPhoneNumberPortingContractType) obj2;
        return Intrinsics.f(this.f100345a, esimPhoneNumberPortingContractType.f100345a) && Intrinsics.f(this.f100346b, esimPhoneNumberPortingContractType.f100346b) && Intrinsics.f(this.f100347c, esimPhoneNumberPortingContractType.f100347c) && this.d.equals(esimPhoneNumberPortingContractType.d) && Intrinsics.f(this.e, esimPhoneNumberPortingContractType.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f100345a.hashCode() * 31, 31, this.f100346b);
        String str = this.f100347c;
        int iB = com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, (iC + (str == null ? 0 : str.hashCode())) * 31, 31);
        List list = this.e;
        return iB + (list != null ? list.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100345a);
        dest.writeString(this.f100346b);
        dest.writeString(this.f100347c);
        Iterator itY = j6.a.y(this.d, dest);
        while (itY.hasNext()) {
            ((EsimPhoneNumberPortingScheduleOption) itY.next()).writeToParcel(dest, i);
        }
        List list = this.e;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = v0.a.q(dest, 1, list);
        while (itQ.hasNext()) {
            ((EsimPhoneNumberPortingAttribute) itQ.next()).writeToParcel(dest, i);
        }
    }
}
