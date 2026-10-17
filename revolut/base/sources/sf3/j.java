package sf3;

import aii.p;
import aii.u;
import com.revolut.chat.domain.model.ChatFeed;
import com.revolut.chat.domain.model.ChatTarget;
import com.revolut.chat.domain.model.NewTicketContext;
import com.revolut.chat.domain.model.TicketCreationContext;
import com.revolut.chat.navigation.ChatFlowDestination;
import com.revolut.kompot.common.ParcelableDestination;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v30.t;
import zhm.y0;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements xii.b, p {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f262340a = y0.b(this);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f262341b = y0.b("support/chat/escalate");

    public static final class a {
        private a() {
        }
    }

    @Override // xii.b
    public final Set a() {
        return this.f262341b;
    }

    @Override // xii.b
    public final ParcelableDestination e(lg0.e deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        LinkedHashMap linkedHashMap = deeplink.f195041c;
        String strA = lg0.g.a("fromFeedId", linkedHashMap);
        String strA2 = lg0.g.a("fromMessageId", linkedHashMap);
        String strA3 = lg0.g.a("fromEntryPoint", linkedHashMap);
        if (strA == null || strA2 == null || strA3 == null) {
            return null;
        }
        return new ChatFlowDestination(new ChatTarget.Messages(new ChatFeed.Support(null, null, new TicketCreationContext((String) null, (List) null, (List) null, new NewTicketContext.PrivateBankingEscalation(strA, strA2, strA3), 23), 3), t.DEFAULT, null, 4), true);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        return null;
    }

    @Override // aii.p
    public final Set h() {
        return this.f262340a;
    }
}
