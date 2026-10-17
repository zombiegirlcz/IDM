package fh6;

import cli.p;
import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f135160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f135161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f135162c;

    public j(Clause toolbarTitle, List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        this.f135160a = items;
        this.f135161b = toolbarTitle;
        this.f135162c = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f135160a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f135160a, jVar.f135160a) && Intrinsics.f(this.f135161b, jVar.f135161b) && this.f135162c == jVar.f135162c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f135162c) + p.a.a(this.f135160a.hashCode() * 31, 31, this.f135161b);
    }
}
