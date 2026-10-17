package j33;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170951a;

    public n(String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f170951a = listId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && Intrinsics.f(this.f170951a, ((n) obj2).f170951a);
    }

    public final int hashCode() {
        return this.f170951a.hashCode();
    }
}
