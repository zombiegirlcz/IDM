package l15;

import kotlin.jvm.internal.Intrinsics;
import l15.f;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f191461a;

    public g(k forbearanceApplicationContent) {
        Intrinsics.checkNotNullParameter(forbearanceApplicationContent, "forbearanceApplicationContent");
        this.f191461a = forbearanceApplicationContent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f191461a, ((g) obj2).f191461a);
    }

    public final int hashCode() {
        return this.f191461a.hashCode();
    }
}
