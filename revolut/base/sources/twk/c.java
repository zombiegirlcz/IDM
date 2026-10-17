package twk;

import aw0.o9;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.text.DecimalFormat;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DecimalFormat f275048a;

    static {
        new TextClause("(", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        new TextClause(")", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        DecimalFormat decimalFormat = new DecimalFormat("0.00'%'");
        decimalFormat.setPositivePrefix("+");
        f275048a = decimalFormat;
    }

    private c() {
    }
}
