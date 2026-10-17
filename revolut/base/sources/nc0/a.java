package nc0;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import androidx.work.ExistingWorkPolicy;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.impl.WorkerWrapper;
import com.revolut.core.ui_kit.views.input.InputText;
import com.revolut.data.model.Data;
import com.revolut.domain.exceptions.NotFoundException;
import com.revolut.domain.models.moneyrequest.MoneyRequest;
import com.revolut.feature.backend_flow.domain.models.SelectionStyle;
import com.revolut.feature.learn.shared.api.navigation.LearnKompotFeatureConfig;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.feature.masav.api.MasavApi$Toggles$MasavDirectDebits;
import com.revolut.feature.payments.profile.api.navigation.PaymentProfileFeatureConfig;
import com.revolut.feature.pricingplans.models.PricingPlanSubscription;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.utils.job.workers.WalletsReloadWorker;
import efm.r;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import le.u1;
import mjf.b0;
import o55.f0;
import od0.h;
import od0.i;
import ozc.m;
import ozc.n;
import ozc.t;
import pfk.p0;
import pfk.w0;
import pl.j;
import pyc.c0;
import q97.o0;
import qc0.j0;
import qua.p;
import qza.l;
import te0.w;
import y45.g;
import zhm.a1;
import zhm.h0;
import zhm.u;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f214101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f214102b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f214101a = i;
        this.f214102b = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        t97.d dVar;
        String strR;
        int i = this.f214101a;
        int i2 = 2;
        int i3 = 0;
        Object obj2 = this.f214102b;
        switch (i) {
            case 0:
                e eVar = (e) obj2;
                Set set = eVar.f214111a.f;
                if (set == null) {
                    return null;
                }
                if (set.isEmpty()) {
                    set = null;
                }
                if (set == null) {
                    return null;
                }
                String str = eVar.f214111a.d;
                if (str == null || d0.W(str)) {
                    return set;
                }
                return null;
            case 1:
                return ((f) obj2).f214115b.a(new Data(null, null, true, 3, null), h0.f322473a, new SelectionStyle.MultiSelection((Object) null));
            case 2:
                ((nw9.d) obj2).f219805a.c(new FeatureCommand(new PaymentProfileFeatureConfig(ew9.a.QR_SCANNER)));
                return Boolean.TRUE;
            case 3:
                ((o4f.a) obj2).f222269a.c(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160141b.f83420a, null), null, null, 6))));
                return Boolean.TRUE;
            case 4:
                h hVar = i.Companion;
                Object objT2 = ((o53.b) obj2).f222307a.T2("CARD_PERSONALISATION_KEY", String.class);
                hVar.getClass();
                return h.a(objT2);
            case 5:
                com.google.android.gms.internal.mlkit_vision_face.a.C(null, null, null, 7, ((o7c.c) obj2).f222751a);
                return Boolean.FALSE;
            case 6:
                return (p) obj2;
            case 7:
                return (MoneyRequest) obj2;
            case 8:
                t tVar = (t) obj2;
                sfm.b bVar = new sfm.b(tVar.D3(), new ozc.p(i3, new n(9)), i2);
                Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
                return pd.b.s(pd.b.r(bVar, new m(tVar, 21)), new m(tVar, 20));
            case 9:
                w0 w0Var = (w0) ((p0) obj2).d.get("CACHE_KEY_SUBSCRIPTION_WITH_PLANS");
                PricingPlanSubscription pricingPlanSubscriptionA = w0Var != null ? w0Var.a() : null;
                if (pricingPlanSubscriptionA != null) {
                    return pricingPlanSubscriptionA;
                }
                throw new NotFoundException("Pricing plan subscription not found");
            case 10:
                j this$0 = (j) obj2;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                hx7.e.f(this$0.f237232a);
                return pl.d.f237225a;
            case 11:
                pof.j jVar = (pof.j) obj2;
                String str2 = (String) w.O(((pof.c) jVar.f237987b).w0());
                if (str2 == null) {
                    return pfm.m.f235744a;
                }
                com.revolut.domain.interactors.transactions.a aVar = jVar.f237988c;
                pof.c cVar = (pof.c) jVar.f237987b;
                return ((b0) aVar).r(((k71.i) cVar.f237974b.getValue(cVar, pof.c.f237973m[0]).get()).a(), str2);
            case 12:
                return (Boolean) ((prl.b) obj2).f239322a.v0(Boolean.FALSE, "KEY_EXTENDED_HOURS_INCLUDED_BY_DEFAULT", Boolean.TYPE);
            case 13:
                return ((pv9.d) obj2).h();
            case 14:
                return ((qri.b) ((c0) obj2).f240760n).m();
            case 15:
                yoj.a aVar2 = (yoj.a) obj2;
                Intrinsics.h(aVar2);
                if (yoj.b.k(aVar2)) {
                    return new q06.h(new LearnKompotFeatureConfig.Home.Destination(null), new q06.b(ibb.c.f160140a, null));
                }
                return null;
            case 16:
                l35.b bVar2 = ((pz4.c) obj2).d;
                efm.b bVarG = ((f0) ((y45.f) bVar2).d.f310799a).f222337g.g("", false);
                w4l.h loadingStrategy = w4l.h.f294642c;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                g gVar = ((y45.f) bVar2).d;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                f0 f0Var = (f0) gVar.f310799a;
                Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
                r map = f0Var.i.l(o55.i.f222346a).map(new o4a.e(25, new o5.b(24)));
                Intrinsics.checkNotNullExpressionValue(map, "map(...)");
                return bVarG.g(nim.a.w(nim.a.w(u1.d(map, f0Var.f222337g.e("", loadingStrategy)), new o5.b(23)), new y25.d(14)));
            case 17:
                return (List) ((q59.c) obj2).f242332a.v0(zhm.f0.f322471a, "DEPRECATED_APPS", List.class);
            case 18:
                o0 o0Var = (o0) obj2;
                if (o0Var.f243754a.a()) {
                    dVar = t97.d.GIRO_DIRECT_DEBITS;
                } else {
                    dVar = ((jte.d) o0Var.f243755b.f268048a).c(MasavApi$Toggles$MasavDirectDebits.f78088c) ? t97.d.MASAV_DIRECT_DEBITS : t97.d.DIRECT_DEBITS;
                }
                return u.c(t97.c.a(dVar));
            case 19:
                Stack stack = (Stack) obj2;
                Intrinsics.h(stack);
                return j0.k3(stack);
            case 20:
                fc.g gVar2 = (fc.g) ((jx0.a) obj2).f179039c;
                qe.a aVar3 = (qe.a) gVar2.f;
                qe.e eVar2 = (qe.e) gVar2.f133580b;
                String str3 = aVar3.f245003a;
                je.d.b();
                try {
                    HashMap mapB = qe.a.b(eVar2);
                    jt0.b bVar3 = new jt0.b(str3, mapB);
                    bVar3.u0("User-Agent", "Crashlytics Android SDK/19.4.4");
                    bVar3.u0("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                    qe.a.a(bVar3, eVar2);
                    String str4 = "Requesting settings from " + str3;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    }
                    String str5 = "Settings query params were: " + mapB;
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                    }
                    return aVar3.c(bVar3.j0());
                } catch (IOException e) {
                    return null;
                }
            case 21:
                nzl.a aVar4 = (nzl.a) ((qq8.b) obj2).d;
                aVar4.getClass();
                aVar4.f221092a.enqueueUniqueWork("wallets-reload-background-work", ExistingWorkPolicy.REPLACE, new OneTimeWorkRequest.Builder((Class<? extends ListenableWorker>) WalletsReloadWorker.class).setConstraints(aVar4.b()).setInitialDelay(1L, TimeUnit.SECONDS).build());
                return Unit.f186387a;
            case 22:
                ((qza.b0) ((l) obj2).f250466a).x0().set(qza.h.LOADING);
                return Boolean.TRUE;
            case 23:
                ArrayList arrayListA = ((r21.h) obj2).f251038b.a();
                return arrayListA == null ? zhm.f0.f322471a : arrayListA;
            case 24:
                return WorkerWrapper.runWorker$lambda$1((WorkerWrapper) obj2);
            case 25:
                rf3.l lVar = (rf3.l) obj2;
                ing.b bVar4 = lVar.e;
                z80.b bVar5 = lVar.f;
                String strA = bVar4.a();
                if (strA != null) {
                    Context context = bVar4.f162934a;
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                    Intrinsics.checkNotNullExpressionValue(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
                    String string = defaultSharedPreferences.getString("USER_PHONE_PREFIX", null);
                    if (string == null || string.length() == 0) {
                        String country = jh.d.d(context).getCountry();
                        Object value = bVar4.f162936c.getValue();
                        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                        int iF = ((yem.h) value).f(country);
                        string = iF <= 0 ? "+44" : a0.d.n("+", iF);
                    }
                    strR = a0.d.r(string, strA);
                } else {
                    strR = null;
                }
                if (bVar5.k(strA, null)) {
                    return strA;
                }
                if (bVar5.k(strR, null)) {
                    return strR;
                }
                return null;
            case 26:
                return ((do3.n) obj2).f116411g;
            case 27:
                ((rp0.m) obj2).b(false);
                return Unit.f186387a;
            case 28:
                InputText.Companion companion = InputText.INSTANCE;
                return Boolean.valueOf(((InputText) obj2).hasFocus());
            default:
                rzc.c cVar2 = (rzc.c) obj2;
                Set setA = cVar2.f258588a.a();
                td0.b bVar6 = cVar2.f258588a;
                Set setK = a1.k(a1.k(setA, bVar6.b()), bVar6.d());
                xi0.a aVar5 = xi0.b.Companion;
                ArrayList arrayList = new ArrayList(zhm.w.t(setK, 10));
                Iterator it8 = setK.iterator();
                while (it8.hasNext()) {
                    t61.a.A(aVar5, (String) it8.next(), arrayList);
                }
                return arrayList;
        }
    }

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f214101a = i;
        this.f214102b = obj3;
    }
}
