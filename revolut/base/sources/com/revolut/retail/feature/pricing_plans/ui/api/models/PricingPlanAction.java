package com.revolut.retail.feature.pricing_plans.ui.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanAction;", "Landroid/os/Parcelable;", "Common", "FlowSpecific", "Dismiss", "Decline", "Confirm", "OpenBillingPicker", "OpenUrl", "SeeAllBenefits", "Upgrade", "ApplyDiscount", "SeeAllDocuments", "ClaimPlanReferral", "Unsupported", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanAction$Common;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanAction$FlowSpecific;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanAction$Unsupported;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PricingPlanAction extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanAction$ApplyDiscount;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanAction$Common;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ApplyDiscount implements Common {

        @NotNull
        public static final Parcelable.Creator<ApplyDiscount> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102792a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final hha.i f102793b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f102794c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ApplyDiscount(hha.i.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ApplyDiscount[i];
            }
        }

        public ApplyDiscount(hha.i billingPeriod, String pricingPlanId, String offerToken) {
            Intrinsics.checkNotNullParameter(pricingPlanId, "pricingPlanId");
            Intrinsics.checkNotNullParameter(billingPeriod, "billingPeriod");
            Intrinsics.checkNotNullParameter(offerToken, "offerToken");
            this.f102792a = pricingPlanId;
            this.f102793b = billingPeriod;
            this.f102794c = offerToken;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ApplyDiscount)) {
                return false;
            }
            ApplyDiscount applyDiscount = (ApplyDiscount) obj2;
            return Intrinsics.f(this.f102792a, applyDiscount.f102792a) && this.f102793b == applyDiscount.f102793b && Intrinsics.f(this.f102794c, applyDiscount.f102794c);
        }

        public final int hashCode() {
            return this.f102794c.hashCode() + ((this.f102793b.hashCode() + (this.f102792a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102792a);
            dest.writeString(this.f102793b.name());
            dest.writeString(this.f102794c);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanAction$ClaimPlanReferral;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanAction$FlowSpecific;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ClaimPlanReferral implements FlowSpecific {

        @NotNull
        public static final Parcelable.Creator<ClaimPlanReferral> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102795a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f102796b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final hha.i f102797c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ClaimPlanReferral(hha.i.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ClaimPlanReferral[i];
            }
        }

        public ClaimPlanReferral(hha.i billingPeriod, String planReferralId, String targetPlanId, String planDiscountId) {
            Intrinsics.checkNotNullParameter(planReferralId, "planReferralId");
            Intrinsics.checkNotNullParameter(targetPlanId, "targetPlanId");
            Intrinsics.checkNotNullParameter(billingPeriod, "billingPeriod");
            Intrinsics.checkNotNullParameter(planDiscountId, "planDiscountId");
            this.f102795a = planReferralId;
            this.f102796b = targetPlanId;
            this.f102797c = billingPeriod;
            this.d = planDiscountId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ClaimPlanReferral)) {
                return false;
            }
            ClaimPlanReferral claimPlanReferral = (ClaimPlanReferral) obj2;
            return Intrinsics.f(this.f102795a, claimPlanReferral.f102795a) && Intrinsics.f(this.f102796b, claimPlanReferral.f102796b) && this.f102797c == claimPlanReferral.f102797c && Intrinsics.f(this.d, claimPlanReferral.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.f102797c.hashCode() + p.a.c(this.f102795a.hashCode() * 31, 31, this.f102796b)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102795a);
            dest.writeString(this.f102796b);
            dest.writeString(this.f102797c.name());
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanAction$Common;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanAction;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanAction$ApplyDiscount;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanAction$Decline;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanAction$Dismiss;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanAction$OpenBillingPicker;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanAction$OpenUrl;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanAction$SeeAllBenefits;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanAction$SeeAllDocuments;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanAction$Upgrade;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Common extends PricingPlanAction {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanAction$Confirm;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanAction$FlowSpecific;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Confirm implements FlowSpecific {

        @NotNull
        public static final Parcelable.Creator<Confirm> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f102799b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Confirm(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Confirm[i];
            }
        }

        public Confirm(String successTitle, String str) {
            Intrinsics.checkNotNullParameter(successTitle, "successTitle");
            this.f102798a = successTitle;
            this.f102799b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Confirm)) {
                return false;
            }
            Confirm confirm = (Confirm) obj2;
            return Intrinsics.f(this.f102798a, confirm.f102798a) && Intrinsics.f(this.f102799b, confirm.f102799b);
        }

        public final int hashCode() {
            int iHashCode = this.f102798a.hashCode() * 31;
            String str = this.f102799b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102798a);
            dest.writeString(this.f102799b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanAction$Decline;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanAction$Common;", "<init>", "()V", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Decline implements Common {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Decline f102800a = new Decline();

        @NotNull
        public static final Parcelable.Creator<Decline> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Decline.f102800a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Decline[i];
            }
        }

        private Decline() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanAction$Dismiss;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanAction$Common;", "<init>", "()V", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Dismiss implements Common {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Dismiss f102801a = new Dismiss();

        @NotNull
        public static final Parcelable.Creator<Dismiss> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Dismiss.f102801a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Dismiss[i];
            }
        }

        private Dismiss() {
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

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0002\u0002\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanAction$FlowSpecific;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanAction;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanAction$ClaimPlanReferral;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanAction$Confirm;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface FlowSpecific extends PricingPlanAction {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanAction$OpenBillingPicker;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanAction$Common;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenBillingPicker implements Common {

        @NotNull
        public static final Parcelable.Creator<OpenBillingPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102802a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final hha.i f102803b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f102804c;
        public final String d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenBillingPicker(parcel.readInt() == 0 ? null : hha.i.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenBillingPicker[i];
            }
        }

        public OpenBillingPicker(hha.i iVar, String pricingPlanId, String str, String str2) {
            Intrinsics.checkNotNullParameter(pricingPlanId, "pricingPlanId");
            this.f102802a = pricingPlanId;
            this.f102803b = iVar;
            this.f102804c = str;
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
            if (!(obj2 instanceof OpenBillingPicker)) {
                return false;
            }
            OpenBillingPicker openBillingPicker = (OpenBillingPicker) obj2;
            return Intrinsics.f(this.f102802a, openBillingPicker.f102802a) && this.f102803b == openBillingPicker.f102803b && Intrinsics.f(this.f102804c, openBillingPicker.f102804c) && Intrinsics.f(this.d, openBillingPicker.d);
        }

        public final int hashCode() {
            int iHashCode = this.f102802a.hashCode() * 31;
            hha.i iVar = this.f102803b;
            int iHashCode2 = (iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31;
            String str = this.f102804c;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102802a);
            hha.i iVar = this.f102803b;
            if (iVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(iVar.name());
            }
            dest.writeString(this.f102804c);
            dest.writeString(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanAction$OpenUrl;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanAction$Common;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class OpenUrl implements Common {

        @NotNull
        public static final Parcelable.Creator<OpenUrl> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102805a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new OpenUrl(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OpenUrl[i];
            }
        }

        public OpenUrl(String url2) {
            Intrinsics.checkNotNullParameter(url2, "url");
            this.f102805a = url2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof OpenUrl) && Intrinsics.f(this.f102805a, ((OpenUrl) obj2).f102805a);
        }

        public final int hashCode() {
            return this.f102805a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102805a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanAction$SeeAllBenefits;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanAction$Common;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SeeAllBenefits implements Common {

        @NotNull
        public static final Parcelable.Creator<SeeAllBenefits> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102806a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SeeAllBenefits(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SeeAllBenefits[i];
            }
        }

        public SeeAllBenefits(String pricingPlanId) {
            Intrinsics.checkNotNullParameter(pricingPlanId, "pricingPlanId");
            this.f102806a = pricingPlanId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SeeAllBenefits) && Intrinsics.f(this.f102806a, ((SeeAllBenefits) obj2).f102806a);
        }

        public final int hashCode() {
            return this.f102806a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102806a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanAction$SeeAllDocuments;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanAction$Common;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SeeAllDocuments implements Common {

        @NotNull
        public static final Parcelable.Creator<SeeAllDocuments> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f102807a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(SeeAllDocuments.class, parcel, arrayList, iE, 1);
                }
                return new SeeAllDocuments(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SeeAllDocuments[i];
            }
        }

        public SeeAllDocuments(List documents) {
            Intrinsics.checkNotNullParameter(documents, "documents");
            this.f102807a = documents;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SeeAllDocuments) && Intrinsics.f(this.f102807a, ((SeeAllDocuments) obj2).f102807a);
        }

        public final int hashCode() {
            return this.f102807a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f102807a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanAction$Unsupported;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanAction;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Unsupported implements PricingPlanAction {

        @NotNull
        public static final Parcelable.Creator<Unsupported> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102808a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Unsupported(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Unsupported[i];
            }
        }

        public Unsupported(String type) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f102808a = type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Unsupported) && Intrinsics.f(this.f102808a, ((Unsupported) obj2).f102808a);
        }

        public final int hashCode() {
            return this.f102808a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102808a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanAction$Upgrade;", "Lcom/revolut/retail/feature/pricing_plans/ui/api/models/PricingPlanAction$Common;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Upgrade implements Common {

        @NotNull
        public static final Parcelable.Creator<Upgrade> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f102809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final hha.i f102810b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f102811c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Upgrade(parcel.readString(), hha.i.valueOf(parcel.readString()), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Upgrade[i];
            }
        }

        public Upgrade(String pricingPlanId, hha.i billingPeriod, String str, boolean z) {
            Intrinsics.checkNotNullParameter(pricingPlanId, "pricingPlanId");
            Intrinsics.checkNotNullParameter(billingPeriod, "billingPeriod");
            this.f102809a = pricingPlanId;
            this.f102810b = billingPeriod;
            this.f102811c = str;
            this.d = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Upgrade)) {
                return false;
            }
            Upgrade upgrade = (Upgrade) obj2;
            return Intrinsics.f(this.f102809a, upgrade.f102809a) && this.f102810b == upgrade.f102810b && Intrinsics.f(this.f102811c, upgrade.f102811c) && this.d == upgrade.d;
        }

        public final int hashCode() {
            int iHashCode = (this.f102810b.hashCode() + (this.f102809a.hashCode() * 31)) * 31;
            String str = this.f102811c;
            return Boolean.hashCode(this.d) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f102809a);
            dest.writeString(this.f102810b.name());
            dest.writeString(this.f102811c);
            dest.writeInt(this.d ? 1 : 0);
        }
    }
}
