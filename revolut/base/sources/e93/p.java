package e93;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class p implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f123885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f123886b;

    public p(String groupId, List designs) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(designs, "designs");
        this.f123885a = groupId;
        this.f123886b = designs;
    }

    public static p a(p pVar, ArrayList designs) {
        String groupId = pVar.f123885a;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(designs, "designs");
        return new p(groupId, designs);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f123885a, pVar.f123885a) && Intrinsics.f(this.f123886b, pVar.f123886b);
    }

    public final int hashCode() {
        return this.f123886b.hashCode() + (this.f123885a.hashCode() * 31);
    }
}
