package wn7;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.ProductSelectionDelegate;
import com.revolut.core.ui_kit.delegates.ec;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.insurance_car.impl.R$plurals;
import com.revolut.feature.insurance_car.impl.R$string;
import com.revolut.feature.insurance_car.impl.data.model.InsurableCar;
import com.revolut.feature.insurance_car.impl.data.model.Policy;
import com.youTransactor.uCube.rpc.Constants;
import java.util.List;
import jki.p;
import kl7.m1;
import kotlin.jvm.internal.Intrinsics;
import mx0.pc;
import org.jetbrains.annotations.NotNull;
import w2a.o;
import xl7.n;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements p {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static ProductSelectionDelegate.Model b(Policy policy) {
        String str = policy.f75286a;
        InsurableCar insurableCar = policy.f75287b;
        TextClause textClauseC = xl7.h.c(insurableCar);
        CompositeClause compositeClauseB = xl7.h.b(insurableCar, true);
        String str2 = policy.d;
        ec ecVar = new ec(str2 != null ? new UrlImage(str2, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286) : new CdnImage("tile", "mobile/car_insurance/rev_10/home", null, null, null, null, Constants.TAG_FC_SPEED_MODE));
        Intrinsics.checkNotNullParameter(policy, "<this>");
        m1 m1Var = policy.f75288c;
        int i = policy.f75294n;
        pc pcVarA = null;
        if (m1Var == m1.CANCELLED) {
            pcVarA = wn7.a.a("cancelled-tag", new ResourceImage(R$drawable.uikit_icn_16_canceled, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.car_insurance_badge_cancelled, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10));
        } else if (m1Var == m1.LAPSED) {
            pcVarA = wn7.a.a("expired-tag", new ResourceImage(R$drawable.uikit_icn_16_time, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.car_insurance_badge_expired, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10));
        } else if (policy.k != null) {
            pcVarA = wn7.a.a("missed-payment-tag", new ResourceImage(R$drawable.uikit_icn_16_exclamation_mark, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorRed), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.car_insurance_badge_missed_payment, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10));
        } else if (i > 0) {
            pcVarA = wn7.a.a("todos-tag", new ResourceImage(R$drawable.uikit_icn_16_exclamation_mark, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorOrange), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedQuantityClause(R$plurals.car_insurance_badge_todos, Integer.valueOf(i), u.c(Integer.valueOf(i)), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8));
        } else if (m1Var == m1.ACTIVE || m1Var == m1.CANCELLING) {
            pcVarA = wn7.a.a("active-tag", new ResourceImage(R$drawable.uikit_icn_16_check_circle, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorLightGreen), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.car_insurance_badge_active, null, new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 10));
        } else if (m1Var == m1.INACTIVE || m1Var == m1.INITIALISING) {
            pcVarA = wn7.a.a("starts-on-tag", new ResourceImage(R$drawable.uikit_icn_24_calendar, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.car_insurance_badge_starts_on, u.c(n.f(policy.f, null, false, 7)), new Custom(Integer.valueOf(R$attr.uikit_colorForeground), false, null, false, null, 254), 8));
        }
        return new ProductSelectionDelegate.Model(str, ecVar, textClauseC, compositeClauseB, v.l(pcVarA), policy, null, false, false, false, 960);
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        f domainState = (f) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (j) iii.c.f(t1.t(domainState.f298715a, domainState.f298716b), new wl3.d(this, 24), new wm9.k(3), new o(this, 19));
    }
}
