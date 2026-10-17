package com.revolut.feature.retail.savings.api.creation.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.retail.savings.api.creation.navigation.SavingsAccountCreationFlow$Filter;
import com.revolut.feature.vaults.common.SavingAccountType;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/retail/savings/api/creation/navigation/SavingsAccountCreationFlow$Destination", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SavingsAccountCreationFlow$Destination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<SavingsAccountCreationFlow$Destination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsAccountCreationFlow$Filter f83125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SavingAccountType f83126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f83127c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SavingsAccountCreationFlow$Destination((SavingsAccountCreationFlow$Filter) parcel.readParcelable(SavingsAccountCreationFlow$Destination.class.getClassLoader()), (SavingAccountType) parcel.readParcelable(SavingsAccountCreationFlow$Destination.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SavingsAccountCreationFlow$Destination[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SavingsAccountCreationFlow$Destination() {
        this(null, 0 == true ? 1 : 0, 15);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SavingsAccountCreationFlow$Destination)) {
            return false;
        }
        SavingsAccountCreationFlow$Destination savingsAccountCreationFlow$Destination = (SavingsAccountCreationFlow$Destination) obj2;
        return Intrinsics.f(this.f83125a, savingsAccountCreationFlow$Destination.f83125a) && Intrinsics.f(this.f83126b, savingsAccountCreationFlow$Destination.f83126b) && this.f83127c == savingsAccountCreationFlow$Destination.f83127c && this.d == savingsAccountCreationFlow$Destination.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c((this.f83126b.hashCode() + (this.f83125a.hashCode() * 31)) * 31, 31, this.f83127c);
    }

    @Override // aii.d0
    /* JADX INFO: renamed from: n1, reason: from getter */
    public final boolean getD() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f83125a, i);
        dest.writeParcelable(this.f83126b, i);
        dest.writeInt(this.f83127c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
    }

    public SavingsAccountCreationFlow$Destination(SavingsAccountCreationFlow$Filter filter, SavingAccountType accountType, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.f83125a = filter;
        this.f83126b = accountType;
        this.f83127c = z;
        this.d = z3;
    }

    public /* synthetic */ SavingsAccountCreationFlow$Destination(SavingsAccountCreationFlow$Filter savingsAccountCreationFlow$Filter, SavingAccountType savingAccountType, int i) {
        this((i & 1) != 0 ? SavingsAccountCreationFlow$Filter.All.f83128a : savingsAccountCreationFlow$Filter, (i & 2) != 0 ? SavingAccountType.Personal.f94740a : savingAccountType, false, (i & 8) != 0);
    }
}
