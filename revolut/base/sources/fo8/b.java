package fo8;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.junior_profile.api.models.JuniorBankingProfile;
import com.revolut.feature.junior_remote_login.api.model.RemoteLoginInvitation;
import fjd.g0;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import jl8.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import rd0.c;
import rd0.d;
import zhm.f0;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e f136838l;

    public b(e remoteLoginDevToolsInteractor) {
        Intrinsics.checkNotNullParameter(remoteLoginDevToolsInteractor, "remoteLoginDevToolsInteractor");
        this.f136838l = remoteLoginDevToolsInteractor;
    }

    @Override // fo8.a
    public final List Z2(RemoteLoginInvitation remoteLoginInvitation) {
        Intrinsics.checkNotNullParameter(remoteLoginInvitation, "remoteLoginInvitation");
        od0.a aVar = od0.a.f224253a;
        if (od0.a.g()) {
            return f0.f322471a;
        }
        if (Intrinsics.f(remoteLoginInvitation, RemoteLoginInvitation.Absent.INSTANCE) || (remoteLoginInvitation instanceof RemoteLoginInvitation.Accepted)) {
            return f0.f322471a;
        }
        if (!(remoteLoginInvitation instanceof RemoteLoginInvitation.Pending)) {
            throw new NoWhenBranchMatchedException();
        }
        LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("ID_DEV_SIMULATE_INVITATION_ACCEPTANCE", LargeActionButton.ButtonStyle.o, null, new TextClause("[DEV] Simulate invitation acceptance", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), false, "DEV_SIMULATE_INVITATION_ACCEPTANCE_LOADING_TAG", null, null, null, 936);
        yp0.b.r(model, R$attr.uikit_dp24, 0, 0, 0, 14);
        return u.c(model);
    }

    @Override // fo8.a
    public final void b3(JuniorBankingProfile juniorProfile) {
        Intrinsics.checkNotNullParameter(juniorProfile, "juniorProfile");
        od0.a aVar = od0.a.f224253a;
        Continuation continuation = null;
        if (!od0.a.g()) {
            V2(new g0(this, juniorProfile, continuation, 10), new yi5.b(29));
            return;
        }
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("The API is not supposed to be used in production");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.a(c.ERROR, null, null, unsupportedOperationException, h0Var);
    }
}
