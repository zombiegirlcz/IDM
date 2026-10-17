package g5a;

import aw0.k7;
import aw0.o9;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.ImageClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.payments.messaging.data.api.model.MessageItem;
import com.revolut.feature.payments.messaging.data.api.model.MessageType;
import com.revolut.feature.payments.who_to_transfer.impl.R$string;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import ru9.k0;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tbk.c f140701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yik.h f140702b;

    public c(tbk.c planGiftingBirthdayInteractor, yik.h pricingPlanStringMapper, k0 transferTransactionAmountExtractor) {
        Intrinsics.checkNotNullParameter(planGiftingBirthdayInteractor, "planGiftingBirthdayInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanStringMapper, "pricingPlanStringMapper");
        Intrinsics.checkNotNullParameter(transferTransactionAmountExtractor, "transferTransactionAmountExtractor");
        this.f140701a = planGiftingBirthdayInteractor;
        this.f140702b = pricingPlanStringMapper;
    }

    public static void a(String str) {
        IllegalStateException illegalStateException = new IllegalStateException(str);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
    }

    public static Clause c(MessageItem messageItem) {
        MessageType messageType = messageItem.f79535h;
        if (messageType instanceof MessageType.Text) {
            return new TextClause(((MessageType.Text) messageType).f79560b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        if ((messageType instanceof MessageType.Gif) || (messageType instanceof MessageType.GiphyGifId)) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.payments_chat_home_subtitle_you_sent_a_gif, null, null, 14);
            m70.a.t(t0.f186434a);
            return new CompositeClause(zhm.v.k(textLocalisedClause, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ImageClause(R$drawable.uikit_icn_20_gif, Integer.valueOf(R$attr.uikit_colorGreyTone50), (Float) null, (Float) null, 28)), null, null, null, 14);
        }
        if (messageType instanceof MessageType.Sticker) {
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.payments_chat_home_subtitle_you_sent_a_sticker, null, null, 14);
            m70.a.t(t0.f186434a);
            return new CompositeClause(zhm.v.k(textLocalisedClause2, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ImageClause(R$drawable.uikit_icn_20_keyboard_sticker, Integer.valueOf(R$attr.uikit_colorGreyTone50), (Float) null, (Float) null, 28)), null, null, null, 14);
        }
        if ((messageType instanceof MessageType.Key) || (messageType instanceof MessageType.Emoji)) {
            a("Message (Outgoing) with type " + messageType);
            return null;
        }
        if (messageType instanceof MessageType.PricingPlanGift) {
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.payments_chat_home_subtitle_gift_sender, null, null, 14);
            m70.a.t(t0.f186434a);
            return yoj.b.w(yoj.b.w(textLocalisedClause3, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new ImageClause(R$drawable.uikit_icn_20_rewards, Integer.valueOf(R$attr.uikit_colorGreyTone50), (Float) null, (Float) null, 28));
        }
        if (messageType instanceof MessageType.PlanReferral) {
            return new TextLocalisedClause(R$string.payments_chat_home_subtitle_plan_referral_sender, null, null, 14);
        }
        if (messageType instanceof MessageType.Referral) {
            return new TextClause(((MessageType.Referral) messageType).d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        if (messageType instanceof MessageType.SalaryReferral) {
            return new TextClause(((MessageType.SalaryReferral) messageType).d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static boolean d(oq9.o oVar, e3a.a aVar) {
        return aVar != null && Intrinsics.f(oi0.d.k(oVar), aVar.f122247c) && Intrinsics.f(oi0.d.t(oVar), aVar.f122246b);
    }

    public static MoneyClause e(dj0.d dVar) {
        return cp5.d.z(dVar.f115083b) ? u5l.a.b(dVar, null, k7.NEVER, null, 11) : new MoneyClause(dVar, new MoneyClause.Format.Defaults(k7.NEVER, null, false, false, 14), null, null, 12);
    }

    public static Clause f(Clause clause, String str, boolean z) {
        return z ? new TextLocalisedClause(R$string.payments_chat_home_subtitle_group_bills_prefix_you, zhm.u.c(clause), null, 12) : str != null ? new TextLocalisedClause(R$string.payments_chat_home_subtitle_group_bills_prefix_someone, zhm.v.k(str, clause), null, 12) : clause;
    }

    public final Clause b(MessageItem messageItem) {
        MessageType messageType = messageItem.f79535h;
        if (messageType instanceof MessageType.Text) {
            return new TextClause(((MessageType.Text) messageType).f79560b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        if ((messageType instanceof MessageType.Gif) || (messageType instanceof MessageType.GiphyGifId)) {
            TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.payments_chat_home_subtitle_sent_a_gif, null, null, 14);
            m70.a.t(t0.f186434a);
            return new CompositeClause(zhm.v.k(textLocalisedClause, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ImageClause(R$drawable.uikit_icn_20_gif, Integer.valueOf(R$attr.uikit_colorGreyTone50), (Float) null, (Float) null, 28)), null, null, null, 14);
        }
        if (messageType instanceof MessageType.Sticker) {
            TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R$string.payments_chat_home_subtitle_sent_a_sticker, null, null, 14);
            m70.a.t(t0.f186434a);
            return new CompositeClause(zhm.v.k(textLocalisedClause2, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new ImageClause(R$drawable.uikit_icn_20_keyboard_sticker, Integer.valueOf(R$attr.uikit_colorGreyTone50), (Float) null, (Float) null, 28)), null, null, null, 14);
        }
        if (messageType instanceof MessageType.PricingPlanGift) {
            TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.payments_chat_home_subtitle_gift_receiver, null, null, 14);
            m70.a.t(t0.f186434a);
            return yoj.b.w(yoj.b.w(textLocalisedClause3, new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new ImageClause(R$drawable.uikit_icn_20_rewards, Integer.valueOf(R$attr.uikit_colorGreyTone50), (Float) null, (Float) null, 28));
        }
        if (messageType instanceof MessageType.PlanReferral) {
            return new TextLocalisedClause(R$string.payments_chat_home_subtitle_plan_referral_receiver, zhm.u.c(this.f140702b.c(((MessageType.PlanReferral) messageType).d, null)), null, 12);
        }
        if ((messageType instanceof MessageType.Key) || (messageType instanceof MessageType.Emoji)) {
            a("Message (Incoming) with type " + messageType);
            return null;
        }
        if (messageType instanceof MessageType.Referral) {
            return new TextClause(((MessageType.Referral) messageType).d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        if (messageType instanceof MessageType.SalaryReferral) {
            return new TextClause(((MessageType.SalaryReferral) messageType).d, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        throw new NoWhenBranchMatchedException();
    }
}
