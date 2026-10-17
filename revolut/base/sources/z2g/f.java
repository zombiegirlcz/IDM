package z2g;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f319074a;

    public f(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f319074a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f319074a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && this.f319074a.equals(((f) obj2).f319074a);
    }

    public final int hashCode() {
        return this.f319074a.hashCode();
    }
}
