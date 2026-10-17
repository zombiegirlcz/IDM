package com.revolut.feature.semi_independent_onboarding.impl.ui.details;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/semi_independent_onboarding/impl/ui/details/SemiIndependentOnboardingDetailsScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "UpdateParent", "GuardianNeedsCreateAccountPrompt", "Lcom/revolut/feature/semi_independent_onboarding/impl/ui/details/SemiIndependentOnboardingDetailsScreenContract$ModalStep$GuardianNeedsCreateAccountPrompt;", "Lcom/revolut/feature/semi_independent_onboarding/impl/ui/details/SemiIndependentOnboardingDetailsScreenContract$ModalStep$UpdateParent;", "feature_semi_independent_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SemiIndependentOnboardingDetailsScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/semi_independent_onboarding/impl/ui/details/SemiIndependentOnboardingDetailsScreenContract$ModalStep$GuardianNeedsCreateAccountPrompt;", "Lcom/revolut/feature/semi_independent_onboarding/impl/ui/details/SemiIndependentOnboardingDetailsScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_semi_independent_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class GuardianNeedsCreateAccountPrompt extends SemiIndependentOnboardingDetailsScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<GuardianNeedsCreateAccountPrompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f85987a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new GuardianNeedsCreateAccountPrompt(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GuardianNeedsCreateAccountPrompt[i];
            }
        }

        public GuardianNeedsCreateAccountPrompt(String invitationMessage) {
            Intrinsics.checkNotNullParameter(invitationMessage, "invitationMessage");
            this.f85987a = invitationMessage;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof GuardianNeedsCreateAccountPrompt) && Intrinsics.f(this.f85987a, ((GuardianNeedsCreateAccountPrompt) obj2).f85987a);
        }

        public final int hashCode() {
            return this.f85987a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f85987a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/semi_independent_onboarding/impl/ui/details/SemiIndependentOnboardingDetailsScreenContract$ModalStep$UpdateParent;", "Lcom/revolut/feature/semi_independent_onboarding/impl/ui/details/SemiIndependentOnboardingDetailsScreenContract$ModalStep;", "<init>", "()V", "feature_semi_independent_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class UpdateParent extends SemiIndependentOnboardingDetailsScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final UpdateParent f85988a = new UpdateParent();

        @NotNull
        public static final Parcelable.Creator<UpdateParent> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return UpdateParent.f85988a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UpdateParent[i];
            }
        }

        private UpdateParent() {
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

    private SemiIndependentOnboardingDetailsScreenContract$ModalStep() {
    }
}
