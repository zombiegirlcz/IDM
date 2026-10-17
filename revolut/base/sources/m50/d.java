package m50;

import com.revolut.chat.domain.model.ChatMode;
import com.revolut.chat.domain.model.draft.DraftRoutingKey;
import ip0.yc0;
import java.util.concurrent.atomic.AtomicReference;
import k50.i0;
import km2.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import skm.e0;
import v30.c0;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends i0 {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o30.a f202776l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final CoroutineScope f202777m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public DraftRoutingKey f202778n;
    public final AtomicReference o;

    public d(o30.a draftRepository, CoroutineScope appCoroutineScope) {
        Intrinsics.checkNotNullParameter(draftRepository, "draftRepository");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        this.f202776l = draftRepository;
        this.f202777m = appCoroutineScope;
        this.o = new AtomicReference(null);
    }

    public static final Object b3(d dVar, Continuation continuation) {
        DraftRoutingKey draftRoutingKey = dVar.f202778n;
        o30.c cVar = (o30.c) dVar.o.get();
        if (draftRoutingKey == null || cVar == null) {
            return Unit.f186387a;
        }
        Object objF = ((w20.e) dVar.f202776l).f(draftRoutingKey, cVar, continuation);
        return objF == fim.a.COROUTINE_SUSPENDED ? objF : Unit.f186387a;
    }

    @Override // yji.n
    public final void F2() {
        T2(new c(this, null, 1), new yi5.b(27));
    }

    @Override // k50.i0
    public final void Z2(c0 feedType, ChatMode chatMode, Flow domainStateFlow, yc0 onDraftRestored) {
        DraftRoutingKey draftRoutingKey;
        DraftRoutingKey assistant;
        Intrinsics.checkNotNullParameter(feedType, "feedType");
        Intrinsics.checkNotNullParameter(chatMode, "chatMode");
        Intrinsics.checkNotNullParameter(domainStateFlow, "domainStateFlow");
        Intrinsics.checkNotNullParameter(onDraftRestored, "onDraftRestored");
        DraftRoutingKey.INSTANCE.getClass();
        Intrinsics.checkNotNullParameter(feedType, "feedType");
        Intrinsics.checkNotNullParameter(chatMode, "chatMode");
        if (chatMode instanceof ChatMode.Feed) {
            int i = com.revolut.chat.domain.model.draft.a.f51103a[feedType.ordinal()];
            if (i == 1) {
                assistant = new DraftRoutingKey.Assistant(((ChatMode.Feed) chatMode).f51044a);
            } else if (i == 2) {
                assistant = new DraftRoutingKey.Support(((ChatMode.Feed) chatMode).f51044a);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                assistant = new DraftRoutingKey.PrivateBanking(((ChatMode.Feed) chatMode).f51044a);
            }
            draftRoutingKey = assistant;
        } else {
            if (!(chatMode instanceof ChatMode.Default) && !Intrinsics.f(chatMode, ChatMode.SingleFeed.f51045a)) {
                throw new NoWhenBranchMatchedException();
            }
            draftRoutingKey = null;
        }
        if (draftRoutingKey == null) {
            return;
        }
        this.f202778n = draftRoutingKey;
        e0.C(this.f202777m, null, null, new c(this, null, 0), 3);
        T2(new n(25, this, draftRoutingKey, onDraftRestored, domainStateFlow, (Continuation) null), new yi5.b(27));
    }
}
