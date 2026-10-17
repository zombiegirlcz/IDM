package o97;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aii.u f223095a;

    public d(aii.u command) {
        Intrinsics.checkNotNullParameter(command, "command");
        this.f223095a = command;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f223095a, ((d) obj2).f223095a);
    }

    public final int hashCode() {
        return this.f223095a.hashCode();
    }
}
