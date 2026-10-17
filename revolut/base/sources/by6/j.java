package by6;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f19753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f19754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f19755c;

    public j(i headerState, List items, h footerState) {
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(footerState, "footerState");
        this.f19753a = headerState;
        this.f19754b = items;
        this.f19755c = footerState;
    }

    @Override // cli.p
    public final List c() {
        return this.f19754b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f19753a, jVar.f19753a) && Intrinsics.f(this.f19754b, jVar.f19754b) && Intrinsics.f(this.f19755c, jVar.f19755c);
    }

    public final int hashCode() {
        return this.f19755c.hashCode() + p.a.d(this.f19753a.hashCode() * 31, 31, this.f19754b);
    }
}
