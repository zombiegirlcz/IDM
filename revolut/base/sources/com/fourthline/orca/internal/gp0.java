package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import java.net.URI;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface gp0 {

    public static final class a implements gp0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final URI f28961a;

        public a(URI uri2) {
            Intrinsics.checkNotNullParameter(uri2, "uri");
            this.f28961a = uri2;
        }

        public final URI a() {
            return this.f28961a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof a) && Intrinsics.f(this.f28961a, ((a) obj2).f28961a);
        }

        public int hashCode() {
            return this.f28961a.hashCode();
        }

        public String toString() {
            return "Document(uri=" + this.f28961a + ")";
        }
    }

    public static final class b implements gp0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bitmap f28962a;

        public b(Bitmap bitmap) {
            Intrinsics.checkNotNullParameter(bitmap, "bitmap");
            this.f28962a = bitmap;
        }

        public final Bitmap a() {
            return this.f28962a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f28962a, ((b) obj2).f28962a);
        }

        public int hashCode() {
            return this.f28962a.hashCode();
        }

        public String toString() {
            return "Image(bitmap=" + this.f28962a + ")";
        }
    }
}
