package com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.retail.feature.payments.bank_transfer.api.domain.model.RemittanceRouteId;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.TransferNote;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import dj0.d;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kq2.o;
import org.jetbrains.annotations.NotNull;
import rtf.c;
import xi0.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/payments/bank_transfer/impl/remittance_kompot/transfer/RemittanceTransferData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_payments_bank_transfer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RemittanceTransferData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RemittanceTransferData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f102049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f102050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f102051c;
    public final FundingSource d;
    public final AccountId e;
    public final TransferNote f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c f102052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m1l.a f102053h;
    public final TransferScheduleData i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final RemittanceRouteId f102054j;
    public final kq2.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f102055l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o f102056m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d f102057n;
    public final boolean o;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RemittanceTransferData(parcel.readLong(), (b) parcel.readSerializable(), (b) parcel.readSerializable(), (FundingSource) parcel.readParcelable(RemittanceTransferData.class.getClassLoader()), (AccountId) parcel.readParcelable(RemittanceTransferData.class.getClassLoader()), (TransferNote) parcel.readParcelable(RemittanceTransferData.class.getClassLoader()), (c) parcel.readSerializable(), m1l.a.valueOf(parcel.readString()), (TransferScheduleData) parcel.readParcelable(RemittanceTransferData.class.getClassLoader()), (RemittanceRouteId) parcel.readParcelable(RemittanceTransferData.class.getClassLoader()), parcel.readInt() == 0 ? null : kq2.c.valueOf(parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0 ? o.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RemittanceTransferData[i];
        }
    }

    public RemittanceTransferData(long j2, b targetCurrency, b sourceCurrency, FundingSource fundingSource, AccountId accountId, TransferNote note, c cVar, m1l.a scheduleMode, TransferScheduleData scheduleData, RemittanceRouteId currentRouteId, kq2.c cVar2, boolean z, o oVar) {
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(fundingSource, "fundingSource");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(note, "note");
        Intrinsics.checkNotNullParameter(scheduleMode, "scheduleMode");
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        Intrinsics.checkNotNullParameter(currentRouteId, "currentRouteId");
        this.f102049a = j2;
        this.f102050b = targetCurrency;
        this.f102051c = sourceCurrency;
        this.d = fundingSource;
        this.e = accountId;
        this.f = note;
        this.f102052g = cVar;
        this.f102053h = scheduleMode;
        this.i = scheduleData;
        this.f102054j = currentRouteId;
        this.k = cVar2;
        this.f102055l = z;
        this.f102056m = oVar;
        this.f102057n = new d(j2, targetCurrency);
        this.o = !Intrinsics.f(sourceCurrency, targetCurrency);
    }

    public static RemittanceTransferData a(RemittanceTransferData remittanceTransferData, long j2, b bVar, b bVar2, FundingSource fundingSource, AccountId accountId, TransferNote.SimpleNote simpleNote, c cVar, TransferScheduleData transferScheduleData, RemittanceRouteId remittanceRouteId, kq2.c cVar2, o oVar, int i) {
        long j3 = (i & 1) != 0 ? remittanceTransferData.f102049a : j2;
        b targetCurrency = (i & 2) != 0 ? remittanceTransferData.f102050b : bVar;
        b sourceCurrency = (i & 4) != 0 ? remittanceTransferData.f102051c : bVar2;
        FundingSource fundingSource2 = (i & 8) != 0 ? remittanceTransferData.d : fundingSource;
        AccountId accountId2 = (i & 16) != 0 ? remittanceTransferData.e : accountId;
        TransferNote note = (i & 32) != 0 ? remittanceTransferData.f : simpleNote;
        c cVar3 = (i & 64) != 0 ? remittanceTransferData.f102052g : cVar;
        m1l.a scheduleMode = remittanceTransferData.f102053h;
        TransferScheduleData scheduleData = (i & 256) != 0 ? remittanceTransferData.i : transferScheduleData;
        RemittanceRouteId currentRouteId = (i & 512) != 0 ? remittanceTransferData.f102054j : remittanceRouteId;
        kq2.c cVar4 = (i & 1024) != 0 ? remittanceTransferData.k : cVar2;
        boolean z = remittanceTransferData.f102055l;
        o oVar2 = (i & 4096) != 0 ? remittanceTransferData.f102056m : oVar;
        remittanceTransferData.getClass();
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(fundingSource2, "fundingSource");
        Intrinsics.checkNotNullParameter(accountId2, "accountId");
        Intrinsics.checkNotNullParameter(note, "note");
        Intrinsics.checkNotNullParameter(scheduleMode, "scheduleMode");
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        Intrinsics.checkNotNullParameter(currentRouteId, "currentRouteId");
        return new RemittanceTransferData(j3, targetCurrency, sourceCurrency, fundingSource2, accountId2, note, cVar3, scheduleMode, scheduleData, currentRouteId, cVar4, z, oVar2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RemittanceTransferData)) {
            return false;
        }
        RemittanceTransferData remittanceTransferData = (RemittanceTransferData) obj2;
        return this.f102049a == remittanceTransferData.f102049a && Intrinsics.f(this.f102050b, remittanceTransferData.f102050b) && Intrinsics.f(this.f102051c, remittanceTransferData.f102051c) && Intrinsics.f(this.d, remittanceTransferData.d) && Intrinsics.f(this.e, remittanceTransferData.e) && Intrinsics.f(this.f, remittanceTransferData.f) && Intrinsics.f(this.f102052g, remittanceTransferData.f102052g) && this.f102053h == remittanceTransferData.f102053h && Intrinsics.f(this.i, remittanceTransferData.i) && Intrinsics.f(this.f102054j, remittanceTransferData.f102054j) && this.k == remittanceTransferData.k && this.f102055l == remittanceTransferData.f102055l && this.f102056m == remittanceTransferData.f102056m;
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + l.b(this.e, (this.d.hashCode() + l.j(this.f102051c, l.j(this.f102050b, Long.hashCode(this.f102049a) * 31, 31), 31)) * 31, 31)) * 31;
        c cVar = this.f102052g;
        int iHashCode2 = (this.f102054j.hashCode() + l.f(this.i, (this.f102053h.hashCode() + ((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31)) * 31, 31)) * 31;
        kq2.c cVar2 = this.k;
        int iC = j6.a.c((iHashCode2 + (cVar2 == null ? 0 : cVar2.hashCode())) * 31, 31, this.f102055l);
        o oVar = this.f102056m;
        return iC + (oVar != null ? oVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeLong(this.f102049a);
        dest.writeSerializable(this.f102050b);
        dest.writeSerializable(this.f102051c);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
        dest.writeSerializable(this.f102052g);
        dest.writeString(this.f102053h.name());
        dest.writeParcelable(this.i, i);
        dest.writeParcelable(this.f102054j, i);
        kq2.c cVar = this.k;
        if (cVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(cVar.name());
        }
        dest.writeInt(this.f102055l ? 1 : 0);
        o oVar = this.f102056m;
        if (oVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(oVar.name());
        }
    }
}
