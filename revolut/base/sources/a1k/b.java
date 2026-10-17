package a1k;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.NewsDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import e1k.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import rzj.f;
import rzj.j;
import zhm.w;

/* JADX INFO: loaded from: classes11.dex */
public final class b {
    public final ArrayList a(List articles) {
        Intrinsics.checkNotNullParameter(articles, "articles");
        List<f> list = articles;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (f fVar : list) {
            String strQ = j6.a.q("NEWS_ARTICLE_DELEGATE_ID_", fVar.d().f101797a);
            TextClause textClause = new TextClause(fVar.d().f101798b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            UrlImage urlImage = new UrlImage(fVar.d().f101799c, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
            CompositeClause compositeClauseA = NewsDelegate.Model.Companion.a(NewsDelegate.Model.INSTANCE, new TimeClause(fVar.d().e.getMillis(), new TimeClause.Format.Pretty(q0.ONLY_TIME), null, null, 12), new TextClause(fVar.d().f, (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            j jVarA = fVar.a();
            CompositeClause compositeClauseA2 = null;
            CompositeClause compositeClauseA3 = jVarA != null ? c.a(jVarA) : null;
            j jVarE = fVar.e();
            if (jVarE != null) {
                compositeClauseA2 = c.a(jVarE);
            }
            arrayList.add(new NewsDelegate.Model(strQ, textClause, urlImage, compositeClauseA3, compositeClauseA2, compositeClauseA, null, NewsDelegate.Model.b.c.f52853a, null, fVar, null, 2720));
        }
        return arrayList;
    }
}
