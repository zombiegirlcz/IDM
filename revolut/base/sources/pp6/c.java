package pp6;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f238281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lw0.m f238282b;

    public c(List items, lw0.m mVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f238281a = items;
        this.f238282b = mVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f238281a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f238281a, cVar.f238281a) && Intrinsics.f(this.f238282b, cVar.f238282b);
    }

    public final int hashCode() {
        int iHashCode = this.f238281a.hashCode() * 31;
        lw0.m mVar = this.f238282b;
        return iHashCode + (mVar == null ? 0 : mVar.hashCode());
    }
}
