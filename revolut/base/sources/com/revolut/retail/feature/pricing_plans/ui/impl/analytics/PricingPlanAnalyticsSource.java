package com.revolut.retail.feature.pricing_plans.ui.impl.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xfa.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/analytics/PricingPlanAnalyticsSource;", "Landroid/os/Parcelable;", "<init>", "()V", "Predefined", "Custom", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/analytics/PricingPlanAnalyticsSource$Custom;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/analytics/PricingPlanAnalyticsSource$Predefined;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PricingPlanAnalyticsSource implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/analytics/PricingPlanAnalyticsSource$Custom;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/analytics/PricingPlanAnalyticsSource;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Custom extends PricingPlanAnalyticsSource {

        @NotNull
        public static final Parcelable.Creator<Custom> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102959a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Custom(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Custom[i];
            }
        }

        public Custom(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f102959a = value;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Custom) && Intrinsics.f(this.f102959a, ((Custom) obj2).f102959a);
        }

        public final int hashCode() {
            return this.f102959a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102959a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/analytics/PricingPlanAnalyticsSource$Predefined;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/analytics/PricingPlanAnalyticsSource;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Predefined extends PricingPlanAnalyticsSource {

        @NotNull
        public static final Parcelable.Creator<Predefined> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f102960a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Predefined(b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Predefined[i];
            }
        }

        public Predefined(b source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f102960a = source;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Predefined) && this.f102960a == ((Predefined) obj2).f102960a;
        }

        public final int hashCode() {
            return this.f102960a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102960a.name());
        }
    }

    private PricingPlanAnalyticsSource() {
    }
}
