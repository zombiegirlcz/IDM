package aw0;

import com.revolut.core.ui_kit_resources.R$attr;

/* JADX INFO: loaded from: classes19.dex */
public final class z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f10642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f10643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10644c;
    public final int d;

    public z6() {
        this(0, 0, 15);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof z6)) {
            return false;
        }
        z6 z6Var = (z6) obj2;
        return Float.compare(this.f10642a, z6Var.f10642a) == 0 && Float.compare(this.f10643b, z6Var.f10643b) == 0 && this.f10644c == z6Var.f10644c && this.d == z6Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + j6.a.b(this.f10644c, m72.b.b(this.f10643b, Float.hashCode(this.f10642a) * 31, 31), 31);
    }

    public z6(int i, int i2, int i3) {
        i = (i3 & 4) != 0 ? R$attr.internal_textAppearanceBody2 : i;
        i2 = (i3 & 8) != 0 ? R$attr.internal_textAppearanceBody2 : i2;
        this.f10642a = 16.0f;
        this.f10643b = 6.0f;
        this.f10644c = i;
        this.d = i2;
    }
}
