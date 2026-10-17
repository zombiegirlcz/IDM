package com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_benefits;

import android.os.Parcel;
import android.os.Parcelable;
import hha.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_benefits/PlanBenefitsScreenContract$PlanReference", "Landroid/os/Parcelable;", "Id", "Tier", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_benefits/PlanBenefitsScreenContract$PlanReference$Id;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_benefits/PlanBenefitsScreenContract$PlanReference$Tier;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PlanBenefitsScreenContract$PlanReference extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_benefits/PlanBenefitsScreenContract$PlanReference$Id;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_benefits/PlanBenefitsScreenContract$PlanReference;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Id implements PlanBenefitsScreenContract$PlanReference {

        @NotNull
        public static final Parcelable.Creator<Id> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f103461a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Id(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Id[i];
            }
        }

        public Id(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f103461a = value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Id) && Intrinsics.f(this.f103461a, ((Id) obj2).f103461a);
        }

        public final int hashCode() {
            return this.f103461a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f103461a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_benefits/PlanBenefitsScreenContract$PlanReference$Tier;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/plan_benefits/PlanBenefitsScreenContract$PlanReference;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Tier implements PlanBenefitsScreenContract$PlanReference {

        @NotNull
        public static final Parcelable.Creator<Tier> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final w0 f103462a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Tier(w0.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Tier[i];
            }
        }

        public Tier(w0 value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f103462a = value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Tier) && this.f103462a == ((Tier) obj2).f103462a;
        }

        public final int hashCode() {
            return this.f103462a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f103462a.name());
        }
    }
}
