package hgb;

import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.retail.salary_account.impl.R$string;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mx0.pc;
import org.jetbrains.annotations.NotNull;
import zhm.f0;

/* JADX INFO: loaded from: classes6.dex */
public final class d0 implements cli.n {

    @NotNull
    public static final b0 Companion = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DateTimeFormatter f152141a = DateTimeFormatter.ofPattern("MMM dd");

    public static RowDelegate.Model b(int i, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2, boolean z, mgb.o reward, List list) {
        Companion.getClass();
        Intrinsics.checkNotNullParameter(reward, "reward");
        return new RowDelegate.Model(j6.a.q("SALARY_HUB_REWARD_", reward.name()), new RowDelegate.Model.MainImage.Image40(new GlyphImage(i, null, null, 6), null, null, false, null, false, 62), textLocalisedClause, null, 0, textLocalisedClause2, null, null, 0, new tf(new yy0.j(new ResourceImage(z ? R$drawable.uikit_icn_24_chevron_right : R$drawable.uikit_icn_24_lock_closed, (Integer) null, (Integer) null, Integer.valueOf(z ? R$attr.uikit_colorGreyTone20 : R$attr.uikit_colorForeground), (List) null, (ImageTransformations) null, (Clause) null, 246))), true, null, false, RowDelegate.Model.b.c.f53268a, list, null, null, null, null, new q(reward), null, 0, 0, 0, 0, 532624344);
    }

    public final List a(mgb.k kVar, boolean z) {
        if (!z) {
            return f0.f322471a;
        }
        mgb.d dVar = kVar.f;
        Instant instant = dVar != null ? dVar.f205231b : null;
        Instant instant2 = dVar != null ? dVar.f205232c : null;
        TextLocalisedClause textLocalisedClauseB = a.b(R$string.salary_account_rewards_free_premium_badge_title_expiring, instant);
        return (textLocalisedClauseB == null && (textLocalisedClauseB = a.b(R$string.salary_account_rewards_free_premium_badge_title_optin, instant2)) == null) ? f0.f322471a : zhm.u.c(new pc("SALARY_HUB_CLAIM_DEADLINE_TAG", new TagViewData(new ResourceImage(R$drawable.uikit_icn_24_time, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254), textLocalisedClauseB, new TagViewData.TagBackground.Solid(new Color.ModifiedColor(new Color.Solid(R$attr.uikit_colorForeground), 0.1f)), null, new TagViewData.TagOutline.Solid(R$attr.uikit_colorTransparent), false, null, null, null, 0, null, 2024), null));
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (u) iii.c.f(domainState.f152145a, new he4.r(this, 23), new hb6.g(this, 23), new hb4.n(this, domainState, 9));
    }

    public final ArrayList d(mgb.k kVar, boolean z) {
        ArrayList<mgb.o> arrayList = kVar.f205249c;
        ArrayList arrayList2 = new ArrayList();
        for (mgb.o oVar : arrayList) {
            boolean z3 = kVar.f205247a;
            int i = c0.f152139a[oVar.ordinal()];
            RowDelegate.Model modelB = null;
            if (i == 1) {
                mgb.f fVar = kVar.d;
                if (fVar != null) {
                    modelB = b(R$drawable.uikit_icn_24_voucher, new TextLocalisedClause(R$string.salary_account_rewards_salary_draw_title, zhm.u.c(new MoneyClause(fVar.f205237b, new MoneyClause.Format.Shorts(false, 63), null, null, 12)), null, 12), new TextLocalisedClause(R$string.salary_account_rewards_salary_draw_subtitle, null, null, 14), z3, oVar, f0.f322471a);
                }
            } else if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                modelB = b(R$drawable.uikit_icn_24_chat, new TextLocalisedClause(R$string.salary_account_rewards_priority_support_title, null, null, 14), new TextLocalisedClause(R$string.salary_account_rewards_priority_support_subtitle, null, null, 14), z3, oVar, a(kVar, z));
            } else if (kVar.f != null) {
                modelB = b(R$drawable.uikit_icn_24_premium, new TextLocalisedClause(R$string.salary_account_rewards_free_premium_title, null, null, 14), new TextLocalisedClause(R$string.salary_account_rewards_free_premium_subscriptions_subtitle, null, null, 14), z3, oVar, a(kVar, z));
            }
            if (modelB != null) {
                arrayList2.add(modelB);
            }
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        return arrayList2;
    }
}
