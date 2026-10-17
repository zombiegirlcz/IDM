package com.fourthline.orca.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface df0 {

    public static final class b implements df0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p70 f27724a;

        public b(p70 lottieSource) {
            Intrinsics.checkNotNullParameter(lottieSource, "lottieSource");
            this.f27724a = lottieSource;
        }

        public final p70 a() {
            return this.f27724a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f27724a, ((b) obj2).f27724a);
        }

        public int hashCode() {
            return this.f27724a.hashCode();
        }

        public String toString() {
            return "Lottie(lottieSource=" + this.f27724a + ")";
        }
    }

    public static final class a implements df0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0185a f27721c = new C0185a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f27722a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f27723b;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.df0$a$a, reason: collision with other inner class name */
        public static final class C0185a {
            public /* synthetic */ C0185a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C0185a() {
            }
        }

        public a(int i, int i2) {
            this.f27722a = i;
            this.f27723b = i2;
        }

        public final int a() {
            return this.f27723b;
        }

        public final int b() {
            return this.f27722a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return this.f27722a == aVar.f27722a && this.f27723b == aVar.f27723b;
        }

        public int hashCode() {
            return (Integer.hashCode(this.f27722a) * 31) + Integer.hashCode(this.f27723b);
        }

        public String toString() {
            return "Animation(progressItems=" + this.f27722a + ", currentPosition=" + this.f27723b + ")";
        }

        public /* synthetic */ a(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 10 : i, (i3 & 2) != 0 ? 0 : i2);
        }
    }
}
