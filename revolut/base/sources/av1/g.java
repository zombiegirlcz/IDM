package av1;

import com.revolut.feature.apm.core.models.alias.Alias;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f9878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Alias f9879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f9880c;
    public final e d;
    public final String e;

    public g(dj0.d dVar, Alias alias, f creditor, e agent, String str) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(creditor, "creditor");
        Intrinsics.checkNotNullParameter(agent, "agent");
        this.f9878a = dVar;
        this.f9879b = alias;
        this.f9880c = creditor;
        this.d = agent;
        this.e = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f9878a, gVar.f9878a) && Intrinsics.f(this.f9879b, gVar.f9879b) && Intrinsics.f(this.f9880c, gVar.f9880c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e);
    }

    public final int hashCode() {
        dj0.d dVar = this.f9878a;
        int iC = p.a.c((this.f9880c.hashCode() + ((this.f9879b.hashCode() + ((dVar == null ? 0 : dVar.hashCode()) * 31)) * 31)) * 31, 31, this.d.f9875a);
        String str = this.e;
        return iC + (str != null ? str.hashCode() : 0);
    }
}
