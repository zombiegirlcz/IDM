package us4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f282432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f282433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f282434c;

    public m(l toolbarState, List items, k buttonState) {
        Intrinsics.checkNotNullParameter(toolbarState, "toolbarState");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        this.f282432a = toolbarState;
        this.f282433b = items;
        this.f282434c = buttonState;
    }

    @Override // cli.p
    public final List c() {
        return this.f282433b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f282432a, mVar.f282432a) && Intrinsics.f(this.f282433b, mVar.f282433b) && Intrinsics.f(this.f282434c, mVar.f282434c);
    }

    public final int hashCode() {
        return this.f282434c.hashCode() + p.a.d(this.f282432a.hashCode() * 31, 31, this.f282433b);
    }
}
