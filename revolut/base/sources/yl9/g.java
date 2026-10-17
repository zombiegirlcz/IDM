package yl9;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f314670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.g f314671b;

    public g(aim.e items, aw0.g actionFooter) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(actionFooter, "actionFooter");
        this.f314670a = items;
        this.f314671b = actionFooter;
    }

    @Override // cli.p
    public final List c() {
        return this.f314670a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f314670a, gVar.f314670a) && this.f314671b.equals(gVar.f314671b);
    }

    public final int hashCode() {
        return this.f314671b.hashCode() + (this.f314670a.hashCode() * 31);
    }
}
