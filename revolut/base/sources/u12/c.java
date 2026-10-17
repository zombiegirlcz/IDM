package u12;

import com.revolut.domain.models.moneyrequest.MoneyRequestChannel;
import h12.h;
import iz1.n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rd0.e;
import tof.f7;
import tof.h7;
import tof.i7;
import tof.l;
import tof.q7;
import tof.sa;
import tof.u9;
import tof.v5;
import tyg.g;
import vkm.d;
import xx9.p;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements h {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f276331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f276332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ax1.a f276333c;
    public final whf.b d;

    public c(p recentRecipientInteractor, n apmPayDraftsRepository, ax1.a moneyRequestInteractor, whf.b transactionsContentProvider) {
        Intrinsics.checkNotNullParameter(recentRecipientInteractor, "recentRecipientInteractor");
        Intrinsics.checkNotNullParameter(apmPayDraftsRepository, "apmPayDraftsRepository");
        Intrinsics.checkNotNullParameter(moneyRequestInteractor, "moneyRequestInteractor");
        Intrinsics.checkNotNullParameter(transactionsContentProvider, "transactionsContentProvider");
        this.f276331a = recentRecipientInteractor;
        this.f276332b = apmPayDraftsRepository;
        this.f276333c = moneyRequestInteractor;
        this.d = transactionsContentProvider;
    }

    public static q7 e(tof.n nVar, l lVar, v5 v5Var, i7 i7Var) {
        i7.c cVar = i7.Companion;
        f7 f7Var = new f7(lVar);
        h7 h7Var = new h7(nVar);
        sa saVar = v5Var != null ? new sa(v5Var) : null;
        cVar.getClass();
        return i7.c.a(i7.c.b(f7Var, h7Var, saVar), new u9(false), i7Var);
    }

    public final d c(Class clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return d(clazz, new g(22));
    }

    public final d d(Class clazz, Function1 predicate) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return e.b(nim.a.w(p.c(this.f276331a, false, null, 3), new twg.a(predicate, clazz, 15)));
    }

    public final d f(MoneyRequestChannel.APM channel) {
        Intrinsics.checkNotNullParameter(channel, "channel");
        pz1.c cVar = (pz1.c) this.f276333c;
        Intrinsics.checkNotNullParameter(channel, "channel");
        return e.b(nim.a.w(((u6k.h) cVar.f240866b).d(true), new pth.l(channel, 21)));
    }
}
