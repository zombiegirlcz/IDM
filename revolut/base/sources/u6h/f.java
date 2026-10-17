package u6h;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f277596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f277597b;

    public f(List items, e toolbarContent) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbarContent, "toolbarContent");
        this.f277596a = items;
        this.f277597b = toolbarContent;
    }

    @Override // cli.p
    public final List c() {
        return this.f277596a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f277596a, fVar.f277596a) && Intrinsics.f(this.f277597b, fVar.f277597b);
    }

    public final int hashCode() {
        return this.f277597b.f277595a.hashCode() + (this.f277596a.hashCode() * 31);
    }
}
