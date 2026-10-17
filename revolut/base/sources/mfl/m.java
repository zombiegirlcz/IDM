package mfl;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f205032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f205033b;

    public m(List items, l toolbarUIState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbarUIState, "toolbarUIState");
        this.f205032a = items;
        this.f205033b = toolbarUIState;
    }

    @Override // cli.p
    public final List c() {
        return this.f205032a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f205032a, mVar.f205032a) && Intrinsics.f(this.f205033b, mVar.f205033b);
    }

    public final int hashCode() {
        return this.f205033b.hashCode() + (this.f205032a.hashCode() * 31);
    }
}
