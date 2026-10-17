package cjj;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f24692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f24693b;

    public h(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f24692a = items;
        this.f24693b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f24692a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f24692a, hVar.f24692a) && this.f24693b == hVar.f24693b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f24693b) + (this.f24692a.hashCode() * 31);
    }
}
