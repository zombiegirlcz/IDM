package com.revolut.feature.pockets.impl.details_v2.pocket_details.multi_iban.virtual_iban_bottomsheet;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/pockets/impl/details_v2/pocket_details/multi_iban/virtual_iban_bottomsheet/VirtualIbanBottomSheetScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_pockets_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VirtualIbanBottomSheetScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<VirtualIbanBottomSheetScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f80876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wi0.b f80877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AnalyticsProduct f80878c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new VirtualIbanBottomSheetScreenContract$InputData((b) parcel.readSerializable(), (wi0.b) parcel.readSerializable(), (AnalyticsProduct) parcel.readParcelable(VirtualIbanBottomSheetScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VirtualIbanBottomSheetScreenContract$InputData[i];
        }
    }

    public VirtualIbanBottomSheetScreenContract$InputData(b currency, wi0.b countryCode, AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f80876a = currency;
        this.f80877b = countryCode;
        this.f80878c = analyticsProduct;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof VirtualIbanBottomSheetScreenContract$InputData)) {
            return false;
        }
        VirtualIbanBottomSheetScreenContract$InputData virtualIbanBottomSheetScreenContract$InputData = (VirtualIbanBottomSheetScreenContract$InputData) obj2;
        return Intrinsics.f(this.f80876a, virtualIbanBottomSheetScreenContract$InputData.f80876a) && Intrinsics.f(this.f80877b, virtualIbanBottomSheetScreenContract$InputData.f80877b) && Intrinsics.f(this.f80878c, virtualIbanBottomSheetScreenContract$InputData.f80878c);
    }

    public final int hashCode() {
        return this.f80878c.hashCode() + p.a.c(this.f80876a.hashCode() * 31, 31, this.f80877b.f297794a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f80876a);
        dest.writeSerializable(this.f80877b);
        dest.writeParcelable(this.f80878c, i);
    }
}
