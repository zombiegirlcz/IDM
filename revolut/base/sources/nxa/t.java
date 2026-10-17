package nxa;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class t implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f220524a;

    public t(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f220524a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f220524a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof t) && this.f220524a.equals(((t) obj2).f220524a);
    }

    public final int hashCode() {
        return this.f220524a.hashCode();
    }
}
