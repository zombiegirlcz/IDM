package com.revolut.chat.ui.agentinfo;

import aii.q;
import android.content.Context;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewGroupKt;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.chat_core.R$layout;
import com.revolut.core.ui_kit.delegates.ChallengeMediumDelegate;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import com.revolut.core.ui_kit.delegates.GridBoxDelegate;
import com.revolut.core.ui_kit.delegates.IconDelegate;
import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.core.ui_kit.delegates.NewProductSmallDelegate;
import com.revolut.core.ui_kit.delegates.ProfileDelegate;
import com.revolut.core.ui_kit.delegates.RewardsGridDelegate;
import com.revolut.core.ui_kit.delegates.SmallCardDelegate;
import com.revolut.core.ui_kit.delegates.TextDelegate;
import com.revolut.core.ui_kit.views.navbar.BasicNavBar;
import com.revolut.core.ui_kit.views.navbar.NavBarWithToolbar;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import com.revolut.kompot.view.ControllerContainerCoordinatorLayout;
import fx5.a;
import g06.k;
import g40.c;
import g40.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jki.o;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.Job;
import no.m;
import org.jetbrains.annotations.NotNull;
import rd0.e;
import sji.b;
import vc.s;
import yhm.j;
import yy0.l;
import zhm.v;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00062\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/chat/ui/agentinfo/AgentInfoScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Lg40/c;", "Lcom/revolut/chat/ui/agentinfo/AgentInfoContract$InputData;", "Laii/q;", "Lno/m;", "Companion", "a", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AgentInfoScreen extends BaseRecyclerViewScreen<c, AgentInfoContract$InputData, q> implements m {
    public final int U;
    public final Lazy V;
    public final Lazy W;
    public final AnalyticsProduct.Shared X;
    public final ProfileDelegate Y;
    public final List Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final h f51114a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final ArrayList f51115b0;
    public static final /* synthetic */ KProperty[] c0 = {o0.f186429a.j(new h0(AgentInfoScreen.class, "binding", "getBinding()Lcom/revolut/chat_core/databinding/ScreenAgentInfoBinding;", 0))};

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: com.revolut.chat.ui.agentinfo.AgentInfoScreen$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AgentInfoScreen(AgentInfoContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_agent_info;
        this.V = j.b(new a(this, inputData, 8));
        this.W = j.b(new fp3.a(this, 22));
        this.X = d40.a.f111223a;
        ProfileDelegate profileDelegate = new ProfileDelegate();
        this.Y = profileDelegate;
        this.Z = v.k(new FullScreenStateDelegate(), new NewProductSmallDelegate(), new GridBoxDelegate(v.k(new CounterTextDelegate(), new IconDelegate(), new ChallengeMediumDelegate()), 9.0f, 8.0f, 2), new ListSubheaderDelegate(), new RewardsGridDelegate(), profileDelegate, new SmallCardDelegate(null), new TextDelegate());
        this.f51114a0 = s.t(this, i.f);
        this.f51115b0 = new ArrayList();
    }

    @Override // no.m
    /* JADX INFO: renamed from: P */
    public final AnalyticsProduct getN() {
        return this.X;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final b S2() {
        return (h30.i) this.V.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final jki.h T2() {
        return (g40.b) this.W.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        h3();
        com.revolut.kompot.navigable.a.g2(this, e.b(this.Y.d), null, new k(this, null, 12), 3);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        i3().f1507c.setTag("AgentScreen_recyclerView");
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getZ() {
        return this.Z;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: g3, reason: merged with bridge method [inline-methods] */
    public final void Z2(c uiState, o oVar) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        ControllerContainerCoordinatorLayout agentInfoRoot = i3().f1506b;
        if (agentInfoRoot.getChildCount() == 1) {
            Context context = i3().f1505a.getContext();
            Intrinsics.h(context);
            BasicNavBar basicNavBar = new BasicNavBar(context, null);
            basicNavBar.setNavigationButtonIcon(Integer.valueOf(ofm.q.k(q2())));
            basicNavBar.setTag("AgentScreen_navBarBasic");
            basicNavBar.setLayoutParams(new CoordinatorLayout.LayoutParams(-1, -2));
            basicNavBar.setFitsSystemWindows(true);
            agentInfoRoot.addView(basicNavBar, 0);
            h3();
        }
        Intrinsics.checkNotNullExpressionValue(agentInfoRoot, "agentInfoRoot");
        View view = ViewGroupKt.get(agentInfoRoot, 0);
        if (view instanceof NavBarWithToolbar) {
            NavBarWithToolbar navBarWithToolbar = (NavBarWithToolbar) view;
            navBarWithToolbar.setTitle(null, null);
            navBarWithToolbar.setEndImage((l) null);
            navBarWithToolbar.setDescriptionText(null);
            navBarWithToolbar.setDescriptionVisible(false);
        }
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.U;
    }

    public final void h3() {
        a60.a aVarI3 = i3();
        if (aVarI3.f1506b.getChildCount() <= 1) {
            return;
        }
        ArrayList arrayList = this.f51115b0;
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            ((Job) it8.next()).f(null);
        }
        arrayList.clear();
        View childAt = aVarI3.f1506b.getChildAt(0);
        if (childAt instanceof BasicNavBar) {
            arrayList.add(com.revolut.kompot.navigable.a.g2(this, e.b(((BasicNavBar) childAt).f59211b), null, new g40.j(this, null, 0), 3));
        } else if (childAt instanceof NavBarWithToolbar) {
            arrayList.add(com.revolut.kompot.navigable.a.g2(this, e.b(((NavBarWithToolbar) childAt).f59410q), null, new g40.j(this, null, 1), 3));
        }
    }

    public final a60.a i3() {
        ViewBinding value = this.f51114a0.getValue(this, c0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (a60.a) value;
    }
}
