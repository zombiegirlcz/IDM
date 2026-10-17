package g30;

import aii.p;
import aii.u;
import com.revolut.chat.ChatApi$Toggles;
import com.revolut.chat.navigation.ArchiveDestination;
import com.revolut.chat.navigation.ChatFlowDestination;
import com.revolut.chat.navigation.InboxDestination;
import com.revolut.chat.ui.archive.ArchiveScreen;
import com.revolut.chat.ui.chat_profile.profile_screen.ChatProfileScreen;
import com.revolut.chat.ui.chat_profile.profile_screen.ChatProfileScreenDestination;
import com.revolut.chat.ui.flow.ChatFlow;
import com.revolut.chat.ui.inbox.InboxScreen;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a implements p, nte.a {
    @Override // nte.a
    public final List e() {
        return ChatApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof ChatFlowDestination) {
            return new ChatFlow(((ChatFlowDestination) destination).getF51110b());
        }
        if (destination instanceof InboxDestination) {
            return new InboxScreen();
        }
        if (destination instanceof ArchiveDestination) {
            return new ArchiveScreen();
        }
        if (destination instanceof ChatProfileScreenDestination) {
            return new ChatProfileScreen(((ChatProfileScreenDestination) destination).getF51131b());
        }
        return null;
    }
}
