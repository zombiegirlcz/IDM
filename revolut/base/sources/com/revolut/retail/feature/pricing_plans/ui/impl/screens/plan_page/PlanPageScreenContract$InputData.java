package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_page;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.pricing_plans.ui.impl.model.PlanLayoutType;
import ggk.g1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v1.c;
import xfa.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_page/PlanPageScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanPageScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PlanPageScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f103603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f103604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g1 f103605c;
    public final PlanLayoutType d;
    public final boolean e;
    public final xfa.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f103606g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            b bVarValueOf = b.valueOf(parcel.readString());
            PlanLayoutType planLayoutType = (PlanLayoutType) parcel.readParcelable(PlanPageScreenContract$InputData.class.getClassLoader());
            boolean z3 = true;
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            return new PlanPageScreenContract$InputData(string, bVarValueOf, null, planLayoutType, z3, (xfa.a) parcel.readSerializable(), parcel.readInt() != 0 ? z : false);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlanPageScreenContract$InputData[i];
        }
    }

    public PlanPageScreenContract$InputData(String planId, b source, g1 g1Var, PlanLayoutType layoutType, boolean z, xfa.a aVar, boolean z3) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(layoutType, "layoutType");
        this.f103603a = planId;
        this.f103604b = source;
        this.f103605c = g1Var;
        this.d = layoutType;
        this.e = z;
        this.f = aVar;
        this.f103606g = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlanPageScreenContract$InputData)) {
            return false;
        }
        PlanPageScreenContract$InputData planPageScreenContract$InputData = (PlanPageScreenContract$InputData) obj2;
        return Intrinsics.f(this.f103603a, planPageScreenContract$InputData.f103603a) && this.f103604b == planPageScreenContract$InputData.f103604b && Intrinsics.f(this.f103605c, planPageScreenContract$InputData.f103605c) && Intrinsics.f(this.d, planPageScreenContract$InputData.d) && this.e == planPageScreenContract$InputData.e && Intrinsics.f(this.f, planPageScreenContract$InputData.f) && this.f103606g == planPageScreenContract$InputData.f103606g;
    }

    public final int hashCode() {
        int iC = c.c(this.f103604b, this.f103603a.hashCode() * 31, 31);
        g1 g1Var = this.f103605c;
        int iC2 = j6.a.c((this.d.hashCode() + ((iC + (g1Var == null ? 0 : g1Var.hashCode())) * 31)) * 31, 31, this.e);
        xfa.a aVar = this.f;
        return Boolean.hashCode(this.f103606g) + ((iC2 + (aVar != null ? aVar.f305202a.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f103603a);
        dest.writeString(this.f103604b.name());
        dest.writeParcelable(this.d, i);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeSerializable(this.f);
        dest.writeInt(this.f103606g ? 1 : 0);
    }
}
