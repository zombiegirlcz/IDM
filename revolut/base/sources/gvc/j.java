package gvc;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f147131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f147132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f147133c;
    public final Object d;

    public j(aim.e items, Integer num, boolean z, Clause footerDescriptionClause) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(footerDescriptionClause, "footerDescriptionClause");
        this.f147131a = items;
        this.f147132b = num;
        this.f147133c = z;
        this.d = footerDescriptionClause;
    }

    @Override // cli.p
    public final List c() {
        return this.f147131a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f147131a, jVar.f147131a) && Intrinsics.f(this.f147132b, jVar.f147132b) && this.f147133c == jVar.f147133c && this.d.equals(jVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f147131a.hashCode() * 31;
        Integer num = this.f147132b;
        return this.d.hashCode() + j6.a.c((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.f147133c);
    }
}
