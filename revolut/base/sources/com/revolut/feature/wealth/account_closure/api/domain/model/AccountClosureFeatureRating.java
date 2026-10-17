package com.revolut.feature.wealth.account_closure.api.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/wealth/account_closure/api/domain/model/AccountClosureFeatureRating;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_wealth_account_closure_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccountClosureFeatureRating implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AccountClosureFeatureRating> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f94855a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f94856b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AccountClosureFeatureRating(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AccountClosureFeatureRating[i];
        }
    }

    public AccountClosureFeatureRating() {
        this(3, (Integer) null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AccountClosureFeatureRating)) {
            return false;
        }
        AccountClosureFeatureRating accountClosureFeatureRating = (AccountClosureFeatureRating) obj2;
        return Intrinsics.f(this.f94855a, accountClosureFeatureRating.f94855a) && Intrinsics.f(this.f94856b, accountClosureFeatureRating.f94856b);
    }

    public final int hashCode() {
        Integer num = this.f94855a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f94856b;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Integer num = this.f94855a;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        dest.writeString(this.f94856b);
    }

    public AccountClosureFeatureRating(Integer num, String str) {
        this.f94855a = num;
        this.f94856b = str;
    }

    public /* synthetic */ AccountClosureFeatureRating(int i, Integer num) {
        this((i & 1) != 0 ? null : num, (String) null);
    }
}
