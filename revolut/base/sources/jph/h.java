package jph;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f177283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f177284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f177285c;

    public h(int i, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f177283a = items;
        this.f177284b = i;
        this.f177285c = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f177283a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f177283a, hVar.f177283a) && this.f177284b == hVar.f177284b && this.f177285c == hVar.f177285c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f177285c) + j6.a.b(this.f177284b, this.f177283a.hashCode() * 31, 31);
    }
}
