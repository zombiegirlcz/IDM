package ip0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f167109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f167110b;

    public x80(String listId, int i) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f167109a = listId;
        this.f167110b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x80)) {
            return false;
        }
        x80 x80Var = (x80) obj2;
        return Intrinsics.f(this.f167109a, x80Var.f167109a) && this.f167110b == x80Var.f167110b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f167110b) + (this.f167109a.hashCode() * 31);
    }
}
