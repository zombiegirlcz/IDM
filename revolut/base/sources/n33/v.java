package n33;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f211841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f211842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f211843c;
    public final boolean d;

    public v(List items, x toolbarConfig, k kVar, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(toolbarConfig, "toolbarConfig");
        this.f211841a = items;
        this.f211842b = toolbarConfig;
        this.f211843c = kVar;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f211841a, vVar.f211841a) && Intrinsics.f(this.f211842b, vVar.f211842b) && Intrinsics.f(this.f211843c, vVar.f211843c) && this.d == vVar.d;
    }

    public final int hashCode() {
        int iHashCode = (this.f211842b.hashCode() + (this.f211841a.hashCode() * 31)) * 31;
        k kVar = this.f211843c;
        return Boolean.hashCode(this.d) + ((iHashCode + (kVar == null ? 0 : kVar.hashCode())) * 31);
    }
}
