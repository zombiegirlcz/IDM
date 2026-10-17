package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimMobilePlanSummaryItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimMobilePlanSummaryItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimMobilePlanSummaryItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f100314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimInfoBottomSheetData f100315c;
    public final EsimIcon d;
    public final EsimCoverage e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimMobilePlanSummaryItem(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : EsimInfoBottomSheetData.CREATOR.createFromParcel(parcel), (EsimIcon) parcel.readParcelable(EsimMobilePlanSummaryItem.class.getClassLoader()), (EsimCoverage) parcel.readParcelable(EsimMobilePlanSummaryItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimMobilePlanSummaryItem[i];
        }
    }

    public EsimMobilePlanSummaryItem(String key, String value, EsimInfoBottomSheetData esimInfoBottomSheetData, EsimIcon esimIcon, EsimCoverage esimCoverage) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f100313a = key;
        this.f100314b = value;
        this.f100315c = esimInfoBottomSheetData;
        this.d = esimIcon;
        this.e = esimCoverage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimMobilePlanSummaryItem)) {
            return false;
        }
        EsimMobilePlanSummaryItem esimMobilePlanSummaryItem = (EsimMobilePlanSummaryItem) obj2;
        return Intrinsics.f(this.f100313a, esimMobilePlanSummaryItem.f100313a) && Intrinsics.f(this.f100314b, esimMobilePlanSummaryItem.f100314b) && Intrinsics.f(this.f100315c, esimMobilePlanSummaryItem.f100315c) && Intrinsics.f(this.d, esimMobilePlanSummaryItem.d) && Intrinsics.f(this.e, esimMobilePlanSummaryItem.e);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f100313a.hashCode() * 31, 31, this.f100314b);
        EsimInfoBottomSheetData esimInfoBottomSheetData = this.f100315c;
        int iHashCode = (iC + (esimInfoBottomSheetData == null ? 0 : esimInfoBottomSheetData.hashCode())) * 31;
        EsimIcon esimIcon = this.d;
        int iHashCode2 = (iHashCode + (esimIcon == null ? 0 : esimIcon.hashCode())) * 31;
        EsimCoverage esimCoverage = this.e;
        return iHashCode2 + (esimCoverage != null ? esimCoverage.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100313a);
        dest.writeString(this.f100314b);
        EsimInfoBottomSheetData esimInfoBottomSheetData = this.f100315c;
        if (esimInfoBottomSheetData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimInfoBottomSheetData.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
    }
}
