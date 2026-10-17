package com.revolut.feature.donations.impl.ui.kompot.screen.recurring.amount;

import aii.q;
import android.view.View;
import androidx.viewbinding.ViewBinding;
import ao.h;
import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.navbar.NavBarWithAvatar;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.donations.impl.R$id;
import com.revolut.feature.donations.impl.R$layout;
import com.revolut.feature.donations.impl.R$string;
import com.revolut.feature.donations.impl.ui.kompot.screen.recurring.amount.RecurringDonationAmountScreen;
import com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen;
import j2c.n;
import j68.a;
import java.util.List;
import jc6.e;
import jc6.g;
import jc6.i;
import jc6.l;
import jc6.m;
import jki.o;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import ma6.c;
import pa6.p;
import qd0.b;
import te0.w;
import vc.s;
import zhm.u;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/donations/impl/ui/kompot/screen/recurring/amount/RecurringDonationAmountScreen;", "Lcom/revolut/kompot/navigable/screen/BaseRecyclerViewScreen;", "Ljc6/m;", "Lcom/revolut/feature/donations/impl/ui/kompot/screen/recurring/amount/RecurringDonationAmountScreenContract$InputData;", "Laii/q;", "feature_donations_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RecurringDonationAmountScreen extends BaseRecyclerViewScreen<m, RecurringDonationAmountScreenContract$InputData, q> {

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f72100e0 = {o0.f186429a.j(new h0(RecurringDonationAmountScreen.class, "binding", "getBinding()Lcom/revolut/feature/donations/impl/databinding/ScreenRecurringDonationAmountBinding;", 0))};
    public final int U;
    public final int V;
    public final boolean W;
    public final h X;
    public b Y;
    public final Object Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final Object f72101a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final Object f72102b0;
    public final CenteredAmountDelegate c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final List f72103d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecurringDonationAmountScreen(RecurringDonationAmountScreenContract$InputData inputData) {
        super(inputData);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.U = R$layout.screen_recurring_donation_amount;
        this.V = R$id.recurringDonationAmount_recyclerView;
        this.W = true;
        this.X = s.t(this, e.f);
        final int i = 0;
        this.Z = w.y0(new Function0(this) { // from class: jc6.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RecurringDonationAmountScreen f172711b;

            {
                this.f172711b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                RecurringDonationAmountScreen recurringDonationAmountScreen = this.f172711b;
                switch (i2) {
                    case 0:
                        KProperty[] kPropertyArr = RecurringDonationAmountScreen.f72100e0;
                        qd0.b bVar = recurringDonationAmountScreen.Y;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    default:
                        KProperty[] kPropertyArr2 = RecurringDonationAmountScreen.f72100e0;
                        return (l) ((pa6.p) recurringDonationAmountScreen.f72101a0.getValue()).f234416g.get();
                }
            }
        });
        this.f72101a0 = w.y0(new a(this, inputData, 13));
        final int i2 = 1;
        this.f72102b0 = w.y0(new Function0(this) { // from class: jc6.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ RecurringDonationAmountScreen f172711b;

            {
                this.f172711b = this;
            }

            /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                RecurringDonationAmountScreen recurringDonationAmountScreen = this.f172711b;
                switch (i22) {
                    case 0:
                        KProperty[] kPropertyArr = RecurringDonationAmountScreen.f72100e0;
                        qd0.b bVar = recurringDonationAmountScreen.Y;
                        if (bVar != null) {
                            return new u80.d(((s80.b) bVar).b());
                        }
                        Intrinsics.r("languageProvider");
                        throw null;
                    default:
                        KProperty[] kPropertyArr2 = RecurringDonationAmountScreen.f72100e0;
                        return (l) ((pa6.p) recurringDonationAmountScreen.f72101a0.getValue()).f234416g.get();
                }
            }
        });
        CenteredAmountDelegate centeredAmountDelegate = new CenteredAmountDelegate(new n(this, 29));
        this.c0 = centeredAmountDelegate;
        this.f72103d0 = u.c(centeredAmountDelegate);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: O2 */
    public final void Z2(jki.m mVar, o oVar) {
        m uiState = (m) mVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        c cVarG3 = g3();
        cVarG3.f203957c.setAvatarImage(uiState.f172720b);
        cVarG3.f203956b.setModel(uiState.f172721c);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    public final sji.b S2() {
        return (p) this.f72101a0.getValue();
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void V2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.V2(view);
        Continuation continuation = null;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f203956b.f), null, new g(this, continuation, 0), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(g3().f203957c.f59338a), null, new g(this, continuation, 1), 3);
        CenteredAmountDelegate centeredAmountDelegate = this.c0;
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(centeredAmountDelegate.e.f121375b), null, new jc6.h(this, null), 3);
        com.revolut.kompot.navigable.a.g2(this, rd0.e.b(centeredAmountDelegate.f.f121375b), null, new i(this, null), 3);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, com.revolut.kompot.navigable.screen.BaseScreen
    public final void W2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.W2(view);
        b bVarN = ((p) this.f72101a0.getValue()).f234414b.i.n();
        s.j(bVarN);
        this.Y = bVarN;
        NavBarWithAvatar navBarWithAvatar = g3().f203957c;
        navBarWithAvatar.setToolbarTitle(new TextLocalisedClause(R$string.donations_recurring_title, null, null, 14));
        navBarWithAvatar.setNavigationButtonIcon(Integer.valueOf(R$drawable.uikit_icn_24_arrow_thin_left));
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    public final void Z2(jki.n nVar, o oVar) {
        m uiState = (m) nVar;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        super.Z2(uiState, oVar);
        c cVarG3 = g3();
        cVarG3.f203957c.setAvatarImage(uiState.f172720b);
        cVarG3.f203956b.setModel(uiState.f172721c);
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: c3, reason: from getter */
    public final List getF72103d0() {
        return this.f72103d0;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen
    /* JADX INFO: renamed from: e3, reason: from getter */
    public final int getV() {
        return this.V;
    }

    public final c g3() {
        ViewBinding value = this.X.getValue(this, f72100e0[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (c) value;
    }

    @Override // com.revolut.kompot.navigable.screen.BaseRecyclerViewScreen, yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getU() {
        return this.U;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.revolut.kompot.navigable.screen.BaseScreen
    /* JADX INFO: renamed from: h3, reason: merged with bridge method [inline-methods] */
    public final l T2() {
        return (l) this.f72102b0.getValue();
    }

    @Override // com.revolut.kompot.navigable.a
    public final Boolean s2() {
        return Boolean.valueOf(this.W);
    }
}
