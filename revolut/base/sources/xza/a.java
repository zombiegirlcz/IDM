package xza;

import aii.u;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.backend_flow.ui.screen.BackendScreenFragment;
import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit.views.ModalViewContainerBehavior;
import com.revolut.feature.blocked_merchants.impl.R$string;
import com.revolut.feature.exchange.models.ExchangeOrder;
import com.revolut.feature_crypto_order_details.api.navigation.CryptoOrderDetailsInputData;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import ip0.tm0;
import ip0.um0;
import ip0.x10;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import lk0.g;
import od0.h;
import od0.i;
import org.joda.time.DateTime;
import ozc.z;
import qc0.r0;
import qce.j;
import qce.k0;
import qce.o0;
import qce.q;
import rp0.t;
import rp0.y;
import y20.b1;
import y2e.m;
import y2i.b;
import yi5.l;
import ys5.f;
import yt0.i0;
import z63.k;
import z63.n;
import z63.p;
import zae.o;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class a implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f309911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f309912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f309913c;

    public /* synthetic */ a(Object obj2, Object obj3, int i) {
        this.f309911a = i;
        this.f309912b = obj2;
        this.f309913c = obj3;
    }

    @Override // kfm.a
    public final void run() {
        ArrayList arrayList;
        switch (this.f309911a) {
            case 0:
                ((e) this.f309912b).N((vza.a) this.f309913c);
                break;
            case 1:
                ((y15.d) this.f309912b).f310302a.c((FeatureCommand) this.f309913c);
                break;
            case 2:
                ((b1) this.f309912b).f310467t.remove((UUID) this.f309913c);
                break;
            case 3:
                ((m) this.f309912b).f310651c.onNext((g) this.f309913c);
                break;
            case 4:
                g6 g6Var = (g6) this.f309912b;
                y2i.c cVar = (y2i.c) this.f309913c;
                String str = g6Var.f54199a;
                b.C1728b c1728b = b.C1728b.f310665a;
                if (Intrinsics.f(str, "TAKE_PROFIT")) {
                    cVar.d.onNext(c1728b);
                } else {
                    String str2 = g6Var.f54199a;
                    b.a aVar = b.a.f310664a;
                    if (Intrinsics.f(str2, "STOP_LOSS")) {
                        cVar.d.onNext(aVar);
                    }
                }
                break;
            case 5:
                l lVar = (l) this.f309912b;
                lVar.f314257a.b(new dt5.b(lVar.d.a((ExchangeOrder.Active) this.f309913c, "", null)));
                break;
            case 6:
                ((l) this.f309912b).f314257a.b(new dt5.d((ParcelableDestination) this.f309913c));
                break;
            case 7:
                l lVar2 = (l) this.f309912b;
                CryptoOrderDetailsInputData.RecurringInputData inputData = (CryptoOrderDetailsInputData.RecurringInputData) this.f309913c;
                ss5.a aVar2 = lVar2.f314257a;
                Intrinsics.checkNotNullParameter(inputData, "inputData");
                Intrinsics.checkNotNullParameter("", "searchQuery");
                aVar2.b(new dt5.b(new sxh.a(inputData, "", null)));
                break;
            case 8:
                yoa.c cVar2 = (yoa.c) this.f309912b;
                soa.b bVar = (soa.b) this.f309913c;
                List list = (List) cVar2.f315643c.get("notification_settings_key");
                if (list != null) {
                    List<soa.b> list2 = list;
                    ArrayList arrayList2 = new ArrayList(w.t(list2, 10));
                    for (soa.b bVar2 : list2) {
                        if (bVar2.f264801a == bVar.f264801a) {
                            bVar2 = bVar;
                        }
                        arrayList2.add(bVar2);
                    }
                    cVar2.e.j(Unit.f186387a, arrayList2);
                }
                break;
            case 9:
                ((f) this.f309912b).f316404a.b((u) this.f309913c);
                break;
            case 10:
                ((ModalViewContainerBehavior) this.f309912b).f58780a.e(((i0) this.f309913c).f316565h);
                break;
            case 11:
                yv5.d dVar = (yv5.d) this.f309912b;
                xi0.b bVar3 = (xi0.b) this.f309913c;
                ue0.c cVar3 = dVar.f317122a;
                Type type = yv5.f.f317125a;
                Intrinsics.checkNotNullExpressionValue(type, "<get-RECENTLY_VIEWED_CURRENCY_TYPE>(...)");
                List list3 = (List) cVar3.v0(f0.f322471a, "RECENTLY_VIEWED_CURRENCY", type);
                String str3 = bVar3.f306286a;
                yv5.e eVar = new yv5.e(str3, DateTime.now().getMillis());
                List list4 = list3;
                if ((list4 instanceof Collection) && list4.isEmpty()) {
                    arrayList = d0.F0(eVar, list3);
                } else {
                    Iterator it8 = list4.iterator();
                    while (it8.hasNext()) {
                        if (Intrinsics.f(((yv5.e) it8.next()).getCode(), str3)) {
                            arrayList = new ArrayList(w.t(list4, 10));
                            for (Object obj2 : list4) {
                                if (Intrinsics.f(((yv5.e) obj2).getCode(), str3)) {
                                    obj2 = eVar;
                                }
                                arrayList.add(obj2);
                            }
                        }
                    }
                    arrayList = d0.F0(eVar, list3);
                }
                cVar3.G(arrayList, "RECENTLY_VIEWED_CURRENCY", kii.e.o(yv5.e.class, KTypeProjection.INSTANCE, List.class));
                break;
            case 12:
                z51.e eVar2 = (z51.e) this.f309912b;
                wi0.b bVar4 = (wi0.b) this.f309913c;
                ihm.f fVar = eVar2.f319417g;
                i.Companion.getClass();
                fVar.onNext(h.a(bVar4));
                break;
            case 13:
                k kVar = (k) this.f309912b;
                n nVar = (n) this.f309913c;
                p pVar = kVar.f319671h;
                z63.b pushTokenizeRequest = ((z63.m) nVar).f319680a;
                z63.d dVar2 = (z63.d) pVar;
                dVar2.getClass();
                Intrinsics.checkNotNullParameter(pushTokenizeRequest, "pushTokenizeRequest");
                dVar2.i.getClass();
                zri.a.e = true;
                ((li0.b) dVar2.k.getValue()).a(dVar2.f319658h, pushTokenizeRequest.a());
                break;
            case 14:
                o oVar = (o) this.f309912b;
                x10 x10Var = (x10) this.f309913c;
                j jVar = oVar.f320672j;
                Object obj3 = x10Var.f167081a.i;
                Intrinsics.i(obj3, "null cannot be cast to non-null type com.revolut.feature.blocked_merchants.api.model.TransactionBlockedMerchantInfo");
                kr2.h parcel = (kr2.h) obj3;
                o0 o0Var = (o0) jVar;
                qce.p pVar2 = o0Var.f244743h;
                Intrinsics.checkNotNullParameter(parcel, "blockedMerchantInfo");
                if (parcel instanceof kr2.f) {
                    oce.h hVar = o0Var.f244754x;
                    String str4 = ((kr2.f) parcel).f188649b;
                    qua.g gVar = ((sce.f) pVar2).f().f249332w;
                    efm.b bVarFlatMapCompletable = o70.a.f(oce.h.c(hVar, str4, gVar != null ? gVar.f249293b : null, parcel, null, 16)).flatMapCompletable(new qc7.d(22, new q(o0Var, 14)));
                    Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
                    k0 k0Var = k0.f244736a;
                    Function1 function1K = o0Var.K();
                    o9h.d dVar3 = new o9h.d(12, new r0(new BreadcrumbException(), 28));
                    bVarFlatMapCompletable.getClass();
                    pfm.a aVar3 = new pfm.a(bVarFlatMapCompletable, dVar3, 2);
                    Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
                    ofm.h hVarW = aVar3.w(new nw8.d(7, function1K), new z(18, k0Var));
                    Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
                    te0.w.j0(o0Var.f239031a, hVarW);
                    o0Var.C = hVarW;
                } else {
                    opi.d dVar4 = o0Var.f244749q;
                    mr2.b bVar5 = o0Var.v;
                    qua.g gVar2 = ((sce.f) pVar2).f().f249332w;
                    String str5 = gVar2 != null ? gVar2.f249293b : null;
                    ((wr2.a) bVar5).getClass();
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.merchants_block_details_unblock_merchant, null, null, 14);
                    int i = R$string.merchants_block_unblock_success_subtitle;
                    if (str5 == null) {
                        str5 = "";
                    }
                    String str6 = null;
                    ((opi.b) dVar4).Z(new y(zhm.u.c(new um0("unblock_merchant_dialog_action", new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.merchants_block_unblock_merchant_decline, null, null, 14), true, null, str6, 48), new tm0(LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.merchants_block_unblock_merchant_confirm, null, null, 14), true, str6, null, 48), (Object) parcel, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1008)), new t(textLocalisedClause, new TextLocalisedClause(i, zhm.u.c(str5), null, 12), null, 28), rp0.l.WINDOW, null, null, null, "SUBSCRIPTION_ACTIONS_DELEGATES_KEY", null, null, null, 3832));
                }
                break;
            case 15:
                zc0.i iVar = (zc0.i) this.f309912b;
                List list5 = (List) this.f309913c;
                Intrinsics.h(list5);
                ((BackendScreenFragment) iVar).setItems(list5);
                break;
            default:
                ((zk9.c) this.f309912b).f322924a.c((NaviCommand) this.f309913c);
                break;
        }
    }
}
