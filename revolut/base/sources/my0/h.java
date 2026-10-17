package my0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f210291a;

    public h(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f210291a = items;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f210291a, ((h) obj2).f210291a);
    }

    public final int hashCode() {
        return this.f210291a.hashCode();
    }
}
