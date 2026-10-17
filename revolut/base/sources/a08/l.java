package a08;

import android.app.Activity;
import androidx.room.util.DBUtil;
import au6.f1;
import au6.k1;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.wallet.AutoResolveHelper;
import com.google.android.gms.wallet.PaymentData;
import com.google.android.gms.wallet.PaymentDataRequest;
import com.google.android.gms.wallet.PaymentsClient;
import com.revolut.core.ui_kit.delegates.vh;
import com.revolut.domain.models.topup.AutoTopUpState;
import com.revolut.feature.external_accounts.api.navigation.CreateMandateDestination;
import com.revolut.feature.external_accounts.api.navigation.InstitutionData;
import com.revolut.feature.external_accounts.impl.destinations.CreateMandateResultDestination;
import com.revolut.feature.kyc.api.flow.input_document_id.InputDocumentIdFlowFeatureConfig;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.payments.groups.api.models.PaymentGroup;
import com.revolut.feature.retail.cobranded_cards.api.navigation.CobrandedCardsFeatureConfig;
import com.revolut.feature.rev_points.giftcards.api.navigation.RevPointsGiftcardsDestination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.DummyCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import cu8.n1;
import cu8.o1;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f194c;

    public /* synthetic */ l(Object obj2, Object obj3, int i) {
        this.f192a = i;
        this.f193b = obj2;
        this.f194c = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v6, types: [zhm.f0] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kfm.a
    public final void run() {
        Object arrayList;
        int i = 23;
        switch (this.f192a) {
            case 0:
                ((opi.b) ((c0) this.f193b).o).Z((rp0.y) this.f194c);
                break;
            case 1:
                a38.a aVar = (a38.a) this.f193b;
                vh clickData = (vh) this.f194c;
                fle.d dVar = (fle.d) aVar.f1077b;
                dVar.getClass();
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                dVar.f135950a.b3(clickData);
                break;
            case 2:
                a76.e eVar = (a76.e) this.f193b;
                lk0.g gVar = (lk0.g) this.f194c;
                eVar.f1774b = gVar;
                eVar.f1775c.onNext(gVar);
                break;
            case 3:
                ((a80.h) this.f193b).f((List) this.f194c);
                break;
            case 4:
                ((cqi.j) ((an.q) this.f193b).f6512j).R(((an.c) ((an.d) this.f194c)).f6502a);
                break;
            case 5:
                ((ard.s) this.f193b).invoke((lk0.g) this.f194c);
                break;
            case 6:
                ((atg.h) this.f193b).f9053g.h((String) this.f194c);
                break;
            case 7:
                ((k1) this.f193b).f9550h.h(new f1((String) this.f194c));
                break;
            case 8:
                be6.j jVar = (be6.j) this.f193b;
                String str = (String) this.f194c;
                ue0.c cVar = jVar.f14689c;
                if (str == null) {
                    str = "";
                }
                z9h.n.l(String.class, cVar, "last_auth_code", str);
                break;
            case 9:
                ((c3e.c) this.f193b).f20940b.onNext((lk0.g) this.f194c);
                break;
            case 10:
                c86.g gVar2 = (c86.g) this.f193b;
                NaviCommand naviCommand = (NaviCommand) this.f194c;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.b(rd0.c.WARNING, "DeviceLockProtectionActivityDelegate", "Navigate " + naviCommand, null, null, 16);
                sri.m mVar = gVar2.k;
                Intrinsics.h(naviCommand);
                mVar.c(naviCommand);
                break;
            case 11:
                ((cle.j) this.f193b).A2(new BridgeDestination((NaviCommand) this.f194c));
                break;
            case 12:
                ((cu8.a) this.f193b).f108818b.c(((ks8.i) ((ks8.j) this.f194c)).f189312a);
                break;
            case 13:
                zt8.a aVar2 = (zt8.a) this.f193b;
                com.revolut.feature.kyc.impl.b bVar = (com.revolut.feature.kyc.impl.b) this.f194c;
                od0.i iVar = aVar2.f325089a;
                if (iVar.d()) {
                    ((n1) bVar.e).I0().set(iVar.c());
                    ((n1) bVar.e).G0().set(iVar.c());
                    bVar.z3();
                } else {
                    bVar.o3();
                }
                break;
            case 14:
                com.revolut.feature.kyc.impl.f fVar = (com.revolut.feature.kyc.impl.f) this.f193b;
                my8.l selectedDocument = (my8.l) this.f194c;
                ihm.j jVar2 = fVar.k;
                cu8.f1 f1Var = fVar.f77670g;
                wi0.b citizenship = (wi0.b) ((n1) fVar.f77668b).G0().get();
                ((o1) f1Var).getClass();
                Intrinsics.checkNotNullParameter(citizenship, "citizenship");
                Intrinsics.checkNotNullParameter(selectedDocument, "selectedDocument");
                jVar2.onNext(new FeatureCommand(new InputDocumentIdFlowFeatureConfig(9010, citizenship, selectedDocument)));
                break;
            case 15:
                ((com.revolut.feature.kyc.impl.f) this.f193b).f77673l.onNext((FeatureCommand) this.f194c);
                break;
            case 16:
                com.revolut.feature.kyc.impl.f fVar2 = (com.revolut.feature.kyc.impl.f) this.f193b;
                wi0.b selectedCitizenship = (wi0.b) this.f194c;
                wi0.b residencyCountry = (wi0.b) ((n1) fVar2.f77668b).B0().get();
                ihm.j jVar3 = fVar2.k;
                cu8.f1 f1Var2 = fVar2.f77670g;
                Intrinsics.h(selectedCitizenship);
                o1 o1Var = (o1) f1Var2;
                o1Var.getClass();
                Intrinsics.checkNotNullParameter(selectedCitizenship, "suggestedCitizenship");
                Intrinsics.checkNotNullParameter(residencyCountry, "residencyCountry");
                Intrinsics.checkNotNullParameter(selectedCitizenship, "selectedCitizenship");
                jVar3.onNext(o1Var.a(selectedCitizenship, residencyCountry, selectedCitizenship, true));
                break;
            case 17:
                d0f.a aVar3 = (d0f.a) this.f193b;
                String json = (String) this.f194c;
                Intrinsics.h(json);
                Activity activity = (Activity) aVar3.d.get();
                if (activity != null) {
                    Intrinsics.checkNotNullParameter(json, "json");
                    PaymentDataRequest internal = PaymentDataRequest.fromJson(json);
                    Intrinsics.checkNotNullExpressionValue(internal, "fromJson(...)");
                    Intrinsics.checkNotNullParameter(internal, "<this>");
                    Intrinsics.checkNotNullParameter(internal, "internal");
                    nd.m request = new nd.m(1);
                    ni0.j jVar4 = (ni0.j) aVar3.f110357c.getValue();
                    jVar4.getClass();
                    Intrinsics.checkNotNullParameter(request, "request");
                    PaymentsClient paymentsClient = jVar4.f215616a;
                    Intrinsics.checkNotNullParameter(request, "<this>");
                    Task<PaymentData> taskLoadPaymentData = paymentsClient.loadPaymentData(internal);
                    Intrinsics.checkNotNullExpressionValue(taskLoadPaymentData, "loadPaymentData(...)");
                    Intrinsics.checkNotNullParameter(taskLoadPaymentData, "<this>");
                    by5.a task = new by5.a(taskLoadPaymentData);
                    Intrinsics.checkNotNullParameter(task, "task");
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    Intrinsics.checkNotNullParameter(task, "<this>");
                    AutoResolveHelper.resolveTask(taskLoadPaymentData, activity, 7);
                } else {
                    IllegalStateException illegalStateException = new IllegalStateException("Activity should not be null - Google Pay dialog will not be shown");
                    zhm.h0 h0Var = zhm.h0.f322473a;
                    CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                    rd0.d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var);
                }
                break;
            case 18:
                ((d8b.g) this.f193b).f112197b.a((CobrandedCardsFeatureConfig.PlanHubDestination) this.f194c);
                break;
            case 19:
                dak.b bVar2 = (dak.b) this.f193b;
                z95.b bVar3 = (z95.b) this.f194c;
                ue0.c cVar2 = bVar2.f112544b;
                Lazy lazy = z9k.a.f320511a;
                Intrinsics.checkNotNullParameter(bVar3, "<this>");
                Intrinsics.checkNotNullParameter(bVar3, "<this>");
                String str2 = bVar3.f320309a;
                Object value = z9k.a.f320511a.getValue();
                Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
                String str3 = ((DateTimeFormatter) value).format(bVar3.f320310b);
                Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                aak.b bVar4 = new aak.b(str2, str3, bVar3.f320311c, bVar3.d.name());
                Intrinsics.checkNotNullParameter(bVar4, "<this>");
                cVar2.G(new cak.a(bVar4.getName(), bVar4.getExpirationDate(), bVar4.getApplicationId(), bVar4.getFlowType()), "pcw_user_session", wim.z.d(kotlin.jvm.internal.o0.b(cak.a.class)));
                break;
            case 20:
                ((dxb.d) this.f193b).f120935b.a((RevPointsGiftcardsDestination) this.f194c);
                break;
            case 21:
                e31.d dVar2 = (e31.d) this.f193b;
                AutoTopUpState autoTopUpState = (AutoTopUpState) this.f194c;
                dVar2.e.j(autoTopUpState.f60424g, autoTopUpState);
                break;
            case 22:
                ((w4l.f) ((r10.q) this.f193b).d).h((String) this.f194c);
                break;
            case 23:
                ((ed2.a) this.f193b).f124911a.c((FeatureCommand) this.f194c);
                break;
            case 24:
                ((eh6.a) this.f193b).f125739a.c(new CompositeCommand(zhm.v.k(new FeatureCommand(new MainScreenFeatureConfig.JustShow(s49.a.SINGLE_TOP)), zh9.u0.f(new CreateMandateDestination(new InstitutionData.InstitutionId(((jf0.c) this.f194c).e(3)), null)))));
                break;
            case 25:
                eh6.c cVar3 = (eh6.c) this.f193b;
                jf0.c cVar4 = (jf0.c) this.f194c;
                sri.m mVar2 = cVar3.f125740a;
                CreateMandateResultDestination createMandateResultDestinationB = eh6.c.b(cVar4);
                mVar2.c(createMandateResultDestinationB != null ? zh9.u0.f(createMandateResultDestinationB) : DummyCommand.f98635a);
                break;
            case 26:
                DBUtil.performBlocking(((ej9.p) this.f193b).f126822b.f144100a, false, true, new g58.h((String) this.f194c, i));
                break;
            case 27:
                IllegalStateException illegalStateException2 = new IllegalStateException("More than one handler found for action " + ((mm.a) this.f193b) + ": " + ((ArrayList) this.f194c));
                zhm.h0 h0Var2 = zhm.h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, illegalStateException2, h0Var2);
                break;
            case 28:
                er9.x xVar = (er9.x) this.f193b;
                String str4 = (String) this.f194c;
                xVar.f128605p.d = true;
                w4l.f fVar3 = xVar.f128606q;
                DBUtil.performBlocking(xVar.f128596a.f316005a, false, true, new y9d.c(str4, 20));
                DBUtil.performBlocking(xVar.f128597b.f316016a, false, true, new y9d.c(str4, i));
                ne0.j jVar5 = xVar.f128600h;
                List list = (List) jVar5.get("CACHE_KEY_GROUPS");
                if (list != null) {
                    arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        if (!Intrinsics.f(((PaymentGroup) obj2).f79285a, str4)) {
                            arrayList.add(obj2);
                        }
                    }
                } else {
                    arrayList = zhm.f0.f322471a;
                }
                jVar5.f("CACHE_KEY_GROUPS", arrayList);
                fVar3.c(null, (1 & 2) == 0, new eqd.h(12));
                xVar.f128608s.h(str4);
                xVar.f128609t.h(str4);
                xVar.u.h(str4);
                break;
            default:
                ((ezi.d) this.f193b).f130945b.a((KompotDestination) this.f194c);
                break;
        }
    }
}
