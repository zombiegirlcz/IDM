package com.revolut.crypto.challenge.impl.dialog.claim;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewbinding.ViewBinding;
import aw0.c7;
import aw0.n6;
import aw0.o9;
import b11.a;
import b11.e;
import b11.f;
import b11.g;
import b11.h;
import b11.i;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.pa;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Click;
import com.revolut.core.ui_kit.models.LocalDateClause$DateFormat;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.buttons.ActionFooterView;
import com.revolut.core.ui_kit.views.navbar.NavBarBottomSheet;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import com.revolut.crypto.challenge.api.R$string;
import com.revolut.kompot.common.R$layout;
import com.revolut.kompot.navigable.vc.SimpleViewController;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.recyclerkit.ScreenContentRecyclerView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KProperty;
import mx0.v5;
import pki.b;
import vc.s;
import z4l.j;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/revolut/crypto/challenge/impl/dialog/claim/ClaimRewardBottomSheetController;", "Lcom/revolut/kompot/navigable/vc/SimpleViewController;", "Lb11/e;", "feature_crypto_challenge_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ClaimRewardBottomSheetController extends SimpleViewController<e> {
    public static final /* synthetic */ KProperty[] U = {o0.f186429a.j(new h0(ClaimRewardBottomSheetController.class, "binding", "getBinding()Lcom/revolut/kompot/common/databinding/ScreenBottomSheetBaseBinding;", 0))};
    public final a N;
    public final int O;
    public final i P;
    public final h Q;
    public final ao.h R;
    public final PlainTextDelegate S;
    public final j T;

    public ClaimRewardBottomSheetController(a inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.N = inputData;
        this.O = R$layout.screen_bottom_sheet_base;
        this.P = new i();
        this.Q = h.f11709a;
        this.R = s.t(this, f.f);
        PlainTextDelegate plainTextDelegate = new PlainTextDelegate();
        this.S = plainTextDelegate;
        this.T = new j(7, u.c(plainTextDelegate), false);
    }

    @Override // com.revolut.kompot.navigable.vc.SimpleViewController, com.revolut.kompot.navigable.vc.ViewController
    /* JADX INFO: renamed from: R2 */
    public final b d() {
        return this.P;
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void Y2(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        NavBarBottomSheet navBarBottomSheet = d3().f174514c;
        this.Q.getClass();
        a inputData = this.N;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        navBarBottomSheet.setHeaderModel(new lw0.a(new TextLocalisedClause(R$string.crypto_challenge_progress_claim_dialog_title, u.c(inputData.f11703a), null, 12), null, null, null, false, 30));
        ScreenContentRecyclerView screenContentRecyclerView = d3().d;
        j jVar = this.T;
        screenContentRecyclerView.setAdapter(jVar);
        screenContentRecyclerView.setLayoutManager(new LinearLayoutManager(m2()));
        screenContentRecyclerView.setVisibility(0);
        screenContentRecyclerView.addItemDecoration(new o31.b());
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        List listC = u.c(new PlainTextDelegate.Model("MESSAGE_LIST_ID", (Clause) null, (Clause) yoj.b.m(new TextClause(" ", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), v.k(new TextLocalisedClause(R$string.crypto_challenge_progress_claim_dialog_message, v.k(inputData.f11703a, com.revolut.core.ui_kit.models.j.b(c7.Companion, inputData.f11704b, new LocalDateClause$DateFormat.DayAndMonth(0))), null, 12), new TextLocalisedClause(R$string.crypto_challenge_progress_claim_dialog_message_learn_more, null, new Click(30, (Integer) null, (Object) null, "MESSAGE_LEARN_MORE_ID", false), 10))), (v5) null, (UrlImage) null, false, (pa) null, (Object) null, (AnalyticsContext) null, 0, 0, 0, 0, 65518));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        jVar.c(listC);
        ActionFooterView actionFooterView = d3().f174513b;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        n6 n6Var = new n6(new TextLocalisedClause(R$string.crypto_challenge_progress_claim_dialog_cta_confirm_title, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020);
        actionFooterView.setModel(inputData.f11705c ? new aw0.h(false, n6Var, new n6(new TextLocalisedClause(R$string.crypto_challenge_progress_claim_dialog_cta_back_title, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121) : new aw0.e(false, null, null, n6Var, null, null, 55));
    }

    @Override // com.revolut.kompot.navigable.vc.ViewController
    public final void b3(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(view, "view");
        ViewController.P2(this, rd0.e.b(d3().f174513b.f), new g(this, null, 0), 3);
        ViewController.P2(this, rd0.e.b(d3().f174513b.f58955g), new g(this, null, 1), 3);
        ViewController.P2(this, rd0.e.b(this.S.d.f121375b), new g(this, null, 2), 3);
    }

    public final jii.e d3() {
        ViewBinding value = this.R.getValue(this, U[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (jii.e) value;
    }

    @Override // yji.o, yki.f
    /* JADX INFO: renamed from: getLayoutId, reason: from getter */
    public final int getL() {
        return this.O;
    }
}
