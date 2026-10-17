package dx4;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class t3 implements v3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final io3.l f120776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f120777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f120778c;

    public t3(io3.l pocketType, xi0.b currency, Map pocketsById) {
        Intrinsics.checkNotNullParameter(pocketType, "pocketType");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(pocketsById, "pocketsById");
        this.f120776a = pocketType;
        this.f120777b = currency;
        this.f120778c = pocketsById;
    }

    @Override // dx4.v3
    public final io3.d a() {
        Object next;
        Iterator it8 = this.f120778c.values().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            io3.d dVar = (io3.d) next;
            if (dVar.e == this.f120776a && z92.f.l(dVar).equals(this.f120777b)) {
                break;
            }
        }
        return (io3.d) next;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t3)) {
            return false;
        }
        t3 t3Var = (t3) obj2;
        return this.f120776a == t3Var.f120776a && Intrinsics.f(this.f120777b, t3Var.f120777b) && Intrinsics.f(this.f120778c, t3Var.f120778c);
    }

    public final int hashCode() {
        return this.f120778c.hashCode() + h30.l.j(this.f120777b, this.f120776a.hashCode() * 31, 31);
    }
}
