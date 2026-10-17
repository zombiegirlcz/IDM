package com.fourthline.orca.internal;

import android.graphics.Bitmap;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public final class bo0 implements ie1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c81 f27177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c81 f27178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f27179c;
    private final c81 d;
    private final c81 e;
    private final c81 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c81 f27180g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c81 f27181h;
    private final z10 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final hw f27182j;

    public interface a {

        /* JADX INFO: renamed from: com.fourthline.orca.internal.bo0$a$a, reason: collision with other inner class name */
        public static final class C0172a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final p70 f27183a;

            public C0172a(p70 lottieSource) {
                Intrinsics.checkNotNullParameter(lottieSource, "lottieSource");
                this.f27183a = lottieSource;
            }

            public final p70 a() {
                return this.f27183a;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof C0172a) && Intrinsics.f(this.f27183a, ((C0172a) obj2).f27183a);
            }

            public int hashCode() {
                return this.f27183a.hashCode();
            }

            public String toString() {
                return "Animation(lottieSource=" + this.f27183a + ")";
            }
        }

        public static final class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final Bitmap f27184a;

            public b(Bitmap bitmap) {
                Intrinsics.checkNotNullParameter(bitmap, "bitmap");
                this.f27184a = bitmap;
            }

            public final Bitmap a() {
                return this.f27184a;
            }

            public boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof b) && Intrinsics.f(this.f27184a, ((b) obj2).f27184a);
            }

            public int hashCode() {
                return this.f27184a.hashCode();
            }

            public String toString() {
                return "Image(bitmap=" + this.f27184a + ")";
            }
        }
    }

    public bo0(c81 title, c81 description, a preview, c81 checkpointOne, c81 checkpointTwo, c81 checkpointThree, c81 negativeButtonText, c81 positiveButtonText, z10 enlargeImageSource, hw hwVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(preview, "preview");
        Intrinsics.checkNotNullParameter(checkpointOne, "checkpointOne");
        Intrinsics.checkNotNullParameter(checkpointTwo, "checkpointTwo");
        Intrinsics.checkNotNullParameter(checkpointThree, "checkpointThree");
        Intrinsics.checkNotNullParameter(negativeButtonText, "negativeButtonText");
        Intrinsics.checkNotNullParameter(positiveButtonText, "positiveButtonText");
        Intrinsics.checkNotNullParameter(enlargeImageSource, "enlargeImageSource");
        this.f27177a = title;
        this.f27178b = description;
        this.f27179c = preview;
        this.d = checkpointOne;
        this.e = checkpointTwo;
        this.f = checkpointThree;
        this.f27180g = negativeButtonText;
        this.f27181h = positiveButtonText;
        this.i = enlargeImageSource;
        this.f27182j = hwVar;
    }

    public final bo0 a(c81 title, c81 description, a preview, c81 checkpointOne, c81 checkpointTwo, c81 checkpointThree, c81 negativeButtonText, c81 positiveButtonText, z10 enlargeImageSource, hw hwVar) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(preview, "preview");
        Intrinsics.checkNotNullParameter(checkpointOne, "checkpointOne");
        Intrinsics.checkNotNullParameter(checkpointTwo, "checkpointTwo");
        Intrinsics.checkNotNullParameter(checkpointThree, "checkpointThree");
        Intrinsics.checkNotNullParameter(negativeButtonText, "negativeButtonText");
        Intrinsics.checkNotNullParameter(positiveButtonText, "positiveButtonText");
        Intrinsics.checkNotNullParameter(enlargeImageSource, "enlargeImageSource");
        return new bo0(title, description, preview, checkpointOne, checkpointTwo, checkpointThree, negativeButtonText, positiveButtonText, enlargeImageSource, hwVar);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof bo0)) {
            return false;
        }
        bo0 bo0Var = (bo0) obj2;
        return Intrinsics.f(this.f27177a, bo0Var.f27177a) && Intrinsics.f(this.f27178b, bo0Var.f27178b) && Intrinsics.f(this.f27179c, bo0Var.f27179c) && Intrinsics.f(this.d, bo0Var.d) && Intrinsics.f(this.e, bo0Var.e) && Intrinsics.f(this.f, bo0Var.f) && Intrinsics.f(this.f27180g, bo0Var.f27180g) && Intrinsics.f(this.f27181h, bo0Var.f27181h) && Intrinsics.f(this.i, bo0Var.i) && Intrinsics.f(this.f27182j, bo0Var.f27182j);
    }

    public final c81 getTitle() {
        return this.f27177a;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.f27177a.hashCode() * 31) + this.f27178b.hashCode()) * 31) + this.f27179c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.f27180g.hashCode()) * 31) + this.f27181h.hashCode()) * 31) + this.i.hashCode()) * 31;
        hw hwVar = this.f27182j;
        return iHashCode + (hwVar == null ? 0 : hwVar.hashCode());
    }

    public final c81 n() {
        return this.d;
    }

    public final c81 o() {
        return this.f;
    }

    public final c81 p() {
        return this.e;
    }

    public final z10 q() {
        return this.i;
    }

    public final hw r() {
        return this.f27182j;
    }

    public final c81 s() {
        return this.f27180g;
    }

    public final c81 t() {
        return this.f27181h;
    }

    public String toString() {
        return "State(title=" + this.f27177a + ", description=" + this.f27178b + ", preview=" + this.f27179c + ", checkpointOne=" + this.d + ", checkpointTwo=" + this.e + ", checkpointThree=" + this.f + ", negativeButtonText=" + this.f27180g + ", positiveButtonText=" + this.f27181h + ", enlargeImageSource=" + this.i + ", enlarged=" + this.f27182j + ")";
    }

    public final a u() {
        return this.f27179c;
    }

    public static /* synthetic */ bo0 a(bo0 bo0Var, c81 c81Var, c81 c81Var2, a aVar, c81 c81Var3, c81 c81Var4, c81 c81Var5, c81 c81Var6, c81 c81Var7, z10 z10Var, hw hwVar, int i, Object obj2) {
        if ((i & 1) != 0) {
            c81Var = bo0Var.f27177a;
        }
        if ((i & 2) != 0) {
            c81Var2 = bo0Var.f27178b;
        }
        if ((i & 4) != 0) {
            aVar = bo0Var.f27179c;
        }
        if ((i & 8) != 0) {
            c81Var3 = bo0Var.d;
        }
        if ((i & 16) != 0) {
            c81Var4 = bo0Var.e;
        }
        if ((i & 32) != 0) {
            c81Var5 = bo0Var.f;
        }
        if ((i & 64) != 0) {
            c81Var6 = bo0Var.f27180g;
        }
        if ((i & 128) != 0) {
            c81Var7 = bo0Var.f27181h;
        }
        if ((i & 256) != 0) {
            z10Var = bo0Var.i;
        }
        if ((i & 512) != 0) {
            hwVar = bo0Var.f27182j;
        }
        z10 z10Var2 = z10Var;
        hw hwVar2 = hwVar;
        c81 c81Var8 = c81Var6;
        c81 c81Var9 = c81Var7;
        c81 c81Var10 = c81Var4;
        c81 c81Var11 = c81Var5;
        return bo0Var.a(c81Var, c81Var2, aVar, c81Var3, c81Var10, c81Var11, c81Var8, c81Var9, z10Var2, hwVar2);
    }

    public /* synthetic */ bo0(c81 c81Var, c81 c81Var2, a aVar, c81 c81Var3, c81 c81Var4, c81 c81Var5, c81 c81Var6, c81 c81Var7, z10 z10Var, hw hwVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c81Var, c81Var2, aVar, c81Var3, c81Var4, c81Var5, c81Var6, c81Var7, z10Var, (i & 512) != 0 ? null : hwVar);
    }
}
