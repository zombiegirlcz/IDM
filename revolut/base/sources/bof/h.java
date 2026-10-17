package bof;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f17410a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xnf.b f17411b;

    public h(ArrayList items, xnf.b navBarModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarModel, "navBarModel");
        this.f17410a = items;
        this.f17411b = navBarModel;
    }

    @Override // cli.p
    public final List c() {
        return this.f17410a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f17410a.equals(hVar.f17410a) && this.f17411b.equals(hVar.f17411b);
    }

    public final int hashCode() {
        return (this.f17411b.hashCode() + (this.f17410a.hashCode() * 31)) * 961;
    }
}
