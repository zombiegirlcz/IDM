package n50;

import android.os.Parcelable;
import aw0.c3;
import aw0.cb;
import aw0.o9;
import aw0.v9;
import aw0.x2;
import aw0.z2;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.chat.ChatApi$Toggles;
import com.revolut.chat.data.repository.chat.ChatAgent;
import com.revolut.chat.data.repository.chat.MessageAuthor;
import com.revolut.chat.data.repository.chat.User;
import com.revolut.chat.domain.model.ReplyToDetails;
import com.revolut.chat_core.R$plurals;
import com.revolut.chat_core.R$string;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.ChatContextualChartDelegate;
import com.revolut.core.ui_kit.delegates.ChatItemsDelegate;
import com.revolut.core.ui_kit.delegates.ChatTilesCollectionDelegate;
import com.revolut.core.ui_kit.delegates.ChatTooltipDelegate;
import com.revolut.core.ui_kit.delegates.ChatTravelPreviewDelegate;
import com.revolut.core.ui_kit.delegates.ContextualBarChartDelegate;
import com.revolut.core.ui_kit.delegates.ContextualLineChartDelegate;
import com.revolut.core.ui_kit.delegates.ContextualSegmentedBarDelegate;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatAttachmentBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatBubbleDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatMessageActionsPanelDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatSmartTileSendMoneyDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatSmartTileSendMoneyLoadingDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatTableDelegate;
import com.revolut.core.ui_kit.delegates.chat.ChatUncontainedMessageDelegate;
import com.revolut.core.ui_kit.delegates.j3;
import com.revolut.core.ui_kit.delegates.m3;
import com.revolut.core.ui_kit.delegates.pf;
import com.revolut.core.ui_kit.delegates.q3;
import com.revolut.core.ui_kit.delegates.u3;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.models.AnimationRequest;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TextLocalisedQuantityClause;
import com.revolut.core.ui_kit.models.TextWithHighlightsClause;
import com.revolut.core.ui_kit.models.TimeClause;
import com.revolut.core.ui_kit.models.q0;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import com.revolut.core.ui_kit_core.displayers.image.models.LottieImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ShimmerImage;
import com.revolut.core.ui_kit_core.displayers.image.models.SourceUrl;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import hw0.z;
import i20.h0;
import ip0.hm0;
import ip0.sa;
import ip0.ul;
import ip0.vj0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import ms0.h4;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.lds.LDSFile;
import tx0.k0;
import v20.b1;
import v20.c1;
import v20.g1;
import v20.h1;
import v20.i1;
import v20.j0;
import v20.l0;
import v20.l1;
import v20.m2;
import v20.n2;
import v20.o0;
import v20.o2;
import v20.p0;
import v20.r2;
import v20.s0;
import v20.s2;
import v20.t0;
import v20.w0;
import v20.x0;
import v20.y0;
import v30.c0;
import x40.a;
import zhm.f0;
import zhm.r0;

/* JADX INFO: loaded from: classes19.dex */
public final class y {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z50.b f212518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z20.u f212519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f212520c;
    public final k50.x d;
    public final j30.c e;
    public final p80.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f80.a f212521g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q50.o f212522h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f212523j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public c0 f212524l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f212525m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f212526n;

    public y(z50.b attributesProvider, z20.u bulkUploadProgressProvider, z40.c chatExperienceRatingUiFactory, b chatMessagePreviewExtractor, k50.x chatMessageTextMapper, j30.c featureToggles, p80.a fileFormatter, z50.e inAppCallUiStateProvider, f80.a uriHelper, q50.o widgetExtension) {
        Intrinsics.checkNotNullParameter(attributesProvider, "attributesProvider");
        Intrinsics.checkNotNullParameter(bulkUploadProgressProvider, "bulkUploadProgressProvider");
        Intrinsics.checkNotNullParameter(chatExperienceRatingUiFactory, "chatExperienceRatingUiFactory");
        Intrinsics.checkNotNullParameter(chatMessagePreviewExtractor, "chatMessagePreviewExtractor");
        Intrinsics.checkNotNullParameter(chatMessageTextMapper, "chatMessageTextMapper");
        Intrinsics.checkNotNullParameter(featureToggles, "featureToggles");
        Intrinsics.checkNotNullParameter(fileFormatter, "fileFormatter");
        Intrinsics.checkNotNullParameter(inAppCallUiStateProvider, "inAppCallUiStateProvider");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(widgetExtension, "widgetExtension");
        this.f212518a = attributesProvider;
        this.f212519b = bulkUploadProgressProvider;
        this.f212520c = chatMessagePreviewExtractor;
        this.d = chatMessageTextMapper;
        this.e = featureToggles;
        this.f = fileFormatter;
        this.f212521g = uriHelper;
        this.f212522h = widgetExtension;
        this.i = true;
        this.f212523j = true;
    }

    public static ChatBubbleDelegate.Model b(y yVar, v20.n nVar, Clause clause, s sVar, xo0.a aVar, b1 b1Var, ChatBubbleDelegate.ButtonModel buttonModel, boolean z, o2 o2Var, ReplyToDetails replyToDetails, int i) {
        Clause clause2;
        Object uVar;
        ChatBubbleDelegate.ButtonModel buttonModel2 = (i & 64) != 0 ? null : buttonModel;
        boolean z3 = (i & 128) != 0 ? false : z;
        o2 o2Var2 = (i & 256) != 0 ? null : o2Var;
        ReplyToDetails replyToDetails2 = (i & 512) != 0 ? null : replyToDetails;
        z50.b bVar = yVar.f212518a;
        MessageAuthor author = nVar.getAuthor();
        boolean z4 = author instanceof ChatAgent;
        if (!z4 && !sVar.a()) {
            return null;
        }
        cam.f fVarS = s(sVar, false);
        ChatBubbleDelegate.c cVarT = t(fVarS);
        gw0.v vVarU = u(author, b1Var);
        Clause clauseP = p(nVar, sVar);
        TimeClause timeClauseB = bVar.b(nVar);
        ChatBubbleDelegate.Model.Companion companion = ChatBubbleDelegate.Model.INSTANCE;
        o2 o2Var3 = o2Var2;
        String strA = a.C1679a.a(nVar);
        Clause clauseN = yVar.n(author, fVarS, sVar);
        Image imageO = yVar.o(author, fVarS, sVar);
        gw0.a aVar2 = gw0.a.VERTICAL;
        int iC = sVar.c();
        int iB = sVar.b();
        int iA = bVar.a(fVarS, sVar, yVar.f212523j);
        if (o2Var3 == null) {
            clause2 = clause;
            uVar = new u(clause2, nVar, z3);
        } else {
            clause2 = clause;
            uVar = o2Var3;
        }
        xo0.a aVar3 = z4 ? new xo0.a(z50.b.c(author)) : aVar;
        v20.n replyTo = nVar.getReplyTo();
        return ChatBubbleDelegate.Model.Companion.a(companion, strA, clauseN, null, clause2, null, buttonModel2, cVarT, null, clauseP, timeClauseB, null, imageO, z3, replyTo != null ? yVar.j(replyTo, replyToDetails2) : null, fVarS, uVar, aVar2, aVar3, vVarU, iC, iB, iA, 1083296458);
    }

    public static Image c(v20.b bVar) {
        String mediaType = bVar.getMediaType();
        String thumbnailUrl = bVar.getThumbnailUrl();
        if (thumbnailUrl == null || !Intrinsics.f(bVar.getContentUploaded(), Boolean.TRUE)) {
            thumbnailUrl = null;
        }
        if (kotlin.collections.d.I(t80.f.PDF.a(), mediaType)) {
            return new ResourceImage(R$drawable.uikit_icn_64_file_pdf, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254);
        }
        if (z50.k.d(mediaType)) {
            File file = bVar.i;
            String path = file != null ? file.getPath() : null;
            Map thumbnailUrlHeaders = bVar.getThumbnailUrlHeaders();
            if (thumbnailUrlHeaders == null) {
                thumbnailUrlHeaders = r0.g();
            }
            Image imageA = z50.k.a(path, thumbnailUrl, thumbnailUrlHeaders, z50.i.LOCAL_FIRST, (8 & 16) == 0);
            if (imageA != null) {
                return imageA;
            }
        }
        return ShimmerImage.f60002a;
    }

    public static Image f(String str, String str2, n nVar) {
        if (kotlin.collections.d.I(t80.f.PDF.a(), str)) {
            return new LayeredImage(zhm.v.k(new LayeredImage.Layer.Drawable(com.revolut.chat_core.R$drawable.background_pdf_message_item, Integer.valueOf(R$attr.uikit_colorForeground), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 124), new LayeredImage.Layer.Drawable(R$drawable.uikit_icn_64_file_pdf, (Integer) null, 24.0f, 24.0f, 24.0f, 24.0f, (com.revolut.core.ui_kit_core.displayers.image.models.c) null, 66)), (Float) null, (Float) null, 14);
        }
        return z50.k.a(str2, nVar != null ? nVar.f212494a : null, nVar != null ? nVar.f212495b : r0.g(), z50.i.LOCAL_FIRST, (8 & 16) == 0);
    }

    public static Clause p(v20.n nVar, s sVar) {
        MessageAuthor author = nVar.getAuthor();
        if (author instanceof ChatAgent.Live) {
            if (sVar.d()) {
                return yoj.b.w(new TimeClause(nVar.getTime().getMillis(), new TimeClause.Format.Pretty(q0.ONLY_TIME), null, null, 12), new TextClause(j6.a.q(" · ", ((ChatAgent.Live) author).getName()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126));
            }
            return null;
        }
        if (author instanceof User) {
            if (sVar.d()) {
                return new TimeClause(nVar.getTime().getMillis(), new TimeClause.Format.Pretty(q0.ONLY_TIME), null, null, 12);
            }
            return null;
        }
        if (author instanceof ChatAgent.Bot) {
            return null;
        }
        throw new IllegalStateException((author + " is not supported here").toString());
    }

    public static LayeredImage q(boolean z, boolean z3) {
        return LayeredImage.Companion.b(LayeredImage.INSTANCE, z3 ? R$drawable.uikit_icn_24_call : R$drawable.uikit_icn_24_no_call, Integer.valueOf(z ? R$attr.uikit_colorAccent : R$attr.uikit_colorGreyTone50), z ? R$attr.uikit_colorAccent_10 : R$attr.uikit_colorGreyTone50_10, 8.0f, Float.valueOf(32.0f), null, 32);
    }

    public static TextLocalisedClause r(h0 h0Var, Custom custom) {
        return x.f212516b[h0Var.ordinal()] == 1 ? new TextLocalisedClause(R$string.call_message_phone_call_title, null, custom, 10) : new TextLocalisedClause(R$string.call_message_ongoing_title, null, custom, 10);
    }

    public static cam.f s(s sVar, boolean z) {
        gw0.t tVar;
        boolean zA = sVar.a();
        boolean z3 = !zA;
        if (z && sVar.f()) {
            return new gw0.k(gw0.t.SINGLE, z3);
        }
        if (sVar.f()) {
            tVar = gw0.t.SINGLE;
        } else if (sVar instanceof o) {
            tVar = gw0.t.LAST;
        } else if (sVar instanceof p) {
            tVar = gw0.t.MIDDLE;
        } else if (sVar instanceof q) {
            tVar = gw0.t.SINGLE_TAIL;
        } else {
            if (!(sVar instanceof r)) {
                throw new NoWhenBranchMatchedException();
            }
            tVar = gw0.t.FIRST;
        }
        return !zA ? new gw0.i(tVar) : new gw0.j(tVar);
    }

    public static ChatBubbleDelegate.c t(cam.f fVar) {
        if (fVar instanceof gw0.k) {
            return new ChatBubbleDelegate.c.e();
        }
        if (fVar instanceof gw0.i) {
            return new ChatBubbleDelegate.c.b(null);
        }
        if (fVar instanceof gw0.j) {
            return new ChatBubbleDelegate.c.d(null);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static gw0.v u(MessageAuthor messageAuthor, b1 b1Var) {
        if (messageAuthor instanceof ChatAgent) {
            return gw0.v.NONE;
        }
        if (!(messageAuthor instanceof User)) {
            throw new IllegalStateException((messageAuthor + " is not supported here").toString());
        }
        int i = b1Var == null ? -1 : x.d[b1Var.ordinal()];
        if (i != -1 && i != 1) {
            if (i == 2) {
                return gw0.v.ERROR;
            }
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return gw0.v.NONE;
    }

    public static LottieImage v(k50.d dVar) {
        SourceUrl sourceUrlE = dVar.e();
        if (sourceUrlE != null) {
            return LottieImage.Companion.a(LottieImage.INSTANCE, sourceUrlE, false, false, new LottieImage.ColorOverride.TintedWithAttr(dVar.b(), ez0.f.REPLACE), null, 222);
        }
        return null;
    }

    public static Clause w(String str, String str2) {
        return TextWithHighlightsClause.Companion.b(TextWithHighlightsClause.INSTANCE, new HtmlClause(3, 28, (Integer) null, (Object) null, str), str2);
    }

    public final ChatMessageActionsPanelDelegate.Model a(v20.n message, s messageInGroupData, k50.d dVar) {
        Intrinsics.checkNotNullParameter(message, "basicMessageData");
        Intrinsics.checkNotNullParameter(messageInGroupData, "messageInGroupData");
        cam.f fVarS = s(messageInGroupData, true);
        Intrinsics.checkNotNullParameter(message, "message");
        String strR = prk.o.r(message.getId(), "actions_panel_");
        k50.d dVar2 = k50.d.COPY;
        com.revolut.core.ui_kit.delegates.chat.f fVar = new com.revolut.core.ui_kit.delegates.chat.f(dVar2.d(), new ResourceImage(dVar2.f(), (Integer) null, (Integer) null, Integer.valueOf(dVar2.b()), (List) null, (ImageTransformations) null, new TextLocalisedClause(dVar2.c(), null, null, 14), LDSFile.EF_DG4_TAG), new ResourceImage(dVar2.a(), (Integer) null, (Integer) null, Integer.valueOf(dVar2.b()), (List) null, (ImageTransformations) null, new TextLocalisedClause(dVar2.c(), null, null, 14), LDSFile.EF_DG4_TAG));
        k50.d dVar3 = k50.d.LIKE;
        com.revolut.core.ui_kit.delegates.chat.g gVar = (dVar == null || dVar == dVar3) ? new com.revolut.core.ui_kit.delegates.chat.g(dVar3.d(), new ResourceImage(dVar3.f(), (Integer) null, (Integer) null, Integer.valueOf(dVar3.b()), (List) null, (ImageTransformations) null, new TextLocalisedClause(dVar3.c(), null, null, 14), LDSFile.EF_DG4_TAG), new ResourceImage(dVar3.a(), (Integer) null, (Integer) null, Integer.valueOf(dVar3.b()), (List) null, (ImageTransformations) null, new TextLocalisedClause(dVar3.c(), null, null, 14), LDSFile.EF_DG4_TAG), dVar == dVar3, v(dVar3)) : null;
        k50.d dVar4 = k50.d.DISLIKE;
        com.revolut.core.ui_kit.delegates.chat.g gVar2 = new com.revolut.core.ui_kit.delegates.chat.g(dVar4.d(), new ResourceImage(dVar4.f(), (Integer) null, (Integer) null, Integer.valueOf(dVar4.b()), (List) null, (ImageTransformations) null, new TextLocalisedClause(dVar4.c(), null, null, 14), LDSFile.EF_DG4_TAG), new ResourceImage(dVar4.a(), (Integer) null, (Integer) null, Integer.valueOf(dVar4.b()), (List) null, (ImageTransformations) null, new TextLocalisedClause(dVar4.c(), null, null, 14), LDSFile.EF_DG4_TAG), dVar == dVar4, v(dVar4));
        if (dVar != null && dVar != dVar4) {
            gVar2 = null;
        }
        ChatMessageActionsPanelDelegate.a[] elements = {fVar, gVar, gVar2};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return new ChatMessageActionsPanelDelegate.Model(strR, kotlin.collections.d.L(elements), fVarS, message, R$attr.uikit_dp0, messageInGroupData.b());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005b  */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v3, types: [kotlinx.coroutines.flow.MutableStateFlow] */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r35v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r5v13, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate.BaseModel d(v20.c r33, n50.s r34, xo0.a r35, java.lang.String r36) {
        /*
            Method dump skipped, instruction units count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n50.y.d(v20.c, n50.s, xo0.a, java.lang.String):com.revolut.core.ui_kit.delegates.chat.BaseChatBubbleDelegate$BaseModel");
    }

    public final koi.j e(v20.n message, boolean z) {
        Intrinsics.checkNotNullParameter(message, "message");
        int i = R$attr.uikit_dp12;
        int i2 = z ? R$attr.uikit_dp0 : i;
        TimeClause timeClause = new TimeClause(message.getTime().getMillis(), new TimeClause.Format.Pretty(q0.ONLY_DATE), null, null, 12);
        if (((jte.d) ((rf3.d) this.e).f253679a).c(ChatApi$Toggles.FloatingDatePill.f50982c)) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new vj0(prk.o.r(message.getId(), "date_"), new TagViewData(null, timeClause, new TagViewData.TagBackground.Solid(new Color.Solid(R$attr.uikit_colorPopoverBackground)), null, new TagViewData.TagOutline.Solid(R$attr.uikit_colorTransparent), false, null, null, null, R$attr.uikit_colorForeground, null, 1512), false, message.getTime(), i, i2, 0, 0, 392);
        }
        Intrinsics.checkNotNullParameter(message, "message");
        return new sa(prk.o.r(message.getId(), "date_"), timeClause, i, i2, 48);
    }

    public final koi.j g(UUID id10, v20.n basicMessageData, b1 b1Var, s messageInGroupData, String mediaType, String str, UUID uuid, n nVar, String str2, xo0.a accessibilitySender, String str3) {
        gw0.q qVarJ;
        t0 meta;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(basicMessageData, "basicMessageData");
        Intrinsics.checkNotNullParameter(messageInGroupData, "messageInGroupData");
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(accessibilitySender, "accessibilitySender");
        MessageAuthor author = basicMessageData.getAuthor();
        if (!(author instanceof ChatAgent) && !messageInGroupData.a()) {
            return null;
        }
        String str4 = (str == null || d0.W(str)) ? null : str;
        Clause clauseB = str4 != null ? TextWithHighlightsClause.Companion.b(TextWithHighlightsClause.INSTANCE, new TextClause(str4, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), str3) : null;
        cam.f fVarS = s(messageInGroupData, false);
        ChatBubbleDelegate.c cVarT = t(fVarS);
        ResourceImage resourceImage = (b1Var == null ? -1 : x.d[b1Var.ordinal()]) == 1 ? new ResourceImage(R$drawable.uikit_icn_16_time, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorWhite), (List) null, (ImageTransformations) null, (Clause) null, 246) : null;
        gw0.v vVarU = u(author, b1Var);
        com.revolut.core.ui_kit.delegates.chat.c cVar = null;
        Clause clauseP = p(basicMessageData, messageInGroupData);
        boolean z = this.k && b1Var == b1.COMPLETE;
        Image imageF = f(mediaType, str2, nVar);
        t tVar = new t(uuid, nVar != null ? nVar.f212494a : null, str2, mediaType, basicMessageData, z, nVar != null ? nVar.f212495b : r0.g());
        boolean z3 = this.k;
        z50.b bVar = this.f212518a;
        if (!z3 || clauseB != null || imageF == null) {
            ChatBubbleDelegate.Model.Companion companion = ChatBubbleDelegate.Model.INSTANCE;
            String string = id10.toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            if (imageF != null) {
                cVar = new com.revolut.core.ui_kit.delegates.chat.c(imageF);
            }
            return ChatBubbleDelegate.Model.Companion.a(companion, string, null, null, clauseB, cVar, null, cVarT, resourceImage, clauseP, bVar.b(basicMessageData), null, o(author, fVarS, messageInGroupData), z, null, fVarS, tVar, null, accessibilitySender, vVarU, messageInGroupData.c(), messageInGroupData.b(), bVar.a(fVarS, messageInGroupData, this.f212523j), 1100596142);
        }
        String string2 = id10.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        Image imageO = o(author, fVarS, messageInGroupData);
        TimeClause timeClauseB = bVar.b(basicMessageData);
        v20.n replyTo = basicMessageData.getReplyTo();
        if (replyTo != null) {
            s0 s0Var = basicMessageData instanceof s0 ? (s0) basicMessageData : null;
            qVarJ = j(replyTo, (s0Var == null || (meta = s0Var.getMeta()) == null) ? null : meta.getReplyToDetails());
        } else {
            qVarJ = null;
        }
        return new ChatAttachmentBubbleDelegate.Model(string2, imageF, imageO, timeClauseB, cVarT, z, qVarJ, z, fVarS, tVar, messageInGroupData.c(), messageInGroupData.b());
    }

    public final koi.j h(int i) {
        if (!((jte.d) ((rf3.d) this.e).f253679a).c(ChatApi$Toggles.FloatingDatePill.f50982c)) {
            TextLocalisedQuantityClause textLocalisedQuantityClause = new TextLocalisedQuantityClause(R$plurals.chat_messages_tooltip_new_messages, Integer.valueOf(i), (List) null, (Style) null, 28);
            ChatTooltipDelegate.a.C0398a c0398a = ChatTooltipDelegate.a.C0398a.f52074a;
            int i2 = R$attr.uikit_dp12;
            return new ChatTooltipDelegate.Model("LIST_ID_NEW_MESSAGES_DIVIDER", null, textLocalisedQuantityClause, i2, i2, 816);
        }
        TagViewData tagViewData = new TagViewData(null, new TextLocalisedQuantityClause(R$plurals.chat_messages_tooltip_new_messages, Integer.valueOf(i), (List) null, (Style) null, 28), new TagViewData.TagBackground.Solid(new Color.Solid(R$attr.uikit_colorForeground_10)), null, new TagViewData.TagOutline.Solid(R$attr.uikit_colorTransparent), false, null, null, null, R$attr.uikit_colorGreyTone50, null, 1512);
        int i3 = R$attr.uikit_dp12;
        return new vj0("LIST_ID_NEW_MESSAGES_DIVIDER", tagViewData, false, null, i3, i3, 0, 0, 408);
    }

    public final gw0.q i(v20.n nVar, c cVar, String str) {
        n nVar2 = null;
        if (this.k) {
            boolean z = cVar == c.COMPOSER;
            boolean z3 = nVar instanceof o2;
            b bVar = this.f212520c;
            if (z3) {
                return new gw0.p(x(((o2) nVar).getAuthor(), cVar), str != null ? new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : bVar.a(nVar), null, z);
            }
            if (nVar instanceof s0) {
                s0 s0Var = (s0) nVar;
                if (s0Var.A()) {
                    return new gw0.p(x(s0Var.getAuthor(), cVar), bVar.a(nVar), null, z);
                }
                Clause clauseX = x(s0Var.getAuthor(), cVar);
                Clause clauseA = bVar.a(nVar);
                String mediaType = s0Var.getMediaType();
                String filePath = s0Var.getFilePath();
                String thumbnailUrl = s0Var.getThumbnailUrl();
                if (thumbnailUrl != null) {
                    Map thumbnailUrlHeaders = s0Var.getThumbnailUrlHeaders();
                    if (thumbnailUrlHeaders == null) {
                        thumbnailUrlHeaders = r0.g();
                    }
                    nVar2 = new n(thumbnailUrl, thumbnailUrlHeaders);
                }
                return new gw0.p(clauseX, clauseA, f(mediaType, filePath, nVar2), z);
            }
            if (nVar instanceof v20.f) {
                v20.f fVar = (v20.f) nVar;
                TextLocalisedClause textLocalisedClauseR = r(fVar.getPayloadType(), null);
                Clause clauseA2 = bVar.a(nVar);
                Clause clauseX2 = x(fVar.getAuthor(), cVar);
                Clause[] elements = {textLocalisedClauseR, clauseA2};
                Intrinsics.checkNotNullParameter(elements, "elements");
                List listL = kotlin.collections.d.L(elements);
                m70.a.a(kotlin.jvm.internal.t0.f186434a);
                return new gw0.p(clauseX2, new CompositeClause(listL, new TextClause(" · ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), null, z);
            }
            if ((nVar instanceof w0) || (nVar instanceof x0)) {
                return new gw0.p(x(nVar.getAuthor(), cVar), bVar.a(nVar), null, z);
            }
            if (nVar instanceof c1) {
                c1 c1Var = (c1) nVar;
                return new gw0.p(new TextClause(c1Var.getTitle(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(c1Var.getSubtitle(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, z);
            }
            if (nVar instanceof j0) {
                j0 j0Var = (j0) nVar;
                gw0.q qVarD3 = this.f212522h.d3(j0Var.getId(), z, x(j0Var.getAuthor(), cVar), bVar.a(nVar));
                return qVarD3 == null ? new gw0.p(x(j0Var.getAuthor(), cVar), bVar.a(nVar), null, z) : qVarD3;
            }
            if (!(nVar instanceof v20.c)) {
                if ((nVar instanceof r2) || (nVar instanceof i1) || (nVar instanceof v20.e) || (nVar instanceof v20.g) || (nVar instanceof v20.k) || (nVar instanceof l0) || (nVar instanceof o0) || (nVar instanceof p0) || (nVar instanceof v20.r0) || (nVar instanceof y0.a) || (nVar instanceof g1) || (nVar instanceof h1) || (nVar instanceof l1) || (nVar instanceof m2) || (nVar instanceof n2) || (nVar instanceof s2)) {
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
            v20.c cVar2 = (v20.c) nVar;
            String text = cVar2.getText();
            if ((text != null && text.length() != 0) || !cVar2.getUploads().isEmpty()) {
                return new gw0.p(x(cVar2.getAuthor(), cVar), bVar.a(nVar), null, z);
            }
        }
        return null;
    }

    public final gw0.q j(v20.n message, ReplyToDetails replyToDetails) {
        String selectedText;
        Intrinsics.checkNotNullParameter(message, "message");
        c cVar = c.SENT;
        String str = null;
        if (replyToDetails != null && (selectedText = replyToDetails.getSelectedText()) != null && !d0.W(selectedText)) {
            str = selectedText;
        }
        return i(message, cVar, str);
    }

    public final ChatUncontainedMessageDelegate.Model k(v20.n nVar, Clause clause, s sVar, xo0.a aVar) {
        cam.f fVarS = s(sVar, true);
        return new ChatUncontainedMessageDelegate.Model(a.C1679a.a(nVar), clause, aVar, zhm.u.c(new kp0.c1(R$string.context_menu_action_ask_air)), fVarS, nVar, sVar.c(), sVar.b(), this.f212518a.a(fVarS, sVar, this.f212523j));
    }

    public final ChatBubbleDelegate.Model l(v20.n message, s messageInGroupData, xo0.a accessibilitySender) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(messageInGroupData, "messageInGroupData");
        Intrinsics.checkNotNullParameter(accessibilitySender, "accessibilitySender");
        return b(this, message, new TextLocalisedClause(R$string.chat_message_generic_fallback_text, null, null, 14), messageInGroupData, accessibilitySender, b1.COMPLETE, null, false, null, null, 992);
    }

    public final koi.j m(j0 message, s messageInGroupData, xo0.a accessibilitySender, String str) {
        Clause textLocalisedClause;
        Iterator it8;
        RowDelegate.Model.c pfVar;
        List list;
        boolean z;
        List listA;
        int i;
        boolean z3;
        List columns;
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(messageInGroupData, "messageInGroupData");
        Intrinsics.checkNotNullParameter(accessibilitySender, "accessibilitySender");
        oq0.b bVarB3 = this.f212522h.b3(message.getId());
        Clause clause = null;
        if (bVarB3 == null) {
            String strR = message.r(this.d);
            if (strR == null || (textLocalisedClause = w(strR, str)) == null) {
                textLocalisedClause = new TextLocalisedClause(R$string.chat_message_generic_fallback_text, null, null, 14);
            }
            return messageInGroupData.f() ? k(message, textLocalisedClause, messageInGroupData, accessibilitySender) : b(this, message, textLocalisedClause, messageInGroupData, accessibilitySender, b1.COMPLETE, null, false, null, null, 992);
        }
        cam.f position = s(messageInGroupData, bVarB3.a2());
        boolean z4 = !messageInGroupData.f() && this.k;
        if (bVarB3 instanceof ChatTableDelegate.Model) {
            boolean zF = messageInGroupData.f();
            ChatTableDelegate.Model model = (ChatTableDelegate.Model) bVarB3;
            List list2 = model.f53907b;
            boolean z6 = zF ? false : model.f;
            if (zF) {
                boolean z11 = this.k;
                boolean z12 = message.getFallbackText() != null;
                aim.e eVarB = zhm.u.b();
                if (z11) {
                    list = list2;
                    z = zF;
                    eVarB.add(new pw0.b(1, 4, new TextLocalisedClause(R$string.context_menu_action_ask_air, null, null, 14)));
                } else {
                    list = list2;
                    z = zF;
                }
                if (z12) {
                    eVarB.add(new pw0.b(2, 6, new TextLocalisedClause(R$string.chat_context_menu_action_copy_all, null, null, 14)));
                }
                listA = zhm.u.a(eVarB);
            } else {
                list = list2;
                z = zF;
                listA = f0.f322471a;
            }
            List selectionMenuItems = listA;
            boolean z29 = z6;
            int iC = messageInGroupData.c();
            int iB = messageInGroupData.b();
            if (str == null || d0.W(str)) {
                i = iB;
                z3 = z29;
                columns = list;
            } else {
                List list3 = list;
                ArrayList arrayList = new ArrayList(zhm.w.t(list3, 10));
                Iterator it9 = list3.iterator();
                while (it9.hasNext()) {
                    com.revolut.core.ui_kit.delegates.chat.k kVar = (com.revolut.core.ui_kit.delegates.chat.k) it9.next();
                    int i2 = iB;
                    Clause label = TextWithHighlightsClause.Companion.b(TextWithHighlightsClause.INSTANCE, kVar.f53978a, str);
                    ArrayList arrayList2 = kVar.f53979b;
                    Iterator it10 = it9;
                    boolean z31 = z29;
                    ArrayList cells = new ArrayList(zhm.w.t(arrayList2, 10));
                    Iterator it11 = arrayList2.iterator();
                    while (it11.hasNext()) {
                        cells.add(TextWithHighlightsClause.Companion.b(TextWithHighlightsClause.INSTANCE, (Clause) it11.next(), str));
                    }
                    Intrinsics.checkNotNullParameter(label, "label");
                    Intrinsics.checkNotNullParameter(cells, "cells");
                    arrayList.add(new com.revolut.core.ui_kit.delegates.chat.k(label, cells));
                    iB = i2;
                    it9 = it10;
                    z29 = z31;
                }
                i = iB;
                z3 = z29;
                columns = arrayList;
            }
            String listId = model.f53906a;
            Object obj2 = model.d;
            Parcelable parcelable = model.f53911j;
            int i3 = model.f53913m;
            int i5 = model.f53914n;
            Intrinsics.checkNotNullParameter(listId, "listId");
            Intrinsics.checkNotNullParameter(columns, "columns");
            Intrinsics.checkNotNullParameter(position, "position");
            Intrinsics.checkNotNullParameter(accessibilitySender, "accessibilitySender");
            Intrinsics.checkNotNullParameter(selectionMenuItems, "selectionMenuItems");
            return new ChatTableDelegate.Model(listId, columns, position, obj2, accessibilitySender, z3, z4, selectionMenuItems, z, parcelable, iC, i, i3, i5);
        }
        if (bVarB3 instanceof ContextualSegmentedBarDelegate.Model) {
            ContextualSegmentedBarDelegate.Model model2 = (ContextualSegmentedBarDelegate.Model) bVarB3;
            ChatBubbleDelegate.c style = t(position);
            Image imageO = o(message.getAuthor(), position, messageInGroupData);
            int iC2 = messageInGroupData.c();
            int iB2 = messageInGroupData.b();
            c3 data = model2.f52147a;
            String listId2 = model2.f52148b;
            Object obj3 = model2.e;
            gw0.q qVar = model2.f52151h;
            Parcelable parcelable2 = model2.f52152j;
            int i6 = model2.f52154m;
            int i21 = model2.f52155n;
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(listId2, "listId");
            Intrinsics.checkNotNullParameter(position, "position");
            Intrinsics.checkNotNullParameter(style, "style");
            return new ContextualSegmentedBarDelegate.Model(data, listId2, position, style, obj3, imageO, z4, qVar, true, parcelable2, iC2, iB2, i6, i21);
        }
        if (bVarB3 instanceof ChatItemsDelegate.Model) {
            ChatItemsDelegate.Model model3 = (ChatItemsDelegate.Model) bVarB3;
            m3 j3Var = model3.f52048a;
            ChatBubbleDelegate.c cVarT = t(position);
            Image imageO2 = o(message.getAuthor(), position, messageInGroupData);
            gw0.l lVar = this.f212526n ? gw0.l.LARGE : model3.e;
            int iC3 = messageInGroupData.c();
            int iB3 = messageInGroupData.b();
            if (str != null && !d0.W(str) && (j3Var instanceof j3)) {
                j3 j3Var2 = (j3) j3Var;
                List list4 = j3Var2.f54317a;
                ArrayList rowItems = new ArrayList(zhm.w.t(list4, 10));
                Iterator it12 = list4.iterator();
                while (it12.hasNext()) {
                    RowDelegate.Model model4 = (RowDelegate.Model) it12.next();
                    Clause clause2 = model4.f53230c;
                    TextWithHighlightsClause.Companion companion = TextWithHighlightsClause.INSTANCE;
                    Clause clauseB = TextWithHighlightsClause.Companion.b(companion, clause2, str);
                    Clause clause3 = model4.f;
                    Clause clauseB2 = clause3 != null ? TextWithHighlightsClause.Companion.b(companion, clause3, str) : clause;
                    RowDelegate.Model.c cVar = model4.k;
                    if (cVar instanceof pf) {
                        pf pfVar2 = (pf) cVar;
                        Clause clause4 = pfVar2.f54591a;
                        Clause clauseB3 = clause4 != null ? TextWithHighlightsClause.Companion.b(companion, clause4, str) : clause;
                        Image image = pfVar2.f54592b;
                        h4 style2 = pfVar2.f54593c;
                        boolean z41 = pfVar2.d;
                        boolean z49 = pfVar2.e;
                        it8 = it12;
                        Object obj4 = pfVar2.f;
                        String str2 = pfVar2.f54594g;
                        AnimationRequest animationRequest = pfVar2.f54595h;
                        String str3 = pfVar2.i;
                        Intrinsics.checkNotNullParameter(style2, "style");
                        pfVar = new pf(clauseB3, image, style2, z41, z49, obj4, str2, animationRequest, str3);
                    } else {
                        it8 = it12;
                        pfVar = cVar;
                    }
                    rowItems.add(RowDelegate.Model.x(model4, null, null, clauseB, clauseB2, null, 0, pfVar, false, null, null, 0, 0, 0, 0, null, -1061, 15));
                    it12 = it8;
                    clause = null;
                }
                LargeActionButtonDelegate.Model model5 = j3Var2.f54318b;
                Intrinsics.checkNotNullParameter(rowItems, "rowItems");
                j3Var = new j3(rowItems, model5);
            }
            return ChatItemsDelegate.Model.e(model3, j3Var, position, null, lVar, imageO2, cVarT, z4, iC3, iB3, 105034);
        }
        if (bVarB3 instanceof ChatTravelPreviewDelegate.Model) {
            ChatTravelPreviewDelegate.Model model6 = (ChatTravelPreviewDelegate.Model) bVarB3;
            ChatBubbleDelegate.c style3 = t(position);
            Image imageO3 = o(message.getAuthor(), position, messageInGroupData);
            int iC4 = messageInGroupData.c();
            int iB4 = messageInGroupData.b();
            u3 items = model6.f52078a;
            String listId3 = model6.f52079b;
            Clause clause5 = model6.e;
            gw0.q qVar2 = model6.f52082h;
            Object obj5 = model6.f52083j;
            Parcelable parcelable3 = model6.k;
            int i22 = model6.f52086n;
            int i32 = model6.o;
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(listId3, "listId");
            Intrinsics.checkNotNullParameter(position, "position");
            Intrinsics.checkNotNullParameter(style3, "style");
            return new ChatTravelPreviewDelegate.Model(items, listId3, position, imageO3, clause5, style3, z4, qVar2, true, obj5, parcelable3, iC4, iB4, i22, i32);
        }
        if (bVarB3 instanceof ChatTilesCollectionDelegate.Model) {
            ChatTilesCollectionDelegate.Model model7 = (ChatTilesCollectionDelegate.Model) bVarB3;
            ChatBubbleDelegate.c style4 = t(position);
            Image imageO4 = o(message.getAuthor(), position, messageInGroupData);
            int iC5 = messageInGroupData.c();
            int iB5 = messageInGroupData.b();
            q3 items2 = model7.f52059a;
            String listId4 = model7.f52060b;
            Clause clause6 = model7.e;
            gw0.q qVar3 = model7.f52063h;
            Object obj6 = model7.f52064j;
            Parcelable parcelable4 = model7.k;
            int i33 = model7.f52067n;
            int i43 = model7.o;
            Intrinsics.checkNotNullParameter(items2, "items");
            Intrinsics.checkNotNullParameter(listId4, "listId");
            Intrinsics.checkNotNullParameter(position, "position");
            Intrinsics.checkNotNullParameter(style4, "style");
            return new ChatTilesCollectionDelegate.Model(items2, listId4, position, imageO4, clause6, style4, z4, qVar3, true, obj6, parcelable4, iC5, iB5, i33, i43);
        }
        if (bVarB3 instanceof ChatContextualChartDelegate.Model) {
            ChatContextualChartDelegate.Model model8 = (ChatContextualChartDelegate.Model) bVarB3;
            ChatBubbleDelegate.c style5 = t(position);
            Image imageO5 = o(message.getAuthor(), position, messageInGroupData);
            int iC6 = messageInGroupData.c();
            int iB6 = messageInGroupData.b();
            aw0.s2 complexTitle = model8.f52028a;
            ul ulVar = model8.f52029b;
            Clause clause7 = model8.f52030c;
            Clause clause8 = model8.d;
            k0 titleStyle = model8.e;
            List list5 = model8.f;
            cb chartColorScheme = model8.f52031g;
            boolean z54 = model8.f52032h;
            hw0.x xVar = model8.i;
            boolean z74 = model8.f52033j;
            Pair pair = model8.k;
            boolean z83 = model8.f52034l;
            aw0.l1 chartInterpolation = model8.f52035m;
            hm0 chartLineStyle = model8.f52036n;
            z zVar = model8.o;
            int i59 = model8.f52037p;
            List tabs = model8.f52038q;
            String str4 = model8.f52039r;
            String listId5 = model8.f52040s;
            gw0.q qVar4 = model8.f52043x;
            Object obj7 = model8.z;
            Parcelable parcelable5 = model8.A;
            int i66 = model8.D;
            int i74 = model8.E;
            Intrinsics.checkNotNullParameter(complexTitle, "complexTitle");
            Intrinsics.checkNotNullParameter(titleStyle, "titleStyle");
            Intrinsics.checkNotNullParameter(chartColorScheme, "chartColorScheme");
            Intrinsics.checkNotNullParameter(chartInterpolation, "chartInterpolation");
            Intrinsics.checkNotNullParameter(chartLineStyle, "chartLineStyle");
            Intrinsics.checkNotNullParameter(tabs, "tabs");
            Intrinsics.checkNotNullParameter(listId5, "listId");
            Intrinsics.checkNotNullParameter(position, "position");
            Intrinsics.checkNotNullParameter(style5, "style");
            return new ChatContextualChartDelegate.Model(complexTitle, ulVar, clause7, clause8, titleStyle, list5, chartColorScheme, z54, xVar, z74, pair, z83, chartInterpolation, chartLineStyle, zVar, i59, tabs, str4, listId5, position, imageO5, style5, z4, qVar4, true, obj7, parcelable5, iC6, iB6, i66, i74);
        }
        if (bVarB3 instanceof ContextualBarChartDelegate.Model) {
            ContextualBarChartDelegate.Model model9 = (ContextualBarChartDelegate.Model) bVarB3;
            ChatBubbleDelegate.c style6 = t(position);
            Image imageO6 = o(message.getAuthor(), position, messageInGroupData);
            int iC7 = messageInGroupData.c();
            int iB7 = messageInGroupData.b();
            String listId6 = model9.f52127a;
            x2 data2 = model9.f52128b;
            Object obj8 = model9.d;
            gw0.q qVar5 = model9.f52131h;
            Parcelable parcelable6 = model9.f52132j;
            int i92 = model9.f52134m;
            int i96 = model9.f52135n;
            Intrinsics.checkNotNullParameter(listId6, "listId");
            Intrinsics.checkNotNullParameter(data2, "data");
            Intrinsics.checkNotNullParameter(position, "position");
            Intrinsics.checkNotNullParameter(style6, "style");
            return new ContextualBarChartDelegate.Model(listId6, data2, position, obj8, style6, imageO6, z4, qVar5, true, parcelable6, iC7, iB7, i92, i96);
        }
        if (bVarB3 instanceof ContextualLineChartDelegate.Model) {
            ContextualLineChartDelegate.Model model10 = (ContextualLineChartDelegate.Model) bVarB3;
            ChatBubbleDelegate.c style7 = t(position);
            Image imageO7 = o(message.getAuthor(), position, messageInGroupData);
            int iC8 = messageInGroupData.c();
            int iB8 = messageInGroupData.b();
            z2 data3 = model10.f52137a;
            String listId7 = model10.f52138b;
            gw0.q qVar6 = model10.f52140g;
            Object obj9 = model10.i;
            Parcelable parcelable7 = model10.f52142j;
            int i99 = model10.f52144m;
            int i100 = model10.f52145n;
            Intrinsics.checkNotNullParameter(data3, "data");
            Intrinsics.checkNotNullParameter(listId7, "listId");
            Intrinsics.checkNotNullParameter(position, "position");
            Intrinsics.checkNotNullParameter(style7, "style");
            return new ContextualLineChartDelegate.Model(data3, listId7, position, style7, imageO7, z4, qVar6, true, obj9, parcelable7, iC8, iB8, i99, i100);
        }
        if (bVarB3 instanceof ChatSmartTileSendMoneyDelegate.Model) {
            ChatSmartTileSendMoneyDelegate.Model model11 = (ChatSmartTileSendMoneyDelegate.Model) bVarB3;
            ChatBubbleDelegate.c style8 = t(position);
            int iC9 = messageInGroupData.c();
            int iB9 = messageInGroupData.b();
            String listId8 = model11.f53894a;
            v9 content = model11.f53895b;
            Object obj10 = model11.e;
            Intrinsics.checkNotNullParameter(listId8, "listId");
            Intrinsics.checkNotNullParameter(content, "content");
            Intrinsics.checkNotNullParameter(position, "position");
            Intrinsics.checkNotNullParameter(style8, "style");
            return new ChatSmartTileSendMoneyDelegate.Model(listId8, content, position, style8, obj10, iC9, iB9);
        }
        if (!(bVarB3 instanceof ChatSmartTileSendMoneyLoadingDelegate.Model)) {
            return bVarB3;
        }
        ChatSmartTileSendMoneyLoadingDelegate.Model model12 = (ChatSmartTileSendMoneyLoadingDelegate.Model) bVarB3;
        ChatBubbleDelegate.c style9 = t(position);
        int iC10 = messageInGroupData.c();
        int iB10 = messageInGroupData.b();
        String listId9 = model12.f53900a;
        Object obj11 = model12.d;
        Parcelable parcelable8 = model12.e;
        Intrinsics.checkNotNullParameter(listId9, "listId");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(style9, "style");
        return new ChatSmartTileSendMoneyLoadingDelegate.Model(listId9, position, style9, obj11, parcelable8, iC10, iB10);
    }

    public final Clause n(MessageAuthor messageAuthor, cam.f chatItemPosition, s messageInGroupData) {
        if (!this.i) {
            return null;
        }
        Intrinsics.checkNotNullParameter(chatItemPosition, "chatItemPosition");
        Intrinsics.checkNotNullParameter(messageInGroupData, "messageInGroupData");
        if (!(chatItemPosition instanceof gw0.i)) {
            return null;
        }
        if ((messageInGroupData instanceof r) || (messageInGroupData instanceof q)) {
            return z50.b.c(messageAuthor);
        }
        return null;
    }

    public final Image o(MessageAuthor messageAuthor, cam.f chatItemPosition, s messageInGroupData) {
        if (!this.f212523j) {
            return null;
        }
        Intrinsics.checkNotNullParameter(chatItemPosition, "chatItemPosition");
        Intrinsics.checkNotNullParameter(messageInGroupData, "messageInGroupData");
        if (!(chatItemPosition instanceof gw0.i)) {
            return null;
        }
        if ((messageInGroupData instanceof o) || (messageInGroupData instanceof q)) {
            return this.f212518a.f319400a.a(messageAuthor);
        }
        return null;
    }

    public final Clause x(MessageAuthor messageAuthor, c cVar) {
        if (cVar == c.COMPOSER && this.f212524l == c0.ASSISTANT) {
            return new TextLocalisedClause(R$string.context_menu_action_ask_air, null, null, 14);
        }
        if (messageAuthor instanceof User) {
            int i = x.f212517c[cVar.ordinal()];
            if (i == 1) {
                return new TextLocalisedClause(R$string.chat_message_you, null, null, 14);
            }
            if (i == 2) {
                return new TextLocalisedClause(R$string.chat_message_reply_composer_yourself, null, null, 14);
            }
            throw new NoWhenBranchMatchedException();
        }
        messageAuthor.getClass();
        ChatAgent.Live live = messageAuthor instanceof ChatAgent.Live ? (ChatAgent.Live) messageAuthor : null;
        String name = live != null ? live.getName() : null;
        Clause textClause = name != null ? new TextClause(name, (Style) null, (Integer) null, false, (o9) null, (List) null, 126) : (this.f212524l == c0.ASSISTANT && this.f212525m) ? new TextLocalisedClause(R$string.chat_agent_air_name, null, null, 14) : new TextLocalisedClause(R$string.chat_support_suggestions_assistant_name, null, null, 14);
        int i2 = x.f212517c[cVar.ordinal()];
        if (i2 == 1) {
            return textClause;
        }
        if (i2 == 2) {
            return new TextLocalisedClause(R$string.chat_message_reply_composer_author, zhm.u.c(textClause), null, 12);
        }
        throw new NoWhenBranchMatchedException();
    }
}
