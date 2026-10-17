package com.revolut.feature.insurance_car.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import nr7.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/PlanOption;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanOption implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PlanOption> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f75283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f75285c;
    public final ArrayList d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            b bVarValueOf = b.valueOf(parcel.readString());
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(OptionValue.CREATOR, parcel, arrayList, iA, 1);
            }
            return new PlanOption(bVarValueOf, string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlanOption[i];
        }
    }

    public PlanOption(b iconKey, String displayName, String description, ArrayList values) {
        Intrinsics.checkNotNullParameter(iconKey, "iconKey");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(values, "values");
        this.f75283a = iconKey;
        this.f75284b = displayName;
        this.f75285c = description;
        this.d = values;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlanOption)) {
            return false;
        }
        PlanOption planOption = (PlanOption) obj2;
        return this.f75283a == planOption.f75283a && Intrinsics.f(this.f75284b, planOption.f75284b) && Intrinsics.f(this.f75285c, planOption.f75285c) && this.d.equals(planOption.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f75283a.hashCode() * 31, 31, this.f75284b), 31, this.f75285c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75283a.name());
        dest.writeString(this.f75284b);
        dest.writeString(this.f75285c);
        Iterator itY = j6.a.y(this.d, dest);
        while (itY.hasNext()) {
            ((OptionValue) itY.next()).writeToParcel(dest, i);
        }
    }
}
