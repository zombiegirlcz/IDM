package m1i;

import android.bluetooth.BluetoothAdapter;
import android.net.Uri;
import android.os.Parcelable;
import androidx.sqlite.db.SimpleSQLiteQuery;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.backend_flow.ui.BackendFlowContract$Configuration;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.z2;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.acquiring.card_reader.data.api.domain.model.CardReaderDevice;
import com.revolut.feature.credit.application.models.plugins.PluginPayload;
import com.revolut.feature.credit.application.plugins.api.navigation.CreditApplicationKompotFeatureConfig;
import com.revolut.feature.credit.application.plugins.api.navigation.plugins.CreditApplicationPluginFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.backendflow.CreditBackendFlowContract$Configuration;
import com.revolut.feature.credit.application.plugins.impl.ui.co_borrower.consent.partner.manage_details.ManageCoBorrowerDetailsParcel;
import com.revolut.feature.crypto.receive_widget.impl.R$string;
import com.revolut.feature.payments.profile.api.navigation.PaymentProfileFeatureConfig;
import com.revolut.feature.payments.social.api.model.StartAction;
import com.revolut.feature.payments.social.api.navigation.SocialPaymentsFeatureConfig;
import com.revolut.feature.topup_screen.impl.destination.RevertTransferDestination;
import com.revolut.feature.transfer.core.models.TransferMoneyPocket;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.BrowserCommand;
import com.revolut.retail.core.navigation.ChooserActivityDestination;
import com.revolut.retail.core.navigation.ExplicitActivityDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.FinishCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import fa1.q;
import grl.k9;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mz3.e2;
import tfm.c4;
import tfm.f4;
import tfm.n4;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class t implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f201579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f201580b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f201581c;

    public /* synthetic */ t(Object obj2, Object obj3, int i) {
        this.f201579a = i;
        this.f201580b = obj2;
        this.f201581c = obj3;
    }

    private final Object a() {
        ArrayList arrayListF1;
        or2.g gVar = (or2.g) this.f201580b;
        kr2.e eVar = (kr2.e) this.f201581c;
        synchronized (gVar) {
            try {
                List listA = gVar.a();
                if (listA == null) {
                    listA = zhm.f0.f322471a;
                }
                rr2.a aVarC = or2.a.c(eVar);
                int size = listA.size();
                arrayListF1 = zhm.d0.f1(listA);
                Iterator it8 = arrayListF1.iterator();
                int i = 0;
                while (true) {
                    if (!it8.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (Intrinsics.f(((rr2.a) it8.next()).getId(), eVar.f188643a)) {
                        break;
                    }
                    i++;
                }
                if (i >= 0) {
                    arrayListF1.set(i, aVarC);
                } else {
                    arrayListF1.add(size, aVarC);
                }
                gVar.b(arrayListF1);
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return arrayListF1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r2v73, types: [kotlin.jvm.functions.Function0, kotlin.jvm.internal.q] */
    /* JADX WARN: Type inference failed for: r4v34, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.q] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        hs3.v vVar;
        Object next;
        efm.r rVar;
        Object objE;
        ArrayList arrayList;
        efm.b bVar;
        int i = 22;
        int i2 = 4;
        int i3 = 15;
        int i5 = 9;
        int i6 = 12;
        int i21 = 3;
        int i22 = 2;
        ew9.a aVar = 0;
        aVar = 0;
        aVar = 0;
        aVar = 0;
        int i32 = 0;
        switch (this.f201579a) {
            case 0:
                u uVar = (u) this.f201580b;
                uVar.f201584b.setLoading(((Data) this.f201581c).getLoading());
                ((k3l.d) uVar.f201585c).i.j(true);
                return Unit.f186387a;
            case 1:
                u uVar2 = (u) this.f201580b;
                StatusViewConfiguration.Success success = (StatusViewConfiguration.Success) this.f201581c;
                uVar2.f201584b.setLoading(false);
                ((k3l.d) uVar2.f201585c).O(com.revolut.retail.operation_status.modal_status.b.a(success));
                return Unit.f186387a;
            case 2:
                ma1.t tVar = (ma1.t) this.f201580b;
                CardReaderDevice cardReaderDevice = (CardReaderDevice) this.f201581c;
                BluetoothAdapter bluetoothAdapter = tVar.f203905b.f203875b;
                if (bluetoothAdapter == null || !bluetoothAdapter.isEnabled()) {
                    return efm.r.just(q.a.f133208a);
                }
                pfm.h hVar = new pfm.h(new la8.j(tVar, cardReaderDevice, i5), 2);
                sa1.q qVar = (sa1.q) tVar.f203904a;
                qVar.getClass();
                ihm.f fVar = new ihm.f();
                Intrinsics.checkNotNullExpressionValue(fVar, "create(...)");
                ma1.j jVar = qVar.f261238c;
                efm.r rVarConcatMapMaybe = jVar.f203885b.f261217a.concatMapMaybe(new m78.e(new m98.k(jVar, i2), i3));
                Intrinsics.checkNotNullExpressionValue(rVarConcatMapMaybe, "concatMapMaybe(...)");
                rVarConcatMapMaybe.subscribe(fVar);
                qVar.d.clear();
                efm.r rVarStartWith = efm.r.create(new defpackage.e1(qVar, fVar, i22)).mergeWith(fVar).startWith(q.d.f133211a);
                Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
                sfm.b bVarG = hVar.g(rVarStartWith);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                sfm.b bVar2 = new sfm.b(new ufm.c(new ma1.r(tVar, i32), i32), new kx7.o0(8), i22);
                Intrinsics.checkNotNullExpressionValue(bVar2, "flatMapObservable(...)");
                return bVarG.timeout(30L, timeUnit, bVar2).onErrorReturnItem(q.c.f133210a).doOnNext(new m78.e(new lul.d(tVar, cardReaderDevice, 27), i));
            case 3:
                return (Data) skm.e0.E(kotlin.coroutines.g.f186406a, new mhd.p0((mm1.c) this.f201580b, (mm1.d) this.f201581c, aVar, i6));
            case 4:
                mz3.j0 j0Var = (mz3.j0) this.f201580b;
                PluginPayload pluginPayload = (PluginPayload) this.f201581c;
                hz3.c cVar = j0Var.f210612a;
                CreditApplicationPluginFlowContract$Configuration pluginConfiguration = io3.h.R(pluginPayload, "CREDIT_QUESTIONNAIRE_FLOW");
                cVar.getClass();
                Intrinsics.checkNotNullParameter(pluginConfiguration, "pluginConfiguration");
                p54.g.Companion.getClass();
                ExplicitActivityDestination explicitActivityDestination = p54.b.f233004b;
                String str = pluginConfiguration.f66891a;
                k9 k9Var = k9.Credit;
                Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
                return new ActivityNavigateCommand(explicitActivityDestination, new CreditBackendFlowContract$Configuration((p54.c) null, new BackendFlowContract$Configuration(22, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), str), (ManageCoBorrowerDetailsParcel) null, pluginConfiguration, true, 9), null, null, 0, null, null, null, null, false, 1020);
            case 5:
                PluginPayload pluginPayload2 = (PluginPayload) this.f201580b;
                xs3.a aVar2 = (xs3.a) this.f201581c;
                CreditApplicationPluginFlowContract$Configuration creditApplicationPluginFlowContract$ConfigurationR = io3.h.R(pluginPayload2, "");
                int i33 = e2.f210595a[aVar2.ordinal()];
                if (i33 != 1) {
                    if (i33 == 2) {
                        return new FeatureCommand(new CreditApplicationKompotFeatureConfig.MortgageSignatureSigned(creditApplicationPluginFlowContract$ConfigurationR, null));
                    }
                    throw new NoWhenBranchMatchedException();
                }
                it3.d dVar = pluginPayload2.f66247a;
                hs3.v vVar2 = dVar.e;
                if (!(vVar2 instanceof hs3.i0)) {
                    List list = dVar.f;
                    if (list != null) {
                        Iterator it8 = list.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                next = it8.next();
                                if (next instanceof hs3.i0) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        vVar = (hs3.v) next;
                    } else {
                        vVar = null;
                    }
                } else {
                    if (vVar2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type com.revolut.feature.credit.application.models.metadata.MortgageSignatureMetadata");
                    }
                    vVar = (hs3.i0) vVar2;
                }
                if (vVar != null) {
                    return new FeatureCommand(new CreditApplicationKompotFeatureConfig.MortgageSignature(((hs3.i0) vVar).f154897a, creditApplicationPluginFlowContract$ConfigurationR, null));
                }
                throw new IllegalStateException(m72.b.r("Can't find metadata: ", kotlin.jvm.internal.o0.f186429a.b(hs3.i0.class)));
            case 6:
                return zi0.c.P(((n4d.r0) this.f201580b).f((n4d.h0) this.f201581c), false, null, 3);
            case 7:
                gpk.c cVar2 = (gpk.c) this.f201580b;
                fif.a aVar3 = (fif.a) this.f201581c;
                synchronized (((HashMap) cVar2.f145464b)) {
                    rVar = (efm.r) ((ne0.h) cVar2.f145465c).c(aVar3);
                    HashMap map = (HashMap) cVar2.f145464b;
                    Intrinsics.h(rVar);
                    efm.r rVarOnErrorResumeNext = rVar.onErrorResumeNext(new kgm.c(new ne0.e(new BreadcrumbException(), i32)));
                    Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
                    ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new lhi.b(9, ne0.f.f214387a), new lhi.b(9, ne0.g.f214388a));
                    Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
                    map.put(aVar3, cVarSubscribe);
                }
                return rVar;
            case 8:
                ne0.k kVar = (ne0.k) this.f201580b;
                Object obj2 = this.f201581c;
                synchronized (kVar.f214392c) {
                    try {
                        objE = (efm.r) kVar.f214392c.get(obj2);
                        if (objE == null) {
                            efm.r rVarSubscribeOn = (efm.r) kVar.f214390a.invoke(obj2);
                            efm.c0 c0Var = kVar.f214391b;
                            if (c0Var != null) {
                                rVarSubscribeOn = rVarSubscribeOn.subscribeOn(c0Var);
                            }
                            objE = rVarSubscribeOn.doFinally(new la8.j(kVar, obj2, 29)).replay(1).e();
                            Intrinsics.checkNotNullExpressionValue(objE, "refCount(...)");
                            kVar.f214392c.put(obj2, objE);
                        }
                    } catch (Throwable th10) {
                        throw th10;
                    }
                    break;
                }
                return objE;
            case 9:
                ne0.p pVar = (ne0.p) this.f201580b;
                Object obj3 = this.f201581c;
                synchronized (((HashMap) pVar.d)) {
                    try {
                        efm.r rVar2 = (efm.r) ((HashMap) pVar.d).get(obj3);
                        if (rVar2 != null) {
                            return rVar2;
                        }
                        efm.r rVarSubscribeOn2 = (efm.r) ((kotlin.jvm.internal.q) pVar.f214402c).invoke(obj3);
                        efm.c0 c0Var2 = (efm.c0) pVar.f214401b;
                        if (c0Var2 != null) {
                            rVarSubscribeOn2 = rVarSubscribeOn2.subscribeOn(c0Var2);
                        }
                        agm.a aVarReplay = rVarSubscribeOn2.doFinally(new ne0.o(pVar, obj3, i32)).replay(1);
                        long jF = kotlin.time.b.f(pVar.f214400a);
                        TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
                        aVarReplay.getClass();
                        efm.c0 c0Var3 = hhm.f.f152430b;
                        mfm.f.e(1, "subscriberCount");
                        mfm.f.b(timeUnit2, "unit is null");
                        mfm.f.b(c0Var3, "scheduler is null");
                        n4 n4Var = new n4(aVarReplay instanceof c4 ? new f4(((c4) aVarReplay).f270387g) : aVarReplay, jF, timeUnit2, c0Var3);
                        ((HashMap) pVar.d).put(obj3, n4Var);
                        return n4Var;
                    } catch (Throwable th11) {
                        throw th11;
                    }
                }
            case 10:
                BaseDraggableWidgetDelegate.a aVar4 = (BaseDraggableWidgetDelegate.a) this.f201580b;
                nj5.i iVar = (nj5.i) this.f201581c;
                nj5.b bVar3 = ((z2) aVar4).f55576c.f55214g;
                Intrinsics.i(bVar3, "null cannot be cast to non-null type com.revolut.feature.crypto.receive_widget.impl.ui.widget.ReceiveWidgetContentParcel");
                iVar.f216378b.a(null, bVar3.f216365a, false);
                if (!c70.a.g()) {
                    iVar.f216377a.b(new dt5.e(new mii.i("CLIPBOARD_LABEL_PAN", new TextLocalisedClause(R$string.crypto_home_widget_receive_crypto_address_copied, null, null, 14), null, null, 28)));
                }
                r70.c.b(iVar.d, 3);
                return Unit.f186387a;
            case 11:
                ((nve.c) this.f201580b).f219584a.c(vhi.c.c(new RevertTransferDestination((String) this.f201581c), yhi.b.SOLID, null, false, 12));
                return Boolean.TRUE;
            case 12:
                jf0.c cVar3 = (jf0.c) this.f201580b;
                nw9.d dVar2 = (nw9.d) this.f201581c;
                String strE = cVar3.e(2);
                int iHashCode = strE.hashCode();
                if (iHashCode != -265713450) {
                    if (iHashCode != 3108362) {
                        if (iHashCode == 1557721666 && strE.equals("details")) {
                            aVar = ew9.a.DETAILS;
                        }
                    } else if (strE.equals("edit")) {
                        aVar = ew9.a.DETAILS;
                    }
                } else if (strE.equals("username")) {
                    aVar = ew9.a.USERNAME;
                }
                dVar2.f219805a.c(new FeatureCommand(new PaymentProfileFeatureConfig(aVar)));
                return Boolean.TRUE;
            case 13:
                return ((wl3.h) ((nz9.e) this.f201580b).f221008a).g((String) this.f201581c);
            case 14:
                o29.u uVar3 = (o29.u) this.f201580b;
                String str2 = (String) this.f201581c;
                return efm.b.p(uVar3.f221588h.g(str2, false), uVar3.f221587g.g(str2, false), uVar3.i.g(str2, false), uVar3.f.g(str2, false));
            case 15:
                o55.f0 f0Var = (o55.f0) this.f201580b;
                Map map2 = (Map) this.f201581c;
                ue0.c cVar4 = f0Var.e;
                Type type = o55.g0.f222340a;
                Intrinsics.checkNotNullExpressionValue(type, "<get-LOAN_MANAGEMENT_LIST_TYPE>(...)");
                List<m55.f> list2 = (List) cVar4.T2("loans-management", type);
                if (list2 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    for (m55.f fVar2 : list2) {
                        String upperCase = fVar2.getCountryCode().toUpperCase(Locale.ROOT);
                        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                        p35.d0 d0Var = (p35.d0) map2.get(upperCase);
                        p35.e0 e0VarB = d0Var != null ? f55.c.b(fVar2, d0Var) : null;
                        if (e0VarB != null) {
                            arrayList2.add(e0VarB);
                        }
                    }
                    arrayList = arrayList2;
                } else {
                    arrayList = null;
                }
                return new Data(arrayList, null, false, 6, null);
            case 16:
                ((o7c.c) this.f201580b).f222751a.c((FeatureCommand) this.f201581c);
                return Boolean.TRUE;
            case 17:
                ((o7c.c) this.f201580b).f222751a.c(com.revolut.retail.core.navigation.a.c(new BrowserCommand((Uri) this.f201581c), new FinishCommand(null, null, null, 7)));
                return Boolean.TRUE;
            case 18:
                jf0.c cVar5 = (jf0.c) this.f201580b;
                o7c.m mVar = (o7c.m) this.f201581c;
                HashMap map3 = cVar5.d;
                String str3 = (String) map3.get("minBalance");
                long j2 = str3 != null ? Long.parseLong(str3) : 0L;
                String str4 = (String) map3.get("currency");
                if (str4 == null || kotlin.text.d0.W(str4)) {
                    return efm.d0.l(new IllegalArgumentException("Currency code cannot be null or empty"));
                }
                if (j2 <= 0) {
                    return efm.d0.l(new IllegalArgumentException("Amount must be positive"));
                }
                xi0.b.Companion.getClass();
                xi0.b bVarA = xi0.a.a(str4);
                return te0.w.o0(skm.p0.f264003c, new nya.i0(mVar, new dj0.d(j2, bVarA), aVar, i6));
            case 19:
                oee.v vVar3 = (oee.v) this.f201580b;
                String uri2 = (String) this.f201581c;
                nee.l lVar = (nee.l) vVar3.i;
                lVar.getClass();
                Intrinsics.checkNotNullParameter(uri2, "uri");
                v60.i iVar2 = lVar.f214500b;
                String str5 = kotlin.text.a0.H(uri2, "tel:", false) ? "android.intent.action.DIAL" : "android.intent.action.SENDTO";
                Uri uri3 = Uri.parse(uri2);
                m70.a.c(kotlin.jvm.internal.t0.f186434a);
                iVar2.onNext(new ActivityNavigateCommand(new ChooserActivityDestination(str5, uri3, "", 6), null, null, null, 0, null, null, null, null, false, 1022));
                return Unit.f186387a;
            case 20:
                return a();
            case 21:
                o97.y yVar = (o97.y) this.f201580b;
                oy9.j jVar2 = (oy9.j) this.f201581c;
                o97.e eVar = o97.e.f223096a;
                Object obj4 = yVar.f223136b;
                if (obj4 instanceof ly9.i) {
                    return new o97.l(new FeatureCommand(new SocialPaymentsFeatureConfig.PaymentsProfileChat((zm3.a) ((ly9.i) obj4).f200763a, (TransferMoneyPocket) null, (StartAction.ShowBottomDialog) null, false, 30)));
                }
                if (!(obj4 instanceof ly9.h)) {
                    return eVar;
                }
                jVar2.f230926c.onNext(((ly9.h) obj4).f200762a.f200763a.N0());
                return eVar;
            case 22:
                return ((NaviCommand) this.f201580b) instanceof FinishCommand ? new pfm.h(new oma.r((ozc.g0) this.f201581c, i21), 2) : pfm.m.f235744a;
            case 23:
                ozc.l0 l0Var = (ozc.l0) this.f201580b;
                ?? r2 = (kotlin.jvm.internal.q) this.f201581c;
                te0.e eVarI0 = ((ozc.s0) ((ozc.t) l0Var.f231293a).f231329b).I0();
                od0.i.Companion.getClass();
                return new rfm.e(te0.w.f(r2.invoke()), te0.w.z0(eVarI0, od0.i.f224256b), i32);
            case 24:
                ozc.l0 l0Var2 = (ozc.l0) this.f201580b;
                Function0 function0 = (Function0) this.f201581c;
                te0.e eVarI02 = ((ozc.s0) ((ozc.t) l0Var2.f231293a).f231329b).I0();
                od0.i.Companion.getClass();
                return new rfm.e(te0.w.f(function0.invoke()), te0.w.z0(eVarI02, od0.i.f224256b), i32);
            case 25:
                f0d.e eVar2 = (f0d.e) this.f201580b;
                ozc.l0 l0Var3 = (ozc.l0) this.f201581c;
                if (ozc.k0.f231290a[eVar2.ordinal()] != 1) {
                    return zhm.f0.f322471a;
                }
                gzc.n nVar = (gzc.n) ((ozc.t) l0Var3.f231293a).r3().g();
                if (nVar != null) {
                    return nVar.f148017g;
                }
                return null;
            case 26:
                pfk.x xVar = (pfk.x) this.f201580b;
                String str6 = (String) this.f201581c;
                ne0.j jVar3 = xVar.f235708b;
                if (str6 == null) {
                    str6 = "";
                }
                return jVar3.remove("KEY_BENEFITS_TO_LOSE_INFO".concat(str6));
            case 27:
                ((pgk.k) this.f201581c).f235994a.c((NaviCommand) ((Function0) this.f201580b).invoke());
                return Unit.f186387a;
            case 28:
                pr8.a aVar5 = (pr8.a) this.f201580b;
                ((zr8.a) this.f201581c).getClass();
                aVar5.getClass();
                m70.a.c(kotlin.jvm.internal.t0.f186434a);
                return aVar5.b(new SimpleSQLiteQuery("SELECT * FROM junior_transfer_request "));
            default:
                pri.g gVar = (pri.g) this.f201580b;
                mzb.e eVar3 = (mzb.e) this.f201581c;
                synchronized (gVar.f239037a) {
                    bVar = (efm.b) gVar.f239037a.computeIfAbsent("LAUNCH_JUNIOR_CARD_ORDER", new bpd.a(new pj3.b(eVar3, gVar, 19), i3));
                }
                return bVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ t(ozc.l0 l0Var, Function0 function0) {
        this.f201579a = 23;
        this.f201580b = l0Var;
        this.f201581c = (kotlin.jvm.internal.q) function0;
    }
}
