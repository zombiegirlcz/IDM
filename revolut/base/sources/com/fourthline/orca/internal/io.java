package com.fourthline.orca.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface io extends he1 {

    public interface a extends io, ee1 {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.io$a$a, reason: collision with other inner class name */
        public static final class C0218a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0218a f29649a = new C0218a();

            private C0218a() {
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f29650a = new b();

            private b() {
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final si f29651a;

            public c(si error) {
                Intrinsics.checkNotNullParameter(error, "error");
                this.f29651a = error;
            }

            public final si c() {
                return this.f29651a;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof c) && Intrinsics.f(this.f29651a, ((c) obj2).f29651a);
            }

            public int hashCode() {
                return this.f29651a.hashCode();
            }

            public String toString() {
                return "FinishWithError(error=" + this.f29651a + ")";
            }
        }

        public static final class d implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final ky f29652a;

            public d(ky flowAction) {
                Intrinsics.checkNotNullParameter(flowAction, "flowAction");
                this.f29652a = flowAction;
            }

            public final ky c() {
                return this.f29652a;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof d) && Intrinsics.f(this.f29652a, ((d) obj2).f29652a);
            }

            public int hashCode() {
                return this.f29652a.hashCode();
            }

            public String toString() {
                return "Forward(flowAction=" + this.f29652a + ")";
            }
        }

        public static final class e implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f29653a = new e();

            private e() {
            }
        }
    }

    public static final class b implements io {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f29654a = new b();

        private b() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof b);
        }

        public int hashCode() {
            return 45044044;
        }

        public String toString() {
            return "OpenSettings";
        }
    }

    public static final class c implements io {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f29655a;

        public c(List permissions) {
            Intrinsics.checkNotNullParameter(permissions, "permissions");
            this.f29655a = permissions;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && Intrinsics.f(this.f29655a, ((c) obj2).f29655a);
        }

        public int hashCode() {
            return this.f29655a.hashCode();
        }

        public String toString() {
            return "RequestPermissions(permissions=" + this.f29655a + ")";
        }
    }

    public static final class d implements io {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f29656a = new d();

        private d() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof d);
        }

        public int hashCode() {
            return 1753630032;
        }

        public String toString() {
            return "Vibrate";
        }
    }
}
