package ms0;

import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c4 extends d4 {
    public final float d;
    public final float e;
    public final aw0.d3 f;

    public c4(float f, int i, float f4, int i2, int i3) {
        aw0.d3 countDownColorStyle = new aw0.d3(i, i2, i3);
        Intrinsics.checkNotNullParameter(countDownColorStyle, "countDownColorStyle");
        super(R$attr.internal_textAppearanceEmphasis3, 4.0f, 4.0f);
        this.d = f;
        this.e = f4;
        this.f = countDownColorStyle;
    }

    @Override // ms0.d4
    public final long a() {
        return 0L;
    }

    @Override // ms0.d4
    public final uw0.i b() {
        return null;
    }

    @Override // ms0.d4
    public final aw0.h3 c() {
        return this.f;
    }

    @Override // ms0.d4
    public final float d() {
        return this.d;
    }

    @Override // ms0.d4
    public final float e() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c4)) {
            return false;
        }
        c4 c4Var = (c4) obj2;
        return Float.compare(this.d, c4Var.d) == 0 && Float.compare(this.e, c4Var.e) == 0 && this.f.equals(c4Var.f) && Float.compare(4.0f, 4.0f) == 0;
    }

    @Override // ms0.d4
    public final boolean f() {
        return false;
    }

    @Override // ms0.d4
    public final boolean g() {
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + m72.b.b(4.0f, (this.f.hashCode() + j6.a.c(a0.d.c(m72.b.b(this.e, Float.hashCode(this.d) * 31, 31), 31, 0L), 31, false)) * 31, 961);
    }
}
