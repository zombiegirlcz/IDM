package com.revolut.feature.apm.core.models.transfers.payments;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/transfers/payments/ApmQuoteChargeFee;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ApmQuoteChargeFee implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ApmQuoteChargeFee> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f62217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f62218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f62219c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            d dVar = (d) parcel.readSerializable();
            int iA = 0;
            boolean z = parcel.readInt() != 0;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(ApmQuoteBreakdownItem.CREATOR, parcel, arrayList, iA, 1);
            }
            return new ApmQuoteChargeFee(dVar, z, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ApmQuoteChargeFee[i];
        }
    }

    public ApmQuoteChargeFee(d total, boolean z, ArrayList breakdown) {
        Intrinsics.checkNotNullParameter(total, "total");
        Intrinsics.checkNotNullParameter(breakdown, "breakdown");
        this.f62217a = total;
        this.f62218b = z;
        this.f62219c = breakdown;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ApmQuoteChargeFee)) {
            return false;
        }
        ApmQuoteChargeFee apmQuoteChargeFee = (ApmQuoteChargeFee) obj2;
        return Intrinsics.f(this.f62217a, apmQuoteChargeFee.f62217a) && this.f62218b == apmQuoteChargeFee.f62218b && this.f62219c.equals(apmQuoteChargeFee.f62219c);
    }

    public final int hashCode() {
        return this.f62219c.hashCode() + j6.a.c(this.f62217a.hashCode() * 31, 31, this.f62218b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f62217a);
        dest.writeInt(this.f62218b ? 1 : 0);
        Iterator itY = j6.a.y(this.f62219c, dest);
        while (itY.hasNext()) {
            ((ApmQuoteBreakdownItem) itY.next()).writeToParcel(dest, i);
        }
    }
}
