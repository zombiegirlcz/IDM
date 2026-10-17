package com.revolut.retail.feature.balance.picker.impl.disclaimers.savings.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.shared.savings.models.SavingsAccountDetails;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/balance/picker/impl/disclaimers/savings/flow/SavingWithDisclaimer;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_balance_picker_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SavingWithDisclaimer implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SavingWithDisclaimer> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsAccountDetails f99517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f99518b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SavingWithDisclaimer((SavingsAccountDetails) parcel.readParcelable(SavingWithDisclaimer.class.getClassLoader()), (Clause) parcel.readParcelable(SavingWithDisclaimer.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SavingWithDisclaimer[i];
        }
    }

    public SavingWithDisclaimer(SavingsAccountDetails account, Clause disclaimer) {
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        this.f99517a = account;
        this.f99518b = disclaimer;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SavingWithDisclaimer)) {
            return false;
        }
        SavingWithDisclaimer savingWithDisclaimer = (SavingWithDisclaimer) obj2;
        return Intrinsics.f(this.f99517a, savingWithDisclaimer.f99517a) && Intrinsics.f(this.f99518b, savingWithDisclaimer.f99518b);
    }

    public final int hashCode() {
        return this.f99518b.hashCode() + (this.f99517a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f99517a, i);
        dest.writeParcelable(this.f99518b, i);
    }
}
