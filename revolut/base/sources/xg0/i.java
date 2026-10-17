package xg0;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f305466a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f305467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f305468c;

    public i(int i, Set modules, p status) {
        Intrinsics.checkNotNullParameter(modules, "modules");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f305466a = i;
        this.f305467b = modules;
        this.f305468c = status;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f305466a == iVar.f305466a && Intrinsics.f(this.f305467b, iVar.f305467b) && Intrinsics.f(this.f305468c, iVar.f305468c);
    }

    public final int hashCode() {
        return this.f305468c.hashCode() + p.a.f(Integer.hashCode(this.f305466a) * 31, 31, this.f305467b);
    }
}
