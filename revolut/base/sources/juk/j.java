package juk;

import aah.m;
import aw0.bb;
import aw0.cb;
import cli.n;
import cli.o;
import com.revolut.core.model.money.ScaleMode;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.data.model.Data;
import ip0.jm0;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z0h.q1;
import zhm.d0;
import zhm.f0;
import zhm.u;

/* JADX INFO: loaded from: classes12.dex */
public final class j implements n {

    @NotNull
    private static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1 f178679a;

    public j(luk.c chartPointsMapper, q1 wealthDisclaimersMapper) {
        Intrinsics.checkNotNullParameter(chartPointsMapper, "chartPointsMapper");
        Intrinsics.checkNotNullParameter(wealthDisclaimersMapper, "wealthDisclaimersMapper");
        this.f178679a = wealthDisclaimersMapper;
    }

    public static List a() {
        cb.Companion.getClass();
        jm0 jm0Var = new jm0("SENTIMENT_CHART_ID", bb.c(), null, false, null, null, 0, true, 230, null, false, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, -1480);
        yp0.b.l(jm0Var, 0, 0, 0, 0, null, false, 63);
        return u.c(jm0Var);
    }

    public static MoneyClause b(BigDecimal bigDecimal, Integer num) {
        xi0.b.Companion.getClass();
        return new MoneyClause(mif.a.P(new ej0.b(bigDecimal, xi0.b.f306271c), 0, 3), new MoneyClause.Format.Defaults(null, new ScaleMode.SimpleLen(0, 3), true, false, 9), num != null ? new Custom(num, false, null, false, null, 254) : null, null, 8);
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.d;
        List listB = data != null ? ((m) this.f178679a).b(data) : null;
        if (listB == null) {
            listB = f0.f322471a;
        }
        return new f(d0.E0(listB, (List) iii.c.f(domainState.f178671b, new jt2.d(this, 6), new jme.f(26), new joa.j(this, domainState, 6))));
    }
}
