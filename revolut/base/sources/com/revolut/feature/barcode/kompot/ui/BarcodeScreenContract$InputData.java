package com.revolut.feature.barcode.kompot.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.kompot.common.IOData$Input;
import dr2.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/feature/barcode/kompot/ui/BarcodeScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "dr2/e", "feature_barcode_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BarcodeScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BarcodeScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BarcodeScreenContract$NavBarConfig f64121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BarcodeScreenContract$ActionButtonConfig f64122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f64123c;
    public final AnalyticsProduct d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BarcodeScreenContract$InputData((BarcodeScreenContract$NavBarConfig) parcel.readParcelable(BarcodeScreenContract$InputData.class.getClassLoader()), (BarcodeScreenContract$ActionButtonConfig) parcel.readParcelable(BarcodeScreenContract$InputData.class.getClassLoader()), e.valueOf(parcel.readString()), (AnalyticsProduct) parcel.readParcelable(BarcodeScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BarcodeScreenContract$InputData[i];
        }
    }

    public BarcodeScreenContract$InputData(BarcodeScreenContract$NavBarConfig navBarConfig, BarcodeScreenContract$ActionButtonConfig actionButtonConfig, e barcodeObservationStrategy, AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(navBarConfig, "navBarConfig");
        Intrinsics.checkNotNullParameter(actionButtonConfig, "actionButtonConfig");
        Intrinsics.checkNotNullParameter(barcodeObservationStrategy, "barcodeObservationStrategy");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f64121a = navBarConfig;
        this.f64122b = actionButtonConfig;
        this.f64123c = barcodeObservationStrategy;
        this.d = analyticsProduct;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BarcodeScreenContract$InputData)) {
            return false;
        }
        BarcodeScreenContract$InputData barcodeScreenContract$InputData = (BarcodeScreenContract$InputData) obj2;
        return Intrinsics.f(this.f64121a, barcodeScreenContract$InputData.f64121a) && Intrinsics.f(this.f64122b, barcodeScreenContract$InputData.f64122b) && this.f64123c == barcodeScreenContract$InputData.f64123c && Intrinsics.f(this.d, barcodeScreenContract$InputData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f64123c.hashCode() + ((this.f64122b.hashCode() + (this.f64121a.hashCode() * 31)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f64121a, i);
        dest.writeParcelable(this.f64122b, i);
        dest.writeString(this.f64123c.name());
        dest.writeParcelable(this.d, i);
    }
}
