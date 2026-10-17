package ogm;

import android.content.Context;
import androidx.view.ComponentActivity;
import cli.y;
import com.onfido.workflow.internal.network.WorkflowApi;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.impl.ui.credit_limit_cap.CreditLimitCapChangeScreen;
import com.revolut.feature.security_hub.api.models.StreetModeInfo;
import com.revolut.feature.security_hub.api.models.WealthProtectionFeatureState;
import com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.WealthProtectionLimitChangeScreen;
import com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.WealthProtectionLimitChangeScreenContract$InputData;
import com.revolut.retail.feature.esim.impl.ui.screens.home.get_plan.EsimGetPlanScreenContract$InputData;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import com.youTransactor.uCube.ITask;
import com.youTransactor.uCube.ITaskMonitor;
import com.youTransactor.uCube.TaskEvent;
import defpackage.b1;
import defpackage.c1;
import defpackage.o1;
import defpackage.v1;
import defpackage.z0;
import hu1.f0;
import io.reactivex.rxjava3.disposables.Disposable;
import java.io.FileOutputStream;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import k4l.r0;
import k7c.b0;
import kl.c0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import mle.x;
import nel.z;
import retrofit2.HttpException;
import skm.e0;
import skm.p0;
import tb4.t;
import ulm.r1;
import vkm.j2;
import zhm.h0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes14.dex */
public final class i implements fgm.p, ITaskMonitor, zp0.c, kfm.o, e4i.a, igm.c, igm.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f225221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f225222b;

    public i(fjm.j function) {
        this.f225221a = 15;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f225222b = function;
    }

    public static ArrayList c(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof jq9.m) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((jq9.m) it8.next()).f177508b);
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList2) {
            if (f5j.c.c((f5j.a) obj3)) {
                arrayList3.add(obj3);
            }
        }
        return arrayList3;
    }

    public static dej.m d(fij.o oVar) {
        if (oVar instanceof fij.n) {
            return dej.m.MOBILE_PLAN;
        }
        if (oVar instanceof fij.m) {
            return dej.m.DATA_PLAN;
        }
        throw new NoWhenBranchMatchedException();
    }

    public Amount a(InstrumentTicker instrumentTicker, bfl.g tradeSide, r0 orderType) {
        Intrinsics.checkNotNullParameter(instrumentTicker, "instrumentTicker");
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        if (instrumentTicker.d == z.CFD) {
            ej0.b bVarA = p2b.c.a(instrumentTicker, tradeSide, orderType);
            return new Amount(bVarA.f126703a, f(bVarA.f126704b));
        }
        dj0.d dVar = instrumentTicker.e;
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        e().getClass();
        return l4i.a.e(dVar);
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object obj2) {
        switch (this.f225221a) {
            case 10:
                break;
            case 14:
                break;
            case 15:
                break;
            case 17:
                Object objApply = ((kfm.o) ((rfm.j) this.f225222b).f253955c).apply(new Object[]{obj2});
                mfm.f.b(objApply, "The zipper returned a null value");
                break;
            case 26:
                ((Number) obj2).longValue();
                sl.j jVar = (sl.j) this.f225222b;
                Locale localeM = jVar.e.m();
                WorkflowApi workflowApi = jVar.f264039a;
                String languageTag = localeM.toLanguageTag();
                Intrinsics.checkNotNullExpressionValue(languageTag, "toLanguageTag(...)");
                break;
            case 27:
                break;
        }
        return ((ry7.j) this.f225222b).invoke(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable b(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof opf.m
            if (r0 == 0) goto L13
            r0 = r7
            opf.m r0 = (opf.m) r0
            int r1 = r0.f227624w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f227624w = r1
            goto L18
        L13:
            opf.m r0 = new opf.m
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f227624w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r7)     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a kotlinx.coroutines.TimeoutCancellationException -> L2c
            goto L49
        L28:
            r6 = move-exception
            goto L60
        L2a:
            r6 = move-exception
            goto L71
        L2c:
            r6 = move-exception
            goto L72
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L36:
            yhm.o.b(r7)
            opf.n r7 = new opf.n     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a kotlinx.coroutines.TimeoutCancellationException -> L2c
            r7.<init>(r5, r6, r4)     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a kotlinx.coroutines.TimeoutCancellationException -> L2c
            r0.f227624w = r3     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a kotlinx.coroutines.TimeoutCancellationException -> L2c
            r2 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r7 = skm.h2.b(r2, r7, r0)     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a kotlinx.coroutines.TimeoutCancellationException -> L2c
            if (r7 != r1) goto L49
            return r1
        L49:
            com.revolut.data.model.Data r7 = (com.revolut.data.model.Data) r7     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a kotlinx.coroutines.TimeoutCancellationException -> L2c
            if (r7 == 0) goto L82
            java.lang.Object r6 = r7.getContent()     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a kotlinx.coroutines.TimeoutCancellationException -> L2c
            java.util.List r6 = (java.util.List) r6     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a kotlinx.coroutines.TimeoutCancellationException -> L2c
            if (r6 == 0) goto L82
            java.lang.Object r6 = zhm.d0.d0(r6)     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a kotlinx.coroutines.TimeoutCancellationException -> L2c
            j61.c r6 = (j61.c) r6     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a kotlinx.coroutines.TimeoutCancellationException -> L2c
            if (r6 == 0) goto L82
            tof.a3 r6 = r6.f171656a     // Catch: java.lang.Exception -> L28 java.util.concurrent.CancellationException -> L2a kotlinx.coroutines.TimeoutCancellationException -> L2c
            return r6
        L60:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r0 = "Unable to fetch transaction"
            r7.<init>(r0, r6)
            zhm.h0 r6 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            rd0.d.a(r0, r4, r4, r7, r6)
            goto L82
        L71:
            throw r6
        L72:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r0 = "Unable to fetch transaction (timeout: 5000ms.)"
            r7.<init>(r0, r6)
            zhm.h0 r6 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            rd0.d.a(r0, r4, r4, r7, r6)
        L82:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ogm.i.b(java.lang.String, gim.c):java.io.Serializable");
    }

    @Override // e4i.a
    public l4i.a e() {
        return (l4i.a) this.f225222b;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof s1j.c
            if (r0 == 0) goto L13
            r0 = r6
            s1j.c r0 = (s1j.c) r0
            int r1 = r0.f259146w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f259146w = r1
            goto L18
        L13:
            s1j.c r0 = new s1j.c
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f259146w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L4b
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            java.lang.Object r6 = r5.f225222b
            elb.b r6 = (elb.b) r6
            w4l.j r2 = w4l.j.f294644c
            cxe.u r6 = r6.a(r2)
            r2 = 3
            r4 = 0
            jhi.b r6 = mo3.a.g(r6, r4, r4, r2)
            r0.f259146w = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L4b
            return r1
        L4b:
            uib.a r6 = (uib.a) r6
            uib.c r6 = r6.f280366a
            int r6 = oc.c.r(r6)
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ogm.i.h(gim.c):java.lang.Object");
    }

    @Override // com.youTransactor.uCube.ITaskMonitor
    public void handleEvent(TaskEvent taskEvent, Object... objArr) {
        boolean z;
        c1 c1Var = (c1) this.f225222b;
        int i = z0.f318153a[taskEvent.ordinal()];
        if (i == 1) {
            c1Var.d = (ITask) objArr[0];
            c1Var.notifyMonitor(TaskEvent.FAILED, this);
            return;
        }
        if (i != 2) {
            return;
        }
        KeyStore keyStore = (KeyStore) objArr[0];
        c1Var.J = keyStore;
        defpackage.n nVar = defpackage.n.e;
        Context context = c1Var.K;
        nVar.getClass();
        try {
            FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("keystore_client.jks", 0);
            keyStore.store(fileOutputStreamOpenFileOutput, defpackage.n.f);
            fileOutputStreamOpenFileOutput.close();
            nVar.b(context);
            z = nVar.d;
        } catch (Exception e) {
            v1.b("Save dongle certificate fail ", e);
            z = false;
        }
        if (z) {
            new o1(c1Var.H).execute(new b1(c1Var, 0));
        } else {
            v1.b("init MDMManager with pem Error !", new Exception[0]);
            c1Var.notifyMonitor(TaskEvent.FAILED, this);
        }
    }

    public x i(trk.a assetType) {
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        lrk.e eVar = (lrk.e) this.f225222b;
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        return new x(nim.a.v(eVar.f199526a.f(new tk0.e(lrk.d.a(assetType))), new llh.j(eVar, assetType, 22)), this, assetType, 23);
    }

    public pg6.a j(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        HttpException httpException = throwable instanceof HttpException ? (HttpException) throwable : null;
        if (httpException != null) {
            r1 r1VarM = i26.l.m(httpException);
            String strString = r1VarM != null ? r1VarM.string() : null;
            if (strString != null) {
                try {
                    return (pg6.a) ((je0.d) this.f225222b).b(strString, pg6.a.class);
                } catch (Exception e) {
                    h0 h0Var = h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, e, h0Var);
                }
            }
        }
        return null;
    }

    @Override // zp0.c
    public void k(String text, String formattedValue, boolean z) {
        switch (this.f225221a) {
            case 6:
                Intrinsics.checkNotNullParameter(text, "extractedValue");
                Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
                com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a aVar = (com.revolut.feature.security_hub.impl.ui.wealth_protection_limit_change.a) ((WealthProtectionLimitChangeScreen) this.f225222b).e3();
                y yVar = aVar.D;
                Intrinsics.checkNotNullParameter(text, "text");
                WealthProtectionLimitChangeScreenContract$InputData wealthProtectionLimitChangeScreenContract$InputData = aVar.o;
                WealthProtectionFeatureState.Visible visible = wealthProtectionLimitChangeScreenContract$InputData.f85776b;
                xi0.b f85444a = visible.getF85444a();
                dj0.d d = wealthProtectionLimitChangeScreenContract$InputData.f85776b.getD();
                long jB = aVar.f85784q.b(text, f85444a.f306286a);
                dj0.d dVar = new dj0.d(jB, f85444a);
                boolean z3 = false;
                boolean z4 = ((visible instanceof WealthProtectionFeatureState.Visible.Enabled) && ((WealthProtectionFeatureState.Visible.Enabled) visible).f85447b.compareTo(dVar) == 0) ? false : true;
                Data data = ((pwc.g) ((j2) yVar.f22677a).getValue()).f240404h;
                StreetModeInfo streetModeInfo = data != null ? (StreetModeInfo) data.getContent() : null;
                boolean z6 = streetModeInfo != null && streetModeInfo.f85423a && jB < streetModeInfo.f85425c.f85426a;
                if (d != null && d.f115082a > jB) {
                    z3 = true;
                }
                aVar.H2(yVar, new f0(dVar, z4, z6, z3));
                break;
            default:
                Intrinsics.checkNotNullParameter(text, "extractedValue");
                Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
                ((CreditLimitCapChangeScreen) this.f225222b).P.k(formattedValue);
                break;
        }
    }

    public Object l(String str, kq8.g gVar, gim.c cVar) throws Throwable {
        wq8.c cVar2 = (wq8.c) this.f225222b;
        List listC = u.c(gVar);
        cVar2.getClass();
        p0 p0Var = p0.f264001a;
        Object objJ = e0.J(elm.f.f127540b, new wih.c(cVar2, listC, str, null, 9), cVar);
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        if (objJ != aVar) {
            objJ = Unit.f186387a;
        }
        return objJ == aVar ? objJ : Unit.f186387a;
    }

    @Override // fgm.p
    public void onError(Throwable th10) {
        ((fgm.b) this.f225222b).onError(th10);
    }

    @Override // fgm.p
    public void onSubscribe(Disposable disposable) {
        ((fgm.b) this.f225222b).onSubscribe(disposable);
    }

    @Override // fgm.p
    public void onSuccess(Object obj2) {
        ((fgm.b) this.f225222b).onComplete();
    }

    public /* synthetic */ i(Object obj2, int i) {
        this.f225221a = i;
        this.f225222b = obj2;
    }

    public i(pzc.g function) {
        this.f225221a = 10;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f225222b = function;
    }

    public i(qp5.x function) {
        this.f225221a = 14;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f225222b = function;
    }

    public i(ry7.j function) {
        this.f225221a = 27;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f225222b = function;
    }

    public i(ry7.j function, byte b4) {
        this.f225221a = 29;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f225222b = function;
    }

    public i(ComponentActivity activity) {
        this.f225221a = 11;
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.f225222b = activity;
    }

    public i(c0 countryProfilesManagementRepository) {
        this.f225221a = 16;
        Intrinsics.checkNotNullParameter(countryProfilesManagementRepository, "countryProfilesManagementRepository");
        this.f225222b = countryProfilesManagementRepository;
    }

    public i(rmh.q collectionsWidgetRedesignMapper) {
        this.f225221a = 18;
        Intrinsics.checkNotNullParameter(collectionsWidgetRedesignMapper, "collectionsWidgetRedesignMapper");
        this.f225222b = collectionsWidgetRedesignMapper;
    }

    public i(t repository) {
        this.f225221a = 28;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f225222b = repository;
    }

    public i(cl3.a contactsInteractor) {
        this.f225221a = 2;
        Intrinsics.checkNotNullParameter(contactsInteractor, "contactsInteractor");
        this.f225222b = contactsInteractor;
    }

    @Override // igm.c
    public Object apply(Object obj2, Object obj3) {
        ((igm.b) this.f225222b).accept(obj2, (fgm.c) obj3);
        return obj2;
    }

    public i(elb.b savingsFeatureInteractor) {
        this.f225221a = 22;
        Intrinsics.checkNotNullParameter(savingsFeatureInteractor, "savingsFeatureInteractor");
        this.f225222b = savingsFeatureInteractor;
    }

    public i(EsimGetPlanScreenContract$InputData inputData) {
        this.f225221a = 1;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f225222b = cim.b.a(new oij.c(this, inputData), new oij.c(inputData), new oh3.a(14));
    }

    public i(je0.d objectMapper) {
        this.f225221a = 5;
        Intrinsics.checkNotNullParameter(objectMapper, "objectMapper");
        this.f225222b = objectMapper;
    }

    public i(mde.e sharedHelpDestinationProvider) {
        this.f225221a = 24;
        Intrinsics.checkNotNullParameter(sharedHelpDestinationProvider, "sharedHelpDestinationProvider");
        this.f225222b = sharedHelpDestinationProvider;
    }

    public i(z2j.c beneficiaryAccountFieldTypeHelper, q4j.c nameElementsUtils) {
        this.f225221a = 8;
        Intrinsics.checkNotNullParameter(beneficiaryAccountFieldTypeHelper, "beneficiaryAccountFieldTypeHelper");
        Intrinsics.checkNotNullParameter(nameElementsUtils, "nameElementsUtils");
        this.f225222b = beneficiaryAccountFieldTypeHelper;
    }

    public i(kye.e passesRepository) {
        this.f225221a = 13;
        Intrinsics.checkNotNullParameter(passesRepository, "passesRepository");
        this.f225222b = passesRepository;
    }

    public i(b0 repository) {
        this.f225221a = 9;
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f225222b = repository;
    }

    public i(lrk.e displayAssetStatsRepository, rrk.b defaultAssetStatsProvider) {
        this.f225221a = 20;
        Intrinsics.checkNotNullParameter(displayAssetStatsRepository, "displayAssetStatsRepository");
        Intrinsics.checkNotNullParameter(defaultAssetStatsProvider, "defaultAssetStatsProvider");
        this.f225222b = displayAssetStatsRepository;
    }

    public i(l4i.a amountConverter, p2b.c cfdMarketPriceCalculator) {
        this.f225221a = 21;
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        Intrinsics.checkNotNullParameter(cfdMarketPriceCalculator, "cfdMarketPriceCalculator");
        this.f225222b = amountConverter;
    }

    public i(wq8.c juniorDetailedTransferSettingsRepository) {
        this.f225221a = 12;
        Intrinsics.checkNotNullParameter(juniorDetailedTransferSettingsRepository, "juniorDetailedTransferSettingsRepository");
        this.f225222b = juniorDetailedTransferSettingsRepository;
    }

    public i(xx9.p recentRecipientInteractor) {
        this.f225221a = 23;
        Intrinsics.checkNotNullParameter(recentRecipientInteractor, "recentRecipientInteractor");
        this.f225222b = recentRecipientInteractor;
    }

    public i(Json baseJson) {
        this.f225221a = 7;
        Intrinsics.checkNotNullParameter(baseJson, "baseJson");
        this.f225222b = ue0.e.b(baseJson, new q09.a(21));
    }

    public i(com.revolut.domain.interactors.transactions.a transactionsInteractor) {
        this.f225221a = 3;
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        this.f225222b = transactionsInteractor;
    }
}
