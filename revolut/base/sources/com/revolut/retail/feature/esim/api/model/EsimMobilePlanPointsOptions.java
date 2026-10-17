package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimMobilePlanPointsOptions;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimMobilePlanPointsOptions implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimMobilePlanPointsOptions> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f100308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f100309c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            d dVar = (d) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(EsimMobilePlanPointsOption.CREATOR, parcel, arrayList, iA, 1);
            }
            return new EsimMobilePlanPointsOptions(dVar, string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimMobilePlanPointsOptions[i];
        }
    }

    public EsimMobilePlanPointsOptions(d originalPrice, String token, ArrayList pointsOptions) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(originalPrice, "originalPrice");
        Intrinsics.checkNotNullParameter(pointsOptions, "pointsOptions");
        this.f100307a = token;
        this.f100308b = originalPrice;
        this.f100309c = pointsOptions;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimMobilePlanPointsOptions)) {
            return false;
        }
        EsimMobilePlanPointsOptions esimMobilePlanPointsOptions = (EsimMobilePlanPointsOptions) obj2;
        return Intrinsics.f(this.f100307a, esimMobilePlanPointsOptions.f100307a) && Intrinsics.f(this.f100308b, esimMobilePlanPointsOptions.f100308b) && this.f100309c.equals(esimMobilePlanPointsOptions.f100309c);
    }

    public final int hashCode() {
        return this.f100309c.hashCode() + v7.c(this.f100307a.hashCode() * 31, 31, this.f100308b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100307a);
        dest.writeSerializable(this.f100308b);
        Iterator itY = j6.a.y(this.f100309c, dest);
        while (itY.hasNext()) {
            ((EsimMobilePlanPointsOption) itY.next()).writeToParcel(dest, i);
        }
    }
}
