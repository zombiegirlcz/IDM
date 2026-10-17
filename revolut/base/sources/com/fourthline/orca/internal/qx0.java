package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface qx0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f32554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f32555b;

        public a(String signatureId, String otp) {
            Intrinsics.checkNotNullParameter(signatureId, "signatureId");
            Intrinsics.checkNotNullParameter(otp, "otp");
            this.f32554a = signatureId;
            this.f32555b = otp;
        }

        public final String a() {
            return this.f32555b;
        }

        public final String b() {
            return this.f32554a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f32554a, aVar.f32554a) && Intrinsics.f(this.f32555b, aVar.f32555b);
        }

        public int hashCode() {
            return (this.f32554a.hashCode() * 31) + this.f32555b.hashCode();
        }

        public String toString() {
            return "Input(signatureId=" + this.f32554a + ", otp=" + this.f32555b + ")";
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f32556a = new a();

            private a() {
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.qx0$b$b, reason: collision with other inner class name */
        public static final class C0275b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0275b f32557a = new C0275b();

            private C0275b() {
            }
        }

        public static final class c implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f32558a = new c();

            private c() {
            }
        }
    }

    Object a(a aVar, Continuation continuation);
}
