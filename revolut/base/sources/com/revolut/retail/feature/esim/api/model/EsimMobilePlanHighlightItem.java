package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimMobilePlanHighlightItem;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimMobilePlanHighlightItem implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimMobilePlanHighlightItem> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EsimIcon f100295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EsimInfoBottomSheetData f100296c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EsimMobilePlanHighlightItem(parcel.readString(), (EsimIcon) parcel.readParcelable(EsimMobilePlanHighlightItem.class.getClassLoader()), parcel.readInt() == 0 ? null : EsimInfoBottomSheetData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimMobilePlanHighlightItem[i];
        }
    }

    public EsimMobilePlanHighlightItem(String text, EsimIcon esimIcon, EsimInfoBottomSheetData esimInfoBottomSheetData) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f100294a = text;
        this.f100295b = esimIcon;
        this.f100296c = esimInfoBottomSheetData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimMobilePlanHighlightItem)) {
            return false;
        }
        EsimMobilePlanHighlightItem esimMobilePlanHighlightItem = (EsimMobilePlanHighlightItem) obj2;
        return Intrinsics.f(this.f100294a, esimMobilePlanHighlightItem.f100294a) && Intrinsics.f(this.f100295b, esimMobilePlanHighlightItem.f100295b) && Intrinsics.f(this.f100296c, esimMobilePlanHighlightItem.f100296c);
    }

    public final int hashCode() {
        int iHashCode = this.f100294a.hashCode() * 31;
        EsimIcon esimIcon = this.f100295b;
        int iHashCode2 = (iHashCode + (esimIcon == null ? 0 : esimIcon.hashCode())) * 31;
        EsimInfoBottomSheetData esimInfoBottomSheetData = this.f100296c;
        return iHashCode2 + (esimInfoBottomSheetData != null ? esimInfoBottomSheetData.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100294a);
        dest.writeParcelable(this.f100295b, i);
        EsimInfoBottomSheetData esimInfoBottomSheetData = this.f100296c;
        if (esimInfoBottomSheetData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            esimInfoBottomSheetData.writeToParcel(dest, i);
        }
    }
}
