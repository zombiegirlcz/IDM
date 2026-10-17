package njb;

import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.Style;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageClauseTint f216439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f216440b;

    public g() {
        this(false, 7);
    }

    @Override // njb.i
    public final ImageClauseTint a() {
        return this.f216439a;
    }

    @Override // njb.i
    public final Style b() {
        return null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f216439a, gVar.f216439a) && this.f216440b == gVar.f216440b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f216440b) + (this.f216439a.hashCode() * 31);
    }

    public g(boolean z, int i) {
        z = (i & 4) != 0 ? false : z;
        ImageClauseTint.TextColor iconTint = ImageClauseTint.TextColor.f57790a;
        Intrinsics.checkNotNullParameter(iconTint, "iconTint");
        this.f216439a = iconTint;
        this.f216440b = z;
    }
}
