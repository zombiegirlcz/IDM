package mxl;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class i implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f210271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f210272b;

    public i(f groupType, e group) {
        Intrinsics.checkNotNullParameter(groupType, "groupType");
        Intrinsics.checkNotNullParameter(group, "group");
        this.f210271a = groupType;
        this.f210272b = group;
    }

    public final int a(String designId) {
        Intrinsics.checkNotNullParameter(designId, "designId");
        Iterator it8 = this.f210272b.f210266b.iterator();
        int i = 0;
        while (it8.hasNext()) {
            if (Intrinsics.f(((d) it8.next()).f210261a, designId)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f210271a == iVar.f210271a && Intrinsics.f(this.f210272b, iVar.f210272b);
    }

    public final int hashCode() {
        return this.f210272b.hashCode() + (this.f210271a.hashCode() * 31);
    }
}
