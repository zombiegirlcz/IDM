package e40;

import aw0.o9;
import com.revolut.chat_core.R$string;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import java.util.List;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes19.dex */
public final class l {
    private l() {
    }

    public static CompositeClause a(long j2) {
        TimeClause.Format.INSTANCE.getClass();
        List listK = zhm.v.k(new TimeClause(j2, TimeClause.Format.f57959a, null, null, 12), new TextLocalisedClause(R$string.support_rtc_full_call_time_delimiter, null, null, 14), new TimeClause(j2, TimeClause.Format.TimeDefault.f57977b, null, null, 12));
        m70.a.t(t0.f186434a);
        return new CompositeClause(listK, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
    }
}
