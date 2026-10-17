package qei;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cgi.f f245164a;

    public c(cgi.f selection) {
        Intrinsics.checkNotNullParameter(selection, "selection");
        this.f245164a = selection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f245164a, ((c) obj2).f245164a);
    }

    public final int hashCode() {
        return this.f245164a.hashCode();
    }
}
