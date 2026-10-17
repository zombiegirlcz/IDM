package yj7;

import java.util.ArrayList;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f314430a;

    public h(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f314430a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f314430a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f314430a.equals(((h) obj2).f314430a);
    }

    public final int hashCode() {
        return this.f314430a.hashCode();
    }
}
