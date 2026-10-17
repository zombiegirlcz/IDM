package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface bw0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f27244a;

        public a(String signatureId) {
            Intrinsics.checkNotNullParameter(signatureId, "signatureId");
            this.f27244a = signatureId;
        }

        public final String a() {
            return this.f27244a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f27244a, ((a) obj2).f27244a);
        }

        public int hashCode() {
            return this.f27244a.hashCode();
        }

        public String toString() {
            return "Input(signatureId=" + this.f27244a + ")";
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f27245a = new a();

            private a() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof a);
            }

            public int hashCode() {
                return -1763433550;
            }

            public String toString() {
                return "DoAuthorizeAgain";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.bw0$b$b, reason: collision with other inner class name */
        public static final class C0173b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0173b f27246a = new C0173b();

            private C0173b() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof C0173b);
            }

            public int hashCode() {
                return 1387736818;
            }

            public String toString() {
                return "Succeed";
            }
        }

        public static final class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f27247a = new c();

            private c() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof c);
            }

            public int hashCode() {
                return 1152785129;
            }

            public String toString() {
                return "TooManyAttempts";
            }
        }
    }

    Object a(a aVar, Continuation continuation);
}
