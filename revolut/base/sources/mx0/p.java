package mx0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
public final class p {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f209895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f209896b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ms0.e4 f209897c;
    public final Clause d;

    public p(String id10, String str, ms0.e4 state, Clause clause) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f209895a = id10;
        this.f209896b = str;
        this.f209897c = state;
        this.d = clause;
    }

    public static p a(p pVar, String id10, ms0.e4 state, int i) {
        if ((i & 1) != 0) {
            id10 = pVar.f209895a;
        }
        String str = (i & 2) != 0 ? pVar.f209896b : null;
        if ((i & 4) != 0) {
            state = pVar.f209897c;
        }
        Clause clause = (i & 8) != 0 ? pVar.d : null;
        pVar.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        return new p(id10, str, state, clause);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f209895a, pVar.f209895a) && Intrinsics.f(this.f209896b, pVar.f209896b) && this.f209897c == pVar.f209897c && Intrinsics.f(this.d, pVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f209895a.hashCode() * 31;
        String str = this.f209896b;
        int iHashCode2 = (this.f209897c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        Clause clause = this.d;
        return iHashCode2 + (clause != null ? clause.hashCode() : 0);
    }
}
