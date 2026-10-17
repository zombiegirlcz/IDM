package y4c;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f310867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f310868b;

    public g(ArrayList items, e headerData) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(headerData, "headerData");
        this.f310867a = items;
        this.f310868b = headerData;
    }

    @Override // cli.p
    public final List c() {
        return this.f310867a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f310867a.equals(gVar.f310867a) && this.f310868b.equals(gVar.f310868b);
    }

    public final int hashCode() {
        return this.f310868b.hashCode() + (this.f310867a.hashCode() * 31);
    }
}
