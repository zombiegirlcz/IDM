package com.revolut.feature.revolutpay.shared.ui.account_picker;

import aii.r;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003\u0082\u0001\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"com/revolut/feature/revolutpay/shared/ui/account_picker/AccountPickerContract$OutputData", "Laii/r;", "Landroid/os/Parcelable;", "ItemSelected", "Lcom/revolut/feature/revolutpay/shared/ui/account_picker/AccountPickerContract$OutputData$ItemSelected;", "feature_revolut_pay_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface AccountPickerContract$OutputData extends r, Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/revolutpay/shared/ui/account_picker/AccountPickerContract$OutputData$ItemSelected;", "Lcom/revolut/feature/revolutpay/shared/ui/account_picker/AccountPickerContract$OutputData;", "", "toString", "()Ljava/lang/String;", "feature_revolut_pay_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ItemSelected implements AccountPickerContract$OutputData {

        @NotNull
        public static final Parcelable.Creator<ItemSelected> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AccountPickerItem f84700a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ItemSelected(AccountPickerItem.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ItemSelected[i];
            }
        }

        public ItemSelected(AccountPickerItem item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.f84700a = item;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ItemSelected) && Intrinsics.f(this.f84700a, ((ItemSelected) obj2).f84700a);
        }

        public final int hashCode() {
            return this.f84700a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f84700a.writeToParcel(dest, i);
        }
    }
}
