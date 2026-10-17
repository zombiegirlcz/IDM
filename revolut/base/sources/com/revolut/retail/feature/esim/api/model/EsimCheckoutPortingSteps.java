package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimCheckoutPortingSteps;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimCheckoutPortingSteps implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimCheckoutPortingSteps> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f100194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f100195c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(EsimPortingStep.CREATOR, parcel, arrayList, iA, 1);
            }
            return new EsimCheckoutPortingSteps(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimCheckoutPortingSteps[i];
        }
    }

    public EsimCheckoutPortingSteps(String title, String str, ArrayList steps) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(steps, "steps");
        this.f100193a = title;
        this.f100194b = str;
        this.f100195c = steps;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimCheckoutPortingSteps)) {
            return false;
        }
        EsimCheckoutPortingSteps esimCheckoutPortingSteps = (EsimCheckoutPortingSteps) obj2;
        return Intrinsics.f(this.f100193a, esimCheckoutPortingSteps.f100193a) && Intrinsics.f(this.f100194b, esimCheckoutPortingSteps.f100194b) && this.f100195c.equals(esimCheckoutPortingSteps.f100195c);
    }

    public final int hashCode() {
        int iHashCode = this.f100193a.hashCode() * 31;
        String str = this.f100194b;
        return this.f100195c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100193a);
        dest.writeString(this.f100194b);
        Iterator itY = j6.a.y(this.f100195c, dest);
        while (itY.hasNext()) {
            ((EsimPortingStep) itY.next()).writeToParcel(dest, i);
        }
    }
}
