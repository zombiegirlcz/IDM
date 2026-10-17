package rva;

import cli.p;
import com.revolut.core.ui_kit.models.CompositeClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f257736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CompositeClause f257737b;

    public c(CompositeClause navBarTitle, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        this.f257736a = items;
        this.f257737b = navBarTitle;
    }

    @Override // cli.p
    public final List c() {
        return this.f257736a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f257736a, cVar.f257736a) && this.f257737b.equals(cVar.f257737b);
    }

    public final int hashCode() {
        return this.f257737b.hashCode() + (this.f257736a.hashCode() * 31);
    }
}
