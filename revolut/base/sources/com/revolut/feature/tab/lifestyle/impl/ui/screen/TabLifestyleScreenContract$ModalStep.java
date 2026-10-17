package com.revolut.feature.tab.lifestyle.impl.ui.screen;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.rev_points.models.RevPointsOptInSource;
import com.revolut.feature.rev_points.models.RevPointsPersonalisationTargetingOnboardingPrompt;
import com.revolut.feature.slot_manager.api.model.checklist.SlotChecklistPayload;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/feature/tab/lifestyle/impl/ui/screen/TabLifestyleScreenContract$ModalStep", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "ThemeCustomisation", "Checklist", "RevPointsBottomSheet", "RevPointsFullScreenOptInModal", "PersonalisationTargetingOnboarding", "Lcom/revolut/feature/tab/lifestyle/impl/ui/screen/TabLifestyleScreenContract$ModalStep$Checklist;", "Lcom/revolut/feature/tab/lifestyle/impl/ui/screen/TabLifestyleScreenContract$ModalStep$PersonalisationTargetingOnboarding;", "Lcom/revolut/feature/tab/lifestyle/impl/ui/screen/TabLifestyleScreenContract$ModalStep$RevPointsBottomSheet;", "Lcom/revolut/feature/tab/lifestyle/impl/ui/screen/TabLifestyleScreenContract$ModalStep$RevPointsFullScreenOptInModal;", "Lcom/revolut/feature/tab/lifestyle/impl/ui/screen/TabLifestyleScreenContract$ModalStep$ThemeCustomisation;", "feature_tab_lifestyle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TabLifestyleScreenContract$ModalStep implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/lifestyle/impl/ui/screen/TabLifestyleScreenContract$ModalStep$Checklist;", "Lcom/revolut/feature/tab/lifestyle/impl/ui/screen/TabLifestyleScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_tab_lifestyle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Checklist extends TabLifestyleScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<Checklist> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SlotChecklistPayload f89918a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Checklist((SlotChecklistPayload) parcel.readParcelable(Checklist.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Checklist[i];
            }
        }

        public Checklist(SlotChecklistPayload payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            this.f89918a = payload;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Checklist) && Intrinsics.f(this.f89918a, ((Checklist) obj2).f89918a);
        }

        public final int hashCode() {
            return this.f89918a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f89918a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/lifestyle/impl/ui/screen/TabLifestyleScreenContract$ModalStep$PersonalisationTargetingOnboarding;", "Lcom/revolut/feature/tab/lifestyle/impl/ui/screen/TabLifestyleScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_tab_lifestyle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PersonalisationTargetingOnboarding extends TabLifestyleScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<PersonalisationTargetingOnboarding> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RevPointsPersonalisationTargetingOnboardingPrompt f89919a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PersonalisationTargetingOnboarding((RevPointsPersonalisationTargetingOnboardingPrompt) parcel.readParcelable(PersonalisationTargetingOnboarding.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PersonalisationTargetingOnboarding[i];
            }
        }

        public PersonalisationTargetingOnboarding(RevPointsPersonalisationTargetingOnboardingPrompt prompt) {
            Intrinsics.checkNotNullParameter(prompt, "prompt");
            this.f89919a = prompt;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PersonalisationTargetingOnboarding) && Intrinsics.f(this.f89919a, ((PersonalisationTargetingOnboarding) obj2).f89919a);
        }

        public final int hashCode() {
            return this.f89919a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f89919a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tab/lifestyle/impl/ui/screen/TabLifestyleScreenContract$ModalStep$RevPointsBottomSheet;", "Lcom/revolut/feature/tab/lifestyle/impl/ui/screen/TabLifestyleScreenContract$ModalStep;", "<init>", "()V", "feature_tab_lifestyle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevPointsBottomSheet extends TabLifestyleScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RevPointsBottomSheet f89920a = new RevPointsBottomSheet();

        @NotNull
        public static final Parcelable.Creator<RevPointsBottomSheet> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevPointsBottomSheet.f89920a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPointsBottomSheet[i];
            }
        }

        private RevPointsBottomSheet() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tab/lifestyle/impl/ui/screen/TabLifestyleScreenContract$ModalStep$RevPointsFullScreenOptInModal;", "Lcom/revolut/feature/tab/lifestyle/impl/ui/screen/TabLifestyleScreenContract$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_tab_lifestyle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RevPointsFullScreenOptInModal extends TabLifestyleScreenContract$ModalStep {

        @NotNull
        public static final Parcelable.Creator<RevPointsFullScreenOptInModal> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RevPointsOptInSource f89921a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RevPointsFullScreenOptInModal((RevPointsOptInSource) parcel.readParcelable(RevPointsFullScreenOptInModal.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPointsFullScreenOptInModal[i];
            }
        }

        public RevPointsFullScreenOptInModal(RevPointsOptInSource optInSource) {
            Intrinsics.checkNotNullParameter(optInSource, "optInSource");
            this.f89921a = optInSource;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof RevPointsFullScreenOptInModal) && Intrinsics.f(this.f89921a, ((RevPointsFullScreenOptInModal) obj2).f89921a);
        }

        public final int hashCode() {
            return this.f89921a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f89921a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tab/lifestyle/impl/ui/screen/TabLifestyleScreenContract$ModalStep$ThemeCustomisation;", "Lcom/revolut/feature/tab/lifestyle/impl/ui/screen/TabLifestyleScreenContract$ModalStep;", "<init>", "()V", "feature_tab_lifestyle_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ThemeCustomisation extends TabLifestyleScreenContract$ModalStep {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ThemeCustomisation f89922a = new ThemeCustomisation();

        @NotNull
        public static final Parcelable.Creator<ThemeCustomisation> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ThemeCustomisation.f89922a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ThemeCustomisation[i];
            }
        }

        private ThemeCustomisation() {
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

    private TabLifestyleScreenContract$ModalStep() {
    }
}
