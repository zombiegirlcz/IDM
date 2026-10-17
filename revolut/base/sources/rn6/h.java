package rn6;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f255509a;

    public h(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f255509a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f255509a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f255509a.equals(((h) obj2).f255509a);
    }

    public final int hashCode() {
        return this.f255509a.hashCode();
    }
}
