package com.revolut.feature.credit.application.plugins.api.models.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import ju3.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0005\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/SpousalConsentInitiatorPopupScreenConfig;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/ScreenConfig;", "", "toString", "()Ljava/lang/String;", "Button", "Action", "ju3/h", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SpousalConsentInitiatorPopupScreenConfig extends ScreenConfig {

    @NotNull
    public static final Parcelable.Creator<SpousalConsentInitiatorPopupScreenConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f66402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f66403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Button f66404c;
    public final Button d;
    public final Action e;
    public final h f;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/SpousalConsentInitiatorPopupScreenConfig$Action;", "Landroid/os/Parcelable;", "ConvertApplication", "CancelApplication", "FailApplication", "CloseScreen", "ShowPopup", "Lcom/revolut/feature/credit/application/plugins/api/models/config/SpousalConsentInitiatorPopupScreenConfig$Action$CancelApplication;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/SpousalConsentInitiatorPopupScreenConfig$Action$CloseScreen;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/SpousalConsentInitiatorPopupScreenConfig$Action$ConvertApplication;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/SpousalConsentInitiatorPopupScreenConfig$Action$FailApplication;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/SpousalConsentInitiatorPopupScreenConfig$Action$ShowPopup;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Action extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/SpousalConsentInitiatorPopupScreenConfig$Action$CancelApplication;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/SpousalConsentInitiatorPopupScreenConfig$Action;", "<init>", "()V", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class CancelApplication implements Action {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final CancelApplication f66405a = new CancelApplication();

            @NotNull
            public static final Parcelable.Creator<CancelApplication> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CancelApplication.f66405a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CancelApplication[i];
                }
            }

            private CancelApplication() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/SpousalConsentInitiatorPopupScreenConfig$Action$CloseScreen;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/SpousalConsentInitiatorPopupScreenConfig$Action;", "<init>", "()V", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class CloseScreen implements Action {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final CloseScreen f66406a = new CloseScreen();

            @NotNull
            public static final Parcelable.Creator<CloseScreen> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CloseScreen.f66406a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CloseScreen[i];
                }
            }

            private CloseScreen() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/SpousalConsentInitiatorPopupScreenConfig$Action$ConvertApplication;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/SpousalConsentInitiatorPopupScreenConfig$Action;", "<init>", "()V", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class ConvertApplication implements Action {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final ConvertApplication f66407a = new ConvertApplication();

            @NotNull
            public static final Parcelable.Creator<ConvertApplication> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ConvertApplication.f66407a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ConvertApplication[i];
                }
            }

            private ConvertApplication() {
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

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/SpousalConsentInitiatorPopupScreenConfig$Action$FailApplication;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/SpousalConsentInitiatorPopupScreenConfig$Action;", "<init>", "()V", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class FailApplication implements Action {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final FailApplication f66408a = new FailApplication();

            @NotNull
            public static final Parcelable.Creator<FailApplication> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return FailApplication.f66408a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new FailApplication[i];
                }
            }

            private FailApplication() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/SpousalConsentInitiatorPopupScreenConfig$Action$ShowPopup;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/SpousalConsentInitiatorPopupScreenConfig$Action;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ShowPopup implements Action {

            @NotNull
            public static final Parcelable.Creator<ShowPopup> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SpousalConsentInitiatorPopupScreenConfig f66409a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new ShowPopup(SpousalConsentInitiatorPopupScreenConfig.CREATOR.createFromParcel(parcel));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ShowPopup[i];
                }
            }

            public ShowPopup(SpousalConsentInitiatorPopupScreenConfig configuration) {
                Intrinsics.checkNotNullParameter(configuration, "configuration");
                this.f66409a = configuration;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof ShowPopup) && Intrinsics.f(this.f66409a, ((ShowPopup) obj2).f66409a);
            }

            public final int hashCode() {
                return this.f66409a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                this.f66409a.writeToParcel(dest, i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/SpousalConsentInitiatorPopupScreenConfig$Button;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Button implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Button> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f66410a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Action f66411b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Button((Clause) parcel.readParcelable(Button.class.getClassLoader()), (Action) parcel.readParcelable(Button.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Button[i];
            }
        }

        public Button(Clause label, Action action) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(action, "action");
            this.f66410a = label;
            this.f66411b = action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Button)) {
                return false;
            }
            Button button = (Button) obj2;
            return Intrinsics.f(this.f66410a, button.f66410a) && Intrinsics.f(this.f66411b, button.f66411b);
        }

        public final int hashCode() {
            return this.f66411b.hashCode() + (this.f66410a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66410a, i);
            dest.writeParcelable(this.f66411b, i);
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Clause clause = (Clause) parcel.readParcelable(SpousalConsentInitiatorPopupScreenConfig.class.getClassLoader());
            Clause clause2 = (Clause) parcel.readParcelable(SpousalConsentInitiatorPopupScreenConfig.class.getClassLoader());
            Parcelable.Creator<Button> creator = Button.CREATOR;
            return new SpousalConsentInitiatorPopupScreenConfig(clause, clause2, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), (Action) parcel.readParcelable(SpousalConsentInitiatorPopupScreenConfig.class.getClassLoader()), h.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SpousalConsentInitiatorPopupScreenConfig[i];
        }
    }

    public SpousalConsentInitiatorPopupScreenConfig(Clause title, Clause description, Button primaryButton, Button button, Action dismissAction, h status) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
        Intrinsics.checkNotNullParameter(dismissAction, "dismissAction");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f66402a = title;
        this.f66403b = description;
        this.f66404c = primaryButton;
        this.d = button;
        this.e = dismissAction;
        this.f = status;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SpousalConsentInitiatorPopupScreenConfig)) {
            return false;
        }
        SpousalConsentInitiatorPopupScreenConfig spousalConsentInitiatorPopupScreenConfig = (SpousalConsentInitiatorPopupScreenConfig) obj2;
        return Intrinsics.f(this.f66402a, spousalConsentInitiatorPopupScreenConfig.f66402a) && Intrinsics.f(this.f66403b, spousalConsentInitiatorPopupScreenConfig.f66403b) && Intrinsics.f(this.f66404c, spousalConsentInitiatorPopupScreenConfig.f66404c) && Intrinsics.f(this.d, spousalConsentInitiatorPopupScreenConfig.d) && Intrinsics.f(this.e, spousalConsentInitiatorPopupScreenConfig.e) && this.f == spousalConsentInitiatorPopupScreenConfig.f;
    }

    public final int hashCode() {
        int iHashCode = (this.f66404c.hashCode() + p.a.a(this.f66402a.hashCode() * 31, 31, this.f66403b)) * 31;
        Button button = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((iHashCode + (button == null ? 0 : button.hashCode())) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f66402a, i);
        dest.writeParcelable(this.f66403b, i);
        this.f66404c.writeToParcel(dest, i);
        Button button = this.d;
        if (button == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            button.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.e, i);
        dest.writeString(this.f.name());
    }
}
