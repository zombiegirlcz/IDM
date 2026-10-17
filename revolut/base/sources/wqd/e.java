package wqd;

import cli.o;
import com.revolut.core.ui_kit.models.CompositeClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CompositeClause f299440a;

    public e(CompositeClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f299440a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f299440a.equals(((e) obj2).f299440a);
    }

    public final int hashCode() {
        return this.f299440a.hashCode();
    }
}
