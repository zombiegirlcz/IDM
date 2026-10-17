package p94;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw0.a f234273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f234274b;

    public f(ArrayList items, lw0.a headerModel) {
        Intrinsics.checkNotNullParameter(headerModel, "headerModel");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f234273a = headerModel;
        this.f234274b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f234274b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f234273a.equals(fVar.f234273a) && this.f234274b.equals(fVar.f234274b);
    }

    public final int hashCode() {
        return this.f234274b.hashCode() + (this.f234273a.hashCode() * 31);
    }
}
