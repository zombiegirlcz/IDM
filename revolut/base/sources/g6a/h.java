package g6a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f140902a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f140903b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f140904c;
    public final boolean d;

    public h(List blocks, boolean z, String blockId, String title) {
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        this.f140902a = blockId;
        this.f140903b = title;
        this.f140904c = blocks;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f140902a, hVar.f140902a) && Intrinsics.f(this.f140903b, hVar.f140903b) && Intrinsics.f(this.f140904c, hVar.f140904c) && this.d == hVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p.a.d(p.a.c(this.f140902a.hashCode() * 31, 31, this.f140903b), 31, this.f140904c);
    }
}
