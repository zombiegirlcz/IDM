package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface ne1 {

    public static final class a implements ne1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final p70 f31403a;

        public a(p70 lottieSource) {
            Intrinsics.checkNotNullParameter(lottieSource, "lottieSource");
            this.f31403a = lottieSource;
        }

        public final p70 a() {
            return this.f31403a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f31403a, ((a) obj2).f31403a);
        }

        public int hashCode() {
            return this.f31403a.hashCode();
        }

        public String toString() {
            return "Animation(lottieSource=" + this.f31403a + ")";
        }
    }

    public static final class b implements ne1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bitmap f31404a;

        public b(Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            this.f31404a = bitmap;
        }

        public final Bitmap a() {
            return this.f31404a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f31404a, ((b) obj2).f31404a);
        }

        public int hashCode() {
            return this.f31404a.hashCode();
        }

        public String toString() {
            return "Image(bitmap=" + this.f31404a + ")";
        }
    }
}
