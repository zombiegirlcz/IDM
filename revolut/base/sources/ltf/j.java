package ltf;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f199868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lw0.a f199869b;

    public j(List items, lw0.a headerModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        this.f199868a = items;
        this.f199869b = headerModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f199868a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f199868a, jVar.f199868a) && this.f199869b.equals(jVar.f199869b);
    }

    public final int hashCode() {
        return this.f199869b.hashCode() + (this.f199868a.hashCode() * 31);
    }
}
