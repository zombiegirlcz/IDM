package com.fourthline.orca.internal;

import com.fourthline.orca.kyc.internal.error.KycError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface jm0 extends he1 {

    public interface a extends jm0, cn0 {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.jm0$a$a, reason: collision with other inner class name */
        public static final class C0228a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0228a f29962a = new C0228a();

            private C0228a() {
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final KycError f29963a;

            public b(KycError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                this.f29963a = error;
            }

            public final KycError c() {
                return this.f29963a;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof b) && Intrinsics.f(this.f29963a, ((b) obj2).f29963a);
            }

            public int hashCode() {
                return this.f29963a.hashCode();
            }

            public String toString() {
                return "FinishWithError(error=" + this.f29963a + ")";
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f29964a = new c();

            private c() {
            }
        }
    }

    public static final class b implements jm0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f29965a = new b();

        private b() {
        }
    }

    public static final class c implements jm0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f29966a = new c();

        private c() {
        }
    }
}
