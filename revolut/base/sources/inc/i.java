package inc;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f162780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f162781b;

    public i(h header, ArrayList items) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f162780a = header;
        this.f162781b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f162781b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f162780a.equals(iVar.f162780a) && this.f162781b.equals(iVar.f162781b);
    }

    public final int hashCode() {
        return this.f162781b.hashCode() + (this.f162780a.hashCode() * 31);
    }
}
