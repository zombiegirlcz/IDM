package com.revolut.feature.credit.application.plugins.impl.ui.linked_accounts_v3;

import android.os.Parcel;
import android.os.Parcelable;
import av3.f;
import cli.j;
import com.revolut.kompot.navigable.flow.FlowState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/linked_accounts_v3/CreditLinkedAccountsV3FlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "Lcli/j;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditLinkedAccountsV3FlowContract$State implements FlowState, j {

    @NotNull
    public static final Parcelable.Creator<CreditLinkedAccountsV3FlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f67856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f67857b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CreditLinkedAccountsV3FlowContract$State((f) parcel.readSerializable(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditLinkedAccountsV3FlowContract$State[i];
        }
    }

    public CreditLinkedAccountsV3FlowContract$State() {
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
        if (!(obj2 instanceof CreditLinkedAccountsV3FlowContract$State)) {
            return false;
        }
        CreditLinkedAccountsV3FlowContract$State creditLinkedAccountsV3FlowContract$State = (CreditLinkedAccountsV3FlowContract$State) obj2;
        return Intrinsics.f(this.f67856a, creditLinkedAccountsV3FlowContract$State.f67856a) && this.f67857b == creditLinkedAccountsV3FlowContract$State.f67857b;
    }

    public final int hashCode() {
        f fVar = this.f67856a;
        return Boolean.hashCode(this.f67857b) + ((fVar == null ? 0 : fVar.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f67856a);
        dest.writeInt(this.f67857b ? 1 : 0);
    }

    public CreditLinkedAccountsV3FlowContract$State(f fVar, boolean z) {
        this.f67856a = fVar;
        this.f67857b = z;
    }

    public /* synthetic */ CreditLinkedAccountsV3FlowContract$State(int i) {
        this(null, false);
    }
}
