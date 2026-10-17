package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface xp0 {

    public static final class a implements xp0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f35072a = new a();

        private a() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof a);
        }

        public int hashCode() {
            return -200614319;
        }

        public String toString() {
            return "Hide";
        }
    }

    public static final class b implements xp0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final zp0 f35073a;

        public b(zp0 state) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.f35073a = state;
        }

        public final zp0 a() {
            return this.f35073a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f35073a, ((b) obj2).f35073a);
        }

        public int hashCode() {
            return this.f35073a.hashCode();
        }

        public String toString() {
            return "Show(state=" + this.f35073a + ")";
        }
    }
}
