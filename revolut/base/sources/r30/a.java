package r30;

import be7.l;
import e0f.k;
import e30.b;
import efm.r;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.g;
import kotlin.jvm.internal.Intrinsics;
import rd0.e;
import te0.w;
import vkm.q;
import wyd.f;
import xlb.o;
import xy7.j;
import y20.b1;
import y20.g0;
import y20.i0;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g0 f251138a;

    public a(g0 messagesRepository) {
        Intrinsics.checkNotNullParameter(messagesRepository, "messagesRepository");
        this.f251138a = messagesRepository;
    }

    public final r a(UUID chatId) {
        b1 b1Var = (b1) this.f251138a;
        b1Var.getClass();
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        ConcurrentHashMap concurrentHashMap = b1Var.f310467t;
        Object obj2 = concurrentHashMap.get(chatId);
        int i = 2;
        if (obj2 == null) {
            b bVar = b1Var.f310464q;
            Intrinsics.checkNotNullParameter(chatId, "chatId");
            r rVarFilter = bVar.a(true).filter(new k(new l(3, chatId), 28));
            Intrinsics.checkNotNullExpressionValue(rVarFilter, "filter(...)");
            r rVarShare = rVarFilter.doFinally(new xza.a(b1Var, chatId, i)).share();
            Object objPutIfAbsent = concurrentHashMap.putIfAbsent(chatId, rVarShare);
            obj2 = objPutIfAbsent == null ? rVarShare : objPutIfAbsent;
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "getOrPut(...)");
        r rVarFilter2 = ((r) obj2).filter(new j(26, new i0(b1Var, 5)));
        Intrinsics.checkNotNullExpressionValue(rVarFilter2, "filter(...)");
        r rVarCompose = w.f0(e.c(new f(q.J(new f(e.b(rVarFilter2), b1Var, 19), new wc7.e(e.b(w.w0(b1Var.u)), 7, chatId, b1Var)), b1Var, 20), g.f186406a)).compose(new j(27, new o(1, b1Var.f310462n, z20.q.class, "applyLocalState", "applyLocalState(Lio/reactivex/Observable;)Lio/reactivex/Observable;", 0, 18)));
        Intrinsics.checkNotNullExpressionValue(rVarCompose, "compose(...)");
        return rVarCompose;
    }
}
