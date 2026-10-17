package p37;

import aw0.n6;
import aw0.o9;
import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.freelancer.impl.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m3j.n f232699a;

    public h(m3j.n beneficiaryItemMapper) {
        Intrinsics.checkNotNullParameter(beneficiaryItemMapper, "beneficiaryItemMapper");
        this.f232699a = beneficiaryItemMapper;
    }

    @Override // cli.n
    public final o c(j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.freelancer_tax_profile_payment_account_selection_title, null, null, 14);
        wi0.b bVar = domainState.f232695a;
        wi0.b.Companion.getClass();
        lw0.a aVar = new lw0.a(textLocalisedClause, Intrinsics.f(bVar, wi0.b.p0) ? new TextLocalisedClause(R$string.freelancer_tax_profile_payment_account_selection_subtitle_gb, null, null, 14) : null, null, null, false, 28);
        List<f5j.a> list = domainState.f232696b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (f5j.a aVar2 : list) {
            arrayList.add(RowDelegate.Model.x(this.f232699a.c(aVar2, true), null, null, new TextClause(n61.j.c(aVar2), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, aVar2, 0, 0, 0, 0, null, -4194309, 15));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new cii.b(new aw0.e(false, null, null, new n6(new TextLocalisedClause(R$string.freelancer_tax_profile_payment_account_selection_action_add_account_manually, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55), arrayList, aVar);
    }
}
