package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface le0 extends he1 {

    public interface a extends le0, ee1 {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.le0$a$a, reason: collision with other inner class name */
        public static final class C0241a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0241a f30592a = new C0241a();

            private C0241a() {
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f30593a = new b();

            private b() {
            }
        }

        public static final class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final ld0 f30594a;

            public c(ld0 flowAction) {
                Intrinsics.checkNotNullParameter(flowAction, "flowAction");
                this.f30594a = flowAction;
            }

            public final ld0 c() {
                return this.f30594a;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof c) && Intrinsics.f(this.f30594a, ((c) obj2).f30594a);
            }

            public int hashCode() {
                return this.f30594a.hashCode();
            }

            public String toString() {
                return "Skip(flowAction=" + this.f30594a + ")";
            }
        }
    }

    public static final class b implements le0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f30595a = new b();

        private b() {
        }
    }
}
