package tmb;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272176a;

    public e(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f272176a = listId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f272176a, ((e) obj2).f272176a);
    }

    public final int hashCode() {
        return this.f272176a.hashCode();
    }
}
