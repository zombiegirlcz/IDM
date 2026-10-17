package xs2;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f308387a;

    public d(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f308387a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f308387a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f308387a.equals(((d) obj2).f308387a);
    }

    public final int hashCode() {
        return this.f308387a.hashCode();
    }
}
