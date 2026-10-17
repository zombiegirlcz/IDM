package com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/esim/impl/ui/screens/mobile_plan_details/EsimMobilePlanDetailsScreenContract$EndTextClickParcel$CoverageCountries", "", "", "toString", "()Ljava/lang/String;", "feature_retail_esim_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EsimMobilePlanDetailsScreenContract$EndTextClickParcel$CoverageCountries implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<EsimMobilePlanDetailsScreenContract$EndTextClickParcel$CoverageCountries> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f101190a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList2, iC, 1);
                }
                arrayList = arrayList2;
            }
            return new EsimMobilePlanDetailsScreenContract$EndTextClickParcel$CoverageCountries(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EsimMobilePlanDetailsScreenContract$EndTextClickParcel$CoverageCountries[i];
        }
    }

    public EsimMobilePlanDetailsScreenContract$EndTextClickParcel$CoverageCountries(List list) {
        this.f101190a = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof EsimMobilePlanDetailsScreenContract$EndTextClickParcel$CoverageCountries) && Intrinsics.f(this.f101190a, ((EsimMobilePlanDetailsScreenContract$EndTextClickParcel$CoverageCountries) obj2).f101190a);
    }

    public final int hashCode() {
        List list = this.f101190a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        List list = this.f101190a;
        if (list == null) {
            dest.writeInt(0);
            return;
        }
        Iterator itQ = v0.a.q(dest, 1, list);
        while (itQ.hasNext()) {
            dest.writeSerializable((Serializable) itQ.next());
        }
    }
}
