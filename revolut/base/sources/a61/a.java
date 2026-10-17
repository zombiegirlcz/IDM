package a61;

import a09.m;
import a83.j0;
import akg.n;
import akl.p1;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.view.View;
import au6.d3;
import au6.k3;
import boh.f;
import cli.y;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.onfido.android.sdk.capture.ui.camera.liveness.LivenessConstants;
import com.revolut.core.error.data.model.ServerError;
import com.revolut.core.ui_kit.delegates.mc;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.code.CodeEditor;
import com.revolut.core.ui_kit.views.pin.PinCodeView;
import com.revolut.domain.models.user.UserCompanyRegion;
import com.revolut.feature.app_launcher.R$mipmap;
import com.revolut.feature.app_launcher.R$string;
import com.revolut.feature.retail.legacy.login.impl.R$id;
import com.revolut.feature.robo.impl.ui.screen.projection.ProjectionScreenContract$Input;
import com.revolut.feature_move_money.impl.amount.MoveMoneyAmountScreen;
import com.revolut.feature_move_money.impl.automation.screen.MoveMoneyAutomationScreen;
import com.revolut.kompot.navigable.vc.ViewController;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.trading.orders.ui.invest.placement.screens.edit.InvestOrderEditScreen;
import com.youTransactor.uCube.ITask;
import com.youTransactor.uCube.ITaskMonitor;
import com.youTransactor.uCube.TaskEvent;
import com.youTransactor.uCube.connexion.ConnectionService;
import com.youTransactor.uCube.connexion.DisconnectListener;
import com.youTransactor.uCube.mdm.BinaryUpdate;
import com.youTransactor.uCube.mdm.ServiceState;
import defpackage.o0;
import defpackage.v1;
import dp4.y0;
import efm.i0;
import et6.r1;
import ffk.t;
import fu0.h;
import hb4.k;
import i26.l;
import ioe.o;
import ioe.p;
import ioe.q;
import ioe.r;
import ioe.s;
import ioe.u;
import ip0.ic;
import ip0.l0;
import ipe.d;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.text.a0;
import kotlinx.coroutines.flow.Flow;
import rd0.e;
import retrofit2.HttpException;
import skm.e0;
import skm.p0;
import te0.w;
import tpi.i;
import tpi.j;
import ufm.b;
import xki.d;
import z0h.s1;
import zh9.u0;
import zhm.d0;
import zhm.h0;
import zhm.v;
import zp0.c;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements c, bhj.c, i0, knc.a, h, d, InstallReferrerStateListener, ITaskMonitor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f1532c;

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f1530a = i;
        this.f1531b = obj2;
        this.f1532c = obj3;
    }

    public static Flow S(a aVar) {
        aVar.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return f.e(nim.a.v(e.b(((t) aVar.f1532c).v(loadingStrategy)), new fe9.f(20)), new fca.d(aVar, 12));
    }

    @Override // fu0.h
    public void B() {
    }

    public b E(FeatureCommand featureCommand) {
        Intrinsics.checkNotNullParameter(featureCommand, "featureCommand");
        return w.o0(p0.f264003c, new f1g.a(this, featureCommand, null));
    }

    public void J() {
        boolean z;
        Activity activity = (Activity) this.f1531b;
        View viewFindViewById = activity.findViewById(R$id.login_pin_code_view);
        PinCodeView pinCodeView = viewFindViewById instanceof PinCodeView ? (PinCodeView) viewFindViewById : null;
        boolean z3 = true;
        if (pinCodeView != null) {
            pinCodeView.H0("twoFaLoading");
            z = true;
        } else {
            z = false;
        }
        View viewFindViewById2 = activity.findViewById(R$id.codeInput);
        CodeEditor codeEditor = viewFindViewById2 instanceof CodeEditor ? (CodeEditor) viewFindViewById2 : null;
        if (codeEditor != null) {
            codeEditor.setLoadingState(false);
        } else {
            z3 = z;
        }
        if (z3) {
            return;
        }
        ((i) ((j) this.f1532c)).Q();
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    public void M() {
        g2e.t tVar = (g2e.t) this.f1531b;
        r10.t tVar2 = (r10.t) this.f1532c;
        List appShortcuts = v.k(new hj2.a("exchange_v1", new TextLocalisedClause(R$string.app_shortcut_exchange_short, null, null, 14), new TextLocalisedClause(R$string.app_shortcut_exchange_long, null, null, 14), R$mipmap.ic_app_shortcut_exchange, new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("revolut").authority("app").appendEncodedPath("widget/move-money").build())), new hj2.a("topup_v1", new TextLocalisedClause(R$string.app_shortcut_topup_short, null, null, 14), new TextLocalisedClause(R$string.app_shortcut_topup_long, null, null, 14), R$mipmap.ic_app_shortcut_plus, new Intent("android.intent.action.VIEW", new Uri.Builder().scheme("revolut").authority("app").appendPath("topup").build())), new hj2.a("sendto_v1", new TextLocalisedClause(R$string.app_shortcut_sendto_short, null, null, 14), new TextLocalisedClause(R$string.app_shortcut_sendto_long, null, null, 14), R$mipmap.ic_app_shortcut_send, a3a.a.a()), new hj2.a("request_v1", new TextLocalisedClause(R$string.app_shortcut_request_short, null, null, 14), new TextLocalisedClause(R$string.app_shortcut_request_long, null, null, 14), R$mipmap.ic_app_shortcut_request, a3a.a.a()));
        Intrinsics.checkNotNullParameter(appShortcuts, "appShortcuts");
        List<hj2.a> list = appShortcuts;
        ArrayList shortcuts = new ArrayList(zhm.w.t(list, 10));
        for (hj2.a appShortcut : list) {
            Intrinsics.checkNotNullParameter(appShortcut, "appShortcut");
            Context context = (Context) tVar2.f250857a;
            ShortcutInfo.Builder intents = new ShortcutInfo.Builder(context, appShortcut.f152647a).setIntents(new Intent[]{appShortcut.e});
            f01.c cVar = (f01.c) tVar2.f250858b;
            ShortcutInfo shortcutInfoBuild = intents.setShortLabel(cVar.b(appShortcut.f152648b)).setLongLabel(cVar.b(appShortcut.f152649c)).setIcon(Icon.createWithResource(context, appShortcut.d)).build();
            Intrinsics.checkNotNullExpressionValue(shortcutInfoBuild, "build(...)");
            shortcuts.add(shortcutInfoBuild);
        }
        ?? r110 = ((r10.w) tVar.f140031b).f250866b;
        Intrinsics.checkNotNullParameter(shortcuts, "shortcuts");
        ArrayList arrayList = new ArrayList(zhm.w.t(shortcuts, 10));
        Iterator it8 = shortcuts.iterator();
        while (it8.hasNext()) {
            arrayList.add(((ShortcutInfo) it8.next()).getId());
        }
        HashSet hashSetB1 = d0.b1(arrayList);
        List<ShortcutInfo> dynamicShortcuts = ((ShortcutManager) r110.getValue()).getDynamicShortcuts();
        Intrinsics.checkNotNullExpressionValue(dynamicShortcuts, "getDynamicShortcuts(...)");
        List<ShortcutInfo> list2 = dynamicShortcuts;
        ArrayList arrayList2 = new ArrayList(zhm.w.t(list2, 10));
        Iterator<T> it9 = list2.iterator();
        while (it9.hasNext()) {
            arrayList2.add(((ShortcutInfo) it9.next()).getId());
        }
        ArrayList shortcutIds = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (!hashSetB1.contains((String) obj2)) {
                shortcutIds.add(obj2);
            }
        }
        if (!shortcutIds.isEmpty()) {
            Intrinsics.checkNotNullParameter(shortcutIds, "shortcutIds");
            ((ShortcutManager) r110.getValue()).removeDynamicShortcuts(shortcutIds);
        }
        List<ShortcutInfo> shortcuts2 = d0.I0(shortcuts);
        Intrinsics.checkNotNullParameter(shortcuts2, "shortcuts");
        ((ShortcutManager) r110.getValue()).setDynamicShortcuts(shortcuts2);
    }

    public vkm.d O(xi0.b fromCurrency, xi0.b toCurrency, boolean z) {
        Intrinsics.checkNotNullParameter(fromCurrency, "fromCurrency");
        Intrinsics.checkNotNullParameter(toCurrency, "toCurrency");
        prl.e eVar = (prl.e) this.f1531b;
        Pair currencyPair = new Pair(fromCurrency, toCurrency);
        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
        return e.b(nim.a.w(mif.a.d(e.c(e.b(((w4l.f) eVar.d).f(currencyPair, z)), g.f186406a), nim.a.w(((ppk.f) this.f1532c).e(v1.c.w(fromCurrency, toCurrency), n9l.b.SEC_3), new k(25))), new k(26)));
    }

    public n V(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        k3 k3Var = (k3) ((d3) this.f1531b);
        k3Var.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(u0.i(k3Var.d.b(Unit.f186387a, loadingStrategy), ((r10.f) this.f1532c).s0(loadingStrategy), new j0(new a35.d(k3Var.f9561c.C0("freelancer:ResolvedFreelancerTaxTypes", k3.f), 21), 29)), new r1(12));
    }

    public ipe.d W(Throwable throwable) {
        Object next;
        u uVar;
        ipe.e eVar;
        ulm.r1 r1VarM;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ServerError serverErrorA = ((sf0.h) this.f1532c).a(throwable);
        if (serverErrorA == null) {
            return null;
        }
        int i = serverErrorA.f51362a;
        Iterator<E> it8 = ipe.g.c().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (((ipe.g) next).a() == i) {
                break;
            }
        }
        ipe.g gVar = (ipe.g) next;
        if (gVar == null) {
            return null;
        }
        HttpException httpException = throwable instanceof HttpException ? (HttpException) throwable : null;
        String strString = (httpException == null || (r1VarM = l.m(httpException)) == null) ? null : r1VarM.string();
        if (strString != null) {
            try {
                uVar = (u) ((je0.d) this.f1531b).b(strString, gVar.b());
            } catch (Exception e) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                uVar = null;
            }
        } else {
            uVar = null;
        }
        if (uVar == null) {
            return null;
        }
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        if (uVar instanceof p) {
            wi0.a aVar = wi0.b.Companion;
            String country = ((p) uVar).getCountry();
            aVar.getClass();
            return new ipe.b(wi0.a.a(country));
        }
        if (uVar instanceof o) {
            wi0.a aVar2 = wi0.b.Companion;
            String country2 = ((o) uVar).getCountry();
            aVar2.getClass();
            return new ipe.a(wi0.a.a(country2));
        }
        if (uVar instanceof ioe.t) {
            return d.b.f167743a;
        }
        if (!(uVar instanceof s)) {
            if (uVar instanceof r) {
                return d.a.f167742a;
            }
            if (uVar instanceof q) {
                return new ipe.c(joe.q.c(((q) uVar).getPopup()));
            }
            throw new NoWhenBranchMatchedException();
        }
        s sVar = (s) uVar;
        String product = sVar.getProduct();
        ipe.e[] eVarArrValues = ipe.e.values();
        int length = eVarArrValues.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                eVar = null;
                break;
            }
            eVar = eVarArrValues[i2];
            if (a0.z(eVar.name(), product, true)) {
                break;
            }
            i2++;
        }
        if (eVar == null) {
            return null;
        }
        wi0.a aVar3 = wi0.b.Companion;
        String country3 = sVar.getCountry();
        aVar3.getClass();
        return new ipe.f(wi0.a.a(country3), eVar);
    }

    @Override // xki.d
    /* JADX INFO: renamed from: a */
    public Object mo3808a(ViewController viewController) {
        throw null;
    }

    public void a0() {
        Iterator it8 = ((LinkedHashMap) this.f1532c).entrySet().iterator();
        while (it8.hasNext()) {
            hr0.a aVar = (hr0.a) ((Map.Entry) it8.next()).getValue();
            int i = aVar.f154749b - 1;
            aVar.f154749b = i;
            if (i <= 0) {
                it8.remove();
            }
        }
    }

    @Override // fu0.h
    public fu0.g[] b() {
        return (fu0.g[]) this.f1532c;
    }

    public je9.d b0() {
        je9.g gVar = (je9.g) this.f1532c;
        ((w70.a) this.f1531b).getClass();
        return gVar;
    }

    @Override // xki.d
    /* JADX INFO: renamed from: build */
    public xki.e mo3783build() {
        vc.s.h((ViewController) this.f1532c, ViewController.class);
        return new h30.k((h30.n) this.f1531b);
    }

    @Override // bhj.c
    public bhj.a c(bhj.d state, String str, l71.d dVar) {
        Intrinsics.checkNotNullParameter(state, "state");
        TextLocalisedClause textLocalisedClause = null;
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_checkout_success_title, null, null, 14);
        int i = bhj.b.f15304a[state.ordinal()];
        int i2 = 4;
        if (i == 1) {
            return new bhj.a(i2, textLocalisedClause2, new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_checkout_success_esim_pending_subtitle, null, null, 14));
        }
        if (i == 2) {
            UserCompanyRegion userCompanyRegionA = dVar != null ? dVar.a() : null;
            return new bhj.a(i2, textLocalisedClause2, (userCompanyRegionA == null ? -1 : bhj.b.f15305b[userCompanyRegionA.ordinal()]) == 1 ? new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_checkout_success_install_esim_manual_installation_subtitle_mx, null, null, 14) : new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_checkout_success_install_esim_subtitle, null, null, 14));
        }
        if (i == 3) {
            return (!((efj.d) ((cej.b) this.f1531b)).a() || str == null) ? new bhj.a(i2, textLocalisedClause2, new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_checkout_success_plan_added_subtitle, null, null, 14)) : new bhj.a(6, new TextLocalisedClause(com.revolut.retail.feature.esim.impl.R$string.esim_checkout_success_plan_linked_voice_and_data_title, zhm.u.c(z80.b.b((z80.b) this.f1532c, str, null, null, 6)), null, 12), textLocalisedClause);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // knc.a
    public dmc.w d(ViewController viewController, ProjectionScreenContract$Input projectionScreenContract$Input, s1 s1Var, jlc.e eVar) {
        projectionScreenContract$Input.getClass();
        return new dmc.w((dmc.r) this.f1531b, (dmc.e) this.f1532c, viewController, projectionScreenContract$Input, s1Var, eVar);
    }

    @Override // fu0.h
    public View getView() {
        return (View) this.f1531b;
    }

    @Override // com.youTransactor.uCube.ITaskMonitor
    public void handleEvent(TaskEvent taskEvent, Object... objArr) {
        final defpackage.u0 u0Var = (defpackage.u0) this.f1532c;
        BinaryUpdate binaryUpdate = (BinaryUpdate) this.f1531b;
        int i = o0.f221096a[taskEvent.ordinal()];
        if (i == 1) {
            v1.b("upload " + binaryUpdate.getCfg().getLabel() + " Type : " + binaryUpdate.getCfg().getType() + " Failed", new Exception[0]);
            u0Var.d = (ITask) objArr[0];
            u0Var.notifyMonitor(TaskEvent.FAILED, this);
            return;
        }
        if (i != 2) {
            return;
        }
        v1.a("upload " + binaryUpdate.getCfg().getLabel() + " Type : " + binaryUpdate.getCfg().getType() + " Success");
        u0Var.I.remove(binaryUpdate);
        if (binaryUpdate.getCfg().getType() == 0 || binaryUpdate.getCfg().getType() == 7) {
            v1.a("wait for uCube reboot");
            u0Var.b(ServiceState.RECONNECT, new Object[0]);
            u0Var.M = false;
            ConnectionService connectionService = ConnectionService.getInstance();
            final int i2 = LivenessConstants.LIVE_VIDEO_MAX_DURATION_MS;
            connectionService.disconnect(new DisconnectListener() { // from class: t0
                @Override // com.youTransactor.uCube.connexion.DisconnectListener
                public final void onDisconnect(boolean z) {
                    u0 u0Var2 = u0Var;
                    u0Var2.getClass();
                    if (!z) {
                        u0Var2.notifyMonitor(TaskEvent.FAILED, new Object[0]);
                        return;
                    }
                    Calendar calendar = Calendar.getInstance();
                    calendar.add(12, 1);
                    Timer timer = new Timer();
                    u0Var2.L = timer;
                    timer.schedule(new l0(u0Var2, calendar), i2, 5000L);
                }
            });
            return;
        }
        if (binaryUpdate.getCfg().getType() != 12) {
            u0Var.d();
            return;
        }
        v1.a("wait for uCube reboot");
        u0Var.b(ServiceState.RECONNECT, new Object[0]);
        u0Var.M = false;
        final int i3 = 30000;
        ConnectionService.getInstance().disconnect(new DisconnectListener() { // from class: t0
            @Override // com.youTransactor.uCube.connexion.DisconnectListener
            public final void onDisconnect(boolean z) {
                u0 u0Var2 = u0Var;
                u0Var2.getClass();
                if (!z) {
                    u0Var2.notifyMonitor(TaskEvent.FAILED, new Object[0]);
                    return;
                }
                Calendar calendar = Calendar.getInstance();
                calendar.add(12, 1);
                Timer timer = new Timer();
                u0Var2.L = timer;
                timer.schedule(new l0(u0Var2, calendar), i3, 5000L);
            }
        });
    }

    @Override // efm.i0
    public efm.h0 i(efm.d0 upstream) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        ufm.i iVar = new ufm.i(upstream, new c03.u(3, new bzg.t(this, 2)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    @Override // zp0.c
    public void k(String extractedValue, String amount, boolean z) {
        switch (this.f1530a) {
            case 3:
                MoveMoneyAmountScreen moveMoneyAmountScreen = (MoveMoneyAmountScreen) this.f1532c;
                Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                Intrinsics.checkNotNullParameter(amount, "formattedValue");
                int i = b6i.u0.f12830a[((l0) this.f1531b).ordinal()];
                if (i == 1) {
                    com.revolut.feature_move_money.impl.amount.c cVar = (com.revolut.feature_move_money.impl.amount.c) moveMoneyAmountScreen.d();
                    cVar.getClass();
                    Intrinsics.checkNotNullParameter(amount, "amount");
                    if (cVar.Q2().f12784b != b6i.j.TOP) {
                        return;
                    }
                    mdd.b bVar = cVar.C;
                    bVar.getClass();
                    m70.a.c(t0.f186434a);
                    bVar.f204554a = "";
                    final s6i.e eVar = cVar.Q2().f12783a;
                    if (eVar == null) {
                        return;
                    }
                    final long jB = cVar.f97289s.b(amount, eVar.f260362a.f302979a.f115083b.f306286a);
                    final int i2 = 1;
                    cVar.H2(cVar.Y, new Function1() { // from class: b6i.q
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            switch (i2) {
                                case 0:
                                    h update = (h) obj2;
                                    Intrinsics.checkNotNullParameter(update, "$this$update");
                                    s6i.e eVar2 = eVar;
                                    x5i.a aVar = eVar2.f260363b;
                                    return h.a(update, s6i.e.a(eVar2, null, x5i.a.a(aVar, dj0.d.c(aVar.f302979a, jB, null, 2), null, 14), 29), null, null, null, false, false, null, null, 0, 510);
                                default:
                                    h update2 = (h) obj2;
                                    Intrinsics.checkNotNullParameter(update2, "$this$update");
                                    s6i.e eVar3 = eVar;
                                    x5i.a aVar2 = eVar3.f260362a;
                                    return h.a(update2, s6i.e.a(eVar3, x5i.a.a(aVar2, dj0.d.c(aVar2.f302979a, jB, null, 2), null, 14), null, 30), null, null, null, false, false, null, null, 0, 510);
                            }
                        }
                    });
                    return;
                }
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                com.revolut.feature_move_money.impl.amount.c cVar2 = (com.revolut.feature_move_money.impl.amount.c) moveMoneyAmountScreen.d();
                cVar2.getClass();
                Intrinsics.checkNotNullParameter(amount, "amount");
                if (cVar2.Q2().f12784b != b6i.j.BOTTOM) {
                    return;
                }
                mdd.b bVar2 = cVar2.C;
                bVar2.getClass();
                m70.a.c(t0.f186434a);
                bVar2.f204554a = "";
                final s6i.e eVar2 = cVar2.Q2().f12783a;
                if (eVar2 == null) {
                    return;
                }
                final long jB2 = cVar2.f97289s.b(amount, eVar2.f260363b.f302979a.f115083b.f306286a);
                final int i3 = 0;
                cVar2.H2(cVar2.Y, new Function1() { // from class: b6i.q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        switch (i3) {
                            case 0:
                                h update = (h) obj2;
                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                s6i.e eVar22 = eVar2;
                                x5i.a aVar = eVar22.f260363b;
                                return h.a(update, s6i.e.a(eVar22, null, x5i.a.a(aVar, dj0.d.c(aVar.f302979a, jB2, null, 2), null, 14), 29), null, null, null, false, false, null, null, 0, 510);
                            default:
                                h update2 = (h) obj2;
                                Intrinsics.checkNotNullParameter(update2, "$this$update");
                                s6i.e eVar3 = eVar2;
                                x5i.a aVar2 = eVar3.f260362a;
                                return h.a(update2, s6i.e.a(eVar3, x5i.a.a(aVar2, dj0.d.c(aVar2.f302979a, jB2, null, 2), null, 14), null, 30), null, null, null, false, false, null, null, 0, 510);
                        }
                    }
                });
                return;
            case 4:
            case 5:
            default:
                Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                Intrinsics.checkNotNullParameter(amount, "formattedValue");
                cul.a0 a0VarG3 = ((InvestOrderEditScreen) this.f1531b).d();
                cul.s parcel = (cul.s) this.f1532c;
                com.revolut.trading.orders.ui.invest.placement.screens.edit.e eVar3 = (com.revolut.trading.orders.ui.invest.placement.screens.edit.e) a0VarG3;
                eVar3.getClass();
                Intrinsics.checkNotNullParameter(amount, "amount");
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                eVar3.H2(eVar3.m0, new ard.t(eVar3, amount, z, parcel, 2));
                return;
            case 6:
                Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                Intrinsics.checkNotNullParameter(amount, "formattedValue");
                c7i.u uVarE3 = ((MoveMoneyAutomationScreen) this.f1531b).d();
                String listId = ((ic) this.f1532c).f164669a;
                com.revolut.feature_move_money.impl.automation.screen.c cVar3 = (com.revolut.feature_move_money.impl.automation.screen.c) uVarE3;
                y yVar = cVar3.D;
                w80.b bVar3 = cVar3.f97336p;
                Intrinsics.checkNotNullParameter(listId, "listId");
                Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
                if (listId.equals("top_amount")) {
                    cVar3.H2(yVar, new a82.r(bVar3.b(extractedValue, cVar3.K2().f22020a.getCurrency().f306286a), 11));
                    return;
                } else {
                    if (listId.equals("bottom_amount")) {
                        cVar3.H2(yVar, new a82.r(bVar3.b(extractedValue, cVar3.K2().f22020a.getCurrency().f306286a), 12));
                        return;
                    }
                    return;
                }
        }
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerServiceDisconnected() {
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "InstallDataServiceConnectorImpl", "Install referrer connection is disconnected", null, h0Var);
        AtomicReference atomicReference = ((ih7.b) this.f1531b).f;
        InstallReferrerClient installReferrerClient = (InstallReferrerClient) this.f1532c;
        while (!atomicReference.compareAndSet(installReferrerClient, null) && atomicReference.get() == installReferrerClient) {
        }
        installReferrerClient.endConnection();
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public void onInstallReferrerSetupFinished(int i) {
        ih7.b bVar = (ih7.b) this.f1531b;
        e0.C(bVar.f161299c, bVar.d, null, new y0(bVar, i, (InstallReferrerClient) this.f1532c, (Continuation) null, 5), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object q(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof cla.a
            if (r0 == 0) goto L13
            r0 = r5
            cla.a r0 = (cla.a) r0
            int r1 = r0.f24967w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f24967w = r1
            goto L18
        L13:
            cla.a r0 = new cla.a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f24967w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L49
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            java.lang.Object r5 = r4.f1532c
            ang.f r5 = (ang.f) r5
            w4l.j r2 = w4l.j.f294644c
            akg.n r5 = r5.j(r2)
            zfd.e r5 = zi0.c.w(r5)
            r0.f24967w = r3
            java.lang.Object r5 = vkm.q.z(r5, r0)
            if (r5 != r1) goto L49
            return r1
        L49:
            com.revolut.data.model.Data r5 = (com.revolut.data.model.Data) r5
            if (r5 == 0) goto L58
            java.lang.Object r5 = r5.getContent()
            do3.n r5 = (do3.n) r5
            if (r5 == 0) goto L58
            java.lang.String r5 = r5.f116408a
            return r5
        L58:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a61.a.q(gim.c):java.lang.Object");
    }

    public a(defpackage.u0 u0Var, BinaryUpdate binaryUpdate) {
        this.f1530a = 26;
        this.f1531b = binaryUpdate;
        this.f1532c = u0Var;
    }

    public a(View view) {
        this.f1530a = 17;
        Intrinsics.checkNotNullParameter(view, "view");
        this.f1531b = view;
        this.f1532c = new fu0.g[0];
    }

    public a(vrl.g investOrdersInteractor, dtl.o dialogMapper) {
        this.f1530a = 11;
        Intrinsics.checkNotNullParameter(investOrdersInteractor, "investOrdersInteractor");
        Intrinsics.checkNotNullParameter(dialogMapper, "dialogMapper");
        this.f1531b = investOrdersInteractor;
        this.f1532c = dialogMapper;
    }

    public a(rwk.l yAxisMapper, nd.o stepCalculator) {
        this.f1530a = 19;
        Intrinsics.checkNotNullParameter(yAxisMapper, "yAxisMapper");
        Intrinsics.checkNotNullParameter(stepCalculator, "stepCalculator");
        this.f1531b = yAxisMapper;
        this.f1532c = stepCalculator;
    }

    public a(w70.a androidVersion, je9.g shufflingPinCodeSecurityStrategy, je9.a accessibilityDataSensitivePinCodeSecurityStrategy) {
        this.f1530a = 28;
        Intrinsics.checkNotNullParameter(androidVersion, "androidVersion");
        Intrinsics.checkNotNullParameter(shufflingPinCodeSecurityStrategy, "shufflingPinCodeSecurityStrategy");
        Intrinsics.checkNotNullParameter(accessibilityDataSensitivePinCodeSecurityStrategy, "accessibilityDataSensitivePinCodeSecurityStrategy");
        this.f1531b = androidVersion;
        this.f1532c = shufflingPinCodeSecurityStrategy;
    }

    public a(Activity activity, j progressView) {
        this.f1530a = 9;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(progressView, "progressView");
        this.f1531b = activity;
        this.f1532c = progressView;
    }

    public a(xg0.a dynamicDelivery, Context context) {
        this.f1530a = 23;
        Intrinsics.checkNotNullParameter("ui_kit_card_3d_scene_retail", "moduleName");
        Intrinsics.checkNotNullParameter(dynamicDelivery, "dynamicDelivery");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f1531b = dynamicDelivery;
        this.f1532c = context;
    }

    public a(Context applicationContext, l80.h systemTimeProvider) {
        this.f1530a = 12;
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(systemTimeProvider, "systemTimeProvider");
        this.f1531b = applicationContext;
        this.f1532c = systemTimeProvider;
    }

    public a(ang.f userInteractor, gte.a featureToggleInteractor) {
        this.f1530a = 7;
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f1531b = featureToggleInteractor;
        this.f1532c = userInteractor;
    }

    public a(cej.b mobilePlansFeatureAvailabilityInteractor, z80.b phoneToolsProvider) {
        this.f1530a = 4;
        Intrinsics.checkNotNullParameter(mobilePlansFeatureAvailabilityInteractor, "mobilePlansFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.f1531b = mobilePlansFeatureAvailabilityInteractor;
        this.f1532c = phoneToolsProvider;
    }

    public a(q71.a newsRepository, q71.a incidentNewsRepository) {
        this.f1530a = 0;
        Intrinsics.checkNotNullParameter(newsRepository, "newsRepository");
        Intrinsics.checkNotNullParameter(incidentNewsRepository, "incidentNewsRepository");
        this.f1531b = newsRepository;
        ihm.b bVarE = ihm.b.e(Unit.f186387a);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f1532c = bVarE;
    }

    public a(b0a.k peerToPeerChatInteractor, cw9.d paymentsProductFeatureChecker) {
        this.f1530a = 2;
        Intrinsics.checkNotNullParameter(peerToPeerChatInteractor, "peerToPeerChatInteractor");
        Intrinsics.checkNotNullParameter(paymentsProductFeatureChecker, "paymentsProductFeatureChecker");
        this.f1531b = peerToPeerChatInteractor;
        this.f1532c = paymentsProductFeatureChecker;
    }

    public a(f1g.d productArticleFactory, qka.c productArticleNavigationProvider) {
        this.f1530a = 15;
        Intrinsics.checkNotNullParameter(productArticleFactory, "productArticleFactory");
        Intrinsics.checkNotNullParameter(productArticleNavigationProvider, "productArticleNavigationProvider");
        this.f1531b = productArticleFactory;
        this.f1532c = productArticleNavigationProvider;
    }

    public a(g2e.t appShortcutsManager, ej2.b topupShortcutIntentProvider, ej2.a exchangeShortcutIntentProvider, a3a.a paymentsRouter, r10.t mapper) {
        this.f1530a = 13;
        Intrinsics.checkNotNullParameter(appShortcutsManager, "appShortcutsManager");
        Intrinsics.checkNotNullParameter(topupShortcutIntentProvider, "topupShortcutIntentProvider");
        Intrinsics.checkNotNullParameter(exchangeShortcutIntentProvider, "exchangeShortcutIntentProvider");
        Intrinsics.checkNotNullParameter(paymentsRouter, "paymentsRouter");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f1531b = appShortcutsManager;
        this.f1532c = mapper;
    }

    public a(su9.c metaCollectionInteractor, jx0.a screenerInstrumentsWithPerformanceProvider) {
        this.f1530a = 29;
        Intrinsics.checkNotNullParameter(metaCollectionInteractor, "metaCollectionInteractor");
        Intrinsics.checkNotNullParameter(screenerInstrumentsWithPerformanceProvider, "screenerInstrumentsWithPerformanceProvider");
        this.f1531b = metaCollectionInteractor;
        this.f1532c = screenerInstrumentsWithPerformanceProvider;
    }

    public a(m coursesRepository, ne0.j memoryCache) {
        this.f1530a = 5;
        Intrinsics.checkNotNullParameter(coursesRepository, "coursesRepository");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        this.f1531b = coursesRepository;
        this.f1532c = memoryCache;
    }

    public a(pfk.e0 repository, t pricingPlanInteractor) {
        this.f1530a = 16;
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        this.f1531b = repository;
        this.f1532c = pricingPlanInteractor;
    }

    public a(prl.e repository, ppk.f ratesInteractor) {
        this.f1530a = 21;
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        this.f1531b = repository;
        this.f1532c = ratesInteractor;
    }

    public a(je0.d objectMapper, sf0.h serverErrorParser) {
        this.f1530a = 25;
        Intrinsics.checkNotNullParameter(objectMapper, "objectMapper");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.f1531b = objectMapper;
        this.f1532c = serverErrorParser;
    }

    public a() {
        this.f1530a = 27;
        this.f1531b = new ConcurrentHashMap();
        this.f1532c = new ReferenceQueue();
    }

    public a(d3 taxConfigRepository, r10.f taxProfileInteractor) {
        this.f1530a = 14;
        Intrinsics.checkNotNullParameter(taxConfigRepository, "taxConfigRepository");
        Intrinsics.checkNotNullParameter(taxProfileInteractor, "taxProfileInteractor");
        this.f1531b = taxConfigRepository;
        this.f1532c = taxProfileInteractor;
    }

    public a(gte.a featureToggleInteractor, wsg.n legacyWalletInteractor) {
        this.f1530a = 18;
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(legacyWalletInteractor, "legacyWalletInteractor");
        this.f1531b = featureToggleInteractor;
        this.f1532c = legacyWalletInteractor;
    }

    public a(mc valueFactory) {
        this.f1530a = 22;
        Intrinsics.checkNotNullParameter(valueFactory, "valueFactory");
        this.f1531b = valueFactory;
        this.f1532c = new LinkedHashMap();
    }

    public a(ConnectivityManager connectivityManager, p1 okhttpFactory) {
        this.f1530a = 1;
        Intrinsics.checkNotNullParameter(connectivityManager, "connectivityManager");
        Intrinsics.checkNotNullParameter(okhttpFactory, "okhttpFactory");
        this.f1531b = connectivityManager;
        this.f1532c = okhttpFactory;
    }

    public a(h30.n nVar, h30.o oVar) {
        this.f1530a = 20;
        this.f1531b = nVar;
    }
}
