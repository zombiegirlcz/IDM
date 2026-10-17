package com.revolut.feature.vaults.impl.ui.savings.onboarding.eu.steps.documents_acceptance.flow;

import com.revolut.feature.vaults.impl.ui.savings.onboarding.eu.steps.documents_acceptance.acceptance.DocumentAcceptanceScreen;
import com.revolut.feature.vaults.impl.ui.savings.onboarding.eu.steps.documents_acceptance.acceptance.DocumentAcceptanceScreenContract$Input;
import com.revolut.feature.vaults.impl.ui.savings.onboarding.eu.steps.documents_acceptance.documents.DocumentsToAcceptScreen;
import com.revolut.feature.vaults.impl.ui.savings.onboarding.eu.steps.documents_acceptance.flow.AcceptDocumentsFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowState;
import com.revolut.kompot.navigable.flow.FlowStep;
import crg.f;
import dki.g;
import erg.b;
import erg.c;
import java.util.Collection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import zhm.d0;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class a extends g implements b {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c f94805t;
    public final AcceptDocumentsFlowContract$Step.DocumentsToAcceptList u;
    public final AcceptDocumentsFlowContract$EmptyState v;

    public a(c acceptDocumentsFlowState) {
        Intrinsics.checkNotNullParameter(acceptDocumentsFlowState, "acceptDocumentsFlowState");
        this.f94805t = acceptDocumentsFlowState;
        this.u = AcceptDocumentsFlowContract$Step.DocumentsToAcceptList.f94803a;
        this.v = AcceptDocumentsFlowContract$EmptyState.f94802a;
    }

    @Override // dki.g
    public final com.revolut.kompot.navigable.a t2(FlowStep flowStep) {
        AcceptDocumentsFlowContract$Step step = (AcceptDocumentsFlowContract$Step) flowStep;
        Intrinsics.checkNotNullParameter(step, "step");
        if (step instanceof AcceptDocumentsFlowContract$Step.DocumentsToAcceptList) {
            DocumentsToAcceptScreen documentsToAcceptScreen = new DocumentsToAcceptScreen();
            final int i = 0;
            Function1 function1 = new Function1(this) { // from class: erg.d

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.revolut.feature.vaults.impl.ui.savings.onboarding.eu.steps.documents_acceptance.flow.a f128667b;

                {
                    this.f128667b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    switch (i) {
                        case 0:
                            drg.e output = (drg.e) obj2;
                            Intrinsics.checkNotNullParameter(output, "output");
                            boolean z = output instanceof drg.c;
                            com.revolut.feature.vaults.impl.ui.savings.onboarding.eu.steps.documents_acceptance.flow.a aVar = this.f128667b;
                            if (z) {
                                aVar.E2(new AcceptDocumentsFlowContract$Step.ReviewAndAccept(((drg.c) output).f117124a), true, null, false);
                            } else if (output instanceof drg.d) {
                                aVar.I2();
                            }
                            break;
                        default:
                            f output2 = (f) obj2;
                            Intrinsics.checkNotNullParameter(output2, "output");
                            com.revolut.feature.vaults.impl.ui.savings.onboarding.eu.steps.documents_acceptance.flow.a aVar2 = this.f128667b;
                            c cVar = aVar2.f94805t;
                            ((e) cVar).w0().set(d0.F0(output2.f108382a, (Collection) w.M(((e) cVar).w0(), f0.f322471a)));
                            aVar2.q2();
                            break;
                    }
                    return Unit.f186387a;
                }
            };
            Intrinsics.checkNotNullParameter(function1, "<set-?>");
            documentsToAcceptScreen.H = function1;
            return documentsToAcceptScreen;
        }
        if (!(step instanceof AcceptDocumentsFlowContract$Step.ReviewAndAccept)) {
            throw new NoWhenBranchMatchedException();
        }
        DocumentAcceptanceScreen documentAcceptanceScreen = new DocumentAcceptanceScreen(new DocumentAcceptanceScreenContract$Input(((AcceptDocumentsFlowContract$Step.ReviewAndAccept) step).f94804a));
        final int i2 = 1;
        Function1 function12 = new Function1(this) { // from class: erg.d

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.revolut.feature.vaults.impl.ui.savings.onboarding.eu.steps.documents_acceptance.flow.a f128667b;

            {
                this.f128667b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i2) {
                    case 0:
                        drg.e output = (drg.e) obj2;
                        Intrinsics.checkNotNullParameter(output, "output");
                        boolean z = output instanceof drg.c;
                        com.revolut.feature.vaults.impl.ui.savings.onboarding.eu.steps.documents_acceptance.flow.a aVar = this.f128667b;
                        if (z) {
                            aVar.E2(new AcceptDocumentsFlowContract$Step.ReviewAndAccept(((drg.c) output).f117124a), true, null, false);
                        } else if (output instanceof drg.d) {
                            aVar.I2();
                        }
                        break;
                    default:
                        f output2 = (f) obj2;
                        Intrinsics.checkNotNullParameter(output2, "output");
                        com.revolut.feature.vaults.impl.ui.savings.onboarding.eu.steps.documents_acceptance.flow.a aVar2 = this.f128667b;
                        c cVar = aVar2.f94805t;
                        ((e) cVar).w0().set(d0.F0(output2.f108382a, (Collection) w.M(((e) cVar).w0(), f0.f322471a)));
                        aVar2.q2();
                        break;
                }
                return Unit.f186387a;
            }
        };
        Intrinsics.checkNotNullParameter(function12, "<set-?>");
        documentAcceptanceScreen.H = function12;
        return documentAcceptanceScreen;
    }

    @Override // dki.g
    public final FlowState x2() {
        return this.v;
    }

    @Override // dki.g
    public final FlowStep y2() {
        return this.u;
    }
}
