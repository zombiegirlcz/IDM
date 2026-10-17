package pgj;

import dej.c4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c4 f235975a;

    public c(c4 subscriptionTab) {
        Intrinsics.checkNotNullParameter(subscriptionTab, "subscriptionTab");
        this.f235975a = subscriptionTab;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f235975a == ((c) obj2).f235975a;
    }

    public final c4 f() {
        return this.f235975a;
    }

    public final int hashCode() {
        return this.f235975a.hashCode();
    }
}
