package com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v2;

import android.os.Parcel;
import android.os.Parcelable;
import av3.f;
import cli.j;
import com.revolut.kompot.navigable.flow.FlowState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v2/CreditLinkedAccountsV2FlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "Lcli/j;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditLinkedAccountsV2FlowContract$State implements FlowState, j {

    @NotNull
    public static final Parcelable.Creator<CreditLinkedAccountsV2FlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f67827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f67828b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditLinkedAccountsV2FlowContract$State((f) parcel.readSerializable(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditLinkedAccountsV2FlowContract$State[i];
        }
    }

    public CreditLinkedAccountsV2FlowContract$State() {
        this(0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditLinkedAccountsV2FlowContract$State)) {
            return false;
        }
        CreditLinkedAccountsV2FlowContract$State creditLinkedAccountsV2FlowContract$State = (CreditLinkedAccountsV2FlowContract$State) obj2;
        return Intrinsics.f(this.f67827a, creditLinkedAccountsV2FlowContract$State.f67827a) && this.f67828b == creditLinkedAccountsV2FlowContract$State.f67828b;
    }

    public final int hashCode() {
        f fVar = this.f67827a;
        return Boolean.hashCode(this.f67828b) + ((fVar == null ? 0 : fVar.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f67827a);
        dest.writeInt(this.f67828b ? 1 : 0);
    }

    public CreditLinkedAccountsV2FlowContract$State(f fVar, boolean z) {
        this.f67827a = fVar;
        this.f67828b = z;
    }

    public /* synthetic */ CreditLinkedAccountsV2FlowContract$State(int i) {
        this(null, false);
    }
}
