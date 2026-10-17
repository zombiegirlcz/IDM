package com.revolut.feature.pricingplans.models.family;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lha.g;
import lha.h;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/feature/pricingplans/models/family/FamilyPlanState;", "Landroid/os/Parcelable;", "<init>", "()V", "FamilyPlan", "PendingInvite", "Empty", "Lcom/revolut/feature/pricingplans/models/family/FamilyPlanState$Empty;", "Lcom/revolut/feature/pricingplans/models/family/FamilyPlanState$FamilyPlan;", "Lcom/revolut/feature/pricingplans/models/family/FamilyPlanState$PendingInvite;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class FamilyPlanState implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/pricingplans/models/family/FamilyPlanState$Empty;", "Lcom/revolut/feature/pricingplans/models/family/FamilyPlanState;", "<init>", "()V", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Empty extends FamilyPlanState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Empty f81188a = new Empty();

        @NotNull
        public static final Parcelable.Creator<Empty> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Empty.f81188a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Empty[i];
            }
        }

        private Empty() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/family/FamilyPlanState$FamilyPlan;", "Lcom/revolut/feature/pricingplans/models/family/FamilyPlanState;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FamilyPlan extends FamilyPlanState {

        @NotNull
        public static final Parcelable.Creator<FamilyPlan> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f81189a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new FamilyPlan((g) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new FamilyPlan[i];
            }
        }

        public FamilyPlan(g info) {
            Intrinsics.checkNotNullParameter(info, "info");
            this.f81189a = info;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof FamilyPlan) && Intrinsics.f(this.f81189a, ((FamilyPlan) obj2).f81189a);
        }

        public final int hashCode() {
            return this.f81189a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f81189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/pricingplans/models/family/FamilyPlanState$PendingInvite;", "Lcom/revolut/feature/pricingplans/models/family/FamilyPlanState;", "", "toString", "()Ljava/lang/String;", "feature_pricing_plans_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PendingInvite extends FamilyPlanState {

        @NotNull
        public static final Parcelable.Creator<PendingInvite> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f81190a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PendingInvite((h) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PendingInvite[i];
            }
        }

        public PendingInvite(h invitation) {
            Intrinsics.checkNotNullParameter(invitation, "invitation");
            this.f81190a = invitation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PendingInvite) && Intrinsics.f(this.f81190a, ((PendingInvite) obj2).f81190a);
        }

        public final int hashCode() {
            return this.f81190a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f81190a);
        }
    }

    private FamilyPlanState() {
    }
}
