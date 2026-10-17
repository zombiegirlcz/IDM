package jhd;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw0.a f174211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f174212b;

    public h(ArrayList items, lw0.a header) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f174211a = header;
        this.f174212b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f174212b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f174211a.equals(hVar.f174211a) && this.f174212b.equals(hVar.f174212b);
    }

    public final int hashCode() {
        return this.f174212b.hashCode() + (this.f174211a.hashCode() * 31);
    }
}
