package com.revolut.feature.insurance_car.impl.ui.flow.onboarding.survey.current_insurance;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance_car.impl.data.model.Answer;
import com.revolut.kompot.navigable.flow.FlowState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance_car/impl/ui/flow/onboarding/survey/current_insurance/CurrentInsuranceFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CurrentInsuranceFlowContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<CurrentInsuranceFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Answer.CurrentInsuranceState f75449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Answer.NoClaimsDiscount f75450b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CurrentInsuranceFlowContract$State(Answer.CurrentInsuranceState.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Answer.NoClaimsDiscount.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CurrentInsuranceFlowContract$State[i];
        }
    }

    public CurrentInsuranceFlowContract$State() {
        this(0);
    }

    public static CurrentInsuranceFlowContract$State a(CurrentInsuranceFlowContract$State currentInsuranceFlowContract$State, Answer.CurrentInsuranceState insuranceState, Answer.NoClaimsDiscount noClaimsDiscount, int i) {
        if ((i & 1) != 0) {
            insuranceState = currentInsuranceFlowContract$State.f75449a;
        }
        if ((i & 2) != 0) {
            noClaimsDiscount = currentInsuranceFlowContract$State.f75450b;
        }
        currentInsuranceFlowContract$State.getClass();
        Intrinsics.checkNotNullParameter(insuranceState, "insuranceState");
        return new CurrentInsuranceFlowContract$State(insuranceState, noClaimsDiscount);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CurrentInsuranceFlowContract$State)) {
            return false;
        }
        CurrentInsuranceFlowContract$State currentInsuranceFlowContract$State = (CurrentInsuranceFlowContract$State) obj2;
        return this.f75449a == currentInsuranceFlowContract$State.f75449a && this.f75450b == currentInsuranceFlowContract$State.f75450b;
    }

    public final int hashCode() {
        int iHashCode = this.f75449a.hashCode() * 31;
        Answer.NoClaimsDiscount noClaimsDiscount = this.f75450b;
        return iHashCode + (noClaimsDiscount == null ? 0 : noClaimsDiscount.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f75449a.writeToParcel(dest, i);
        Answer.NoClaimsDiscount noClaimsDiscount = this.f75450b;
        if (noClaimsDiscount == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            noClaimsDiscount.writeToParcel(dest, i);
        }
    }

    public CurrentInsuranceFlowContract$State(Answer.CurrentInsuranceState insuranceState, Answer.NoClaimsDiscount noClaimsDiscount) {
        Intrinsics.checkNotNullParameter(insuranceState, "insuranceState");
        this.f75449a = insuranceState;
        this.f75450b = noClaimsDiscount;
    }

    public /* synthetic */ CurrentInsuranceFlowContract$State(int i) {
        this(Answer.CurrentInsuranceState.NO_INSURANCE, null);
    }
}
