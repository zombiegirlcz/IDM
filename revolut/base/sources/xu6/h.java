package xu6;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f308967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aim.e f308968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f308969c;

    public h(g header, aim.e items, f footer) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.f308967a = header;
        this.f308968b = items;
        this.f308969c = footer;
    }

    @Override // cli.p
    public final List c() {
        return this.f308968b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f308967a.equals(hVar.f308967a) && this.f308968b.equals(hVar.f308968b) && this.f308969c.equals(hVar.f308969c);
    }

    public final int hashCode() {
        return this.f308969c.f308965a.hashCode() + ((this.f308968b.hashCode() + (this.f308967a.f308966a.hashCode() * 31)) * 31);
    }
}
