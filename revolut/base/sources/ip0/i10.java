package ip0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i10 extends c8g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f164624a;

    public i10(Clause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f164624a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i10) && Intrinsics.f(this.f164624a, ((i10) obj2).f164624a);
    }

    public final int hashCode() {
        return this.f164624a.hashCode();
    }

    @Override // c8g.a
    public final Clause u() {
        return this.f164624a;
    }
}
