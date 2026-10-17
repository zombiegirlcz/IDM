package os2;

import android.os.MessageQueue;
import b8d.d0;
import com.revolut.core.ui_kit.delegates.ChatTravelPreviewDelegate;
import com.revolut.core.ui_kit.delegates.RoomPreviewCardDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.VaultsProgressDelegate;
import com.revolut.feature.retail.cfd.impl.screens.home.CfdTradingHomeScreen;
import com.revolut.feature.rev_points.impl.ui.opt_in.screen.RevPointsOptInScreenContract$InputData;
import com.revolut.feature.standingordertopup.impl.ui.screen.custom_amount.CustomOrderAmountScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.flows.stock_details.StockDetailsFlowController;
import efm.r;
import fjm.j;
import io.reactivex.rxjava3.core.ObservableSource;
import java.util.Objects;
import kfm.o;
import kfm.p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import oma.n;
import p9.f0;
import p9.g0;
import pjg.k;
import qp5.x;
import qxd.i;
import rd7.l;
import sgm.g4;
import skm.e0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class g implements o, f0, n2h.g, zp0.c, p, h5b.f, l, igm.o, y50.a, kfm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f229223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f229224b;

    public g(d0 function) {
        this.f229223a = 24;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f229224b = function;
    }

    @Override // n2h.g
    public r C0() {
        StockDetailsFlowController stockDetailsFlowController = (StockDetailsFlowController) this.f229224b;
        KProperty[] kPropertyArr = StockDetailsFlowController.R;
        return stockDetailsFlowController.d3().f218661b.d();
    }

    @Override // n2h.g
    public r G0() {
        StockDetailsFlowController stockDetailsFlowController = (StockDetailsFlowController) this.f229224b;
        KProperty[] kPropertyArr = StockDetailsFlowController.R;
        return stockDetailsFlowController.d3().f218661b.c();
    }

    @Override // rd7.l
    public Object a(rd7.h hVar, wtj.f fVar) {
        Object objInvoke = ((Function2) this.f229224b).invoke(hVar, fVar);
        return objInvoke == fim.a.COROUTINE_SUSPENDED ? objInvoke : Unit.f186387a;
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object obj2) {
        switch (this.f229223a) {
            case 0:
                return ((n) this.f229224b).invoke(obj2);
            case 1:
                return ((p2i.l) this.f229224b).invoke(obj2);
            case 5:
                return ((k) this.f229224b).invoke(obj2);
            case 7:
                return ((k) this.f229224b).invoke(obj2);
            case 16:
                return ((x) this.f229224b).invoke(obj2);
            case 20:
                return ((j) this.f229224b).invoke(obj2);
            case 21:
                Object objApply = ((igm.o) this.f229224b).apply(obj2);
                Objects.requireNonNull(objApply, "The itemDelay returned a null ObservableSource");
                return new g4((ObservableSource) objApply, 1L, 2).map(new kgm.e(obj2)).defaultIfEmpty(obj2);
            default:
                return ((d0) this.f229224b).invoke(obj2);
        }
    }

    @Override // rd7.l
    public boolean b() {
        return true;
    }

    @Override // p9.f0
    public Object e(p9.f fVar) {
        return ((g0) this.f229224b).d.Y(fVar);
    }

    @Override // h5b.f
    public VaultsProgressDelegate f() {
        return (VaultsProgressDelegate) this.f229224b;
    }

    @Override // y50.a
    public void h1(fx.d dVar, koi.c delegatesManager) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(delegatesManager, "delegatesManager");
        if (delegatesManager.c(RoomPreviewCardDelegate.class) == null) {
            delegatesManager.a(new RoomPreviewCardDelegate());
        }
        if (delegatesManager.c(SmallActionButtonDelegate.class) == null) {
            delegatesManager.a(new SmallActionButtonDelegate());
        }
        koi.k kVarC = delegatesManager.c(ChatTravelPreviewDelegate.class);
        if (kVarC == null) {
            kVarC = new ChatTravelPreviewDelegate();
            delegatesManager.a(kVarC);
        }
        e0.C(dVar.f138715a, null, null, new sx2.r(rd0.e.b(((ChatTravelPreviewDelegate) kVarC).k.f121375b), new t8g.c(this), null, 20), 3);
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zp0.c
    public void k(String extractedValue, String formattedValue, boolean z) {
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        qxd.k kVar = (qxd.k) ((CustomOrderAmountScreen) this.f229224b).N.getValue();
        kVar.getClass();
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        kVar.H2(kVar.f250084r, new i(kVar.f250083q.b(formattedValue, kVar.o.f88200a.f306286a), kVar, 0));
    }

    @Override // kfm.p
    public /* synthetic */ boolean test(Object obj2) {
        return ((Boolean) ((m2j.g) this.f229224b).invoke(obj2)).booleanValue();
    }

    public g(j function) {
        this.f229223a = 20;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f229224b = function;
    }

    public /* synthetic */ g(Object obj2, int i) {
        this.f229223a = i;
        this.f229224b = obj2;
    }

    public g(m2j.g function) {
        this.f229223a = 13;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f229224b = function;
    }

    public g(n function) {
        this.f229223a = 0;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f229224b = function;
    }

    public g(p2i.l function) {
        this.f229223a = 1;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f229224b = function;
    }

    public g(k function) {
        this.f229223a = 5;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f229224b = function;
    }

    public g(k function, byte b4) {
        this.f229223a = 7;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f229224b = function;
    }

    public g(x function) {
        this.f229223a = 16;
        Intrinsics.checkNotNullParameter(function, "function");
        this.f229224b = function;
    }

    public g(pki.a modelBinding) {
        this.f229223a = 4;
        Intrinsics.checkNotNullParameter(modelBinding, "modelBinding");
        this.f229224b = modelBinding;
    }

    public g(MessageQueue mainLooperMessageQueue) {
        this.f229223a = 9;
        Intrinsics.checkNotNullParameter(mainLooperMessageQueue, "mainLooperMessageQueue");
        this.f229224b = mainLooperMessageQueue;
    }

    @Override // kfm.c
    public Object apply(Object obj2, Object obj3) {
        ((kfm.g) this.f229224b).accept((efm.h) obj3);
        return obj2;
    }

    public g(sn.a collector) {
        this.f229223a = 23;
        Intrinsics.checkNotNullParameter(collector, "collector");
        this.f229224b = collector;
    }

    public g(xf1.f addNewProductTrackingRepository) {
        this.f229223a = 27;
        Intrinsics.checkNotNullParameter(addNewProductTrackingRepository, "addNewProductTrackingRepository");
        this.f229224b = addNewProductTrackingRepository;
    }

    public g(mq9.f groupsInteractor) {
        this.f229223a = 11;
        Intrinsics.checkNotNullParameter(groupsInteractor, "groupsInteractor");
        this.f229224b = groupsInteractor;
    }

    public g(gud.b buyDestinationProvider) {
        this.f229223a = 3;
        Intrinsics.checkNotNullParameter(buyDestinationProvider, "buyDestinationProvider");
        this.f229224b = buyDestinationProvider;
    }

    public g(of6.e brazilInboundOpenBankingRepository) {
        this.f229223a = 10;
        Intrinsics.checkNotNullParameter(brazilInboundOpenBankingRepository, "brazilInboundOpenBankingRepository");
        this.f229224b = brazilInboundOpenBankingRepository;
    }

    public g(com.revolut.feature.apm.core.ui.api.navigation.a apmAliasRegistrationExtension) {
        this.f229223a = 22;
        Intrinsics.checkNotNullParameter(apmAliasRegistrationExtension, "apmAliasRegistrationExtension");
        this.f229224b = apmAliasRegistrationExtension;
    }

    public g(opi.d expandableDialogView) {
        this.f229223a = 18;
        Intrinsics.checkNotNullParameter(expandableDialogView, "expandableDialogView");
        this.f229224b = expandableDialogView;
    }

    public g(x4l.c tradeDiscoveryCollectionsDod) {
        this.f229223a = 29;
        Intrinsics.checkNotNullParameter(tradeDiscoveryCollectionsDod, "tradeDiscoveryCollectionsDod");
        this.f229224b = tradeDiscoveryCollectionsDod;
    }

    public g(t8g.e model) {
        this.f229223a = 26;
        Intrinsics.checkNotNullParameter(model, "model");
        this.f229224b = model;
    }

    public g(k5i.c currencyRateMapper) {
        this.f229223a = 8;
        Intrinsics.checkNotNullParameter(currencyRateMapper, "currencyRateMapper");
        this.f229224b = currencyRateMapper;
    }

    public g(RevPointsOptInScreenContract$InputData inputData) {
        this.f229223a = 19;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f229224b = inputData;
    }

    public g(CfdTradingHomeScreen cfdTradingHomeScreen) {
        this.f229223a = 14;
        this.f229224b = cfdTradingHomeScreen.U;
    }
}
