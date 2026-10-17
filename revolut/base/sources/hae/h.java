package hae;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f150491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f150492b;

    public h(Clause title, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f150491a = items;
        this.f150492b = title;
    }

    @Override // cli.p
    public final List c() {
        return this.f150491a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f150491a, hVar.f150491a) && Intrinsics.f(this.f150492b, hVar.f150492b);
    }

    public final int hashCode() {
        return this.f150492b.hashCode() + (this.f150491a.hashCode() * 31);
    }
}
