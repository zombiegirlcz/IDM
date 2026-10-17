package uz8;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class n {

    @NotNull
    public static final m Companion = new m();
    public static final Lazy[] d = {null, null, yhm.j.c(yhm.k.PUBLICATION, new ux7.g(25))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f284640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f284641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f284642c;

    public n(String id10, p progress) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(progress, "progress");
        this.f284640a = null;
        this.f284641b = id10;
        this.f284642c = progress;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f284640a, nVar.f284640a) && Intrinsics.f(this.f284641b, nVar.f284641b) && this.f284642c == nVar.f284642c;
    }

    public final int hashCode() {
        g gVar = this.f284640a;
        return this.f284642c.hashCode() + p.a.c((gVar == null ? 0 : gVar.hashCode()) * 31, 31, this.f284641b);
    }

    public /* synthetic */ n(int i, g gVar, String str, p pVar) {
        if (6 != (i & 6)) {
            j1.f(l.f284639a.getDescriptor(), i, 6);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f284640a = null;
        } else {
            this.f284640a = gVar;
        }
        this.f284641b = str;
        this.f284642c = pVar;
    }
}
