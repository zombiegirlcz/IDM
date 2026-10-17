package o9c;

import com.revolut.core.ui_kit.models.CompositeClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w implements b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CompositeClause f223246a;

    public w(CompositeClause title) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f223246a = title;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && this.f223246a.equals(((w) obj2).f223246a);
    }

    public final int hashCode() {
        return this.f223246a.hashCode();
    }
}
