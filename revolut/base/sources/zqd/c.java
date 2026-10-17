package zqd;

import a0j.m;
import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final TextClause f324464a;

    public static final class a {
        private a() {
        }
    }

    static {
        m70.a.t(t0.f186434a);
        f324464a = new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public static TextClause a(m mVar) {
        String str;
        switch (d.f324465a[mVar.ordinal()]) {
            case 1:
                str = "Spending pace";
                break;
            case 2:
                str = "Projected balance";
                break;
            case 3:
                str = "Recurring payments";
                break;
            case 4:
                str = "Saving pace";
                break;
            case 5:
                str = "Emergency fund";
                break;
            case 6:
                str = "Investing pace";
                break;
            case 7:
                str = "Portfolio risk";
                break;
            case 8:
                str = "Total wealth";
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }
}
