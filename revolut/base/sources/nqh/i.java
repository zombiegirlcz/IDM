package nqh;

import aw0.e4;
import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f218460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e4 f218461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f218462c;

    public i(List items, e4 filterState, Clause title) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(filterState, "filterState");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f218460a = items;
        this.f218461b = filterState;
        this.f218462c = title;
    }

    @Override // cli.p
    public final List c() {
        return this.f218460a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f218460a, iVar.f218460a) && this.f218461b == iVar.f218461b && Intrinsics.f(this.f218462c, iVar.f218462c);
    }

    public final int hashCode() {
        return this.f218462c.hashCode() + ((this.f218461b.hashCode() + (this.f218460a.hashCode() * 31)) * 31);
    }
}
