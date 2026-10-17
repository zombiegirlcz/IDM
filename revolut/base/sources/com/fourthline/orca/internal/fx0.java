package com.fourthline.orca.internal;

import com.fourthline.core.location.Coordinate;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface fx0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f28687a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Coordinate f28688b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f28689c;

        public a(String signatureId, Coordinate location, String languageCode) {
            Intrinsics.checkNotNullParameter(signatureId, "signatureId");
            Intrinsics.checkNotNullParameter(location, "location");
            Intrinsics.checkNotNullParameter(languageCode, "languageCode");
            this.f28687a = signatureId;
            this.f28688b = location;
            this.f28689c = languageCode;
        }

        public final String a() {
            return this.f28689c;
        }

        public final Coordinate b() {
            return this.f28688b;
        }

        public final String c() {
            return this.f28687a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f28687a, aVar.f28687a) && Intrinsics.f(this.f28688b, aVar.f28688b) && Intrinsics.f(this.f28689c, aVar.f28689c);
        }

        public int hashCode() {
            return (((this.f28687a.hashCode() * 31) + this.f28688b.hashCode()) * 31) + this.f28689c.hashCode();
        }

        public String toString() {
            return "Input(signatureId=" + this.f28687a + ", location=" + this.f28688b + ", languageCode=" + this.f28689c + ")";
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f28690a = new a();

            private a() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof a);
            }

            public int hashCode() {
                return -1061262212;
            }

            public String toString() {
                return "KycRequired";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.fx0$b$b, reason: collision with other inner class name */
        public static final class C0200b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0200b f28691a = new C0200b();

            private C0200b() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof C0200b);
            }

            public int hashCode() {
                return 1273180278;
            }

            public String toString() {
                return "Rejected";
            }
        }

        public static final class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f28692a = new c();

            private c() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof c);
            }

            public int hashCode() {
                return -111140065;
            }

            public String toString() {
                return "SelfieRequired";
            }
        }

        public static final class d implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f28693a = new d();

            private d() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof d);
            }

            public int hashCode() {
                return 1604987798;
            }

            public String toString() {
                return "UserConsentRequired";
            }
        }
    }

    Object a(a aVar, Continuation continuation);
}
