package zmk;

import cli.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f323602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lw0.a f323603b;

    public c(ArrayList items, lw0.a aVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f323602a = items;
        this.f323603b = aVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f323602a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f323602a.equals(cVar.f323602a) && this.f323603b.equals(cVar.f323603b);
    }

    public final int hashCode() {
        return this.f323603b.hashCode() + (this.f323602a.hashCode() * 31);
    }
}
