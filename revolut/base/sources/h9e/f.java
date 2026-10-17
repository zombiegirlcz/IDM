package h9e;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f150236a;

    public f(List pockets) {
        Intrinsics.checkNotNullParameter(pockets, "pockets");
        this.f150236a = pockets;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f150236a, ((f) obj2).f150236a);
    }

    public final int hashCode() {
        return this.f150236a.hashCode();
    }
}
