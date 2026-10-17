package t80;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f268765a;

    public j(i type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f268765a = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && this.f268765a == ((j) obj2).f268765a;
    }

    public final int hashCode() {
        return this.f268765a.hashCode();
    }
}
