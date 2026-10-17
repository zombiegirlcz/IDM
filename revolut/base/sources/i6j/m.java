package i6j;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f159028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.i f159029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f159030c;

    public m(l lVar, aw0.i iVar, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f159028a = lVar;
        this.f159029b = iVar;
        this.f159030c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f159030c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f159028a, mVar.f159028a) && Intrinsics.f(this.f159029b, mVar.f159029b) && this.f159030c.equals(mVar.f159030c);
    }

    public final int hashCode() {
        l lVar = this.f159028a;
        int iHashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        aw0.i iVar = this.f159029b;
        return this.f159030c.hashCode() + ((iHashCode + (iVar != null ? iVar.hashCode() : 0)) * 31);
    }
}
