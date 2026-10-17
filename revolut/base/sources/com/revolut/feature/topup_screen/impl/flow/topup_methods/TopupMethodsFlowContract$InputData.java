package com.revolut.feature.topup_screen.impl.flow.topup_methods;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.topup_screen.api.model.CheckoutContext;
import com.revolut.feature.topup_screen.common.TopUpTarget;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yte.n;
import yte.p;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/topup_screen/impl/flow/topup_methods/TopupMethodsFlowContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TopupMethodsFlowContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TopupMethodsFlowContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f90632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f90633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TopUpTarget f90634c;
    public final List d;
    public final CheckoutContext e;
    public final String f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            n nVarValueOf = n.valueOf(parcel.readString());
            TopUpTarget topUpTarget = (TopUpTarget) parcel.readParcelable(TopupMethodsFlowContract$InputData.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList2.add(p.valueOf(parcel.readString()));
                }
                arrayList = arrayList2;
            }
            return new TopupMethodsFlowContract$InputData((CheckoutContext) parcel.readParcelable(TopupMethodsFlowContract$InputData.class.getClassLoader()), topUpTarget, string, parcel.readString(), arrayList, nVarValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TopupMethodsFlowContract$InputData[i];
        }
    }

    public TopupMethodsFlowContract$InputData(CheckoutContext checkoutContext, TopUpTarget topUpTarget, String currency, String str, List list, n contextType) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(contextType, "contextType");
        Intrinsics.checkNotNullParameter(topUpTarget, "topUpTarget");
        this.f90632a = currency;
        this.f90633b = contextType;
        this.f90634c = topUpTarget;
        this.d = list;
        this.e = checkoutContext;
        this.f = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TopupMethodsFlowContract$InputData)) {
            return false;
        }
        TopupMethodsFlowContract$InputData topupMethodsFlowContract$InputData = (TopupMethodsFlowContract$InputData) obj2;
        return Intrinsics.f(this.f90632a, topupMethodsFlowContract$InputData.f90632a) && this.f90633b == topupMethodsFlowContract$InputData.f90633b && Intrinsics.f(this.f90634c, topupMethodsFlowContract$InputData.f90634c) && Intrinsics.f(this.d, topupMethodsFlowContract$InputData.d) && Intrinsics.f(this.e, topupMethodsFlowContract$InputData.e) && Intrinsics.f(this.f, topupMethodsFlowContract$InputData.f);
    }

    public final int hashCode() {
        int iHashCode = (this.f90634c.hashCode() + ((this.f90633b.hashCode() + (this.f90632a.hashCode() * 31)) * 31)) * 31;
        List list = this.d;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        CheckoutContext checkoutContext = this.e;
        int iHashCode3 = (iHashCode2 + (checkoutContext == null ? 0 : checkoutContext.hashCode())) * 31;
        String str = this.f;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f90632a);
        dest.writeString(this.f90633b.name());
        dest.writeParcelable(this.f90634c, i);
        List list = this.d;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeString(((p) itQ.next()).name());
            }
        }
        dest.writeParcelable(this.e, i);
        dest.writeString(this.f);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TopupMethodsFlowContract$InputData(String str, n nVar, TopUpTarget topUpTarget, List list, CheckoutContext checkoutContext, String str2, int i) {
        n nVar2;
        CheckoutContext checkoutContext2;
        String str3;
        list = (i & 8) != 0 ? null : list;
        checkoutContext = (i & 16) != 0 ? null : checkoutContext;
        if ((i & 32) != 0) {
            nVar2 = nVar;
            checkoutContext2 = checkoutContext;
            str3 = null;
        } else {
            nVar2 = nVar;
            checkoutContext2 = checkoutContext;
            str3 = str2;
        }
        this(checkoutContext2, topUpTarget, str, str3, list, nVar2);
    }
}
