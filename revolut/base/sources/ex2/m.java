package ex2;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.HtmlLocalisedClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.card_contactless_limit.api.Mode;
import com.revolut.feature.cards_core.R$string;
import ip0.w30;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements n {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [com.revolut.core.ui_kit.models.Custom, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r7v6 */
    @Override // cli.n
    public final o c(cli.j jVar) {
        Iterable iterable;
        Clause compositeClause;
        ?? r182;
        boolean z;
        a aVar;
        a aVar2;
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        f fVar = domainState.f130337b;
        Mode mode = domainState.f130338c;
        ?? r72 = 0;
        ComplexImage.Regular regular = new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D013", null, null, null, 30));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(domainState.d, null, null, 14);
        boolean z3 = mode instanceof Mode.SingleCard;
        if (z3) {
            compositeClause = new TextLocalisedClause(((Mode.SingleCard) mode).f64514b, null, null, 14);
            r182 = 0;
        } else {
            if (!(mode instanceof Mode.AllCardsLimitWarning)) {
                throw new NoWhenBranchMatchedException();
            }
            d dVar = fVar instanceof d ? (d) fVar : null;
            if (dVar == null || (iterable = dVar.f130341a) == null) {
                iterable = f0.f322471a;
            }
            Mode.AllCardsLimitWarning allCardsLimitWarning = (Mode.AllCardsLimitWarning) mode;
            int i = allCardsLimitWarning.f64511b;
            int i2 = allCardsLimitWarning.f64512c;
            Iterable<h93.f0> iterable2 = iterable;
            ArrayList<Pair> arrayList3 = new ArrayList(w.t(iterable2, 10));
            for (h93.f0 f0Var : iterable2) {
                arrayList3.add(new Pair(f0Var, v04.b.J(f0Var, f0Var.f150111b, r72, r72, 14)));
                r72 = r72;
            }
            ?? r183 = r72;
            ArrayList arrayList4 = new ArrayList(w.t(arrayList3, 10));
            for (Pair pair : arrayList3) {
                h93.f0 f0Var2 = (h93.f0) pair.f186385a;
                CompositeClause compositeClause2 = (CompositeClause) pair.f186386b;
                String str = f0Var2.f150115j;
                if (str != null && str.length() > 0) {
                    compositeClause2 = new CompositeClause(v.k(compositeClause2, new TextClause(j6.a.q(" ··", f0Var2.f150115j), (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, null, null, 14);
                }
                arrayList4.add(compositeClause2);
            }
            ArrayList arrayList5 = new ArrayList();
            arrayList5.add(new HtmlLocalisedClause(i, (List) null, (Integer) null, (Object) null, 30));
            arrayList5.add(new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            int i3 = 0;
            for (Object obj2 : arrayList4) {
                int i5 = i3 + 1;
                if (i3 < 0) {
                    v.s();
                    throw r183;
                }
                arrayList5.add((CompositeClause) obj2);
                if (i3 < arrayList4.size() - 1) {
                    arrayList5.add(new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
                }
                i3 = i5;
            }
            arrayList5.add(new TextClause("\n\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            arrayList5.add(new HtmlLocalisedClause(i2, (List) null, (Integer) null, (Object) null, 30));
            compositeClause = new CompositeClause(arrayList5, null, null, null, 14);
            r182 = r183;
        }
        arrayList.add(new FullScreenStateDelegate.Model("FULL_SCREEN_STATE_ID", textLocalisedClause, compositeClause, regular, null, null, false, null, null, false, 0, 0, 32752));
        if (z3 && (fVar instanceof e) && (aVar2 = ((e) fVar).f130342a) != null) {
            dj0.d dVar2 = aVar2.f130334a.f150154a;
            dj0.d dVar3 = aVar2.f130335b;
            long j2 = dVar2.f115082a;
            long j3 = dVar3.f115082a;
            xi0.b bVar = dVar3.f115083b;
            arrayList2.add(new w30(new TextLocalisedClause(R$string.card_sca_limit_reset_out_of, v.k(new MoneyClause(dVar2, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12), new MoneyClause(dVar3, new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 8), new TextLocalisedClause(R$string.card_sca_limit_reset_amount_left, u.c(new MoneyClause(j2 <= j3 ? new dj0.d(j3 - j2, bVar) : new dj0.d(0L, bVar), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12), (int) (j3 > 2147483647L ? 2147483647L : j3), (int) (j2 <= 2147483647L ? j2 : 2147483647L)));
        }
        Integer num = domainState.f;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(num != null ? num.intValue() : com.revolut.retail.common.ui.R$string.common_action_continue, null, null, 14);
        if (z3) {
            e eVar = fVar instanceof e ? (e) fVar : null;
            Long lValueOf = (eVar == null || (aVar = eVar.f130342a) == null) ? null : Long.valueOf(aVar.f130334a.f150154a.f115082a);
            if ((lValueOf != null ? lValueOf.longValue() : Long.MAX_VALUE) < 0) {
                z = false;
            }
            return new g(d0.E0(arrayList2, arrayList), textLocalisedClause2, z, domainState.e, domainState.f130339g);
        }
        if (!(mode instanceof Mode.AllCardsLimitWarning)) {
            throw new NoWhenBranchMatchedException();
        }
        z = true;
        return new g(d0.E0(arrayList2, arrayList), textLocalisedClause2, z, domainState.e, domainState.f130339g);
    }
}
