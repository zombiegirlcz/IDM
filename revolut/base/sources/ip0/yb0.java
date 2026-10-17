package ip0;

import com.revolut.core.ui_kit.models.TextClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class yb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f167296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xb0 f167297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xb0 f167298c;

    public yb0(TextClause quantity, xb0 xb0Var, xb0 xb0Var2) {
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        this.f167296a = quantity;
        this.f167297b = xb0Var;
        this.f167298c = xb0Var2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof yb0)) {
            return false;
        }
        yb0 yb0Var = (yb0) obj2;
        return this.f167296a.equals(yb0Var.f167296a) && this.f167297b.equals(yb0Var.f167297b) && this.f167298c.equals(yb0Var.f167298c);
    }

    public final int hashCode() {
        return this.f167298c.hashCode() + ((this.f167297b.hashCode() + (this.f167296a.hashCode() * 31)) * 31);
    }
}
