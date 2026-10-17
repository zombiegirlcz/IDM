package com.fourthline.orca.internal;

import com.fourthline.vision.document.DocumentScannerError;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class si extends kh0 {

    public static final class a extends si {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final er f33017a;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(er documentValidationError) {
            Intrinsics.checkNotNullParameter(documentValidationError, "documentValidationError");
            Throwable th10 = null;
            super(documentValidationError.getAlias(), th10, documentValidationError.getAlias(), 2, null);
            this.f33017a = documentValidationError;
        }

        public final er a() {
            return this.f33017a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f33017a, ((a) obj2).f33017a);
        }

        public int hashCode() {
            return this.f33017a.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Analysis(documentValidationError=" + this.f33017a + ")";
        }
    }

    public static final class b extends si {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f33018a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f33019b = 8;

        private b() {
            super("The aggregated analysis of the document took too long.", null, "document_analysis_timeout", 2, null);
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof b);
        }

        public int hashCode() {
            return 1555438672;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "AnalysisTimeout";
        }
    }

    public static final class c extends si {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f33020a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f33021b = 8;

        private c() {
            super("canceled", null, "canceled", 2, null);
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof c);
        }

        public int hashCode() {
            return 269311374;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Canceled";
        }
    }

    public static final class d extends si {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f33022a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List permissions) {
            super("permission_not_granted", null, null, 6, null);
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            this.f33022a = permissions;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof d) && Intrinsics.f(this.f33022a, ((d) obj2).f33022a);
        }

        public int hashCode() {
            return this.f33022a.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Permissions(permissions=" + this.f33022a + ")";
        }
    }

    public static final class e extends si {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final er f33023a;

        /* JADX WARN: Illegal instructions before constructor call */
        public e(er documentValidationError) {
            Intrinsics.checkNotNullParameter(documentValidationError, "documentValidationError");
            Throwable th10 = null;
            super(documentValidationError.getAlias(), th10, documentValidationError.getAlias(), 2, null);
            this.f33023a = documentValidationError;
        }

        public final er a() {
            return this.f33023a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof e) && Intrinsics.f(this.f33023a, ((e) obj2).f33023a);
        }

        public int hashCode() {
            return this.f33023a.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "PostProcessing(documentValidationError=" + this.f33023a + ")";
        }
    }

    public static final class f extends si {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final DocumentScannerError f33024a;

        /* JADX WARN: Illegal instructions before constructor call */
        public f(DocumentScannerError scannerError) {
            Intrinsics.checkNotNullParameter(scannerError, "scannerError");
            Throwable th10 = null;
            super(ti.b(scannerError), th10, ti.b(scannerError), 2, null);
            this.f33024a = scannerError;
        }

        public final DocumentScannerError a() {
            return this.f33024a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof f) && this.f33024a == ((f) obj2).f33024a;
        }

        public int hashCode() {
            return this.f33024a.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Scanner(scannerError=" + this.f33024a + ")";
        }
    }

    public static final class g extends si {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f33025c = new a(null);
        public static final int d = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f33026a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Throwable f33027b;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final g a(String description, Throwable th10) {
                Intrinsics.checkNotNullParameter(description, "description");
                return new g(description, th10, null);
            }

            private a() {
            }

            public static /* synthetic */ g a(a aVar, String str, Throwable th10, int i, Object obj2) {
                if ((i & 2) != 0) {
                    th10 = null;
                }
                return aVar.a(str, th10);
            }
        }

        public /* synthetic */ g(String str, Throwable th10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, th10);
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.f33027b;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.f33026a;
        }

        private g(String str, Throwable th10) {
            super(str, th10, null, 4, null);
            this.f33026a = str;
            this.f33027b = th10;
        }
    }

    public /* synthetic */ si(String str, Throwable th10, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th10, str2);
    }

    private si(String str, Throwable th10, String str2) {
        super(str, th10, str2);
    }

    public /* synthetic */ si(String str, Throwable th10, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th10, (i & 4) != 0 ? "document_scanner_error" : str2, null);
    }
}
