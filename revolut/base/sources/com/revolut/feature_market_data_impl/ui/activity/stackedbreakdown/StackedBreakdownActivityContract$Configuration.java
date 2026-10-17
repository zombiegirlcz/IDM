package com.revolut.feature_market_data_impl.ui.activity.stackedbreakdown;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.feature_market_data_api.models.OrderQuoteParamsVariant;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_market_data_impl/ui/activity/stackedbreakdown/StackedBreakdownActivityContract$Configuration", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_market_data_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StackedBreakdownActivityContract$Configuration implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<StackedBreakdownActivityContract$Configuration> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Screen f97159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OrderQuoteParamsVariant f97160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c4i.a f97161c;
    public final AnalyticsProduct d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new StackedBreakdownActivityContract$Configuration((Screen) parcel.readParcelable(StackedBreakdownActivityContract$Configuration.class.getClassLoader()), (OrderQuoteParamsVariant) parcel.readParcelable(StackedBreakdownActivityContract$Configuration.class.getClassLoader()), c4i.a.valueOf(parcel.readString()), (AnalyticsProduct) parcel.readParcelable(StackedBreakdownActivityContract$Configuration.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StackedBreakdownActivityContract$Configuration[i];
        }
    }

    public StackedBreakdownActivityContract$Configuration(Screen initialScreen, OrderQuoteParamsVariant orderQuoteParamsVariant, c4i.a transactionType, AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(initialScreen, "initialScreen");
        Intrinsics.checkNotNullParameter(transactionType, "transactionType");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f97159a = initialScreen;
        this.f97160b = orderQuoteParamsVariant;
        this.f97161c = transactionType;
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
        if (!(obj2 instanceof StackedBreakdownActivityContract$Configuration)) {
            return false;
        }
        StackedBreakdownActivityContract$Configuration stackedBreakdownActivityContract$Configuration = (StackedBreakdownActivityContract$Configuration) obj2;
        return Intrinsics.f(this.f97159a, stackedBreakdownActivityContract$Configuration.f97159a) && Intrinsics.f(this.f97160b, stackedBreakdownActivityContract$Configuration.f97160b) && this.f97161c == stackedBreakdownActivityContract$Configuration.f97161c && Intrinsics.f(this.d, stackedBreakdownActivityContract$Configuration.d);
    }

    public final int hashCode() {
        int iHashCode = this.f97159a.hashCode() * 31;
        OrderQuoteParamsVariant orderQuoteParamsVariant = this.f97160b;
        return this.d.hashCode() + ((this.f97161c.hashCode() + ((iHashCode + (orderQuoteParamsVariant == null ? 0 : orderQuoteParamsVariant.hashCode())) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f97159a, i);
        dest.writeParcelable(this.f97160b, i);
        dest.writeString(this.f97161c.name());
        dest.writeParcelable(this.d, i);
    }
}
