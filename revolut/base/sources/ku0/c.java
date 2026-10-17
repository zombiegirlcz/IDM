package ku0;

import android.view.animation.DecelerateInterpolator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DecelerateInterpolator f189580a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f189581b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f189582c;
    public final b d;
    public final b e;
    public final b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f189583g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f189584h;
    public final b i;

    public c(DecelerateInterpolator interpolator, b fgCardTranslate, b fgCardAlpha, b bgCardAlpha, b bgCardTranslate, b bgCardScaleX, b bgCardScaleY, b bgCardBackground, b lastCardAlpha) {
        Intrinsics.checkNotNullParameter(interpolator, "interpolator");
        Intrinsics.checkNotNullParameter(fgCardTranslate, "fgCardTranslate");
        Intrinsics.checkNotNullParameter(fgCardAlpha, "fgCardAlpha");
        Intrinsics.checkNotNullParameter(bgCardAlpha, "bgCardAlpha");
        Intrinsics.checkNotNullParameter(bgCardTranslate, "bgCardTranslate");
        Intrinsics.checkNotNullParameter(bgCardScaleX, "bgCardScaleX");
        Intrinsics.checkNotNullParameter(bgCardScaleY, "bgCardScaleY");
        Intrinsics.checkNotNullParameter(bgCardBackground, "bgCardBackground");
        Intrinsics.checkNotNullParameter(lastCardAlpha, "lastCardAlpha");
        this.f189580a = interpolator;
        this.f189581b = fgCardTranslate;
        this.f189582c = fgCardAlpha;
        this.d = bgCardAlpha;
        this.e = bgCardTranslate;
        this.f = bgCardScaleX;
        this.f189583g = bgCardScaleY;
        this.f189584h = bgCardBackground;
        this.i = lastCardAlpha;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f189580a.equals(cVar.f189580a) && this.f189581b.equals(cVar.f189581b) && this.f189582c.equals(cVar.f189582c) && this.d.equals(cVar.d) && this.e.equals(cVar.e) && this.f.equals(cVar.f) && this.f189583g.equals(cVar.f189583g) && this.f189584h.equals(cVar.f189584h) && this.i.equals(cVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.f189584h.hashCode() + ((this.f189583g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.f189582c.hashCode() + ((this.f189581b.hashCode() + ((this.f189580a.hashCode() + (Long.hashCode(400L) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
