package jbj;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f172648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f172649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f172650c;

    public b(xi0.b currency, List blockchains, a aVar) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(blockchains, "blockchains");
        this.f172648a = currency;
        this.f172649b = blockchains;
        this.f172650c = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f172648a, bVar.f172648a) && Intrinsics.f(this.f172649b, bVar.f172649b) && Intrinsics.f(this.f172650c, bVar.f172650c);
    }

    public final int hashCode() {
        int iD = p.a.d(this.f172648a.hashCode() * 31, 31, this.f172649b);
        a aVar = this.f172650c;
        return iD + (aVar == null ? 0 : aVar.hashCode());
    }
}
