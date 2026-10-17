package rs0;

import aw0.r0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f256919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f256920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f256921c;
    public float d;
    public float e;
    public r0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f256922g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f256923h;

    public g(float f, float f4, float f5, float f6, float f32, r0 candle, float f35, float f36) {
        Intrinsics.checkNotNullParameter(candle, "candle");
        this.f256919a = f;
        this.f256920b = f4;
        this.f256921c = f5;
        this.d = f6;
        this.e = f32;
        this.f = candle;
        this.f256922g = f35;
        this.f256923h = f36;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Float.compare(this.f256919a, gVar.f256919a) == 0 && Float.compare(this.f256920b, gVar.f256920b) == 0 && Float.compare(this.f256921c, gVar.f256921c) == 0 && Float.compare(this.d, gVar.d) == 0 && Float.compare(this.e, gVar.e) == 0 && Intrinsics.f(this.f, gVar.f) && Float.compare(this.f256922g, gVar.f256922g) == 0 && Float.compare(this.f256923h, gVar.f256923h) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f256923h) + m72.b.b(this.f256922g, (this.f.hashCode() + m72.b.b(this.e, m72.b.b(this.d, m72.b.b(this.f256921c, m72.b.b(this.f256920b, Float.hashCode(this.f256919a) * 31, 31), 31), 31), 31)) * 31, 31);
    }
}
