package com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.MoreForFamilyScreenContract$AvailableOptions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lha.h;
import lha.k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/management/FamilyPlanManagementScreenContract$Parcel", "Landroid/os/Parcelable;", "<init>", "()V", "InvitationCancel", "MemberRemoval", "AddMember", "CancelMemberSlot", "MoreForFamily", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/management/FamilyPlanManagementScreenContract$Parcel$AddMember;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/management/FamilyPlanManagementScreenContract$Parcel$CancelMemberSlot;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/management/FamilyPlanManagementScreenContract$Parcel$InvitationCancel;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/management/FamilyPlanManagementScreenContract$Parcel$MemberRemoval;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/management/FamilyPlanManagementScreenContract$Parcel$MoreForFamily;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class FamilyPlanManagementScreenContract$Parcel implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/management/FamilyPlanManagementScreenContract$Parcel$AddMember;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/management/FamilyPlanManagementScreenContract$Parcel;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AddMember extends FamilyPlanManagementScreenContract$Parcel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AddMember f103405a = new AddMember();

        @NotNull
        public static final Parcelable.Creator<AddMember> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AddMember.f103405a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AddMember[i];
            }
        }

        private AddMember() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/management/FamilyPlanManagementScreenContract$Parcel$CancelMemberSlot;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/management/FamilyPlanManagementScreenContract$Parcel;", "<init>", "()V", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CancelMemberSlot extends FamilyPlanManagementScreenContract$Parcel {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CancelMemberSlot f103406a = new CancelMemberSlot();

        @NotNull
        public static final Parcelable.Creator<CancelMemberSlot> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CancelMemberSlot.f103406a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancelMemberSlot[i];
            }
        }

        private CancelMemberSlot() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/management/FamilyPlanManagementScreenContract$Parcel$InvitationCancel;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/management/FamilyPlanManagementScreenContract$Parcel;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InvitationCancel extends FamilyPlanManagementScreenContract$Parcel {

        @NotNull
        public static final Parcelable.Creator<InvitationCancel> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f103407a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InvitationCancel((h) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InvitationCancel[i];
            }
        }

        public InvitationCancel(h invitation) {
            Intrinsics.checkNotNullParameter(invitation, "invitation");
            this.f103407a = invitation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof InvitationCancel) && Intrinsics.f(this.f103407a, ((InvitationCancel) obj2).f103407a);
        }

        public final int hashCode() {
            return this.f103407a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f103407a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/management/FamilyPlanManagementScreenContract$Parcel$MemberRemoval;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/management/FamilyPlanManagementScreenContract$Parcel;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MemberRemoval extends FamilyPlanManagementScreenContract$Parcel {

        @NotNull
        public static final Parcelable.Creator<MemberRemoval> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f103408a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MemberRemoval((k) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MemberRemoval[i];
            }
        }

        public MemberRemoval(k member) {
            Intrinsics.checkNotNullParameter(member, "member");
            this.f103408a = member;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MemberRemoval) && Intrinsics.f(this.f103408a, ((MemberRemoval) obj2).f103408a);
        }

        public final int hashCode() {
            return this.f103408a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f103408a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/management/FamilyPlanManagementScreenContract$Parcel$MoreForFamily;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/management/FamilyPlanManagementScreenContract$Parcel;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MoreForFamily extends FamilyPlanManagementScreenContract$Parcel {

        @NotNull
        public static final Parcelable.Creator<MoreForFamily> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MoreForFamilyScreenContract$AvailableOptions f103409a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MoreForFamily(MoreForFamilyScreenContract$AvailableOptions.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MoreForFamily[i];
            }
        }

        public MoreForFamily(MoreForFamilyScreenContract$AvailableOptions availableOptions) {
            Intrinsics.checkNotNullParameter(availableOptions, "availableOptions");
            this.f103409a = availableOptions;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof MoreForFamily) && Intrinsics.f(this.f103409a, ((MoreForFamily) obj2).f103409a);
        }

        public final int hashCode() {
            return this.f103409a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f103409a.writeToParcel(dest, i);
        }
    }

    private FamilyPlanManagementScreenContract$Parcel() {
    }
}
