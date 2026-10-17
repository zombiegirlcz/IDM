package com.revolut.feature.bank_account_switching.impl.ui.card_digits;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.bank_account_switching.impl.ui.form.domain.FormData;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/bank_account_switching/impl/ui/card_digits/BankAccountSwitchingCardDigitsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_bank_account_switching_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BankAccountSwitchingCardDigitsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<BankAccountSwitchingCardDigitsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wn2.a f63903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FormData f63904b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BankAccountSwitchingCardDigitsScreenContract$InputData(wn2.a.valueOf(parcel.readString()), FormData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new BankAccountSwitchingCardDigitsScreenContract$InputData[i];
        }
    }

    public BankAccountSwitchingCardDigitsScreenContract$InputData(wn2.a targetAccountType, FormData formData) {
        Intrinsics.checkNotNullParameter(targetAccountType, "targetAccountType");
        Intrinsics.checkNotNullParameter(formData, "formData");
        this.f63903a = targetAccountType;
        this.f63904b = formData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof BankAccountSwitchingCardDigitsScreenContract$InputData)) {
            return false;
        }
        BankAccountSwitchingCardDigitsScreenContract$InputData bankAccountSwitchingCardDigitsScreenContract$InputData = (BankAccountSwitchingCardDigitsScreenContract$InputData) obj2;
        return this.f63903a == bankAccountSwitchingCardDigitsScreenContract$InputData.f63903a && Intrinsics.f(this.f63904b, bankAccountSwitchingCardDigitsScreenContract$InputData.f63904b);
    }

    public final int hashCode() {
        return this.f63904b.hashCode() + (this.f63903a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f63903a.name());
        this.f63904b.writeToParcel(dest, i);
    }
}
