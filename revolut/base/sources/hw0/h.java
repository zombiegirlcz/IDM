package hw0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f156004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f156005b;

    public h(int i) {
        i style = i.SOLID_LINE;
        Intrinsics.checkNotNullParameter(style, "style");
        this.f156004a = i;
        this.f156005b = style;
    }

    @Override // hw0.j
    public final i a() {
        return this.f156005b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f156004a == hVar.f156004a && this.f156005b == hVar.f156005b;
    }

    public final int hashCode() {
        return this.f156005b.hashCode() + (Integer.hashCode(this.f156004a) * 31);
    }
}
