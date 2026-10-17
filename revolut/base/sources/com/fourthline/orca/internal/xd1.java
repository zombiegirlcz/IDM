package com.fourthline.orca.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface xd1 {

    public static final class a implements xd1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ky f34955a;

        public a(ky flowAction) {
            Intrinsics.checkNotNullParameter(flowAction, "flowAction");
            this.f34955a = flowAction;
        }

        public final ky a() {
            return this.f34955a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f34955a, ((a) obj2).f34955a);
        }

        public int hashCode() {
            return this.f34955a.hashCode();
        }

        public String toString() {
            return "Completed(flowAction=" + this.f34955a + ")";
        }
    }

    public static final class b implements xd1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final kh0 f34956a;

        public b(kh0 error) {
            Intrinsics.checkNotNullParameter(error, "error");
            this.f34956a = error;
        }

        public final kh0 a() {
            return this.f34956a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f34956a, ((b) obj2).f34956a);
        }

        public int hashCode() {
            return this.f34956a.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.f34956a + ")";
        }
    }

    public static final class c implements xd1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f34957a;

        public c(int i) {
            this.f34957a = i;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof c) && this.f34957a == ((c) obj2).f34957a;
        }

        public int hashCode() {
            return Integer.hashCode(this.f34957a);
        }

        public String toString() {
            return "Running(progress=" + this.f34957a + ")";
        }

        public /* synthetic */ c(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? -1 : i);
        }
    }

    public static final class d implements xd1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f34958a = new d();

        private d() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof d);
        }

        public int hashCode() {
            return -799290734;
        }

        public String toString() {
            return "Started";
        }
    }
}
