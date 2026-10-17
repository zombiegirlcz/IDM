package qg1;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f245636a;

    public m(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f245636a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f245636a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f245636a, ((m) obj2).f245636a);
    }

    public final int hashCode() {
        return this.f245636a.hashCode();
    }
}
