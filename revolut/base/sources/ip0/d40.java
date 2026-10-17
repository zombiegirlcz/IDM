package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d40 implements g40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i40 f163841a;

    public d40(i40 style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f163841a = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d40) && this.f163841a == ((d40) obj2).f163841a;
    }

    public final int hashCode() {
        return this.f163841a.hashCode();
    }
}
