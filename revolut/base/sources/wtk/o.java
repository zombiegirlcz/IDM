package wtk;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class o implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f300020a;

    public o(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f300020a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f300020a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && this.f300020a.equals(((o) obj2).f300020a);
    }

    public final int hashCode() {
        return this.f300020a.hashCode();
    }
}
