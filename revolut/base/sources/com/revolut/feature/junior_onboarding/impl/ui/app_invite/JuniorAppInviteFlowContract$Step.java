package com.revolut.feature.junior_onboarding.impl.ui.app_invite;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/junior_onboarding/impl/ui/app_invite/JuniorAppInviteFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Prompt", "AppAccess", "Description", "Lcom/revolut/feature/junior_onboarding/impl/ui/app_invite/JuniorAppInviteFlowContract$Step$AppAccess;", "Lcom/revolut/feature/junior_onboarding/impl/ui/app_invite/JuniorAppInviteFlowContract$Step$Description;", "Lcom/revolut/feature/junior_onboarding/impl/ui/app_invite/JuniorAppInviteFlowContract$Step$Prompt;", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class JuniorAppInviteFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_onboarding/impl/ui/app_invite/JuniorAppInviteFlowContract$Step$AppAccess;", "Lcom/revolut/feature/junior_onboarding/impl/ui/app_invite/JuniorAppInviteFlowContract$Step;", "<init>", "()V", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AppAccess extends JuniorAppInviteFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AppAccess f76974a = new AppAccess();

        @NotNull
        public static final Parcelable.Creator<AppAccess> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return AppAccess.f76974a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AppAccess[i];
            }
        }

        private AppAccess() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0005\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/junior_onboarding/impl/ui/app_invite/JuniorAppInviteFlowContract$Step$Description;", "Lcom/revolut/feature/junior_onboarding/impl/ui/app_invite/JuniorAppInviteFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "CardProductState", "AdditionalProductState", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Description extends JuniorAppInviteFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Description> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CardProductState f76975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AdditionalProductState f76976b;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/junior_onboarding/impl/ui/app_invite/JuniorAppInviteFlowContract$Step$Description$AdditionalProductState;", "Landroid/os/Parcelable;", "SavingsEnabled", "VaultsEnabled", "Disabled", "Lcom/revolut/feature/junior_onboarding/impl/ui/app_invite/JuniorAppInviteFlowContract$Step$Description$AdditionalProductState$Disabled;", "Lcom/revolut/feature/junior_onboarding/impl/ui/app_invite/JuniorAppInviteFlowContract$Step$Description$AdditionalProductState$SavingsEnabled;", "Lcom/revolut/feature/junior_onboarding/impl/ui/app_invite/JuniorAppInviteFlowContract$Step$Description$AdditionalProductState$VaultsEnabled;", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface AdditionalProductState extends Parcelable {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_onboarding/impl/ui/app_invite/JuniorAppInviteFlowContract$Step$Description$AdditionalProductState$Disabled;", "Lcom/revolut/feature/junior_onboarding/impl/ui/app_invite/JuniorAppInviteFlowContract$Step$Description$AdditionalProductState;", "<init>", "()V", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Disabled implements AdditionalProductState {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final Disabled f76977a = new Disabled();

                @NotNull
                public static final Parcelable.Creator<Disabled> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return Disabled.f76977a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Disabled[i];
                    }
                }

                private Disabled() {
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

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_onboarding/impl/ui/app_invite/JuniorAppInviteFlowContract$Step$Description$AdditionalProductState$SavingsEnabled;", "Lcom/revolut/feature/junior_onboarding/impl/ui/app_invite/JuniorAppInviteFlowContract$Step$Description$AdditionalProductState;", "<init>", "()V", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class SavingsEnabled implements AdditionalProductState {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final SavingsEnabled f76978a = new SavingsEnabled();

                @NotNull
                public static final Parcelable.Creator<SavingsEnabled> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return SavingsEnabled.f76978a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new SavingsEnabled[i];
                    }
                }

                private SavingsEnabled() {
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

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_onboarding/impl/ui/app_invite/JuniorAppInviteFlowContract$Step$Description$AdditionalProductState$VaultsEnabled;", "Lcom/revolut/feature/junior_onboarding/impl/ui/app_invite/JuniorAppInviteFlowContract$Step$Description$AdditionalProductState;", "<init>", "()V", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class VaultsEnabled implements AdditionalProductState {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final VaultsEnabled f76979a = new VaultsEnabled();

                @NotNull
                public static final Parcelable.Creator<VaultsEnabled> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return VaultsEnabled.f76979a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new VaultsEnabled[i];
                    }
                }

                private VaultsEnabled() {
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
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/feature/junior_onboarding/impl/ui/app_invite/JuniorAppInviteFlowContract$Step$Description$CardProductState;", "Landroid/os/Parcelable;", "Enabled", "Disabled", "Lcom/revolut/feature/junior_onboarding/impl/ui/app_invite/JuniorAppInviteFlowContract$Step$Description$CardProductState$Disabled;", "Lcom/revolut/feature/junior_onboarding/impl/ui/app_invite/JuniorAppInviteFlowContract$Step$Description$CardProductState$Enabled;", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface CardProductState extends Parcelable {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_onboarding/impl/ui/app_invite/JuniorAppInviteFlowContract$Step$Description$CardProductState$Disabled;", "Lcom/revolut/feature/junior_onboarding/impl/ui/app_invite/JuniorAppInviteFlowContract$Step$Description$CardProductState;", "<init>", "()V", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Disabled implements CardProductState {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final Disabled f76980a = new Disabled();

                @NotNull
                public static final Parcelable.Creator<Disabled> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return Disabled.f76980a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Disabled[i];
                    }
                }

                private Disabled() {
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

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_onboarding/impl/ui/app_invite/JuniorAppInviteFlowContract$Step$Description$CardProductState$Enabled;", "Lcom/revolut/feature/junior_onboarding/impl/ui/app_invite/JuniorAppInviteFlowContract$Step$Description$CardProductState;", "<init>", "()V", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final class Enabled implements CardProductState {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final Enabled f76981a = new Enabled();

                @NotNull
                public static final Parcelable.Creator<Enabled> CREATOR = new a();

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    public final Object createFromParcel(Parcel parcel) {
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        parcel.readInt();
                        return Enabled.f76981a;
                    }

                    @Override // android.os.Parcelable.Creator
                    public final Object[] newArray(int i) {
                        return new Enabled[i];
                    }
                }

                private Enabled() {
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
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Description((CardProductState) parcel.readParcelable(Description.class.getClassLoader()), (AdditionalProductState) parcel.readParcelable(Description.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Description[i];
            }
        }

        public Description(CardProductState cardProductState, AdditionalProductState additionalProductState) {
            Intrinsics.checkNotNullParameter(cardProductState, "cardProductState");
            Intrinsics.checkNotNullParameter(additionalProductState, "additionalProductState");
            this.f76975a = cardProductState;
            this.f76976b = additionalProductState;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Description)) {
                return false;
            }
            Description description = (Description) obj2;
            return Intrinsics.f(this.f76975a, description.f76975a) && Intrinsics.f(this.f76976b, description.f76976b);
        }

        public final int hashCode() {
            return this.f76976b.hashCode() + (this.f76975a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f76975a, i);
            dest.writeParcelable(this.f76976b, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/junior_onboarding/impl/ui/app_invite/JuniorAppInviteFlowContract$Step$Prompt;", "Lcom/revolut/feature/junior_onboarding/impl/ui/app_invite/JuniorAppInviteFlowContract$Step;", "<init>", "()V", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Prompt extends JuniorAppInviteFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Prompt f76982a = new Prompt();

        @NotNull
        public static final Parcelable.Creator<Prompt> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Prompt.f76982a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Prompt[i];
            }
        }

        private Prompt() {
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

    private JuniorAppInviteFlowContract$Step() {
    }
}
