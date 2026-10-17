package qw1;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f249736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f249737b;

    public e(ArrayList items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f249736a = items;
        this.f249737b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f249736a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f249736a.equals(eVar.f249736a) && this.f249737b == eVar.f249737b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f249737b) + (this.f249736a.hashCode() * 31);
    }
}
