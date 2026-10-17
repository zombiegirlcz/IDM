package com.revolut.feature.apm.core.models.transfers.payments;

import android.os.Parcel;
import android.os.Parcelable;
import dj0.d;
import ip0.v7;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pd.b;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/transfers/payments/ApmQuote;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ApmQuote implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ApmQuote> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmQuoteRate f62209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f62210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f62211c;
    public final ApmQuoteCharges d;
    public final ApmQuoteLimits e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f62212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f62213h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApmQuote(parcel.readInt() == 0 ? null : ApmQuoteRate.CREATOR.createFromParcel(parcel), (d) parcel.readSerializable(), (d) parcel.readSerializable(), parcel.readInt() == 0 ? null : ApmQuoteCharges.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ApmQuoteLimits.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ApmQuote[i];
        }
    }

    public ApmQuote(ApmQuoteRate apmQuoteRate, d recipientAmount, d billAmount, ApmQuoteCharges apmQuoteCharges, ApmQuoteLimits apmQuoteLimits, boolean z) {
        d dVar;
        Intrinsics.checkNotNullParameter(recipientAmount, "recipientAmount");
        Intrinsics.checkNotNullParameter(billAmount, "billAmount");
        this.f62209a = apmQuoteRate;
        this.f62210b = recipientAmount;
        this.f62211c = billAmount;
        this.d = apmQuoteCharges;
        this.e = apmQuoteLimits;
        this.f = z;
        this.f62212g = new d(apmQuoteCharges != null ? billAmount.f115082a + apmQuoteCharges.f62222a.f115082a : billAmount.f115082a, billAmount.f115083b);
        this.f62213h = b.j((apmQuoteCharges == null || (dVar = apmQuoteCharges.f62222a) == null) ? null : Boolean.valueOf(!dVar.k()));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ApmQuote)) {
            return false;
        }
        ApmQuote apmQuote = (ApmQuote) obj2;
        return Intrinsics.f(this.f62209a, apmQuote.f62209a) && Intrinsics.f(this.f62210b, apmQuote.f62210b) && Intrinsics.f(this.f62211c, apmQuote.f62211c) && Intrinsics.f(this.d, apmQuote.d) && Intrinsics.f(this.e, apmQuote.e) && this.f == apmQuote.f;
    }

    public final int hashCode() {
        ApmQuoteRate apmQuoteRate = this.f62209a;
        int iC = v7.c(v7.c((apmQuoteRate == null ? 0 : apmQuoteRate.hashCode()) * 31, 31, this.f62210b), 31, this.f62211c);
        ApmQuoteCharges apmQuoteCharges = this.d;
        int iHashCode = (iC + (apmQuoteCharges == null ? 0 : apmQuoteCharges.hashCode())) * 31;
        ApmQuoteLimits apmQuoteLimits = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode + (apmQuoteLimits != null ? apmQuoteLimits.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        ApmQuoteRate apmQuoteRate = this.f62209a;
        if (apmQuoteRate == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            apmQuoteRate.writeToParcel(dest, i);
        }
        dest.writeSerializable(this.f62210b);
        dest.writeSerializable(this.f62211c);
        ApmQuoteCharges apmQuoteCharges = this.d;
        if (apmQuoteCharges == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            apmQuoteCharges.writeToParcel(dest, i);
        }
        ApmQuoteLimits apmQuoteLimits = this.e;
        if (apmQuoteLimits == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            apmQuoteLimits.writeToParcel(dest, i);
        }
        dest.writeInt(this.f ? 1 : 0);
    }
}
