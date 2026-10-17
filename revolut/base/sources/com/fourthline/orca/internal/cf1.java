package com.fourthline.orca.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class cf1 extends kh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f27457a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f27458b = 8;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final d f27459c = new d("InvalidValidationCode");

    public static final class a extends cf1 {
        public static final a d = new a();
        public static final int e = 8;

        private a() {
            super(null, null, "canceled", 3, null);
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof a);
        }

        public int hashCode() {
            return -1530842592;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Canceled";
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d a() {
            return cf1.f27459c;
        }

        private b() {
        }
    }

    public static final class c extends cf1 {
        private final String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String message) {
            super(message, null, "configuration_not_supported", 2, null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.d = message;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && Intrinsics.f(this.d, ((c) obj2).d);
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.d;
        }

        public int hashCode() {
            return this.d.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "ConfigurationNotSupported(message=" + this.d + ")";
        }
    }

    public static final class d extends cf1 {
        private final String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String message) {
            super(message, null, "invalid_session", 2, null);
            Intrinsics.checkNotNullParameter(message, "message");
            this.d = message;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof d) && Intrinsics.f(this.d, ((d) obj2).d);
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.d;
        }

        public int hashCode() {
            return this.d.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "InvalidSession(message=" + this.d + ")";
        }
    }

    public static final class e extends cf1 {
        public static final e d = new e();
        public static final int e = 8;

        private e() {
            super(null, null, "invalid_workflow_status", 3, null);
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof e);
        }

        public int hashCode() {
            return 1178980417;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "InvalidWorkflowStatus";
        }
    }

    public static final class f extends cf1 {
        private final String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String moduleName) {
            super(null, null, "kyc_required", 3, null);
            Intrinsics.checkNotNullParameter(moduleName, "moduleName");
            this.d = moduleName;
        }

        public final String b() {
            return this.d;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof f) && Intrinsics.f(this.d, ((f) obj2).d);
        }

        public int hashCode() {
            return this.d.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "KycRequired(moduleName=" + this.d + ")";
        }
    }

    public static final class g extends cf1 {
        private final String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String moduleName) {
            super(null, null, "pending_verification", 3, null);
            Intrinsics.checkNotNullParameter(moduleName, "moduleName");
            this.d = moduleName;
        }

        public final String b() {
            return this.d;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof g) && Intrinsics.f(this.d, ((g) obj2).d);
        }

        public int hashCode() {
            return this.d.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "PendingVerification(moduleName=" + this.d + ")";
        }
    }

    public static final class h extends cf1 {
        public static final a f = new a(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f27460g = 8;
        private final String d;
        private final Throwable e;

        public static final class a {
            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final h a(String description, Throwable th10) {
                Intrinsics.checkNotNullParameter(description, "description");
                return new h(description, th10, null);
            }

            private a() {
            }

            public static /* synthetic */ h a(a aVar, String str, Throwable th10, int i, Object obj2) {
                if ((i & 2) != 0) {
                    th10 = null;
                }
                return aVar.a(str, th10);
            }
        }

        public /* synthetic */ h(String str, Throwable th10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, th10);
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.e;
        }

        @Override // java.lang.Throwable
        public String getMessage() {
            return this.d;
        }

        private h(String str, Throwable th10) {
            super(str, th10, "unexpected", null);
            this.d = str;
            this.e = th10;
        }
    }

    public /* synthetic */ cf1(String str, Throwable th10, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th10, str2);
    }

    private cf1(String str, Throwable th10, String str2) {
        super(str, th10, str2);
    }

    public /* synthetic */ cf1(String str, Throwable th10, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th10, str2, null);
    }
}
