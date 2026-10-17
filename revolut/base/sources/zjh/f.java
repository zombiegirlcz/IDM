package zjh;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import au6.w2;
import aw0.o9;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.crypto_feed.impl.R$string;
import com.revolut.feature.retail.salary_account.impl.work_email.data.WorkEmailService;
import com.revolut.feature.shared.autoinvest.impl.network.PortfolioAutoInvestService;
import com.revolut.feature.tab.crypto.impl.ui.v2.accounts.crypto.CryptoAccountsState;
import com.revolut.feature.trading_add_ons.impl.ui.add_ons.main_screen.TradingAddOnsMainScreenRevamp;
import com.revolut.feature.wealth.ui.impl.cash_balance.CashBalanceController;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.cfd_details.CfdDetailsController;
import com.revolut.shared.feature.wealth.models.account.WealthAccountType;
import dfl.i0;
import dfl.j0;
import dfl.n0;
import dfl.o0;
import dfl.p0;
import dfl.q0;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KProperty;
import kotlin.text.d0;
import kotlinx.coroutines.flow.Flow;
import org.json.JSONArray;
import org.json.JSONException;
import skm.e0;
import vkm.j2;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements kfm.o, zk0.c, zje.b, n2h.g, v1d.d, o2h.a, dcf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f322834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f322835b;

    public f(a08.p function) {
        this.f322834a = 1;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f322835b = function;
    }

    public static ArrayList H(List list, Map map) {
        String strH;
        Iterator it8;
        List list2 = list;
        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
        Iterator it9 = list2.iterator();
        while (it9.hasNext()) {
            i0 bVar = (i0) it9.next();
            dfl.b bVar2 = bVar instanceof dfl.b ? (dfl.b) bVar : null;
            if (bVar2 == null) {
                it8 = it9;
            } else {
                o0 o0Var = bVar2.f114189q;
                if (o0Var != null && (strH = h(bVar2)) != null) {
                    String str = (String) map.get(strH);
                    if (str != null || (str = o0Var.f) != null || (str = o0Var.f114447b) != null) {
                        n0 n0Var = new n0(str);
                        String id10 = bVar2.f114179a;
                        String str2 = bVar2.f114180b;
                        String ref2 = bVar2.f114181c;
                        String holdingId = bVar2.d;
                        q0 state = bVar2.e;
                        long j2 = bVar2.f;
                        Long l2 = bVar2.f114182g;
                        Long l3 = bVar2.f114183h;
                        dfl.q value = bVar2.i;
                        Instant instant = bVar2.f114184j;
                        it8 = it9;
                        String str3 = bVar2.k;
                        WealthAccountType accountType = bVar2.f114185l;
                        String str4 = bVar2.f114186m;
                        p0 p0Var = bVar2.f114187n;
                        p0 p0Var2 = bVar2.o;
                        j0 j0Var = bVar2.f114188p;
                        o0 o0Var2 = bVar2.f114189q;
                        cfl.j accountHolderType = bVar2.f114190r;
                        bfl.g side = bVar2.f114191s;
                        String str5 = bVar2.f114192t;
                        boolean z = bVar2.u;
                        String str6 = bVar2.v;
                        dfl.f fVar = bVar2.f114193w;
                        Boolean bool = bVar2.f114194x;
                        Boolean bool2 = bVar2.f114195y;
                        Boolean bool3 = bVar2.z;
                        String str7 = bVar2.A;
                        bel.a aVar = bVar2.B;
                        bel.a aVar2 = bVar2.C;
                        Intrinsics.checkNotNullParameter(id10, "id");
                        Intrinsics.checkNotNullParameter(ref2, "ref");
                        Intrinsics.checkNotNullParameter(holdingId, "holdingId");
                        Intrinsics.checkNotNullParameter(state, "state");
                        Intrinsics.checkNotNullParameter(value, "value");
                        Intrinsics.checkNotNullParameter(accountType, "accountType");
                        Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
                        Intrinsics.checkNotNullParameter(side, "side");
                        bVar = new dfl.b(id10, str2, ref2, holdingId, state, j2, l2, l3, value, instant, str3, accountType, str4, p0Var, p0Var2, j0Var, o0Var2, accountHolderType, side, str5, z, str6, fVar, bool, bool2, bool3, str7, aVar, aVar2, n0Var);
                    }
                }
                it8 = it9;
                bVar = bVar2;
            }
            arrayList.add(bVar);
            it9 = it8;
        }
        return arrayList;
    }

    public static String I(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public static String h(dfl.b bVar) {
        String str;
        bel.a aVar;
        o0 o0Var = bVar.f114189q;
        if (o0Var != null && (str = o0Var.e) != null) {
            if (d0.W(str)) {
                str = null;
            }
            if (str != null && bVar.f114190r == cfl.j.PERSONAL_JOINT && ((aVar = bVar.C) != null || (aVar = bVar.B) != null)) {
                bel.b bVar2 = aVar.f14871a;
                bVar2.getClass();
                if (bVar2 != bel.b.JOINT && bVar2 != bel.b.JOINT_SAVINGS && bVar2 != bel.b.JOINT_VAULT) {
                    return str;
                }
            }
        }
        return null;
    }

    public static boolean v(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static akg.n y(f fVar, String portfolioId) {
        fVar.getClass();
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return nim.a.v(rd0.e.b(fVar.B(portfolioId, loadingStrategy)), new elb.a(5));
    }

    public ae8.c A(String featureCode) {
        Intrinsics.checkNotNullParameter(featureCode, "featureCode");
        return new ae8.c(bla.b.b((jla.h) this.f322835b, featureCode), 1);
    }

    public efm.r B(String portfolioId, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        k18.c cVar = (k18.c) this.f322835b;
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return rd0.e.c(((x4l.c) cVar.f180140b).b(portfolioId, loadingStrategy), kotlin.coroutines.g.f186406a);
    }

    public efm.r C(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        k18.c cVar = (k18.c) this.f322835b;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return ((w4l.f) cVar.f180141c).e(Unit.f186387a, loadingStrategy);
    }

    @Override // n2h.g
    public efm.r C0() {
        CfdDetailsController cfdDetailsController = (CfdDetailsController) this.f322835b;
        KProperty[] kPropertyArr = CfdDetailsController.f103904s0;
        return cfdDetailsController.d3().d.d();
    }

    public Bundle D() {
        Bundle bundle = (Bundle) this.f322835b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public Object E(String str, gim.c cVar) throws Throwable {
        k18.c cVar2 = (k18.c) this.f322835b;
        skm.p0 p0Var = skm.p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, new mlc.c(cVar2, str, null, 1), cVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable F(java.util.List r8, gim.c r9) {
        /*
            Method dump skipped, instruction units count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zjh.f.F(java.util.List, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object G(dfl.i0 r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof d4f.g
            if (r0 == 0) goto L13
            r0 = r6
            d4f.g r0 = (d4f.g) r0
            int r1 = r0.f111286w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f111286w = r1
            goto L18
        L13:
            d4f.g r0 = new d4f.g
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f111286w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.util.List r5 = zhm.u.c(r5)
            r0.f111286w = r3
            java.io.Serializable r6 = r4.F(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            java.util.List r6 = (java.util.List) r6
            java.lang.Object r5 = zhm.d0.K0(r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zjh.f.G(dfl.i0, gim.c):java.lang.Object");
    }

    @Override // n2h.g
    public efm.r G0() {
        CfdDetailsController cfdDetailsController = (CfdDetailsController) this.f322835b;
        KProperty[] kPropertyArr = CfdDetailsController.f103904s0;
        return cfdDetailsController.d3().d.c();
    }

    @Override // v1d.d
    public Clause a() {
        return ((v1d.j) ((jpc.e) this.f322835b).d).a();
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public /* synthetic */ Object apply(Object obj2) {
        switch (this.f322834a) {
            case 1:
                return ((a08.p) this.f322835b).invoke(obj2);
            case 8:
                return ((b9i.h) this.f322835b).invoke(obj2);
            default:
                return ((ew2.q) this.f322835b).invoke(obj2);
        }
    }

    @Override // o2h.a
    public void b(bfl.g tradeSide, hdh.e actions) {
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(actions, "actions");
        ((gdh.a) this.f322835b).b3(tradeSide, actions, false);
    }

    @Override // zje.b
    public void c(Function1 transform) {
        Intrinsics.checkNotNullParameter(transform, "transform");
        ake.f fVar = (ake.f) this.f322835b;
        fVar.X2(fVar.f5811m, new a31.k(5, transform));
    }

    @Override // v1d.d
    public TextLocalisedClause d() {
        return new TextLocalisedClause(R$string.crypto_feed_widget_catalog_symbol_title, null, null, 14);
    }

    @Override // dcf.b
    public void e(Flow flow, Function1 consumer) {
        Intrinsics.checkNotNullParameter(flow, "flow");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        com.revolut.kompot.navigable.a.g2((TradingAddOnsMainScreenRevamp) this.f322835b, flow, null, new a97.i(2, consumer, kotlin.jvm.internal.s.class, "suspendConversion0", "bind$suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 12), 3);
    }

    public Object f(String str, gim.i iVar) throws Throwable {
        k18.c cVar = (k18.c) this.f322835b;
        skm.p0 p0Var = skm.p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, new mlc.c(cVar, str, null, 0), iVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }

    @Override // zk0.c
    public void g(FileOutputStream outputStream) throws IOException {
        switch (this.f322834a) {
            case 2:
                Intrinsics.checkNotNullParameter(outputStream, "outputStream");
                zi0.c.m((InputStream) this.f322835b, outputStream, 4096);
                break;
            default:
                Intrinsics.checkNotNullParameter(outputStream, "outputStream");
                outputStream.write((byte[]) this.f322835b);
                break;
        }
    }

    @Override // zje.b
    public Object i() {
        return ((CryptoAccountsState) ((j2) ((ake.f) this.f322835b).f5811m.f22677a).getValue()).f89817a;
    }

    public boolean j(d7.b0 b0Var, boolean z) {
        HashSet hashSet = (HashSet) this.f322835b;
        if (!z) {
            return hashSet.remove(b0Var);
        }
        if (Build.VERSION.SDK_INT >= b0Var.minRequiredSdkVersion) {
            return hashSet.add(b0Var);
        }
        r7.c.b(String.format("%s is not supported pre SDK %d", b0Var.name(), Integer.valueOf(b0Var.minRequiredSdkVersion)));
        return false;
    }

    public boolean k(String str) {
        String strS = s(str);
        return "1".equals(strS) || Boolean.parseBoolean(strS);
    }

    public Integer l(String str) {
        String strS = s(str);
        if (TextUtils.isEmpty(strS)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strS));
        } catch (NumberFormatException unused) {
            String str2 = "Couldn't parse value of " + I(str) + "(" + strS + ") into an int";
            return null;
        }
    }

    public JSONArray m(String str) {
        String strS = s(str);
        if (TextUtils.isEmpty(strS)) {
            return null;
        }
        try {
            return new JSONArray(strS);
        } catch (JSONException unused) {
            String str2 = "Malformed JSON for key " + I(str) + ": " + strS + ", falling back to default";
            return null;
        }
    }

    public int[] n() {
        JSONArray jSONArrayM = m("gcm.n.light_settings");
        if (jSONArrayM == null) {
            return null;
        }
        int[] iArr = new int[3];
        try {
            if (jSONArrayM.length() != 3) {
                throw new JSONException("lightSettings don't have all three fields");
            }
            int color = Color.parseColor(jSONArrayM.optString(0));
            if (color == -16777216) {
                throw new IllegalArgumentException("Transparent color is invalid");
            }
            iArr[0] = color;
            iArr[1] = jSONArrayM.optInt(1);
            iArr[2] = jSONArrayM.optInt(2);
            return iArr;
        } catch (IllegalArgumentException e) {
            String str = "LightSettings is invalid: " + jSONArrayM + ". " + e.getMessage() + ". Skipping setting LightSettings";
            return null;
        } catch (JSONException unused) {
            String str2 = "LightSettings is invalid: " + jSONArrayM + ". Skipping setting LightSettings";
            return null;
        }
    }

    public Object[] o(String str) {
        JSONArray jSONArrayM = m(str.concat("_loc_args"));
        if (jSONArrayM == null) {
            return null;
        }
        int length = jSONArrayM.length();
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = jSONArrayM.optString(i);
        }
        return strArr;
    }

    public String p(String str) {
        return s(str.concat("_loc_key"));
    }

    public Long q() {
        String strS = s("gcm.n.event_time");
        if (TextUtils.isEmpty(strS)) {
            return null;
        }
        try {
            return Long.valueOf(Long.parseLong(strS));
        } catch (NumberFormatException unused) {
            String str = "Couldn't parse value of " + I("gcm.n.event_time") + "(" + strS + ") into a long";
            return null;
        }
    }

    public String r(Resources resources, String str, String str2) {
        String strS = s(str2);
        if (!TextUtils.isEmpty(strS)) {
            return strS;
        }
        String strP = p(str2);
        if (TextUtils.isEmpty(strP)) {
            return null;
        }
        int identifier = resources.getIdentifier(strP, "string", str);
        if (identifier == 0) {
            String str3 = I(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.";
            return null;
        }
        Object[] objArrO = o(str2);
        if (objArrO == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, objArrO);
        } catch (MissingFormatArgumentException e) {
            String str4 = "Missing format argument for " + I(str2) + ": " + Arrays.toString(objArrO) + " Default value will be used.";
            return null;
        }
    }

    public String s(String str) {
        Bundle bundle = (Bundle) this.f322835b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    @Override // zje.b
    public Flow stream() {
        return ((ake.f) this.f322835b).f5811m.B(new aik.d(12));
    }

    public long[] t() {
        JSONArray jSONArrayM = m("gcm.n.vibrate_timings");
        if (jSONArrayM == null) {
            return null;
        }
        try {
            if (jSONArrayM.length() <= 1) {
                throw new JSONException("vibrateTimings have invalid length");
            }
            int length = jSONArrayM.length();
            long[] jArr = new long[length];
            for (int i = 0; i < length; i++) {
                jArr[i] = jSONArrayM.optLong(i);
            }
            return jArr;
        } catch (NumberFormatException | JSONException unused) {
            String str = "User defined vibrateTimings is invalid: " + jSONArrayM + ". Skipping setting vibrateTimings.";
            return null;
        }
    }

    public boolean u(d7.b0 b0Var) {
        return ((HashSet) this.f322835b).contains(b0Var);
    }

    public TextClause w(PeerToPeerRecipient recipient) {
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        String strC = t8k.a.c(recipient);
        if (strC == null || strC.length() <= 0) {
            Intrinsics.checkNotNullParameter(recipient, "<this>");
            String strD = hx7.q.D(recipient.f102270a);
            if (strD == null) {
                m70.a.c(t0.f186434a);
                strD = "";
            }
            return new TextClause(strD, (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        if (!Intrinsics.f(t8k.a.d(recipient), Boolean.TRUE)) {
            return new TextClause("@".concat(strC), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        }
        m70.a.a(t0.f186434a);
        return new TextClause("@" + strC + " · " + ((Object) ((f01.c) this.f322835b).b(new TextLocalisedClause(com.revolut.retail.feature.payments.core.R$string.revolut_user_kind_business, null, null, 14))), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
    }

    public vkm.d x(ds6.j taxType, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(taxType, "taxType");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        w2 w2Var = (w2) this.f322835b;
        w2Var.getClass();
        Intrinsics.checkNotNullParameter(taxType, "taxType");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return w2Var.d.b(taxType, loadingStrategy);
    }

    public vkm.d z(Set refs, w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        vdl.d0 d0Var = (vdl.d0) this.f322835b;
        d0Var.getClass();
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return d0Var.e.b(refs, loadingStrategy);
    }

    public f(b9i.h function) {
        this.f322834a = 8;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f322835b = function;
    }

    public f(ew2.q function) {
        this.f322834a = 28;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f322835b = function;
    }

    public /* synthetic */ f(Object obj2, int i) {
        this.f322834a = i;
        this.f322835b = obj2;
    }

    public f(PortfolioAutoInvestService service) {
        this.f322834a = 23;
        Intrinsics.checkNotNullParameter(service, "service");
        this.f322835b = service;
    }

    public f(ekg.g uiPersonalisationInteractor) {
        this.f322834a = 9;
        Intrinsics.checkNotNullParameter(uiPersonalisationInteractor, "uiPersonalisationInteractor");
        this.f322835b = uiPersonalisationInteractor;
    }

    public f(gdh.a navigationExtension) {
        this.f322834a = 12;
        Intrinsics.checkNotNullParameter(navigationExtension, "navigationExtension");
        this.f322835b = navigationExtension;
    }

    public f(jla.h productCatalogueInteractor) {
        this.f322834a = 15;
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f322835b = productCatalogueInteractor;
    }

    public f(jub.b revPointsNavBarMenuItemProvider) {
        this.f322834a = 7;
        Intrinsics.checkNotNullParameter(revPointsNavBarMenuItemProvider, "revPointsNavBarMenuItemProvider");
        this.f322835b = revPointsNavBarMenuItemProvider;
    }

    public f(voi.i context) {
        this.f322834a = 5;
        Intrinsics.checkNotNullParameter(context, "context");
        qf.a aVar = lf.b.f194619b;
        lf.b bVar = (lf.b) pd.g.c().b(lf.b.class);
        Intrinsics.checkNotNullExpressionValue(bVar, "getInstance(...)");
        this.f322835b = bVar;
        Intrinsics.checkNotNullExpressionValue(FirebaseAnalytics.getInstance(context.getApplicationContext()), "getInstance(...)");
    }

    public f() {
        this.f322834a = 17;
        this.f322835b = new HashSet();
    }

    public f(WorkEmailService service) {
        this.f322834a = 20;
        Intrinsics.checkNotNullParameter(service, "service");
        this.f322835b = service;
    }

    public f(jpc.e widgetDataProvider) {
        this.f322834a = 10;
        Intrinsics.checkNotNullParameter(widgetDataProvider, "widgetDataProvider");
        this.f322835b = widgetDataProvider;
    }

    public f(ue0.c storage) {
        this.f322834a = 14;
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f322835b = storage;
    }

    public f(xe0.e storage) {
        this.f322834a = 27;
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f322835b = storage;
    }

    public f(q2a.f wallpaperInteractor) {
        this.f322834a = 25;
        Intrinsics.checkNotNullParameter(wallpaperInteractor, "wallpaperInteractor");
        this.f322835b = wallpaperInteractor;
    }

    public f(vdl.d0 repository) {
        this.f322834a = 3;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f322835b = repository;
    }

    public f(w2 taxAuthorityRepository) {
        this.f322834a = 26;
        Intrinsics.checkNotNullParameter(taxAuthorityRepository, "taxAuthorityRepository");
        this.f322835b = taxAuthorityRepository;
    }

    public f(om4.d0 transfersPersonalisationInteractor) {
        this.f322834a = 11;
        Intrinsics.checkNotNullParameter(transfersPersonalisationInteractor, "transfersPersonalisationInteractor");
        this.f322835b = transfersPersonalisationInteractor;
    }

    public f(sri.m navigator) {
        this.f322834a = 29;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f322835b = navigator;
    }

    public f(cl3.a contactsInteractor) {
        this.f322834a = 16;
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        this.f322835b = contactsInteractor;
    }

    public f(f61.a ratesPlotInteractor) {
        this.f322834a = 21;
        Intrinsics.checkNotNullParameter(ratesPlotInteractor, "ratesPlotInteractor");
        this.f322835b = ratesPlotInteractor;
    }

    public f(f01.c uiKitResources) {
        this.f322834a = 18;
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f322835b = uiKitResources;
    }

    public f(k18.c roboAccountRepository) {
        this.f322834a = 24;
        Intrinsics.checkNotNullParameter(roboAccountRepository, "roboAccountRepository");
        this.f322835b = roboAccountRepository;
    }

    public f(Bundle bundle) {
        this.f322834a = 13;
        if (bundle != null) {
            this.f322835b = new Bundle(bundle);
            return;
        }
        throw new NullPointerException("data");
    }

    public f(CashBalanceController cashBalanceController) {
        this.f322834a = 0;
        this.f322835b = cashBalanceController.Q;
    }
}
