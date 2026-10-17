package com.fourthline.orca.internal;

import com.fourthline.orca.internal.dw0;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface cw0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0180a f27567a;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.cw0$a$a, reason: collision with other inner class name */
        public static final class C0180a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f27568a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final List f27569b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final List f27570c;
            private final List d;
            private final c e;

            /* JADX INFO: renamed from: com.fourthline.orca.internal.cw0$a$a$a, reason: collision with other inner class name */
            public static final class C0181a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final String f27571a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final String f27572b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final int f27573c;

                public C0181a(String id10, String text, int i) {
                    Intrinsics.checkNotNullParameter(id10, "id");
                    Intrinsics.checkNotNullParameter(text, "text");
                    this.f27571a = id10;
                    this.f27572b = text;
                    this.f27573c = i;
                }

                public final String a() {
                    return this.f27571a;
                }

                public final String b() {
                    return this.f27572b;
                }

                public final int c() {
                    return this.f27573c;
                }

                public boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof C0181a)) {
                        return false;
                    }
                    C0181a c0181a = (C0181a) obj2;
                    return Intrinsics.f(this.f27571a, c0181a.f27571a) && Intrinsics.f(this.f27572b, c0181a.f27572b) && this.f27573c == c0181a.f27573c;
                }

                public int hashCode() {
                    return (((this.f27571a.hashCode() * 31) + this.f27572b.hashCode()) * 31) + Integer.hashCode(this.f27573c);
                }

                public String toString() {
                    return "Clauses(id=" + this.f27571a + ", text=" + this.f27572b + ", version=" + this.f27573c + ")";
                }
            }

            /* JADX INFO: renamed from: com.fourthline.orca.internal.cw0$a$a$b */
            public static final class b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final String f27574a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final String f27575b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final int f27576c;
                private final String d;

                public b(String id10, String displayName, int i, String url2) {
                    Intrinsics.checkNotNullParameter(id10, "id");
                    Intrinsics.checkNotNullParameter(displayName, "displayName");
                    Intrinsics.checkNotNullParameter(url2, "url");
                    this.f27574a = id10;
                    this.f27575b = displayName;
                    this.f27576c = i;
                    this.d = url2;
                }

                public final String a() {
                    return this.f27575b;
                }

                public final String b() {
                    return this.f27574a;
                }

                public final String c() {
                    return this.d;
                }

                public final int d() {
                    return this.f27576c;
                }

                public boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof b)) {
                        return false;
                    }
                    b bVar = (b) obj2;
                    return Intrinsics.f(this.f27574a, bVar.f27574a) && Intrinsics.f(this.f27575b, bVar.f27575b) && this.f27576c == bVar.f27576c && Intrinsics.f(this.d, bVar.d);
                }

                public int hashCode() {
                    return (((((this.f27574a.hashCode() * 31) + this.f27575b.hashCode()) * 31) + Integer.hashCode(this.f27576c)) * 31) + this.d.hashCode();
                }

                public String toString() {
                    return "LegalDocumentDetails(id=" + this.f27574a + ", displayName=" + this.f27575b + ", version=" + this.f27576c + ", url=" + this.d + ")";
                }
            }

            /* JADX INFO: renamed from: com.fourthline.orca.internal.cw0$a$a$c */
            public static final class c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final String f27577a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final int f27578b;

                public c(String validation, int i) {
                    Intrinsics.checkNotNullParameter(validation, "validation");
                    this.f27577a = validation;
                    this.f27578b = i;
                }

                public final int a() {
                    return this.f27578b;
                }

                public boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj2;
                    return Intrinsics.f(this.f27577a, cVar.f27577a) && this.f27578b == cVar.f27578b;
                }

                public int hashCode() {
                    return (this.f27577a.hashCode() * 31) + Integer.hashCode(this.f27578b);
                }

                public String toString() {
                    return "OtpSettings(validation=" + this.f27577a + ", length=" + this.f27578b + ")";
                }
            }

            /* JADX INFO: renamed from: com.fourthline.orca.internal.cw0$a$a$d */
            public static final class d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final String f27579a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final String f27580b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final String f27581c;

                public d(String id10, String fileName, String displayName) {
                    Intrinsics.checkNotNullParameter(id10, "id");
                    Intrinsics.checkNotNullParameter(fileName, "fileName");
                    Intrinsics.checkNotNullParameter(displayName, "displayName");
                    this.f27579a = id10;
                    this.f27580b = fileName;
                    this.f27581c = displayName;
                }

                public final String a() {
                    return this.f27581c;
                }

                public final String b() {
                    return this.f27580b;
                }

                public final String c() {
                    return this.f27579a;
                }

                public boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof d)) {
                        return false;
                    }
                    d dVar = (d) obj2;
                    return Intrinsics.f(this.f27579a, dVar.f27579a) && Intrinsics.f(this.f27580b, dVar.f27580b) && Intrinsics.f(this.f27581c, dVar.f27581c);
                }

                public int hashCode() {
                    return (((this.f27579a.hashCode() * 31) + this.f27580b.hashCode()) * 31) + this.f27581c.hashCode();
                }

                public String toString() {
                    return "SignDocumentDetails(id=" + this.f27579a + ", fileName=" + this.f27580b + ", displayName=" + this.f27581c + ")";
                }
            }

            public C0180a(String maskedPhoneNumber, List signDocuments, List legalDocuments, List list, c cVar) {
                Intrinsics.checkNotNullParameter(maskedPhoneNumber, "maskedPhoneNumber");
                Intrinsics.checkNotNullParameter(signDocuments, "signDocuments");
                Intrinsics.checkNotNullParameter(legalDocuments, "legalDocuments");
                this.f27568a = maskedPhoneNumber;
                this.f27569b = signDocuments;
                this.f27570c = legalDocuments;
                this.d = list;
                this.e = cVar;
            }

            public final List a() {
                return this.d;
            }

            public final List b() {
                return this.f27570c;
            }

            public final String c() {
                return this.f27568a;
            }

            public final c d() {
                return this.e;
            }

            public final List e() {
                return this.f27569b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C0180a)) {
                    return false;
                }
                C0180a c0180a = (C0180a) obj2;
                return Intrinsics.f(this.f27568a, c0180a.f27568a) && Intrinsics.f(this.f27569b, c0180a.f27569b) && Intrinsics.f(this.f27570c, c0180a.f27570c) && Intrinsics.f(this.d, c0180a.d) && Intrinsics.f(this.e, c0180a.e);
            }

            public int hashCode() {
                int iHashCode = ((((this.f27568a.hashCode() * 31) + this.f27569b.hashCode()) * 31) + this.f27570c.hashCode()) * 31;
                List list = this.d;
                int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
                c cVar = this.e;
                return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
            }

            public String toString() {
                return "SignatureDetails(maskedPhoneNumber=" + this.f27568a + ", signDocuments=" + this.f27569b + ", legalDocuments=" + this.f27570c + ", clauses=" + this.d + ", otpSettings=" + this.e + ")";
            }
        }

        public a(C0180a signatureDetails) {
            Intrinsics.checkNotNullParameter(signatureDetails, "signatureDetails");
            this.f27567a = signatureDetails;
        }

        public final C0180a a() {
            return this.f27567a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f27567a, ((a) obj2).f27567a);
        }

        public int hashCode() {
            return this.f27567a.hashCode();
        }

        public String toString() {
            return "Output(signatureDetails=" + this.f27567a + ")";
        }
    }

    Object a(dw0.a aVar, Continuation continuation);
}
