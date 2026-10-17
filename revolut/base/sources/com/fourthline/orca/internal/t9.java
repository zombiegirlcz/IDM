package com.fourthline.orca.internal;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface t9 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f33256a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f33257b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f33258c;

        public a(String alias, String url2, String destination) {
            Intrinsics.checkNotNullParameter(alias, "alias");
            Intrinsics.checkNotNullParameter(url2, "url");
            Intrinsics.checkNotNullParameter(destination, "destination");
            this.f33256a = alias;
            this.f33257b = url2;
            this.f33258c = destination;
        }

        public final String a() {
            return this.f33256a;
        }

        public final String b() {
            return this.f33258c;
        }

        public final String c() {
            return this.f33257b;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f33256a, aVar.f33256a) && Intrinsics.f(this.f33257b, aVar.f33257b) && Intrinsics.f(this.f33258c, aVar.f33258c);
        }

        public int hashCode() {
            return (((this.f33256a.hashCode() * 31) + this.f33257b.hashCode()) * 31) + this.f33258c.hashCode();
        }

        public String toString() {
            return "Input(alias=" + this.f33256a + ", url=" + this.f33257b + ", destination=" + this.f33258c + ")";
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final boolean f33259a;

            public a(boolean z) {
                this.f33259a = z;
            }

            public final boolean a() {
                return this.f33259a;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof a) && this.f33259a == ((a) obj2).f33259a;
            }

            public int hashCode() {
                return Boolean.hashCode(this.f33259a);
            }

            public String toString() {
                return "Succeed(skipped=" + this.f33259a + ")";
            }
        }
    }

    Object a(a aVar, Continuation continuation);
}
