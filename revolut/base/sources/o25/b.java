package o25;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f221487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f221488b;

    public b(String sectionId, String tabId) {
        Intrinsics.checkNotNullParameter(sectionId, "sectionId");
        Intrinsics.checkNotNullParameter(tabId, "tabId");
        this.f221487a = sectionId;
        this.f221488b = tabId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f221487a, bVar.f221487a) && Intrinsics.f(this.f221488b, bVar.f221488b);
    }

    public final int hashCode() {
        return this.f221488b.hashCode() + (this.f221487a.hashCode() * 31);
    }
}
