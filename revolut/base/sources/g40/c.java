package g40;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f140312a;

    public c(aim.e items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f140312a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f140312a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f140312a, ((c) obj2).f140312a);
    }

    public final int hashCode() {
        return this.f140312a.hashCode() + (Boolean.hashCode(false) * 923521);
    }
}
