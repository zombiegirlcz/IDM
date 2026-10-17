package okk;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aim.e f226142a;

    public k(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f226142a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f226142a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && this.f226142a.equals(((k) obj2).f226142a);
    }

    public final int hashCode() {
        return this.f226142a.hashCode();
    }
}
