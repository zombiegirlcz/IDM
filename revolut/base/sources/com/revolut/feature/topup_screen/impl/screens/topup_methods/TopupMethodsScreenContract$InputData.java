package com.revolut.feature.topup_screen.impl.screens.topup_methods;

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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/topup_screen/impl/screens/topup_methods/TopupMethodsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TopupMethodsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<TopupMethodsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f91103b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TopUpTarget f91104c;
    public final CheckoutContext d;
    public final List e;
    public final String f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            n nVarValueOf = n.valueOf(parcel.readString());
            TopUpTarget topUpTarget = (TopUpTarget) parcel.readParcelable(TopupMethodsScreenContract$InputData.class.getClassLoader());
            CheckoutContext checkoutContext = (CheckoutContext) parcel.readParcelable(TopupMethodsScreenContract$InputData.class.getClassLoader());
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
            return new TopupMethodsScreenContract$InputData(checkoutContext, topUpTarget, string, parcel.readString(), arrayList, nVarValueOf);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TopupMethodsScreenContract$InputData[i];
        }
    }

    public TopupMethodsScreenContract$InputData(CheckoutContext checkoutContext, TopUpTarget topUpTarget, String currency, String str, List list, n contextType) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(contextType, "contextType");
        Intrinsics.checkNotNullParameter(topUpTarget, "topUpTarget");
        this.f91102a = currency;
        this.f91103b = contextType;
        this.f91104c = topUpTarget;
        this.d = checkoutContext;
        this.e = list;
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
        if (!(obj2 instanceof TopupMethodsScreenContract$InputData)) {
            return false;
        }
        TopupMethodsScreenContract$InputData topupMethodsScreenContract$InputData = (TopupMethodsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f91102a, topupMethodsScreenContract$InputData.f91102a) && this.f91103b == topupMethodsScreenContract$InputData.f91103b && Intrinsics.f(this.f91104c, topupMethodsScreenContract$InputData.f91104c) && Intrinsics.f(this.d, topupMethodsScreenContract$InputData.d) && Intrinsics.f(this.e, topupMethodsScreenContract$InputData.e) && Intrinsics.f(this.f, topupMethodsScreenContract$InputData.f);
    }

    public final int hashCode() {
        int iHashCode = (this.f91104c.hashCode() + ((this.f91103b.hashCode() + (this.f91102a.hashCode() * 31)) * 31)) * 31;
        CheckoutContext checkoutContext = this.d;
        int iHashCode2 = (iHashCode + (checkoutContext == null ? 0 : checkoutContext.hashCode())) * 31;
        List list = this.e;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f91102a);
        dest.writeString(this.f91103b.name());
        dest.writeParcelable(this.f91104c, i);
        dest.writeParcelable(this.d, i);
        List list = this.e;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                dest.writeString(((p) itQ.next()).name());
            }
        }
        dest.writeString(this.f);
    }
}
