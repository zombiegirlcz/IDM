package com.revolut.feature.cryptocommodity_invest.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.cryptocommodity_invest.models.SortingType;
import com.revolut.kompot.common.IOData$Input;
import j6.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/cryptocommodity_invest/api/navigation/CryptoSortingPickerInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_cryptocommodity_invest_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoSortingPickerInputData implements IOData$Input {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f71513c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SortingType f71514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f71515b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<CryptoSortingPickerInputData> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.feature.cryptocommodity_invest.api.navigation.CryptoSortingPickerInputData$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            SortingType sortingType = (SortingType) a.f(parcel, "parcel", CryptoSortingPickerInputData.class);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = a.e(CryptoSortingPickerInputData.class, parcel, arrayList, iE, 1);
            }
            return new CryptoSortingPickerInputData(sortingType, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoSortingPickerInputData[i];
        }
    }

    static {
        int i = 0;
        f71513c = v.k(new SortingType.MarketCap(i), new SortingType.CurrentPrice(i), new SortingType.PriceChange(i), new SortingType.MostBought(i), new SortingType.MostSold(i));
    }

    public CryptoSortingPickerInputData(SortingType selectedSortingType, List allowedSortingTypes) {
        Intrinsics.checkNotNullParameter(selectedSortingType, "selectedSortingType");
        Intrinsics.checkNotNullParameter(allowedSortingTypes, "allowedSortingTypes");
        this.f71514a = selectedSortingType;
        this.f71515b = allowedSortingTypes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoSortingPickerInputData)) {
            return false;
        }
        CryptoSortingPickerInputData cryptoSortingPickerInputData = (CryptoSortingPickerInputData) obj2;
        return Intrinsics.f(this.f71514a, cryptoSortingPickerInputData.f71514a) && Intrinsics.f(this.f71515b, cryptoSortingPickerInputData.f71515b);
    }

    public final int hashCode() {
        return this.f71515b.hashCode() + (this.f71514a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f71514a, i);
        Iterator itV = p.a.v(this.f71515b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }

    public /* synthetic */ CryptoSortingPickerInputData(SortingType sortingType) {
        this(sortingType, f71513c);
    }
}
