package com.revolut.feature.retail.savings.impl.creation.presentation.account_creation_flow.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.retail.savings.api.creation.navigation.SavingsAccountCreationFlow$Filter;
import com.revolut.feature.vaults.common.SavingAccountType;
import com.revolut.kompot.common.IOData$Input;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/retail/savings/impl/creation/presentation/account_creation_flow/flow/SavingsOnboardingFlowContract$Input", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SavingsOnboardingFlowContract$Input implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SavingsOnboardingFlowContract$Input> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsAccountCreationFlow$Filter f83237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SavingAccountType f83238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f83239c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SavingsOnboardingFlowContract$Input((SavingsAccountCreationFlow$Filter) parcel.readParcelable(SavingsOnboardingFlowContract$Input.class.getClassLoader()), (SavingAccountType) parcel.readParcelable(SavingsOnboardingFlowContract$Input.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SavingsOnboardingFlowContract$Input[i];
        }
    }

    public SavingsOnboardingFlowContract$Input(SavingsAccountCreationFlow$Filter creationFilter, SavingAccountType accountType, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(creationFilter, "creationFilter");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.f83237a = creationFilter;
        this.f83238b = accountType;
        this.f83239c = z;
        this.d = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SavingsOnboardingFlowContract$Input)) {
            return false;
        }
        SavingsOnboardingFlowContract$Input savingsOnboardingFlowContract$Input = (SavingsOnboardingFlowContract$Input) obj2;
        return Intrinsics.f(this.f83237a, savingsOnboardingFlowContract$Input.f83237a) && Intrinsics.f(this.f83238b, savingsOnboardingFlowContract$Input.f83238b) && this.f83239c == savingsOnboardingFlowContract$Input.f83239c && this.d == savingsOnboardingFlowContract$Input.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c((this.f83238b.hashCode() + (this.f83237a.hashCode() * 31)) * 31, 31, this.f83239c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f83237a, i);
        dest.writeParcelable(this.f83238b, i);
        dest.writeInt(this.f83239c ? 1 : 0);
        dest.writeInt(this.d ? 1 : 0);
    }
}
