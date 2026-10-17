package kv2;

import aw0.o9;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.card.verification.impl.R$string;
import ip0.nb0;
import ip0.pb0;
import ip0.tt;
import ip0.ut;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class m implements n {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f189948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n3i.b f189949b;

    public m(g inputData, n3i.b externalCardsMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(externalCardsMapper, "externalCardsMapper");
        this.f189948a = inputData;
        this.f189949b = externalCardsMapper;
    }

    public final List a() {
        int i = R$string.card_verification_penny_top_up_info_step_one;
        xi0.a aVar = xi0.b.Companion;
        String str = this.f189948a.f189940b;
        aVar.getClass();
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, u.c(new MoneyClause(new dj0.d(1L, xi0.a.a(str)), new MoneyClause.Format.Defaults(null, null, false, false, 15), null, null, 12)), null, 12);
        tt ttVar = tt.FILL;
        List listK = v.k(new ut("LIST_ID_STEP_1", textLocalisedClause, 1, false, ttVar, null, 1000), new ut("LIST_ID_STEP_2", new TextLocalisedClause(R$string.card_verification_penny_top_up_info_step_two, null, null, 14), 2, false, ttVar, null, 1000));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return listK;
    }

    @Override // cli.n
    public final o c(cli.j jVar) {
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        if (domainState instanceof e) {
            pb0 pb0VarB = nb0.b(pb0.Companion, "CARD_HEADER_ID", false, 0, true, 22);
            yp0.b.l(pb0VarB, 0, 0, 0, 0, null, false, 63);
            return new i(d0.E0(a(), u.c(pb0VarB)), false);
        }
        if (!(domainState instanceof d)) {
            throw new NoWhenBranchMatchedException();
        }
        t61.g card = ((d) domainState).f189937a;
        t61.j jVar2 = card.f268142j;
        String str = jVar2 != null ? jVar2.f268160c : null;
        n3i.b bVar = this.f189949b;
        Image imageC = bVar.c(str);
        TextClause textClause = new TextClause(bVar.d(card), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(", ", "divider");
        RowDelegate.Model model = new RowDelegate.Model("CARD_HEADER_ID", imageC, null, null, textClause, new TextClause(a0.d.s("··", card.d, ", ", hx7.l.h(card)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073737580);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        return new i(d0.E0(a(), u.c(model)), true);
    }
}
