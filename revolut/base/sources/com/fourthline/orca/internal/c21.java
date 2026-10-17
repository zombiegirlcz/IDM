package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import com.fourthline.orca.internal.c81;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface c21 extends ie1 {

    public interface a extends c21 {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.c21$a$a, reason: collision with other inner class name */
        public static final class C0175a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final c81 f27311a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final c81 f27312b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Bitmap f27313c;
            private final c81 d;
            private final c81 e;
            private final c81 f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final c81 f27314g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final c81 f27315h;
            private final hw i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private final z10 f27316j;

            public C0175a(c81 title, c81 description, Bitmap image, c81 negativeButtonText, c81 checkpointOne, c81 checkpointTwo, c81 checkpointThree, c81 positiveButtonText, hw hwVar, z10 enlargeImageSource) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(description, "description");
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(negativeButtonText, "negativeButtonText");
                Intrinsics.checkNotNullParameter(checkpointOne, "checkpointOne");
                Intrinsics.checkNotNullParameter(checkpointTwo, "checkpointTwo");
                Intrinsics.checkNotNullParameter(checkpointThree, "checkpointThree");
                Intrinsics.checkNotNullParameter(positiveButtonText, "positiveButtonText");
                Intrinsics.checkNotNullParameter(enlargeImageSource, "enlargeImageSource");
                this.f27311a = title;
                this.f27312b = description;
                this.f27313c = image;
                this.d = negativeButtonText;
                this.e = checkpointOne;
                this.f = checkpointTwo;
                this.f27314g = checkpointThree;
                this.f27315h = positiveButtonText;
                this.i = hwVar;
                this.f27316j = enlargeImageSource;
            }

            public final C0175a a(c81 title, c81 description, Bitmap image, c81 negativeButtonText, c81 checkpointOne, c81 checkpointTwo, c81 checkpointThree, c81 positiveButtonText, hw hwVar, z10 enlargeImageSource) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(description, "description");
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(negativeButtonText, "negativeButtonText");
                Intrinsics.checkNotNullParameter(checkpointOne, "checkpointOne");
                Intrinsics.checkNotNullParameter(checkpointTwo, "checkpointTwo");
                Intrinsics.checkNotNullParameter(checkpointThree, "checkpointThree");
                Intrinsics.checkNotNullParameter(positiveButtonText, "positiveButtonText");
                Intrinsics.checkNotNullParameter(enlargeImageSource, "enlargeImageSource");
                return new C0175a(title, description, image, negativeButtonText, checkpointOne, checkpointTwo, checkpointThree, positiveButtonText, hwVar, enlargeImageSource);
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C0175a)) {
                    return false;
                }
                C0175a c0175a = (C0175a) obj2;
                return Intrinsics.f(this.f27311a, c0175a.f27311a) && Intrinsics.f(this.f27312b, c0175a.f27312b) && Intrinsics.f(this.f27313c, c0175a.f27313c) && Intrinsics.f(this.d, c0175a.d) && Intrinsics.f(this.e, c0175a.e) && Intrinsics.f(this.f, c0175a.f) && Intrinsics.f(this.f27314g, c0175a.f27314g) && Intrinsics.f(this.f27315h, c0175a.f27315h) && Intrinsics.f(this.i, c0175a.i) && Intrinsics.f(this.f27316j, c0175a.f27316j);
            }

            @Override // com.fourthline.orca.internal.c21
            public c81 getTitle() {
                return this.f27311a;
            }

            public int hashCode() {
                int iHashCode = ((((((((((((((this.f27311a.hashCode() * 31) + this.f27312b.hashCode()) * 31) + this.f27313c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.f27314g.hashCode()) * 31) + this.f27315h.hashCode()) * 31;
                hw hwVar = this.i;
                return ((iHashCode + (hwVar == null ? 0 : hwVar.hashCode())) * 31) + this.f27316j.hashCode();
            }

            public final c81 n() {
                return this.e;
            }

            public final c81 o() {
                return this.f27314g;
            }

            public final c81 p() {
                return this.f;
            }

            public final z10 q() {
                return this.f27316j;
            }

            public final hw r() {
                return this.i;
            }

            public final Bitmap s() {
                return this.f27313c;
            }

            public final c81 t() {
                return this.d;
            }

            public String toString() {
                return "ConfirmState(title=" + this.f27311a + ", description=" + this.f27312b + ", image=" + this.f27313c + ", negativeButtonText=" + this.d + ", checkpointOne=" + this.e + ", checkpointTwo=" + this.f + ", checkpointThree=" + this.f27314g + ", positiveButtonText=" + this.f27315h + ", enlarged=" + this.i + ", enlargeImageSource=" + this.f27316j + ")";
            }

            public final c81 u() {
                return this.f27315h;
            }

            public static /* synthetic */ C0175a a(C0175a c0175a, c81 c81Var, c81 c81Var2, Bitmap bitmap, c81 c81Var3, c81 c81Var4, c81 c81Var5, c81 c81Var6, c81 c81Var7, hw hwVar, z10 z10Var, int i, Object obj2) {
                if ((i & 1) != 0) {
                    c81Var = c0175a.f27311a;
                }
                if ((i & 2) != 0) {
                    c81Var2 = c0175a.f27312b;
                }
                if ((i & 4) != 0) {
                    bitmap = c0175a.f27313c;
                }
                if ((i & 8) != 0) {
                    c81Var3 = c0175a.d;
                }
                if ((i & 16) != 0) {
                    c81Var4 = c0175a.e;
                }
                if ((i & 32) != 0) {
                    c81Var5 = c0175a.f;
                }
                if ((i & 64) != 0) {
                    c81Var6 = c0175a.f27314g;
                }
                if ((i & 128) != 0) {
                    c81Var7 = c0175a.f27315h;
                }
                if ((i & 256) != 0) {
                    hwVar = c0175a.i;
                }
                if ((i & 512) != 0) {
                    z10Var = c0175a.f27316j;
                }
                hw hwVar2 = hwVar;
                z10 z10Var2 = z10Var;
                c81 c81Var8 = c81Var6;
                c81 c81Var9 = c81Var7;
                c81 c81Var10 = c81Var4;
                c81 c81Var11 = c81Var5;
                return c0175a.a(c81Var, c81Var2, bitmap, c81Var3, c81Var10, c81Var11, c81Var8, c81Var9, hwVar2, z10Var2);
            }

            public /* synthetic */ C0175a(c81 c81Var, c81 c81Var2, Bitmap bitmap, c81 c81Var3, c81 c81Var4, c81 c81Var5, c81 c81Var6, c81 c81Var7, hw hwVar, z10 z10Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this(c81Var, c81Var2, bitmap, c81Var3, c81Var4, c81Var5, c81Var6, c81Var7, (i & 256) != 0 ? null : hwVar, z10Var);
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final c81 f27317a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final c81 f27318b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final Bitmap f27319c;
            private final int d;
            private final p70 e;
            private final z10 f;

            public b(c81 title, c81 description, Bitmap image, int i, p70 loadingSpinnerLottieSource, z10 closeImageSource) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(description, "description");
                Intrinsics.checkNotNullParameter(image, "image");
                Intrinsics.checkNotNullParameter(loadingSpinnerLottieSource, "loadingSpinnerLottieSource");
                Intrinsics.checkNotNullParameter(closeImageSource, "closeImageSource");
                this.f27317a = title;
                this.f27318b = description;
                this.f27319c = image;
                this.d = i;
                this.e = loadingSpinnerLottieSource;
                this.f = closeImageSource;
            }

            public c81 a() {
                return this.f27318b;
            }

            public final z10 b() {
                return this.f;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof b)) {
                    return false;
                }
                b bVar = (b) obj2;
                return Intrinsics.f(this.f27317a, bVar.f27317a) && Intrinsics.f(this.f27318b, bVar.f27318b) && Intrinsics.f(this.f27319c, bVar.f27319c) && this.d == bVar.d && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f);
            }

            @Override // com.fourthline.orca.internal.c21
            public c81 getTitle() {
                return this.f27317a;
            }

            public int hashCode() {
                return (((((((((this.f27317a.hashCode() * 31) + this.f27318b.hashCode()) * 31) + this.f27319c.hashCode()) * 31) + Integer.hashCode(this.d)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
            }

            public final Bitmap n() {
                return this.f27319c;
            }

            public final int o() {
                return this.d;
            }

            public final p70 p() {
                return this.e;
            }

            public String toString() {
                return "UploadState(title=" + this.f27317a + ", description=" + this.f27318b + ", image=" + this.f27319c + ", imageRotationAngle=" + this.d + ", loadingSpinnerLottieSource=" + this.e + ", closeImageSource=" + this.f + ")";
            }
        }
    }

    c81 getTitle();

    public interface b extends c21 {

        public static final class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final c81 f27320a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final z00 f27321b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final le1 f27322c;
            private final z10 d;

            public a(c81 title, z00 graphic, le1 le1Var, z10 closeImageSource) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(graphic, "graphic");
                Intrinsics.checkNotNullParameter(closeImageSource, "closeImageSource");
                this.f27320a = title;
                this.f27321b = graphic;
                this.f27322c = le1Var;
                this.d = closeImageSource;
            }

            @Override // com.fourthline.orca.internal.c21.b
            public z10 b() {
                return this.d;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof a)) {
                    return false;
                }
                a aVar = (a) obj2;
                return Intrinsics.f(this.f27320a, aVar.f27320a) && Intrinsics.f(this.f27321b, aVar.f27321b) && Intrinsics.f(this.f27322c, aVar.f27322c) && Intrinsics.f(this.d, aVar.d);
            }

            @Override // com.fourthline.orca.internal.c21.b
            public le1 getMask() {
                return this.f27322c;
            }

            @Override // com.fourthline.orca.internal.c21
            public c81 getTitle() {
                return this.f27320a;
            }

            public int hashCode() {
                int iHashCode = ((this.f27320a.hashCode() * 31) + this.f27321b.hashCode()) * 31;
                le1 le1Var = this.f27322c;
                return ((iHashCode + (le1Var == null ? 0 : le1Var.hashCode())) * 31) + this.d.hashCode();
            }

            public final z00 n() {
                return this.f27321b;
            }

            public String toString() {
                return "HandMovementMode(title=" + this.f27320a + ", graphic=" + this.f27321b + ", mask=" + this.f27322c + ", closeImageSource=" + this.d + ")";
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.c21$b$b, reason: collision with other inner class name */
        public static final class C0176b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final c81 f27323a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final z00 f27324b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final le1 f27325c;
            private final z10 d;

            public C0176b(c81 title, z00 graphic, le1 le1Var, z10 closeImageSource) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(graphic, "graphic");
                Intrinsics.checkNotNullParameter(closeImageSource, "closeImageSource");
                this.f27323a = title;
                this.f27324b = graphic;
                this.f27325c = le1Var;
                this.d = closeImageSource;
            }

            @Override // com.fourthline.orca.internal.c21.b
            public z10 b() {
                return this.d;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C0176b)) {
                    return false;
                }
                C0176b c0176b = (C0176b) obj2;
                return Intrinsics.f(this.f27323a, c0176b.f27323a) && Intrinsics.f(this.f27324b, c0176b.f27324b) && Intrinsics.f(this.f27325c, c0176b.f27325c) && Intrinsics.f(this.d, c0176b.d);
            }

            @Override // com.fourthline.orca.internal.c21.b
            public le1 getMask() {
                return this.f27325c;
            }

            @Override // com.fourthline.orca.internal.c21
            public c81 getTitle() {
                return this.f27323a;
            }

            public int hashCode() {
                int iHashCode = ((this.f27323a.hashCode() * 31) + this.f27324b.hashCode()) * 31;
                le1 le1Var = this.f27325c;
                return ((iHashCode + (le1Var == null ? 0 : le1Var.hashCode())) * 31) + this.d.hashCode();
            }

            public final z00 n() {
                return this.f27324b;
            }

            public String toString() {
                return "LivenessMode(title=" + this.f27323a + ", graphic=" + this.f27324b + ", mask=" + this.f27325c + ", closeImageSource=" + this.d + ")";
            }
        }

        public interface c extends b {

            public static final class a implements c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final c81 f27326a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final le1 f27327b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final z10 f27328c;
                private final z10 d;
                private final z10 e;
                private final z10 f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private final Integer f27329g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private final Integer f27330h;
                private final Float i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private final Float f27331j;
                private final Pair k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private final p70 f27332l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                private final Pair f27333m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                private final z10 f27334n;

                public a(c81 title, le1 mask, z10 maskCircleImageSource, z10 baseGradesImageSource, z10 targetDirectionGradesImageSource, z10 currentDirectionGradesImageSource, Integer num, Integer num2, Float f, Float f4, Pair stepsProgress, p70 lottieSource, Pair pair, z10 closeImageSource) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(mask, "mask");
                    Intrinsics.checkNotNullParameter(maskCircleImageSource, "maskCircleImageSource");
                    Intrinsics.checkNotNullParameter(baseGradesImageSource, "baseGradesImageSource");
                    Intrinsics.checkNotNullParameter(targetDirectionGradesImageSource, "targetDirectionGradesImageSource");
                    Intrinsics.checkNotNullParameter(currentDirectionGradesImageSource, "currentDirectionGradesImageSource");
                    Intrinsics.checkNotNullParameter(stepsProgress, "stepsProgress");
                    Intrinsics.checkNotNullParameter(lottieSource, "lottieSource");
                    Intrinsics.checkNotNullParameter(closeImageSource, "closeImageSource");
                    this.f27326a = title;
                    this.f27327b = mask;
                    this.f27328c = maskCircleImageSource;
                    this.d = baseGradesImageSource;
                    this.e = targetDirectionGradesImageSource;
                    this.f = currentDirectionGradesImageSource;
                    this.f27329g = num;
                    this.f27330h = num2;
                    this.i = f;
                    this.f27331j = f4;
                    this.k = stepsProgress;
                    this.f27332l = lottieSource;
                    this.f27333m = pair;
                    this.f27334n = closeImageSource;
                }

                public final a a(c81 title, le1 mask, z10 maskCircleImageSource, z10 baseGradesImageSource, z10 targetDirectionGradesImageSource, z10 currentDirectionGradesImageSource, Integer num, Integer num2, Float f, Float f4, Pair stepsProgress, p70 lottieSource, Pair pair, z10 closeImageSource) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(mask, "mask");
                    Intrinsics.checkNotNullParameter(maskCircleImageSource, "maskCircleImageSource");
                    Intrinsics.checkNotNullParameter(baseGradesImageSource, "baseGradesImageSource");
                    Intrinsics.checkNotNullParameter(targetDirectionGradesImageSource, "targetDirectionGradesImageSource");
                    Intrinsics.checkNotNullParameter(currentDirectionGradesImageSource, "currentDirectionGradesImageSource");
                    Intrinsics.checkNotNullParameter(stepsProgress, "stepsProgress");
                    Intrinsics.checkNotNullParameter(lottieSource, "lottieSource");
                    Intrinsics.checkNotNullParameter(closeImageSource, "closeImageSource");
                    return new a(title, mask, maskCircleImageSource, baseGradesImageSource, targetDirectionGradesImageSource, currentDirectionGradesImageSource, num, num2, f, f4, stepsProgress, lottieSource, pair, closeImageSource);
                }

                @Override // com.fourthline.orca.internal.c21.b
                public z10 b() {
                    return this.f27334n;
                }

                public boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj2;
                    return Intrinsics.f(this.f27326a, aVar.f27326a) && Intrinsics.f(this.f27327b, aVar.f27327b) && Intrinsics.f(this.f27328c, aVar.f27328c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f27329g, aVar.f27329g) && Intrinsics.f(this.f27330h, aVar.f27330h) && Intrinsics.f(this.i, aVar.i) && Intrinsics.f(this.f27331j, aVar.f27331j) && Intrinsics.f(this.k, aVar.k) && Intrinsics.f(this.f27332l, aVar.f27332l) && Intrinsics.f(this.f27333m, aVar.f27333m) && Intrinsics.f(this.f27334n, aVar.f27334n);
                }

                @Override // com.fourthline.orca.internal.c21.b.c
                public z10 f() {
                    return this.e;
                }

                @Override // com.fourthline.orca.internal.c21.b.c
                public z10 g() {
                    return this.f;
                }

                @Override // com.fourthline.orca.internal.c21.b.c, com.fourthline.orca.internal.c21.b
                public le1 getMask() {
                    return this.f27327b;
                }

                @Override // com.fourthline.orca.internal.c21
                public c81 getTitle() {
                    return this.f27326a;
                }

                @Override // com.fourthline.orca.internal.c21.b.c
                public z10 h() {
                    return this.d;
                }

                public int hashCode() {
                    int iHashCode = ((((((((((this.f27326a.hashCode() * 31) + this.f27327b.hashCode()) * 31) + this.f27328c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31;
                    Integer num = this.f27329g;
                    int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
                    Integer num2 = this.f27330h;
                    int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
                    Float f = this.i;
                    int iHashCode4 = (iHashCode3 + (f == null ? 0 : f.hashCode())) * 31;
                    Float f4 = this.f27331j;
                    int iHashCode5 = (((((iHashCode4 + (f4 == null ? 0 : f4.hashCode())) * 31) + this.k.hashCode()) * 31) + this.f27332l.hashCode()) * 31;
                    Pair pair = this.f27333m;
                    return ((iHashCode5 + (pair != null ? pair.hashCode() : 0)) * 31) + this.f27334n.hashCode();
                }

                @Override // com.fourthline.orca.internal.c21.b.c
                public Integer j() {
                    return this.f27329g;
                }

                @Override // com.fourthline.orca.internal.c21.b.c
                public z10 k() {
                    return this.f27328c;
                }

                @Override // com.fourthline.orca.internal.c21.b.c
                public Integer l() {
                    return this.f27330h;
                }

                public final Pair n() {
                    return this.f27333m;
                }

                public final p70 o() {
                    return this.f27332l;
                }

                public final Float p() {
                    return this.f27331j;
                }

                public final Pair q() {
                    return this.k;
                }

                public final Float r() {
                    return this.i;
                }

                public String toString() {
                    return "Scanning(title=" + this.f27326a + ", mask=" + this.f27327b + ", maskCircleImageSource=" + this.f27328c + ", baseGradesImageSource=" + this.d + ", targetDirectionGradesImageSource=" + this.e + ", currentDirectionGradesImageSource=" + this.f + ", targetRotation=" + this.f27329g + ", currentRotation=" + this.f27330h + ", yaw=" + this.i + ", pitch=" + this.f27331j + ", stepsProgress=" + this.k + ", lottieSource=" + this.f27332l + ", lottieFrames=" + this.f27333m + ", closeImageSource=" + this.f27334n + ")";
                }

                public /* synthetic */ a(c81 c81Var, le1 le1Var, z10 z10Var, z10 z10Var2, z10 z10Var3, z10 z10Var4, Integer num, Integer num2, Float f, Float f4, Pair pair, p70 p70Var, Pair pair2, z10 z10Var5, int i, DefaultConstructorMarker defaultConstructorMarker) {
                    this(c81Var, le1Var, z10Var, z10Var2, z10Var3, z10Var4, num, (i & 128) != 0 ? null : num2, (i & 256) != 0 ? null : f, (i & 512) != 0 ? null : f4, pair, p70Var, (i & 4096) != 0 ? null : pair2, z10Var5);
                }
            }

            /* JADX INFO: renamed from: com.fourthline.orca.internal.c21$b$c$b, reason: collision with other inner class name */
            public static final class C0177b implements c {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final c81 f27335a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final le1 f27336b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private final z10 f27337c;
                private final z10 d;
                private final z10 e;
                private final z10 f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                private final Pair f27338g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                private final z10 f27339h;
                private final int i;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                private final z10 f27340j;
                private final int k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                private final int f27341l;

                public C0177b(c81 title, le1 mask, z10 maskCircleImageSource, z10 baseGradesImageSource, z10 targetDirectionGradesImageSource, z10 currentDirectionGradesImageSource, Pair pair, z10 z10Var, int i, z10 closeImageSource) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(mask, "mask");
                    Intrinsics.checkNotNullParameter(maskCircleImageSource, "maskCircleImageSource");
                    Intrinsics.checkNotNullParameter(baseGradesImageSource, "baseGradesImageSource");
                    Intrinsics.checkNotNullParameter(targetDirectionGradesImageSource, "targetDirectionGradesImageSource");
                    Intrinsics.checkNotNullParameter(currentDirectionGradesImageSource, "currentDirectionGradesImageSource");
                    Intrinsics.checkNotNullParameter(closeImageSource, "closeImageSource");
                    this.f27335a = title;
                    this.f27336b = mask;
                    this.f27337c = maskCircleImageSource;
                    this.d = baseGradesImageSource;
                    this.e = targetDirectionGradesImageSource;
                    this.f = currentDirectionGradesImageSource;
                    this.f27338g = pair;
                    this.f27339h = z10Var;
                    this.i = i;
                    this.f27340j = closeImageSource;
                    this.k = i;
                    this.f27341l = i;
                }

                @Override // com.fourthline.orca.internal.c21.b
                public z10 b() {
                    return this.f27340j;
                }

                public boolean equals(Object obj2) {
                    if (this == obj2) {
                        return true;
                    }
                    if (!(obj2 instanceof C0177b)) {
                        return false;
                    }
                    C0177b c0177b = (C0177b) obj2;
                    return Intrinsics.f(this.f27335a, c0177b.f27335a) && Intrinsics.f(this.f27336b, c0177b.f27336b) && Intrinsics.f(this.f27337c, c0177b.f27337c) && Intrinsics.f(this.d, c0177b.d) && Intrinsics.f(this.e, c0177b.e) && Intrinsics.f(this.f, c0177b.f) && Intrinsics.f(this.f27338g, c0177b.f27338g) && Intrinsics.f(this.f27339h, c0177b.f27339h) && this.i == c0177b.i && Intrinsics.f(this.f27340j, c0177b.f27340j);
                }

                @Override // com.fourthline.orca.internal.c21.b.c
                public z10 f() {
                    return this.e;
                }

                @Override // com.fourthline.orca.internal.c21.b.c
                public z10 g() {
                    return this.f;
                }

                @Override // com.fourthline.orca.internal.c21.b.c, com.fourthline.orca.internal.c21.b
                public le1 getMask() {
                    return this.f27336b;
                }

                @Override // com.fourthline.orca.internal.c21
                public c81 getTitle() {
                    return this.f27335a;
                }

                @Override // com.fourthline.orca.internal.c21.b.c
                public z10 h() {
                    return this.d;
                }

                public int hashCode() {
                    int iHashCode = ((((((((((this.f27335a.hashCode() * 31) + this.f27336b.hashCode()) * 31) + this.f27337c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31;
                    Pair pair = this.f27338g;
                    int iHashCode2 = (iHashCode + (pair == null ? 0 : pair.hashCode())) * 31;
                    z10 z10Var = this.f27339h;
                    return ((((iHashCode2 + (z10Var != null ? z10Var.hashCode() : 0)) * 31) + Integer.hashCode(this.i)) * 31) + this.f27340j.hashCode();
                }

                @Override // com.fourthline.orca.internal.c21.b.c
                public Integer j() {
                    return Integer.valueOf(this.k);
                }

                @Override // com.fourthline.orca.internal.c21.b.c
                public z10 k() {
                    return this.f27337c;
                }

                @Override // com.fourthline.orca.internal.c21.b.c
                public Integer l() {
                    return Integer.valueOf(this.f27341l);
                }

                public final Pair n() {
                    return this.f27338g;
                }

                public final z10 o() {
                    return this.f27339h;
                }

                public String toString() {
                    return "Success(title=" + this.f27335a + ", mask=" + this.f27336b + ", maskCircleImageSource=" + this.f27337c + ", baseGradesImageSource=" + this.d + ", targetDirectionGradesImageSource=" + this.e + ", currentDirectionGradesImageSource=" + this.f + ", stepsProgress=" + this.f27338g + ", successIcon=" + this.f27339h + ", successRotation=" + this.i + ", closeImageSource=" + this.f27340j + ")";
                }
            }

            z10 f();

            z10 g();

            @Override // com.fourthline.orca.internal.c21.b
            le1 getMask();

            z10 h();

            Integer j();

            z10 k();

            Integer l();
        }

        public static final class d implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final c81 f27342a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final le1 f27343b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final z10 f27344c;
            private final p70 d;

            public d(c81 title, le1 mask, z10 closeImageSource, p70 loadingSpinnerLottieSource) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(mask, "mask");
                Intrinsics.checkNotNullParameter(closeImageSource, "closeImageSource");
                Intrinsics.checkNotNullParameter(loadingSpinnerLottieSource, "loadingSpinnerLottieSource");
                this.f27342a = title;
                this.f27343b = mask;
                this.f27344c = closeImageSource;
                this.d = loadingSpinnerLottieSource;
            }

            public final d a(c81 title, le1 mask, z10 closeImageSource, p70 loadingSpinnerLottieSource) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(mask, "mask");
                Intrinsics.checkNotNullParameter(closeImageSource, "closeImageSource");
                Intrinsics.checkNotNullParameter(loadingSpinnerLottieSource, "loadingSpinnerLottieSource");
                return new d(title, mask, closeImageSource, loadingSpinnerLottieSource);
            }

            @Override // com.fourthline.orca.internal.c21.b
            public z10 b() {
                return this.f27344c;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof d)) {
                    return false;
                }
                d dVar = (d) obj2;
                return Intrinsics.f(this.f27342a, dVar.f27342a) && Intrinsics.f(this.f27343b, dVar.f27343b) && Intrinsics.f(this.f27344c, dVar.f27344c) && Intrinsics.f(this.d, dVar.d);
            }

            @Override // com.fourthline.orca.internal.c21.b
            public le1 getMask() {
                return this.f27343b;
            }

            @Override // com.fourthline.orca.internal.c21
            public c81 getTitle() {
                return this.f27342a;
            }

            public int hashCode() {
                return (((((this.f27342a.hashCode() * 31) + this.f27343b.hashCode()) * 31) + this.f27344c.hashCode()) * 31) + this.d.hashCode();
            }

            public final p70 n() {
                return this.d;
            }

            public String toString() {
                return "ScanningMode(title=" + this.f27342a + ", mask=" + this.f27343b + ", closeImageSource=" + this.f27344c + ", loadingSpinnerLottieSource=" + this.d + ")";
            }

            public static /* synthetic */ d a(d dVar, c81 c81Var, le1 le1Var, z10 z10Var, p70 p70Var, int i, Object obj2) {
                if ((i & 1) != 0) {
                    c81Var = dVar.f27342a;
                }
                if ((i & 2) != 0) {
                    le1Var = dVar.f27343b;
                }
                if ((i & 4) != 0) {
                    z10Var = dVar.f27344c;
                }
                if ((i & 8) != 0) {
                    p70Var = dVar.d;
                }
                return dVar.a(c81Var, le1Var, z10Var, p70Var);
            }
        }

        z10 b();

        le1 getMask();

        public static final class e implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final c81 f27345a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final le1 f27346b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final z10 f27347c;

            public e(c81 title, le1 le1Var, z10 closeImageSource) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(closeImageSource, "closeImageSource");
                this.f27345a = title;
                this.f27346b = le1Var;
                this.f27347c = closeImageSource;
            }

            @Override // com.fourthline.orca.internal.c21.b
            public z10 b() {
                return this.f27347c;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof e)) {
                    return false;
                }
                e eVar = (e) obj2;
                return Intrinsics.f(this.f27345a, eVar.f27345a) && Intrinsics.f(this.f27346b, eVar.f27346b) && Intrinsics.f(this.f27347c, eVar.f27347c);
            }

            @Override // com.fourthline.orca.internal.c21.b
            public le1 getMask() {
                return this.f27346b;
            }

            @Override // com.fourthline.orca.internal.c21
            public c81 getTitle() {
                return this.f27345a;
            }

            public int hashCode() {
                int iHashCode = this.f27345a.hashCode() * 31;
                le1 le1Var = this.f27346b;
                return ((iHashCode + (le1Var == null ? 0 : le1Var.hashCode())) * 31) + this.f27347c.hashCode();
            }

            public String toString() {
                return "Transition(title=" + this.f27345a + ", mask=" + this.f27346b + ", closeImageSource=" + this.f27347c + ")";
            }

            public /* synthetic */ e(c81 c81Var, le1 le1Var, z10 z10Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? c81.b.f27406b : c81Var, (i & 2) != 0 ? null : le1Var, z10Var);
            }
        }
    }
}
