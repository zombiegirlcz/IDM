package com.revolut.feature.pricingplans.models;

import android.os.Parcel;
import android.os.Parcelable;
import hha.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/pricingplans/models/SubscriptionPreviewId;", "Landroid/os/Parcelable;", "<init>", "()V", "Global", "Plan", "GiftedPlan", "Lcom/revolut/feature/pricingplans/models/SubscriptionPreviewId$GiftedPlan;", "Lcom/revolut/feature/pricingplans/models/SubscriptionPreviewId$Global;", "Lcom/revolut/feature/pricingplans/models/SubscriptionPreviewId$Plan;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SubscriptionPreviewId implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/SubscriptionPreviewId$GiftedPlan;", "Lcom/revolut/feature/pricingplans/models/SubscriptionPreviewId;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GiftedPlan extends SubscriptionPreviewId {

        @NotNull
        public static final Parcelable.Creator<GiftedPlan> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81153a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f81154b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GiftedPlan(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GiftedPlan[i];
            }
        }

        public GiftedPlan(String planId, String giftId) {
            Intrinsics.checkNotNullParameter(planId, "planId");
            Intrinsics.checkNotNullParameter(giftId, "giftId");
            this.f81153a = planId;
            this.f81154b = giftId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof GiftedPlan)) {
                return false;
            }
            GiftedPlan giftedPlan = (GiftedPlan) obj2;
            return Intrinsics.f(this.f81153a, giftedPlan.f81153a) && Intrinsics.f(this.f81154b, giftedPlan.f81154b);
        }

        public final int hashCode() {
            return this.f81154b.hashCode() + (this.f81153a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81153a);
            dest.writeString(this.f81154b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pricingplans/models/SubscriptionPreviewId$Global;", "Lcom/revolut/feature/pricingplans/models/SubscriptionPreviewId;", "<init>", "()V", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Global extends SubscriptionPreviewId {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Global f81155a = new Global();

        @NotNull
        public static final Parcelable.Creator<Global> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Global.f81155a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Global[i];
            }
        }

        private Global() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/SubscriptionPreviewId$Plan;", "Lcom/revolut/feature/pricingplans/models/SubscriptionPreviewId;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Plan extends SubscriptionPreviewId {

        @NotNull
        public static final Parcelable.Creator<Plan> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final i f81157b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Plan(parcel.readString(), parcel.readInt() == 0 ? null : i.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Plan[i];
            }
        }

        public Plan(String planId, i iVar) {
            Intrinsics.checkNotNullParameter(planId, "planId");
            this.f81156a = planId;
            this.f81157b = iVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Plan)) {
                return false;
            }
            Plan plan = (Plan) obj2;
            return Intrinsics.f(this.f81156a, plan.f81156a) && this.f81157b == plan.f81157b;
        }

        public final int hashCode() {
            int iHashCode = this.f81156a.hashCode() * 31;
            i iVar = this.f81157b;
            return iHashCode + (iVar == null ? 0 : iVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f81156a);
            i iVar = this.f81157b;
            if (iVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(iVar.name());
            }
        }
    }

    private SubscriptionPreviewId() {
    }
}
