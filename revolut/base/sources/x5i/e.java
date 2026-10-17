package x5i;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f302984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f302985b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f302986c;

    public e(Clause clause, Clause clause2, List disclaimers) {
        Intrinsics.checkNotNullParameter(disclaimers, "disclaimers");
        this.f302984a = clause;
        this.f302985b = disclaimers;
        this.f302986c = clause2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f302984a, eVar.f302984a) && Intrinsics.f(this.f302985b, eVar.f302985b) && Intrinsics.f(this.f302986c, eVar.f302986c);
    }

    public final int hashCode() {
        Clause clause = this.f302984a;
        int iD = p.a.d((clause == null ? 0 : clause.hashCode()) * 31, 31, this.f302985b);
        Clause clause2 = this.f302986c;
        return iD + (clause2 != null ? clause2.hashCode() : 0);
    }
}
