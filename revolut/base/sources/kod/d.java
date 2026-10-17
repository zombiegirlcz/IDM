package kod;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f186301a;

    public d(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f186301a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f186301a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f186301a.equals(((d) obj2).f186301a);
    }

    public final int hashCode() {
        return this.f186301a.hashCode();
    }
}
