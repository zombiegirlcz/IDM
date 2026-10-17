package com.revolut.feature.insurance_car.impl.ui.screen.onboarding.plan_options;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import kl7.f1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance_car/impl/ui/screen/onboarding/plan_options/PlanOptionsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanOptionsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<PlanOptionsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1 f75599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75600c;
    public final boolean d;
    public final boolean e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            f1 f1VarValueOf = f1.valueOf(parcel.readString());
            String string2 = parcel.readString();
            boolean z3 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            return new PlanOptionsScreenContract$InputData(string, f1VarValueOf, string2, z3, parcel.readInt() == 0 ? z : true);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlanOptionsScreenContract$InputData[i];
        }
    }

    public PlanOptionsScreenContract$InputData(String applicationFormId, f1 paymentFrequency, String planId, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(applicationFormId, "applicationFormId");
        Intrinsics.checkNotNullParameter(paymentFrequency, "paymentFrequency");
        Intrinsics.checkNotNullParameter(planId, "planId");
        this.f75598a = applicationFormId;
        this.f75599b = paymentFrequency;
        this.f75600c = planId;
        this.d = z;
        this.e = z3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlanOptionsScreenContract$InputData)) {
            return false;
        }
        PlanOptionsScreenContract$InputData planOptionsScreenContract$InputData = (PlanOptionsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f75598a, planOptionsScreenContract$InputData.f75598a) && this.f75599b == planOptionsScreenContract$InputData.f75599b && Intrinsics.f(this.f75600c, planOptionsScreenContract$InputData.f75600c) && this.d == planOptionsScreenContract$InputData.d && this.e == planOptionsScreenContract$InputData.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(p.a.c((this.f75599b.hashCode() + (this.f75598a.hashCode() * 31)) * 31, 31, this.f75600c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75598a);
        dest.writeString(this.f75599b.name());
        dest.writeString(this.f75600c);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeInt(this.e ? 1 : 0);
    }
}
