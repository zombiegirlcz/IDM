package com.fourthline.orca.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes23.dex */
public abstract class g3 extends kh0 {

    public static final class a extends g3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f28736a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f28737b = 8;

        private a() {
            super("bav_iban_account_holder_mismatch", null, null, 6, null);
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof a);
        }

        public int hashCode() {
            return 404313736;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "AccountHolderNameMismatch";
        }
    }

    public static final class b extends g3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f28738a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f28739b = 8;

        private b() {
            super("bav_iban_country_not_supported", null, null, 6, null);
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof b);
        }

        public int hashCode() {
            return 916863649;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "IbanCountryNotSupported";
        }
    }

    public static final class c extends g3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f28740a = new c();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f28741b = 8;

        private c() {
            super("bav_iban_sepa_not_supported", null, null, 6, null);
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof c);
        }

        public int hashCode() {
            return 1686837166;
        }

        @Override // java.lang.Throwable
        public String toString() {
            return "IbanSepaNotSupported";
        }
    }

    public /* synthetic */ g3(String str, Throwable th10, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, th10, str2);
    }

    private g3(String str, Throwable th10, String str2) {
        super(str, th10, str2);
    }

    public /* synthetic */ g3(String str, Throwable th10, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : th10, (i & 4) != 0 ? "document_scanner_error" : str2, null);
    }
}
