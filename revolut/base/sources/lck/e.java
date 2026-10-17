package lck;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lw0.m;
import zhm.f0;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f193893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f193894b;

    public e(f0 items, m mVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f193893a = items;
        this.f193894b = mVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f193893a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f193893a, eVar.f193893a) && Intrinsics.f(this.f193894b, eVar.f193894b);
    }

    public final int hashCode() {
        int iHashCode = this.f193893a.hashCode() * 31;
        m mVar = this.f193894b;
        return iHashCode + (mVar == null ? 0 : mVar.hashCode());
    }
}
