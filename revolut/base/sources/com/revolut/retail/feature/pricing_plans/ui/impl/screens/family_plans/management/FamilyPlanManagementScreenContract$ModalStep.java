package com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import lha.h;
import lha.k;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000b"}, d2 = {"com/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/management/FamilyPlanManagementScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Landroid/os/Parcelable;", "<init>", "()V", "RemoveMember", "MemberSlotCancellationWarning", "CancelInvitation", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/management/FamilyPlanManagementScreenContract$ModalStep$CancelInvitation;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/management/FamilyPlanManagementScreenContract$ModalStep$MemberSlotCancellationWarning;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/management/FamilyPlanManagementScreenContract$ModalStep$RemoveMember;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class FamilyPlanManagementScreenContract$ModalStep implements FlowStep, Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/management/FamilyPlanManagementScreenContract$ModalStep$CancelInvitation;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/management/FamilyPlanManagementScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CancelInvitation extends FamilyPlanManagementScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<CancelInvitation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f103400a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CancelInvitation((h) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancelInvitation[i];
            }
        }

        public CancelInvitation(h invitation) {
            Intrinsics.checkNotNullParameter(invitation, "invitation");
            this.f103400a = invitation;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof CancelInvitation) && Intrinsics.f(this.f103400a, ((CancelInvitation) obj2).f103400a);
        }

        public final int hashCode() {
            return this.f103400a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f103400a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/management/FamilyPlanManagementScreenContract$ModalStep$MemberSlotCancellationWarning;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/management/FamilyPlanManagementScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class MemberSlotCancellationWarning extends FamilyPlanManagementScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<MemberSlotCancellationWarning> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f103401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f103402b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new MemberSlotCancellationWarning((k) parcel.readSerializable(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MemberSlotCancellationWarning[i];
            }
        }

        public MemberSlotCancellationWarning(k member, long j2) {
            Intrinsics.checkNotNullParameter(member, "member");
            this.f103401a = member;
            this.f103402b = j2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof MemberSlotCancellationWarning)) {
                return false;
            }
            MemberSlotCancellationWarning memberSlotCancellationWarning = (MemberSlotCancellationWarning) obj2;
            return Intrinsics.f(this.f103401a, memberSlotCancellationWarning.f103401a) && this.f103402b == memberSlotCancellationWarning.f103402b;
        }

        public final int hashCode() {
            return Long.hashCode(this.f103402b) + (this.f103401a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f103401a);
            dest.writeLong(this.f103402b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/management/FamilyPlanManagementScreenContract$ModalStep$RemoveMember;", "Lcom/revolut/retail/feature/pricing_plans/ui/impl/screens/family_plans/management/FamilyPlanManagementScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_retail_pricing_plans_ui_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RemoveMember extends FamilyPlanManagementScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RemoveMember> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f103403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f103404b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RemoveMember((k) parcel.readSerializable(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RemoveMember[i];
            }
        }

        public RemoveMember(k member, boolean z) {
            Intrinsics.checkNotNullParameter(member, "member");
            this.f103403a = member;
            this.f103404b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RemoveMember)) {
                return false;
            }
            RemoveMember removeMember = (RemoveMember) obj2;
            return Intrinsics.f(this.f103403a, removeMember.f103403a) && this.f103404b == removeMember.f103404b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f103404b) + (this.f103403a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f103403a);
            dest.writeInt(this.f103404b ? 1 : 0);
        }
    }

    private FamilyPlanManagementScreenContract$ModalStep() {
    }
}
