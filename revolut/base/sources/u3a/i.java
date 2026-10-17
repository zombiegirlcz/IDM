package u3a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f276849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zm3.b f276850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f276851c;

    public i(List remotes, zm3.b groups, List juniorContacts) {
        Intrinsics.checkNotNullParameter(remotes, "remotes");
        Intrinsics.checkNotNullParameter(groups, "groups");
        Intrinsics.checkNotNullParameter(juniorContacts, "juniorContacts");
        this.f276849a = remotes;
        this.f276850b = groups;
        this.f276851c = juniorContacts;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f276849a, iVar.f276849a) && Intrinsics.f(this.f276850b, iVar.f276850b) && Intrinsics.f(this.f276851c, iVar.f276851c);
    }

    public final int hashCode() {
        return this.f276851c.hashCode() + ((this.f276850b.hashCode() + (this.f276849a.hashCode() * 31)) * 31);
    }
}
