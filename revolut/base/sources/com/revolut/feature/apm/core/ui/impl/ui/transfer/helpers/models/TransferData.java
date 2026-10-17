package com.revolut.feature.apm.core.ui.impl.ui.transfer.helpers.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.apm.core.models.transfers.ApmTransferPayerSettings;
import com.revolut.feature.transfer.core.models.FundingSource;
import com.revolut.retail.feature.transfer.schedule.models.TransferScheduleData;
import dj0.d;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m02.b;
import org.jetbrains.annotations.NotNull;
import rtf.c;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/core/ui/impl/ui/transfer/helpers/models/TransferData;", "Landroid/os/Parcelable;", "Lm02/b;", "", "toString", "()Ljava/lang/String;", "feature_apm_core_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransferData implements Parcelable, b {

    @NotNull
    public static final Parcelable.Creator<TransferData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FundingSource f62453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f62454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f62455c;
    public final AccountId d;
    public final String e;
    public final ApmTransferPayerSettings f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TransferScheduleData f62456g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c f62457h;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TransferData((FundingSource) parcel.readParcelable(TransferData.class.getClassLoader()), parcel.readLong(), (xi0.b) parcel.readSerializable(), (AccountId) parcel.readParcelable(TransferData.class.getClassLoader()), parcel.readString(), (ApmTransferPayerSettings) parcel.readParcelable(TransferData.class.getClassLoader()), (TransferScheduleData) parcel.readParcelable(TransferData.class.getClassLoader()), (c) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TransferData[i];
        }
    }

    public TransferData(FundingSource fundingSource, long j2, xi0.b targetCurrency, AccountId accountId, String note, ApmTransferPayerSettings apmTransferPayerSettings, TransferScheduleData scheduleData, c cVar) {
        Intrinsics.checkNotNullParameter(fundingSource, "fundingSource");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(note, "note");
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        this.f62453a = fundingSource;
        this.f62454b = j2;
        this.f62455c = targetCurrency;
        this.d = accountId;
        this.e = note;
        this.f = apmTransferPayerSettings;
        this.f62456g = scheduleData;
        this.f62457h = cVar;
    }

    public static TransferData e(TransferData transferData, FundingSource fundingSource, long j2, AccountId accountId, String str, ApmTransferPayerSettings apmTransferPayerSettings, TransferScheduleData transferScheduleData, c cVar, int i) {
        if ((i & 1) != 0) {
            fundingSource = transferData.f62453a;
        }
        FundingSource fundingSource2 = fundingSource;
        if ((i & 2) != 0) {
            j2 = transferData.f62454b;
        }
        long j3 = j2;
        xi0.b targetCurrency = transferData.f62455c;
        if ((i & 8) != 0) {
            accountId = transferData.d;
        }
        AccountId accountId2 = accountId;
        if ((i & 16) != 0) {
            str = transferData.e;
        }
        String note = str;
        ApmTransferPayerSettings apmTransferPayerSettings2 = (i & 32) != 0 ? transferData.f : apmTransferPayerSettings;
        TransferScheduleData scheduleData = (i & 64) != 0 ? transferData.f62456g : transferScheduleData;
        c cVar2 = (i & 128) != 0 ? transferData.f62457h : cVar;
        transferData.getClass();
        Intrinsics.checkNotNullParameter(fundingSource2, "fundingSource");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(accountId2, "accountId");
        Intrinsics.checkNotNullParameter(note, "note");
        Intrinsics.checkNotNullParameter(scheduleData, "scheduleData");
        return new TransferData(fundingSource2, j3, targetCurrency, accountId2, note, apmTransferPayerSettings2, scheduleData, cVar2);
    }

    @Override // m02.b
    /* JADX INFO: renamed from: a, reason: from getter */
    public final FundingSource getF62453a() {
        return this.f62453a;
    }

    @Override // m02.b
    public final xi0.b b() {
        return this.f62453a.f92241b;
    }

    @Override // m02.b
    public final d c() {
        return new d(this.f62454b, this.f62455c);
    }

    @Override // m02.b
    public final boolean d() {
        return !Intrinsics.f(this.f62455c, this.f62453a.f92241b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TransferData)) {
            return false;
        }
        TransferData transferData = (TransferData) obj2;
        return Intrinsics.f(this.f62453a, transferData.f62453a) && this.f62454b == transferData.f62454b && Intrinsics.f(this.f62455c, transferData.f62455c) && Intrinsics.f(this.d, transferData.d) && Intrinsics.f(this.e, transferData.e) && Intrinsics.f(this.f, transferData.f) && Intrinsics.f(this.f62456g, transferData.f62456g) && Intrinsics.f(this.f62457h, transferData.f62457h);
    }

    public final int hashCode() {
        int iC = p.a.c(l.b(this.d, l.j(this.f62455c, a0.d.c(this.f62453a.hashCode() * 31, 31, this.f62454b), 31), 31), 31, this.e);
        ApmTransferPayerSettings apmTransferPayerSettings = this.f;
        int iF = l.f(this.f62456g, (iC + (apmTransferPayerSettings == null ? 0 : apmTransferPayerSettings.hashCode())) * 31, 31);
        c cVar = this.f62457h;
        return iF + (cVar != null ? cVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f62453a, i);
        dest.writeLong(this.f62454b);
        dest.writeSerializable(this.f62455c);
        dest.writeParcelable(this.d, i);
        dest.writeString(this.e);
        dest.writeParcelable(this.f, i);
        dest.writeParcelable(this.f62456g, i);
        dest.writeSerializable(this.f62457h);
    }
}
