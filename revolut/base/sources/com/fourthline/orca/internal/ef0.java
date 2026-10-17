package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface ef0 extends ge1 {

    public static final class a implements ef0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f28125a = new a();

        private a() {
        }
    }

    public static final class b implements ef0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ad0 f28126a;

        public b(ad0 capabilityResult) {
            Intrinsics.checkNotNullParameter(capabilityResult, "capabilityResult");
            this.f28126a = capabilityResult;
        }

        public final ad0 a() {
            return this.f28126a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f28126a, ((b) obj2).f28126a);
        }

        public int hashCode() {
            return this.f28126a.hashCode();
        }

        public String toString() {
            return "Success(capabilityResult=" + this.f28126a + ")";
        }
    }
}
