package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import com.fourthline.vision.document.DocumentScannerStepResult;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface t1 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f33169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f33170b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Bitmap f33171c;
        private final DocumentScannerStepResult d;
        private final long e;

        public a(String documentId, String imageId, Bitmap image, DocumentScannerStepResult stepResult, long j2) {
            Intrinsics.checkNotNullParameter(documentId, "documentId");
            Intrinsics.checkNotNullParameter(imageId, "imageId");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(stepResult, "stepResult");
            this.f33169a = documentId;
            this.f33170b = imageId;
            this.f33171c = image;
            this.d = stepResult;
            this.e = j2;
        }

        public final String a() {
            return this.f33169a;
        }

        public final Bitmap b() {
            return this.f33171c;
        }

        public final String c() {
            return this.f33170b;
        }

        public final DocumentScannerStepResult d() {
            return this.d;
        }

        public final long e() {
            return this.e;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f33169a, aVar.f33169a) && Intrinsics.f(this.f33170b, aVar.f33170b) && Intrinsics.f(this.f33171c, aVar.f33171c) && Intrinsics.f(this.d, aVar.d) && this.e == aVar.e;
        }

        public int hashCode() {
            return (((((((this.f33169a.hashCode() * 31) + this.f33170b.hashCode()) * 31) + this.f33171c.hashCode()) * 31) + this.d.hashCode()) * 31) + Long.hashCode(this.e);
        }

        public String toString() {
            return "Input(documentId=" + this.f33169a + ", imageId=" + this.f33170b + ", image=" + this.f33171c + ", stepResult=" + this.d + ", timeOutInMillis=" + this.e + ")";
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final s50 f33172a;

            public a(s50 imageAnalysisResult) {
                Intrinsics.checkNotNullParameter(imageAnalysisResult, "imageAnalysisResult");
                this.f33172a = imageAnalysisResult;
            }

            public final s50 a() {
                return this.f33172a;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof a) && Intrinsics.f(this.f33172a, ((a) obj2).f33172a);
            }

            public int hashCode() {
                return this.f33172a.hashCode();
            }

            public String toString() {
                return "LegacySucceed(imageAnalysisResult=" + this.f33172a + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.t1$b$b, reason: collision with other inner class name */
        public static final class C0283b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final p10 f33173a;

            public C0283b(p10 imageAnalysisResult) {
                Intrinsics.checkNotNullParameter(imageAnalysisResult, "imageAnalysisResult");
                this.f33173a = imageAnalysisResult;
            }

            public final p10 a() {
                return this.f33173a;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof C0283b) && Intrinsics.f(this.f33173a, ((C0283b) obj2).f33173a);
            }

            public int hashCode() {
                return this.f33173a.hashCode();
            }

            public String toString() {
                return "Succeed(imageAnalysisResult=" + this.f33173a + ")";
            }
        }
    }

    Object a(a aVar, Continuation continuation);
}
