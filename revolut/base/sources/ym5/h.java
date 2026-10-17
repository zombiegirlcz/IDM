package ym5;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f314863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f314864b;

    public h(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f314863a = items;
        this.f314864b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f314863a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f314863a, hVar.f314863a) && this.f314864b == hVar.f314864b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f314864b) + (this.f314863a.hashCode() * 31);
    }
}
