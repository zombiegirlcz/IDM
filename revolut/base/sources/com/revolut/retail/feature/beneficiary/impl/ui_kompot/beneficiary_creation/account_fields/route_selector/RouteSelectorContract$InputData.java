package com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.route_selector;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.domain.models.beneficiary.BeneficiaryRouteDetails;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/beneficiary/impl/ui_kompot/beneficiary_creation/account_fields/route_selector/RouteSelectorContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_beneficiary_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RouteSelectorContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RouteSelectorContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f99698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BeneficiaryRouteDetails f99699b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(RouteSelectorContract$InputData.class, parcel, arrayList, iE, 1);
            }
            return new RouteSelectorContract$InputData(arrayList, (BeneficiaryRouteDetails) parcel.readParcelable(RouteSelectorContract$InputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RouteSelectorContract$InputData[i];
        }
    }

    public RouteSelectorContract$InputData(List routes, BeneficiaryRouteDetails selectedRoute) {
        Intrinsics.checkNotNullParameter(routes, "routes");
        Intrinsics.checkNotNullParameter(selectedRoute, "selectedRoute");
        this.f99698a = routes;
        this.f99699b = selectedRoute;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RouteSelectorContract$InputData)) {
            return false;
        }
        RouteSelectorContract$InputData routeSelectorContract$InputData = (RouteSelectorContract$InputData) obj2;
        return Intrinsics.f(this.f99698a, routeSelectorContract$InputData.f99698a) && Intrinsics.f(this.f99699b, routeSelectorContract$InputData.f99699b);
    }

    public final int hashCode() {
        return this.f99699b.hashCode() + (this.f99698a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f99698a, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeParcelable(this.f99699b, i);
    }
}
