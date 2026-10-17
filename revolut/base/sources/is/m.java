package is;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f168075a;

    public m(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f168075a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f168075a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && this.f168075a.equals(((m) obj2).f168075a);
    }

    public final int hashCode() {
        return this.f168075a.hashCode();
    }
}
