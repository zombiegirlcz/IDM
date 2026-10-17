package mcg;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f204354a;

    public i(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f204354a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f204354a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f204354a.equals(((i) obj2).f204354a);
    }

    public final int hashCode() {
        return this.f204354a.hashCode();
    }
}
