package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public interface lo extends ie1 {

    public static final class a implements hq0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30691a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String f30692b = "document_scanner";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final String f30693c = "document_ready";

        private a() {
        }

        @Override // com.fourthline.orca.internal.hq0
        public String a() {
            return f30692b;
        }

        @Override // com.fourthline.orca.internal.hq0
        public String getName() {
            return f30693c;
        }
    }

    public static final class b implements lo {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f30694a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c81 f30695b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final c81 f30696c;
        private final Bitmap d;
        private final c81 e;
        private final c81 f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final c81 f30697g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final c81 f30698h;
        private final c81 i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final boolean f30699j;
        private final boolean k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final z10 f30700l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final hw f30701m;

        public b(List stepResults, c81 title, c81 description, Bitmap image, c81 checkpointOne, c81 checkpointTwo, c81 c81Var, c81 negativeButtonText, c81 positiveButtonText, boolean z, boolean z3, z10 enlargeImageSource, hw hwVar) {
            Intrinsics.checkNotNullParameter(stepResults, "stepResults");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(checkpointOne, "checkpointOne");
            Intrinsics.checkNotNullParameter(checkpointTwo, "checkpointTwo");
            Intrinsics.checkNotNullParameter(negativeButtonText, "negativeButtonText");
            Intrinsics.checkNotNullParameter(positiveButtonText, "positiveButtonText");
            Intrinsics.checkNotNullParameter(enlargeImageSource, "enlargeImageSource");
            this.f30694a = stepResults;
            this.f30695b = title;
            this.f30696c = description;
            this.d = image;
            this.e = checkpointOne;
            this.f = checkpointTwo;
            this.f30697g = c81Var;
            this.f30698h = negativeButtonText;
            this.i = positiveButtonText;
            this.f30699j = z;
            this.k = z3;
            this.f30700l = enlargeImageSource;
            this.f30701m = hwVar;
        }

        public final b a(List stepResults, c81 title, c81 description, Bitmap image, c81 checkpointOne, c81 checkpointTwo, c81 c81Var, c81 negativeButtonText, c81 positiveButtonText, boolean z, boolean z3, z10 enlargeImageSource, hw hwVar) {
            Intrinsics.checkNotNullParameter(stepResults, "stepResults");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(checkpointOne, "checkpointOne");
            Intrinsics.checkNotNullParameter(checkpointTwo, "checkpointTwo");
            Intrinsics.checkNotNullParameter(negativeButtonText, "negativeButtonText");
            Intrinsics.checkNotNullParameter(positiveButtonText, "positiveButtonText");
            Intrinsics.checkNotNullParameter(enlargeImageSource, "enlargeImageSource");
            return new b(stepResults, title, description, image, checkpointOne, checkpointTwo, c81Var, negativeButtonText, positiveButtonText, z, z3, enlargeImageSource, hwVar);
        }

        @Override // com.fourthline.orca.internal.lo
        public boolean e() {
            return this.k;
        }

        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.f30694a, bVar.f30694a) && Intrinsics.f(this.f30695b, bVar.f30695b) && Intrinsics.f(this.f30696c, bVar.f30696c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f30697g, bVar.f30697g) && Intrinsics.f(this.f30698h, bVar.f30698h) && Intrinsics.f(this.i, bVar.i) && this.f30699j == bVar.f30699j && this.k == bVar.k && Intrinsics.f(this.f30700l, bVar.f30700l) && Intrinsics.f(this.f30701m, bVar.f30701m);
        }

        @Override // com.fourthline.orca.internal.lo
        public c81 getTitle() {
            return this.f30695b;
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.f30694a.hashCode() * 31) + this.f30695b.hashCode()) * 31) + this.f30696c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31;
            c81 c81Var = this.f30697g;
            int iHashCode2 = (((((((((((iHashCode + (c81Var == null ? 0 : c81Var.hashCode())) * 31) + this.f30698h.hashCode()) * 31) + this.i.hashCode()) * 31) + Boolean.hashCode(this.f30699j)) * 31) + Boolean.hashCode(this.k)) * 31) + this.f30700l.hashCode()) * 31;
            hw hwVar = this.f30701m;
            return iHashCode2 + (hwVar != null ? hwVar.hashCode() : 0);
        }

        public final c81 n() {
            return this.e;
        }

        public final c81 o() {
            return this.f30697g;
        }

        public final c81 p() {
            return this.f;
        }

        public final z10 q() {
            return this.f30700l;
        }

        public final hw r() {
            return this.f30701m;
        }

        public final Bitmap s() {
            return this.d;
        }

        public final c81 t() {
            return this.f30698h;
        }

        public String toString() {
            return "ResultState(stepResults=" + this.f30694a + ", title=" + this.f30695b + ", description=" + this.f30696c + ", image=" + this.d + ", checkpointOne=" + this.e + ", checkpointTwo=" + this.f + ", checkpointThree=" + this.f30697g + ", negativeButtonText=" + this.f30698h + ", positiveButtonText=" + this.i + ", isPositiveButtonInProgress=" + this.f30699j + ", isClearMode=" + this.k + ", enlargeImageSource=" + this.f30700l + ", enlarged=" + this.f30701m + ")";
        }

        public final c81 u() {
            return this.i;
        }

        public final boolean v() {
            return this.f30699j;
        }

        public static /* synthetic */ b a(b bVar, List list, c81 c81Var, c81 c81Var2, Bitmap bitmap, c81 c81Var3, c81 c81Var4, c81 c81Var5, c81 c81Var6, c81 c81Var7, boolean z, boolean z3, z10 z10Var, hw hwVar, int i, Object obj2) {
            if ((i & 1) != 0) {
                list = bVar.f30694a;
            }
            return bVar.a(list, (i & 2) != 0 ? bVar.f30695b : c81Var, (i & 4) != 0 ? bVar.f30696c : c81Var2, (i & 8) != 0 ? bVar.d : bitmap, (i & 16) != 0 ? bVar.e : c81Var3, (i & 32) != 0 ? bVar.f : c81Var4, (i & 64) != 0 ? bVar.f30697g : c81Var5, (i & 128) != 0 ? bVar.f30698h : c81Var6, (i & 256) != 0 ? bVar.i : c81Var7, (i & 512) != 0 ? bVar.f30699j : z, (i & 1024) != 0 ? bVar.k : z3, (i & 2048) != 0 ? bVar.f30700l : z10Var, (i & 4096) != 0 ? bVar.f30701m : hwVar);
        }

        public b(List list, c81 c81Var, c81 c81Var2, Bitmap bitmap, c81 c81Var3, c81 c81Var4, c81 c81Var5, c81 c81Var6, c81 c81Var7, boolean z, boolean z3, z10 z10Var, hw hwVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? zhm.f0.f322471a : list, c81Var, c81Var2, bitmap, c81Var3, c81Var4, c81Var5, c81Var6, c81Var7, (i & 512) != 0 ? false : z, (i & 1024) != 0 ? false : z3, z10Var, (i & 4096) != 0 ? null : hwVar);
        }
    }

    c81 a();

    boolean e();

    c81 getTitle();

    public interface c extends lo {

        public static final class a implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final c81 f30702a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final le1 f30703b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final c81 f30704c;
            private final boolean d;
            private final c81 e;
            private final c81 f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final z10 f30705g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final z10 f30706h;
            private final z10 i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private final p70 f30707j;
            private final p70 k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private final boolean f30708l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private final boolean f30709m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final Pair f30710n;

            public a(c81 title, le1 mask, c81 description, boolean z, c81 c81Var, c81 buttonText, z10 closeImageSource, z10 shutterDefaultImageSource, z10 shutterPressedImageSource, p70 p70Var, p70 p70Var2, boolean z3, boolean z4, Pair pair) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(mask, "mask");
                Intrinsics.checkNotNullParameter(description, "description");
                Intrinsics.checkNotNullParameter(buttonText, "buttonText");
                Intrinsics.checkNotNullParameter(closeImageSource, "closeImageSource");
                Intrinsics.checkNotNullParameter(shutterDefaultImageSource, "shutterDefaultImageSource");
                Intrinsics.checkNotNullParameter(shutterPressedImageSource, "shutterPressedImageSource");
                this.f30702a = title;
                this.f30703b = mask;
                this.f30704c = description;
                this.d = z;
                this.e = c81Var;
                this.f = buttonText;
                this.f30705g = closeImageSource;
                this.f30706h = shutterDefaultImageSource;
                this.i = shutterPressedImageSource;
                this.f30707j = p70Var;
                this.k = p70Var2;
                this.f30708l = z3;
                this.f30709m = z4;
                this.f30710n = pair;
            }

            public final a a(c81 title, le1 mask, c81 description, boolean z, c81 c81Var, c81 buttonText, z10 closeImageSource, z10 shutterDefaultImageSource, z10 shutterPressedImageSource, p70 p70Var, p70 p70Var2, boolean z3, boolean z4, Pair pair) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(mask, "mask");
                Intrinsics.checkNotNullParameter(description, "description");
                Intrinsics.checkNotNullParameter(buttonText, "buttonText");
                Intrinsics.checkNotNullParameter(closeImageSource, "closeImageSource");
                Intrinsics.checkNotNullParameter(shutterDefaultImageSource, "shutterDefaultImageSource");
                Intrinsics.checkNotNullParameter(shutterPressedImageSource, "shutterPressedImageSource");
                return new a(title, mask, description, z, c81Var, buttonText, closeImageSource, shutterDefaultImageSource, shutterPressedImageSource, p70Var, p70Var2, z3, z4, pair);
            }

            @Override // com.fourthline.orca.internal.lo.c
            public z10 b() {
                return this.f30705g;
            }

            @Override // com.fourthline.orca.internal.lo.c
            public c81 c() {
                return this.e;
            }

            @Override // com.fourthline.orca.internal.lo
            public boolean e() {
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
                return Intrinsics.f(this.f30702a, aVar.f30702a) && Intrinsics.f(this.f30703b, aVar.f30703b) && Intrinsics.f(this.f30704c, aVar.f30704c) && this.d == aVar.d && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f30705g, aVar.f30705g) && Intrinsics.f(this.f30706h, aVar.f30706h) && Intrinsics.f(this.i, aVar.i) && Intrinsics.f(this.f30707j, aVar.f30707j) && Intrinsics.f(this.k, aVar.k) && this.f30708l == aVar.f30708l && this.f30709m == aVar.f30709m && Intrinsics.f(this.f30710n, aVar.f30710n);
            }

            @Override // com.fourthline.orca.internal.lo.c
            public le1 getMask() {
                return this.f30703b;
            }

            @Override // com.fourthline.orca.internal.lo.c
            public Pair getProgress() {
                return this.f30710n;
            }

            @Override // com.fourthline.orca.internal.lo
            public c81 getTitle() {
                return this.f30702a;
            }

            public int hashCode() {
                int iHashCode = ((((((this.f30702a.hashCode() * 31) + this.f30703b.hashCode()) * 31) + this.f30704c.hashCode()) * 31) + Boolean.hashCode(this.d)) * 31;
                c81 c81Var = this.e;
                int iHashCode2 = (((((((((iHashCode + (c81Var == null ? 0 : c81Var.hashCode())) * 31) + this.f.hashCode()) * 31) + this.f30705g.hashCode()) * 31) + this.f30706h.hashCode()) * 31) + this.i.hashCode()) * 31;
                p70 p70Var = this.f30707j;
                int iHashCode3 = (iHashCode2 + (p70Var == null ? 0 : p70Var.hashCode())) * 31;
                p70 p70Var2 = this.k;
                int iHashCode4 = (((((iHashCode3 + (p70Var2 == null ? 0 : p70Var2.hashCode())) * 31) + Boolean.hashCode(this.f30708l)) * 31) + Boolean.hashCode(this.f30709m)) * 31;
                Pair pair = this.f30710n;
                return iHashCode4 + (pair != null ? pair.hashCode() : 0);
            }

            @Override // com.fourthline.orca.internal.lo.c
            public p70 i() {
                return this.f30707j;
            }

            @Override // com.fourthline.orca.internal.lo.c
            public boolean isDynamicStepsEnabled() {
                return this.f30709m;
            }

            public final p70 n() {
                return this.k;
            }

            public final z10 o() {
                return this.f30706h;
            }

            public final z10 p() {
                return this.i;
            }

            public final boolean q() {
                return this.f30708l;
            }

            public String toString() {
                return "ManualMode(title=" + this.f30702a + ", mask=" + this.f30703b + ", description=" + this.f30704c + ", isClearMode=" + this.d + ", warning=" + this.e + ", buttonText=" + this.f + ", closeImageSource=" + this.f30705g + ", shutterDefaultImageSource=" + this.f30706h + ", shutterPressedImageSource=" + this.i + ", hintLottieSource=" + this.f30707j + ", progressIndicatorSource=" + this.k + ", isTakeSnapshotEnabled=" + this.f30708l + ", isDynamicStepsEnabled=" + this.f30709m + ", progress=" + this.f30710n + ")";
            }

            @Override // com.fourthline.orca.internal.lo
            public c81 a() {
                return this.f30704c;
            }
        }

        z10 b();

        c81 c();

        le1 getMask();

        Pair getProgress();

        p70 i();

        boolean isDynamicStepsEnabled();

        public static final class b implements c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final c81 f30711a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final le1 f30712b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final c81 f30713c;
            private final z10 d;
            private final boolean e;
            private final boolean f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private final c81 f30714g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private final p70 f30715h;
            private final Pair i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private final z10 f30716j;
            private final boolean k;

            public b(c81 title, le1 mask, c81 description, z10 closeImageSource, boolean z, boolean z3, c81 c81Var, p70 p70Var, Pair pair, z10 successIcon, boolean z4) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(mask, "mask");
                Intrinsics.checkNotNullParameter(description, "description");
                Intrinsics.checkNotNullParameter(closeImageSource, "closeImageSource");
                Intrinsics.checkNotNullParameter(successIcon, "successIcon");
                this.f30711a = title;
                this.f30712b = mask;
                this.f30713c = description;
                this.d = closeImageSource;
                this.e = z;
                this.f = z3;
                this.f30714g = c81Var;
                this.f30715h = p70Var;
                this.i = pair;
                this.f30716j = successIcon;
                this.k = z4;
            }

            @Override // com.fourthline.orca.internal.lo
            public c81 a() {
                return this.f30713c;
            }

            @Override // com.fourthline.orca.internal.lo.c
            public z10 b() {
                return this.d;
            }

            @Override // com.fourthline.orca.internal.lo.c
            public c81 c() {
                return this.f30714g;
            }

            @Override // com.fourthline.orca.internal.lo
            public boolean e() {
                return this.e;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof b)) {
                    return false;
                }
                b bVar = (b) obj2;
                return Intrinsics.f(this.f30711a, bVar.f30711a) && Intrinsics.f(this.f30712b, bVar.f30712b) && Intrinsics.f(this.f30713c, bVar.f30713c) && Intrinsics.f(this.d, bVar.d) && this.e == bVar.e && this.f == bVar.f && Intrinsics.f(this.f30714g, bVar.f30714g) && Intrinsics.f(this.f30715h, bVar.f30715h) && Intrinsics.f(this.i, bVar.i) && Intrinsics.f(this.f30716j, bVar.f30716j) && this.k == bVar.k;
            }

            @Override // com.fourthline.orca.internal.lo.c
            public le1 getMask() {
                return this.f30712b;
            }

            @Override // com.fourthline.orca.internal.lo.c
            public Pair getProgress() {
                return this.i;
            }

            @Override // com.fourthline.orca.internal.lo
            public c81 getTitle() {
                return this.f30711a;
            }

            public int hashCode() {
                int iHashCode = ((((((((((this.f30711a.hashCode() * 31) + this.f30712b.hashCode()) * 31) + this.f30713c.hashCode()) * 31) + this.d.hashCode()) * 31) + Boolean.hashCode(this.e)) * 31) + Boolean.hashCode(this.f)) * 31;
                c81 c81Var = this.f30714g;
                int iHashCode2 = (iHashCode + (c81Var == null ? 0 : c81Var.hashCode())) * 31;
                p70 p70Var = this.f30715h;
                int iHashCode3 = (iHashCode2 + (p70Var == null ? 0 : p70Var.hashCode())) * 31;
                Pair pair = this.i;
                return ((((iHashCode3 + (pair != null ? pair.hashCode() : 0)) * 31) + this.f30716j.hashCode()) * 31) + Boolean.hashCode(this.k);
            }

            @Override // com.fourthline.orca.internal.lo.c
            public p70 i() {
                return this.f30715h;
            }

            @Override // com.fourthline.orca.internal.lo.c
            public boolean isDynamicStepsEnabled() {
                return this.f;
            }

            public final boolean n() {
                return this.k;
            }

            public final z10 o() {
                return this.f30716j;
            }

            public String toString() {
                return "SuccessMode(title=" + this.f30711a + ", mask=" + this.f30712b + ", description=" + this.f30713c + ", closeImageSource=" + this.d + ", isClearMode=" + this.e + ", isDynamicStepsEnabled=" + this.f + ", warning=" + this.f30714g + ", hintLottieSource=" + this.f30715h + ", progress=" + this.i + ", successIcon=" + this.f30716j + ", displayMask=" + this.k + ")";
            }

            /* JADX WARN: Illegal instructions before constructor call */
            public /* synthetic */ b(c81 c81Var, le1 le1Var, c81 c81Var2, z10 z10Var, boolean z, boolean z3, c81 c81Var3, p70 p70Var, Pair pair, z10 z10Var2, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
                boolean z6;
                z10 z10Var3;
                Pair pair2;
                z = (i & 16) != 0 ? false : z;
                z3 = (i & 32) != 0 ? false : z3;
                c81Var3 = (i & 64) != 0 ? null : c81Var3;
                p70Var = (i & 128) != 0 ? null : p70Var;
                if ((i & 256) != 0) {
                    z6 = z4;
                    z10Var3 = z10Var2;
                    pair2 = null;
                } else {
                    z6 = z4;
                    z10Var3 = z10Var2;
                    pair2 = pair;
                }
                this(c81Var, le1Var, c81Var2, z10Var, z, z3, c81Var3, p70Var, pair2, z10Var3, z6);
            }
        }
    }
}
