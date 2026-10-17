package gvi;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f147188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f147189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f147190c;
    public final boolean d;
    public final Clause e;

    public m(Clause clause, TextLocalisedClause continueButtonText, List items, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(continueButtonText, "continueButtonText");
        this.f147188a = items;
        this.f147189b = z;
        this.f147190c = continueButtonText;
        this.d = z3;
        this.e = clause;
    }

    @Override // cli.p
    public final List c() {
        return this.f147188a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f147188a, mVar.f147188a) && this.f147189b == mVar.f147189b && this.f147190c.equals(mVar.f147190c) && this.d == mVar.d && Intrinsics.f(this.e, mVar.e);
    }

    public final int hashCode() {
        int iC = j6.a.c(t61.a.a(j6.a.c(this.f147188a.hashCode() * 31, 31, this.f147189b), 31, this.f147190c), 31, this.d);
        Clause clause = this.e;
        return iC + (clause == null ? 0 : clause.hashCode());
    }
}
