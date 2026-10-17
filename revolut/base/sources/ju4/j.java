package ju4;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f178585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f178586b;

    public j(List items, i buttonState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonState, "buttonState");
        this.f178585a = items;
        this.f178586b = buttonState;
    }

    @Override // cli.p
    public final List c() {
        return this.f178585a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f178585a, jVar.f178585a) && Intrinsics.f(this.f178586b, jVar.f178586b);
    }

    public final int hashCode() {
        return this.f178586b.hashCode() + (this.f178585a.hashCode() * 31);
    }
}
