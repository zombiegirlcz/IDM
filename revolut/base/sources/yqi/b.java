package yqi;

import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes10.dex */
public interface b {
    default Clause a() {
        return new TextClause(b(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    default String b() {
        m70.a.c(t0.f186434a);
        return "";
    }
}
