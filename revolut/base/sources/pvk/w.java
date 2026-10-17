package pvk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class w implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f240307a;

    public w(e0 section) {
        Intrinsics.checkNotNullParameter(section, "section");
        this.f240307a = section;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof w) && Intrinsics.f(this.f240307a, ((w) obj2).f240307a);
    }

    public final int hashCode() {
        return this.f240307a.hashCode();
    }
}
