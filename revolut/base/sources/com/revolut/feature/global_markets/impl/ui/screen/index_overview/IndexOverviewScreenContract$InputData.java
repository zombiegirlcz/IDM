package com.revolut.feature.global_markets.impl.ui.screen.index_overview;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/global_markets/impl/ui/screen/index_overview/IndexOverviewScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_global_markets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class IndexOverviewScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<IndexOverviewScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f74612b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new IndexOverviewScreenContract$InputData(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new IndexOverviewScreenContract$InputData[i];
        }
    }

    public IndexOverviewScreenContract$InputData(String ref2, String symbol) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        this.f74611a = ref2;
        this.f74612b = symbol;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof IndexOverviewScreenContract$InputData)) {
            return false;
        }
        IndexOverviewScreenContract$InputData indexOverviewScreenContract$InputData = (IndexOverviewScreenContract$InputData) obj2;
        return Intrinsics.f(this.f74611a, indexOverviewScreenContract$InputData.f74611a) && Intrinsics.f(this.f74612b, indexOverviewScreenContract$InputData.f74612b);
    }

    public final int hashCode() {
        return this.f74612b.hashCode() + (this.f74611a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f74611a);
        dest.writeString(this.f74612b);
    }
}
