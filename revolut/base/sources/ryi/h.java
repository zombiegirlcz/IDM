package ryi;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f258383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f258384b;

    public h(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f258383a = items;
        this.f258384b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f258383a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f258383a, hVar.f258383a) && this.f258384b == hVar.f258384b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f258384b) + (this.f258383a.hashCode() * 31);
    }
}
