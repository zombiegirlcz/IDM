package gyi;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f147892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f147893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f147894c;
    public final Clause d;
    public final Clause e;

    public k(i pageItems, int i, Clause navBarTitle, Clause clause, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(pageItems, "pageItems");
        Intrinsics.checkNotNullParameter(navBarTitle, "navBarTitle");
        this.f147892a = pageItems;
        this.f147893b = i;
        this.f147894c = navBarTitle;
        this.d = clause;
        this.e = textLocalisedClause;
    }

    @Override // cli.o
    public final cli.q a(cli.o oldState) {
        Intrinsics.checkNotNullParameter(oldState, "oldState");
        if (!(oldState instanceof k)) {
            return null;
        }
        return new j(((k) oldState).f147893b != this.f147893b, !Intrinsics.f(r5.f147892a, this.f147892a));
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f147892a, kVar.f147892a) && this.f147893b == kVar.f147893b && this.f147894c.equals(kVar.f147894c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e);
    }

    public final int hashCode() {
        int iB = p.a.b(j6.a.b(this.f147893b, this.f147892a.hashCode() * 31, 31), 31, this.f147894c);
        Clause clause = this.d;
        int iHashCode = (iB + (clause == null ? 0 : clause.hashCode())) * 31;
        Clause clause2 = this.e;
        return iHashCode + (clause2 != null ? clause2.hashCode() : 0);
    }
}
