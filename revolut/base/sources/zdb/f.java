package zdb;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f321436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lw0.a f321437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.h f321438c;

    public f(List items, lw0.a header, aw0.h footer) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(footer, "footer");
        this.f321436a = items;
        this.f321437b = header;
        this.f321438c = footer;
    }

    @Override // cli.p
    public final List c() {
        return this.f321436a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f321436a, fVar.f321436a) && this.f321437b.equals(fVar.f321437b) && this.f321438c.equals(fVar.f321438c);
    }

    public final int hashCode() {
        return this.f321438c.hashCode() + ((this.f321437b.hashCode() + (this.f321436a.hashCode() * 31)) * 31);
    }
}
