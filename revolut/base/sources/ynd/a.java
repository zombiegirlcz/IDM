package ynd;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.f0;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f315441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uib.c f315442b;

    public a(List entries, uib.c savingsUmbrellaNameType) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        Intrinsics.checkNotNullParameter(savingsUmbrellaNameType, "savingsUmbrellaNameType");
        this.f315441a = entries;
        this.f315442b = savingsUmbrellaNameType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f315441a, aVar.f315441a) && this.f315442b == aVar.f315442b;
    }

    public final int hashCode() {
        return this.f315442b.hashCode() + (this.f315441a.hashCode() * 31);
    }

    public /* synthetic */ a(f0 f0Var) {
        this(f0Var, uib.c.SAVINGS);
    }
}
