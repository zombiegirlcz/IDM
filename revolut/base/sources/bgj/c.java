package bgj;

import aii.r;
import dej.c4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4 f15206a;

    public c(c4 subscriptionTab) {
        Intrinsics.checkNotNullParameter(subscriptionTab, "subscriptionTab");
        this.f15206a = subscriptionTab;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f15206a == ((c) obj2).f15206a;
    }

    public final int hashCode() {
        return this.f15206a.hashCode();
    }
}
