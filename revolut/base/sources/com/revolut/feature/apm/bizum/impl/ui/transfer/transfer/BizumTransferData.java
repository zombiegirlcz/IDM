package com.revolut.feature.apm.bizum.impl.ui.transfer.transfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.transfer.core.models.FundingSource;
import dj0.d;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/bizum/impl/ui/transfer/transfer/BizumTransferData;", "Landroid/os/Parcelable;", "Lm02/b;", "", "toString", "()Ljava/lang/String;", "feature_apm_bizum_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BizumTransferData implements Parcelable, m02.b {

    @NotNull
    public static final Parcelable.Creator<BizumTransferData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FundingSource f61631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f61632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccountId f61633c;
    public final String d;
    public final boolean e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BizumTransferData((FundingSource) parcel.readParcelable(BizumTransferData.class.getClassLoader()), parcel.readLong(), (AccountId) parcel.readParcelable(BizumTransferData.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BizumTransferData[i];
        }
    }

    public BizumTransferData(FundingSource fundingSource, long j2, AccountId accountId, String note, boolean z) {
        Intrinsics.checkNotNullParameter(fundingSource, "fundingSource");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(note, "note");
        this.f61631a = fundingSource;
        this.f61632b = j2;
        this.f61633c = accountId;
        this.d = note;
        this.e = z;
    }

    public static BizumTransferData e(BizumTransferData bizumTransferData, FundingSource fundingSource, long j2, AccountId accountId, String str, int i) {
        if ((i & 1) != 0) {
            fundingSource = bizumTransferData.f61631a;
        }
        FundingSource fundingSource2 = fundingSource;
        if ((i & 2) != 0) {
            j2 = bizumTransferData.f61632b;
        }
        long j3 = j2;
        if ((i & 4) != 0) {
            accountId = bizumTransferData.f61633c;
        }
        AccountId accountId2 = accountId;
        if ((i & 8) != 0) {
            str = bizumTransferData.d;
        }
        String note = str;
        boolean z = bizumTransferData.e;
        bizumTransferData.getClass();
        Intrinsics.checkNotNullParameter(fundingSource2, "fundingSource");
        Intrinsics.checkNotNullParameter(accountId2, "accountId");
        Intrinsics.checkNotNullParameter(note, "note");
        return new BizumTransferData(fundingSource2, j3, accountId2, note, z);
    }

    @Override // m02.b
    /* JADX INFO: renamed from: a, reason: from getter */
    public final FundingSource getF61631a() {
        return this.f61631a;
    }

    @Override // m02.b
    public final xi0.b b() {
        return this.f61631a.f92241b;
    }

    @Override // m02.b
    public final d c() {
        return new d(this.f61632b, gs1.b.f146272a);
    }

    @Override // m02.b
    public final boolean d() {
        return !Intrinsics.f(gs1.b.f146272a, this.f61631a.f92241b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BizumTransferData)) {
            return false;
        }
        BizumTransferData bizumTransferData = (BizumTransferData) obj2;
        return Intrinsics.f(this.f61631a, bizumTransferData.f61631a) && this.f61632b == bizumTransferData.f61632b && Intrinsics.f(this.f61633c, bizumTransferData.f61633c) && Intrinsics.f(this.d, bizumTransferData.d) && this.e == bizumTransferData.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + p.a.c(l.b(this.f61633c, a0.d.c(this.f61631a.hashCode() * 31, 31, this.f61632b), 31), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f61631a, i);
        dest.writeLong(this.f61632b);
        dest.writeParcelable(this.f61633c, i);
        dest.writeString(this.d);
        dest.writeInt(this.e ? 1 : 0);
    }
}
