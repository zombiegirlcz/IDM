package com.revolut.feature.card_design.impl.card_design.rev_points_price_breakdown;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import e93.j0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/card_design/impl/card_design/rev_points_price_breakdown/RevPointsPriceBreakdownControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "retail_feature_card_design_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevPointsPriceBreakdownControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RevPointsPriceBreakdownControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f64734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f64735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f64736c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            d dVar = (d) parcel.readSerializable();
            j0 j0Var = (j0) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iC = 0;
            while (iC != i) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            return new RevPointsPriceBreakdownControllerContract$InputData(dVar, j0Var, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsPriceBreakdownControllerContract$InputData[i];
        }
    }

    public RevPointsPriceBreakdownControllerContract$InputData(d originalPrice, j0 loyaltyQuote, List taxes) {
        Intrinsics.checkNotNullParameter(originalPrice, "originalPrice");
        Intrinsics.checkNotNullParameter(loyaltyQuote, "loyaltyQuote");
        Intrinsics.checkNotNullParameter(taxes, "taxes");
        this.f64734a = originalPrice;
        this.f64735b = loyaltyQuote;
        this.f64736c = taxes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevPointsPriceBreakdownControllerContract$InputData)) {
            return false;
        }
        RevPointsPriceBreakdownControllerContract$InputData revPointsPriceBreakdownControllerContract$InputData = (RevPointsPriceBreakdownControllerContract$InputData) obj2;
        return Intrinsics.f(this.f64734a, revPointsPriceBreakdownControllerContract$InputData.f64734a) && Intrinsics.f(this.f64735b, revPointsPriceBreakdownControllerContract$InputData.f64735b) && Intrinsics.f(this.f64736c, revPointsPriceBreakdownControllerContract$InputData.f64736c);
    }

    public final int hashCode() {
        return this.f64736c.hashCode() + ((this.f64735b.hashCode() + (this.f64734a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f64734a);
        dest.writeSerializable(this.f64735b);
        Iterator itV = p.a.v(this.f64736c, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
    }
}
