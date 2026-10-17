package com.revolut.feature.credit.application.plugins.impl.ui.application;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.api.models.IntendedPricingPlan;
import ft3.a1;
import ft3.d1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/application/CreditApplicationFlowContract$State", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CreditApplicationFlowContract$State implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CreditApplicationFlowContract$State> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f67060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f67061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f67062c;
    public final d1 d;
    public final IntendedPricingPlan e;
    public final a1 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final it3.d f67063g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(h54.c.valueOf(parcel.readString()));
            }
            int i3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i3);
            for (int i5 = 0; i5 != i3; i5++) {
                arrayList2.add(h54.c.valueOf(parcel.readString()));
            }
            int i6 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i6);
            for (int i21 = 0; i21 != i6; i21++) {
                arrayList3.add(h54.c.valueOf(parcel.readString()));
            }
            return new CreditApplicationFlowContract$State(arrayList, arrayList2, arrayList3, (d1) parcel.readSerializable(), (IntendedPricingPlan) parcel.readParcelable(CreditApplicationFlowContract$State.class.getClassLoader()), (a1) parcel.readSerializable(), (it3.d) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CreditApplicationFlowContract$State[i];
        }
    }

    public CreditApplicationFlowContract$State(List remainingApplicationSteps, List passedApplicationSteps, List skippedApplicationSteps, d1 productClassification, IntendedPricingPlan intendedPricingPlan, a1 entryPointPayload, it3.d dVar) {
        Intrinsics.checkNotNullParameter(remainingApplicationSteps, "remainingApplicationSteps");
        Intrinsics.checkNotNullParameter(passedApplicationSteps, "passedApplicationSteps");
        Intrinsics.checkNotNullParameter(skippedApplicationSteps, "skippedApplicationSteps");
        Intrinsics.checkNotNullParameter(productClassification, "productClassification");
        Intrinsics.checkNotNullParameter(entryPointPayload, "entryPointPayload");
        this.f67060a = remainingApplicationSteps;
        this.f67061b = passedApplicationSteps;
        this.f67062c = skippedApplicationSteps;
        this.d = productClassification;
        this.e = intendedPricingPlan;
        this.f = entryPointPayload;
        this.f67063g = dVar;
    }

    public static CreditApplicationFlowContract$State a(CreditApplicationFlowContract$State creditApplicationFlowContract$State, ArrayList arrayList, List list, List list2, d1 d1Var, IntendedPricingPlan intendedPricingPlan, it3.d dVar, int i) {
        List list3 = arrayList;
        if ((i & 1) != 0) {
            list3 = creditApplicationFlowContract$State.f67060a;
        }
        List remainingApplicationSteps = list3;
        if ((i & 2) != 0) {
            list = creditApplicationFlowContract$State.f67061b;
        }
        List passedApplicationSteps = list;
        if ((i & 4) != 0) {
            list2 = creditApplicationFlowContract$State.f67062c;
        }
        List skippedApplicationSteps = list2;
        if ((i & 8) != 0) {
            d1Var = creditApplicationFlowContract$State.d;
        }
        d1 productClassification = d1Var;
        if ((i & 16) != 0) {
            intendedPricingPlan = creditApplicationFlowContract$State.e;
        }
        IntendedPricingPlan intendedPricingPlan2 = intendedPricingPlan;
        a1 entryPointPayload = creditApplicationFlowContract$State.f;
        if ((i & 64) != 0) {
            dVar = creditApplicationFlowContract$State.f67063g;
        }
        creditApplicationFlowContract$State.getClass();
        Intrinsics.checkNotNullParameter(remainingApplicationSteps, "remainingApplicationSteps");
        Intrinsics.checkNotNullParameter(passedApplicationSteps, "passedApplicationSteps");
        Intrinsics.checkNotNullParameter(skippedApplicationSteps, "skippedApplicationSteps");
        Intrinsics.checkNotNullParameter(productClassification, "productClassification");
        Intrinsics.checkNotNullParameter(entryPointPayload, "entryPointPayload");
        return new CreditApplicationFlowContract$State(remainingApplicationSteps, passedApplicationSteps, skippedApplicationSteps, productClassification, intendedPricingPlan2, entryPointPayload, dVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CreditApplicationFlowContract$State)) {
            return false;
        }
        CreditApplicationFlowContract$State creditApplicationFlowContract$State = (CreditApplicationFlowContract$State) obj2;
        return Intrinsics.f(this.f67060a, creditApplicationFlowContract$State.f67060a) && Intrinsics.f(this.f67061b, creditApplicationFlowContract$State.f67061b) && Intrinsics.f(this.f67062c, creditApplicationFlowContract$State.f67062c) && Intrinsics.f(this.d, creditApplicationFlowContract$State.d) && Intrinsics.f(this.e, creditApplicationFlowContract$State.e) && Intrinsics.f(this.f, creditApplicationFlowContract$State.f) && Intrinsics.f(this.f67063g, creditApplicationFlowContract$State.f67063g);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + p.a.d(p.a.d(this.f67060a.hashCode() * 31, 31, this.f67061b), 31, this.f67062c)) * 31;
        IntendedPricingPlan intendedPricingPlan = this.e;
        int iHashCode2 = (this.f.hashCode() + ((iHashCode + (intendedPricingPlan == null ? 0 : intendedPricingPlan.hashCode())) * 31)) * 31;
        it3.d dVar = this.f67063g;
        return iHashCode2 + (dVar != null ? dVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f67060a, dest);
        while (itV.hasNext()) {
            dest.writeString(((h54.c) itV.next()).name());
        }
        Iterator itV2 = p.a.v(this.f67061b, dest);
        while (itV2.hasNext()) {
            dest.writeString(((h54.c) itV2.next()).name());
        }
        Iterator itV3 = p.a.v(this.f67062c, dest);
        while (itV3.hasNext()) {
            dest.writeString(((h54.c) itV3.next()).name());
        }
        dest.writeSerializable(this.d);
        dest.writeParcelable(this.e, i);
        dest.writeSerializable(this.f);
        dest.writeSerializable(this.f67063g);
    }
}
