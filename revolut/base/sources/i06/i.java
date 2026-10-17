package i06;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f157293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f157294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f157295c;

    public i(String listId, int i, h action) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f157293a = listId;
        this.f157294b = i;
        this.f157295c = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f157293a, iVar.f157293a) && this.f157294b == iVar.f157294b && this.f157295c == iVar.f157295c;
    }

    public final int hashCode() {
        return this.f157295c.hashCode() + j6.a.b(this.f157294b, this.f157293a.hashCode() * 31, 31);
    }
}
