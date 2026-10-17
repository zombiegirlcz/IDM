package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface me0 extends be1 {

    public static final class a implements me0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31167a = new a();

        private a() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof a);
        }

        public int hashCode() {
            return -497204222;
        }

        public String toString() {
            return "OnBackButtonClicked";
        }
    }

    public static final class b implements me0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f31168a = new b();

        private b() {
        }
    }

    public static final class c implements me0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f31169a = new c();

        private c() {
        }
    }

    public static final class d implements me0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f31170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f31171b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f31172c;

        public d(String source, int i, int i2) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f31170a = source;
            this.f31171b = i;
            this.f31172c = i2;
        }

        public final int a() {
            return this.f31171b;
        }

        public final String b() {
            return this.f31170a;
        }

        public final int c() {
            return this.f31172c;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.f31170a, dVar.f31170a) && this.f31171b == dVar.f31171b && this.f31172c == dVar.f31172c;
        }

        public int hashCode() {
            return (((this.f31170a.hashCode() * 31) + Integer.hashCode(this.f31171b)) * 31) + Integer.hashCode(this.f31172c);
        }

        public String toString() {
            return "OnInstructionViewed(source=" + this.f31170a + ", currentPage=" + this.f31171b + ", totalPages=" + this.f31172c + ")";
        }
    }

    public static final class e implements me0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f31173a = new e();

        private e() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof e);
        }

        public int hashCode() {
            return -1568017404;
        }

        public String toString() {
            return "OnInstructionsButtonClicked";
        }
    }

    public static final class f implements me0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f31174a = new f();

        private f() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof f);
        }

        public int hashCode() {
            return -2140737162;
        }

        public String toString() {
            return "OnNextButtonClicked";
        }
    }

    public static final class g implements me0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f31175a = new g();

        private g() {
        }
    }

    public static final class h implements me0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f31176a = new h();

        private h() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof h);
        }

        public int hashCode() {
            return -1848567190;
        }

        public String toString() {
            return "OnSkipButtonClicked";
        }
    }
}
