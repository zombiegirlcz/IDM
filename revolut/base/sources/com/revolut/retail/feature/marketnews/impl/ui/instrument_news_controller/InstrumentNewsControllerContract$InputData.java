package com.revolut.retail.feature.marketnews.impl.ui.instrument_news_controller;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsCategory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/marketnews/impl/ui/instrument_news_controller/InstrumentNewsControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_market_news_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InstrumentNewsControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<InstrumentNewsControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f101857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WealthNewsCategory f101858b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InstrumentNewsControllerContract$InputData((WealthNewsCategory) parcel.readParcelable(InstrumentNewsControllerContract$InputData.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InstrumentNewsControllerContract$InputData[i];
        }
    }

    public InstrumentNewsControllerContract$InputData(WealthNewsCategory category, String assetId) {
        Intrinsics.checkNotNullParameter(assetId, "assetId");
        Intrinsics.checkNotNullParameter(category, "category");
        this.f101857a = assetId;
        this.f101858b = category;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InstrumentNewsControllerContract$InputData)) {
            return false;
        }
        InstrumentNewsControllerContract$InputData instrumentNewsControllerContract$InputData = (InstrumentNewsControllerContract$InputData) obj2;
        return Intrinsics.f(this.f101857a, instrumentNewsControllerContract$InputData.f101857a) && Intrinsics.f(this.f101858b, instrumentNewsControllerContract$InputData.f101858b);
    }

    public final int hashCode() {
        return this.f101858b.hashCode() + (this.f101857a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f101857a);
        dest.writeParcelable(this.f101858b, i);
    }
}
