package ji1;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f174329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f174330b;

    public i(Clause hint, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(hint, "hint");
        this.f174329a = items;
        this.f174330b = hint;
    }

    @Override // cli.p
    public final List c() {
        return this.f174329a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f174329a, iVar.f174329a) && Intrinsics.f(this.f174330b, iVar.f174330b);
    }

    public final int hashCode() {
        return this.f174330b.hashCode() + (this.f174329a.hashCode() * 31);
    }
}
