package com.fourthline.orca.internal;

import com.fourthline.vision.selfie.SelfieScannerError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class ui0 extends kh0 {

    public static final class a extends ui0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f34101a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f34102b = 8;

        private a() {
            super("canceled", null, "canceled", 2, null);
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof a);
        }

        public int hashCode() {
            return -2034668105;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Canceled";
        }
    }

    public static final class b extends ui0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f34103a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f34104b = 8;

        private b() {
            super("not_same_person", null, "not_same_person", 2, null);
        }
    }

    public static final class c extends ui0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f34105a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f34106b = 8;

        private c() {
            super("permission_not_granted", null, "permission_not_granted", 2, null);
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof c);
        }

        public int hashCode() {
            return -1518661978;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Permissions";
        }
    }

    public static final class d extends ui0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final SelfieScannerError f34107a;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(SelfieScannerError scannerError) {
            Intrinsics.checkNotNullParameter(scannerError, "scannerError");
            Throwable th10 = null;
            super(vi0.b(scannerError), th10, vi0.b(scannerError), 2, null);
            this.f34107a = scannerError;
        }

        public final SelfieScannerError a() {
            return this.f34107a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof d) && this.f34107a == ((d) obj2).f34107a;
        }

        public int hashCode() {
            return this.f34107a.hashCode();
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "Scanner(scannerError=" + this.f34107a + ")";
        }
    }

    public /* synthetic */ ui0(String str, Throwable th10, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th10, str2);
    }

    private ui0(String str, Throwable th10, String str2) {
        super(str, th10, str2);
    }

    public /* synthetic */ ui0(String str, Throwable th10, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th10, (i & 4) != 0 ? "selfie_scanner_error" : str2, null);
    }
}
