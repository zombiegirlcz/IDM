package com.fourthline.orca.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public abstract class er extends kh0 {

    public static final class a extends er {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f28230a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f28231b = 8;

        private a() {
            super("document_expired", null);
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof a);
        }

        public int hashCode() {
            return -367181138;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "DocumentExpired";
        }
    }

    public static final class b extends er {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f28232a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f28233b = 8;

        private b() {
            super("document_side_not_matching", null);
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof b);
        }

        public int hashCode() {
            return 984877121;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "DocumentFileSideNotCorrect";
        }
    }

    public static final class c extends er {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f28234a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f28235b = 8;

        private c() {
            super("document_not_detected", null);
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof c);
        }

        public int hashCode() {
            return -1671409282;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "DocumentNotDetected";
        }
    }

    public static final class d extends er {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f28236a = new d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f28237b = 8;

        private d() {
            super("document_type_not_matching", null);
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof d);
        }

        public int hashCode() {
            return 1339481407;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "DocumentTypeMismatch";
        }
    }

    public static final class e extends er {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f28238a = new e();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f28239b = 8;

        private e() {
            super("document_type_not_supported", null);
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof e);
        }

        public int hashCode() {
            return 1841426956;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "DocumentTypeNotSupported";
        }
    }

    public static final class f extends er {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f28240a = new f();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f28241b = 8;

        private f() {
            super("issuing_country_not_matching", null);
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof f);
        }

        public int hashCode() {
            return -1661650006;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "IssuingCountryMismatch";
        }
    }

    public static final class g extends er {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f28242a = new g();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f28243b = 8;

        private g() {
            super("issuing_country_not_supported", null);
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof g);
        }

        public int hashCode() {
            return 778380023;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "IssuingCountryNotSupported";
        }
    }

    public static final class h extends er {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f28244a = new h();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f28245b = 8;

        private h() {
            super("document_country_and_type_not_detected", null);
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof h);
        }

        public int hashCode() {
            return -1141005183;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "IssuingCountryOrDocumentTypeNotDetected";
        }
    }

    public static final class i extends er {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f28246a = new i();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f28247b = 8;

        private i() {
            super("nationality_not_supported", null);
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof i);
        }

        public int hashCode() {
            return -1742605285;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "NationalityNotSupported";
        }
    }

    public static final class j extends er {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f28248a = new j();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f28249b = 8;

        private j() {
            super("person_underage", null);
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof j);
        }

        public int hashCode() {
            return 2043690872;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "PersonNotAdult";
        }
    }

    public /* synthetic */ er(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    private er(String str) {
        super(null, null, str);
    }
}
