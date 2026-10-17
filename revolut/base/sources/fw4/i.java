package fw4;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f138579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f138580b;

    public i(List items, h button) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(button, "button");
        this.f138579a = items;
        this.f138580b = button;
    }

    @Override // cli.p
    public final List c() {
        return this.f138579a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f138579a, iVar.f138579a) && Intrinsics.f(this.f138580b, iVar.f138580b);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f138580b.f138578a) + (this.f138579a.hashCode() * 31);
    }
}
