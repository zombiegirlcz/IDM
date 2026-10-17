package tr9;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.payments.groups.api.R$string;
import do3.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oq9.a0;
import oq9.c0;
import oq9.y;
import oq9.z;
import vq9.j;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements nq9.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nq9.c f273771a;

    public g(nq9.c membersMapper) {
        Intrinsics.checkNotNullParameter(membersMapper, "membersMapper");
        this.f273771a = membersMapper;
    }

    public final LayeredImage a(c0 settlement) {
        Intrinsics.checkNotNullParameter(settlement, "settlement");
        if (settlement instanceof y) {
            return j.f291363a;
        }
        if (settlement instanceof z) {
            return j.f291364b;
        }
        if (settlement instanceof a0) {
            return j.f291365c;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final TextLocalisedClause b(c0 settlement, n user) {
        Intrinsics.checkNotNullParameter(settlement, "settlement");
        Intrinsics.checkNotNullParameter(user, "user");
        boolean zG = oi0.d.G(settlement.h(), user);
        nq9.c cVar = this.f273771a;
        if (zG) {
            return new TextLocalisedClause(R$string.payments_groups_details_transactions_settlement_you_paid_person, u.c(((e) cVar).k(settlement.f())), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8);
        }
        if (oi0.d.G(settlement.f(), user)) {
            return new TextLocalisedClause(R$string.payments_groups_details_transactions_settlement_person_paid_you, u.c(((e) cVar).k(settlement.h())), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8);
        }
        e eVar = (e) cVar;
        return new TextLocalisedClause(R$string.payments_groups_details_transactions_settlement_person_paid_person, v.k(eVar.k(settlement.h()), eVar.k(settlement.f())), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8);
    }
}
