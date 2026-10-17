package com.fourthline.orca.internal;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface b {

    public static final class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final z10 f26946a;

        public a(z10 source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f26946a = source;
        }

        public final z10 a() {
            return this.f26946a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f26946a, ((a) obj2).f26946a);
        }

        public int hashCode() {
            return this.f26946a.hashCode();
        }

        public String toString() {
            return "Image(source=" + this.f26946a + ")";
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.b$b, reason: collision with other inner class name */
    public static final class C0166b implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p70 f26947a;

        public C0166b(p70 source) {
            Intrinsics.checkNotNullParameter(source, "source");
            this.f26947a = source;
        }

        public final p70 a() {
            return this.f26947a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof C0166b) && Intrinsics.f(this.f26947a, ((C0166b) obj2).f26947a);
        }

        public int hashCode() {
            return this.f26947a.hashCode();
        }

        public String toString() {
            return "Lottie(source=" + this.f26947a + ")";
        }
    }
}
