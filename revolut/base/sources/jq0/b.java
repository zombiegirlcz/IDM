package jq0;

import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f177337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f177338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f177339c;

    public b(boolean z, boolean z3) {
        LinkedHashSet ownerTokens = new LinkedHashSet();
        Intrinsics.checkNotNullParameter(ownerTokens, "ownerTokens");
        this.f177337a = z;
        this.f177338b = z3;
        this.f177339c = ownerTokens;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f177337a == bVar.f177337a && this.f177338b == bVar.f177338b && Intrinsics.f(this.f177339c, bVar.f177339c);
    }

    public final int hashCode() {
        return this.f177339c.hashCode() + j6.a.c(Boolean.hashCode(this.f177337a) * 31, 31, this.f177338b);
    }
}
