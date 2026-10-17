package com.revolut.biometric_verification.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.camerakit.client.api.models.CameraCaptureSettings;
import com.revolut.camerakit.client.api.models.CaptureMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/revolut/biometric_verification/api/models/BiometricVerificationStep;", "Landroid/os/Parcelable;", "Selfie", "PreviewlessSelfie", "Document", "ActiveLiveness", "SelfieSearch", "Lcom/revolut/biometric_verification/api/models/BiometricVerificationStep$ActiveLiveness;", "Lcom/revolut/biometric_verification/api/models/BiometricVerificationStep$Document;", "Lcom/revolut/biometric_verification/api/models/BiometricVerificationStep$PreviewlessSelfie;", "Lcom/revolut/biometric_verification/api/models/BiometricVerificationStep$Selfie;", "Lcom/revolut/biometric_verification/api/models/BiometricVerificationStep$SelfieSearch;", "biometric_verification_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface BiometricVerificationStep extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/api/models/BiometricVerificationStep$ActiveLiveness;", "Lcom/revolut/biometric_verification/api/models/BiometricVerificationStep;", "", "toString", "()Ljava/lang/String;", "biometric_verification_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ActiveLiveness implements BiometricVerificationStep {

        @NotNull
        public static final Parcelable.Creator<ActiveLiveness> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f50399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CaptureMode f50400b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CameraCaptureSettings f50401c;
        public final BiometricVerificationFeatures d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(ActiveLiveness.class, parcel, arrayList, iE, 1);
                }
                return new ActiveLiveness(arrayList, (CaptureMode) parcel.readParcelable(ActiveLiveness.class.getClassLoader()), (CameraCaptureSettings) parcel.readParcelable(ActiveLiveness.class.getClassLoader()), BiometricVerificationFeatures.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ActiveLiveness[i];
            }
        }

        public ActiveLiveness(ArrayList resources, CaptureMode captureMode, CameraCaptureSettings cameraCaptureSettings, BiometricVerificationFeatures features) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(captureMode, "captureMode");
            Intrinsics.checkNotNullParameter(cameraCaptureSettings, "cameraCaptureSettings");
            Intrinsics.checkNotNullParameter(features, "features");
            this.f50399a = resources;
            this.f50400b = captureMode;
            this.f50401c = cameraCaptureSettings;
            this.d = features;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ActiveLiveness)) {
                return false;
            }
            ActiveLiveness activeLiveness = (ActiveLiveness) obj2;
            return this.f50399a.equals(activeLiveness.f50399a) && Intrinsics.f(this.f50400b, activeLiveness.f50400b) && Intrinsics.f(this.f50401c, activeLiveness.f50401c) && Intrinsics.f(this.d, activeLiveness.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.f50401c.hashCode() + ((this.f50400b.hashCode() + (this.f50399a.hashCode() * 31)) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f50399a, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
            dest.writeParcelable(this.f50400b, i);
            dest.writeParcelable(this.f50401c, i);
            this.d.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/api/models/BiometricVerificationStep$Document;", "Lcom/revolut/biometric_verification/api/models/BiometricVerificationStep;", "", "toString", "()Ljava/lang/String;", "biometric_verification_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Document implements BiometricVerificationStep {

        @NotNull
        public static final Parcelable.Creator<Document> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f50402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CaptureMode f50403b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f50404c;
        public final ArrayList d;
        public final BiometricVerificationFeatures e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                int iE2 = 0;
                while (iE2 != i) {
                    iE2 = j6.a.e(Document.class, parcel, arrayList, iE2, 1);
                }
                CaptureMode captureMode = (CaptureMode) parcel.readParcelable(Document.class.getClassLoader());
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                int iA = 0;
                while (iA != i2) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(BiometricVerificationAcceptedDocument.CREATOR, parcel, arrayList2, iA, 1);
                }
                int i3 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i3);
                while (iE != i3) {
                    iE = j6.a.e(Document.class, parcel, arrayList3, iE, 1);
                }
                return new Document(arrayList, captureMode, arrayList2, arrayList3, BiometricVerificationFeatures.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Document[i];
            }
        }

        public Document(ArrayList resources, CaptureMode captureMode, ArrayList acceptedDocuments, ArrayList preparationSteps, BiometricVerificationFeatures features) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(captureMode, "captureMode");
            Intrinsics.checkNotNullParameter(acceptedDocuments, "acceptedDocuments");
            Intrinsics.checkNotNullParameter(preparationSteps, "preparationSteps");
            Intrinsics.checkNotNullParameter(features, "features");
            this.f50402a = resources;
            this.f50403b = captureMode;
            this.f50404c = acceptedDocuments;
            this.d = preparationSteps;
            this.e = features;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Document)) {
                return false;
            }
            Document document = (Document) obj2;
            return this.f50402a.equals(document.f50402a) && Intrinsics.f(this.f50403b, document.f50403b) && this.f50404c.equals(document.f50404c) && this.d.equals(document.d) && Intrinsics.f(this.e, document.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, com.google.android.gms.internal.mlkit_vision_face.a.b(this.f50404c, (this.f50403b.hashCode() + (this.f50402a.hashCode() * 31)) * 31, 31), 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itY = j6.a.y(this.f50402a, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
            dest.writeParcelable(this.f50403b, i);
            Iterator itY2 = j6.a.y(this.f50404c, dest);
            while (itY2.hasNext()) {
                ((BiometricVerificationAcceptedDocument) itY2.next()).writeToParcel(dest, i);
            }
            Iterator itY3 = j6.a.y(this.d, dest);
            while (itY3.hasNext()) {
                dest.writeParcelable((Parcelable) itY3.next(), i);
            }
            this.e.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/api/models/BiometricVerificationStep$PreviewlessSelfie;", "Lcom/revolut/biometric_verification/api/models/BiometricVerificationStep;", "", "toString", "()Ljava/lang/String;", "biometric_verification_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PreviewlessSelfie implements BiometricVerificationStep {

        @NotNull
        public static final Parcelable.Creator<PreviewlessSelfie> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f50405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CaptureMode f50406b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CameraCaptureSettings f50407c;
        public final int d;
        public final Selfie e;
        public final BiometricVerificationFeatures f;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(PreviewlessSelfie.class, parcel, arrayList, iE, 1);
                }
                return new PreviewlessSelfie(arrayList, (CaptureMode) parcel.readParcelable(PreviewlessSelfie.class.getClassLoader()), (CameraCaptureSettings) parcel.readParcelable(PreviewlessSelfie.class.getClassLoader()), parcel.readInt(), Selfie.CREATOR.createFromParcel(parcel), BiometricVerificationFeatures.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new PreviewlessSelfie[i];
            }
        }

        public PreviewlessSelfie(List resources, CaptureMode captureMode, CameraCaptureSettings cameraCaptureSettings, int i, Selfie fallbackStep, BiometricVerificationFeatures features) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(captureMode, "captureMode");
            Intrinsics.checkNotNullParameter(cameraCaptureSettings, "cameraCaptureSettings");
            Intrinsics.checkNotNullParameter(fallbackStep, "fallbackStep");
            Intrinsics.checkNotNullParameter(features, "features");
            this.f50405a = resources;
            this.f50406b = captureMode;
            this.f50407c = cameraCaptureSettings;
            this.d = i;
            this.e = fallbackStep;
            this.f = features;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof PreviewlessSelfie)) {
                return false;
            }
            PreviewlessSelfie previewlessSelfie = (PreviewlessSelfie) obj2;
            return Intrinsics.f(this.f50405a, previewlessSelfie.f50405a) && Intrinsics.f(this.f50406b, previewlessSelfie.f50406b) && Intrinsics.f(this.f50407c, previewlessSelfie.f50407c) && this.d == previewlessSelfie.d && Intrinsics.f(this.e, previewlessSelfie.e) && Intrinsics.f(this.f, previewlessSelfie.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + ((this.e.hashCode() + j6.a.b(this.d, (this.f50407c.hashCode() + ((this.f50406b.hashCode() + (this.f50405a.hashCode() * 31)) * 31)) * 31, 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f50405a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeParcelable(this.f50406b, i);
            dest.writeParcelable(this.f50407c, i);
            dest.writeInt(this.d);
            this.e.writeToParcel(dest, i);
            this.f.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/api/models/BiometricVerificationStep$Selfie;", "Lcom/revolut/biometric_verification/api/models/BiometricVerificationStep;", "", "toString", "()Ljava/lang/String;", "biometric_verification_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Selfie implements BiometricVerificationStep {

        @NotNull
        public static final Parcelable.Creator<Selfie> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f50408a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CaptureMode f50409b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CameraCaptureSettings f50410c;
        public final BiometricVerificationFeatures d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(Selfie.class, parcel, arrayList, iE, 1);
                }
                return new Selfie(arrayList, (CaptureMode) parcel.readParcelable(Selfie.class.getClassLoader()), (CameraCaptureSettings) parcel.readParcelable(Selfie.class.getClassLoader()), BiometricVerificationFeatures.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Selfie[i];
            }
        }

        public Selfie(List resources, CaptureMode captureMode, CameraCaptureSettings cameraCaptureSettings, BiometricVerificationFeatures features) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            Intrinsics.checkNotNullParameter(captureMode, "captureMode");
            Intrinsics.checkNotNullParameter(cameraCaptureSettings, "cameraCaptureSettings");
            Intrinsics.checkNotNullParameter(features, "features");
            this.f50408a = resources;
            this.f50409b = captureMode;
            this.f50410c = cameraCaptureSettings;
            this.d = features;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Selfie)) {
                return false;
            }
            Selfie selfie = (Selfie) obj2;
            return Intrinsics.f(this.f50408a, selfie.f50408a) && Intrinsics.f(this.f50409b, selfie.f50409b) && Intrinsics.f(this.f50410c, selfie.f50410c) && Intrinsics.f(this.d, selfie.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.f50410c.hashCode() + ((this.f50409b.hashCode() + (this.f50408a.hashCode() * 31)) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f50408a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
            dest.writeParcelable(this.f50409b, i);
            dest.writeParcelable(this.f50410c, i);
            this.d.writeToParcel(dest, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/biometric_verification/api/models/BiometricVerificationStep$SelfieSearch;", "Lcom/revolut/biometric_verification/api/models/BiometricVerificationStep;", "", "toString", "()Ljava/lang/String;", "biometric_verification_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SelfieSearch implements BiometricVerificationStep {

        @NotNull
        public static final Parcelable.Creator<SelfieSearch> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f50411a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(SelfieSearch.class, parcel, arrayList, iE, 1);
                }
                return new SelfieSearch(arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SelfieSearch[i];
            }
        }

        public SelfieSearch(List resources) {
            Intrinsics.checkNotNullParameter(resources, "resources");
            this.f50411a = resources;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SelfieSearch) && Intrinsics.f(this.f50411a, ((SelfieSearch) obj2).f50411a);
        }

        public final int hashCode() {
            return this.f50411a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            Iterator itV = p.a.v(this.f50411a, dest);
            while (itV.hasNext()) {
                dest.writeParcelable((Parcelable) itV.next(), i);
            }
        }
    }
}
