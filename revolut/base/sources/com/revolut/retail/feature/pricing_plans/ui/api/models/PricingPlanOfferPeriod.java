package com.revolut.retail.feature.pricing_plans.ui.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import ggk.q1;
import ip0.v7;
import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Period;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanOfferPeriod;", "Landroid/os/Parcelable;", "<init>", "()V", "FreeTrial", "Discount", "ggk/q1", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanOfferPeriod$Discount;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanOfferPeriod$FreeTrial;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PricingPlanOfferPeriod implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanOfferPeriod$Discount;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanOfferPeriod;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Discount extends PricingPlanOfferPeriod {

        @NotNull
        public static final Parcelable.Creator<Discount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDateTime f102841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDateTime f102842b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final dj0.d f102843c;
        public final Period d;
        public final q1 e;
        public final hha.g f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Discount((LocalDateTime) parcel.readSerializable(), (LocalDateTime) parcel.readSerializable(), (dj0.d) parcel.readSerializable(), (Period) parcel.readSerializable(), q1.valueOf(parcel.readString()), (hha.g) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Discount[i];
            }
        }

        public Discount(LocalDateTime localDateTime, LocalDateTime endDate, dj0.d discountPrice, Period duration, q1 state, hha.g currentBilling) {
            Intrinsics.checkNotNullParameter(endDate, "endDate");
            Intrinsics.checkNotNullParameter(discountPrice, "discountPrice");
            Intrinsics.checkNotNullParameter(duration, "duration");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(currentBilling, "currentBilling");
            this.f102841a = localDateTime;
            this.f102842b = endDate;
            this.f102843c = discountPrice;
            this.d = duration;
            this.e = state;
            this.f = currentBilling;
        }

        @Override // com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPeriod
        /* JADX INFO: renamed from: a, reason: from getter */
        public final hha.g getE() {
            return this.f;
        }

        @Override // com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPeriod
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Period getF102846c() {
            return this.d;
        }

        @Override // com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPeriod
        /* JADX INFO: renamed from: c, reason: from getter */
        public final q1 getD() {
            return this.e;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Discount)) {
                return false;
            }
            Discount discount = (Discount) obj2;
            return Intrinsics.f(this.f102841a, discount.f102841a) && Intrinsics.f(this.f102842b, discount.f102842b) && Intrinsics.f(this.f102843c, discount.f102843c) && Intrinsics.f(this.d, discount.d) && this.e == discount.e && Intrinsics.f(this.f, discount.f);
        }

        public final int hashCode() {
            LocalDateTime localDateTime = this.f102841a;
            return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + v7.c(v7.i(this.f102842b, (localDateTime == null ? 0 : localDateTime.hashCode()) * 31, 31), 31, this.f102843c)) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f102841a);
            dest.writeSerializable(this.f102842b);
            dest.writeSerializable(this.f102843c);
            dest.writeSerializable(this.d);
            dest.writeString(this.e.name());
            dest.writeSerializable(this.f);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanOfferPeriod$FreeTrial;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanOfferPeriod;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FreeTrial extends PricingPlanOfferPeriod {

        @NotNull
        public static final Parcelable.Creator<FreeTrial> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LocalDateTime f102844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LocalDateTime f102845b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Period f102846c;
        public final q1 d;
        public final hha.g e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FreeTrial((LocalDateTime) parcel.readSerializable(), (LocalDateTime) parcel.readSerializable(), (Period) parcel.readSerializable(), q1.valueOf(parcel.readString()), (hha.g) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FreeTrial[i];
            }
        }

        public FreeTrial(LocalDateTime localDateTime, LocalDateTime localDateTime2, Period duration, q1 state, hha.g currentBilling) {
            Intrinsics.checkNotNullParameter(duration, "duration");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(currentBilling, "currentBilling");
            this.f102844a = localDateTime;
            this.f102845b = localDateTime2;
            this.f102846c = duration;
            this.d = state;
            this.e = currentBilling;
        }

        @Override // com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPeriod
        /* JADX INFO: renamed from: a, reason: from getter */
        public final hha.g getE() {
            return this.e;
        }

        @Override // com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPeriod
        /* JADX INFO: renamed from: b, reason: from getter */
        public final Period getF102846c() {
            return this.f102846c;
        }

        @Override // com.revolut.retail.feature.pricing_plans.ui.api.models.PricingPlanOfferPeriod
        /* JADX INFO: renamed from: c, reason: from getter */
        public final q1 getD() {
            return this.d;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof FreeTrial)) {
                return false;
            }
            FreeTrial freeTrial = (FreeTrial) obj2;
            return Intrinsics.f(this.f102844a, freeTrial.f102844a) && Intrinsics.f(this.f102845b, freeTrial.f102845b) && Intrinsics.f(this.f102846c, freeTrial.f102846c) && this.d == freeTrial.d && Intrinsics.f(this.e, freeTrial.e);
        }

        public final int hashCode() {
            LocalDateTime localDateTime = this.f102844a;
            int iHashCode = (localDateTime == null ? 0 : localDateTime.hashCode()) * 31;
            LocalDateTime localDateTime2 = this.f102845b;
            return this.e.hashCode() + ((this.d.hashCode() + ((this.f102846c.hashCode() + ((iHashCode + (localDateTime2 != null ? localDateTime2.hashCode() : 0)) * 31)) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f102844a);
            dest.writeSerializable(this.f102845b);
            dest.writeSerializable(this.f102846c);
            dest.writeString(this.d.name());
            dest.writeSerializable(this.e);
        }
    }

    private PricingPlanOfferPeriod() {
    }

    /* JADX INFO: renamed from: a */
    public abstract hha.g getE();

    /* JADX INFO: renamed from: b */
    public abstract Period getF102846c();

    /* JADX INFO: renamed from: c */
    public abstract q1 getD();
}
