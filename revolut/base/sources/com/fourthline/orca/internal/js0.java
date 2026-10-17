package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface js0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f30022a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f30023b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f30024c;

        public a(String signatureId, String documentId, String documentName) {
            Intrinsics.checkNotNullParameter(signatureId, "signatureId");
            Intrinsics.checkNotNullParameter(documentId, "documentId");
            Intrinsics.checkNotNullParameter(documentName, "documentName");
            this.f30022a = signatureId;
            this.f30023b = documentId;
            this.f30024c = documentName;
        }

        public final String a() {
            return this.f30023b;
        }

        public final String b() {
            return this.f30024c;
        }

        public final String c() {
            return this.f30022a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f30022a, aVar.f30022a) && Intrinsics.f(this.f30023b, aVar.f30023b) && Intrinsics.f(this.f30024c, aVar.f30024c);
        }

        public int hashCode() {
            return (((this.f30022a.hashCode() * 31) + this.f30023b.hashCode()) * 31) + this.f30024c.hashCode();
        }

        public String toString() {
            return "Input(signatureId=" + this.f30022a + ", documentId=" + this.f30023b + ", documentName=" + this.f30024c + ")";
        }
    }

    Object a(a aVar, Continuation continuation);
}
