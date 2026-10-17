package com.revolut.retail.feature.junior_upgrade.impl.model;

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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/junior_upgrade/impl/model/PlanConfigurations;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_junior_upgrade_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanConfigurations implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PlanConfigurations> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f101751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f101752b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            int iC = 0;
            while (iC != i) {
                iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
            }
            int i2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i2);
            while (iE != i2) {
                iE = j6.a.e(PlanConfigurations.class, parcel, arrayList2, iE, 1);
            }
            return new PlanConfigurations(arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PlanConfigurations[i];
        }
    }

    public PlanConfigurations(List plans, List configurations) {
        Intrinsics.checkNotNullParameter(plans, "plans");
        Intrinsics.checkNotNullParameter(configurations, "configurations");
        this.f101751a = plans;
        this.f101752b = configurations;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PlanConfigurations)) {
            return false;
        }
        PlanConfigurations planConfigurations = (PlanConfigurations) obj2;
        return Intrinsics.f(this.f101751a, planConfigurations.f101751a) && Intrinsics.f(this.f101752b, planConfigurations.f101752b);
    }

    public final int hashCode() {
        return this.f101752b.hashCode() + (this.f101751a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = p.a.v(this.f101751a, dest);
        while (itV.hasNext()) {
            dest.writeSerializable((Serializable) itV.next());
        }
        Iterator itV2 = p.a.v(this.f101752b, dest);
        while (itV2.hasNext()) {
            dest.writeParcelable((Parcelable) itV2.next(), i);
        }
    }
}
