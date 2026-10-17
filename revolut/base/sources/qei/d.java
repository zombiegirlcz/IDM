package qei;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cgi.f f245165a;

    public d(cgi.f selection) {
        Intrinsics.checkNotNullParameter(selection, "selection");
        this.f245165a = selection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f245165a, ((d) obj2).f245165a);
    }

    public final int hashCode() {
        return this.f245165a.hashCode();
    }
}
