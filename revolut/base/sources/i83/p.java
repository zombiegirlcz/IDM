package i83;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.tf;
import com.revolut.core.ui_kit.image.type.complex.ComplexImage;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.n0;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.data.model.Data;
import com.revolut.feature.cards.models.revolutcard.ReactivationEligibility;
import com.revolut.feature.cards.models.revolutcard.TerminatedCard;
import com.revolut.feature.cards_core.R$string;
import ip0.zj;
import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import te0.w;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class p implements cli.n {

    @NotNull
    public static final n Companion = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m93.d f159429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f159430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clock f159431c;
    public final Object d;

    public p(m93.d cardThumbnailImageProvider, gte.a featureToggleInteractor, Clock clock) {
        Intrinsics.checkNotNullParameter(cardThumbnailImageProvider, "cardThumbnailImageProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(clock, "clock");
        this.f159429a = cardThumbnailImageProvider;
        this.f159430b = featureToggleInteractor;
        this.f159431c = clock;
        this.d = w.y0(new hq1.f(this, 21));
    }

    public static List d(int i) {
        List listC = u.c(new FullScreenStateDelegate.Model("NO_CARDS_LIST_ID", new TextLocalisedClause(i, null, null, 14), null, new ComplexImage.Regular(com.revolut.core.ui_kit_core.displayers.image.models.b.c("3D015", null, null, null, 30)), zj.REGULAR, null, false, null, null, false, 0, 0, 32740));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return listC;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    public final TextLocalisedClause a(TerminatedCard terminatedCard) {
        int i;
        ReactivationEligibility reactivationEligibility = terminatedCard.f65551h;
        int i2 = o.f159428b[reactivationEligibility.f65543b.ordinal()];
        ?? r2 = this.d;
        switch (i2) {
            case 1:
                i = R$string.card_state_reason_expired;
                break;
            case 2:
                i = R$string.card_state_reason_replaced;
                break;
            case 3:
                i = R$string.card_state_reason_reactivation_period_passed;
                break;
            case 4:
                i = R$string.card_state_reason_limit_reached;
                break;
            case 5:
                i = R$string.card_state_reason_refunded;
                break;
            case 6:
                i = R$string.card_state_reason_lost;
                break;
            case 7:
                i = R$string.card_state_reason_compromised;
                break;
            case 8:
                if (((Boolean) r2.getValue()).booleanValue() && reactivationEligibility.f65542a) {
                    Instant instantOfEpochMilli = Instant.ofEpochMilli(terminatedCard.f);
                    Clock clock = this.f159431c;
                    return new TextLocalisedClause(R$string.card_state_reason_reactivate_by, u.c(new TimeClause(instantOfEpochMilli.atZone(clock.getZone()).plusDays(30L).toInstant().toEpochMilli(), new TimeClause.Format.DateMedium(n0.HIDE_CURRENT_YEAR), null, clock.getZone(), 4)), null, 12);
                }
                i = R$string.card_state_reason_terminated_by_user;
                break;
            case 9:
                i = R$string.card_state_reason_terminated_by_revolut;
                break;
            case 10:
                i = R$string.card_state_reason_undelivered;
                break;
            case 11:
                i = R$string.card_state_reason_damaged;
                break;
            case 12:
                i = R$string.card_state_reason_active_chargeback;
                break;
            case 13:
                i = R$string.card_state_reason_cancelled_chargeback;
                break;
            case 14:
                i = R$string.card_state_reason_successful_chargeback;
                break;
            case 15:
                i = R$string.card_state_reason_too_many_chargebacks;
                break;
            case 16:
                i = !((Boolean) r2.getValue()).booleanValue() ? R$string.card_state_reason_unsupported : R$string.card_state_reason_card_order_cancelled;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new TextLocalisedClause(i, null, null, 14);
    }

    public final ArrayList b(ArrayList arrayList) {
        TextLocalisedClause textLocalisedClauseA;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            TerminatedCard terminatedCard = (TerminatedCard) it8.next();
            ReactivationEligibility reactivationEligibility = terminatedCard.f65551h;
            boolean z = reactivationEligibility.f65542a || reactivationEligibility.f65543b == h93.n0.TERMINATED_BY_REVOLUT;
            String str = terminatedCard.f65547a;
            RowDelegate.Model.b bVar = z ? RowDelegate.Model.b.c.f53268a : RowDelegate.Model.b.a.f53266a;
            RowDelegate.Model.MainImage.Image40 image40 = new RowDelegate.Model.MainImage.Image40(((ia3.h) this.f159429a).b(terminatedCard.f65549c, false), null, null, false, null, false, 62);
            CompositeClause compositeClauseI = v04.b.I(terminatedCard, terminatedCard.f65550g, 12);
            String str2 = terminatedCard.d;
            LocalDate localDate = terminatedCard.e;
            tf tfVar = null;
            if (str2 != null) {
                int i = R$string.card_subtitle_last_four_expiry_and_state;
                TextClause textClause = new TextClause(str2, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
                String str3 = localDate.format(DateTimeFormatter.ofPattern("MM/yy"));
                Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                textLocalisedClauseA = new TextLocalisedClause(i, v.k(textClause, new TextClause(str3, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), a(terminatedCard)), null, 12);
            } else {
                textLocalisedClauseA = a(terminatedCard);
            }
            TextLocalisedClause textLocalisedClause = textLocalisedClauseA;
            if (terminatedCard.f65551h.f65543b == h93.n0.TERMINATED_BY_REVOLUT) {
                tfVar = new tf(4, new ResourceImage(R$drawable.uikit_icn_24_info_outline, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), true);
            }
            arrayList2.add(new RowDelegate.Model(str, image40, compositeClauseI, null, 0, textLocalisedClause, null, null, 0, tfVar, z, null, false, bVar, null, null, null, null, null, terminatedCard, null, 0, 0, 0, 0, 532657112));
        }
        yp0.b.k(arrayList2, 0, 0, 0, 0, 31);
        return arrayList2;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        int i;
        TextLocalisedClause textLocalisedClause;
        f domainState = (f) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f159419b;
        j jVar2 = domainState.f159418a;
        List list = (List) iii.c.f(data, new i6j.p(this, 11), new m(this, 0), new hb4.n(this, domainState, 27));
        TextLocalisedClause textLocalisedClause2 = null;
        if (!domainState.f159420c) {
            int i2 = o.f159427a[jVar2.ordinal()];
            if (i2 == 1) {
                textLocalisedClause = new TextLocalisedClause(R$string.card_reactivate_title, null, null, 14);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause = new TextLocalisedClause(R$string.card_reactivate_cannot_reactivate_title, null, null, 14);
            }
            textLocalisedClause2 = textLocalisedClause;
        }
        int i3 = o.f159427a[jVar2.ordinal()];
        if (i3 == 1) {
            i = R$drawable.uikit_icn_24_cross;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R$drawable.uikit_icn_24_back_button_arrow;
        }
        return new k(list, textLocalisedClause2, Integer.valueOf(i));
    }
}
