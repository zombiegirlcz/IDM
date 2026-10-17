package com.revolut.biometric_verification.impl.ui.step.document.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.biometric_verification.api.models.BiometricVerificationDocument;
import com.revolut.biometric_verification.api.models.BiometricVerificationDocumentPage;
import com.revolut.biometric_verification.api.models.BiometricVerificationDocumentType;
import com.revolut.biometric_verification.impl.ui.step.nfc.flow.BiometricVerificationNfcFlowContract$AuthData;
import com.revolut.camerakit.validators.mrz.MrzDocument$Standard;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vs.f;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"com/revolut/biometric_verification/impl/ui/step/document/flow/BiometricVerificationDocumentStepFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "DocumentLivenessIntro", "Intro", "DocumentSelection", "NewDocumentPicker", "BeforeYouProceed", "DocumentCountryPicker", "Camera", "NfcReader", "CardDetails", "CardDetailsEdit", "CardPinEnter", "EnterDetailsManually", "ManualDocumentSelection", "Lcom/revolut/biometric_verification/impl/ui/step/document/flow/BiometricVerificationDocumentStepFlowContract$Step$BeforeYouProceed;", "Lcom/revolut/biometric_verification/impl/ui/step/document/flow/BiometricVerificationDocumentStepFlowContract$Step$Camera;", "Lcom/revolut/biometric_verification/impl/ui/step/document/flow/BiometricVerificationDocumentStepFlowContract$Step$CardDetails;", "Lcom/revolut/biometric_verification/impl/ui/step/document/flow/BiometricVerificationDocumentStepFlowContract$Step$CardDetailsEdit;", "Lcom/revolut/biometric_verification/impl/ui/step/document/flow/BiometricVerificationDocumentStepFlowContract$Step$CardPinEnter;", "Lcom/revolut/biometric_verification/impl/ui/step/document/flow/BiometricVerificationDocumentStepFlowContract$Step$DocumentCountryPicker;", "Lcom/revolut/biometric_verification/impl/ui/step/document/flow/BiometricVerificationDocumentStepFlowContract$Step$DocumentLivenessIntro;", "Lcom/revolut/biometric_verification/impl/ui/step/document/flow/BiometricVerificationDocumentStepFlowContract$Step$DocumentSelection;", "Lcom/revolut/biometric_verification/impl/ui/step/document/flow/BiometricVerificationDocumentStepFlowContract$Step$EnterDetailsManually;", "Lcom/revolut/biometric_verification/impl/ui/step/document/flow/BiometricVerificationDocumentStepFlowContract$Step$Intro;", "Lcom/revolut/biometric_verification/impl/ui/step/document/flow/BiometricVerificationDocumentStepFlowContract$Step$ManualDocumentSelection;", "Lcom/revolut/biometric_verification/impl/ui/step/document/flow/BiometricVerificationDocumentStepFlowContract$Step$NewDocumentPicker;", "Lcom/revolut/biometric_verification/impl/ui/step/document/flow/BiometricVerificationDocumentStepFlowContract$Step$NfcReader;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BiometricVerificationDocumentStepFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/document/flow/BiometricVerificationDocumentStepFlowContract$Step$BeforeYouProceed;", "Lcom/revolut/biometric_verification/impl/ui/step/document/flow/BiometricVerificationDocumentStepFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class BeforeYouProceed implements BiometricVerificationDocumentStepFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<BeforeYouProceed> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiometricVerificationDocument f50549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f50550b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BeforeYouProceed((BiometricVerificationDocument) parcel.readParcelable(BeforeYouProceed.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new BeforeYouProceed[i];
            }
        }

        public BeforeYouProceed(BiometricVerificationDocument document, boolean z) {
            Intrinsics.checkNotNullParameter(document, "document");
            this.f50549a = document;
            this.f50550b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof BeforeYouProceed)) {
                return false;
            }
            BeforeYouProceed beforeYouProceed = (BeforeYouProceed) obj2;
            return Intrinsics.f(this.f50549a, beforeYouProceed.f50549a) && this.f50550b == beforeYouProceed.f50550b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f50550b) + (this.f50549a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f50549a, i);
            dest.writeInt(this.f50550b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/document/flow/BiometricVerificationDocumentStepFlowContract$Step$Camera;", "Lcom/revolut/biometric_verification/impl/ui/step/document/flow/BiometricVerificationDocumentStepFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Camera implements BiometricVerificationDocumentStepFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Camera> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiometricVerificationDocument f50551a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BiometricVerificationDocumentPage f50552b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f50553c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                BiometricVerificationDocument biometricVerificationDocument = (BiometricVerificationDocument) j6.a.f(parcel, "parcel", Camera.class);
                BiometricVerificationDocumentPage biometricVerificationDocumentPage = (BiometricVerificationDocumentPage) parcel.readParcelable(Camera.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(Camera.class, parcel, arrayList, iE, 1);
                }
                return new Camera(biometricVerificationDocument, biometricVerificationDocumentPage, arrayList, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Camera[i];
            }
        }

        public Camera(BiometricVerificationDocument document, BiometricVerificationDocumentPage page, ArrayList remainingPages, boolean z) {
            Intrinsics.checkNotNullParameter(document, "document");
            Intrinsics.checkNotNullParameter(page, "page");
            Intrinsics.checkNotNullParameter(remainingPages, "remainingPages");
            this.f50551a = document;
            this.f50552b = page;
            this.f50553c = remainingPages;
            this.d = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Camera)) {
                return false;
            }
            Camera camera = (Camera) obj2;
            return Intrinsics.f(this.f50551a, camera.f50551a) && Intrinsics.f(this.f50552b, camera.f50552b) && this.f50553c.equals(camera.f50553c) && this.d == camera.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + com.google.android.gms.internal.mlkit_vision_face.a.b(this.f50553c, (this.f50552b.hashCode() + (this.f50551a.hashCode() * 31)) * 31, 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f50551a, i);
            dest.writeParcelable(this.f50552b, i);
            Iterator itY = j6.a.y(this.f50553c, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/document/flow/BiometricVerificationDocumentStepFlowContract$Step$CardDetails;", "Lcom/revolut/biometric_verification/impl/ui/step/document/flow/BiometricVerificationDocumentStepFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardDetails implements BiometricVerificationDocumentStepFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CardDetails> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails f50554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Camera f50555b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f50556c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardDetails(BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails.CREATOR.createFromParcel(parcel), Camera.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardDetails[i];
            }
        }

        public CardDetails(BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails details, Camera cameraStep, boolean z) {
            Intrinsics.checkNotNullParameter(details, "details");
            Intrinsics.checkNotNullParameter(cameraStep, "cameraStep");
            this.f50554a = details;
            this.f50555b = cameraStep;
            this.f50556c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CardDetails)) {
                return false;
            }
            CardDetails cardDetails = (CardDetails) obj2;
            return Intrinsics.f(this.f50554a, cardDetails.f50554a) && Intrinsics.f(this.f50555b, cardDetails.f50555b) && this.f50556c == cardDetails.f50556c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f50556c) + ((this.f50555b.hashCode() + (this.f50554a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f50554a.writeToParcel(dest, i);
            this.f50555b.writeToParcel(dest, i);
            dest.writeInt(this.f50556c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/document/flow/BiometricVerificationDocumentStepFlowContract$Step$CardDetailsEdit;", "Lcom/revolut/biometric_verification/impl/ui/step/document/flow/BiometricVerificationDocumentStepFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardDetailsEdit implements BiometricVerificationDocumentStepFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CardDetailsEdit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails f50557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f50558b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Camera f50559c;
        public final boolean d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardDetailsEdit(BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails.CREATOR.createFromParcel(parcel), f.valueOf(parcel.readString()), Camera.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardDetailsEdit[i];
            }
        }

        public CardDetailsEdit(BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails originalDetails, f editTarget, Camera cameraStep, boolean z) {
            Intrinsics.checkNotNullParameter(originalDetails, "originalDetails");
            Intrinsics.checkNotNullParameter(editTarget, "editTarget");
            Intrinsics.checkNotNullParameter(cameraStep, "cameraStep");
            this.f50557a = originalDetails;
            this.f50558b = editTarget;
            this.f50559c = cameraStep;
            this.d = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CardDetailsEdit)) {
                return false;
            }
            CardDetailsEdit cardDetailsEdit = (CardDetailsEdit) obj2;
            return Intrinsics.f(this.f50557a, cardDetailsEdit.f50557a) && this.f50558b == cardDetailsEdit.f50558b && Intrinsics.f(this.f50559c, cardDetailsEdit.f50559c) && this.d == cardDetailsEdit.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + ((this.f50559c.hashCode() + ((this.f50558b.hashCode() + (this.f50557a.hashCode() * 31)) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f50557a.writeToParcel(dest, i);
            dest.writeString(this.f50558b.name());
            this.f50559c.writeToParcel(dest, i);
            dest.writeInt(this.d ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/document/flow/BiometricVerificationDocumentStepFlowContract$Step$CardPinEnter;", "Lcom/revolut/biometric_verification/impl/ui/step/document/flow/BiometricVerificationDocumentStepFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CardPinEnter implements BiometricVerificationDocumentStepFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<CardPinEnter> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails f50560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Camera f50561b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f50562c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new CardPinEnter(BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails.CREATOR.createFromParcel(parcel), Camera.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CardPinEnter[i];
            }
        }

        public CardPinEnter(BiometricVerificationDocumentStepFlowContract$MyNumberCardDetails details, Camera cameraStep, boolean z) {
            Intrinsics.checkNotNullParameter(details, "details");
            Intrinsics.checkNotNullParameter(cameraStep, "cameraStep");
            this.f50560a = details;
            this.f50561b = cameraStep;
            this.f50562c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CardPinEnter)) {
                return false;
            }
            CardPinEnter cardPinEnter = (CardPinEnter) obj2;
            return Intrinsics.f(this.f50560a, cardPinEnter.f50560a) && Intrinsics.f(this.f50561b, cardPinEnter.f50561b) && this.f50562c == cardPinEnter.f50562c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f50562c) + ((this.f50561b.hashCode() + (this.f50560a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f50560a.writeToParcel(dest, i);
            this.f50561b.writeToParcel(dest, i);
            dest.writeInt(this.f50562c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/document/flow/BiometricVerificationDocumentStepFlowContract$Step$DocumentCountryPicker;", "Lcom/revolut/biometric_verification/impl/ui/step/document/flow/BiometricVerificationDocumentStepFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentCountryPicker implements BiometricVerificationDocumentStepFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DocumentCountryPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f50563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f50564b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentCountryPicker(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentCountryPicker[i];
            }
        }

        public DocumentCountryPicker(boolean z, boolean z3) {
            this.f50563a = z;
            this.f50564b = z3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DocumentCountryPicker)) {
                return false;
            }
            DocumentCountryPicker documentCountryPicker = (DocumentCountryPicker) obj2;
            return this.f50563a == documentCountryPicker.f50563a && this.f50564b == documentCountryPicker.f50564b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f50564b) + (Boolean.hashCode(this.f50563a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f50563a ? 1 : 0);
            dest.writeInt(this.f50564b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/document/flow/BiometricVerificationDocumentStepFlowContract$Step$DocumentLivenessIntro;", "Lcom/revolut/biometric_verification/impl/ui/step/document/flow/BiometricVerificationDocumentStepFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentLivenessIntro implements BiometricVerificationDocumentStepFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DocumentLivenessIntro> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiometricVerificationDocument f50565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f50566b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentLivenessIntro((BiometricVerificationDocument) parcel.readParcelable(DocumentLivenessIntro.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentLivenessIntro[i];
            }
        }

        public DocumentLivenessIntro(BiometricVerificationDocument document, boolean z) {
            Intrinsics.checkNotNullParameter(document, "document");
            this.f50565a = document;
            this.f50566b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DocumentLivenessIntro)) {
                return false;
            }
            DocumentLivenessIntro documentLivenessIntro = (DocumentLivenessIntro) obj2;
            return Intrinsics.f(this.f50565a, documentLivenessIntro.f50565a) && this.f50566b == documentLivenessIntro.f50566b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f50566b) + (this.f50565a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f50565a, i);
            dest.writeInt(this.f50566b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/document/flow/BiometricVerificationDocumentStepFlowContract$Step$DocumentSelection;", "Lcom/revolut/biometric_verification/impl/ui/step/document/flow/BiometricVerificationDocumentStepFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentSelection implements BiometricVerificationDocumentStepFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DocumentSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f50567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f50568b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int iE = 0;
                boolean z = parcel.readInt() != 0;
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                while (iE != i) {
                    iE = j6.a.e(DocumentSelection.class, parcel, arrayList, iE, 1);
                }
                return new DocumentSelection(arrayList, z);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentSelection[i];
            }
        }

        public DocumentSelection(ArrayList documents, boolean z) {
            Intrinsics.checkNotNullParameter(documents, "documents");
            this.f50567a = z;
            this.f50568b = documents;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DocumentSelection)) {
                return false;
            }
            DocumentSelection documentSelection = (DocumentSelection) obj2;
            return this.f50567a == documentSelection.f50567a && this.f50568b.equals(documentSelection.f50568b);
        }

        public final int hashCode() {
            return this.f50568b.hashCode() + (Boolean.hashCode(this.f50567a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f50567a ? 1 : 0);
            Iterator itY = j6.a.y(this.f50568b, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/document/flow/BiometricVerificationDocumentStepFlowContract$Step$EnterDetailsManually;", "Lcom/revolut/biometric_verification/impl/ui/step/document/flow/BiometricVerificationDocumentStepFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EnterDetailsManually implements BiometricVerificationDocumentStepFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<EnterDetailsManually> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final yt.a f50569a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Camera f50570b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f50571c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new EnterDetailsManually(yt.a.valueOf(parcel.readString()), Camera.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new EnterDetailsManually[i];
            }
        }

        public EnterDetailsManually(yt.a documentType, Camera cameraStep, boolean z) {
            Intrinsics.checkNotNullParameter(documentType, "documentType");
            Intrinsics.checkNotNullParameter(cameraStep, "cameraStep");
            this.f50569a = documentType;
            this.f50570b = cameraStep;
            this.f50571c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof EnterDetailsManually)) {
                return false;
            }
            EnterDetailsManually enterDetailsManually = (EnterDetailsManually) obj2;
            return this.f50569a == enterDetailsManually.f50569a && Intrinsics.f(this.f50570b, enterDetailsManually.f50570b) && this.f50571c == enterDetailsManually.f50571c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f50571c) + ((this.f50570b.hashCode() + (this.f50569a.hashCode() * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f50569a.name());
            this.f50570b.writeToParcel(dest, i);
            dest.writeInt(this.f50571c ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/document/flow/BiometricVerificationDocumentStepFlowContract$Step$Intro;", "Lcom/revolut/biometric_verification/impl/ui/step/document/flow/BiometricVerificationDocumentStepFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Intro implements BiometricVerificationDocumentStepFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Intro> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f50572a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final BiometricVerificationDocument f50573b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Intro((BiometricVerificationDocument) parcel.readParcelable(Intro.class.getClassLoader()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Intro[i];
            }
        }

        public Intro(BiometricVerificationDocument document, boolean z) {
            Intrinsics.checkNotNullParameter(document, "document");
            this.f50572a = z;
            this.f50573b = document;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Intro)) {
                return false;
            }
            Intro intro = (Intro) obj2;
            return this.f50572a == intro.f50572a && Intrinsics.f(this.f50573b, intro.f50573b);
        }

        public final int hashCode() {
            return this.f50573b.hashCode() + (Boolean.hashCode(this.f50572a) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f50572a ? 1 : 0);
            dest.writeParcelable(this.f50573b, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/document/flow/BiometricVerificationDocumentStepFlowContract$Step$ManualDocumentSelection;", "Lcom/revolut/biometric_verification/impl/ui/step/document/flow/BiometricVerificationDocumentStepFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ManualDocumentSelection implements BiometricVerificationDocumentStepFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ManualDocumentSelection> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiometricVerificationDocumentType f50574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final wi0.b f50575b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Camera f50576c;
        public final MrzDocument$Standard d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ManualDocumentSelection((BiometricVerificationDocumentType) parcel.readParcelable(ManualDocumentSelection.class.getClassLoader()), (wi0.b) parcel.readSerializable(), Camera.CREATOR.createFromParcel(parcel), (MrzDocument$Standard) parcel.readParcelable(ManualDocumentSelection.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ManualDocumentSelection[i];
            }
        }

        public ManualDocumentSelection(BiometricVerificationDocumentType detectedDocument, wi0.b detectedCountry, Camera cameraStep, MrzDocument$Standard mrzDocument$Standard) {
            Intrinsics.checkNotNullParameter(detectedDocument, "detectedDocument");
            Intrinsics.checkNotNullParameter(detectedCountry, "detectedCountry");
            Intrinsics.checkNotNullParameter(cameraStep, "cameraStep");
            this.f50574a = detectedDocument;
            this.f50575b = detectedCountry;
            this.f50576c = cameraStep;
            this.d = mrzDocument$Standard;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ManualDocumentSelection)) {
                return false;
            }
            ManualDocumentSelection manualDocumentSelection = (ManualDocumentSelection) obj2;
            return Intrinsics.f(this.f50574a, manualDocumentSelection.f50574a) && Intrinsics.f(this.f50575b, manualDocumentSelection.f50575b) && Intrinsics.f(this.f50576c, manualDocumentSelection.f50576c) && Intrinsics.f(this.d, manualDocumentSelection.d);
        }

        public final int hashCode() {
            int iHashCode = (this.f50576c.hashCode() + p.a.c(this.f50574a.hashCode() * 31, 31, this.f50575b.f297794a)) * 31;
            MrzDocument$Standard mrzDocument$Standard = this.d;
            return iHashCode + (mrzDocument$Standard == null ? 0 : mrzDocument$Standard.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f50574a, i);
            dest.writeSerializable(this.f50575b);
            this.f50576c.writeToParcel(dest, i);
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/document/flow/BiometricVerificationDocumentStepFlowContract$Step$NewDocumentPicker;", "Lcom/revolut/biometric_verification/impl/ui/step/document/flow/BiometricVerificationDocumentStepFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NewDocumentPicker implements BiometricVerificationDocumentStepFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<NewDocumentPicker> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f50577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f50578b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(NewDocumentPicker.class, parcel, arrayList, iE, 1);
                }
                return new NewDocumentPicker(arrayList, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NewDocumentPicker[i];
            }
        }

        public NewDocumentPicker(ArrayList documents, boolean z) {
            Intrinsics.checkNotNullParameter(documents, "documents");
            this.f50577a = documents;
            this.f50578b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NewDocumentPicker)) {
                return false;
            }
            NewDocumentPicker newDocumentPicker = (NewDocumentPicker) obj2;
            return this.f50577a.equals(newDocumentPicker.f50577a) && this.f50578b == newDocumentPicker.f50578b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f50578b) + (this.f50577a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f50577a, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
            dest.writeInt(this.f50578b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/impl/ui/step/document/flow/BiometricVerificationDocumentStepFlowContract$Step$NfcReader;", "Lcom/revolut/biometric_verification/impl/ui/step/document/flow/BiometricVerificationDocumentStepFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "biometric_verification_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NfcReader implements BiometricVerificationDocumentStepFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<NfcReader> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BiometricVerificationNfcFlowContract$AuthData f50579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Camera f50580b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f50581c;
        public final BiometricVerificationDocument d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NfcReader((BiometricVerificationNfcFlowContract$AuthData) parcel.readParcelable(NfcReader.class.getClassLoader()), Camera.CREATOR.createFromParcel(parcel), parcel.readInt() != 0, (BiometricVerificationDocument) parcel.readParcelable(NfcReader.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NfcReader[i];
            }
        }

        public NfcReader(BiometricVerificationNfcFlowContract$AuthData authData, Camera cameraStep, boolean z, BiometricVerificationDocument document) {
            Intrinsics.checkNotNullParameter(authData, "authData");
            Intrinsics.checkNotNullParameter(cameraStep, "cameraStep");
            Intrinsics.checkNotNullParameter(document, "document");
            this.f50579a = authData;
            this.f50580b = cameraStep;
            this.f50581c = z;
            this.d = document;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NfcReader)) {
                return false;
            }
            NfcReader nfcReader = (NfcReader) obj2;
            return Intrinsics.f(this.f50579a, nfcReader.f50579a) && Intrinsics.f(this.f50580b, nfcReader.f50580b) && this.f50581c == nfcReader.f50581c && Intrinsics.f(this.d, nfcReader.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + j6.a.c((this.f50580b.hashCode() + (this.f50579a.hashCode() * 31)) * 31, 31, this.f50581c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f50579a, i);
            this.f50580b.writeToParcel(dest, i);
            dest.writeInt(this.f50581c ? 1 : 0);
            dest.writeParcelable(this.d, i);
        }
    }
}
