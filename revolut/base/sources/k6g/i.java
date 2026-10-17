package k6g;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f181715a;

    public i(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f181715a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f181715a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f181715a.equals(((i) obj2).f181715a);
    }

    public final int hashCode() {
        return this.f181715a.hashCode();
    }
}
