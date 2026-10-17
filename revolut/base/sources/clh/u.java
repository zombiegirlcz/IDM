package clh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class u implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f25012b;

    public u(String listId, boolean z) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f25011a = listId;
        this.f25012b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f25011a, uVar.f25011a) && this.f25012b == uVar.f25012b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f25012b) + (this.f25011a.hashCode() * 31);
    }
}
