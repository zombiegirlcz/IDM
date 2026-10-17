package k50;

import com.revolut.chat.domain.model.ChatMode;
import com.revolut.chat.domain.model.TranscriptIdentifier;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes19.dex */
public final class u3 extends gim.i implements Function2 {
    public TranscriptIdentifier.Companion u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j4 f181258w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(j4 j4Var, Continuation continuation) {
        super(2, continuation);
        this.f181258w = j4Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new u3(this.f181258w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((u3) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        TranscriptIdentifier.Companion companion;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        j4 j4Var = this.f181258w;
        if (i == 0) {
            yhm.o.b(obj2);
            TranscriptIdentifier.Companion companion2 = TranscriptIdentifier.INSTANCE;
            this.u = companion2;
            this.v = 1;
            p2 p2Var = j4.Companion;
            Object objC3 = j4Var.c3(this);
            if (objC3 == aVar) {
                return aVar;
            }
            companion = companion2;
            obj2 = objC3;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            companion = this.u;
            yhm.o.b(obj2);
        }
        ChatMode mode = (ChatMode) obj2;
        UUID uuid = ((h0) ((vkm.j2) j4Var.f181140w0.f22677a).getValue()).f181079a;
        companion.getClass();
        Intrinsics.checkNotNullParameter(mode, "mode");
        boolean z = mode instanceof ChatMode.Default;
        TranscriptIdentifier feedId = TranscriptIdentifier.AllChats.f51078a;
        if (z) {
            if (uuid != null) {
                feedId = new TranscriptIdentifier.ChatId(uuid);
            }
        } else if (mode instanceof ChatMode.Feed) {
            feedId = new TranscriptIdentifier.FeedId(((ChatMode.Feed) mode).f51044a);
        } else if (!Intrinsics.f(mode, ChatMode.SingleFeed.f51045a)) {
            throw new NoWhenBranchMatchedException();
        }
        j4Var.f181141x.b3(feedId);
        return Unit.f186387a;
    }
}
