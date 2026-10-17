package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wi0.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimDataPlanAttributes;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimDataPlanAttributes implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimDataPlanAttributes> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f100228a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f100229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Boolean f100230c;
    public final b d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Boolean boolValueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Boolean boolValueOf2 = null;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() != 0) {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new EsimDataPlanAttributes(boolValueOf, numValueOf, boolValueOf2, (b) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimDataPlanAttributes[i];
        }
    }

    public EsimDataPlanAttributes(Boolean bool, Integer num, Boolean bool2, b bVar) {
        this.f100228a = bool;
        this.f100229b = num;
        this.f100230c = bool2;
        this.d = bVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimDataPlanAttributes)) {
            return false;
        }
        EsimDataPlanAttributes esimDataPlanAttributes = (EsimDataPlanAttributes) obj2;
        return Intrinsics.f(this.f100228a, esimDataPlanAttributes.f100228a) && Intrinsics.f(this.f100229b, esimDataPlanAttributes.f100229b) && Intrinsics.f(this.f100230c, esimDataPlanAttributes.f100230c) && Intrinsics.f(this.d, esimDataPlanAttributes.d);
    }

    public final int hashCode() {
        Boolean bool = this.f100228a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.f100229b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.f100230c;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        b bVar = this.d;
        return iHashCode3 + (bVar != null ? bVar.f297794a.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Boolean bool = this.f100228a;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool);
        }
        Integer num = this.f100229b;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        Boolean bool2 = this.f100230c;
        if (bool2 == null) {
            dest.writeInt(0);
        } else {
            p.a.A(dest, 1, bool2);
        }
        dest.writeSerializable(this.d);
    }
}
