package iv7;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f168766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f168767b;

    public f(Clause title, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f168766a = title;
        this.f168767b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f168767b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f168766a, fVar.f168766a) && Intrinsics.f(this.f168767b, fVar.f168767b);
    }

    public final int hashCode() {
        return this.f168767b.hashCode() + (this.f168766a.hashCode() * 31);
    }
}
