package yr5;

import aw0.bb;
import aw0.cb;
import aw0.l1;
import aw0.o9;
import aw0.r2;
import com.revolut.core.ui_kit.delegates.ChatContextualChartDelegate;
import com.revolut.core.ui_kit.delegates.FixedTabsDelegate;
import com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.CurrencyClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CurrencyImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import hw0.x;
import hw0.z;
import ip0.hm0;
import ip0.jm0;
import ip0.ql;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import tx0.k0;
import zhm.d0;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements cli.n {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final gw0.i f316149b = new gw0.i(gw0.t.SINGLE);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o9j.b f316150a;

    public q(o9j.b assetDetailsChartMapper) {
        Intrinsics.checkNotNullParameter(assetDetailsChartMapper, "assetDetailsChartMapper");
        this.f316150a = assetDetailsChartMapper;
    }

    public static ChatContextualChartDelegate.Model a(q qVar, f fVar, r2 r2Var, ql qlVar, FixedTabsDelegate.Model model, Clause clause, Clause clause2, jm0 jm0Var, int i) {
        cb cbVarC;
        List listD1;
        Iterable iterable;
        Clause clause3 = (i & 16) != 0 ? null : clause;
        Clause clause4 = (i & 32) != 0 ? null : clause2;
        jm0 jm0Var2 = (i & 64) != 0 ? null : jm0Var;
        boolean z = (i & 128) == 0;
        String str = fVar.f316132a;
        k0 k0Var = k0.LARGE;
        List list = jm0Var2 != null ? jm0Var2.f164881c : null;
        if (jm0Var2 == null || (cbVarC = jm0Var2.f164880b) == null) {
            cb.Companion.getClass();
            cbVarC = bb.c();
        }
        boolean z3 = jm0Var2 != null ? jm0Var2.d : true;
        x xVar = jm0Var2 != null ? jm0Var2.e : null;
        if (jm0Var2 != null) {
            z = jm0Var2.f164883h;
        }
        boolean z4 = z;
        l1.c cVar = new l1.c(0);
        hm0 hm0Var = hm0.Thick;
        z zVar = jm0Var2 != null ? jm0Var2.f164886m : null;
        int i2 = jm0Var2 != null ? jm0Var2.f164882g : 0;
        if (model == null || (iterable = model.f52343b) == null || (listD1 = d0.d1(iterable)) == null) {
            listD1 = f0.f322471a;
        }
        return new ChatContextualChartDelegate.Model(r2Var, qlVar, clause3, clause4, k0Var, list, cbVarC, z3, xVar, z4, null, true, cVar, hm0Var, zVar, i2, listD1, model != null ? model.f52344c : null, str, f316149b);
    }

    public static Clause d(f fVar) {
        xi0.b bVar = fVar.f316133b;
        if (bVar == null) {
            return new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        CurrencyClause currencyClause = new CurrencyClause(bVar, CurrencyClause.Format.Ticker.f57756a, null, 4);
        m70.a.a(t0.f186434a);
        CompositeClause clause = yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(currencyClause, new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new CurrencyClause(bVar, CurrencyClause.Format.DisplayName.f57755a, null, 4)));
        List list = s.f316152a;
        Intrinsics.checkNotNullParameter(clause, "clause");
        int i = R$drawable.uikit_icn_24_chevron_right;
        Integer numValueOf = Integer.valueOf(R$attr.uikit_colorGreyTone50);
        Float fValueOf = Float.valueOf(24.0f);
        return new CompositeClause(v.k(clause, new ImageClause(i, numValueOf, fValueOf, fValueOf, 16)), null, null, null, 14);
    }

    public final ChatContextualChartDelegate.Model b(f fVar) {
        FixedTabsDelegate.Model modelA = fVar.f316133b != null ? s.a(fVar.f316134c) : null;
        r2 r2Var = new r2(new TextClause("", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), d(fVar));
        xi0.b bVar = fVar.f316133b;
        return a(this, fVar, r2Var, bVar != null ? new ql(6, null, new CurrencyImage(bVar.f306286a, (ImageTransformations) null, (TextLocalisedClause) null, 14)) : null, modelA, null, null, null, 112);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f;
        return new y50.c(data == null ? b(domainState) : (BaseChatBubbleDelegate.BaseModel) iii.c.f(data, new yj2.b(this, domainState, 26), new yi3.d(this, domainState), new soc.f(this, 20, domainState, data)));
    }
}
