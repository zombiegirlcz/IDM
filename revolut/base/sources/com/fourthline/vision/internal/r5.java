package com.fourthline.vision.internal;

import com.fourthline.core.mrz.MrzInfo;
import com.fourthline.vision.ScannerImage;
import com.fourthline.vision.document.DocumentValidationError;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public interface r5 extends ud {
    @Override // com.fourthline.vision.internal.ud
    @NotNull
    /* synthetic */ ScannerImage getImage();

    @NotNull
    Set<DocumentValidationError> getValidationErrors();

    public static final class a implements r5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ScannerImage f36750a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set f36751b;

        public a(@NotNull ScannerImage image, @NotNull Set<? extends DocumentValidationError> validationErrors) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(validationErrors, "validationErrors");
            this.f36750a = image;
            this.f36751b = validationErrors;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a copy$default(a aVar, ScannerImage scannerImage, Set set, int i, Object obj2) {
            if ((i & 1) != 0) {
                scannerImage = aVar.f36750a;
            }
            if ((i & 2) != 0) {
                set = aVar.f36751b;
            }
            return aVar.copy(scannerImage, set);
        }

        @NotNull
        public final ScannerImage component1() {
            return this.f36750a;
        }

        @NotNull
        public final Set<DocumentValidationError> component2() {
            return this.f36751b;
        }

        @NotNull
        public final a copy(@NotNull ScannerImage image, @NotNull Set<? extends DocumentValidationError> validationErrors) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(validationErrors, "validationErrors");
            return new a(image, validationErrors);
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f36750a, aVar.f36750a) && Intrinsics.f(this.f36751b, aVar.f36751b);
        }

        @Override // com.fourthline.vision.internal.r5, com.fourthline.vision.internal.ud
        @NotNull
        public ScannerImage getImage() {
            return this.f36750a;
        }

        @Override // com.fourthline.vision.internal.r5
        @NotNull
        public Set<DocumentValidationError> getValidationErrors() {
            return this.f36751b;
        }

        public int hashCode() {
            return (this.f36750a.hashCode() * 31) + this.f36751b.hashCode();
        }

        @NotNull
        public String toString() {
            return "ImageOnly(image=" + this.f36750a + ", validationErrors=" + this.f36751b + ")";
        }

        public a(ScannerImage scannerImage, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(scannerImage, (i & 2) != 0 ? zhm.h0.f322473a : set);
        }
    }

    public static final class b implements r5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ScannerImage f36752a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final MrzInfo f36753b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set f36754c;

        public b(@NotNull ScannerImage image, @NotNull MrzInfo mrz, @NotNull Set<? extends DocumentValidationError> validationErrors) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(mrz, "mrz");
            Intrinsics.checkNotNullParameter(validationErrors, "validationErrors");
            this.f36752a = image;
            this.f36753b = mrz;
            this.f36754c = validationErrors;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ b copy$default(b bVar, ScannerImage scannerImage, MrzInfo mrzInfo, Set set, int i, Object obj2) {
            if ((i & 1) != 0) {
                scannerImage = bVar.f36752a;
            }
            if ((i & 2) != 0) {
                mrzInfo = bVar.f36753b;
            }
            if ((i & 4) != 0) {
                set = bVar.f36754c;
            }
            return bVar.copy(scannerImage, mrzInfo, set);
        }

        @NotNull
        public final ScannerImage component1() {
            return this.f36752a;
        }

        @NotNull
        public final MrzInfo component2() {
            return this.f36753b;
        }

        @NotNull
        public final Set<DocumentValidationError> component3() {
            return this.f36754c;
        }

        @NotNull
        public final b copy(@NotNull ScannerImage image, @NotNull MrzInfo mrz, @NotNull Set<? extends DocumentValidationError> validationErrors) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(mrz, "mrz");
            Intrinsics.checkNotNullParameter(validationErrors, "validationErrors");
            return new b(image, mrz, validationErrors);
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.f36752a, bVar.f36752a) && Intrinsics.f(this.f36753b, bVar.f36753b) && Intrinsics.f(this.f36754c, bVar.f36754c);
        }

        @Override // com.fourthline.vision.internal.r5, com.fourthline.vision.internal.ud
        @NotNull
        public ScannerImage getImage() {
            return this.f36752a;
        }

        @NotNull
        public final MrzInfo getMrz() {
            return this.f36753b;
        }

        @Override // com.fourthline.vision.internal.r5
        @NotNull
        public Set<DocumentValidationError> getValidationErrors() {
            return this.f36754c;
        }

        public int hashCode() {
            return (((this.f36752a.hashCode() * 31) + this.f36753b.hashCode()) * 31) + this.f36754c.hashCode();
        }

        @NotNull
        public String toString() {
            return "Mrz(image=" + this.f36752a + ", mrz=" + this.f36753b + ", validationErrors=" + this.f36754c + ")";
        }

        public b(ScannerImage scannerImage, MrzInfo mrzInfo, Set set, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(scannerImage, mrzInfo, (i & 4) != 0 ? zhm.h0.f322473a : set);
        }
    }
}
