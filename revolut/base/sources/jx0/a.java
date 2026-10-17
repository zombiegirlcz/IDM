package jx0;

import akg.n;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.ResultReceiver;
import android.util.Log;
import android.view.View;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.onfido.android.sdk.capture.internal.config.OnfidoRemoteConfig;
import com.onfido.android.sdk.capture.internal.navigation.Navigator;
import com.onfido.hosted.web.module.model.HostedWebModuleCancelled;
import com.onfido.hosted.web.module.model.HostedWebModuleExit;
import com.onfido.hosted.web.module.model.HostedWebModuleFailed;
import com.onfido.hosted.web.module.model.HostedWebModuleResult;
import com.onfido.hosted.web.module.model.HostedWebModuleSuccess;
import com.onfido.javax.inject.Provider;
import com.revolut.camerakit.validators.config.DocumentFitFourCornerConfig;
import com.revolut.core.ui_kit.delegates.CellDetailsDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.views.AvatarView;
import com.revolut.feature.backend_flow.domain.models.BackendFlow;
import com.revolut.feature.backend_flow.domain.models.BackendFlowFile;
import com.revolut.feature.crypto_feed.dependencies.fiatbalances.RevolutXFiatBalancesContract$RevolutXFiatBalanceData;
import com.revolut.feature.crypto_investments.api.widget.investments.sorting.CryptoInvestmentsSortingType;
import com.revolut.feature.referrals.shared.ui.impl.ui.invites_details.InvitesDetailsContract$InputData;
import com.revolut.feature.retail.cfd.impl.screens.settings.CfdSettingsController;
import com.revolut.feature.rewards.impl.ui.details.flow.PerkDetailsFlowContract$InputData;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.contract.Field$Country;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.stock_details_overview.StockDetailsOverviewController;
import com.revolut.shared.feature.wealth.models.screener.ScreenerCollection;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSelectedSorting;
import d2k.k;
import efm.l;
import efm.r;
import fnc.s;
import g2e.t;
import igm.o;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import ix0.i0;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kgm.j;
import kl.t1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.d0;
import kotlinx.coroutines.flow.Flow;
import n4j.f;
import nl.s0;
import nl.v0;
import nl.y0;
import ood.o0;
import org.json.JSONObject;
import pak.h;
import pc.p;
import pl.q;
import rd0.e;
import sl.m;
import ur5.c;
import ut5.d;
import vpk.g;
import zhm.u;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final class a implements i0, d, k, el.b, o, h2b.b, OnCompleteListener, SuccessContinuation, l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f179037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f179038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f179039c;

    public /* synthetic */ a() {
        this.f179037a = 1;
    }

    public static ArrayList A(double d, ArrayList arrayList) {
        int iJ = v.j(arrayList);
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        int i = 0;
        for (Object pair : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                v.s();
                throw null;
            }
            if (i == iJ) {
                pair = new Pair(((Pair) pair).f186385a, Double.valueOf(d));
            }
            arrayList2.add(pair);
            i = i2;
        }
        return arrayList2;
    }

    public static ArrayList z(List list) {
        List<Pair> list2 = list;
        ArrayList arrayList = new ArrayList(w.t(list2, 10));
        for (Pair pair : list2) {
            arrayList.add(new Pair(Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(((Number) pair.f186385a).longValue())), Double.valueOf(((Number) pair.f186386b).doubleValue())));
        }
        return arrayList;
    }

    @Override // ut5.d
    public Flow a(xi0.b targetCurrency) {
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        return e.b(((c) this.f179039c).c(targetCurrency, n9l.b.SEC_3));
    }

    @Override // igm.o
    public Object apply(Object obj2) {
        HostedWebModuleResult result = (HostedWebModuleResult) obj2;
        v0 v0Var = (v0) this.f179038b;
        Intrinsics.checkNotNullParameter(result, "result");
        if (result instanceof HostedWebModuleExit) {
            Observable observableJust = Observable.just(s0.f216949a);
            Intrinsics.h(observableJust);
            return observableJust;
        }
        if (result instanceof HostedWebModuleSuccess) {
            Completable completableB = v0Var.f216957b.b((m) this.f179039c, ((HostedWebModuleSuccess) result).getBody());
            kye.e eVar = new kye.e(v0Var, 19);
            he2.b bVar = j.d;
            kgm.b bVar2 = j.f184027c;
            completableB.getClass();
            return new ogm.m(completableB, eVar, bVar, bVar2, bVar2).d(Observable.just(s0.f216950b));
        }
        if (result instanceof HostedWebModuleFailed) {
            v0Var.f216956a.exitCurrentScreen();
            Observable observableError = Observable.error(new Throwable(((HostedWebModuleFailed) result).getBody()));
            Intrinsics.h(observableError);
            return observableError;
        }
        if (!(result instanceof HostedWebModuleCancelled)) {
            throw new NoWhenBranchMatchedException();
        }
        Observable observableError2 = Observable.error(new Throwable("Back pressing is not allowed"));
        Intrinsics.h(observableError2);
        return observableError2;
    }

    @Override // ix0.i0
    public List b() {
        return (List) this.f179039c;
    }

    @Override // h2b.b
    public RowDelegate c() {
        return (RowDelegate) this.f179039c;
    }

    @Override // h2b.b
    public CellDetailsDelegate d() {
        return (CellDetailsDelegate) this.f179038b;
    }

    @Override // ut5.d
    public boolean e(Object obj2) {
        return obj2 instanceof RevolutXFiatBalancesContract$RevolutXFiatBalanceData;
    }

    public boolean equals(Object obj2) {
        switch (this.f179037a) {
            case 1:
                if (!(obj2 instanceof androidx.core.util.Pair)) {
                    return false;
                }
                androidx.core.util.Pair pair = (androidx.core.util.Pair) obj2;
                Object obj3 = pair.first;
                Object obj4 = this.f179038b;
                if (obj3 != obj4 && (obj3 == null || !obj3.equals(obj4))) {
                    return false;
                }
                Object obj5 = pair.second;
                Object obj6 = this.f179039c;
                return obj5 == obj6 || (obj5 != null && obj5.equals(obj6));
            default:
                return super.equals(obj2);
        }
    }

    @Override // ut5.d
    public Flow f(CryptoInvestmentsSortingType sortingType) {
        Intrinsics.checkNotNullParameter(sortingType, "sortingType");
        return new lkf.v(((pr5.a) this.f179038b).b3(), this, 13);
    }

    @Override // ix0.i0
    public void g(ArrayList arrayList) {
        if (Intrinsics.f(arrayList, (List) this.f179039c)) {
            return;
        }
        this.f179039c = arrayList;
        ((AvatarView) this.f179038b).invalidate();
    }

    @Override // com.onfido.javax.inject.Provider
    public Object get() {
        switch (this.f179037a) {
            case 14:
                return new nl.e((OnfidoRemoteConfig) ((il.a) this.f179038b).get(), (Navigator) ((t) this.f179039c).get());
            case 18:
                return new ol.c((Context) ((il.a) this.f179038b).get(), (ResultReceiver) ((s) this.f179039c).get());
            default:
                return new pl.j((Navigator) ((Provider) this.f179038b).get(), (q) ((y0) this.f179039c).get());
        }
    }

    @Override // ix0.i0
    public View getView() {
        return (AvatarView) this.f179038b;
    }

    @Override // d2k.k
    public Flow h() {
        f fVar = (f) this.f179038b;
        return nim.a.v(e.b(w2j.a.b(fVar.f212452a)), new n45.b((Field$Country) this.f179039c, fVar, 11));
    }

    public int hashCode() {
        switch (this.f179037a) {
            case 1:
                Object obj2 = this.f179038b;
                int iHashCode = obj2 == null ? 0 : obj2.hashCode();
                Object obj3 = this.f179039c;
                return iHashCode ^ (obj3 != null ? obj3.hashCode() : 0);
            default:
                return super.hashCode();
        }
    }

    public String i(String referralCode) {
        Intrinsics.checkNotNullParameter(referralCode, "referralCode");
        return a0.d.r(((o8b.c) ((n8b.a) this.f179038b)).g() ? "https://in-api.revolut.com/referral/?referral-code=" : "https://revolut.com/referral/?referral-code=", referralCode);
    }

    public rr.a j(String token) {
        Set setI1;
        rr.d dVar;
        Intrinsics.checkNotNullParameter(token, "token");
        try {
            List listN0 = d0.n0(token, new String[]{"."}, 0, 6);
            String json = (listN0.size() <= 1 || ((CharSequence) listN0.get(1)).length() == 0) ? null : new String(((tl0.a) this.f179038b).f((String) listN0.get(1)), Charsets.UTF_8);
            if (json != null) {
                h hVar = (h) this.f179039c;
                Intrinsics.checkNotNullParameter(json, "json");
                rr.b bVar = (rr.b) ((rlm.o) hVar.f234573b).b(rr.b.INSTANCE.serializer(), json);
                String str = bVar.f256601a;
                Set set = bVar.f256602b;
                if (set != null) {
                    Set<String> set2 = set;
                    ArrayList arrayList = new ArrayList(w.t(set2, 10));
                    for (String str2 : set2) {
                        int iHashCode = str2.hashCode();
                        if (iHashCode != -1844920828) {
                            if (iHashCode != -1502655067) {
                                dVar = (iHashCode == 1765705717 && str2.equals("face_embedding")) ? rr.d.FACE_EMBEDDING : rr.d.UNKNOWN;
                            } else if (str2.equals("dynamic_instructions")) {
                                dVar = rr.d.DYNAMIC_INSTRUCTIONS;
                            }
                        } else if (str2.equals("compact_selfie")) {
                            dVar = rr.d.COMPACT_SELFIE;
                        }
                        arrayList.add(dVar);
                    }
                    setI1 = zhm.d0.i1(arrayList);
                } else {
                    setI1 = null;
                }
                return new rr.a(new rr.c(str, setI1, bVar.f256603c));
            }
        } catch (IllegalArgumentException unused) {
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof opf.o
            if (r0 == 0) goto L13
            r0 = r7
            opf.o r0 = (opf.o) r0
            int r1 = r0.f227626w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f227626w = r1
            goto L18
        L13:
            opf.o r0 = new opf.o
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f227626w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L58
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            java.lang.String r7 = "registeredIdentity"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r7)
            kotlinx.coroutines.flow.Flow r7 = r5.q()
            om4.t3 r2 = new om4.t3
            r4 = 3
            r2.<init>(r6, r4)
            akg.n r6 = nim.a.v(r7, r2)
            zfd.e r6 = zi0.c.w(r6)
            zhm.h0 r7 = zhm.h0.f322473a
            vkm.q0 r6 = rd0.e.n(r6, r7)
            r0.f227626w = r3
            java.lang.Object r7 = vkm.q.z(r6, r0)
            if (r7 != r1) goto L58
            return r1
        L58:
            com.revolut.data.model.Data r7 = (com.revolut.data.model.Data) r7
            if (r7 == 0) goto L63
            java.lang.Object r6 = r7.getContent()
            com.revolut.feature.transfer.core.models.CountryProfile r6 = (com.revolut.feature.transfer.core.models.CountryProfile) r6
            return r6
        L63:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jx0.a.k(java.lang.String, gim.c):java.lang.Object");
    }

    public efm.d0 l() {
        efm.d0 d0VarFirst = m70.a.g(((ang.f) this.f179039c).k(false), null, new lnk.o(24), 1).map(new lr9.m(new lu5.o(this, 11), 29)).first("");
        Intrinsics.checkNotNullExpressionValue(d0VarFirst, "first(...)");
        return d0VarFirst;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(gim.c r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof kk8.a
            if (r0 == 0) goto L13
            r0 = r7
            kk8.a r0 = (kk8.a) r0
            int r1 = r0.f184501w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184501w = r1
            goto L18
        L13:
            kk8.a r0 = new kk8.a
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f184501w
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r7)
            return r7
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            yhm.o.b(r7)
            goto L5a
        L39:
            yhm.o.b(r7)
            goto L49
        L3d:
            yhm.o.b(r7)
            r0.f184501w = r5
            java.lang.Object r7 = r6.n(r0)
            if (r7 != r1) goto L49
            goto L6a
        L49:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L6d
            r0.f184501w = r4
            java.lang.Object r7 = r6.v(r0)
            if (r7 != r1) goto L5a
            goto L6a
        L5a:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L6c
            r0.f184501w = r3
            java.lang.Object r7 = r6.w(r0)
            if (r7 != r1) goto L6b
        L6a:
            return r1
        L6b:
            return r7
        L6c:
            r5 = 0
        L6d:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: jx0.a.m(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(gim.c r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof kk8.b
            if (r0 == 0) goto L13
            r0 = r7
            kk8.b r0 = (kk8.b) r0
            int r1 = r0.f184502w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184502w = r1
            goto L18
        L13:
            kk8.b r0 = new kk8.b
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f184502w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r7)
            goto L4b
        L28:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L30:
            yhm.o.b(r7)
            java.lang.Object r7 = r6.f179039c
            kk8.k r7 = (kk8.k) r7
            r0.f184502w = r4
            gk8.d r7 = r7.f184515a
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            gk8.b r5 = new gk8.b
            r5.<init>(r7, r3, r4)
            java.lang.Object r7 = skm.e0.J(r2, r5, r0)
            if (r7 != r1) goto L4b
            return r1
        L4b:
            com.revolut.feature.junior_progression.impl.data.model.JuniorProgressionPromptStage r7 = (com.revolut.feature.junior_progression.impl.data.model.JuniorProgressionPromptStage) r7
            r0 = 0
            if (r7 != 0) goto L52
        L50:
            r4 = r0
            goto L7e
        L52:
            boolean r1 = r7 instanceof com.revolut.feature.junior_progression.impl.data.model.JuniorProgressionPromptStage.Completed
            if (r1 == 0) goto L67
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r1 = "Completed progression stage must not be persisted"
            r7.<init>(r1)
            zhm.h0 r1 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r2 = rd0.d.f253311a
            rd0.c r2 = rd0.c.ERROR
            rd0.d.a(r2, r3, r3, r7, r1)
            goto L50
        L67:
            boolean r0 = r7 instanceof com.revolut.feature.junior_progression.impl.data.model.JuniorProgressionPromptStage.Initial
            if (r0 != 0) goto L7e
            boolean r0 = r7 instanceof com.revolut.feature.junior_progression.impl.data.model.JuniorProgressionPromptStage.FeaturesReloading
            if (r0 != 0) goto L7e
            boolean r0 = r7 instanceof com.revolut.feature.junior_progression.impl.data.model.JuniorProgressionPromptStage.PlanCheck
            if (r0 != 0) goto L7e
            boolean r7 = r7 instanceof com.revolut.feature.junior_progression.impl.data.model.JuniorProgressionPromptStage.PreCompletion
            if (r7 == 0) goto L78
            goto L7e
        L78:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L7e:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: jx0.a.n(gim.c):java.lang.Object");
    }

    public jhi.b o(Pair currencyPair) {
        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
        ppk.f fVar = (ppk.f) this.f179039c;
        List currencyPairs = u.c(currencyPair);
        Intrinsics.checkNotNullParameter(currencyPairs, "currencyPairs");
        return mo3.a.g(c8g.a.D(nim.a.v(e.b(pd.b.r(fVar.f(currencyPairs), new ppk.e(fVar, 1))), new l2d.a(14))), null, null, 3);
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        p pVar = (p) this.f179038b;
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) this.f179039c;
        synchronized (pVar.f) {
            pVar.e.remove(taskCompletionSource);
        }
    }

    @Override // efm.l
    public void onError(Throwable th10) {
        ((l) this.f179038b).onError(th10);
    }

    @Override // efm.l
    public void onSubscribe(ifm.c cVar) {
        lfm.d.e((pfm.u) this.f179039c, cVar);
    }

    @Override // efm.l, efm.f0
    public void onSuccess(Object obj2) {
        ((l) this.f179038b).onSuccess(obj2);
    }

    public jhi.b p(Pair currencyPair) {
        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
        return mo3.a.g(c8g.a.D(e.b(((ppk.f) this.f179039c).b(u.c(currencyPair), true))), null, null, 3);
    }

    public Flow q() {
        Continuation continuation = null;
        return xam.a.h(new opf.p(this, continuation, 1), nim.a.A(nim.a.u(new opf.p(this, continuation, 0), r10.q.j0((r10.q) this.f179038b, do3.f.BANKING, null, 6)), new o0(13)));
    }

    public Flow r(ScreenerCollection collection, vih.a tickerUpdateStrategy) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        Intrinsics.checkNotNullParameter(tickerUpdateStrategy, "tickerUpdateStrategy");
        ugl.c cVar = (ugl.c) this.f179038b;
        ArrayList arrayList = collection.f105157g;
        List list = collection.i;
        ScreenerSelectedSorting screenerSelectedSorting = collection.f105159j;
        return boh.f.e(ugl.c.a(cVar, arrayList, list, screenerSelectedSorting != null ? screenerSelectedSorting.f105170a : null, screenerSelectedSorting != null ? screenerSelectedSorting.f105171b : null, null, 112), new nc1.j(this, tickerUpdateStrategy, 26));
    }

    public r s(Pair currencyPair, qta.f duration, p0i.c cVar) {
        vpk.p pVar = (vpk.p) ((f61.a) this.f179038b).f132372b;
        int i = l3i.a.f191953a[cVar.ordinal()];
        if (i == 1) {
            Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
            Intrinsics.checkNotNullParameter(duration, "duration");
            Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
            Intrinsics.checkNotNullParameter(duration, "duration");
            g gVar = new g(currencyPair, duration, vpk.f.ASK_LINE, null, vpk.e.ASK, false, 104);
            return e.c(qe0.o.a(pVar.f291253j, gVar, 10L, null, pVar.e(gVar), null, 20), kotlin.coroutines.g.f186406a);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
        Intrinsics.checkNotNullParameter(duration, "duration");
        g gVar2 = new g(currencyPair, duration, vpk.f.BID_LINE, null, vpk.e.BID, false, 104);
        return e.c(qe0.o.a(pVar.f291253j, gVar2, 10L, null, pVar.e(gVar2), null, 20), kotlin.coroutines.g.f186406a);
    }

    public n t() {
        return nim.a.v(((ang.f) this.f179039c).j(w4l.j.f294644c), new o0(14));
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj2) throws Throwable {
        FileWriter fileWriter;
        fc.g gVar = (fc.g) this.f179039c;
        JSONObject jSONObject = (JSONObject) ((je.d) this.f179038b).f173169c.f173164a.submit(new nc0.a(this, 20)).get();
        FileWriter fileWriter2 = null;
        if (jSONObject != null) {
            qe.b bVarM = ((mp.r) gVar.f133581c).m(jSONObject);
            a31.a aVar = (a31.a) gVar.e;
            long j2 = bVarM.f245006c;
            aVar.getClass();
            if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            }
            try {
                jSONObject.put("expires_at", j2);
                fileWriter = new FileWriter((File) aVar.f955b);
                try {
                    fileWriter.write(jSONObject.toString());
                    fileWriter.flush();
                } catch (Exception e) {
                } catch (Throwable th10) {
                    th = th10;
                    fileWriter2 = fileWriter;
                    ie.g.b(fileWriter2, "Failed to close settings writer.");
                    throw th;
                }
            } catch (Exception e2) {
                fileWriter = null;
            } catch (Throwable th11) {
                th = th11;
            }
            ie.g.b(fileWriter, "Failed to close settings writer.");
            fc.g.e("Loaded settings: ", jSONObject);
            String str = ((qe.e) gVar.f133580b).f;
            SharedPreferences.Editor editorEdit = ((Context) gVar.f133579a).getSharedPreferences("com.google.firebase.crashlytics", 0).edit();
            editorEdit.putString("existing_instance_identifier", str);
            editorEdit.apply();
            ((AtomicReference) gVar.f133583h).set(bVarM);
            ((TaskCompletionSource) ((AtomicReference) gVar.i).get()).trySetResult(bVarM);
        }
        return Tasks.forResult(null);
    }

    public String toString() {
        switch (this.f179037a) {
            case 1:
                StringBuilder sb6 = new StringBuilder("Pair{");
                sb6.append(this.f179038b);
                sb6.append(" ");
                return com.revolut.data.database.models.openbanking.d.t(sb6, this.f179039c, "}");
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object u(gim.c r6, java.lang.String r7, wi0.b r8) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f179038b
            qa9.w r0 = (qa9.w) r0
            boolean r1 = r6 instanceof rqk.a
            if (r1 == 0) goto L17
            r1 = r6
            rqk.a r1 = (rqk.a) r1
            int r2 = r1.f256572w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f256572w = r2
            goto L1c
        L17:
            rqk.a r1 = new rqk.a
            r1.<init>(r5, r6)
        L1c:
            java.lang.Object r6 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f256572w
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 != r4) goto L2b
            yhm.o.b(r6)
            goto L4b
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            yhm.o.b(r6)
            r89.c r6 = r0.d(r7)
            boolean r7 = r6 instanceof r89.a
            if (r7 == 0) goto L53
            r89.a r6 = (r89.a) r6
            com.revolut.feature.terms.api.model.TermsScope r6 = r6.f252401a
            r1.f256572w = r4
            java.lang.Object r6 = r0.b(r6, r8, r1)
            if (r6 != r2) goto L4b
            return r2
        L4b:
            aii.u r6 = (aii.u) r6
            cjl.j r7 = new cjl.j
            r7.<init>(r6)
            return r7
        L53:
            boolean r7 = r6 instanceof r89.b
            if (r7 == 0) goto L64
            cjl.k r6 = new cjl.k
            java.lang.String r7 = "CONTRACTUAL_DOCUMENTATION_LINK_ID"
            java.lang.String r8 = "listId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r8)
            r6.<init>()
            return r6
        L64:
            if (r6 != 0) goto L68
            r6 = 0
            return r6
        L68:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jx0.a.u(gim.c, java.lang.String, wi0.b):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object v(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof kk8.c
            if (r0 == 0) goto L13
            r0 = r6
            kk8.c r0 = (kk8.c) r0
            int r1 = r0.f184503w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184503w = r1
            goto L18
        L13:
            kk8.c r0 = new kk8.c
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f184503w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L49
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            java.lang.Object r6 = r5.f179038b
            xoj.a r6 = (xoj.a) r6
            yoj.c r2 = yoj.c.JUNIOR_PROGRESSION
            yoj.d r4 = yoj.d.DISABLED
            cpj.b r6 = (cpj.b) r6
            ufm.i r6 = r6.f(r2, r4)
            r0.f184503w = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: jx0.a.v(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object w(gim.c r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof kk8.d
            if (r0 == 0) goto L13
            r0 = r8
            kk8.d r0 = (kk8.d) r0
            int r1 = r0.f184504w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f184504w = r1
            goto L18
        L13:
            kk8.d r0 = new kk8.d
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f184504w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r8)
            goto L4c
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L30:
            yhm.o.b(r8)
            java.lang.Object r8 = r7.f179039c
            kk8.k r8 = (kk8.k) r8
            r0.f184504w = r4
            gk8.d r8 = r8.f184515a
            skm.p0 r2 = skm.p0.f264001a
            elm.f r2 = elm.f.f127540b
            gk8.c r5 = new gk8.c
            r6 = 0
            r5.<init>(r8, r6, r3)
            java.lang.Object r8 = skm.e0.J(r2, r5, r0)
            if (r8 != r1) goto L4c
            return r1
        L4c:
            lk8.f r8 = (lk8.f) r8
            boolean r0 = r8 instanceof lk8.d
            if (r0 == 0) goto L5e
            lk8.d r8 = (lk8.d) r8
            lk8.c r8 = r8.f196304a
            lk8.g r8 = r8.f196302a
            lk8.g r0 = lk8.g.COMPLETED
            if (r8 == r0) goto L62
            r3 = r4
            goto L62
        L5e:
            boolean r8 = r8 instanceof lk8.e
            if (r8 == 0) goto L67
        L62:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            return r8
        L67:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: jx0.a.w(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (nim.a.a(r0, r1) == r2) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object x(gim.c r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f179039c
            bgc.e r0 = (bgc.e) r0
            boolean r1 = r7 instanceof lic.j
            if (r1 == 0) goto L17
            r1 = r7
            lic.j r1 = (lic.j) r1
            int r2 = r1.f195460w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.f195460w = r2
            goto L1c
        L17:
            lic.j r1 = new lic.j
            r1.<init>(r6, r7)
        L1c:
            java.lang.Object r7 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f195460w
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3a
            if (r3 == r5) goto L36
            if (r3 != r4) goto L2e
            yhm.o.b(r7)
            goto L70
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            yhm.o.b(r7)
            goto L51
        L3a:
            yhm.o.b(r7)
            java.lang.Object r7 = r6.f179038b
            com.revolut.feature.rewards.impl.ui.details.flow.PerkDetailsFlowContract$InputData r7 = (com.revolut.feature.rewards.impl.ui.details.flow.PerkDetailsFlowContract$InputData) r7
            java.lang.String r3 = r7.f84922a
            boolean r7 = r7.f
            r1.f195460w = r5
            r5 = r0
            ugc.g r5 = (ugc.g) r5
            java.lang.Object r7 = r5.k(r1, r3, r7)
            if (r7 != r2) goto L51
            goto L6f
        L51:
            ugc.g r0 = (ugc.g) r0
            r0.getClass()
            ty7.b r7 = new ty7.b
            r3 = 3
            r7.<init>(r0, r3)
            pfm.h r0 = new pfm.h
            r3 = 2
            r0.<init>(r7, r3)
            java.lang.String r7 = "fromAction(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r7)
            r1.f195460w = r4
            java.lang.Object r7 = nim.a.a(r0, r1)
            if (r7 != r2) goto L70
        L6f:
            return r2
        L70:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: jx0.a.x(gim.c):java.lang.Object");
    }

    public Unit y(BackendFlowFile backendFlowFile) {
        ul2.c cVar = (ul2.c) this.f179039c;
        BackendFlow backendFlow = (BackendFlow) this.f179038b;
        String remoteId = backendFlowFile.d;
        if (remoteId != null) {
            ar6.c cVar2 = cVar.f280857a;
            String id10 = backendFlow.f63264b;
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(remoteId, "remoteId");
            pfm.r rVarG0 = te0.w.g0(cVar2.f8523a.removeFile(id10, remoteId));
            ofm.f fVar = new ofm.f(1);
            rVarG0.d(fVar);
            fVar.a();
        }
        Unit unit = Unit.f186387a;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        return unit;
    }

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f179037a = i;
        this.f179038b = obj2;
        this.f179039c = obj3;
    }

    public a(tl0.a base64Wrapper, h jsonDecoder) {
        this.f179037a = 25;
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        Intrinsics.checkNotNullParameter(jsonDecoder, "jsonDecoder");
        this.f179038b = base64Wrapper;
        this.f179039c = jsonDecoder;
    }

    @Override // efm.l
    public void onComplete() {
        ((l) this.f179038b).onComplete();
    }

    public a(BackendFlow backendFlow, ul2.c backendFormFileRepository) {
        this.f179037a = 5;
        Intrinsics.checkNotNullParameter(backendFlow, "backendFlow");
        Intrinsics.checkNotNullParameter(backendFormFileRepository, "backendFormFileRepository");
        this.f179038b = backendFlow;
        this.f179039c = backendFormFileRepository;
    }

    public a(InvitesDetailsContract$InputData inputData, wwa.b interactor) {
        this.f179037a = 23;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.f179038b = inputData;
        this.f179039c = interactor;
    }

    public a(qa9.w countryResidenceScreenConfiguration) {
        this.f179037a = 27;
        Intrinsics.checkNotNullParameter(countryResidenceScreenConfiguration, "countryResidenceScreenConfiguration");
        this.f179038b = countryResidenceScreenConfiguration;
        this.f179039c = countryResidenceScreenConfiguration.e;
    }

    public a(AvatarView view) {
        this.f179037a = 0;
        Intrinsics.checkNotNullParameter(view, "view");
        this.f179038b = view;
    }

    public a(n8b.a countryInteractor, ang.f userInteractor) {
        this.f179037a = 7;
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f179038b = countryInteractor;
        this.f179039c = userInteractor;
    }

    public a(PerkDetailsFlowContract$InputData inputData, bgc.e rewardsInteractor) {
        this.f179037a = 6;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(rewardsInteractor, "rewardsInteractor");
        this.f179038b = inputData;
        this.f179039c = rewardsInteractor;
    }

    public a(DocumentFitFourCornerConfig config) {
        this.f179037a = 8;
        Intrinsics.checkNotNullParameter(config, "config");
        this.f179038b = config;
        this.f179039c = v.k(2, 5, 8, 11);
    }

    public a(yof.d transferAmountMapper, s8i.a moveMoneyTopupTransferExpensesAmountMapper, gte.a featureToggleInteractor) {
        this.f179037a = 29;
        Intrinsics.checkNotNullParameter(transferAmountMapper, "transferAmountMapper");
        Intrinsics.checkNotNullParameter(moveMoneyTopupTransferExpensesAmountMapper, "moveMoneyTopupTransferExpensesAmountMapper");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f179038b = transferAmountMapper;
        this.f179039c = featureToggleInteractor;
    }

    public a(t1 headerMapper, m8b.r itemsMapper, m8b.q faqMapper) {
        this.f179037a = 9;
        Intrinsics.checkNotNullParameter(headerMapper, "headerMapper");
        Intrinsics.checkNotNullParameter(itemsMapper, "itemsMapper");
        Intrinsics.checkNotNullParameter(faqMapper, "faqMapper");
        this.f179038b = headerMapper;
        this.f179039c = itemsMapper;
    }

    public a(mu5.f cryptoInvestmentsInteractor, xv5.c cryptoCommodityBaseCurrencyInteractor) {
        this.f179037a = 3;
        Intrinsics.checkNotNullParameter(cryptoInvestmentsInteractor, "cryptoInvestmentsInteractor");
        Intrinsics.checkNotNullParameter(cryptoCommodityBaseCurrencyInteractor, "cryptoCommodityBaseCurrencyInteractor");
        this.f179038b = cryptoInvestmentsInteractor;
        this.f179039c = cryptoCommodityBaseCurrencyInteractor;
    }

    public a(rq9.a groupBillsNaviCommandProvider, mq9.f interactor) {
        this.f179037a = 20;
        Intrinsics.checkNotNullParameter(groupBillsNaviCommandProvider, "groupBillsNaviCommandProvider");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.f179038b = groupBillsNaviCommandProvider;
        this.f179039c = interactor;
    }

    public a(xoj.a featuresInteractor, kk8.k progressionInteractor) {
        this.f179037a = 2;
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(progressionInteractor, "progressionInteractor");
        this.f179038b = featuresInteractor;
        this.f179039c = progressionInteractor;
    }

    public a(ij0.a networkConfiguration, ybl.o tradingStatementsInteractor) {
        this.f179037a = 13;
        Intrinsics.checkNotNullParameter(networkConfiguration, "networkConfiguration");
        Intrinsics.checkNotNullParameter(tradingStatementsInteractor, "tradingStatementsInteractor");
        this.f179038b = networkConfiguration;
        this.f179039c = tradingStatementsInteractor;
    }

    public a(ugl.c screenerInteractor, e9h.d performanceAssetsTransformer) {
        this.f179037a = 16;
        Intrinsics.checkNotNullParameter(screenerInteractor, "screenerInteractor");
        Intrinsics.checkNotNullParameter(performanceAssetsTransformer, "performanceAssetsTransformer");
        this.f179038b = screenerInteractor;
        this.f179039c = performanceAssetsTransformer;
    }

    public a(pr5.a revolutXFiatSectionModelExtension, c revolutXFiatBalanceInteractor, vr5.a fiatBalancesItemsMapper) {
        this.f179037a = 10;
        Intrinsics.checkNotNullParameter(revolutXFiatSectionModelExtension, "revolutXFiatSectionModelExtension");
        Intrinsics.checkNotNullParameter(revolutXFiatBalanceInteractor, "revolutXFiatBalanceInteractor");
        Intrinsics.checkNotNullParameter(fiatBalancesItemsMapper, "fiatBalancesItemsMapper");
        this.f179038b = revolutXFiatSectionModelExtension;
        this.f179039c = revolutXFiatBalanceInteractor;
    }

    public a(ang.f userInteractor, r10.q userRegisteredIdentitiesInteractor) {
        this.f179037a = 19;
        Intrinsics.checkNotNullParameter(userRegisteredIdentitiesInteractor, "userRegisteredIdentitiesInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f179038b = userRegisteredIdentitiesInteractor;
        this.f179039c = userInteractor;
    }

    public a(f61.a plotInteractor, ppk.f ratesInteractor) {
        this.f179037a = 4;
        Intrinsics.checkNotNullParameter(plotInteractor, "plotInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        this.f179038b = plotInteractor;
        this.f179039c = ratesInteractor;
    }

    public a(CfdSettingsController cfdSettingsController) {
        this.f179037a = 17;
        this.f179038b = cfdSettingsController.L;
        this.f179039c = cfdSettingsController.M;
    }

    public a(fc.g gVar, je.d dVar) {
        this.f179037a = 24;
        this.f179039c = gVar;
        this.f179038b = dVar;
    }

    public a(StockDetailsOverviewController stockDetailsOverviewController) {
        this.f179037a = 11;
        this.f179038b = stockDetailsOverviewController.u0;
        this.f179039c = stockDetailsOverviewController.g0;
    }

    public a(ryc.b bVar, ryc.c cVar) {
        this.f179037a = 28;
        this.f179038b = cVar;
        this.f179039c = e4m.b.b(new r6e.m(bVar, this, 13));
    }
}
