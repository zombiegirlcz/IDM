package wy3;

import cv3.s;
import hs3.j0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f301074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j0 f301075b;

    public g(s content, j0 layout) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f301074a = content;
        this.f301075b = layout;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f301074a, gVar.f301074a) && this.f301075b == gVar.f301075b;
    }

    public final int hashCode() {
        return this.f301075b.hashCode() + (this.f301074a.hashCode() * 31);
    }
}
