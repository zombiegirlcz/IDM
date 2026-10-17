package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimMobilePlanPointsOption;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimMobilePlanPointsOption implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimMobilePlanPointsOption> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f100304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f100305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f100306c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimMobilePlanPointsOption((BigDecimal) parcel.readSerializable(), (d) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimMobilePlanPointsOption[i];
        }
    }

    public EsimMobilePlanPointsOption(BigDecimal points, d discount, d finalPrice, boolean z) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(discount, "discount");
        Intrinsics.checkNotNullParameter(finalPrice, "finalPrice");
        this.f100304a = points;
        this.f100305b = discount;
        this.f100306c = finalPrice;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimMobilePlanPointsOption)) {
            return false;
        }
        EsimMobilePlanPointsOption esimMobilePlanPointsOption = (EsimMobilePlanPointsOption) obj2;
        return Intrinsics.f(this.f100304a, esimMobilePlanPointsOption.f100304a) && Intrinsics.f(this.f100305b, esimMobilePlanPointsOption.f100305b) && Intrinsics.f(this.f100306c, esimMobilePlanPointsOption.f100306c) && this.d == esimMobilePlanPointsOption.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + v7.c(v7.c(this.f100304a.hashCode() * 31, 31, this.f100305b), 31, this.f100306c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f100304a);
        dest.writeSerializable(this.f100305b);
        dest.writeSerializable(this.f100306c);
        dest.writeInt(this.d ? 1 : 0);
    }
}
