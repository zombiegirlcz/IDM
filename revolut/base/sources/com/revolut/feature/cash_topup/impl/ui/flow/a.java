package com.revolut.feature.cash_topup.impl.ui.flow;

import aii.q;
import com.revolut.feature.cash_topup.api.models.CashTopUpLocationInfo;
import com.revolut.feature.cash_topup.impl.ui.amount.CashTopUpAmountScreen;
import com.revolut.feature.cash_topup.impl.ui.amount.CashTopUpAmountScreenContract$InputData;
import com.revolut.feature.cash_topup.impl.ui.details.CashTopUpDetailsScreen;
import com.revolut.feature.cash_topup.impl.ui.details.CashTopUpDetailsScreenContract$InputData;
import com.revolut.feature.cash_topup.impl.ui.entry.CashTopUpEntryScreen;
import com.revolut.feature.cash_topup.impl.ui.entry.CashTopUpEntryScreenContract$InputData;
import com.revolut.feature.cash_topup.impl.ui.flow.CashTopUpFlowContract$Step;
import com.revolut.feature.cash_topup.impl.ui.flow.barcode.CashTopUpBarcodeFlow;
import com.revolut.feature.cash_topup.impl.ui.flow.barcode.CashTopUpBarcodeFlowContract$InputData;
import com.revolut.feature.cash_topup.impl.ui.flow.barcode.CashTopUpBarcodeFlowContract$Step;
import com.revolut.feature.cash_topup.impl.ui.map.CashTopUpLocationsMapScreen;
import com.revolut.feature.cash_topup.impl.ui.map.CashTopUpLocationsMapScreenContract$InputData;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import dki.g;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import nb3.b;
import nd.o;
import oc3.i;
import oc3.j;
import oc3.l;
import oc3.m;
import rd0.d;
import ub3.k;
import vb3.h;
import vb3.l;
import xb3.c;
import zhm.h0;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends g implements xb3.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CashTopUpFlowContract$InputData f65639t;
    public final b u;
    public final dj3.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final o f65640w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final CashTopUpFlowContract$Step f65641x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final CashTopUpFlowContract$State f65642y;

    public a(CashTopUpFlowContract$InputData inputData, b cashTopUpInteractor, dj3.a chooseScreenCommandFactory, o chooserIntentNavigationCommandFactory) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cashTopUpInteractor, "cashTopUpInteractor");
        Intrinsics.checkNotNullParameter(chooseScreenCommandFactory, "chooseScreenCommandFactory");
        Intrinsics.checkNotNullParameter(chooserIntentNavigationCommandFactory, "chooserIntentNavigationCommandFactory");
        this.f65639t = inputData;
        this.u = cashTopUpInteractor;
        this.v = chooseScreenCommandFactory;
        this.f65640w = chooserIntentNavigationCommandFactory;
        this.f65641x = inputData.f65632b;
        this.f65642y = new CashTopUpFlowContract$State(null);
    }

    @Override // yji.l
    public final void O1() {
        this.u.f213980c.f172590c.i(-1);
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        k kVar;
        CashTopUpFlowContract$Step step = (CashTopUpFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        boolean zF = Intrinsics.f(step, CashTopUpFlowContract$Step.Entry.f65636a);
        CashTopUpFlowContract$InputData cashTopUpFlowContract$InputData = this.f65639t;
        if (zF) {
            CashTopUpEntryScreen cashTopUpEntryScreen = new CashTopUpEntryScreen(new CashTopUpEntryScreenContract$InputData(cashTopUpFlowContract$InputData.f65631a));
            final int i = 0;
            Function1 function1 = new Function1(this) { // from class: xb3.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.cash_topup.impl.ui.flow.a f303973b;

                {
                    this.f303973b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i2 = i;
                    CashTopUpFlowContract$Step.Barcode barcode = CashTopUpFlowContract$Step.Barcode.f65635a;
                    com.revolut.feature.cash_topup.impl.ui.flow.a aVar = this.f303973b;
                    switch (i2) {
                        case 0:
                            q it8 = (q) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            aVar.E2(CashTopUpFlowContract$Step.SelectLocation.f65638a, false, null, false);
                            return Unit.f186387a;
                        case 1:
                            m result = (m) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result instanceof j) {
                                aVar.E2(new CashTopUpFlowContract$Step.LocationDetails(((j) result).f224069a), true, null, false);
                            } else if (result instanceof oc3.k) {
                                CashTopUpLocationInfo cashTopUpLocationInfo = ((oc3.k) result).f224070a;
                                aVar.C1(new BridgeDestination(((ri3.a) aVar.v).a(cashTopUpLocationInfo.d, cashTopUpLocationInfo.e)));
                            } else if (result instanceof i) {
                                aVar.E2(new CashTopUpFlowContract$Step.Amount(((i) result).f224068a), true, null, false);
                            } else if (result instanceof m.a) {
                                aVar.E2(barcode, true, null, false);
                            } else {
                                if (!(result instanceof l)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(p.a.p("Unexpected output SelectLocationClicked(locationId=", ((l) result).f224071a, ")"));
                                h0 h0Var = h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                                d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                            }
                            return Unit.f186387a;
                        default:
                            vb3.l result2 = (vb3.l) obj2;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (result2 instanceof vb3.j) {
                                o oVar = aVar.f65640w;
                                String str = ((vb3.j) result2).f287385a;
                                oVar.getClass();
                                aVar.C1(new BridgeDestination(o.h(str)));
                            } else if (result2 instanceof vb3.i) {
                                CashTopUpLocationInfo cashTopUpLocationInfo2 = ((vb3.i) result2).f287384a;
                                aVar.C1(new BridgeDestination(((ri3.a) aVar.v).a(cashTopUpLocationInfo2.d, cashTopUpLocationInfo2.e)));
                            } else if (result2 instanceof h) {
                                aVar.E2(new CashTopUpFlowContract$Step.Amount(((h) result2).f287383a), true, null, false);
                            } else if (result2 instanceof l.a) {
                                aVar.E2(barcode, true, null, false);
                            } else {
                                if (!(result2 instanceof vb3.k)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                IllegalStateException illegalStateException = new IllegalStateException(p.a.p("received unexpected result SelectLocationClicked(locationId=", ((vb3.k) result2).f287386a, ")"));
                                h0 h0Var2 = h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList2 = d.f253311a;
                                d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var2);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            cashTopUpEntryScreen.H = function1;
            return cashTopUpEntryScreen;
        }
        if (Intrinsics.f(step, CashTopUpFlowContract$Step.SelectLocation.f65638a)) {
            CashTopUpLocationsMapScreen cashTopUpLocationsMapScreen = new CashTopUpLocationsMapScreen(new CashTopUpLocationsMapScreenContract$InputData(cashTopUpFlowContract$InputData.f65631a, k.BothAllowed));
            final int i2 = 1;
            Function1 function12 = new Function1(this) { // from class: xb3.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.cash_topup.impl.ui.flow.a f303973b;

                {
                    this.f303973b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    int i22 = i2;
                    CashTopUpFlowContract$Step.Barcode barcode = CashTopUpFlowContract$Step.Barcode.f65635a;
                    com.revolut.feature.cash_topup.impl.ui.flow.a aVar = this.f303973b;
                    switch (i22) {
                        case 0:
                            q it8 = (q) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            aVar.E2(CashTopUpFlowContract$Step.SelectLocation.f65638a, false, null, false);
                            return Unit.f186387a;
                        case 1:
                            m result = (m) obj2;
                            Intrinsics.checkNotNullParameter(result, "result");
                            if (result instanceof j) {
                                aVar.E2(new CashTopUpFlowContract$Step.LocationDetails(((j) result).f224069a), true, null, false);
                            } else if (result instanceof oc3.k) {
                                CashTopUpLocationInfo cashTopUpLocationInfo = ((oc3.k) result).f224070a;
                                aVar.C1(new BridgeDestination(((ri3.a) aVar.v).a(cashTopUpLocationInfo.d, cashTopUpLocationInfo.e)));
                            } else if (result instanceof i) {
                                aVar.E2(new CashTopUpFlowContract$Step.Amount(((i) result).f224068a), true, null, false);
                            } else if (result instanceof m.a) {
                                aVar.E2(barcode, true, null, false);
                            } else {
                                if (!(result instanceof oc3.l)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(p.a.p("Unexpected output SelectLocationClicked(locationId=", ((oc3.l) result).f224071a, ")"));
                                h0 h0Var = h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                                d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                            }
                            return Unit.f186387a;
                        default:
                            vb3.l result2 = (vb3.l) obj2;
                            Intrinsics.checkNotNullParameter(result2, "result");
                            if (result2 instanceof vb3.j) {
                                o oVar = aVar.f65640w;
                                String str = ((vb3.j) result2).f287385a;
                                oVar.getClass();
                                aVar.C1(new BridgeDestination(o.h(str)));
                            } else if (result2 instanceof vb3.i) {
                                CashTopUpLocationInfo cashTopUpLocationInfo2 = ((vb3.i) result2).f287384a;
                                aVar.C1(new BridgeDestination(((ri3.a) aVar.v).a(cashTopUpLocationInfo2.d, cashTopUpLocationInfo2.e)));
                            } else if (result2 instanceof h) {
                                aVar.E2(new CashTopUpFlowContract$Step.Amount(((h) result2).f287383a), true, null, false);
                            } else if (result2 instanceof l.a) {
                                aVar.E2(barcode, true, null, false);
                            } else {
                                if (!(result2 instanceof vb3.k)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                IllegalStateException illegalStateException = new IllegalStateException(p.a.p("received unexpected result SelectLocationClicked(locationId=", ((vb3.k) result2).f287386a, ")"));
                                h0 h0Var2 = h0.f322473a;
                                CopyOnWriteArrayList copyOnWriteArrayList2 = d.f253311a;
                                d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var2);
                            }
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function12, "<set-?>");
            cashTopUpLocationsMapScreen.H = function12;
            return cashTopUpLocationsMapScreen;
        }
        if (!(step instanceof CashTopUpFlowContract$Step.LocationDetails)) {
            if (step instanceof CashTopUpFlowContract$Step.Amount) {
                return new CashTopUpAmountScreen(new CashTopUpAmountScreenContract$InputData.CreateBarcodeData(((CashTopUpFlowContract$Step.Amount) step).f65634a));
            }
            if (step instanceof CashTopUpFlowContract$Step.Barcode) {
                return new CashTopUpBarcodeFlow(new CashTopUpBarcodeFlowContract$InputData((CashTopUpBarcodeFlowContract$Step.ModalStep) null));
            }
            throw new NoWhenBranchMatchedException();
        }
        CashTopUpLocationInfo cashTopUpLocationInfo = ((CashTopUpFlowContract$Step.LocationDetails) step).f65637a;
        int i3 = c.f303974a[cashTopUpFlowContract$InputData.f65631a.ordinal()];
        if (i3 == 1) {
            kVar = k.NoEuActions;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            kVar = k.BothAllowed;
        }
        CashTopUpDetailsScreen cashTopUpDetailsScreen = new CashTopUpDetailsScreen(new CashTopUpDetailsScreenContract$InputData(cashTopUpLocationInfo, kVar));
        final int i5 = 2;
        Function1 function13 = new Function1(this) { // from class: xb3.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.cash_topup.impl.ui.flow.a f303973b;

            {
                this.f303973b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i22 = i5;
                CashTopUpFlowContract$Step.Barcode barcode = CashTopUpFlowContract$Step.Barcode.f65635a;
                com.revolut.feature.cash_topup.impl.ui.flow.a aVar = this.f303973b;
                switch (i22) {
                    case 0:
                        q it8 = (q) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        aVar.E2(CashTopUpFlowContract$Step.SelectLocation.f65638a, false, null, false);
                        return Unit.f186387a;
                    case 1:
                        m result = (m) obj2;
                        Intrinsics.checkNotNullParameter(result, "result");
                        if (result instanceof j) {
                            aVar.E2(new CashTopUpFlowContract$Step.LocationDetails(((j) result).f224069a), true, null, false);
                        } else if (result instanceof oc3.k) {
                            CashTopUpLocationInfo cashTopUpLocationInfo2 = ((oc3.k) result).f224070a;
                            aVar.C1(new BridgeDestination(((ri3.a) aVar.v).a(cashTopUpLocationInfo2.d, cashTopUpLocationInfo2.e)));
                        } else if (result instanceof i) {
                            aVar.E2(new CashTopUpFlowContract$Step.Amount(((i) result).f224068a), true, null, false);
                        } else if (result instanceof m.a) {
                            aVar.E2(barcode, true, null, false);
                        } else {
                            if (!(result instanceof oc3.l)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(p.a.p("Unexpected output SelectLocationClicked(locationId=", ((oc3.l) result).f224071a, ")"));
                            h0 h0Var = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
                            d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
                        }
                        return Unit.f186387a;
                    default:
                        vb3.l result2 = (vb3.l) obj2;
                        Intrinsics.checkNotNullParameter(result2, "result");
                        if (result2 instanceof vb3.j) {
                            o oVar = aVar.f65640w;
                            String str = ((vb3.j) result2).f287385a;
                            oVar.getClass();
                            aVar.C1(new BridgeDestination(o.h(str)));
                        } else if (result2 instanceof vb3.i) {
                            CashTopUpLocationInfo cashTopUpLocationInfo22 = ((vb3.i) result2).f287384a;
                            aVar.C1(new BridgeDestination(((ri3.a) aVar.v).a(cashTopUpLocationInfo22.d, cashTopUpLocationInfo22.e)));
                        } else if (result2 instanceof h) {
                            aVar.E2(new CashTopUpFlowContract$Step.Amount(((h) result2).f287383a), true, null, false);
                        } else if (result2 instanceof l.a) {
                            aVar.E2(barcode, true, null, false);
                        } else {
                            if (!(result2 instanceof vb3.k)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            IllegalStateException illegalStateException = new IllegalStateException(p.a.p("received unexpected result SelectLocationClicked(locationId=", ((vb3.k) result2).f287386a, ")"));
                            h0 h0Var2 = h0.f322473a;
                            CopyOnWriteArrayList copyOnWriteArrayList2 = d.f253311a;
                            d.a(rd0.c.ERROR, null, null, illegalStateException, h0Var2);
                        }
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(function13, "<set-?>");
        cashTopUpDetailsScreen.H = function13;
        return cashTopUpDetailsScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.f65642y;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f65641x;
    }
}
