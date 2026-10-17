package igk;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f161256a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f161257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f161258c;

    public l0() {
        this(7, null, null);
    }

    public final Clause a() {
        return this.f161256a;
    }

    public final Integer b() {
        return this.f161257b;
    }

    public final boolean c() {
        return this.f161258c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.f161256a, l0Var.f161256a) && Intrinsics.f(this.f161257b, l0Var.f161257b) && this.f161258c == l0Var.f161258c;
    }

    public final int hashCode() {
        Clause clause = this.f161256a;
        int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
        Integer num = this.f161257b;
        return Boolean.hashCode(this.f161258c) + ((iHashCode + (num != null ? num.hashCode() : 0)) * 31);
    }

    public l0(int i, TextLocalisedClause textLocalisedClause, Integer num) {
        textLocalisedClause = (i & 1) != 0 ? null : textLocalisedClause;
        num = (i & 2) != 0 ? null : num;
        boolean z = (i & 4) == 0;
        this.f161256a = textLocalisedClause;
        this.f161257b = num;
        this.f161258c = z;
    }
}
