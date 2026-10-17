package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface pl0 extends he1 {

    public interface a extends pl0, al0 {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.pl0$a$a, reason: collision with other inner class name */
        public static final class C0264a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0264a f31992a = new C0264a();

            private C0264a() {
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final ck0 f31993a;

            public b(ck0 flowAction) {
                Intrinsics.checkNotNullParameter(flowAction, "flowAction");
                this.f31993a = flowAction;
            }

            public final ck0 c() {
                return this.f31993a;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof b) && Intrinsics.f(this.f31993a, ((b) obj2).f31993a);
            }

            public int hashCode() {
                return this.f31993a.hashCode();
            }

            public String toString() {
                return "Forward(flowAction=" + this.f31993a + ")";
            }
        }
    }

    public static final class b implements pl0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f31994a = new b();

        private b() {
        }
    }
}
