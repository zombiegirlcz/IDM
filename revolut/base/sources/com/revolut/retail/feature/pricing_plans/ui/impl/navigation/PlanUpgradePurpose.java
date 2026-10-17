package com.revolut.retail.feature.pricing_plans.ui.impl.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import hha.u;
import hha.w0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/navigation/PlanUpgradePurpose;", "Landroid/os/Parcelable;", "GetHigherPlan", "GetFeature", "GetAnyFeature", "GetAnyPlanOf", "GetPlanFromTier", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/navigation/PlanUpgradePurpose$GetAnyFeature;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/navigation/PlanUpgradePurpose$GetAnyPlanOf;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/navigation/PlanUpgradePurpose$GetFeature;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/navigation/PlanUpgradePurpose$GetHigherPlan;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/navigation/PlanUpgradePurpose$GetPlanFromTier;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PlanUpgradePurpose extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/navigation/PlanUpgradePurpose$GetAnyFeature;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/navigation/PlanUpgradePurpose;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GetAnyFeature implements PlanUpgradePurpose {

        @NotNull
        public static final Parcelable.Creator<GetAnyFeature> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f103358a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iC = 0;
                while (iC != i) {
                    iC = ch.qos.logback.core.util.a.c(parcel, arrayList, iC, 1);
                }
                return new GetAnyFeature(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GetAnyFeature[i];
            }
        }

        public GetAnyFeature(List features) {
            Intrinsics.checkNotNullParameter(features, "features");
            this.f103358a = features;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof GetAnyFeature) && Intrinsics.f(this.f103358a, ((GetAnyFeature) obj2).f103358a);
        }

        public final int hashCode() {
            return this.f103358a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f103358a, dest);
            while (itV.hasNext()) {
                dest.writeSerializable((Serializable) itV.next());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/navigation/PlanUpgradePurpose$GetAnyPlanOf;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/navigation/PlanUpgradePurpose;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GetAnyPlanOf implements PlanUpgradePurpose {

        @NotNull
        public static final Parcelable.Creator<GetAnyPlanOf> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f103359a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GetAnyPlanOf(parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GetAnyPlanOf[i];
            }
        }

        public GetAnyPlanOf(List planIds) {
            Intrinsics.checkNotNullParameter(planIds, "planIds");
            this.f103359a = planIds;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof GetAnyPlanOf) && Intrinsics.f(this.f103359a, ((GetAnyPlanOf) obj2).f103359a);
        }

        public final int hashCode() {
            return this.f103359a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeStringList(this.f103359a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/navigation/PlanUpgradePurpose$GetFeature;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/navigation/PlanUpgradePurpose;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GetFeature implements PlanUpgradePurpose {

        @NotNull
        public static final Parcelable.Creator<GetFeature> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u f103360a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GetFeature((u) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GetFeature[i];
            }
        }

        public GetFeature(u feature) {
            Intrinsics.checkNotNullParameter(feature, "feature");
            this.f103360a = feature;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof GetFeature) && Intrinsics.f(this.f103360a, ((GetFeature) obj2).f103360a);
        }

        public final int hashCode() {
            return this.f103360a.f152366a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f103360a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/navigation/PlanUpgradePurpose$GetHigherPlan;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/navigation/PlanUpgradePurpose;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GetHigherPlan implements PlanUpgradePurpose {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GetHigherPlan f103361a = new GetHigherPlan();

        @NotNull
        public static final Parcelable.Creator<GetHigherPlan> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GetHigherPlan.f103361a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GetHigherPlan[i];
            }
        }

        private GetHigherPlan() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/navigation/PlanUpgradePurpose$GetPlanFromTier;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/navigation/PlanUpgradePurpose;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GetPlanFromTier implements PlanUpgradePurpose {

        @NotNull
        public static final Parcelable.Creator<GetPlanFromTier> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w0 f103362a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GetPlanFromTier(w0.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GetPlanFromTier[i];
            }
        }

        public GetPlanFromTier(w0 planTier) {
            Intrinsics.checkNotNullParameter(planTier, "planTier");
            this.f103362a = planTier;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof GetPlanFromTier) && this.f103362a == ((GetPlanFromTier) obj2).f103362a;
        }

        public final int hashCode() {
            return this.f103362a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f103362a.name());
        }
    }
}
