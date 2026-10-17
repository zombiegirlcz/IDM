package com.revolut.feature.revolutpay.shared.ui.account_picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/revolutpay/shared/ui/account_picker/AccountPickerContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccountPickerContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AccountPickerContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f84698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84699b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(AccountPickerItem.CREATOR, parcel, arrayList, iA, 1);
            }
            return new AccountPickerContract$InputData(arrayList, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AccountPickerContract$InputData[i];
        }
    }

    public AccountPickerContract$InputData(List items, String str) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f84698a = items;
        this.f84699b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AccountPickerContract$InputData)) {
            return false;
        }
        AccountPickerContract$InputData accountPickerContract$InputData = (AccountPickerContract$InputData) obj2;
        return Intrinsics.f(this.f84698a, accountPickerContract$InputData.f84698a) && Intrinsics.f(this.f84699b, accountPickerContract$InputData.f84699b);
    }

    public final int hashCode() {
        int iHashCode = this.f84698a.hashCode() * 31;
        String str = this.f84699b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f84698a, dest);
        while (itV.hasNext()) {
            ((AccountPickerItem) itV.next()).writeToParcel(dest, i);
        }
        dest.writeString(this.f84699b);
    }
}
