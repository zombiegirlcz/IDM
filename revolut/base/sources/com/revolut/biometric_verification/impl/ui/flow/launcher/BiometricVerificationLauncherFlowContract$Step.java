package com.revolut.biometric_verification.impl.ui.flow.launcher;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.biometric_verification.api.models.BiometricVerificationStep;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u00012\u00020\u0002:\u0005\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"com/revolut/biometric_verification/impl/ui/flow/launcher/BiometricVerificationLauncherFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Landroid/os/Parcelable;", "Selfie", "Document", "ActiveLiveness", "PreviewlessSelfie", "SelfieSearch", "Lcom/revolut/biometric_verification/impl/ui/flow/launcher/BiometricVerificationLauncherFlowContract$Step$ActiveLiveness;", "Lcom/revolut/biometric_verification/impl/ui/flow/launcher/BiometricVerificationLauncherFlowContract$Step$Document;", "Lcom/revolut/biometric_verification/impl/ui/flow/launcher/BiometricVerificationLauncherFlowContract$Step$PreviewlessSelfie;", "Lcom/revolut/biometric_verification/impl/ui/flow/launcher/BiometricVerificationLauncherFlowContract$Step$Selfie;", "Lcom/revolut/biometric_verification/impl/ui/flow/launcher/BiometricVerificationLauncherFlowContract$Step$SelfieSearch;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BiometricVerificationLauncherFlowContract$Step extends FlowStep, Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/flow/launcher/BiometricVerificationLauncherFlowContract$Step$ActiveLiveness;", "Lcom/revolut/biometric_verification/impl/ui/flow/launcher/BiometricVerificationLauncherFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ActiveLiveness implements BiometricVerificationLauncherFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ActiveLiveness> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiometricVerificationStep.ActiveLiveness f50477a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ActiveLiveness((BiometricVerificationStep.ActiveLiveness) parcel.readParcelable(ActiveLiveness.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ActiveLiveness[i];
            }
        }

        public ActiveLiveness(BiometricVerificationStep.ActiveLiveness activeLivenessVerificationStep) {
            Intrinsics.checkNotNullParameter(activeLivenessVerificationStep, "activeLivenessVerificationStep");
            this.f50477a = activeLivenessVerificationStep;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ActiveLiveness) && Intrinsics.f(this.f50477a, ((ActiveLiveness) obj2).f50477a);
        }

        public final int hashCode() {
            return this.f50477a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f50477a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/flow/launcher/BiometricVerificationLauncherFlowContract$Step$Document;", "Lcom/revolut/biometric_verification/impl/ui/flow/launcher/BiometricVerificationLauncherFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Document implements BiometricVerificationLauncherFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Document> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiometricVerificationStep.Document f50478a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Document((BiometricVerificationStep.Document) parcel.readParcelable(Document.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Document[i];
            }
        }

        public Document(BiometricVerificationStep.Document documentVerificationStep) {
            Intrinsics.checkNotNullParameter(documentVerificationStep, "documentVerificationStep");
            this.f50478a = documentVerificationStep;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Document) && Intrinsics.f(this.f50478a, ((Document) obj2).f50478a);
        }

        public final int hashCode() {
            return this.f50478a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f50478a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/flow/launcher/BiometricVerificationLauncherFlowContract$Step$PreviewlessSelfie;", "Lcom/revolut/biometric_verification/impl/ui/flow/launcher/BiometricVerificationLauncherFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PreviewlessSelfie implements BiometricVerificationLauncherFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<PreviewlessSelfie> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiometricVerificationStep.PreviewlessSelfie f50479a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new PreviewlessSelfie((BiometricVerificationStep.PreviewlessSelfie) parcel.readParcelable(PreviewlessSelfie.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PreviewlessSelfie[i];
            }
        }

        public PreviewlessSelfie(BiometricVerificationStep.PreviewlessSelfie previewlessSelfieVerificationStep) {
            Intrinsics.checkNotNullParameter(previewlessSelfieVerificationStep, "previewlessSelfieVerificationStep");
            this.f50479a = previewlessSelfieVerificationStep;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof PreviewlessSelfie) && Intrinsics.f(this.f50479a, ((PreviewlessSelfie) obj2).f50479a);
        }

        public final int hashCode() {
            return this.f50479a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f50479a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/flow/launcher/BiometricVerificationLauncherFlowContract$Step$Selfie;", "Lcom/revolut/biometric_verification/impl/ui/flow/launcher/BiometricVerificationLauncherFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Selfie implements BiometricVerificationLauncherFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Selfie> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiometricVerificationStep.Selfie f50480a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Selfie((BiometricVerificationStep.Selfie) parcel.readParcelable(Selfie.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Selfie[i];
            }
        }

        public Selfie(BiometricVerificationStep.Selfie selfieVerificationStep) {
            Intrinsics.checkNotNullParameter(selfieVerificationStep, "selfieVerificationStep");
            this.f50480a = selfieVerificationStep;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Selfie) && Intrinsics.f(this.f50480a, ((Selfie) obj2).f50480a);
        }

        public final int hashCode() {
            return this.f50480a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f50480a, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/flow/launcher/BiometricVerificationLauncherFlowContract$Step$SelfieSearch;", "Lcom/revolut/biometric_verification/impl/ui/flow/launcher/BiometricVerificationLauncherFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelfieSearch implements BiometricVerificationLauncherFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SelfieSearch> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiometricVerificationStep.SelfieSearch f50481a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SelfieSearch((BiometricVerificationStep.SelfieSearch) parcel.readParcelable(SelfieSearch.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelfieSearch[i];
            }
        }

        public SelfieSearch(BiometricVerificationStep.SelfieSearch selfieSearchVerificationStep) {
            Intrinsics.checkNotNullParameter(selfieSearchVerificationStep, "selfieSearchVerificationStep");
            this.f50481a = selfieSearchVerificationStep;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SelfieSearch) && Intrinsics.f(this.f50481a, ((SelfieSearch) obj2).f50481a);
        }

        public final int hashCode() {
            return this.f50481a.f50411a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f50481a, i);
        }
    }
}
