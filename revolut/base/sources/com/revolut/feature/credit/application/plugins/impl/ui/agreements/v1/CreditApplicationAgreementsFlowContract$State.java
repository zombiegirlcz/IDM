package com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1;

import android.os.Parcel;
import android.os.Parcelable;
import cli.j;
import com.revolut.feature.credit.application.plugins.impl.ui.agreements.v1.documents.CreditApplicationDocumentsScreenContract$Configuration;
import com.revolut.kompot.navigable.flow.FlowState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/agreements/v1/CreditApplicationAgreementsFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "Lcli/j;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditApplicationAgreementsFlowContract$State implements FlowState, j {

    @NotNull
    public static final Parcelable.Creator<CreditApplicationAgreementsFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreditApplicationDocumentsScreenContract$Configuration f66994a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditApplicationAgreementsFlowContract$State(parcel.readInt() == 0 ? null : CreditApplicationDocumentsScreenContract$Configuration.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditApplicationAgreementsFlowContract$State[i];
        }
    }

    public CreditApplicationAgreementsFlowContract$State(CreditApplicationDocumentsScreenContract$Configuration creditApplicationDocumentsScreenContract$Configuration) {
        this.f66994a = creditApplicationDocumentsScreenContract$Configuration;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof CreditApplicationAgreementsFlowContract$State) && Intrinsics.f(this.f66994a, ((CreditApplicationAgreementsFlowContract$State) obj2).f66994a);
    }

    public final int hashCode() {
        CreditApplicationDocumentsScreenContract$Configuration creditApplicationDocumentsScreenContract$Configuration = this.f66994a;
        if (creditApplicationDocumentsScreenContract$Configuration == null) {
            return 0;
        }
        return creditApplicationDocumentsScreenContract$Configuration.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        CreditApplicationDocumentsScreenContract$Configuration creditApplicationDocumentsScreenContract$Configuration = this.f66994a;
        if (creditApplicationDocumentsScreenContract$Configuration == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            creditApplicationDocumentsScreenContract$Configuration.writeToParcel(dest, i);
        }
    }

    public CreditApplicationAgreementsFlowContract$State() {
        this(null);
    }
}
