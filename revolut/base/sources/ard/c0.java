package ard;

import com.revolut.feature.backgroundpicker.api.model.BackgroundKey;
import com.revolut.feature.card_design.impl.card_design.CardDesignFlowContract$Step;
import com.revolut.feature.direct_deposit.impl.model.DepositAmount;
import com.revolut.feature.home_feed.api.models.HomeFeedWidgetContext;
import com.revolut.feature.revolutpay.api.shared.domain.models.paymentmethod.PaymentMethod;
import com.revolut.feature.security_hub.api.models.SecurityDelayInfo;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetDetails;
import com.revolut.feature.uipersonalisation.api.GlobalThemeDeclaration;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerRecipient;
import com.revolut.retail.feature.pending_payments.api.navigation.PendingPaymentContract$InputData;
import java.lang.reflect.Type;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kkf.a3;
import kkf.e7;
import kkf.i5;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import tof.f4;
import tof.p6;
import vkm.v1;

/* JADX INFO: loaded from: classes7.dex */
public final class c0 implements Flow {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f8645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8646c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ c0(Flow flow, Object obj2, Object obj3, Object obj4, int i) {
        this.f8644a = i;
        this.f8645b = flow;
        this.f8646c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public final Object collect(FlowCollector flowCollector, Continuation continuation) {
        switch (this.f8644a) {
            case 0:
                Object objCollect = ((vkm.d) this.f8645b).collect(new b0(flowCollector, (y) this.f8646c, (ZonedDateTime) this.d, (s0) this.e, 0), continuation);
                if (objCollect != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 1:
                Object objCollect2 = ((vkm.d) this.f8645b).collect(new b0(flowCollector, (CardDesignFlowContract$Step.Catalogue) this.f8646c, (ay2.h) this.d, (hha.d) this.e, 1), continuation);
                if (objCollect2 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 2:
                Object objCollect3 = ((uf0.b) this.f8645b).collect(new b0(flowCollector, (b96.h) this.f8646c, (DepositAmount) this.d, (String) this.e, 2), continuation);
                if (objCollect3 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 3:
                Object objCollect4 = ((hy1.b0) this.f8645b).collect(new b0(flowCollector, (bn2.p) this.f8646c, (BackgroundKey) this.d, (GlobalThemeDeclaration) this.e, 3), continuation);
                if (objCollect4 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 4:
                Object objCollect5 = ((vkm.y) this.f8645b).collect(new b0(flowCollector, (xnd.l) this.f8646c, (ynd.k) this.d, (xnd.h) this.e, 4), continuation);
                if (objCollect5 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 5:
                Object objCollect6 = ((v1) this.f8645b).collect(new b0(flowCollector, (r10.r) this.f8646c, (String) this.d, (SecurityDelayInfo) this.e, 5), continuation);
                if (objCollect6 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 6:
                Object objCollect7 = ((wkm.l) this.f8645b).collect(new b0(flowCollector, (sak.g) this.f8646c, (sak.a) this.d, (PendingPaymentContract$InputData.Apm) this.e, 7), continuation);
                if (objCollect7 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 7:
                Object objCollect8 = ((ag1.k) this.f8645b).collect(new b0(flowCollector, (d3d.g) this.f8646c, (z3d.c) this.d, (List) this.e, 8), continuation);
                if (objCollect8 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 8:
                Object objCollect9 = ((vkm.y) this.f8645b).collect(new ahe.f0(17, (r10.t) this.f8646c, (amd.a) this.d, (csd.a) this.e, flowCollector), continuation);
                if (objCollect9 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                Object objCollect10 = ((jhi.b) this.f8645b).collect(new ahe.f0(22, (fi6.h) this.f8646c, (List) this.d, (List) this.e, flowCollector), continuation);
                if (objCollect10 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 10:
                Object objCollect11 = this.f8645b.collect(new ahe.f0(flowCollector, (Set) this.f8646c, (io3.l) this.d, (ft4.i0) this.e), continuation);
                if (objCollect11 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 11:
                Object objCollect12 = ((jhi.b) this.f8645b).collect(new im9.k(flowCollector, (k7i.g) this.f8646c, (Set) this.d, (String) this.e), continuation);
                if (objCollect12 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 12:
                Object objCollect13 = ((j23.b) this.f8645b).collect(new b0(flowCollector, (a3) this.f8646c, (tof.a3) this.d, (f4) this.e, 13), continuation);
                if (objCollect13 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 13:
                Object objCollect14 = ((wkm.l) this.f8645b).collect(new b0(flowCollector, (i5) this.f8646c, (tof.a3) this.d, (p6) this.e, 14), continuation);
                if (objCollect14 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 14:
                Object objCollect15 = this.f8645b.collect(new b0(flowCollector, (e7) this.f8646c, (tof.a3) this.d, (Map) this.e, 15), continuation);
                if (objCollect15 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 15:
                Object objCollect16 = ((njj.n) this.f8645b).collect(new b0(flowCollector, (ns5.g) this.f8646c, (String) this.d, (dsh.e) this.e, 18), continuation);
                if (objCollect16 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 16:
                Object objCollect17 = ((vkm.q0) this.f8645b).collect(new b0(flowCollector, (nsh.o) this.f8646c, (WidgetContext) this.d, (dsh.s) this.e, 19), continuation);
                if (objCollect17 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 17:
                Object objCollect18 = this.f8645b.collect(new pc7.c(flowCollector, (pc7.d) this.f8646c, (String) this.d, (String) this.e), continuation);
                if (objCollect18 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 18:
                Object objCollect19 = ((v0b.b) this.f8645b).collect(new b0(flowCollector, (r9k.k) this.f8646c, (PeerToPeerTransferData) this.d, (PeerToPeerRecipient) this.e, 22), continuation);
                if (objCollect19 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 19:
                Object objCollect20 = ((rw4.b) this.f8645b).collect(new q3j.b(flowCollector, (rw4.h) this.f8646c, (HomeFeedWidgetContext.Collateral) this.d, (String) this.e), continuation);
                if (objCollect20 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 20:
                Object objCollect21 = ((vkm.d) this.f8645b).collect(new b0(flowCollector, (s7d.e) this.f8646c, (v30.j) this.d, (v30.s) this.e, 24), continuation);
                if (objCollect21 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 21:
                Object objCollect22 = ((akg.n) this.f8645b).collect(new b0(flowCollector, (com.revolut.feature.shared.help_centre.impl.extension.b) this.f8646c, (List) this.d, (Function1) this.e, 25), continuation);
                if (objCollect22 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 22:
                Object objCollect23 = ((v1) this.f8645b).collect(new b0(flowCollector, (tzl.l) this.f8646c, this.d, (tzl.e) this.e, 26), continuation);
                if (objCollect23 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 23:
                Object objCollect24 = this.f8645b.collect(new b0(flowCollector, (ue0.a) this.f8646c, (String) this.d, (Type) this.e, 27), continuation);
                if (objCollect24 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 24:
                Object objCollect25 = ((vkm.q0) this.f8645b).collect(new vkf.d(flowCollector, (wbg.s) this.f8646c, (PaymentMethod.Pocket) this.d, (ecg.b) this.e), continuation);
                if (objCollect25 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 25:
                Object objCollect26 = ((j23.b) this.f8645b).collect(new vkf.d(flowCollector, (wda.r) this.f8646c, (io3.d) this.d, (xi0.b) this.e), continuation);
                if (objCollect26 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 26:
                Object objCollect27 = ((vkm.y) this.f8645b).collect(new vkf.d(flowCollector, (PaymentMethod.Pocket) this.f8646c, (wdb.w) this.d, (dj0.d) this.e), continuation);
                if (objCollect27 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 27:
                Object objCollect28 = ((wa3.d) this.f8645b).collect(new b0(flowCollector, (ws5.h) this.f8646c, (String) this.d, (dsh.e) this.e, 29), continuation);
                if (objCollect28 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 28:
                Object objCollect29 = ((vkm.d) this.f8645b).collect(new yed.f0(0, (FavouritesAssetDetails) this.f8646c, (mgd.f) this.d, (String) this.e, flowCollector), continuation);
                if (objCollect29 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            default:
                Object objCollect30 = ((zfd.e) this.f8645b).collect(new yed.f0(flowCollector, (yh7.j) this.f8646c, (String) this.d, (dsh.e) this.e, 1), continuation);
                if (objCollect30 != fim.a.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
        }
        return Unit.f186387a;
    }
}
