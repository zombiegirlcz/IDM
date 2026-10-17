package com.revolut.feature.payments_migration.impl.ui.screen.move_payment.cards;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.payments_migration.impl.models.providers.Provider;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/payments_migration/impl/ui/screen/move_payment/cards/CardsPaymentControllerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_payments_migration_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CardsPaymentControllerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CardsPaymentControllerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Provider f80281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f80282b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CardsPaymentControllerContract$InputData(parcel.readInt() == 0 ? null : Provider.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CardsPaymentControllerContract$InputData[i];
        }
    }

    public CardsPaymentControllerContract$InputData(Provider provider, boolean z) {
        this.f80281a = provider;
        this.f80282b = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CardsPaymentControllerContract$InputData)) {
            return false;
        }
        CardsPaymentControllerContract$InputData cardsPaymentControllerContract$InputData = (CardsPaymentControllerContract$InputData) obj2;
        return Intrinsics.f(this.f80281a, cardsPaymentControllerContract$InputData.f80281a) && this.f80282b == cardsPaymentControllerContract$InputData.f80282b;
    }

    public final int hashCode() {
        Provider provider = this.f80281a;
        return Boolean.hashCode(this.f80282b) + ((provider == null ? 0 : provider.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Provider provider = this.f80281a;
        if (provider == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            provider.writeToParcel(dest, i);
        }
        dest.writeInt(this.f80282b ? 1 : 0);
    }
}
