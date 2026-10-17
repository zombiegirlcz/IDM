package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface a21 extends be1 {

    public static final class a implements a21 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f26678a = new a();

        private a() {
        }
    }

    public static final class b implements a21 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f26679a = new b();

        private b() {
        }
    }

    public static final class c implements a21 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f26680a = new c();

        private c() {
        }
    }

    public static final class d implements a21 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bitmap f26681a;

        public d(Bitmap image) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.f26681a = image;
        }

        public final Bitmap a() {
            return this.f26681a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof d) && Intrinsics.f(this.f26681a, ((d) obj2).f26681a);
        }

        public int hashCode() {
            return this.f26681a.hashCode();
        }

        public String toString() {
            return "OnEnlargedButtonClicked(image=" + this.f26681a + ")";
        }
    }

    public static final class e implements a21 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f26682a = new e();

        private e() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof e);
        }

        public int hashCode() {
            return -502831408;
        }

        public String toString() {
            return "OnLivenessFaceDirectionAnimationFinishedPlaying";
        }
    }

    public static final class f implements a21 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f26683a = new f();

        private f() {
        }
    }

    public static final class g implements a21 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f26684a;

        public g(Map result) {
            Intrinsics.checkNotNullParameter(result, "result");
            this.f26684a = result;
        }

        public final Map a() {
            return this.f26684a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof g) && Intrinsics.f(this.f26684a, ((g) obj2).f26684a);
        }

        public int hashCode() {
            return this.f26684a.hashCode();
        }

        public String toString() {
            return "OnPermissionsRequestResult(result=" + this.f26684a + ")";
        }
    }

    public static final class h implements a21 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f26685a = new h();

        private h() {
        }
    }
}
