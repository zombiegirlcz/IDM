package com.revolut.feature.credit.application.plugins.impl.ui.mortgage_refinancing_details_v2.flow;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xy3.s;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/mortgage_refinancing_details_v2/flow/MortgageRefinancingDetailsV2FlowContract$State", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MortgageRefinancingDetailsV2FlowContract$State implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MortgageRefinancingDetailsV2FlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f68005a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MortgageRefinancingDetailsV2FlowContract$State((s) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MortgageRefinancingDetailsV2FlowContract$State[i];
        }
    }

    public MortgageRefinancingDetailsV2FlowContract$State(s answers) {
        Intrinsics.checkNotNullParameter(answers, "answers");
        this.f68005a = answers;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof MortgageRefinancingDetailsV2FlowContract$State) && Intrinsics.f(this.f68005a, ((MortgageRefinancingDetailsV2FlowContract$State) obj2).f68005a);
    }

    public final int hashCode() {
        return this.f68005a.f309595a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f68005a);
    }
}
