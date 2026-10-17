package j17;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f170132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f170133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f170134c;

    public f(e toolbarState, List items, c buttonState) {
        Intrinsics.checkNotNullParameter(toolbarState, "toolbarState");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        this.f170132a = toolbarState;
        this.f170133b = items;
        this.f170134c = buttonState;
    }

    @Override // jki.n
    public final List c() {
        return this.f170133b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f170132a, fVar.f170132a) && Intrinsics.f(this.f170133b, fVar.f170133b) && Intrinsics.f(this.f170134c, fVar.f170134c);
    }

    public final int hashCode() {
        return this.f170134c.hashCode() + p.a.d(this.f170132a.hashCode() * 31, 31, this.f170133b);
    }
}
