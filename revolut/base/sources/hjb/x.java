package hjb;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class x implements qf1.d {

    @NotNull
    public static final i Companion = new i();
    public static final Lazy[] e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f152701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f152702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f152703c;
    public final uib.c d;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        e = new Lazy[]{null, yhm.j.c(kVar, new hf7.d(9)), yhm.j.c(kVar, new hf7.d(10)), yhm.j.c(kVar, new hf7.d(11))};
    }

    public /* synthetic */ x(int i, String str, t tVar, h hVar, uib.c cVar) {
        if (7 != (i & 7)) {
            j1.f(a.f152680a.getDescriptor(), i, 7);
            throw null;
        }
        this.f152701a = str;
        this.f152702b = tVar;
        this.f152703c = hVar;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = cVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f152701a, xVar.f152701a) && Intrinsics.f(this.f152702b, xVar.f152702b) && Intrinsics.f(this.f152703c, xVar.f152703c) && this.d == xVar.d;
    }

    public final int hashCode() {
        int iHashCode = (this.f152703c.hashCode() + ((this.f152702b.hashCode() + (this.f152701a.hashCode() * 31)) * 31)) * 31;
        uib.c cVar = this.d;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public x(String itemId, t entryPointType, h accountType, uib.c cVar) {
        Intrinsics.checkNotNullParameter(itemId, "itemId");
        Intrinsics.checkNotNullParameter(entryPointType, "entryPointType");
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        this.f152701a = itemId;
        this.f152702b = entryPointType;
        this.f152703c = accountType;
        this.d = cVar;
    }
}
