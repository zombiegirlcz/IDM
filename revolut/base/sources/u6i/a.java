package u6i;

import cli.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f277602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f277603b;

    public a(c cVar, b mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.f277602a = cVar;
        this.f277603b = mode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f277602a == aVar.f277602a && this.f277603b == aVar.f277603b;
    }

    public final int hashCode() {
        c cVar = this.f277602a;
        return this.f277603b.hashCode() + ((cVar == null ? 0 : cVar.hashCode()) * 31);
    }
}
