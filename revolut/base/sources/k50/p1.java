package k50;

import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.chat.data.repository.chat.AgentInfo;
import com.revolut.chat.data.repository.chat.ChatAgent;
import com.revolut.chat.data.repository.chat.MessageAuthor;
import com.revolut.chat.ui.messageslist.MessagesContract$InputData;
import com.revolut.core.ui_kit.chat.prompt.ChatPromptSuggestion;
import com.revolut.core.ui_kit.delegates.chat.ShimmeringTextBubbleDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.tracking.v3.IdContext;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class p1 implements cli.n {

    @NotNull
    public static final n1 Companion = new n1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n50.d f181204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n50.l f181205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n50.y f181206c;
    public final b0 d;
    public final l80.e e;
    public final j30.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p80.a f181207g;

    public p1(MessagesContract$InputData inputData, n50.d bottomContainerFactory, n50.l messagesHeaderFactory, n50.y messagesListItemsFactory, b0 messageInGroupDataMapper, l80.e dateProvider, j30.c chatFeatureToggles, p80.a fileFormatter) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(bottomContainerFactory, "bottomContainerFactory");
        Intrinsics.checkNotNullParameter(messagesHeaderFactory, "messagesHeaderFactory");
        Intrinsics.checkNotNullParameter(messagesListItemsFactory, "messagesListItemsFactory");
        Intrinsics.checkNotNullParameter(messageInGroupDataMapper, "messageInGroupDataMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(chatFeatureToggles, "chatFeatureToggles");
        Intrinsics.checkNotNullParameter(fileFormatter, "fileFormatter");
        this.f181204a = bottomContainerFactory;
        this.f181205b = messagesHeaderFactory;
        this.f181206c = messagesListItemsFactory;
        this.d = messageInGroupDataMapper;
        this.e = dateProvider;
        this.f = chatFeatureToggles;
        this.f181207g = fileFormatter;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [com.revolut.core.ui_kit.models.Clause, java.lang.Object] */
    public static List b(b1 b1Var, boolean z) {
        List list = b1Var.f181031a;
        if (list == null) {
            return zhm.f0.f322471a;
        }
        List<v30.k0> list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        for (v30.k0 k0Var : list2) {
            String str = k0Var.f285801a;
            Image resourceImage = z ? new ResourceImage(k0Var.d, (Integer) null, (Integer) null, (Integer) null, (List) null, (ImageTransformations) null, (Clause) null, 254) : new GlyphImage(k0Var.d, null, null, 6);
            ?? r62 = k0Var.f285802b;
            AnalyticsContext.Companion companion = AnalyticsContext.INSTANCE;
            IdContext.a aVarNewBuilder = IdContext.newBuilder();
            aVarNewBuilder.h("suggestion-" + k0Var.f285801a);
            com.google.protobuf.w0 w0VarA = aVarNewBuilder.a();
            companion.getClass();
            arrayList.add(new ChatPromptSuggestion(str, resourceImage, r62, k0Var, new AnalyticsContext(AnalyticsContext.Companion.a(w0VarA))));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c8, code lost:
    
        r1 = r33;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x05ce  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x05d8  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x05ea  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x05ed  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x05f1  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x05f7  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x060f  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x069e  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x06c2  */
    /* JADX WARN: Removed duplicated region for block: B:472:0x0e7f  */
    /* JADX WARN: Removed duplicated region for block: B:475:0x0e87  */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0ef4  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0f85  */
    /* JADX WARN: Removed duplicated region for block: B:537:0x0f99  */
    /* JADX WARN: Removed duplicated region for block: B:539:0x0f9d  */
    /* JADX WARN: Type inference failed for: r6v31, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final yhm.r a(k50.h0 r77) {
        /*
            Method dump skipped, instruction units count: 4040
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k50.p1.a(k50.h0):yhm.r");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x043e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x0720  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0735  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x07a2  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x07ba  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x07e2  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x07f6  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0820  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0830  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0837  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x08a6  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x08e2  */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16, types: [com.revolut.core.ui_kit.models.Style, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v18 */
    @Override // cli.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cli.o c(cli.j r74) {
        /*
            Method dump skipped, instruction units count: 2334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k50.p1.c(cli.j):cli.o");
    }

    public final ShimmeringTextBubbleDelegate.Model d(h0 h0Var) {
        ChatAgent chatAgentA;
        String str;
        f1 f1Var = h0Var.f181082g;
        TextClause textClause = null;
        if (f1Var == null) {
            return null;
        }
        if (f1Var.a0() != null) {
            MessageAuthor messageAuthorA0 = f1Var.a0();
            chatAgentA = messageAuthorA0 instanceof ChatAgent ? (ChatAgent) messageAuthorA0 : null;
            if (chatAgentA != null) {
                UUID id10 = chatAgentA.getId();
                List list = h0Var.d.f181178a;
                int iJ = zhm.v.j(list);
                while (true) {
                    if (-1 >= iJ) {
                        break;
                    }
                    MessageAuthor author = ((v20.n) list.get(iJ)).getAuthor();
                    if (author instanceof ChatAgent) {
                        ChatAgent chatAgent = (ChatAgent) author;
                        if (Intrinsics.f(chatAgent.getId(), id10)) {
                            chatAgentA = chatAgent;
                            break;
                        }
                    }
                    iJ--;
                }
            }
        } else {
            AgentInfo agentInfo = (AgentInfo) h0Var.f181081c.getContent();
            chatAgentA = agentInfo != null ? agentInfo.a() : null;
        }
        v30.j jVar = (v30.j) h0Var.f181080b.getContent();
        if (jVar != null && (str = jVar.d) != null) {
            textClause = new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        xo0.a accessibilitySender = new xo0.a(textClause);
        boolean z = f1Var instanceof e1;
        n50.y yVar = this.f181206c;
        if (z) {
            Intrinsics.checkNotNullParameter(accessibilitySender, "accessibilitySender");
            boolean z3 = yVar.f212526n;
            n50.q qVar = new n50.q(false, false, z3, z3);
            cam.f fVarS = n50.y.s(qVar, true);
            return new ShimmeringTextBubbleDelegate.Model(com.revolut.core.ui_kit.delegates.chat.t.f53996a, yVar.n(chatAgentA, fVarS, qVar), n50.y.t(fVarS), accessibilitySender, yVar.o(chatAgentA, fVarS, qVar), fVarS, qVar.b(), qVar.c());
        }
        if (!(f1Var instanceof d1)) {
            throw new NoWhenBranchMatchedException();
        }
        String reasoningText = ((d1) f1Var).f181051b;
        Intrinsics.checkNotNullParameter(reasoningText, "reasoningText");
        Intrinsics.checkNotNullParameter(accessibilitySender, "accessibilitySender");
        boolean z4 = yVar.f212526n;
        n50.q qVar2 = new n50.q(false, false, z4, z4);
        cam.f fVarS2 = n50.y.s(qVar2, true);
        return new ShimmeringTextBubbleDelegate.Model(new com.revolut.core.ui_kit.delegates.chat.s(new TextClause(reasoningText, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), yVar.n(chatAgentA, fVarS2, qVar2), n50.y.t(fVarS2), accessibilitySender, yVar.o(chatAgentA, fVarS2, qVar2), fVarS2, qVar2.b(), qVar2.c());
    }
}
