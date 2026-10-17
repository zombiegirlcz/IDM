package t2a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f267521a;

    public f(String selectedTabId) {
        Intrinsics.checkNotNullParameter(selectedTabId, "selectedTabId");
        this.f267521a = selectedTabId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f267521a, ((f) obj2).f267521a);
    }

    public final int hashCode() {
        return this.f267521a.hashCode();
    }
}
