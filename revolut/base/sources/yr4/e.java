package yr4;

import aw0.o9;
import aw0.s8;
import bnf.r;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.DotDividerClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.avatar.AvatarModel;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.credit.card.impl.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.youTransactor.uCube.rpc.Constants;
import do3.n;
import java.util.List;
import java.util.Map;
import k71.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ql4.t;
import thf.m;
import tof.a3;
import whf.p;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class e {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f316124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gs4.f f316125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NavBarWithContainerBackground.ImageBackground f316126c;

    public e(m transactionTextResourcesMapper, gs4.f creditCardInstalmentIconMapper) {
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        Intrinsics.checkNotNullParameter(creditCardInstalmentIconMapper, "creditCardInstalmentIconMapper");
        this.f316124a = transactionTextResourcesMapper;
        this.f316125b = creditCardInstalmentIconMapper;
        this.f316126c = new NavBarWithContainerBackground.ImageBackground(new LayeredImage(u.c(new LayeredImage.Layer.Drawable(R$drawable.credit_card_instalment_cancelled_background, new Color.ModifiedColor(new Color.Solid(R$attr.uikit_colorStatusDanger), 0.5f), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 124)), (Float) null, (Float) null, 14), (s8) null, (Color.SolidRes) null, 14);
    }

    public final c a(dj0.d dVar, t tVar, Clause clause, gs4.a aVar, List list, ql4.m mVar) {
        TextLocalisedClause textLocalisedClause;
        int i;
        t tVar2 = t.CANCELLED;
        MoneyClause moneyClauseB = sx4.f.b(1, new Custom(null, tVar == tVar2, null, false, null, Constants.TAG_FD_NON_SECURE_FIRMWARE_VERSION), null, dVar);
        int i2 = d.f316122a[tVar.ordinal()];
        if (i2 == 1) {
            int i3 = mVar == null ? -1 : d.f316123b[mVar.ordinal()];
            if (i3 == -1) {
                i = R$string.credit_card_instalment_plan_state_cancelled;
                textLocalisedClause = new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
            } else if (i3 != 1) {
                if (i3 != 2 && i3 != 3 && i3 != 4 && i3 != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                i = R$string.credit_card_instalment_plan_state_cancelled;
                textLocalisedClause = new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
            } else {
                i = R$string.credit_card_instalment_plan_state_refinanced;
                textLocalisedClause = new TextLocalisedClause(i, null, new Custom(Integer.valueOf(R$attr.uikit_colorGreyTone50), false, null, false, null, 254), 10);
            }
        } else {
            if (i2 != 2 && i2 != 3 && i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = null;
        }
        Clause[] elements = {new TextLocalisedClause(R$string.credit_card_instalment_details_instalment_plan, null, null, 14), textLocalisedClause};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new c(moneyClauseB, clause, new CompositeClause(kotlin.collections.d.L(elements), new DotDividerClause((Integer) null), null, null, 12), aVar, tVar == tVar2 ? AvatarModel.State.DisabledExceptBadge.f58038a : AvatarModel.State.Enabled.f58039a, list, tVar == tVar2 ? this.f316126c : null);
    }

    public final TextClause b(a3 a3Var, p pVar) {
        q qVar = pVar.f297647b;
        Map map = qVar.f181795b;
        Map map2 = qVar.d;
        Map map3 = qVar.e;
        r61.c cVar = qVar.f181799j;
        n nVar = qVar.f181794a;
        return new TextClause(((r) this.f316124a).p(a3Var, map, map2, map3, cVar, nVar != null ? nVar.f116408a : null, qVar.f181806s, qVar.u), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }
}
