package e40;

import aw0.ka;
import aw0.o9;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.chat.ChatApi$Toggles;
import com.revolut.chat.data.repository.chat.ChatAgent;
import com.revolut.chat.data.repository.chat.MessageAuthor;
import com.revolut.chat.domain.model.LastMessage;
import com.revolut.chat.domain.model.call.Call;
import com.revolut.chat_core.R$string;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.ActionWidgetDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.SwipeToActionDelegate;
import com.revolut.core.ui_kit.delegates.wh;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.NewBadgeContent;
import com.revolut.core.ui_kit.models.NumberClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.badge.CircleBadgeModel;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CircleTransformation;
import com.revolut.core.ui_kit_core.displayers.image.transformation.CustomColors;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.in_app_calls.InAppCallStateWithData;
import com.youTransactor.uCube.rpc.Constants;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import k50.x;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import v30.c0;
import w30.i;
import w30.y;

/* JADX INFO: loaded from: classes19.dex */
public final class w implements n40.b {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f122369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f122370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z50.g f122371c;
    public final j30.c d;

    public w(l80.e dateProvider, x chatMessageTextMapper, z50.e inAppCallUiStateProvider, z50.g liveAgentAvatarProvider, j30.c chatToggles) {
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(chatMessageTextMapper, "chatMessageTextMapper");
        Intrinsics.checkNotNullParameter(inAppCallUiStateProvider, "inAppCallUiStateProvider");
        Intrinsics.checkNotNullParameter(liveAgentAvatarProvider, "liveAgentAvatarProvider");
        Intrinsics.checkNotNullParameter(chatToggles, "chatToggles");
        this.f122369a = dateProvider;
        this.f122370b = chatMessageTextMapper;
        this.f122371c = liveAgentAvatarProvider;
        this.d = chatToggles;
    }

    public static ActionWidgetDelegate.Model a(ActionWidgetDelegate.Model model) {
        Object obj2 = model.f51596l;
        Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.chat.ui.chatlist.ChatListItemsFactory.CallListItemPayload");
        return ActionWidgetDelegate.Model.e(model, ((r40.k) obj2).e == r40.j.NONE ? ActionWidgetDelegate.Model.b.C0394b.f51606a : new ActionWidgetDelegate.Model.b.a(null), null, null, 4194239);
    }

    public static RowDelegate.Model b(ActionWidgetDelegate.Model model) {
        RowDelegate.Model.MainImage.Image40 image40;
        String str = model.f51590a;
        Clause clause = model.f51591b;
        Clause clause2 = model.d;
        int i = model.f51592c;
        int i2 = model.e;
        com.revolut.core.ui_kit.delegates.o oVar = model.f;
        if (oVar == null) {
            image40 = null;
        } else {
            if (oVar instanceof com.revolut.core.ui_kit.delegates.l) {
                throw new IllegalStateException("Not supported");
            }
            if (!(oVar instanceof com.revolut.core.ui_kit.delegates.m)) {
                throw new NoWhenBranchMatchedException();
            }
            com.revolut.core.ui_kit.delegates.m mVar = (com.revolut.core.ui_kit.delegates.m) oVar;
            image40 = new RowDelegate.Model.MainImage.Image40(mVar.f54449a, null, null, false, mVar.f54450b, false, 44);
        }
        return new RowDelegate.Model(str, image40, clause, null, i, clause2, null, null, i2, null, false, null, false, null, null, null, null, null, null, model.f51596l, null, 0, 0, 0, 0, 532676296);
    }

    public static NewBadgeContent.WithNumber c(y yVar) {
        int i = yVar instanceof w30.x ? ((w30.x) yVar).f294129b : yVar instanceof w30.w ? ((w30.w) yVar).f294127c : 0;
        if (i > 0) {
            return new NewBadgeContent.WithNumber(new NumberClause(i, (NumberClause.Format.Compact) null, (Custom) null, 6));
        }
        return null;
    }

    public static LayeredImage e() {
        return LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_revolut, Integer.valueOf(R$attr.uikit_colorForeground), R$attr.uikit_colorAccentNeutral_10, 8.0f, Float.valueOf(32.0f), null, 32);
    }

    public static LayeredImage h(boolean z) {
        LayeredImage.Companion companion = LayeredImage.INSTANCE;
        int i = R$drawable.uikit_icn_24_call;
        int i2 = R$attr.uikit_colorWhite;
        return LayeredImage.Companion.f(companion, i, z ? R$attr.uikit_colorTeal : R$attr.uikit_colorGreyTone20, R$attr.uikit_colorWidgetBackground, Integer.valueOf(i2), 4.0f, BitmapDescriptorFactory.HUE_RED, null, 96);
    }

    public static String m(w30.n nVar) {
        return prk.o.r(nVar.f294102a, "CALL_REQUEST_LIST_ID_");
    }

    public static Clause o(w30.n nVar) {
        c0 c0Var = nVar.f294114s;
        v30.s sVar = nVar.f294111p;
        int i = u.f122366a[c0Var.ordinal()];
        if (i == 1 || i == 2) {
            return r(sVar);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        MessageAuthor messageAuthor = nVar.f294110n;
        ChatAgent.Live live = messageAuthor instanceof ChatAgent.Live ? (ChatAgent.Live) messageAuthor : null;
        String name = live != null ? live.getName() : null;
        return name != null ? new TextClause(name, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : r(sVar);
    }

    public static TextLocalisedClause r(v30.s sVar) {
        int i;
        switch (u.e[sVar.ordinal()]) {
            case 1:
                i = R$string.chat_title_plan_premium;
                break;
            case 2:
                i = R$string.chat_title_plan_metal;
                break;
            case 3:
                i = R$string.chat_title_plan_ultra;
                break;
            case 4:
                i = R$string.chat_title_plan_private;
                break;
            case 5:
            case 6:
                i = R$string.chat_title_plan_standard;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return new TextLocalisedClause(i, null, null, 14);
    }

    public static boolean t(w30.n nVar) {
        Instant instant;
        org.joda.time.Instant instantT;
        y yVar = nVar.f294106h;
        Call call = nVar.f294108l;
        long millis = (call == null || (instantT = call.T()) == null) ? 0L : instantT.getMillis();
        InAppCallStateWithData inAppCallStateWithData = nVar.k;
        long jMax = Math.max(millis, (inAppCallStateWithData == null || (instant = inAppCallStateWithData.i) == null) ? 0L : instant.toEpochMilli());
        if (jMax == 0) {
            return true;
        }
        return (yVar instanceof w30.x) && ((w30.x) yVar).f294128a.getTime().getMillis() > jMax;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0793  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x07a1  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x082f  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0834  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0839  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x083d  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0840  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0846  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0881  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x08b1  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0910  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0958  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x095b  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0998  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x09a3  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x09b8 A[PHI: r1
      0x09b8: PHI (r1v16 java.util.List) = (r1v15 java.util.List), (r1v48 java.util.List), (r1v86 java.util.List) binds: [B:19:0x01db, B:85:0x04f9, B:144:0x06a5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x04fb  */
    /* JADX WARN: Type inference failed for: r15v0, types: [w30.y] */
    /* JADX WARN: Type inference failed for: r1v53, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r20v4 */
    /* JADX WARN: Type inference failed for: r20v5, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r20v6 */
    /* JADX WARN: Type inference failed for: r22v10 */
    /* JADX WARN: Type inference failed for: r22v11 */
    /* JADX WARN: Type inference failed for: r22v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r22v14 */
    /* JADX WARN: Type inference failed for: r22v16 */
    /* JADX WARN: Type inference failed for: r22v17 */
    /* JADX WARN: Type inference failed for: r22v18 */
    /* JADX WARN: Type inference failed for: r22v19 */
    /* JADX WARN: Type inference failed for: r22v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r22v5 */
    /* JADX WARN: Type inference failed for: r22v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r22v7 */
    /* JADX WARN: Type inference failed for: r22v9 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v77 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26, types: [com.revolut.core.ui_kit.models.Style, com.revolut.core.ui_kit.models.badge.CircleBadgeModel, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v28 */
    /* JADX WARN: Type inference failed for: r6v29 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r9v10, types: [com.revolut.core.ui_kit.models.Style, com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList d(w30.n r57, boolean r58) {
        /*
            Method dump skipped, instruction units count: 2568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e40.w.d(w30.n, boolean):java.util.ArrayList");
    }

    public final List f(w30.n chatAndCallDetails) {
        Intrinsics.checkNotNullParameter(chatAndCallDetails, "chatAndCallDetails");
        if (!(chatAndCallDetails.f294106h instanceof w30.v)) {
            ArrayList arrayListD = d(chatAndCallDetails, true);
            ArrayList arrayList = new ArrayList(zhm.w.t(arrayListD, 10));
            Iterator it8 = arrayListD.iterator();
            while (it8.hasNext()) {
                arrayList.add(b((ActionWidgetDelegate.Model) it8.next()));
            }
            return arrayList;
        }
        return zhm.u.c(new RowDelegate.Model(a0.d.r(m(chatAndCallDetails), "_default_chat"), new RowDelegate.Model.MainImage.Image40(e(), null, null, false, null, false, 62), r(chatAndCallDetails.f294111p), null, 1, k(chatAndCallDetails), null, null, 2, null, false, null, false, null, null, null, null, null, null, new r40.k(chatAndCallDetails, null, null, r40.i.OPEN_CHAT, r40.j.DISMISS_CHAT, null, 38), null, 0, 0, 0, 0, 532676296));
    }

    public final wh g(v30.y detailedFeed, InAppCallStateWithData inAppCallStateWithData, v30.s pricingPlan) {
        Clause textLocalisedClause;
        Image cdnImage;
        Intrinsics.checkNotNullParameter(detailedFeed, "detailedFeed");
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        boolean zC = ((rf3.d) this.d).c();
        c0 c0Var = detailedFeed.f285834b;
        UUID uuid = detailedFeed.f285833a;
        v30.j jVar = detailedFeed.f285835c;
        int i = u.f122366a[c0Var.ordinal()];
        if (i == 1) {
            textLocalisedClause = zC ? new TextLocalisedClause(R$string.chat_inbox_air_title, null, null, 14) : new TextLocalisedClause(R$string.chat_inbox_assistant_title, null, null, 14);
            cdnImage = zC ? new CdnImage("air_small_pad_light", "mobile/cx/chat/assistant_icons", null, new ImageTransformations(null, new CircleTransformation((Float) null, (Integer) null, false, 7), new CustomColors(2, new Color.Solid(R$attr.uikit_colorGreyTone8), null), gz0.b.FitCenter, null, null, null, 113), null, "air_small_pad_dark", Constants.TAG_GPI_VERSION) : LayeredImage.Companion.b(LayeredImage.INSTANCE, R$drawable.uikit_icn_24_lightning, Integer.valueOf(R$attr.uikit_colorForeground), R$attr.uikit_colorAccentNeutral_10, 8.0f, Float.valueOf(32.0f), null, 32);
        } else if (i == 2) {
            textLocalisedClause = r(pricingPlan);
            cdnImage = e();
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            MessageAuthor messageAuthor = jVar != null ? jVar.f285789h : null;
            ChatAgent.Live live = messageAuthor instanceof ChatAgent.Live ? (ChatAgent.Live) messageAuthor : null;
            String name = live != null ? live.getName() : null;
            textLocalisedClause = name != null ? new TextClause(name, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : r(pricingPlan);
            cdnImage = this.f122371c.a(jVar != null ? jVar.f285789h : null);
            if (cdnImage == null) {
                cdnImage = e();
            }
        }
        Image image = cdnImage;
        String strR = prk.o.r(uuid, "FEED_ITEM_ID_");
        return new wh(strR, new RowDelegate.Model(strR, new RowDelegate.Model.MainImage.Image40(image, null, null, false, null, false, 62), textLocalisedClause, null, 0, p(detailedFeed.f285835c, inAppCallStateWithData, detailedFeed.f285836g, detailedFeed.f285834b, zC), null, null, 1, s(jVar), false, null, false, null, null, null, null, null, null, detailedFeed, null, 0, 0, 0, 0, 532675288), zhm.v.l(detailedFeed.f285837h ? null : detailedFeed.f285836g ? new SwipeToActionDelegate.SwipeAction(prk.o.r(uuid, "FEED_ACTION_ARCHIVE_ID_PREFIX"), new ResourceImage(R$drawable.uikit_icn_24_archive, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), new TextLocalisedClause(R$string.chat_swipe_actions_archive, null, null, 14), null, null, detailedFeed, null, 88) : null), null, Constants.TAG_FULL_SVPP_IDENTIFICATION);
    }

    public final RowDelegate.Model i(v30.j jVar, InAppCallStateWithData inAppCallStateWithData, v30.s pricingPlan) {
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        return new RowDelegate.Model("SINGLE_FEED_ENTRY_POINT_ID", new RowDelegate.Model.MainImage.Image56(e(), (CircleBadgeModel) null, (jVar != null ? jVar.k : 0) > 0, 8), r(pricingPlan), null, 0, p(jVar, inAppCallStateWithData, false, null, false), null, null, 1, s(jVar), false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536869592);
    }

    public final Clause j(Call call) {
        org.joda.time.Instant instant = call.f51085g;
        w30.h hVar = call.i;
        long millis = instant != null ? instant.getMillis() : System.currentTimeMillis();
        TimeClause timeClauseQ = q(millis);
        Intrinsics.checkNotNullParameter(call, "call");
        w30.i iVarA = z50.e.a(call.f51086h, call.f51087j, call.k);
        if (iVarA.equals(i.g.f294090a)) {
            return new TextLocalisedClause(R$string.call_support_call_request_support_agent_informer, null, null, 14);
        }
        if (iVarA.equals(i.f.f294089a)) {
            int i = u.d[hVar.ordinal()];
            if (i == 1) {
                return new TextLocalisedClause(R$string.call_support_widget_ringing, null, null, 14);
            }
            if (i == 2) {
                return new TextLocalisedClause(R$string.chat_subtitle_phone_call_ringing, null, null, 14);
            }
        } else if (iVarA.equals(i.c.f294086a)) {
            int i2 = u.d[hVar.ordinal()];
            if (i2 == 1) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                org.joda.time.Instant instant2 = call.f;
                return new TextLocalisedClause(R$string.call_support_widget_ongoing_timer, zhm.u.c(new TimeClause(jCurrentTimeMillis - (instant2 != null ? instant2.getMillis() : 0L), new TimeClause.Format.Duration(0), null, null, 12)), null, 12);
            }
            if (i2 == 2) {
                return new TextLocalisedClause(R$string.chat_subtitle_voice_call_ongoing, null, null, 14);
            }
        } else {
            if (iVarA instanceof w30.j) {
                return new TextLocalisedClause(R$string.chat_subtitle_voice_call_ended_v2, null, null, 14);
            }
            if (iVarA.equals(i.a.f294084a)) {
                return new TextLocalisedClause(R$string.chat_subtitle_voice_call_declined, null, null, 14);
            }
            if (iVarA.equals(i.b.f294085a)) {
                return new TextLocalisedClause(R$string.chat_subtitle_voice_call_dropped, null, null, 14);
            }
            if (iVarA.equals(i.d.f294087a)) {
                int i3 = R$string.support_rtc_missed_call_description;
                Companion.getClass();
                Clause[] elements = {timeClauseQ, new TextLocalisedClause(i3, zhm.u.c(l.a(millis)), null, 12)};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = kotlin.collections.d.L(elements);
                m70.a.a(t0.f186434a);
                return new CompositeClause(listL, new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12);
            }
            if (!iVarA.equals(i.e.f294088a)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.models.Clause k(w30.n r19) {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e40.w.k(w30.n):com.revolut.core.ui_kit.models.Clause");
    }

    public final Image l(w30.n nVar) {
        int i = u.f122366a[nVar.f294114s.ordinal()];
        if (i == 1 || i == 2) {
            return e();
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        Image imageA = this.f122371c.a(nVar.f294110n);
        return imageA == null ? e() : imageA;
    }

    public final HtmlClause n(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        x xVar = this.f122370b;
        return new HtmlClause(3, 28, (Integer) null, (Object) null, xVar.d(message, xVar.b(), x.e).toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.models.Clause p(v30.j r8, com.revolut.feature.in_app_calls.InAppCallStateWithData r9, boolean r10, v30.c0 r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e40.w.p(v30.j, com.revolut.feature.in_app_calls.InAppCallStateWithData, boolean, v30.c0, boolean):com.revolut.core.ui_kit.models.Clause");
    }

    public final TimeClause q(long j2) {
        l80.f fVar = (l80.f) this.f122369a;
        if (fVar.c(j2)) {
            return new TimeClause(j2, TimeClause.Format.TimeDefault.f57977b, null, null, 12);
        }
        if (fVar.d(j2)) {
            return new TimeClause(j2, TimeClause.Format.PrettyDayOfWeek.f57975b, null, null, 12);
        }
        if (Intrinsics.f(fVar.g().weekOfWeekyear(), new DateTime(j2).weekOfWeekyear())) {
            return new TimeClause(j2, TimeClause.Format.PrettyDayOfWeek.f57975b, null, null, 12);
        }
        return Intrinsics.f(fVar.g().year(), new DateTime(j2).year()) ? new TimeClause(j2, new TimeClause.Format.DayAndMonth(ka.SHORT), null, null, 12) : new TimeClause(j2, new TimeClause.Format.DateMedium(0), null, null, 12);
    }

    public final RowDelegate.Model.c.a s(v30.j jVar) {
        Long lValueOf;
        org.joda.time.Instant time;
        TagViewData tagViewData = null;
        if (jVar != null) {
            if (v30.r.a(jVar)) {
                lValueOf = Long.valueOf(jVar.f285793n.getMillis());
            } else {
                LastMessage lastMessage = jVar.f285790j;
                lValueOf = (lastMessage == null || (time = lastMessage.getTime()) == null) ? null : Long.valueOf(time.getMillis());
            }
            if (lValueOf != null) {
                int i = jVar.k;
                if (i > 0) {
                    TextClause textClause = new TextClause(String.valueOf(i), (Style) null, Integer.valueOf(R$attr.uikit_colorOnAccentNeutral), false, (o9) null, (List) null, 122);
                    int i2 = R$attr.uikit_colorAccentNeutral;
                    tagViewData = new TagViewData(null, textClause, new Color.Solid(i2), i2, null, 1000);
                }
                return new RowDelegate.Model.c.a(tagViewData, q(lValueOf.longValue()), false, 4);
            }
        }
        return null;
    }

    public final boolean u(w30.n nVar) {
        Call call;
        Boolean bool;
        y yVar = nVar.f294106h;
        if ((!(yVar instanceof y.a) && !(yVar instanceof w30.x)) || (call = nVar.f294108l) == null || call.f51084c != w30.e.AGENT_TO_CLIENT) {
            return false;
        }
        if (((jte.d) ((rf3.d) this.d).f253679a).c(ChatApi$Toggles.ChatBEDrivenTileDismissal.f50971c) && (bool = nVar.f) != null) {
            return bool.equals(Boolean.FALSE);
        }
        org.joda.time.Instant instant = nVar.e;
        if (instant != null && instant.getMillis() >= call.T().getMillis()) {
            return false;
        }
        Intrinsics.checkNotNullParameter(call, "call");
        return (z50.e.a(call.f51086h, call.f51087j, call.k) instanceof i.d) && call.T().isAfter(new org.joda.time.Instant(System.currentTimeMillis()).minus(Duration.standardHours(12L)));
    }
}
