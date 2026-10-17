package a0l;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f437c;

    public h(List items, g toolbarState, c nextButtonState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbarState, "toolbarState");
        Intrinsics.checkNotNullParameter(nextButtonState, "nextButtonState");
        this.f435a = items;
        this.f436b = toolbarState;
        this.f437c = nextButtonState;
    }

    @Override // cli.p
    public final List c() {
        return this.f435a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f435a, hVar.f435a) && Intrinsics.f(this.f436b, hVar.f436b) && Intrinsics.f(this.f437c, hVar.f437c);
    }

    public final int hashCode() {
        return this.f437c.hashCode() + ((this.f436b.hashCode() + (this.f435a.hashCode() * 31)) * 31);
    }
}
