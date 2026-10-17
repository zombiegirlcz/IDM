package b1k;

import aw0.o9;
import aw0.ya;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import ip0.bm0;
import ip0.zl0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public abstract class e {
    public abstract bm0 a(d1k.c cVar);

    public abstract ya b(d1k.c cVar);

    public abstract ArrayList c(d1k.c cVar);

    public abstract void d(d1k.c cVar);

    public abstract CompositeClause e(d1k.c cVar);

    public final zl0 f(d1k.c trendPreview) {
        TextClause textClause;
        Intrinsics.checkNotNullParameter(trendPreview, "trendPreview");
        String strQ = j6.a.q("TDP", trendPreview.getSymbol().f258692c);
        rzj.b symbol = trendPreview.getSymbol();
        String str = symbol.e;
        String str2 = symbol.f258692c;
        if (str != null) {
            textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        } else {
            int i = d.f11807a[symbol.f258690a.ordinal()];
            if (i == 1) {
                String str3 = symbol.d.f306286a;
                xi0.b.Companion.getClass();
                textClause = new TextClause(com.google.android.gms.internal.mlkit_vision_face.a.o(str3, "/", xi0.a.a(str2).f306286a), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            } else {
                if (i != 2 && i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                xi0.b.Companion.getClass();
                textClause = new TextClause(xi0.a.a(str2).f306286a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            }
        }
        CompositeClause compositeClauseE = e(trendPreview);
        ArrayList arrayListC = c(trendPreview);
        ya yaVarB = b(trendPreview);
        d(trendPreview);
        return new zl0(strQ, textClause, compositeClauseE, arrayListC, yaVarB, 1.0f, a(trendPreview), trendPreview.getSymbol());
    }
}
