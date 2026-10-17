package u09;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f276104a;

    public c(ArrayList children) {
        Intrinsics.checkNotNullParameter(children, "children");
        this.f276104a = children;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f276104a.equals(((c) obj2).f276104a);
    }

    public final int hashCode() {
        return this.f276104a.hashCode();
    }
}
