package wdi;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lw0.a f296561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f296562b;

    public g(ArrayList items, lw0.a header) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f296561a = header;
        this.f296562b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f296562b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f296561a.equals(gVar.f296561a) && this.f296562b.equals(gVar.f296562b);
    }

    public final int hashCode() {
        return this.f296562b.hashCode() + (this.f296561a.hashCode() * 31);
    }
}
