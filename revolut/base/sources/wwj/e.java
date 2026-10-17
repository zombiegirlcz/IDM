package wwj;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f300697a;

    public e(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f300697a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f300697a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f300697a, ((e) obj2).f300697a);
    }

    public final int hashCode() {
        return this.f300697a.hashCode();
    }
}
