package com.revolut.retail.feature.pricing_plans.ui.impl.flow.action;

import android.os.Parcel;
import android.os.Parcelable;
import hha.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flow/action/PricingPlanActionModalStep;", "Landroid/os/Parcelable;", "PlanBenefits", "PlanDocuments", "BillingPicker", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flow/action/PricingPlanActionModalStep$BillingPicker;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flow/action/PricingPlanActionModalStep$PlanBenefits;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flow/action/PricingPlanActionModalStep$PlanDocuments;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PricingPlanActionModalStep extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flow/action/PricingPlanActionModalStep$BillingPicker;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flow/action/PricingPlanActionModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BillingPicker implements PricingPlanActionModalStep {

        @NotNull
        public static final Parcelable.Creator<BillingPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102962a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i f102963b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f102964c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BillingPicker(parcel.readInt() == 0 ? null : i.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BillingPicker[i];
            }
        }

        public BillingPicker(i iVar, String pricingPlanId, String str, String str2) {
            Intrinsics.checkNotNullParameter(pricingPlanId, "pricingPlanId");
            this.f102962a = pricingPlanId;
            this.f102963b = iVar;
            this.f102964c = str;
            this.d = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BillingPicker)) {
                return false;
            }
            BillingPicker billingPicker = (BillingPicker) obj2;
            return Intrinsics.f(this.f102962a, billingPicker.f102962a) && this.f102963b == billingPicker.f102963b && Intrinsics.f(this.f102964c, billingPicker.f102964c) && Intrinsics.f(this.d, billingPicker.d);
        }

        public final int hashCode() {
            int iHashCode = this.f102962a.hashCode() * 31;
            i iVar = this.f102963b;
            int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
            String str = this.f102964c;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102962a);
            i iVar = this.f102963b;
            if (iVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(iVar.name());
            }
            dest.writeString(this.f102964c);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flow/action/PricingPlanActionModalStep$PlanBenefits;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flow/action/PricingPlanActionModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanBenefits implements PricingPlanActionModalStep {

        @NotNull
        public static final Parcelable.Creator<PlanBenefits> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102965a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PlanBenefits(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanBenefits[i];
            }
        }

        public PlanBenefits(String pricingPlanId) {
            Intrinsics.checkNotNullParameter(pricingPlanId, "pricingPlanId");
            this.f102965a = pricingPlanId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PlanBenefits) && Intrinsics.f(this.f102965a, ((PlanBenefits) obj2).f102965a);
        }

        public final int hashCode() {
            return this.f102965a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102965a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/flow/action/PricingPlanActionModalStep$PlanDocuments;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/flow/action/PricingPlanActionModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PlanDocuments implements PricingPlanActionModalStep {

        @NotNull
        public static final Parcelable.Creator<PlanDocuments> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f102966a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(PlanDocuments.class, parcel, arrayList, iE, 1);
                }
                return new PlanDocuments(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PlanDocuments[i];
            }
        }

        public PlanDocuments(List documents) {
            Intrinsics.checkNotNullParameter(documents, "documents");
            this.f102966a = documents;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PlanDocuments) && Intrinsics.f(this.f102966a, ((PlanDocuments) obj2).f102966a);
        }

        public final int hashCode() {
            return this.f102966a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f102966a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }
}
