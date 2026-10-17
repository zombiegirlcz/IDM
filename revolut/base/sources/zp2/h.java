package zp2;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f324166a;

    public h(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f324166a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f324166a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f324166a.equals(((h) obj2).f324166a);
    }

    public final int hashCode() {
        return this.f324166a.hashCode();
    }
}
