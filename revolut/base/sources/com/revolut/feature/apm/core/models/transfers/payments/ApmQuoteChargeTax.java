package com.revolut.feature.apm.core.models.transfers.payments;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/transfers/payments/ApmQuoteChargeTax;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ApmQuoteChargeTax implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ApmQuoteChargeTax> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f62220a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f62221b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            d dVar = (d) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(ApmQuoteBreakdownItem.CREATOR, parcel, arrayList, iA, 1);
            }
            return new ApmQuoteChargeTax(dVar, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ApmQuoteChargeTax[i];
        }
    }

    public ApmQuoteChargeTax(d total, List breakdown) {
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
        this.f62220a = total;
        this.f62221b = breakdown;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ApmQuoteChargeTax)) {
            return false;
        }
        ApmQuoteChargeTax apmQuoteChargeTax = (ApmQuoteChargeTax) obj2;
        return Intrinsics.f(this.f62220a, apmQuoteChargeTax.f62220a) && Intrinsics.f(this.f62221b, apmQuoteChargeTax.f62221b);
    }

    public final int hashCode() {
        return this.f62221b.hashCode() + (this.f62220a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f62220a);
        Iterator itV = p.a.v(this.f62221b, dest);
        while (itV.hasNext()) {
            ((ApmQuoteBreakdownItem) itV.next()).writeToParcel(dest, i);
        }
    }
}
