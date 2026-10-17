package h1k;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.core.ui_kit.delegates.gg;
import com.revolut.core.ui_kit.delegates.hg;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import java.util.ArrayList;
import java.util.List;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import z0h.q1;

/* JADX INFO: loaded from: classes11.dex */
public final class o implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0k.a f148606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1 f148607b;

    public o(y0k.a trendPreviewMapper, q1 wealthDisclaimersMapper) {
        Intrinsics.checkNotNullParameter(trendPreviewMapper, "trendPreviewMapper");
        Intrinsics.checkNotNullParameter(wealthDisclaimersMapper, "wealthDisclaimersMapper");
        this.f148606a = trendPreviewMapper;
        this.f148607b = wealthDisclaimersMapper;
    }

    public static hg b(String str, ArrayList arrayList) {
        NewsDelegate.INSTANCE.getClass();
        return new hg(str, arrayList, 2, NewsDelegate.f52830h, null, new gg.c(0), false, false, null, null, 0, R$attr.uikit_dp16, 0, 0, 28624);
    }

    public static NewsDelegate.Model d(rzj.f fVar, q0 q0Var, NewsDelegate.Model.b bVar) {
        rzj.j jVarE;
        String strQ = j6.a.q("NEWS_ARTICLE_DELEGATE_ID_", fVar.d().f101797a);
        TextClause textClause = new TextClause(fVar.d().f101798b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        UrlImage urlImage = new UrlImage(fVar.d().f101799c, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
        CompositeClause compositeClauseA = NewsDelegate.Model.Companion.a(NewsDelegate.Model.INSTANCE, new TimeClause(fVar.d().e.getMillis(), new TimeClause.Format.Pretty(q0Var), null, null, 12), new TextClause(fVar.d().f, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
        rzj.j jVarA = fVar.a();
        CompositeClause compositeClauseA2 = null;
        CompositeClause compositeClauseA3 = jVarA != null ? e1k.c.a(jVarA) : null;
        if (!bVar.equals(NewsDelegate.Model.b.a.f52847a) && (jVarE = fVar.e()) != null) {
            compositeClauseA2 = e1k.c.a(jVarE);
        }
        return new NewsDelegate.Model(strQ, textClause, urlImage, compositeClauseA3, compositeClauseA2, compositeClauseA, null, bVar, null, fVar, null, 2720);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008e  */
    @Override // jki.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jki.m a(jki.i r31) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h1k.o.a(jki.i):jki.m");
    }

    public final List c(Data data, m mVar) {
        return (List) iii.c.f(data, new gwe.d(this, mVar), new gug.c(20), new gna.i(this, mVar, 17));
    }
}
