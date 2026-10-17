package bu4;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f18678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f18679b;

    public i(List items, h buttonState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        this.f18678a = items;
        this.f18679b = buttonState;
    }

    @Override // cli.p
    public final List c() {
        return this.f18678a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f18678a, iVar.f18678a) && Intrinsics.f(this.f18679b, iVar.f18679b);
    }

    public final int hashCode() {
        return this.f18679b.hashCode() + (this.f18678a.hashCode() * 31);
    }
}
