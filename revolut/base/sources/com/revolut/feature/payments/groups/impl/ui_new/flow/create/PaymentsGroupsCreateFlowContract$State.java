package com.revolut.feature.payments.groups.impl.ui_new.flow.create;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowState;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rq9.c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/payments/groups/impl/ui_new/flow/create/PaymentsGroupsCreateFlowContract$State", "Lcom/revolut/kompot/navigable/flow/FlowState;", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentsGroupsCreateFlowContract$State implements FlowState {

    @NotNull
    public static final Parcelable.Creator<PaymentsGroupsCreateFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f79459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f79460c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iC = 0;
            while (iC != i) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            return new PaymentsGroupsCreateFlowContract$State(string, arrayList, c.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PaymentsGroupsCreateFlowContract$State[i];
        }
    }

    public PaymentsGroupsCreateFlowContract$State(String name, List selectedContacts, c finishMode) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(selectedContacts, "selectedContacts");
        Intrinsics.checkNotNullParameter(finishMode, "finishMode");
        this.f79458a = name;
        this.f79459b = selectedContacts;
        this.f79460c = finishMode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PaymentsGroupsCreateFlowContract$State)) {
            return false;
        }
        PaymentsGroupsCreateFlowContract$State paymentsGroupsCreateFlowContract$State = (PaymentsGroupsCreateFlowContract$State) obj2;
        return Intrinsics.f(this.f79458a, paymentsGroupsCreateFlowContract$State.f79458a) && Intrinsics.f(this.f79459b, paymentsGroupsCreateFlowContract$State.f79459b) && this.f79460c == paymentsGroupsCreateFlowContract$State.f79460c;
    }

    public final int hashCode() {
        return this.f79460c.hashCode() + p.a.d(this.f79458a.hashCode() * 31, 31, this.f79459b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f79458a);
        Iterator itV = p.a.v(this.f79459b, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
        dest.writeString(this.f79460c.name());
    }
}
