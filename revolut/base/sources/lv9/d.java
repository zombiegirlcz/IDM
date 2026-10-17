package lv9;

import androidx.room.RxRoom;
import ang.f;
import com.revolut.feature.payments.messaging.data.api.model.ChatItem;
import dv9.k;
import dv9.l;
import dv9.m;
import dv9.t;
import efm.r;
import g48.h;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import nrd.g;
import te0.w;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nv9.b f200340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f200341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f200342c;

    public d(nv9.b repository, f userInteractor, a favoriteReactionsStorage) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(favoriteReactionsStorage, "favoriteReactionsStorage");
        this.f200340a = repository;
        this.f200341b = userInteractor;
        this.f200342c = favoriteReactionsStorage;
    }

    public final r a(m conversation) {
        Pair pair;
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        nv9.b bVar = this.f200340a;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        if (conversation instanceof k) {
            pair = new Pair(((k) conversation).f118074c, Boolean.TRUE);
        } else {
            if (!(conversation instanceof l)) {
                throw new NoWhenBranchMatchedException();
            }
            pair = new Pair(((l) conversation).f118075b, Boolean.FALSE);
        }
        String str = (String) pair.f186385a;
        boolean zBooleanValue = ((Boolean) pair.f186386b).booleanValue();
        gv9.k kVar = bVar.f219567a;
        r map = RxRoom.createObservable(kVar.f147117a, false, new String[]{"payments_message_reactions"}, new h(kVar, str, zBooleanValue, 3)).map(new noi.l(17, new g(bVar, 14)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        r map2 = w.f0(map).map(new lr9.m(new c(0), 16));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        return map2;
    }

    public final pfm.a b(ChatItem chatItem, m conversation, String reaction) {
        Intrinsics.checkNotNullParameter(conversation, "conversation");
        Intrinsics.checkNotNullParameter(reaction, "reaction");
        Intrinsics.checkNotNullParameter(chatItem, "chatItem");
        String relatedEntityId = c8g.a.i(chatItem);
        t relatedEntityType = c8g.a.k(chatItem);
        nv9.b bVar = this.f200340a;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(relatedEntityId, "relatedEntityId");
        Intrinsics.checkNotNullParameter(relatedEntityType, "relatedEntityType");
        ufm.c cVar = new ufm.c(new a9j.k(bVar, 24, relatedEntityType, relatedEntityId), 2);
        Intrinsics.checkNotNullExpressionValue(cVar, "fromCallable(...)");
        pfm.a aVar = new pfm.a(w.H0(w.i0(cVar), this.f200341b.f(false)), new lr9.m(new ja3.d(this, conversation, reaction, chatItem, 18), 15), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }
}
