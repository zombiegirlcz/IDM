package com.revolut.feature.credit.direct.debit.account_selection.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/direct/debit/account_selection/models/AccountSelectionParcel;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_direct_debit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccountSelectionParcel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AccountSelectionParcel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PocketInfo f69890a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccountSelectionParcel((PocketInfo) parcel.readParcelable(AccountSelectionParcel.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AccountSelectionParcel[i];
        }
    }

    public AccountSelectionParcel(PocketInfo pocketInfo) {
        this.f69890a = pocketInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof AccountSelectionParcel) && Intrinsics.f(this.f69890a, ((AccountSelectionParcel) obj2).f69890a);
    }

    public final int hashCode() {
        PocketInfo pocketInfo = this.f69890a;
        if (pocketInfo == null) {
            return 0;
        }
        return pocketInfo.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f69890a, i);
    }

    public AccountSelectionParcel() {
        this(null);
    }
}
