package zt4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f325075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f325076b;

    public i(List items, h toolbarState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbarState, "toolbarState");
        this.f325075a = items;
        this.f325076b = toolbarState;
    }

    @Override // cli.p
    public final List c() {
        return this.f325075a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f325075a, iVar.f325075a) && Intrinsics.f(this.f325076b, iVar.f325076b);
    }

    public final int hashCode() {
        return this.f325076b.hashCode() + (this.f325075a.hashCode() * 31);
    }
}
