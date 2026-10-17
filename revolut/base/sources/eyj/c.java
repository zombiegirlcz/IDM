package eyj;

import com.revolut.core.ui_kit.models.Clause;
import jki.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f130865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f130866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f130867c;
    public final boolean d;
    public final Clause e;

    public c(int i, int i2, int i3, boolean z, Clause userPlanClause) {
        Intrinsics.checkNotNullParameter(userPlanClause, "userPlanClause");
        this.f130865a = i;
        this.f130866b = i2;
        this.f130867c = i3;
        this.d = z;
        this.e = userPlanClause;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f130865a == cVar.f130865a && this.f130866b == cVar.f130866b && this.f130867c == cVar.f130867c && this.d == cVar.d && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c(j6.a.b(this.f130867c, j6.a.b(this.f130866b, Integer.hashCode(this.f130865a) * 31, 31), 31), 31, this.d);
    }
}
