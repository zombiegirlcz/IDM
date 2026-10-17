package lrd;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aim.e f199496a;

    public d(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f199496a = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f199496a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && this.f199496a.equals(((d) obj2).f199496a);
    }

    public final int hashCode() {
        return this.f199496a.hashCode();
    }
}
