package wu9;

import a9j.k;
import com.revolut.feature.payments.messaging.data.api.model.ChatItem;
import dv9.m;
import dv9.t;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import ufm.i;
import ufm.n;
import wp5.v;

/* JADX INFO: loaded from: classes5.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lv9.d f300084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ang.f f300085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lv9.a f300086c;

    public c(lv9.d messageReactionsInteractor, ang.f userInteractor, lv9.a favoriteReactionsStorage) {
        Intrinsics.checkNotNullParameter(messageReactionsInteractor, "messageReactionsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(favoriteReactionsStorage, "favoriteReactionsStorage");
        this.f300084a = messageReactionsInteractor;
        this.f300085b = userInteractor;
        this.f300086c = favoriteReactionsStorage;
    }

    public final i a(ChatItem chatItem, m conversation) {
        Intrinsics.checkNotNullParameter(chatItem, "chatItem");
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        Intrinsics.checkNotNullParameter(chatItem, "chatItem");
        nv9.b bVar = this.f300084a.f200340a;
        String relatedEntityId = c8g.a.i(chatItem);
        t relatedEntityType = c8g.a.k(chatItem);
        bVar.getClass();
        Intrinsics.checkNotNullParameter(relatedEntityId, "relatedEntityId");
        Intrinsics.checkNotNullParameter(relatedEntityType, "relatedEntityType");
        ufm.c cVar = new ufm.c(new k(bVar, 24, relatedEntityType, relatedEntityId), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        n nVarI0 = w.i0(cVar);
        d0 d0VarF = this.f300085b.f(false);
        ufm.c cVar2 = new ufm.c(new h4d.d(this.f300086c, 19), 2);
        Intrinsics.checkNotNullExpressionValue(cVar2, "fromCallable(...)");
        i iVar = new i(w.I0(nVarI0, d0VarF, cVar2), new wsg.k(new v(this, chatItem, conversation), 8), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
