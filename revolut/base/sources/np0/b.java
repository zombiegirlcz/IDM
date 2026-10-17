package np0;

import a0.d;
import com.revolut.core.ui_kit.models.Clause;
import koi.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f218106a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f218107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f218108c;
    public final Clause d;

    public b(String listId, long j2, long j3, Clause clause) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        this.f218106a = listId;
        this.f218107b = j2;
        this.f218108c = j3;
        this.d = clause;
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF59236a() {
        return this.f218106a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f218106a, bVar.f218106a) && this.f218107b == bVar.f218107b && this.f218108c == bVar.f218108c && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        int iC = d.c(d.c(this.f218106a.hashCode() * 31, 31, this.f218107b), 31, this.f218108c);
        Clause clause = this.d;
        return iC + (clause == null ? 0 : clause.hashCode());
    }
}
