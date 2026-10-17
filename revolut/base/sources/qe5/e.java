package qe5;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f245075a;

    public e(ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f245075a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f245075a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f245075a.equals(((e) obj2).f245075a);
    }

    public final int hashCode() {
        return this.f245075a.hashCode();
    }
}
