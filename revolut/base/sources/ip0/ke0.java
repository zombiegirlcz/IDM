package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class ke0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f165002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f165003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.d3 f165004c;

    public ke0(float f, int i, float f4, int i2, int i3) {
        aw0.d3 countDownColorStyle = new aw0.d3(i, i2, i3);
        Intrinsics.checkNotNullParameter(countDownColorStyle, "countDownColorStyle");
        this.f165002a = f;
        this.f165003b = f4;
        this.f165004c = countDownColorStyle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ke0)) {
            return false;
        }
        ke0 ke0Var = (ke0) obj2;
        return Float.compare(this.f165002a, ke0Var.f165002a) == 0 && Float.compare(this.f165003b, ke0Var.f165003b) == 0 && this.f165004c.equals(ke0Var.f165004c);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.f165004c.hashCode() + m72.b.b(this.f165003b, Float.hashCode(this.f165002a) * 31, 31)) * 31);
    }
}
