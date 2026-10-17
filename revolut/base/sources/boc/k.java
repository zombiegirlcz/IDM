package boc;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f17389a;

    public k(List actions) {
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f17389a = actions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f17389a, ((k) obj2).f17389a);
    }

    public final int hashCode() {
        return this.f17389a.hashCode();
    }
}
