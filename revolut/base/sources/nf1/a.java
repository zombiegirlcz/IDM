package nf1;

import aii.e;
import qf1.c;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f214800a;

    public a() {
        this(null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && this.f214800a == ((a) obj2).f214800a;
    }

    public final int hashCode() {
        c cVar = this.f214800a;
        if (cVar == null) {
            return 0;
        }
        return cVar.hashCode();
    }

    public a(c cVar) {
        this.f214800a = cVar;
    }
}
