package com.revolut.feature.freelancer.impl.ui.sales.new_sale_picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import cs6.c;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;
import zhm.d0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/freelancer/impl/ui/sales/new_sale_picker/FreelancerNewSalePickerScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_freelancer_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreelancerNewSalePickerScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<FreelancerNewSalePickerScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f74161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f74162b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            b bVar = (b) parcel.readSerializable();
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashSet.add(c.valueOf(parcel.readString()));
            }
            return new FreelancerNewSalePickerScreenContract$InputData(linkedHashSet, bVar);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FreelancerNewSalePickerScreenContract$InputData[i];
        }
    }

    public FreelancerNewSalePickerScreenContract$InputData(Set includedSaleTypes, b bVar) {
        Intrinsics.checkNotNullParameter(includedSaleTypes, "includedSaleTypes");
        this.f74161a = bVar;
        this.f74162b = includedSaleTypes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FreelancerNewSalePickerScreenContract$InputData)) {
            return false;
        }
        FreelancerNewSalePickerScreenContract$InputData freelancerNewSalePickerScreenContract$InputData = (FreelancerNewSalePickerScreenContract$InputData) obj2;
        return Intrinsics.f(this.f74161a, freelancerNewSalePickerScreenContract$InputData.f74161a) && Intrinsics.f(this.f74162b, freelancerNewSalePickerScreenContract$InputData.f74162b);
    }

    public final int hashCode() {
        b bVar = this.f74161a;
        return this.f74162b.hashCode() + ((bVar == null ? 0 : bVar.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f74161a);
        Iterator itV = n.v(this.f74162b, dest);
        while (itV.hasNext()) {
            dest.writeString(((c) itV.next()).name());
        }
    }

    public FreelancerNewSalePickerScreenContract$InputData() {
        this(d0.i1(c.b()), null);
    }
}
