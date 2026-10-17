package vob;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lw0.m;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f290937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f290938b;

    public h(List items, m header) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f290937a = header;
        this.f290938b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f290938b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f290937a, hVar.f290937a) && Intrinsics.f(this.f290938b, hVar.f290938b);
    }

    public final int hashCode() {
        return this.f290938b.hashCode() + (this.f290937a.hashCode() * 31);
    }
}
