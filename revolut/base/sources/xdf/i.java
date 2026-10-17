package xdf;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f304437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f304438b;

    public i(Clause title, List groups) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(groups, "groups");
        this.f304437a = title;
        this.f304438b = groups;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f304437a, iVar.f304437a) && Intrinsics.f(this.f304438b, iVar.f304438b);
    }

    public final int hashCode() {
        return this.f304438b.hashCode() + (this.f304437a.hashCode() * 31);
    }
}
