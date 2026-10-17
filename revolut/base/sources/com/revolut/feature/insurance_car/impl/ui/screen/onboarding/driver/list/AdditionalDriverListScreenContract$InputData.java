package com.revolut.feature.insurance_car.impl.ui.screen.onboarding.driver.list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.insurance_car.impl.data.model.AdditionalDriver;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance_car/impl/ui/screen/onboarding/driver/list/AdditionalDriverListScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AdditionalDriverListScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<AdditionalDriverListScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f75578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f75579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f75580c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(AdditionalDriver.CREATOR, parcel, arrayList, iA, 1);
            }
            return new AdditionalDriverListScreenContract$InputData(arrayList, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AdditionalDriverListScreenContract$InputData[i];
        }
    }

    public AdditionalDriverListScreenContract$InputData(List drivers, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(drivers, "drivers");
        this.f75578a = drivers;
        this.f75579b = z;
        this.f75580c = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AdditionalDriverListScreenContract$InputData)) {
            return false;
        }
        AdditionalDriverListScreenContract$InputData additionalDriverListScreenContract$InputData = (AdditionalDriverListScreenContract$InputData) obj2;
        return Intrinsics.f(this.f75578a, additionalDriverListScreenContract$InputData.f75578a) && this.f75579b == additionalDriverListScreenContract$InputData.f75579b && this.f75580c == additionalDriverListScreenContract$InputData.f75580c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f75580c) + j6.a.c(this.f75578a.hashCode() * 31, 31, this.f75579b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f75578a, dest);
        while (itV.hasNext()) {
            ((AdditionalDriver) itV.next()).writeToParcel(dest, i);
        }
        dest.writeInt(this.f75579b ? 1 : 0);
        dest.writeInt(this.f75580c ? 1 : 0);
    }
}
