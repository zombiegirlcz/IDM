package com.revolut.feature.apm.bizum.impl.ui;

import aii.q;
import c12.j;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.bizum.api.R$string;
import com.revolut.feature.apm.bizum.api.navigation.BizumFlowInputData;
import com.revolut.feature.apm.bizum.impl.ui.BizumFlowContract$Step;
import com.revolut.feature.apm.bizum.impl.ui.area.homescreen.BizumAreaHomescreenScreen;
import com.revolut.feature.apm.bizum.impl.ui.registration.BizumRegistrationFlow;
import com.revolut.feature.apm.bizum.impl.ui.registration.BizumRegistrationFlowContract$InputData;
import com.revolut.feature.apm.core.models.bizum.BizumRegistrationStatus;
import com.revolut.kompot.navigable.flow.EmptyFlowState;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.kompot.navigable.vc.ViewController;
import d12.c;
import d12.d;
import dki.g;
import hrf.f;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ns1.b;
import ns1.e;
import pak.h;
import qr0.i;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends g implements qs1.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final BizumFlowInputData f61569t;
    public final b u;
    public final d12.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final h f61570w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final i f61571x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final BizumFlowContract$Step.Loading f61572y;
    public final EmptyFlowState z;

    public a(BizumFlowInputData flowInputData, b errorHandlerExtension, d12.b entryExtension, h newContactNavigationProvider, i recipientListNavigationProvider) {
        Intrinsics.checkNotNullParameter(flowInputData, "flowInputData");
        Intrinsics.checkNotNullParameter(errorHandlerExtension, "errorHandlerExtension");
        Intrinsics.checkNotNullParameter(entryExtension, "entryExtension");
        Intrinsics.checkNotNullParameter(newContactNavigationProvider, "newContactNavigationProvider");
        Intrinsics.checkNotNullParameter(recipientListNavigationProvider, "recipientListNavigationProvider");
        this.f61569t = flowInputData;
        this.u = errorHandlerExtension;
        this.v = entryExtension;
        this.f61570w = newContactNavigationProvider;
        this.f61571x = recipientListNavigationProvider;
        this.f61572y = BizumFlowContract$Step.Loading.f61565a;
        this.z = EmptyFlowState.f98428a;
    }

    public static BizumFlowContract$Step O2(BizumFlowInputData.StartType startType) {
        if (Intrinsics.f(startType, BizumFlowInputData.StartType.Area.f61557a)) {
            return BizumFlowContract$Step.Area.f61564a;
        }
        if (Intrinsics.f(startType, BizumFlowInputData.StartType.NewContact.f61558a)) {
            return BizumFlowContract$Step.NewContact.f61566a;
        }
        if (Intrinsics.f(startType, BizumFlowInputData.StartType.RecipientList.f61559a)) {
            return BizumFlowContract$Step.RecipientList.f61567a;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (((e) this.u).b3(throwable)) {
            return true;
        }
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return false;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        BizumFlowContract$Step step = (BizumFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof BizumFlowContract$Step.Loading) {
            ViewController viewControllerE1 = e1(new d12.a(new c(new TextLocalisedClause(R$string.bizum_entry, null, null, 14)), this.v));
            final int i = 0;
            Function1 block = new Function1(this) { // from class: qs1.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.apm.bizum.impl.ui.a f248743b;

                {
                    this.f248743b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            d outputData = (d) obj2;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            BizumRegistrationStatus bizumRegistrationStatus = ((rs1.a) outputData).f256927a;
                            boolean z = bizumRegistrationStatus instanceof BizumRegistrationStatus.Active;
                            com.revolut.feature.apm.bizum.impl.ui.a aVar = this.f248743b;
                            if (z) {
                                aVar.E2(com.revolut.feature.apm.bizum.impl.ui.a.O2(aVar.f61569t.f61556a), false, null, false);
                            } else {
                                if (!(bizumRegistrationStatus instanceof BizumRegistrationStatus.NotRegistered)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar.E2(new BizumFlowContract$Step.Registration((BizumRegistrationStatus.NotRegistered) bizumRegistrationStatus), false, null, false);
                            }
                            return Unit.f186387a;
                        case 1:
                            ws1.e outputData2 = (ws1.e) obj2;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            boolean zF = Intrinsics.f(outputData2, ws1.b.f299642a);
                            com.revolut.feature.apm.bizum.impl.ui.a aVar2 = this.f248743b;
                            if (zF || Intrinsics.f(outputData2, ws1.c.f299643a)) {
                                aVar2.I2();
                            } else {
                                if (!Intrinsics.f(outputData2, ws1.d.f299644a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.E2(com.revolut.feature.apm.bizum.impl.ui.a.O2(aVar2.f61569t.f61556a), false, null, false);
                            }
                            return Unit.f186387a;
                        case 2:
                            j it8 = (j) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            this.f248743b.I2();
                            return Unit.f186387a;
                        default:
                            q it9 = (q) obj2;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            this.f248743b.I2();
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block, "block");
            viewControllerE1.H = block;
            return viewControllerE1;
        }
        if (step instanceof BizumFlowContract$Step.Registration) {
            BizumRegistrationFlow bizumRegistrationFlow = new BizumRegistrationFlow(new BizumRegistrationFlowContract$InputData(((BizumFlowContract$Step.Registration) step).f61568a));
            final int i2 = 1;
            Function1 function1 = new Function1(this) { // from class: qs1.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.apm.bizum.impl.ui.a f248743b;

                {
                    this.f248743b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i2) {
                        case 0:
                            d outputData = (d) obj2;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            BizumRegistrationStatus bizumRegistrationStatus = ((rs1.a) outputData).f256927a;
                            boolean z = bizumRegistrationStatus instanceof BizumRegistrationStatus.Active;
                            com.revolut.feature.apm.bizum.impl.ui.a aVar = this.f248743b;
                            if (z) {
                                aVar.E2(com.revolut.feature.apm.bizum.impl.ui.a.O2(aVar.f61569t.f61556a), false, null, false);
                            } else {
                                if (!(bizumRegistrationStatus instanceof BizumRegistrationStatus.NotRegistered)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar.E2(new BizumFlowContract$Step.Registration((BizumRegistrationStatus.NotRegistered) bizumRegistrationStatus), false, null, false);
                            }
                            return Unit.f186387a;
                        case 1:
                            ws1.e outputData2 = (ws1.e) obj2;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            boolean zF = Intrinsics.f(outputData2, ws1.b.f299642a);
                            com.revolut.feature.apm.bizum.impl.ui.a aVar2 = this.f248743b;
                            if (zF || Intrinsics.f(outputData2, ws1.c.f299643a)) {
                                aVar2.I2();
                            } else {
                                if (!Intrinsics.f(outputData2, ws1.d.f299644a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.E2(com.revolut.feature.apm.bizum.impl.ui.a.O2(aVar2.f61569t.f61556a), false, null, false);
                            }
                            return Unit.f186387a;
                        case 2:
                            j it8 = (j) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            this.f248743b.I2();
                            return Unit.f186387a;
                        default:
                            q it9 = (q) obj2;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            this.f248743b.I2();
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            bizumRegistrationFlow.J = function1;
            return bizumRegistrationFlow;
        }
        if (step instanceof BizumFlowContract$Step.Area) {
            return new BizumAreaHomescreenScreen();
        }
        if (step instanceof BizumFlowContract$Step.NewContact) {
            ViewController viewControllerE12 = e1(this.f61570w.d(f.OUTGOING, null));
            final int i3 = 2;
            Function1 block2 = new Function1(this) { // from class: qs1.b

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.apm.bizum.impl.ui.a f248743b;

                {
                    this.f248743b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i3) {
                        case 0:
                            d outputData = (d) obj2;
                            Intrinsics.checkNotNullParameter(outputData, "outputData");
                            BizumRegistrationStatus bizumRegistrationStatus = ((rs1.a) outputData).f256927a;
                            boolean z = bizumRegistrationStatus instanceof BizumRegistrationStatus.Active;
                            com.revolut.feature.apm.bizum.impl.ui.a aVar = this.f248743b;
                            if (z) {
                                aVar.E2(com.revolut.feature.apm.bizum.impl.ui.a.O2(aVar.f61569t.f61556a), false, null, false);
                            } else {
                                if (!(bizumRegistrationStatus instanceof BizumRegistrationStatus.NotRegistered)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar.E2(new BizumFlowContract$Step.Registration((BizumRegistrationStatus.NotRegistered) bizumRegistrationStatus), false, null, false);
                            }
                            return Unit.f186387a;
                        case 1:
                            ws1.e outputData2 = (ws1.e) obj2;
                            Intrinsics.checkNotNullParameter(outputData2, "outputData");
                            boolean zF = Intrinsics.f(outputData2, ws1.b.f299642a);
                            com.revolut.feature.apm.bizum.impl.ui.a aVar2 = this.f248743b;
                            if (zF || Intrinsics.f(outputData2, ws1.c.f299643a)) {
                                aVar2.I2();
                            } else {
                                if (!Intrinsics.f(outputData2, ws1.d.f299644a)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                aVar2.E2(com.revolut.feature.apm.bizum.impl.ui.a.O2(aVar2.f61569t.f61556a), false, null, false);
                            }
                            return Unit.f186387a;
                        case 2:
                            j it8 = (j) obj2;
                            Intrinsics.checkNotNullParameter(it8, "it");
                            this.f248743b.I2();
                            return Unit.f186387a;
                        default:
                            q it9 = (q) obj2;
                            Intrinsics.checkNotNullParameter(it9, "it");
                            this.f248743b.I2();
                            return Unit.f186387a;
                    }
                }
            };
            Intrinsics.checkNotNullParameter(block2, "block");
            viewControllerE12.H = block2;
            return viewControllerE12;
        }
        if (!(step instanceof BizumFlowContract$Step.RecipientList)) {
            throw new NoWhenBranchMatchedException();
        }
        ViewController viewControllerE13 = e1(this.f61571x.e(f.OUTGOING));
        final int i5 = 3;
        Function1 block3 = new Function1(this) { // from class: qs1.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.apm.bizum.impl.ui.a f248743b;

            {
                this.f248743b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        d outputData = (d) obj2;
                        Intrinsics.checkNotNullParameter(outputData, "outputData");
                        BizumRegistrationStatus bizumRegistrationStatus = ((rs1.a) outputData).f256927a;
                        boolean z = bizumRegistrationStatus instanceof BizumRegistrationStatus.Active;
                        com.revolut.feature.apm.bizum.impl.ui.a aVar = this.f248743b;
                        if (z) {
                            aVar.E2(com.revolut.feature.apm.bizum.impl.ui.a.O2(aVar.f61569t.f61556a), false, null, false);
                        } else {
                            if (!(bizumRegistrationStatus instanceof BizumRegistrationStatus.NotRegistered)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar.E2(new BizumFlowContract$Step.Registration((BizumRegistrationStatus.NotRegistered) bizumRegistrationStatus), false, null, false);
                        }
                        return Unit.f186387a;
                    case 1:
                        ws1.e outputData2 = (ws1.e) obj2;
                        Intrinsics.checkNotNullParameter(outputData2, "outputData");
                        boolean zF = Intrinsics.f(outputData2, ws1.b.f299642a);
                        com.revolut.feature.apm.bizum.impl.ui.a aVar2 = this.f248743b;
                        if (zF || Intrinsics.f(outputData2, ws1.c.f299643a)) {
                            aVar2.I2();
                        } else {
                            if (!Intrinsics.f(outputData2, ws1.d.f299644a)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            aVar2.E2(com.revolut.feature.apm.bizum.impl.ui.a.O2(aVar2.f61569t.f61556a), false, null, false);
                        }
                        return Unit.f186387a;
                    case 2:
                        j it8 = (j) obj2;
                        Intrinsics.checkNotNullParameter(it8, "it");
                        this.f248743b.I2();
                        return Unit.f186387a;
                    default:
                        q it9 = (q) obj2;
                        Intrinsics.checkNotNullParameter(it9, "it");
                        this.f248743b.I2();
                        return Unit.f186387a;
                }
            }
        };
        Intrinsics.checkNotNullParameter(block3, "block");
        viewControllerE13.H = block3;
        return viewControllerE13;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.z;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.f61572y;
    }
}
