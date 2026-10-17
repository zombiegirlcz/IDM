package h25;

import android.net.Uri;
import ang.f;
import aw0.o9;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature.credit.models.CreditAccountType;
import com.revolut.feature.credit.tiles.api.models.ResumeCreditApplication;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.ImplicitActivityDestination;
import com.youTransactor.uCube.rpc.Constants;
import ft3.a1;
import ft3.d1;
import ft3.q0;
import grl.r2;
import gsh.w;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.text.a0;
import org.jetbrains.annotations.NotNull;
import sfe.h;
import sfe.i;
import sfe.k;
import sfe.l;
import sfe.n;
import sfe.p;
import sfe.q;
import sfe.r;
import sfe.s;
import wli.x;
import xq3.j;
import yhm.m;
import yhm.o;
import zhm.u;

/* JADX INFO: loaded from: classes22.dex */
public final class e extends r25.b {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x f148705l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final j60.a f148706m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final h64.d f148707n;
    public final j o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f148708p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gz3.a f148709q;

    public e(x deeplinkHandler, j60.a bottomDialogExtension, h64.d creditApplicationCloseFlowProvider, j creditApplicationLifecycleInteractor, f userInteractor, gz3.a startCreditApplicationNavigationDestinationProvider) {
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(creditApplicationCloseFlowProvider, "creditApplicationCloseFlowProvider");
        Intrinsics.checkNotNullParameter(creditApplicationLifecycleInteractor, "creditApplicationLifecycleInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(startCreditApplicationNavigationDestinationProvider, "startCreditApplicationNavigationDestinationProvider");
        this.f148705l = deeplinkHandler;
        this.f148706m = bottomDialogExtension;
        this.f148707n = creditApplicationCloseFlowProvider;
        this.o = creditApplicationLifecycleInteractor;
        this.f148708p = userInteractor;
        this.f148709q = startCreditApplicationNavigationDestinationProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e3(h25.e r8, ft3.d1 r9, grl.r2 r10, gim.c r11) {
        /*
            boolean r0 = r11 instanceof h25.c
            if (r0 == 0) goto L13
            r0 = r11
            h25.c r0 = (h25.c) r0
            int r1 = r0.f148701y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f148701y = r1
            goto L18
        L13:
            h25.c r0 = new h25.c
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f148699w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f148701y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            it3.d r8 = r0.v
            grl.r2 r9 = r0.u
            yhm.o.b(r11)
            r3 = r8
            goto L6f
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            grl.r2 r10 = r0.u
            yhm.o.b(r11)
            goto L51
        L3d:
            yhm.o.b(r11)
            xq3.j r11 = r8.o
            java.util.Set r9 = zhm.y0.b(r9)
            r0.u = r10
            r0.f148701y = r4
            java.lang.Object r11 = xq3.j.g(r11, r9, r0)
            if (r11 != r1) goto L51
            goto L6c
        L51:
            java.util.List r11 = (java.util.List) r11
            java.lang.Object r9 = zhm.d0.b0(r11)
            it3.d r9 = (it3.d) r9
            ang.f r8 = r8.f148708p
            r11 = 0
            efm.d0 r8 = r8.f(r11)
            r0.u = r10
            r0.v = r9
            r0.f148701y = r3
            java.lang.Object r11 = nim.a.b(r8, r0)
            if (r11 != r1) goto L6d
        L6c:
            return r1
        L6d:
            r3 = r9
            r9 = r10
        L6f:
            java.lang.String r8 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r8)
            do3.n r11 = (do3.n) r11
            wi0.b r4 = do3.q.y(r11)
            com.revolut.feature.credit.application.models.plugins.PluginPayload r2 = new com.revolut.feature.credit.application.models.plugins.PluginPayload
            com.revolut.feature.credit.application.models.plugins.EntryPointParams r5 = new com.revolut.feature.credit.application.models.plugins.EntryPointParams
            r8 = 0
            r5.<init>(r8, r9)
            r6 = 1
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h25.e.e3(h25.e, ft3.d1, grl.r2, gim.c):java.lang.Object");
    }

    @Override // r25.b
    public final Object b3(s sVar, Continuation continuation) throws Throwable {
        ProductAccountId productAccountIdZ2 = r25.b.Z2(sVar);
        if (productAccountIdZ2 != null) {
            ProductAccountId.Payload payload = productAccountIdZ2.f89730b;
            Continuation continuation2 = null;
            CreditAccountType.Application application = (CreditAccountType.Application) (!(payload instanceof CreditAccountType.Application) ? null : payload);
            if (application == null) {
                try {
                    m.Companion companion = m.INSTANCE;
                    throw new IllegalStateException("accountId id=" + productAccountIdZ2.f89729a + " payloadType=" + (payload != null ? payload.getClass().getName() : null) + " must contain " + o0.f186429a.b(CreditAccountType.Application.class) + " payload");
                } catch (CancellationException e) {
                    throw e;
                } catch (Throwable th10) {
                    m.Companion companion2 = m.INSTANCE;
                    Throwable thA = m.a(o.a(th10));
                    if (thA != null) {
                        hx7.e.n(thA);
                    }
                    application = null;
                }
            }
            if (application != null) {
                q0 q0Var = application.f70622c;
                if (sVar instanceof l) {
                    Object obj2 = ((l) sVar).f262418b;
                    if (!(obj2 instanceof ResumeCreditApplication)) {
                        throw new IllegalArgumentException(v0.a.h(obj2, "Payload = ", " is not supported by CreditApplicationEventHandler"));
                    }
                    A2(ov3.a.b(this.f148709q, r2.ACCOUNT_SWITCHER, ((ResumeCreditApplication) obj2).f70675a, wp3.a.OPEN_EXISTING_APPLICATION, null, null, null, null, 8178));
                } else if (sVar instanceof n) {
                    yx4.a aVar = yx4.b.Companion;
                    Object obj3 = ((n) sVar).f262423b;
                    aVar.getClass();
                    yx4.b bVarA = yx4.a.a(obj3);
                    Object obj4 = bVarA.f317545b;
                    if (obj4 instanceof ou3.f) {
                        f3((ou3.f) obj4, q0Var);
                    } else {
                        int i = 29;
                        int i2 = 22;
                        if (obj4 instanceof vu3.a) {
                            V2(new gm6.j(this, ((vu3.a) obj4).f292202b, continuation2, i2), new yi5.b(i));
                        } else {
                            String str = bVarA.f317544a;
                            if (this.f148705l.y1(str)) {
                                V2(new gm6.j(this, str, continuation2, i2), new yi5.b(i));
                            } else if (a0.H(str, "https", false) || a0.H(str, "http", false)) {
                                A2(new ExternalDestination.Browser(str, null));
                            } else {
                                A2(new BridgeDestination(new ActivityNavigateCommand(new ImplicitActivityDestination("android.intent.action.VIEW", null, null, null, Uri.parse(str), 14), null, null, null, 0, null, null, null, null, false, 1022)));
                            }
                        }
                    }
                } else if (sVar instanceof sfe.m) {
                    Object obj5 = ((sfe.m) sVar).f262421c;
                    if (obj5 instanceof ou3.f) {
                        f3((ou3.f) obj5, q0Var);
                    } else {
                        if (!(obj5 instanceof ResumeCreditApplication)) {
                            throw new IllegalArgumentException(v0.a.h(obj5, "payload = ", " is not supported by CreditApplicationEventHandler"));
                        }
                        A2(ov3.a.b(this.f148709q, r2.CREDIT_APPLICATION_CHECKLIST, q0Var, wp3.a.OPEN_EXISTING_APPLICATION, null, null, null, null, 8178));
                    }
                } else if (sVar instanceof q) {
                    A2(ov3.a.b(this.f148709q, r2.CREDIT_APPLICATION_CHECKLIST, q0Var, wp3.a.OPEN_EXISTING_APPLICATION, null, null, null, "slot-progress-todo-tile-primary-button-tag", 8178));
                } else {
                    if ((sVar instanceof h) || (sVar instanceof i)) {
                        throw new IllegalArgumentException("Event = " + sVar + " must be handled by common credit handler");
                    }
                    if (!(sVar instanceof p) && !(sVar instanceof r) && !(sVar instanceof sfe.o) && !(sVar instanceof sfe.j) && !(sVar instanceof k)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return Unit.f186387a;
            }
        }
        return Unit.f186387a;
    }

    @Override // r25.b
    public final boolean d3(Object model) {
        Intrinsics.checkNotNullParameter(model, "model");
        yx4.b.Companion.getClass();
        if (!Intrinsics.f(yx4.a.a(model).f317544a, "id-credit-application-popup-button")) {
            return false;
        }
        j60.a.v(this.f148706m, false, null, 3);
        return true;
    }

    public final void f3(ou3.f fVar, q0 q0Var) {
        r2 r2Var = r2.CREDIT_APPLICATION_DASHBOARD;
        Continuation continuation = null;
        if (fVar instanceof ou3.a) {
            V2(new w(this, new d1(q0Var.getF137852c(), q0Var.getD(), null), new a1(r2Var, null, null, null, null, 28), continuation, 12), new yi5.b(29));
            return;
        }
        if (fVar instanceof ou3.b) {
            V2(new gm6.j(this, ((ou3.b) fVar).f229785a, continuation, 22), new yi5.b(29));
            return;
        }
        if (fVar instanceof ou3.c) {
            A2(ov3.a.b(this.f148709q, r2Var, q0Var, wp3.a.OPEN_EXISTING_APPLICATION, null, null, null, null, 8178));
        } else if (fVar instanceof ou3.d) {
            ou3.n nVar = ((ou3.d) fVar).f229787a;
            this.f148706m.x(dy4.b.a(rp0.m.Companion, new TextLocalisedClause(R$string.application_dashboard_popup_title, u.c(new TextClause(nVar.f229804a, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), new TextLocalisedClause(R$string.application_dashboard_popup_subtitle, u.c(new HtmlClause(0, 30, (Integer) null, (Object) null, nVar.f229805b)), null, 12), new mp.p("id-credit-application-popup-button", new TextLocalisedClause(R$string.application_dashboard_popup_action_primary, u.c(new TextClause(nVar.f229806c, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), null, 12), (Object) null), null, null, Constants.TAG_F4));
        } else {
            if (!(fVar instanceof ou3.e)) {
                throw new NoWhenBranchMatchedException();
            }
            V2(new g0a.e(14, this, ((ou3.e) fVar).f229788a, new d1(q0Var.getF137852c(), q0Var.getD(), null), r2Var, null), new yi5.b(29));
        }
    }
}
