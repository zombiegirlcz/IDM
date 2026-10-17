package com.revolut.retail.feature.esim.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/esim/api/model/EsimMobilePlanSummaryItemGroup;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimMobilePlanSummaryItemGroup implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimMobilePlanSummaryItemGroup> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f100316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f100317b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(EsimMobilePlanSummaryItem.CREATOR, parcel, arrayList, iA, 1);
            }
            return new EsimMobilePlanSummaryItemGroup(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimMobilePlanSummaryItemGroup[i];
        }
    }

    public EsimMobilePlanSummaryItemGroup(String str, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f100316a = str;
        this.f100317b = items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EsimMobilePlanSummaryItemGroup)) {
            return false;
        }
        EsimMobilePlanSummaryItemGroup esimMobilePlanSummaryItemGroup = (EsimMobilePlanSummaryItemGroup) obj2;
        return Intrinsics.f(this.f100316a, esimMobilePlanSummaryItemGroup.f100316a) && this.f100317b.equals(esimMobilePlanSummaryItemGroup.f100317b);
    }

    public final int hashCode() {
        String str = this.f100316a;
        return this.f100317b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f100316a);
        Iterator itY = j6.a.y(this.f100317b, dest);
        while (itY.hasNext()) {
            ((EsimMobilePlanSummaryItem) itY.next()).writeToParcel(dest, i);
        }
    }
}
