package com.revolut.feature.acquiring.card_reader.order.impl.ui.screen.account_picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.acquiring.card_reader.order.api.model.PaymentMethod;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/acquiring/card_reader/order/impl/ui/screen/account_picker/AccountPickerScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_acquiring_card_reader_order_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccountPickerScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AccountPickerScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f60597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PaymentMethod.Wallet f60598b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(AccountPickerScreenContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new AccountPickerScreenContract$InputData(arrayList, (PaymentMethod.Wallet) parcel.readParcelable(AccountPickerScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AccountPickerScreenContract$InputData[i];
        }
    }

    public AccountPickerScreenContract$InputData(ArrayList accounts, PaymentMethod.Wallet wallet) {
        Intrinsics.checkNotNullParameter(accounts, "accounts");
        this.f60597a = accounts;
        this.f60598b = wallet;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AccountPickerScreenContract$InputData)) {
            return false;
        }
        AccountPickerScreenContract$InputData accountPickerScreenContract$InputData = (AccountPickerScreenContract$InputData) obj2;
        return this.f60597a.equals(accountPickerScreenContract$InputData.f60597a) && Intrinsics.f(this.f60598b, accountPickerScreenContract$InputData.f60598b);
    }

    public final int hashCode() {
        int iHashCode = this.f60597a.hashCode() * 31;
        PaymentMethod.Wallet wallet = this.f60598b;
        return iHashCode + (wallet == null ? 0 : wallet.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itY = j6.a.y(this.f60597a, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
        dest.writeParcelable(this.f60598b, i);
    }
}
