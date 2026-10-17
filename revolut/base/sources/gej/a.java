package gej;

import aim.e;
import aw0.o9;
import ch.qos.logback.core.util.FileSize;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.esim.impl.R$string;
import java.util.List;
import yoj.b;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public interface a {
    static CompositeClause a(a aVar, long j2, Custom custom, int i) {
        Custom custom2 = (i & 4) != 0 ? null : custom;
        ((ynj.a) aVar).getClass();
        e eVarB = u.b();
        eVarB.add(j2 < FileSize.GB_COEFFICIENT ? new NumberClause(ynj.a.b(j2, FileSize.MB_COEFFICIENT), ynj.a.f315479b, custom2, null, 8) : j2 < 1099511627776L ? new NumberClause(ynj.a.b(j2, FileSize.GB_COEFFICIENT), ynj.a.f315478a, custom2, null, 8) : new NumberClause(ynj.a.b(j2, 1099511627776L), ynj.a.f315478a, custom2, null, 8));
        eVarB.add(j2 < FileSize.GB_COEFFICIENT ? new TextLocalisedClause(R$string.esim_common_unit_mb, null, custom2, 10) : j2 < 1099511627776L ? new TextLocalisedClause(R$string.esim_common_unit_gb, null, custom2, 10) : new TextLocalisedClause(R$string.esim_common_unit_tb, null, custom2, 10));
        return b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), u.a(eVarB));
    }
}
