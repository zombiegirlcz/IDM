package com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.transfer.core.models.FundingSource;
import dj0.d;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import krf.c;
import mx0.m3;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/payment_links/impl/ui_kompot/transfer/PaymentLinksTransferData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_payments_payment_links_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentLinksTransferData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PaymentLinksTransferData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f102234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f102235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f102236c;
    public final FundingSource d;
    public final AccountId e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f102237g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m3 f102238h;
    public final c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final d f102239j;
    public final boolean k;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PaymentLinksTransferData(parcel.readLong(), (b) parcel.readSerializable(), (b) parcel.readSerializable(), (FundingSource) parcel.readParcelable(PaymentLinksTransferData.class.getClassLoader()), (AccountId) parcel.readParcelable(PaymentLinksTransferData.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : m3.valueOf(parcel.readString()), (c) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PaymentLinksTransferData[i];
        }
    }

    public PaymentLinksTransferData(long j2, b targetCurrency, b baseCurrency, FundingSource fundingSource, AccountId accountId, String note, String gifUrl, m3 m3Var, c cVar) {
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(fundingSource, "fundingSource");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(note, "note");
        Intrinsics.checkNotNullParameter(gifUrl, "gifUrl");
        this.f102234a = j2;
        this.f102235b = targetCurrency;
        this.f102236c = baseCurrency;
        this.d = fundingSource;
        this.e = accountId;
        this.f = note;
        this.f102237g = gifUrl;
        this.f102238h = m3Var;
        this.i = cVar;
        this.f102239j = new d(j2, targetCurrency);
        this.k = !Intrinsics.f(fundingSource.f92241b, targetCurrency);
    }

    public static PaymentLinksTransferData a(PaymentLinksTransferData paymentLinksTransferData, long j2, b bVar, FundingSource fundingSource, AccountId accountId, String str, String str2, c cVar, int i) {
        long j3 = (i & 1) != 0 ? paymentLinksTransferData.f102234a : j2;
        b targetCurrency = (i & 2) != 0 ? paymentLinksTransferData.f102235b : bVar;
        b baseCurrency = paymentLinksTransferData.f102236c;
        FundingSource fundingSource2 = (i & 8) != 0 ? paymentLinksTransferData.d : fundingSource;
        AccountId accountId2 = (i & 16) != 0 ? paymentLinksTransferData.e : accountId;
        String note = (i & 32) != 0 ? paymentLinksTransferData.f : str;
        String gifUrl = (i & 64) != 0 ? paymentLinksTransferData.f102237g : str2;
        m3 m3Var = paymentLinksTransferData.f102238h;
        c cVar2 = (i & 256) != 0 ? paymentLinksTransferData.i : cVar;
        paymentLinksTransferData.getClass();
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(fundingSource2, "fundingSource");
        Intrinsics.checkNotNullParameter(accountId2, "accountId");
        Intrinsics.checkNotNullParameter(note, "note");
        Intrinsics.checkNotNullParameter(gifUrl, "gifUrl");
        return new PaymentLinksTransferData(j3, targetCurrency, baseCurrency, fundingSource2, accountId2, note, gifUrl, m3Var, cVar2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PaymentLinksTransferData)) {
            return false;
        }
        PaymentLinksTransferData paymentLinksTransferData = (PaymentLinksTransferData) obj2;
        return this.f102234a == paymentLinksTransferData.f102234a && Intrinsics.f(this.f102235b, paymentLinksTransferData.f102235b) && Intrinsics.f(this.f102236c, paymentLinksTransferData.f102236c) && Intrinsics.f(this.d, paymentLinksTransferData.d) && Intrinsics.f(this.e, paymentLinksTransferData.e) && Intrinsics.f(this.f, paymentLinksTransferData.f) && Intrinsics.f(this.f102237g, paymentLinksTransferData.f102237g) && this.f102238h == paymentLinksTransferData.f102238h && Intrinsics.f(this.i, paymentLinksTransferData.i);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(l.b(this.e, (this.d.hashCode() + l.j(this.f102236c, l.j(this.f102235b, Long.hashCode(this.f102234a) * 31, 31), 31)) * 31, 31), 31, this.f), 31, this.f102237g);
        m3 m3Var = this.f102238h;
        int iHashCode = (iC + (m3Var == null ? 0 : m3Var.hashCode())) * 31;
        c cVar = this.i;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f102234a);
        dest.writeSerializable(this.f102235b);
        dest.writeSerializable(this.f102236c);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeString(this.f);
        dest.writeString(this.f102237g);
        m3 m3Var = this.f102238h;
        if (m3Var == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(m3Var.name());
        }
        dest.writeSerializable(this.i);
    }
}
