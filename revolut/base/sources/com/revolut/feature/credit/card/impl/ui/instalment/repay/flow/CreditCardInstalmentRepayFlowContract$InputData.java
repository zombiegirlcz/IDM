package com.revolut.feature.credit.card.impl.ui.instalment.repay.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ql4.j;
import ql4.v;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/card/impl/ui/instalment/repay/flow/CreditCardInstalmentRepayFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditCardInstalmentRepayFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CreditCardInstalmentRepayFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f69493a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f69494b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v f69495c;
    public final List d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            v vVarValueOf = v.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(j.valueOf(parcel.readString()));
            }
            return new CreditCardInstalmentRepayFlowContract$InputData(string, string2, vVarValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditCardInstalmentRepayFlowContract$InputData[i];
        }
    }

    public CreditCardInstalmentRepayFlowContract$InputData(String facilityId, String planId, v instalmentType, List repaymentMethods) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(instalmentType, "instalmentType");
        Intrinsics.checkNotNullParameter(repaymentMethods, "repaymentMethods");
        this.f69493a = facilityId;
        this.f69494b = planId;
        this.f69495c = instalmentType;
        this.d = repaymentMethods;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditCardInstalmentRepayFlowContract$InputData)) {
            return false;
        }
        CreditCardInstalmentRepayFlowContract$InputData creditCardInstalmentRepayFlowContract$InputData = (CreditCardInstalmentRepayFlowContract$InputData) obj2;
        return Intrinsics.f(this.f69493a, creditCardInstalmentRepayFlowContract$InputData.f69493a) && Intrinsics.f(this.f69494b, creditCardInstalmentRepayFlowContract$InputData.f69494b) && this.f69495c == creditCardInstalmentRepayFlowContract$InputData.f69495c && Intrinsics.f(this.d, creditCardInstalmentRepayFlowContract$InputData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f69495c.hashCode() + p.a.c(this.f69493a.hashCode() * 31, 31, this.f69494b)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f69493a);
        dest.writeString(this.f69494b);
        dest.writeString(this.f69495c.name());
        Iterator itV = p.a.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeString(((j) itV.next()).name());
        }
    }
}
