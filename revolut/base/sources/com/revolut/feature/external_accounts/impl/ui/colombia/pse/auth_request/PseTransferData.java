package com.revolut.feature.external_accounts.impl.ui.colombia.pse.auth_request;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.transfer.core.models.FundingSource;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m02.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/external_accounts/impl/ui/colombia/pse/auth_request/PseTransferData;", "Landroid/os/Parcelable;", "Lm02/b;", "", "toString", "()Ljava/lang/String;", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PseTransferData implements Parcelable, b {

    @NotNull
    public static final Parcelable.Creator<PseTransferData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FundingSource f72728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f72729b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PseTransferData((FundingSource) parcel.readParcelable(PseTransferData.class.getClassLoader()), (d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PseTransferData[i];
        }
    }

    public PseTransferData(FundingSource fundingSource, d targetMoney) {
        Intrinsics.checkNotNullParameter(fundingSource, "fundingSource");
        Intrinsics.checkNotNullParameter(targetMoney, "targetMoney");
        this.f72728a = fundingSource;
        this.f72729b = targetMoney;
    }

    @Override // m02.b
    /* JADX INFO: renamed from: a, reason: from getter */
    public final FundingSource getF72728a() {
        return this.f72728a;
    }

    @Override // m02.b
    public final xi0.b b() {
        return this.f72728a.f92241b;
    }

    @Override // m02.b
    /* JADX INFO: renamed from: c, reason: from getter */
    public final d getF72729b() {
        return this.f72729b;
    }

    @Override // m02.b
    public final boolean d() {
        return !Intrinsics.f(this.f72729b.f115083b, this.f72728a.f92241b);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PseTransferData)) {
            return false;
        }
        PseTransferData pseTransferData = (PseTransferData) obj2;
        return Intrinsics.f(this.f72728a, pseTransferData.f72728a) && Intrinsics.f(this.f72729b, pseTransferData.f72729b);
    }

    public final int hashCode() {
        return this.f72729b.hashCode() + (this.f72728a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f72728a, i);
        dest.writeSerializable(this.f72729b);
    }
}
