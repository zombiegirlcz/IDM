package dfg;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f113897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f113898b;

    public h(List items, f nextButtonState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(nextButtonState, "nextButtonState");
        this.f113897a = items;
        this.f113898b = nextButtonState;
    }

    @Override // cli.p
    public final List c() {
        return this.f113897a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f113897a, hVar.f113897a) && Intrinsics.f(this.f113898b, hVar.f113898b);
    }

    public final int hashCode() {
        return this.f113898b.hashCode() + (this.f113897a.hashCode() * 31);
    }
}
