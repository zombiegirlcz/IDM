package xxi;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f309544a;

    public l(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f309544a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f309544a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && this.f309544a.equals(((l) obj2).f309544a);
    }

    public final int hashCode() {
        return this.f309544a.hashCode();
    }
}
