package com.revolut.feature.credit.application.plugins.impl.ui.kontomatik;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.credit.application.plugins.api.models.config.KontomatikPopupScreenConfig;
import com.revolut.kompot.navigable.flow.FlowStep;
import ju3.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/kontomatik/KontomatikIncomeCheckFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Prompt", "IncomeCheckSelection", "KontomatikSignIn", "Popup", "ModalStep", "Lcom/revolut/feature/credit/application/plugins/impl/ui/kontomatik/KontomatikIncomeCheckFlowContract$Step$IncomeCheckSelection;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/kontomatik/KontomatikIncomeCheckFlowContract$Step$KontomatikSignIn;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/kontomatik/KontomatikIncomeCheckFlowContract$Step$ModalStep;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/kontomatik/KontomatikIncomeCheckFlowContract$Step$Popup;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/kontomatik/KontomatikIncomeCheckFlowContract$Step$Prompt;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface KontomatikIncomeCheckFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/kontomatik/KontomatikIncomeCheckFlowContract$Step$IncomeCheckSelection;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/kontomatik/KontomatikIncomeCheckFlowContract$Step;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IncomeCheckSelection implements KontomatikIncomeCheckFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final IncomeCheckSelection f67802a = new IncomeCheckSelection();

        @NotNull
        public static final Parcelable.Creator<IncomeCheckSelection> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return IncomeCheckSelection.f67802a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new IncomeCheckSelection[i];
            }
        }

        private IncomeCheckSelection() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/kontomatik/KontomatikIncomeCheckFlowContract$Step$KontomatikSignIn;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/kontomatik/KontomatikIncomeCheckFlowContract$Step;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class KontomatikSignIn implements KontomatikIncomeCheckFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final KontomatikSignIn f67803a = new KontomatikSignIn();

        @NotNull
        public static final Parcelable.Creator<KontomatikSignIn> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return KontomatikSignIn.f67803a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new KontomatikSignIn[i];
            }
        }

        private KontomatikSignIn() {
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

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/kontomatik/KontomatikIncomeCheckFlowContract$Step$ModalStep;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/kontomatik/KontomatikIncomeCheckFlowContract$Step;", "<init>", "()V", "ExternalBankSignIn", "Lcom/revolut/feature/credit/application/plugins/impl/ui/kontomatik/KontomatikIncomeCheckFlowContract$Step$ModalStep$ExternalBankSignIn;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class ModalStep implements KontomatikIncomeCheckFlowContract$Step {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/kontomatik/KontomatikIncomeCheckFlowContract$Step$ModalStep$ExternalBankSignIn;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/kontomatik/KontomatikIncomeCheckFlowContract$Step$ModalStep;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class ExternalBankSignIn extends ModalStep {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final ExternalBankSignIn f67804a = new ExternalBankSignIn();

            @NotNull
            public static final Parcelable.Creator<ExternalBankSignIn> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ExternalBankSignIn.f67804a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ExternalBankSignIn[i];
                }
            }

            private ExternalBankSignIn() {
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

        private ModalStep() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/kontomatik/KontomatikIncomeCheckFlowContract$Step$Popup;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/kontomatik/KontomatikIncomeCheckFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Popup implements KontomatikIncomeCheckFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Popup> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final KontomatikPopupScreenConfig f67805a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g f67806b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Popup((KontomatikPopupScreenConfig) parcel.readParcelable(Popup.class.getClassLoader()), g.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Popup[i];
            }
        }

        public Popup(KontomatikPopupScreenConfig config, g popupType) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(popupType, "popupType");
            this.f67805a = config;
            this.f67806b = popupType;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Popup)) {
                return false;
            }
            Popup popup = (Popup) obj2;
            return Intrinsics.f(this.f67805a, popup.f67805a) && this.f67806b == popup.f67806b;
        }

        public final int hashCode() {
            return this.f67806b.hashCode() + (this.f67805a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f67805a, i);
            dest.writeString(this.f67806b.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/kontomatik/KontomatikIncomeCheckFlowContract$Step$Prompt;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/kontomatik/KontomatikIncomeCheckFlowContract$Step;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Prompt implements KontomatikIncomeCheckFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Prompt f67807a = new Prompt();

        @NotNull
        public static final Parcelable.Creator<Prompt> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Prompt.f67807a;
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
}
