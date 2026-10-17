package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface kx0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f30438a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Bitmap f30439b;

        public a(String signatureId, Bitmap selfie) {
            Intrinsics.checkNotNullParameter(signatureId, "signatureId");
            Intrinsics.checkNotNullParameter(selfie, "selfie");
            this.f30438a = signatureId;
            this.f30439b = selfie;
        }

        public final Bitmap a() {
            return this.f30439b;
        }

        public final String b() {
            return this.f30438a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f30438a, aVar.f30438a) && Intrinsics.f(this.f30439b, aVar.f30439b);
        }

        public int hashCode() {
            return (this.f30438a.hashCode() * 31) + this.f30439b.hashCode();
        }

        public String toString() {
            return "Input(signatureId=" + this.f30438a + ", selfie=" + this.f30439b + ")";
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f30440a = new a();

            private a() {
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.kx0$b$b, reason: collision with other inner class name */
        public static final class C0240b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0240b f30441a = new C0240b();

            private C0240b() {
            }
        }
    }

    Object a(a aVar, Continuation continuation);
}
