package gll;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f144731a;

    public h(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f144731a = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f144731a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f144731a, ((h) obj2).f144731a);
    }

    public final int hashCode() {
        return this.f144731a.hashCode();
    }
}
