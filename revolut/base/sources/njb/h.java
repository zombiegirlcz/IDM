package njb;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.ImageClauseTint;
import com.revolut.core.ui_kit.models.Style;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Style f216441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageClauseTint f216442b;

    public h() {
        this(null, 3);
    }

    @Override // njb.i
    public final ImageClauseTint a() {
        return this.f216442b;
    }

    @Override // njb.i
    public final Style b() {
        return this.f216441a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f216441a, hVar.f216441a) && Intrinsics.f(this.f216442b, hVar.f216442b);
    }

    public final int hashCode() {
        Style style = this.f216441a;
        return this.f216442b.hashCode() + ((style == null ? 0 : style.hashCode()) * 31);
    }

    public h(Custom custom, int i) {
        custom = (i & 1) != 0 ? null : custom;
        ImageClauseTint.TextColor iconTint = ImageClauseTint.TextColor.f57790a;
        Intrinsics.checkNotNullParameter(iconTint, "iconTint");
        this.f216441a = custom;
        this.f216442b = iconTint;
    }
}
