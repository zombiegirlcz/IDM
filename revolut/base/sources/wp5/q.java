package wp5;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.crypto.withdraw.impl.R$string;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f299138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c1 f299139b;

    public /* synthetic */ q(c1 c1Var, int i) {
        this.f299138a = i;
        this.f299139b = c1Var;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f299138a) {
            case 0:
                c1 c1Var = this.f299139b;
                c1Var.F.onNext(Boolean.FALSE);
                ((rpi.b) c1Var.o).N(false);
                break;
            case 1:
                c1 c1Var2 = this.f299139b;
                up5.a0 a0Var = (up5.a0) c1Var2.i;
                efm.r rVarDistinctUntilChanged = te0.w.l(a0Var.C3(), a0Var.B3()).distinctUntilChanged();
                Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
                r rVar = new r(c1Var2, 3);
                Function1 function1K = c1Var2.K();
                Function0 function0J = c1Var2.J();
                efm.r rVarOnErrorResumeNext = rVarDistinctUntilChanged.onErrorResumeNext(new nw8.d(19, new vx5.r(new BreadcrumbException(), 24)));
                Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
                ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new ly7.g(25, rVar), new ly7.g(25, function1K), new t1i.n(14, function0J));
                te0.w.j0(c1Var2.f239031a, cVarSubscribe);
                Intrinsics.h(cVarSubscribe);
                break;
            case 2:
                ((rpi.b) this.f299139b.o).N(false);
                break;
            case 3:
                c1 c1Var3 = this.f299139b;
                ((rpi.b) c1Var3.o).N(false);
                opi.d dVar = c1Var3.f299103n;
                mp5.a aVar = ((yp5.f) c1Var3.f299100j).f315790a;
                TextLocalisedClause title = new TextLocalisedClause(R$string.crypto_withdrawals_network_title, null, null, 14);
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter("CRYPTO_WITHDRAW_DIALOG_DELEGATES_KEY", "delegatesKey");
                rp0.t tVar = new rp0.t(title, new TextLocalisedClause(R$string.crypto_withdrawals_multi_token_sheet_subtitle, null, null, 14), null, 28);
                LargeActionButton.ButtonStyle.DefaultFilledButton defaultFilledButton = LargeActionButton.ButtonStyle.f58726b;
                TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_withdrawals_multi_token_sheet_button, null, null, 14);
                int i = R$attr.uikit_dp16;
                int i2 = R$attr.uikit_dp24;
                ((opi.b) dVar).Z(new rp0.y(zhm.u.c(new LargeActionButtonDelegate.Model("LEARN_ABOUT_NETWORKS_ID", defaultFilledButton, null, textLocalisedClause, false, null, null, i2, i2, i, i, 496)), tVar, rp0.l.WINDOW, null, null, null, "CRYPTO_WITHDRAW_DIALOG_DELEGATES_KEY", null, null, null, 3832));
                break;
            case 4:
                c1 c1Var4 = this.f299139b;
                c1Var4.F.onNext(Boolean.TRUE);
                ((rpi.b) c1Var4.o).N(true);
                break;
            case 5:
                c1 c1Var5 = this.f299139b;
                c1Var5.Y(c1Var5.X());
                break;
            default:
                this.f299139b.G.d();
                break;
        }
    }
}
