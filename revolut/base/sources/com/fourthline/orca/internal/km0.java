package com.fourthline.orca.internal;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface km0 extends be1 {

    public static final class a implements km0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30318a = new a();

        private a() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof a);
        }

        public int hashCode() {
            return -861340021;
        }

        public String toString() {
            return "OnBackButtonClicked";
        }
    }

    public static final class b implements km0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f30319a = new b();

        private b() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof b);
        }

        public int hashCode() {
            return -782922034;
        }

        public String toString() {
            return "OnDocumentNotSupportedClicked";
        }
    }

    public static final class c implements km0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f30320a;

        public c(Uri uri2) {
            this.f30320a = uri2;
        }

        public final Uri a() {
            return this.f30320a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && Intrinsics.f(this.f30320a, ((c) obj2).f30320a);
        }

        public int hashCode() {
            Uri uri2 = this.f30320a;
            if (uri2 == null) {
                return 0;
            }
            return uri2.hashCode();
        }

        public String toString() {
            return "OnDocumentPickerClosed(uri=" + this.f30320a + ")";
        }
    }

    public static final class d implements km0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Uri f30321a;

        public d(Uri uri2) {
            this.f30321a = uri2;
        }

        public final Uri a() {
            return this.f30321a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof d) && Intrinsics.f(this.f30321a, ((d) obj2).f30321a);
        }

        public int hashCode() {
            Uri uri2 = this.f30321a;
            if (uri2 == null) {
                return 0;
            }
            return uri2.hashCode();
        }

        public String toString() {
            return "OnImagePickerClosed(uri=" + this.f30321a + ")";
        }
    }

    public static final class e implements km0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f30322a = new e();

        private e() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof e);
        }

        public int hashCode() {
            return 1790094335;
        }

        public String toString() {
            return "OnNextButtonClicked";
        }
    }

    public static final class f implements km0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final uo0 f30323a;

        public f(uo0 documentType) {
            Intrinsics.checkNotNullParameter(documentType, "documentType");
            this.f30323a = documentType;
        }

        public final uo0 a() {
            return this.f30323a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof f) && this.f30323a == ((f) obj2).f30323a;
        }

        public int hashCode() {
            return this.f30323a.hashCode();
        }

        public String toString() {
            return "OnOptionClicked(documentType=" + this.f30323a + ")";
        }
    }

    public static final class g implements km0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f30324a = new g();

        private g() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof g);
        }

        public int hashCode() {
            return 487190882;
        }

        public String toString() {
            return "OnScreenShown";
        }
    }
}
