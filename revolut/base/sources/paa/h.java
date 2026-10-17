package paa;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f234463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lw0.a f234464b;

    public h(List items, lw0.a headerModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        this.f234463a = items;
        this.f234464b = headerModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f234463a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f234463a.equals(hVar.f234463a) && this.f234464b.equals(hVar.f234464b);
    }

    public final int hashCode() {
        return this.f234464b.hashCode() + (this.f234463a.hashCode() * 31);
    }
}
