package e25;

import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import yfe.a1;
import yfe.d1;
import yfe.e0;
import yfe.h;
import yfe.k;
import yfe.p0;
import yfe.q0;
import yfe.s0;
import yfe.t0;
import yfe.v0;
import yfe.w0;

/* JADX INFO: loaded from: classes22.dex */
public final class b implements yfe.b {
    @Override // yfe.b
    public final p0 a(h.c cVar) {
        int i;
        e0 snapshot = (e0) cVar;
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        int i2 = a.f122029a[snapshot.f313250c.ordinal()];
        if (i2 == 1) {
            i = R$string.home_total_wealth_category_credit_subtitle_loans_and_cards_and_mortgages;
        } else if (i2 == 2) {
            i = R$string.home_total_wealth_category_credit_subtitle_loans_and_cards;
        } else if (i2 == 3) {
            i = R$string.home_total_wealth_category_credit_subtitle_loans;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$string.home_total_wealth_category_credit_subtitle_credit_cards;
        }
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
        return new p0(R$drawable.uikit_icn_24_credit, new TextLocalisedClause(R$string.home_total_wealth_category_credit_title, null, null, 14), textLocalisedClause);
    }

    @Override // yfe.b
    public final q0 b(h.a aVar) {
        k snapshot = (k) aVar;
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.home_total_wealth_category_credit_title, null, null, 14);
        dj0.d dVar = snapshot.d;
        dj0.d dVar2 = snapshot.i;
        int i = snapshot.e;
        a1 a1Var = new a1(LayeredImage.INSTANCE.i(R$drawable.uikit_icn_24_credit, R$attr.uikit_colorWhite, R$attr.uikit_colorTeal));
        return new q0(textLocalisedClause, dVar, new d1(i != 1 ? i != 2 ? new v0(a1Var, new t0(i - 1)) : new v0(a1Var, new s0(a1Var)) : new w0(a1Var), false), dVar2, 24);
    }
}
