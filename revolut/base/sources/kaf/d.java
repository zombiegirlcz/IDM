package kaf;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f182484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f182485b;

    public d(ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f182484a = z;
        this.f182485b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f182485b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f182484a == dVar.f182484a && this.f182485b.equals(dVar.f182485b);
    }

    public final int hashCode() {
        return this.f182485b.hashCode() + (Boolean.hashCode(this.f182484a) * 31);
    }
}
