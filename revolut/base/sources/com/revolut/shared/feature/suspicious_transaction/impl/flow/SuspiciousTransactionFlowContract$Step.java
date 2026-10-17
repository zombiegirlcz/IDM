package com.revolut.shared.feature.suspicious_transaction.impl.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialog;
import com.revolut.shared.feature.suspicious_transaction.api.models.SuspiciousTransactionDialogAnswer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"com/revolut/shared/feature/suspicious_transaction/impl/flow/SuspiciousTransactionFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Loading", "Error", "Warning", "Action", "Question", "Screen", "Redirect", "Lcom/revolut/shared/feature/suspicious_transaction/impl/flow/SuspiciousTransactionFlowContract$Step$Action;", "Lcom/revolut/shared/feature/suspicious_transaction/impl/flow/SuspiciousTransactionFlowContract$Step$Error;", "Lcom/revolut/shared/feature/suspicious_transaction/impl/flow/SuspiciousTransactionFlowContract$Step$Loading;", "Lcom/revolut/shared/feature/suspicious_transaction/impl/flow/SuspiciousTransactionFlowContract$Step$Question;", "Lcom/revolut/shared/feature/suspicious_transaction/impl/flow/SuspiciousTransactionFlowContract$Step$Redirect;", "Lcom/revolut/shared/feature/suspicious_transaction/impl/flow/SuspiciousTransactionFlowContract$Step$Screen;", "Lcom/revolut/shared/feature/suspicious_transaction/impl/flow/SuspiciousTransactionFlowContract$Step$Warning;", "feature_suspicious_transaction_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SuspiciousTransactionFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/impl/flow/SuspiciousTransactionFlowContract$Step$Action;", "Lcom/revolut/shared/feature/suspicious_transaction/impl/flow/SuspiciousTransactionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_suspicious_transaction_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Action extends SuspiciousTransactionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Action> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SuspiciousTransactionDialog.Action f104987a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Action((SuspiciousTransactionDialog.Action) parcel.readParcelable(Action.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Action[i];
            }
        }

        public Action(SuspiciousTransactionDialog.Action action) {
            Intrinsics.checkNotNullParameter(action, "action");
            this.f104987a = action;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Action) && Intrinsics.f(this.f104987a, ((Action) obj2).f104987a);
        }

        public final int hashCode() {
            return this.f104987a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f104987a, i);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/impl/flow/SuspiciousTransactionFlowContract$Step$Error;", "Lcom/revolut/shared/feature/suspicious_transaction/impl/flow/SuspiciousTransactionFlowContract$Step;", "<init>", "()V", "feature_suspicious_transaction_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Error extends SuspiciousTransactionFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Error f104988a = new Error();

        @NotNull
        public static final Parcelable.Creator<Error> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Error.f104988a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Error[i];
            }
        }

        private Error() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/impl/flow/SuspiciousTransactionFlowContract$Step$Loading;", "Lcom/revolut/shared/feature/suspicious_transaction/impl/flow/SuspiciousTransactionFlowContract$Step;", "<init>", "()V", "feature_suspicious_transaction_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Loading extends SuspiciousTransactionFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Loading f104989a = new Loading();

        @NotNull
        public static final Parcelable.Creator<Loading> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Loading.f104989a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Loading[i];
            }
        }

        private Loading() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/impl/flow/SuspiciousTransactionFlowContract$Step$Question;", "Lcom/revolut/shared/feature/suspicious_transaction/impl/flow/SuspiciousTransactionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_suspicious_transaction_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Question extends SuspiciousTransactionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Question> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SuspiciousTransactionDialog.Question f104990a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SuspiciousTransactionDialogAnswer f104991b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Question((SuspiciousTransactionDialog.Question) parcel.readParcelable(Question.class.getClassLoader()), (SuspiciousTransactionDialogAnswer) parcel.readParcelable(Question.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Question[i];
            }
        }

        public Question(SuspiciousTransactionDialog.Question question, SuspiciousTransactionDialogAnswer suspiciousTransactionDialogAnswer) {
            Intrinsics.checkNotNullParameter(question, "question");
            this.f104990a = question;
            this.f104991b = suspiciousTransactionDialogAnswer;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Question)) {
                return false;
            }
            Question question = (Question) obj2;
            return Intrinsics.f(this.f104990a, question.f104990a) && Intrinsics.f(this.f104991b, question.f104991b);
        }

        public final int hashCode() {
            int iHashCode = this.f104990a.hashCode() * 31;
            SuspiciousTransactionDialogAnswer suspiciousTransactionDialogAnswer = this.f104991b;
            return iHashCode + (suspiciousTransactionDialogAnswer == null ? 0 : suspiciousTransactionDialogAnswer.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f104990a, i);
            dest.writeParcelable(this.f104991b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/impl/flow/SuspiciousTransactionFlowContract$Step$Redirect;", "Lcom/revolut/shared/feature/suspicious_transaction/impl/flow/SuspiciousTransactionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_suspicious_transaction_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Redirect extends SuspiciousTransactionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Redirect> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f104992a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Redirect(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Redirect[i];
            }
        }

        public Redirect(String str) {
            this.f104992a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Redirect) && Intrinsics.f(this.f104992a, ((Redirect) obj2).f104992a);
        }

        public final int hashCode() {
            String str = this.f104992a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f104992a);
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/impl/flow/SuspiciousTransactionFlowContract$Step$Screen;", "Lcom/revolut/shared/feature/suspicious_transaction/impl/flow/SuspiciousTransactionFlowContract$Step;", "<init>", "()V", "SimpleWarning", "CircleWarning", "SimpleConfirmation", "RiskAgreement", "Cancel", "Lcom/revolut/shared/feature/suspicious_transaction/impl/flow/SuspiciousTransactionFlowContract$Step$Screen$Cancel;", "Lcom/revolut/shared/feature/suspicious_transaction/impl/flow/SuspiciousTransactionFlowContract$Step$Screen$CircleWarning;", "Lcom/revolut/shared/feature/suspicious_transaction/impl/flow/SuspiciousTransactionFlowContract$Step$Screen$RiskAgreement;", "Lcom/revolut/shared/feature/suspicious_transaction/impl/flow/SuspiciousTransactionFlowContract$Step$Screen$SimpleConfirmation;", "Lcom/revolut/shared/feature/suspicious_transaction/impl/flow/SuspiciousTransactionFlowContract$Step$Screen$SimpleWarning;", "feature_suspicious_transaction_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Screen extends SuspiciousTransactionFlowContract$Step {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/impl/flow/SuspiciousTransactionFlowContract$Step$Screen$Cancel;", "Lcom/revolut/shared/feature/suspicious_transaction/impl/flow/SuspiciousTransactionFlowContract$Step$Screen;", "", "toString", "()Ljava/lang/String;", "feature_suspicious_transaction_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Cancel extends Screen {

            @NotNull
            public static final Parcelable.Creator<Cancel> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SuspiciousTransactionDialog.Screen.Cancel f104993a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Cancel((SuspiciousTransactionDialog.Screen.Cancel) parcel.readParcelable(Cancel.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Cancel[i];
                }
            }

            public Cancel(SuspiciousTransactionDialog.Screen.Cancel screen) {
                Intrinsics.checkNotNullParameter(screen, "screen");
                this.f104993a = screen;
            }

            @Override // com.revolut.shared.feature.suspicious_transaction.impl.flow.SuspiciousTransactionFlowContract$Step.Screen
            public final SuspiciousTransactionDialog.Screen a() {
                return this.f104993a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Cancel) && Intrinsics.f(this.f104993a, ((Cancel) obj2).f104993a);
            }

            public final int hashCode() {
                return this.f104993a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f104993a, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/impl/flow/SuspiciousTransactionFlowContract$Step$Screen$CircleWarning;", "Lcom/revolut/shared/feature/suspicious_transaction/impl/flow/SuspiciousTransactionFlowContract$Step$Screen;", "", "toString", "()Ljava/lang/String;", "feature_suspicious_transaction_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CircleWarning extends Screen {

            @NotNull
            public static final Parcelable.Creator<CircleWarning> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SuspiciousTransactionDialog.Screen.CircleWarning f104994a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new CircleWarning((SuspiciousTransactionDialog.Screen.CircleWarning) parcel.readParcelable(CircleWarning.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new CircleWarning[i];
                }
            }

            public CircleWarning(SuspiciousTransactionDialog.Screen.CircleWarning screen) {
                Intrinsics.checkNotNullParameter(screen, "screen");
                this.f104994a = screen;
            }

            @Override // com.revolut.shared.feature.suspicious_transaction.impl.flow.SuspiciousTransactionFlowContract$Step.Screen
            public final SuspiciousTransactionDialog.Screen a() {
                return this.f104994a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof CircleWarning) && Intrinsics.f(this.f104994a, ((CircleWarning) obj2).f104994a);
            }

            public final int hashCode() {
                return this.f104994a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f104994a, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/impl/flow/SuspiciousTransactionFlowContract$Step$Screen$RiskAgreement;", "Lcom/revolut/shared/feature/suspicious_transaction/impl/flow/SuspiciousTransactionFlowContract$Step$Screen;", "", "toString", "()Ljava/lang/String;", "feature_suspicious_transaction_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class RiskAgreement extends Screen {

            @NotNull
            public static final Parcelable.Creator<RiskAgreement> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SuspiciousTransactionDialog.Screen.RiskAgreement f104995a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new RiskAgreement((SuspiciousTransactionDialog.Screen.RiskAgreement) parcel.readParcelable(RiskAgreement.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new RiskAgreement[i];
                }
            }

            public RiskAgreement(SuspiciousTransactionDialog.Screen.RiskAgreement screen) {
                Intrinsics.checkNotNullParameter(screen, "screen");
                this.f104995a = screen;
            }

            @Override // com.revolut.shared.feature.suspicious_transaction.impl.flow.SuspiciousTransactionFlowContract$Step.Screen
            public final SuspiciousTransactionDialog.Screen a() {
                return this.f104995a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof RiskAgreement) && Intrinsics.f(this.f104995a, ((RiskAgreement) obj2).f104995a);
            }

            public final int hashCode() {
                return this.f104995a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f104995a, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/impl/flow/SuspiciousTransactionFlowContract$Step$Screen$SimpleConfirmation;", "Lcom/revolut/shared/feature/suspicious_transaction/impl/flow/SuspiciousTransactionFlowContract$Step$Screen;", "", "toString", "()Ljava/lang/String;", "feature_suspicious_transaction_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SimpleConfirmation extends Screen {

            @NotNull
            public static final Parcelable.Creator<SimpleConfirmation> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SuspiciousTransactionDialog.Screen.SimpleConfirmation f104996a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new SimpleConfirmation((SuspiciousTransactionDialog.Screen.SimpleConfirmation) parcel.readParcelable(SimpleConfirmation.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SimpleConfirmation[i];
                }
            }

            public SimpleConfirmation(SuspiciousTransactionDialog.Screen.SimpleConfirmation screen) {
                Intrinsics.checkNotNullParameter(screen, "screen");
                this.f104996a = screen;
            }

            @Override // com.revolut.shared.feature.suspicious_transaction.impl.flow.SuspiciousTransactionFlowContract$Step.Screen
            public final SuspiciousTransactionDialog.Screen a() {
                return this.f104996a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof SimpleConfirmation) && Intrinsics.f(this.f104996a, ((SimpleConfirmation) obj2).f104996a);
            }

            public final int hashCode() {
                return this.f104996a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f104996a, i);
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/impl/flow/SuspiciousTransactionFlowContract$Step$Screen$SimpleWarning;", "Lcom/revolut/shared/feature/suspicious_transaction/impl/flow/SuspiciousTransactionFlowContract$Step$Screen;", "", "toString", "()Ljava/lang/String;", "feature_suspicious_transaction_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SimpleWarning extends Screen {

            @NotNull
            public static final Parcelable.Creator<SimpleWarning> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final SuspiciousTransactionDialog.Screen.SimpleWarning f104997a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new SimpleWarning((SuspiciousTransactionDialog.Screen.SimpleWarning) parcel.readParcelable(SimpleWarning.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new SimpleWarning[i];
                }
            }

            public SimpleWarning(SuspiciousTransactionDialog.Screen.SimpleWarning screen) {
                Intrinsics.checkNotNullParameter(screen, "screen");
                this.f104997a = screen;
            }

            @Override // com.revolut.shared.feature.suspicious_transaction.impl.flow.SuspiciousTransactionFlowContract$Step.Screen
            public final SuspiciousTransactionDialog.Screen a() {
                return this.f104997a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof SimpleWarning) && Intrinsics.f(this.f104997a, ((SimpleWarning) obj2).f104997a);
            }

            public final int hashCode() {
                return this.f104997a.hashCode();
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f104997a, i);
            }
        }

        private Screen() {
        }

        public abstract SuspiciousTransactionDialog.Screen a();
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/suspicious_transaction/impl/flow/SuspiciousTransactionFlowContract$Step$Warning;", "Lcom/revolut/shared/feature/suspicious_transaction/impl/flow/SuspiciousTransactionFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_suspicious_transaction_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Warning extends SuspiciousTransactionFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Warning> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final SuspiciousTransactionDialog.Warning f104998a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Warning((SuspiciousTransactionDialog.Warning) parcel.readParcelable(Warning.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Warning[i];
            }
        }

        public Warning(SuspiciousTransactionDialog.Warning warning) {
            Intrinsics.checkNotNullParameter(warning, "warning");
            this.f104998a = warning;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Warning) && Intrinsics.f(this.f104998a, ((Warning) obj2).f104998a);
        }

        public final int hashCode() {
            return this.f104998a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f104998a, i);
        }
    }

    private SuspiciousTransactionFlowContract$Step() {
    }
}
