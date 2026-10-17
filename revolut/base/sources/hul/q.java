package hul;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import tx0.s3;

/* JADX INFO: loaded from: classes12.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s3 f155755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f155756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f155757c;
    public final boolean d;
    public final Clause e;

    public q() {
        this(63, null);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f155755a, qVar.f155755a) && Intrinsics.f(this.f155756b, qVar.f155756b) && Intrinsics.f(this.f155757c, qVar.f155757c) && this.d == qVar.d && Intrinsics.f(this.e, qVar.e);
    }

    public final int hashCode() {
        s3 s3Var = this.f155755a;
        int iA = p.a.a((s3Var == null ? 0 : s3Var.hashCode()) * 31, 31, this.f155756b);
        Clause clause = this.f155757c;
        int iC = j6.a.c((iA + (clause == null ? 0 : clause.hashCode())) * 961, 31, this.d);
        Clause clause2 = this.e;
        return iC + (clause2 != null ? clause2.hashCode() : 0);
    }

    public q(s3 s3Var, Clause titleClause, TextLocalisedClause textLocalisedClause, boolean z, HtmlClause htmlClause) {
        Intrinsics.checkNotNullParameter(titleClause, "titleClause");
        this.f155755a = s3Var;
        this.f155756b = titleClause;
        this.f155757c = textLocalisedClause;
        this.d = z;
        this.e = htmlClause;
    }

    public /* synthetic */ q(int i, TextLocalisedClause textLocalisedClause) {
        Clause textClause;
        if ((i & 2) != 0) {
            m70.a.c(t0.f186434a);
            textClause = new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else {
            textClause = textLocalisedClause;
        }
        this(null, textClause, null, (i & 16) == 0, null);
    }
}
