package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimFeaturedPhoneNumbers;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimFeaturedPhoneNumbers implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimFeaturedPhoneNumbers> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f100260a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f100261b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int iA = 0;
            boolean z = parcel.readInt() != 0;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(EsimFeaturedPhoneNumber.CREATOR, parcel, arrayList, iA, 1);
            }
            return new EsimFeaturedPhoneNumbers(arrayList, z);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimFeaturedPhoneNumbers[i];
        }
    }

    public EsimFeaturedPhoneNumbers(ArrayList list, boolean z) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.f100260a = z;
        this.f100261b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimFeaturedPhoneNumbers)) {
            return false;
        }
        EsimFeaturedPhoneNumbers esimFeaturedPhoneNumbers = (EsimFeaturedPhoneNumbers) obj2;
        return this.f100260a == esimFeaturedPhoneNumbers.f100260a && this.f100261b.equals(esimFeaturedPhoneNumbers.f100261b);
    }

    public final int hashCode() {
        return this.f100261b.hashCode() + (Boolean.hashCode(this.f100260a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f100260a ? 1 : 0);
        Iterator itY = j6.a.y(this.f100261b, dest);
        while (itY.hasNext()) {
            ((EsimFeaturedPhoneNumber) itY.next()).writeToParcel(dest, i);
        }
    }
}
