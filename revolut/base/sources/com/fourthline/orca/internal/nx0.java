package com.fourthline.orca.internal;

import com.fourthline.core.internal.ExtensionsKt;
import com.fourthline.orca.qes.internal.error.QesError;
import java.io.File;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface nx0 {

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f31509a = new a();

            private a() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof a);
            }

            public int hashCode() {
                return 872888026;
            }

            public String toString() {
                return "ConfirmationRequired";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.nx0$b$b, reason: collision with other inner class name */
        public static final class C0255b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final QesError.QtspInvalidSession f31510a;

            public C0255b(QesError.QtspInvalidSession error) {
                Intrinsics.checkNotNullParameter(error, "error");
                this.f31510a = error;
            }

            public final QesError.QtspInvalidSession a() {
                return this.f31510a;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof C0255b) && Intrinsics.f(this.f31510a, ((C0255b) obj2).f31510a);
            }

            public int hashCode() {
                return this.f31510a.hashCode();
            }

            public String toString() {
                return "QtspSessionError(error=" + this.f31510a + ")";
            }
        }

        public static final class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f31511a = new c();

            private c() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof c);
            }

            public int hashCode() {
                return -1788657059;
            }

            public String toString() {
                return "Success";
            }
        }

        public static final class d implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f31512a = new d();

            private d() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof d);
            }

            public int hashCode() {
                return 473096851;
            }

            public String toString() {
                return "TooManyAttempts";
            }
        }
    }

    Object a(a aVar, Continuation continuation);

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f31500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f31501b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f31502c;
        private final xg1 d;

        public static final class b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C0254a f31506c = new C0254a(null);

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f31507a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f31508b;

            /* JADX INFO: renamed from: com.fourthline.orca.internal.nx0$a$b$a, reason: collision with other inner class name */
            public static final class C0254a {
                public /* synthetic */ C0254a(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final b a(String documentId, String documentPath) {
                    Intrinsics.checkNotNullParameter(documentId, "documentId");
                    Intrinsics.checkNotNullParameter(documentPath, "documentPath");
                    return new b(documentId, ExtensionsKt.sha256(lim.m.d(new File(documentPath))));
                }

                private C0254a() {
                }
            }

            public b(String documentId, String documentHash) {
                Intrinsics.checkNotNullParameter(documentId, "documentId");
                Intrinsics.checkNotNullParameter(documentHash, "documentHash");
                this.f31507a = documentId;
                this.f31508b = documentHash;
            }

            public final String a() {
                return this.f31508b;
            }

            public final String b() {
                return this.f31507a;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof b)) {
                    return false;
                }
                b bVar = (b) obj2;
                return Intrinsics.f(this.f31507a, bVar.f31507a) && Intrinsics.f(this.f31508b, bVar.f31508b);
            }

            public int hashCode() {
                return (this.f31507a.hashCode() * 31) + this.f31508b.hashCode();
            }

            public String toString() {
                return "AuthorisedDocument(documentId=" + this.f31507a + ", documentHash=" + this.f31508b + ")";
            }
        }

        public a(String signatureId, List authorisedDocuments, List acceptedLegalDocuments, xg1 xg1Var) {
            Intrinsics.checkNotNullParameter(signatureId, "signatureId");
            Intrinsics.checkNotNullParameter(authorisedDocuments, "authorisedDocuments");
            Intrinsics.checkNotNullParameter(acceptedLegalDocuments, "acceptedLegalDocuments");
            this.f31500a = signatureId;
            this.f31501b = authorisedDocuments;
            this.f31502c = acceptedLegalDocuments;
            this.d = xg1Var;
        }

        public final List a() {
            return this.f31502c;
        }

        public final List b() {
            return this.f31501b;
        }

        public final xg1 c() {
            return this.d;
        }

        public final String d() {
            return this.f31500a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f31500a, aVar.f31500a) && Intrinsics.f(this.f31501b, aVar.f31501b) && Intrinsics.f(this.f31502c, aVar.f31502c) && Intrinsics.f(this.d, aVar.d);
        }

        public int hashCode() {
            int iHashCode = ((((this.f31500a.hashCode() * 31) + this.f31501b.hashCode()) * 31) + this.f31502c.hashCode()) * 31;
            xg1 xg1Var = this.d;
            return iHashCode + (xg1Var == null ? 0 : xg1Var.hashCode());
        }

        public String toString() {
            return "Input(signatureId=" + this.f31500a + ", authorisedDocuments=" + this.f31501b + ", acceptedLegalDocuments=" + this.f31502c + ", challengeData=" + this.d + ")";
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.nx0$a$a, reason: collision with other inner class name */
        public static final class C0253a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final String f31503a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f31504b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final int f31505c;
            private final String d;

            public C0253a(String id10, String str, int i, String str2) {
                Intrinsics.checkNotNullParameter(id10, "id");
                this.f31503a = id10;
                this.f31504b = str;
                this.f31505c = i;
                this.d = str2;
            }

            public final String a() {
                return this.d;
            }

            public final String b() {
                return this.f31503a;
            }

            public final String c() {
                return this.f31504b;
            }

            public final int d() {
                return this.f31505c;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C0253a)) {
                    return false;
                }
                C0253a c0253a = (C0253a) obj2;
                return Intrinsics.f(this.f31503a, c0253a.f31503a) && Intrinsics.f(this.f31504b, c0253a.f31504b) && this.f31505c == c0253a.f31505c && Intrinsics.f(this.d, c0253a.d);
            }

            public int hashCode() {
                int iHashCode = this.f31503a.hashCode() * 31;
                String str = this.f31504b;
                int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.f31505c)) * 31;
                String str2 = this.d;
                return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            }

            public String toString() {
                return "AcceptedLegalDocument(id=" + this.f31503a + ", url=" + this.f31504b + ", version=" + this.f31505c + ", displayName=" + this.d + ")";
            }

            public /* synthetic */ C0253a(String str, String str2, int i, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i2 & 2) != 0 ? null : str2, i, (i2 & 8) != 0 ? null : str3);
            }
        }
    }
}
