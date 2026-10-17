package gp7;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aim.e f145281a;

    public e(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f145281a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f145281a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && this.f145281a.equals(((e) obj2).f145281a);
    }

    public final int hashCode() {
        return this.f145281a.hashCode();
    }
}
