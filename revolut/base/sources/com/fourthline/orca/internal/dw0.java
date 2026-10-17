package com.fourthline.orca.internal;

import com.fourthline.orca.internal.cw0;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface dw0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f27933a;

        public a(String signatureId) {
            Intrinsics.checkNotNullParameter(signatureId, "signatureId");
            this.f27933a = signatureId;
        }

        public final String a() {
            return this.f27933a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f27933a, ((a) obj2).f27933a);
        }

        public int hashCode() {
            return this.f27933a.hashCode();
        }

        public String toString() {
            return "Input(signatureId=" + this.f27933a + ")";
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f27934a;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f27935a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final List f27936b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final List f27937c;
            private final List d;
            private final cw0.a.C0180a.c e;

            /* JADX INFO: renamed from: com.fourthline.orca.internal.dw0$b$a$a, reason: collision with other inner class name */
            public static final class C0188a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final String f27938a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final String f27939b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final String f27940c;
                private final String d;
                private final int e;

                public C0188a(String id10, String name, String filePath, String url2, int i) {
                    Intrinsics.checkNotNullParameter(id10, "id");
                    Intrinsics.checkNotNullParameter(name, "name");
                    Intrinsics.checkNotNullParameter(filePath, "filePath");
                    Intrinsics.checkNotNullParameter(url2, "url");
                    this.f27938a = id10;
                    this.f27939b = name;
                    this.f27940c = filePath;
                    this.d = url2;
                    this.e = i;
                }

                public String a() {
                    return this.f27940c;
                }

                public String b() {
                    return this.f27938a;
                }

                public String c() {
                    return this.f27939b;
                }

                public final String d() {
                    return this.d;
                }

                public final int e() {
                    return this.e;
                }

                public boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof C0188a)) {
                        return false;
                    }
                    C0188a c0188a = (C0188a) obj2;
                    return Intrinsics.f(this.f27938a, c0188a.f27938a) && Intrinsics.f(this.f27939b, c0188a.f27939b) && Intrinsics.f(this.f27940c, c0188a.f27940c) && Intrinsics.f(this.d, c0188a.d) && this.e == c0188a.e;
                }

                public int hashCode() {
                    return (((((((this.f27938a.hashCode() * 31) + this.f27939b.hashCode()) * 31) + this.f27940c.hashCode()) * 31) + this.d.hashCode()) * 31) + Integer.hashCode(this.e);
                }

                public String toString() {
                    return "LegalDocument(id=" + this.f27938a + ", name=" + this.f27939b + ", filePath=" + this.f27940c + ", url=" + this.d + ", version=" + this.e + ")";
                }
            }

            /* JADX INFO: renamed from: com.fourthline.orca.internal.dw0$b$a$b, reason: collision with other inner class name */
            public static final class C0189b {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final String f27941a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final String f27942b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final String f27943c;

                public C0189b(String id10, String name, String filePath) {
                    Intrinsics.checkNotNullParameter(id10, "id");
                    Intrinsics.checkNotNullParameter(name, "name");
                    Intrinsics.checkNotNullParameter(filePath, "filePath");
                    this.f27941a = id10;
                    this.f27942b = name;
                    this.f27943c = filePath;
                }

                public String a() {
                    return this.f27943c;
                }

                public String b() {
                    return this.f27941a;
                }

                public String c() {
                    return this.f27942b;
                }

                public boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof C0189b)) {
                        return false;
                    }
                    C0189b c0189b = (C0189b) obj2;
                    return Intrinsics.f(this.f27941a, c0189b.f27941a) && Intrinsics.f(this.f27942b, c0189b.f27942b) && Intrinsics.f(this.f27943c, c0189b.f27943c);
                }

                public int hashCode() {
                    return (((this.f27941a.hashCode() * 31) + this.f27942b.hashCode()) * 31) + this.f27943c.hashCode();
                }

                public String toString() {
                    return "SignDocument(id=" + this.f27941a + ", name=" + this.f27942b + ", filePath=" + this.f27943c + ")";
                }
            }

            public a(String maskedPhoneNumber, List signDocuments, List legalDocuments, List list, cw0.a.C0180a.c cVar) {
                Intrinsics.checkNotNullParameter(maskedPhoneNumber, "maskedPhoneNumber");
                Intrinsics.checkNotNullParameter(signDocuments, "signDocuments");
                Intrinsics.checkNotNullParameter(legalDocuments, "legalDocuments");
                this.f27935a = maskedPhoneNumber;
                this.f27936b = signDocuments;
                this.f27937c = legalDocuments;
                this.d = list;
                this.e = cVar;
            }

            public final List a() {
                return this.d;
            }

            public final List b() {
                return this.f27937c;
            }

            public final String c() {
                return this.f27935a;
            }

            public final cw0.a.C0180a.c d() {
                return this.e;
            }

            public final List e() {
                return this.f27936b;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof a)) {
                    return false;
                }
                a aVar = (a) obj2;
                return Intrinsics.f(this.f27935a, aVar.f27935a) && Intrinsics.f(this.f27936b, aVar.f27936b) && Intrinsics.f(this.f27937c, aVar.f27937c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
            }

            public int hashCode() {
                int iHashCode = ((((this.f27935a.hashCode() * 31) + this.f27936b.hashCode()) * 31) + this.f27937c.hashCode()) * 31;
                List list = this.d;
                int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
                cw0.a.C0180a.c cVar = this.e;
                return iHashCode2 + (cVar != null ? cVar.hashCode() : 0);
            }

            public String toString() {
                return "SignatureDetails(maskedPhoneNumber=" + this.f27935a + ", signDocuments=" + this.f27936b + ", legalDocuments=" + this.f27937c + ", clauses=" + this.d + ", otpSettings=" + this.e + ")";
            }
        }

        public b(a signatureDetails) {
            Intrinsics.checkNotNullParameter(signatureDetails, "signatureDetails");
            this.f27934a = signatureDetails;
        }

        public final a a() {
            return this.f27934a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f27934a, ((b) obj2).f27934a);
        }

        public int hashCode() {
            return this.f27934a.hashCode();
        }

        public String toString() {
            return "Output(signatureDetails=" + this.f27934a + ")";
        }
    }

    Object a(a aVar, Continuation continuation);
}
