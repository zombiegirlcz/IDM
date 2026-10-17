package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import com.fourthline.vision.document.DocumentScannerStepResult;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface nc1 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f31385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f31386b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Bitmap f31387c;
        private final DocumentScannerStepResult d;

        public a(String documentId, String imageId, Bitmap image, DocumentScannerStepResult stepResult) {
            Intrinsics.checkNotNullParameter(documentId, "documentId");
            Intrinsics.checkNotNullParameter(imageId, "imageId");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(stepResult, "stepResult");
            this.f31385a = documentId;
            this.f31386b = imageId;
            this.f31387c = image;
            this.d = stepResult;
        }

        public final String a() {
            return this.f31385a;
        }

        public final Bitmap b() {
            return this.f31387c;
        }

        public final String c() {
            return this.f31386b;
        }

        public final DocumentScannerStepResult d() {
            return this.d;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f31385a, aVar.f31385a) && Intrinsics.f(this.f31386b, aVar.f31386b) && Intrinsics.f(this.f31387c, aVar.f31387c) && Intrinsics.f(this.d, aVar.d);
        }

        public int hashCode() {
            return (((((this.f31385a.hashCode() * 31) + this.f31386b.hashCode()) * 31) + this.f31387c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            return "Input(documentId=" + this.f31385a + ", imageId=" + this.f31386b + ", image=" + this.f31387c + ", stepResult=" + this.d + ")";
        }
    }

    Object a(a aVar, long j2, Continuation continuation);

    void a(a aVar);
}
