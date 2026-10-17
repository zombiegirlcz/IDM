package com.revolut.feature.payments.groups.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rq9.c;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/payments/groups/api/navigation/PaymentsGroupsCreateNavigationFlow$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_payments_groups_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PaymentsGroupsCreateNavigationFlow$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PaymentsGroupsCreateNavigationFlow$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f79292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PaymentsGroupsCreateNavigationFlow$Step f79293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f79294c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iC = 0;
            while (iC != i) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            return new PaymentsGroupsCreateNavigationFlow$InputData(arrayList, (PaymentsGroupsCreateNavigationFlow$Step) parcel.readParcelable(PaymentsGroupsCreateNavigationFlow$InputData.class.getClassLoader()), c.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PaymentsGroupsCreateNavigationFlow$InputData[i];
        }
    }

    public PaymentsGroupsCreateNavigationFlow$InputData(List preselectedContacts, PaymentsGroupsCreateNavigationFlow$Step step, c finishMode) {
        Intrinsics.checkNotNullParameter(preselectedContacts, "preselectedContacts");
        Intrinsics.checkNotNullParameter(step, "step");
        Intrinsics.checkNotNullParameter(finishMode, "finishMode");
        this.f79292a = preselectedContacts;
        this.f79293b = step;
        this.f79294c = finishMode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PaymentsGroupsCreateNavigationFlow$InputData)) {
            return false;
        }
        PaymentsGroupsCreateNavigationFlow$InputData paymentsGroupsCreateNavigationFlow$InputData = (PaymentsGroupsCreateNavigationFlow$InputData) obj2;
        return Intrinsics.f(this.f79292a, paymentsGroupsCreateNavigationFlow$InputData.f79292a) && Intrinsics.f(this.f79293b, paymentsGroupsCreateNavigationFlow$InputData.f79293b) && this.f79294c == paymentsGroupsCreateNavigationFlow$InputData.f79294c;
    }

    public final int hashCode() {
        return this.f79294c.hashCode() + ((this.f79293b.hashCode() + (this.f79292a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f79292a, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
        dest.writeParcelable(this.f79293b, i);
        dest.writeString(this.f79294c.name());
    }
}
