package sf3;

import com.revolut.chat.domain.model.ChatFeed;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.domain.model.NewTicketContext;
import com.revolut.chat.domain.model.TicketCreationContext;
import com.revolut.chat.navigation.ChatFlowDestination;
import efm.d0;
import java.util.HashMap;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.p0;
import sri.m;
import te0.w;
import wp5.y;
import zkm.o;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements jf0.d, q06.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f262328a;

    public a(m navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f262328a = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "assistant") && Intrinsics.f(cVar.e(2), "escalate");
    }

    @Override // q06.k
    public final Object e(jf0.c cVar, Continuation continuation) {
        HashMap map = cVar.d;
        String str = (String) map.get("fromTicketId");
        String str2 = (String) map.get("fromMessageId");
        if (str == null || str2 == null) {
            return null;
        }
        return new q06.h(new ChatFlowDestination(new ChatTarget.Messages(new ChatFeed.Support(null, null, new TicketCreationContext((String) null, (List) null, (List) null, new NewTicketContext.AssistantEscalation(str, str2), 23), 3), null, null, 6), true), null);
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        HashMap map = deeplink.d;
        String str = (String) map.get("fromTicketId");
        String str2 = (String) map.get("fromMessageId");
        if (str != null && str2 != null) {
            p0 p0Var = p0.f264001a;
            return w.o0(o.f323119a, new qqj.g(this, str, str2, (Continuation) null));
        }
        ufm.b bVarM = d0.m(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }
}
