package mo2;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f207539a;

    public e(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f207539a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f207539a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f207539a.equals(((e) obj2).f207539a);
    }

    public final int hashCode() {
        return this.f207539a.hashCode();
    }
}
