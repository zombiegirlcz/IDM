package kp3;

import iel.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f188166a;

    public c(i event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f188166a = event;
    }

    @Override // kp3.b
    public final i a() {
        return this.f188166a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f188166a, ((c) obj2).f188166a);
    }

    public final int hashCode() {
        return this.f188166a.hashCode();
    }
}
