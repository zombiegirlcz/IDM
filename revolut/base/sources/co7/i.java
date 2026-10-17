package co7;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$string;
import ip0.zj;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import xl7.n;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        e domainState = (e) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        CompositeClause compositeClauseN = null;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.car_insurance_mta_decline_text, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = domainState.f25493a ? new TextLocalisedClause(R$string.car_insurance_mta_decline_description_referral, null, null, 14) : new TextLocalisedClause(R$string.car_insurance_mta_decline_description_decline, null, null, 14);
        ComplexImage.Regular regular = new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D151", null, null, null, 30));
        zj zjVar = zj.REGULAR;
        if (domainState.f25493a) {
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.car_insurance_mta_decline_action_chat, null, null, 14);
            int i = R$drawable.uikit_icn_24_chat;
            int i2 = R$attr.uikit_colorAccent;
            m70.a.t(t0.f186434a);
            compositeClauseN = n.n(textLocalisedClause3, i, i2, null, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), 4);
        }
        List listC = u.c(new FullScreenStateDelegate.Model("DECLINE_TILE_ID", textLocalisedClause, textLocalisedClause2, regular, zjVar, compositeClauseN, false, null, null, false, 0, 0, 31680));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return new g(listC);
    }
}
