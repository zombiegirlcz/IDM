package vtj;

import a0.d;
import aw0.o9;
import com.revolut.core.ui_kit.delegates.ChallengeMediumImageCardDelegate;
import com.revolut.core.ui_kit.delegates.e3;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.retail.feature.api.rewards_hub.R$plurals;
import com.revolut.retail.feature.api.rewards_hub.R$string;
import d0j.g;
import d0j.h;
import d0j.n;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l80.e;
import l80.f;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f292126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Custom f292127b;

    public c(e dateProvider) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f292126a = dateProvider;
        this.f292127b = new Custom(Integer.valueOf(R$attr.uikit_colorAccentNeutral), false, null, false, null, 254);
    }

    public final ChallengeMediumImageCardDelegate.Model a(h challenge, int i) {
        Intrinsics.checkNotNullParameter(challenge, "challenge");
        g gVar = challenge.i;
        n nVar = challenge.d;
        String strN = d.n("CHALLENGE_SLOT_", i);
        UrlImage urlImage = new UrlImage(challenge.e, null, null, null, 0L, null, null, null, null, null, false, null, null, null, false, false, 524286);
        TextClause textClause = new TextClause(challenge.f110401c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        TagViewData tagViewDataB = null;
        e3 e3Var = gVar != null ? new e3(gVar.f110396a, gVar.f110397b) : null;
        Integer num = challenge.f110403h;
        n nVar2 = n.EXPIRED;
        if (nVar != nVar2) {
            n nVar3 = n.COMPLETED;
            Custom custom = this.f292127b;
            if (nVar == nVar3) {
                if (!challenge.f110404j) {
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.rewards_hub_challenge_new_badge, null, custom, 10);
                    TagViewData.Companion companion = TagViewData.INSTANCE;
                    int i2 = R$attr.uikit_colorAccentNeutral_10;
                    int i3 = R$attr.uikit_colorAccentNeutral;
                    companion.getClass();
                    tagViewDataB = TagViewData.Companion.b(i2, i3, textLocalisedClause, null);
                }
            } else if (num != null) {
                TextClause textClause2 = new TextClause(String.valueOf(num.intValue()), (Style) this.f292127b, (Integer) null, false, (o9) null, (List) null, 124);
                TagViewData.Companion companion2 = TagViewData.INSTANCE;
                int i5 = R$attr.uikit_colorAccentNeutral_10;
                int i6 = R$attr.uikit_colorAccentNeutral;
                companion2.getClass();
                tagViewDataB = TagViewData.Companion.b(i5, i6, textClause2, null);
            } else {
                Instant instant = challenge.f;
                if (instant != null) {
                    Duration durationBetween = Duration.between(((f) this.f292126a).b(), instant);
                    if (!durationBetween.isNegative() && !durationBetween.isZero()) {
                        long days = durationBetween.toDays();
                        long hours = durationBetween.toHours();
                        if (days < 10) {
                            Clause textLocalisedClause2 = days == 0 ? hours < 1 ? new TextLocalisedClause(R$string.rewards_hub_challenge_last_hours, null, custom, 10) : new TextLocalisedClause(R$string.rewards_hub_challenge_hours_left, u.c(Long.valueOf(hours)), custom, 8) : new TextLocalisedQuantityClause(R$plurals.rewards_hub_challenge_days_left, Long.valueOf(days), (List) null, this.f292127b, 12);
                            TagViewData.Companion companion3 = TagViewData.INSTANCE;
                            int i21 = R$attr.uikit_colorAccentNeutral_10;
                            int i22 = R$attr.uikit_colorAccentNeutral;
                            companion3.getClass();
                            tagViewDataB = TagViewData.Companion.b(i21, i22, textLocalisedClause2, null);
                        }
                    }
                }
            }
        }
        return new ChallengeMediumImageCardDelegate.Model(strN, urlImage, textClause, e3Var, tagViewDataB, nVar != nVar2, new a(challenge));
    }
}
