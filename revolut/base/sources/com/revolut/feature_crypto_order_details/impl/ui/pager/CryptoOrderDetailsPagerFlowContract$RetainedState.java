package com.revolut.feature_crypto_order_details.impl.ui.pager;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.screen.ScreenStates$RetainedDomain;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature_crypto_order_details/impl/ui/pager/CryptoOrderDetailsPagerFlowContract$RetainedState", "Lcom/revolut/kompot/navigable/screen/ScreenStates$RetainedDomain;", "", "toString", "()Ljava/lang/String;", "feature_crypto_order_details_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CryptoOrderDetailsPagerFlowContract$RetainedState implements ScreenStates$RetainedDomain {

    @NotNull
    public static final Parcelable.Creator<CryptoOrderDetailsPagerFlowContract$RetainedState> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f96669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f96670b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(CryptoOrderDetailsPagerFlowContract$RetainedState.class, parcel, arrayList, iE, 1);
            }
            return new CryptoOrderDetailsPagerFlowContract$RetainedState(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CryptoOrderDetailsPagerFlowContract$RetainedState[i];
        }
    }

    public CryptoOrderDetailsPagerFlowContract$RetainedState(String selectedPagerItemId, List pagerItems) {
        Intrinsics.checkNotNullParameter(selectedPagerItemId, "selectedPagerItemId");
        Intrinsics.checkNotNullParameter(pagerItems, "pagerItems");
        this.f96669a = selectedPagerItemId;
        this.f96670b = pagerItems;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CryptoOrderDetailsPagerFlowContract$RetainedState)) {
            return false;
        }
        CryptoOrderDetailsPagerFlowContract$RetainedState cryptoOrderDetailsPagerFlowContract$RetainedState = (CryptoOrderDetailsPagerFlowContract$RetainedState) obj2;
        return Intrinsics.f(this.f96669a, cryptoOrderDetailsPagerFlowContract$RetainedState.f96669a) && Intrinsics.f(this.f96670b, cryptoOrderDetailsPagerFlowContract$RetainedState.f96670b);
    }

    public final int hashCode() {
        return this.f96670b.hashCode() + (this.f96669a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f96669a);
        Iterator itV = p.a.v(this.f96670b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }
}
