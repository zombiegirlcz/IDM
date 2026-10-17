package com.revolut.feature.user_declarations.shared.flows.pep.screens.persons_list;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.user_declarations.shared.flows.pep.models.PersonalDetails;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.shared.feature.user_declarations.api.navigation.PepFlowControllerDescriptor$UseCase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"com/revolut/feature/user_declarations/shared/flows/pep/screens/persons_list/PersonsListScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Profile", "CloseConnectionsDescription", "Lcom/revolut/feature/user_declarations/shared/flows/pep/screens/persons_list/PersonsListScreenContract$ModalStep$CloseConnectionsDescription;", "Lcom/revolut/feature/user_declarations/shared/flows/pep/screens/persons_list/PersonsListScreenContract$ModalStep$Profile;", "feature_user_declarations_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface PersonsListScreenContract$ModalStep extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/user_declarations/shared/flows/pep/screens/persons_list/PersonsListScreenContract$ModalStep$CloseConnectionsDescription;", "Lcom/revolut/feature/user_declarations/shared/flows/pep/screens/persons_list/PersonsListScreenContract$ModalStep;", "<init>", "()V", "feature_user_declarations_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class CloseConnectionsDescription implements PersonsListScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final CloseConnectionsDescription f94666a = new CloseConnectionsDescription();

        @NotNull
        public static final Parcelable.Creator<CloseConnectionsDescription> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return CloseConnectionsDescription.f94666a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CloseConnectionsDescription[i];
            }
        }

        private CloseConnectionsDescription() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/user_declarations/shared/flows/pep/screens/persons_list/PersonsListScreenContract$ModalStep$Profile;", "Lcom/revolut/feature/user_declarations/shared/flows/pep/screens/persons_list/PersonsListScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_user_declarations_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Profile implements PersonsListScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Profile> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PersonalDetails f94667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PepFlowControllerDescriptor$UseCase f94668b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Profile(parcel.readInt() == 0 ? null : PersonalDetails.CREATOR.createFromParcel(parcel), (PepFlowControllerDescriptor$UseCase) parcel.readParcelable(Profile.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Profile[i];
            }
        }

        public Profile(PersonalDetails personalDetails, PepFlowControllerDescriptor$UseCase useCase) {
            Intrinsics.checkNotNullParameter(useCase, "useCase");
            this.f94667a = personalDetails;
            this.f94668b = useCase;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Profile)) {
                return false;
            }
            Profile profile = (Profile) obj2;
            return Intrinsics.f(this.f94667a, profile.f94667a) && Intrinsics.f(this.f94668b, profile.f94668b);
        }

        public final int hashCode() {
            PersonalDetails personalDetails = this.f94667a;
            return this.f94668b.hashCode() + ((personalDetails == null ? 0 : personalDetails.hashCode()) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            PersonalDetails personalDetails = this.f94667a;
            if (personalDetails == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                personalDetails.writeToParcel(dest, i);
            }
            dest.writeParcelable(this.f94668b, i);
        }
    }
}
