package com.revolut.feature.payments_migration.impl.ui.screen.move_payment.account_details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments_migration.impl.models.providers.Provider;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/payments_migration/impl/ui/screen/move_payment/account_details/AccountDetailsPaymentControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_payments_migration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccountDetailsPaymentControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AccountDetailsPaymentControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f80271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f80272b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccountDetailsPaymentControllerContract$InputData(parcel.readInt() == 0 ? null : Provider.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AccountDetailsPaymentControllerContract$InputData[i];
        }
    }

    public AccountDetailsPaymentControllerContract$InputData(Provider provider, boolean z) {
        this.f80271a = provider;
        this.f80272b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AccountDetailsPaymentControllerContract$InputData)) {
            return false;
        }
        AccountDetailsPaymentControllerContract$InputData accountDetailsPaymentControllerContract$InputData = (AccountDetailsPaymentControllerContract$InputData) obj2;
        return Intrinsics.f(this.f80271a, accountDetailsPaymentControllerContract$InputData.f80271a) && this.f80272b == accountDetailsPaymentControllerContract$InputData.f80272b;
    }

    public final int hashCode() {
        Provider provider = this.f80271a;
        return Boolean.hashCode(this.f80272b) + ((provider == null ? 0 : provider.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Provider provider = this.f80271a;
        if (provider == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            provider.writeToParcel(dest, i);
        }
        dest.writeInt(this.f80272b ? 1 : 0);
    }
}
