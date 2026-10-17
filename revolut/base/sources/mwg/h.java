package mwg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f209462a;

    public h(List refs) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.f209462a = refs;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f209462a, ((h) obj2).f209462a);
    }

    public final int hashCode() {
        return this.f209462a.hashCode();
    }
}
