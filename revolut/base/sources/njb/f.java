package njb;

import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.Style;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageClauseTint f216437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f216438b;

    public f() {
        this(null, null, 7);
    }

    @Override // njb.i
    public final ImageClauseTint a() {
        return this.f216437a;
    }

    @Override // njb.i
    public final Style b() {
        return null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f216437a, fVar.f216437a) && this.f216438b == fVar.f216438b;
    }

    public final int hashCode() {
        return this.f216438b.hashCode() + (this.f216437a.hashCode() * 31);
    }

    public f(ImageClauseTint.Color color, e iconPosition, int i) {
        ImageClauseTint iconTint = color;
        iconTint = (i & 2) != 0 ? ImageClauseTint.TextColor.f57790a : iconTint;
        iconPosition = (i & 4) != 0 ? e.END : iconPosition;
        Intrinsics.checkNotNullParameter(iconTint, "iconTint");
        Intrinsics.checkNotNullParameter(iconPosition, "iconPosition");
        this.f216437a = iconTint;
        this.f216438b = iconPosition;
    }
}
