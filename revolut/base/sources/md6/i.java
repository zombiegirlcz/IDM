package md6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements ld6.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f204490a;

    public i(h type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f204490a = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f204490a == ((i) obj2).f204490a;
    }

    public final int hashCode() {
        return this.f204490a.hashCode();
    }
}
