package com.revolut.feature.insurance_car.impl.ui.screen.onboarding.eligibility;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kl7.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/insurance_car/impl/ui/screen/onboarding/eligibility/EligibilityScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EligibilityScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<EligibilityScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f75589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f75590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f75591c;
    public final Map d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            boolean z = parcel.readInt() != 0;
            boolean z3 = parcel.readInt() != 0;
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(n0.valueOf(parcel.readString()));
            }
            int i3 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i3);
            for (int i5 = 0; i5 != i3; i5++) {
                linkedHashMap.put(n0.valueOf(parcel.readString()), Boolean.valueOf(parcel.readInt() != 0));
            }
            return new EligibilityScreenContract$InputData(z, z3, arrayList, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EligibilityScreenContract$InputData[i];
        }
    }

    public EligibilityScreenContract$InputData(boolean z, boolean z3, List questions, Map answers) {
        Intrinsics.checkNotNullParameter(questions, "questions");
        Intrinsics.checkNotNullParameter(answers, "answers");
        this.f75589a = z;
        this.f75590b = z3;
        this.f75591c = questions;
        this.d = answers;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EligibilityScreenContract$InputData)) {
            return false;
        }
        EligibilityScreenContract$InputData eligibilityScreenContract$InputData = (EligibilityScreenContract$InputData) obj2;
        return this.f75589a == eligibilityScreenContract$InputData.f75589a && this.f75590b == eligibilityScreenContract$InputData.f75590b && Intrinsics.f(this.f75591c, eligibilityScreenContract$InputData.f75591c) && Intrinsics.f(this.d, eligibilityScreenContract$InputData.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(j6.a.c(Boolean.hashCode(this.f75589a) * 31, 31, this.f75590b), 31, this.f75591c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f75589a ? 1 : 0);
        dest.writeInt(this.f75590b ? 1 : 0);
        Iterator itV = p.a.v(this.f75591c, dest);
        while (itV.hasNext()) {
            dest.writeString(((n0) itV.next()).name());
        }
        Iterator itZ = j6.a.z(this.d, dest);
        while (itZ.hasNext()) {
            Map.Entry entry = (Map.Entry) itZ.next();
            dest.writeString(((n0) entry.getKey()).name());
            dest.writeInt(((Boolean) entry.getValue()).booleanValue() ? 1 : 0);
        }
    }
}
