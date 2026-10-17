package ni1;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f215628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f215629b;

    public h(Clause hint, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(hint, "hint");
        this.f215628a = items;
        this.f215629b = hint;
    }

    @Override // cli.p
    public final List c() {
        return this.f215628a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f215628a, hVar.f215628a) && Intrinsics.f(this.f215629b, hVar.f215629b);
    }

    public final int hashCode() {
        return this.f215629b.hashCode() + (this.f215628a.hashCode() * 31);
    }
}
