package uu9;

import ipa.j;
import ipa.k;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import up5.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements hpa.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b90.a f283176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pu9.b f283177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jpf.a f283178c;
    public final ang.f d;
    public final u0a.a e;
    public final pu9.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u0a.a f283179g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f283180h;
    public final lfm.c i;

    public c(b90.a pushMessagesTools, pu9.b activeChatInteractor, jpf.a chatPushMessageMapper, ang.f userInteractor, u0a.a pushChatMessageDecryptor, pu9.e unreadNotificationsInteractor, u0a.a loadPushSenderInfoDelegate, h pushConversationMapper, lfm.c appDisposable) {
        Intrinsics.checkNotNullParameter(pushMessagesTools, "pushMessagesTools");
        Intrinsics.checkNotNullParameter(activeChatInteractor, "activeChatInteractor");
        Intrinsics.checkNotNullParameter(chatPushMessageMapper, "chatPushMessageMapper");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(pushChatMessageDecryptor, "pushChatMessageDecryptor");
        Intrinsics.checkNotNullParameter(unreadNotificationsInteractor, "unreadNotificationsInteractor");
        Intrinsics.checkNotNullParameter(loadPushSenderInfoDelegate, "loadPushSenderInfoDelegate");
        Intrinsics.checkNotNullParameter(pushConversationMapper, "pushConversationMapper");
        Intrinsics.checkNotNullParameter(appDisposable, "appDisposable");
        this.f283176a = pushMessagesTools;
        this.f283177b = activeChatInteractor;
        this.f283178c = chatPushMessageMapper;
        this.d = userInteractor;
        this.e = pushChatMessageDecryptor;
        this.f = unreadNotificationsInteractor;
        this.f283179g = loadPushSenderInfoDelegate;
        this.f283180h = pushConversationMapper;
        this.i = appDisposable;
    }

    @Override // hpa.a
    public final boolean b(j message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (!Intrinsics.f(k.b(message), "P2P_CHAT_MESSAGE") && !Intrinsics.f(k.b(message), "GROUP_CHAT_MESSAGE")) {
            return false;
        }
        String chatId = hx7.a.f(message);
        if (chatId == null && (chatId = k.c(message)) == null) {
            chatId = "";
        }
        pu9.b bVar = this.f283177b;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        ufm.c cVar = new ufm.c(new pu9.a(bVar, chatId, 0), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        pfm.a aVar = new pfm.a(cVar, new d0(15, new a(this, message, 0)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        this.i.a(ue0.e.r(w.g0(aVar), h0.f322473a).v());
        return true;
    }
}
