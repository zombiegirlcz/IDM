package cgd;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f23943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f23944b;

    public o(Clause toolbarTitle, List items) {
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f23943a = toolbarTitle;
        this.f23944b = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f23944b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f23943a, oVar.f23943a) && Intrinsics.f(this.f23944b, oVar.f23944b);
    }

    public final int hashCode() {
        return this.f23944b.hashCode() + (this.f23943a.hashCode() * 31);
    }
}
