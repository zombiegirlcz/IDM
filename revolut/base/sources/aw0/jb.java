package aw0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class jb implements kb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10381a;

    public jb(aim.e stacks) {
        Intrinsics.checkNotNullParameter(stacks, "stacks");
        this.f10381a = stacks;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof jb) && Intrinsics.f(this.f10381a, ((jb) obj2).f10381a);
    }

    public final int hashCode() {
        return this.f10381a.hashCode();
    }
}
