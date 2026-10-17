package pt0;

import android.graphics.Path;
import aw0.j4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j4 f239579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f239580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f239581c;
    public final float d;
    public final Path e;

    public p(j4 segment, float f, float f4, float f5, Path path) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        this.f239579a = segment;
        this.f239580b = f;
        this.f239581c = f4;
        this.d = f5;
        this.e = path;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f239579a, pVar.f239579a) && Float.compare(this.f239580b, pVar.f239580b) == 0 && Float.compare(this.f239581c, pVar.f239581c) == 0 && Float.compare(this.d, pVar.d) == 0 && Intrinsics.f(this.e, pVar.e);
    }

    public final int hashCode() {
        int iB = m72.b.b(this.d, m72.b.b(this.f239581c, m72.b.b(this.f239580b, this.f239579a.hashCode() * 31, 31), 31), 31);
        Path path = this.e;
        return iB + (path == null ? 0 : path.hashCode());
    }
}
