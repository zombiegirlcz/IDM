package l30;

import com.revolut.chat.ChatApi$Toggles;
import com.revolut.chat.domain.model.LastMessage;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import n30.v;
import q30.i;
import v20.f0;
import v20.o;
import v30.c0;
import v30.j;
import v30.t;
import vkm.d2;
import vkm.h2;
import vkm.q;
import vkm.t1;
import y20.g0;

/* JADX INFO: loaded from: classes19.dex */
public final class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f191831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f191832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j30.c f191833c;
    public final v d;
    public final i e;
    public final t30.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final df0.b f191834g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CoroutineScope f191835h;
    public volatile boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t1 f191836j;

    public e(o chatRepository, g0 messagesRepository, j30.c chatFeatureToggles, v chatModeResolver, i chatIntroPrefetcher, t30.f suggestionsInteractor, df0.b dateProvider, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(chatRepository, "chatRepository");
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        Intrinsics.checkNotNullParameter(chatFeatureToggles, "chatFeatureToggles");
        Intrinsics.checkNotNullParameter(chatModeResolver, "chatModeResolver");
        Intrinsics.checkNotNullParameter(chatIntroPrefetcher, "chatIntroPrefetcher");
        Intrinsics.checkNotNullParameter(suggestionsInteractor, "suggestionsInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f191831a = chatRepository;
        this.f191832b = messagesRepository;
        this.f191833c = chatFeatureToggles;
        this.d = chatModeResolver;
        this.e = chatIntroPrefetcher;
        this.f = suggestionsInteractor;
        this.f191834g = dateProvider;
        this.f191835h = scope;
        vkm.f fVarM = q.m(new kq5.d(this, null, 29));
        d2.Companion.getClass();
        this.f191836j = q.M(fVarM, scope, new h2(500L, 0L), 1);
    }

    public final f a(t chatSource) {
        Intrinsics.checkNotNullParameter(chatSource, "chatSource");
        t tVar = t.DEFAULT;
        if (chatSource == tVar) {
            chatSource = z50.c.f319402b ? z50.c.f319401a ? t.NEW_MESSAGE_DEEPLINK : t.DEEPLINK : null;
            if (chatSource == null) {
                chatSource = tVar;
            }
        }
        boolean zC = ((jte.d) ((rf3.d) this.f191833c).f253679a).c(ChatApi$Toggles.AssistantSuggestionsV3.f50970c);
        j jVarH = ((f0) this.f191831a).h(c0.ASSISTANT);
        if (zC) {
            return (((jVarH != null ? jVarH.f285790j : null) != null) || (chatSource == t.DEEPLINK || chatSource == t.NEW_MESSAGE_DEEPLINK)) ? f.MESSAGES : f.SUGGESTIONS;
        }
        if (chatSource == t.DEEPLINK) {
            return f.SUGGESTIONS;
        }
        if (chatSource == t.NEW_MESSAGE_DEEPLINK) {
            return f.MESSAGES;
        }
        if (jVarH == null) {
            return f.SUGGESTIONS;
        }
        long epochMilli = this.f191834g.a().toEpochMilli();
        LastMessage lastMessage = jVarH.f285790j;
        if (jVarH.k > 0 && lastMessage != null) {
            long millis = epochMilli - lastMessage.getTime().getMillis();
            if (chatSource == t.INBOX || millis < 172800000) {
                return f.MESSAGES;
            }
        }
        return (lastMessage == null || epochMilli - lastMessage.getTime().getMillis() >= 7200000) ? f.SUGGESTIONS : f.MESSAGES;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r9 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l30.e.b(gim.c):java.lang.Object");
    }
}
