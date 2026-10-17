package gw6;

import hx7.q;
import kotlin.jvm.internal.Intrinsics;
import zm3.e;
import zm3.l;
import zm3.n;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zm3.a f147279a;

    public b(zm3.a contact) {
        Intrinsics.checkNotNullParameter(contact, "contact");
        this.f147279a = contact;
    }

    @Override // gw6.d
    public final String a() {
        String str;
        zm3.a aVar = this.f147279a;
        e eVar = aVar instanceof e ? (e) aVar : null;
        if (eVar != null && (str = eVar.f323340a) != null) {
            return str;
        }
        n nVar = aVar instanceof n ? (n) aVar : null;
        if (nVar != null) {
            return nVar.f323373a;
        }
        return null;
    }

    @Override // gw6.d
    public final String b() {
        return q.v(this.f147279a);
    }

    @Override // gw6.d
    public final String c() {
        zm3.a aVar = this.f147279a;
        l lVar = aVar instanceof l ? (l) aVar : null;
        if (lVar != null) {
            return lVar.N0();
        }
        return null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f147279a, ((b) obj2).f147279a);
    }

    public final int hashCode() {
        return this.f147279a.hashCode();
    }
}
