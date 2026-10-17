package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface jo extends be1 {

    public static final class a implements jo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f29977a = new a();

        private a() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof a);
        }

        public int hashCode() {
            return 112100157;
        }

        public String toString() {
            return "OnBackButtonClicked";
        }
    }

    public static final class b implements jo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f29978a = new b();

        private b() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof b);
        }

        public int hashCode() {
            return -783054660;
        }

        public String toString() {
            return "OnCloseEnlargedButtonClicked";
        }
    }

    public static final class c implements jo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f29979a = new c();

        private c() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof c);
        }

        public int hashCode() {
            return -1500685234;
        }

        public String toString() {
            return "OnDismissClicked";
        }
    }

    public static final class d implements jo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Bitmap f29980a;

        public d(Bitmap image) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.f29980a = image;
        }

        public final Bitmap a() {
            return this.f29980a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof d) && Intrinsics.f(this.f29980a, ((d) obj2).f29980a);
        }

        public int hashCode() {
            return this.f29980a.hashCode();
        }

        public String toString() {
            return "OnEnlargedButtonClicked(image=" + this.f29980a + ")";
        }
    }

    public static final class e implements jo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f29981a = new e();

        private e() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof e);
        }

        public int hashCode() {
            return -592371426;
        }

        public String toString() {
            return "OnHintAnimationFinished";
        }
    }

    public static final class f implements jo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f29982a = new f();

        private f() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof f);
        }

        public int hashCode() {
            return -1531432783;
        }

        public String toString() {
            return "OnNextButtonClicked";
        }
    }

    public static final class g implements jo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map f29983a;

        public g(Map result) {
            Intrinsics.checkNotNullParameter(result, "result");
            this.f29983a = result;
        }

        public final Map a() {
            return this.f29983a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof g) && Intrinsics.f(this.f29983a, ((g) obj2).f29983a);
        }

        public int hashCode() {
            return this.f29983a.hashCode();
        }

        public String toString() {
            return "OnPermissionsRequestResult(result=" + this.f29983a + ")";
        }
    }

    public static final class h implements jo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f29984a;

        public h(boolean z) {
            this.f29984a = z;
        }

        public final boolean a() {
            return this.f29984a;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof h) && this.f29984a == ((h) obj2).f29984a;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f29984a);
        }

        public String toString() {
            return "OnScreenShown(allPermissionsGranted=" + this.f29984a + ")";
        }
    }

    public static final class i implements jo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final i f29985a = new i();

        private i() {
        }

        public boolean equals(Object obj2) {
            return this == obj2 || (obj2 instanceof i);
        }

        public int hashCode() {
            return 1219706571;
        }

        public String toString() {
            return "OnTakeSnapshotClicked";
        }
    }
}
