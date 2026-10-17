package com.revolut.feature.three_ds_verification.impl.ui.add_money;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.checkout.add_money_methods.api.model.AddMoneyMethod;
import com.revolut.feature_move_money.api.model.AccountWrapper;
import com.revolut.kompot.common.IOData$Input;
import dj0.d;
import h93.f0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/three_ds_verification/impl/ui/add_money/AddMoneyMethodSelectionScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_three_ds_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AddMoneyMethodSelectionScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AddMoneyMethodSelectionScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f90398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f0 f90399b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AccountWrapper f90400c;
    public final boolean d;
    public final AddMoneyMethod e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AddMoneyMethodSelectionScreenContract$InputData((d) parcel.readSerializable(), (f0) parcel.readSerializable(), (AccountWrapper) parcel.readParcelable(AddMoneyMethodSelectionScreenContract$InputData.class.getClassLoader()), parcel.readInt() != 0, (AddMoneyMethod) parcel.readParcelable(AddMoneyMethodSelectionScreenContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AddMoneyMethodSelectionScreenContract$InputData[i];
        }
    }

    public AddMoneyMethodSelectionScreenContract$InputData(d requiredAmount, f0 card, AccountWrapper targetAccount, boolean z, AddMoneyMethod addMoneyMethod) {
        Intrinsics.checkNotNullParameter(requiredAmount, "requiredAmount");
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(targetAccount, "targetAccount");
        this.f90398a = requiredAmount;
        this.f90399b = card;
        this.f90400c = targetAccount;
        this.d = z;
        this.e = addMoneyMethod;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AddMoneyMethodSelectionScreenContract$InputData)) {
            return false;
        }
        AddMoneyMethodSelectionScreenContract$InputData addMoneyMethodSelectionScreenContract$InputData = (AddMoneyMethodSelectionScreenContract$InputData) obj2;
        return Intrinsics.f(this.f90398a, addMoneyMethodSelectionScreenContract$InputData.f90398a) && Intrinsics.f(this.f90399b, addMoneyMethodSelectionScreenContract$InputData.f90399b) && Intrinsics.f(this.f90400c, addMoneyMethodSelectionScreenContract$InputData.f90400c) && this.d == addMoneyMethodSelectionScreenContract$InputData.d && Intrinsics.f(this.e, addMoneyMethodSelectionScreenContract$InputData.e);
    }

    public final int hashCode() {
        int iC = j6.a.c((this.f90400c.hashCode() + ((this.f90399b.hashCode() + (this.f90398a.hashCode() * 31)) * 31)) * 31, 31, this.d);
        AddMoneyMethod addMoneyMethod = this.e;
        return iC + (addMoneyMethod == null ? 0 : addMoneyMethod.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f90398a);
        dest.writeSerializable(this.f90399b);
        dest.writeParcelable(this.f90400c, i);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeParcelable(this.e, i);
    }
}
