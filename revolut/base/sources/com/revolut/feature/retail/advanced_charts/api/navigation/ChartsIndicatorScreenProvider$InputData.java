package com.revolut.feature.retail.advanced_charts.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import d1b.c;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/retail/advanced_charts/api/navigation/ChartsIndicatorScreenProvider$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_advanced_charts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChartsIndicatorScreenProvider$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ChartsIndicatorScreenProvider$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f82069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f82070b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashSet.add(c.valueOf(parcel.readString()));
            }
            return new ChartsIndicatorScreenProvider$InputData(linkedHashSet, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChartsIndicatorScreenProvider$InputData[i];
        }
    }

    public ChartsIndicatorScreenProvider$InputData(Set selectedIndicators, boolean z) {
        Intrinsics.checkNotNullParameter(selectedIndicators, "selectedIndicators");
        this.f82069a = selectedIndicators;
        this.f82070b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ChartsIndicatorScreenProvider$InputData)) {
            return false;
        }
        ChartsIndicatorScreenProvider$InputData chartsIndicatorScreenProvider$InputData = (ChartsIndicatorScreenProvider$InputData) obj2;
        return Intrinsics.f(this.f82069a, chartsIndicatorScreenProvider$InputData.f82069a) && this.f82070b == chartsIndicatorScreenProvider$InputData.f82070b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f82070b) + (this.f82069a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = n.v(this.f82069a, dest);
        while (itV.hasNext()) {
            dest.writeString(((c) itV.next()).name());
        }
        dest.writeInt(this.f82070b ? 1 : 0);
    }
}
