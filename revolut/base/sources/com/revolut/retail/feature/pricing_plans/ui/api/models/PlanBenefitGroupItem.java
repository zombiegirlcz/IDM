package com.revolut.retail.feature.pricing_plans.ui.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import hha.x;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanBenefitGroupItem;", "Landroid/os/Parcelable;", "<init>", "()V", "Single", "Combined", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanBenefitGroupItem$Combined;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanBenefitGroupItem$Single;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PlanBenefitGroupItem implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanBenefitGroupItem$Combined;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanBenefitGroupItem;", "", "toString", "()Ljava/lang/String;", "com/revolut/retail/feature/pricing_plans/ui/api/models/a", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Combined extends PlanBenefitGroupItem {

        @NotNull
        public static final Parcelable.Creator<Combined> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.revolut.retail.feature.pricing_plans.ui.api.models.a f102642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f102643b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                com.revolut.retail.feature.pricing_plans.ui.api.models.a aVarValueOf = com.revolut.retail.feature.pricing_plans.ui.api.models.a.valueOf(parcel.readString());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                return new Combined(aVarValueOf, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Combined[i];
            }
        }

        public Combined(com.revolut.retail.feature.pricing_plans.ui.api.models.a name, ArrayList benefits) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(benefits, "benefits");
            this.f102642a = name;
            this.f102643b = benefits;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Combined)) {
                return false;
            }
            Combined combined = (Combined) obj2;
            return this.f102642a == combined.f102642a && this.f102643b.equals(combined.f102643b);
        }

        public final int hashCode() {
            return this.f102643b.hashCode() + (this.f102642a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102642a.name());
            Iterator itY = j6.a.y(this.f102643b, dest);
            while (itY.hasNext()) {
                dest.writeSerializable((Serializable) itY.next());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanBenefitGroupItem$Single;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PlanBenefitGroupItem;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Single extends PlanBenefitGroupItem {

        @NotNull
        public static final Parcelable.Creator<Single> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x f102644a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Single((x) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Single[i];
            }
        }

        public Single(x benefit) {
            Intrinsics.checkNotNullParameter(benefit, "benefit");
            this.f102644a = benefit;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Single) && Intrinsics.f(this.f102644a, ((Single) obj2).f102644a);
        }

        public final int hashCode() {
            return this.f102644a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f102644a);
        }
    }

    private PlanBenefitGroupItem() {
    }
}
