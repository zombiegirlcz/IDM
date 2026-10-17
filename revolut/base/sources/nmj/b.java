package nmj;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f217372a;

    public b(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f217372a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f217372a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f217372a.equals(((b) obj2).f217372a);
    }

    public final int hashCode() {
        return this.f217372a.hashCode();
    }
}
