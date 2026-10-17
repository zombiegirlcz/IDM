package jci;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f172819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f172820b;

    public g(ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f172819a = items;
        this.f172820b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f172819a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f172819a.equals(gVar.f172819a) && this.f172820b == gVar.f172820b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f172820b) + (this.f172819a.hashCode() * 31);
    }
}
