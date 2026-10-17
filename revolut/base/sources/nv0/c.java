package nv0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f219345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f219346b;

    public c(float f, i backgroundStyle) {
        Intrinsics.checkNotNullParameter(backgroundStyle, "backgroundStyle");
        this.f219345a = f;
        this.f219346b = backgroundStyle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Float.compare(this.f219345a, cVar.f219345a) == 0 && Float.compare(16.0f, 16.0f) == 0 && this.f219346b.equals(cVar.f219346b);
    }

    public final int hashCode() {
        return this.f219346b.hashCode() + m72.b.b(16.0f, Float.hashCode(this.f219345a) * 31, 31);
    }
}
