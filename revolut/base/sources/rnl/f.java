package rnl;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f255721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.g f255722b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f255723c;

    public f(e header, aw0.g actionFooter, List items) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(actionFooter, "actionFooter");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f255721a = header;
        this.f255722b = actionFooter;
        this.f255723c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f255723c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f255721a.equals(fVar.f255721a) && this.f255722b.equals(fVar.f255722b) && Intrinsics.f(this.f255723c, fVar.f255723c);
    }

    public final int hashCode() {
        return this.f255723c.hashCode() + ((this.f255722b.hashCode() + (this.f255721a.hashCode() * 31)) * 31);
    }
}
