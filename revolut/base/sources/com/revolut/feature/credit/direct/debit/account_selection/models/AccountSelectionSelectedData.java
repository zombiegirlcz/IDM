package com.revolut.feature.credit.direct.debit.account_selection.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/direct/debit/account_selection/models/AccountSelectionSelectedData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_direct_debit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccountSelectionSelectedData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AccountSelectionSelectedData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f69892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f69893c;
    public final String d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccountSelectionSelectedData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AccountSelectionSelectedData[i];
        }
    }

    public AccountSelectionSelectedData(String bankIdentifier, String accountNumber, String str, String str2) {
        Intrinsics.checkNotNullParameter(bankIdentifier, "bankIdentifier");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        this.f69891a = bankIdentifier;
        this.f69892b = accountNumber;
        this.f69893c = str;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AccountSelectionSelectedData)) {
            return false;
        }
        AccountSelectionSelectedData accountSelectionSelectedData = (AccountSelectionSelectedData) obj2;
        return Intrinsics.f(this.f69891a, accountSelectionSelectedData.f69891a) && Intrinsics.f(this.f69892b, accountSelectionSelectedData.f69892b) && Intrinsics.f(this.f69893c, accountSelectionSelectedData.f69893c) && Intrinsics.f(this.d, accountSelectionSelectedData.d);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f69891a.hashCode() * 31, 31, this.f69892b);
        String str = this.f69893c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f69891a);
        dest.writeString(this.f69892b);
        dest.writeString(this.f69893c);
        dest.writeString(this.d);
    }
}
