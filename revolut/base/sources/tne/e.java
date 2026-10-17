package tne;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f272431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f272432b;

    public e(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f272431a = items;
        this.f272432b = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f272431a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f272431a, eVar.f272431a) && this.f272432b == eVar.f272432b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f272432b) + (this.f272431a.hashCode() * 31);
    }
}
