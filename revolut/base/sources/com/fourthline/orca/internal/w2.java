package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface w2 {

    public interface a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.w2$a$a, reason: collision with other inner class name */
        public static final class C0303a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final kh0 f34493a;

            public C0303a(kh0 error) {
                Intrinsics.checkNotNullParameter(error, "error");
                this.f34493a = error;
            }

            public final kh0 a() {
                return this.f34493a;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof C0303a) && Intrinsics.f(this.f34493a, ((C0303a) obj2).f34493a);
            }

            public int hashCode() {
                return this.f34493a.hashCode();
            }

            public String toString() {
                return "Invalid(error=" + this.f34493a + ")";
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f34494a = new b();

            private b() {
            }

            public boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof b);
            }

            public int hashCode() {
                return -1682397834;
            }

            public String toString() {
                return "Valid";
            }
        }
    }

    a a(a01 a01Var);
}
