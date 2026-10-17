package kk9;

import com.revolut.core.ui_kit.models.MoneyClause;
import java.util.List;
import kjk.x;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;

/* JADX INFO: loaded from: classes5.dex */
public final class r implements jki.p {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w80.b f184552a;

    public r(w80.b amountFormatter) {
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        this.f184552a = amountFormatter;
    }

    public static dj0.d b(zh9.i iVar, List list) {
        Lazy lazyY0 = w.y0(new d4h.a(list, 5));
        zh9.h hVar = iVar.f;
        if (hVar != null) {
            Intrinsics.checkNotNullParameter(hVar, "<this>");
            zh9.e[] elements = {zh9.e.Cancelled, zh9.e.Terminated};
            Intrinsics.checkNotNullParameter(elements, "elements");
            if (kotlin.collections.d.y0(elements).contains(hVar.o)) {
                return d8l.d.L(list);
            }
        }
        if (((List) lazyY0.getValue()).isEmpty()) {
            return null;
        }
        return d8l.d.L((List) lazyY0.getValue());
    }

    public static MoneyClause c(dj0.d dVar, boolean z) {
        return new MoneyClause(dVar, new MoneyClause.Format.Defaults(null, null, z, false, 11), null, null, 12);
    }

    public static p d(zh9.i iVar) {
        int i = q.f184551b[iVar.f322282c.ordinal()];
        if (i == 1) {
            zh9.h hVar = iVar.f;
            return (hVar == null || !cp5.c.C(hVar)) ? p.Healthy : p.CancelledAndWithdrawal;
        }
        if (i == 2) {
            return p.Outstanding;
        }
        if (i == 3) {
            return p.Overdue;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        h domainState = (h) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (k) iii.c.f(domainState.f184537c, new x(6), new kd8.f(25), new joa.j(this, domainState, 24));
    }
}
