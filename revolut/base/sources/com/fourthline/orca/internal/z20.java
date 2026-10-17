package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface z20 {

    public static final class a implements z20 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final y20 f35504a;

        public a(y20 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f35504a = error;
        }

        public final y20 a() {
            return this.f35504a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f35504a, ((a) obj2).f35504a);
        }

        public int hashCode() {
            return this.f35504a.hashCode();
        }

        public String toString() {
            return "Invalid(error=" + this.f35504a + ")";
        }
    }

    public static final class b implements z20 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f35505a = new b();

        private b() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof b);
        }

        public int hashCode() {
            return -1508229512;
        }

        public String toString() {
            return "Valid";
        }
    }
}
