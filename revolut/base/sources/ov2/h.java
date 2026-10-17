package ov2;

import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.card.verification.impl.R$string;
import ip0.ut;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements n {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f229958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n3i.b f229959b;

    public h(d inputData, n3i.b externalCardsMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(externalCardsMapper, "externalCardsMapper");
        this.f229958a = inputData;
        this.f229959b = externalCardsMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        t61.g gVar = this.f229958a.f229956a;
        t61.j jVar2 = gVar.f268142j;
        String str = jVar2 != null ? jVar2.f268160c : null;
        n3i.b bVar = this.f229959b;
        RowDelegate.Model model = new RowDelegate.Model("CARD_HEADER_ID", bVar.c(str), null, null, new TextClause(bVar.d(gVar), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(bVar.b("··", gVar), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, false, null, null, null, null, null, null, null, 0, 0, 0, 0, 1073737580);
        yp0.b.l(model, 0, 0, 0, 0, null, false, 63);
        List listC = u.c(model);
        List listK = v.k(new ut("LIST_ID_STEP 1", new TextLocalisedClause(R$string.cnp_card_verification_transaction_code_info_step_one, null, null, 14), 1, false, null, null, 1016), new ut("LIST_ID_STEP 2", new TextLocalisedClause(R$string.cnp_card_verification_transaction_code_info_step_two, null, null, 14), 2, false, null, null, 1016), new ut("LIST_ID_STEP 3", new TextLocalisedClause(R$string.cnp_card_verification_transaction_code_info_step_three, null, null, 14), 3, false, null, null, 1016));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new e(i2b.a.o(listC, listK));
    }
}
