package wt4;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f299777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f299778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f299779c;

    public j(List items, i toolbarState, c buttonState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbarState, "toolbarState");
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        this.f299777a = items;
        this.f299778b = toolbarState;
        this.f299779c = buttonState;
    }

    @Override // cli.p
    public final List c() {
        return this.f299777a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f299777a, jVar.f299777a) && Intrinsics.f(this.f299778b, jVar.f299778b) && Intrinsics.f(this.f299779c, jVar.f299779c);
    }

    public final int hashCode() {
        return this.f299779c.hashCode() + ((this.f299778b.hashCode() + (this.f299777a.hashCode() * 31)) * 31);
    }
}
