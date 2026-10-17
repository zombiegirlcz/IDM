package vka;

import aw0.o9;
import awk.j;
import bka.a0;
import bka.b0;
import bka.x;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.product_article.impl.R$string;
import com.revolut.feature.product_article.impl.ui.screen.details.exceptions.ProductArticleDisclaimerParsingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import nkm.k;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements fka.a {

    @NotNull
    public static final C1601a Companion = new C1601a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Regex f289893a = new Regex("%s");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Regex f289894b = new Regex("%(?!s)");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Regex f289895c = new Regex("<[^>]+>(.*?)</[^>]+>");

    /* JADX INFO: renamed from: vka.a$a, reason: collision with other inner class name */
    public static final class C1601a {
        private C1601a() {
        }
    }

    public final TextClause a(b0 item, Function1 linksMapper) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(linksMapper, "linksMapper");
        x xVar = item.f16298a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        k kVar = new k(Regex.c(this.f289893a, xVar.f16344a));
        int i = 0;
        while (kVar.hasNext()) {
            Object next = kVar.next();
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            MatchResult matchResult = (MatchResult) next;
            a0 a0Var = (a0) d0.e0(i, xVar.f16345b);
            if (a0Var != null) {
                linkedHashMap.put(Integer.valueOf(matchResult.getRange().f186448a), new TextLocalisedClause(R$string.product_article_disclaimer_link, u.c(new HtmlClause(1, 28, (Integer) null, (Object) null, a0Var.f16295a)), (Style) linksMapper.invoke(a0Var), 8));
            }
            i = i2;
        }
        String strH = this.f289895c.h(xVar.f16344a, new j(linkedHashMap, 20));
        if (this.f289894b.a(strH)) {
            throw new ProductArticleDisclaimerParsingException("Disclaimer parse error: Unexpected '%' character found in the normalised text. Ensure all placeholders have been correct configured.");
        }
        List listP0 = d0.P0(linkedHashMap.entrySet(), new b());
        ArrayList arrayList = new ArrayList(w.t(listP0, 10));
        Iterator it8 = listP0.iterator();
        while (it8.hasNext()) {
            arrayList.add((Clause) ((Map.Entry) it8.next()).getValue());
        }
        return new TextClause(strH, (Style) null, (Integer) null, false, (o9) null, (List) arrayList, 94);
    }
}
