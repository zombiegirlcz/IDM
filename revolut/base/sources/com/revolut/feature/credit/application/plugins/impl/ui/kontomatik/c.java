package com.revolut.feature.credit.application.plugins.impl.ui.kontomatik;

import c84.t;
import com.revolut.feature.credit.application.plugins.api.navigation.KontomatikIncomeCheckEntryPoint;
import com.revolut.feature.credit.application.plugins.impl.ui.kontomatik.KontomatikIncomeCheckFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import cp5.d;
import hw3.d0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import ow3.e;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class c extends t implements rc4.b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final KontomatikIncomeCheckFlowContract$InputData f67811p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d0 f67812q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final hw3.c f67813r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f67814s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yki.a f67815t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(KontomatikIncomeCheckFlowContract$InputData inputData, d0 manualUnderwritingInteractor, hw3.c incomeCheckInteractor, e cancellationInteractor, e84.e pluginControllerResolver) {
        FlowStep popup;
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(manualUnderwritingInteractor, "manualUnderwritingInteractor");
        Intrinsics.checkNotNullParameter(incomeCheckInteractor, "incomeCheckInteractor");
        Intrinsics.checkNotNullParameter(cancellationInteractor, "cancellationInteractor");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f67811p = inputData;
        this.f67812q = manualUnderwritingInteractor;
        this.f67813r = incomeCheckInteractor;
        this.f67814s = cancellationInteractor;
        KontomatikIncomeCheckEntryPoint kontomatikIncomeCheckEntryPoint = inputData.f67801c;
        if (kontomatikIncomeCheckEntryPoint instanceof KontomatikIncomeCheckEntryPoint.Default) {
            popup = KontomatikIncomeCheckFlowContract$Step.Prompt.f67807a;
        } else {
            if (!(kontomatikIncomeCheckEntryPoint instanceof KontomatikIncomeCheckEntryPoint.Popup)) {
                throw new NoWhenBranchMatchedException();
            }
            KontomatikIncomeCheckEntryPoint.Popup popup2 = (KontomatikIncomeCheckEntryPoint.Popup) kontomatikIncomeCheckEntryPoint;
            popup = new KontomatikIncomeCheckFlowContract$Step.Popup(popup2.f66889a, popup2.f66890b);
        }
        this.f67815t = d.a(this, popup, f0.f322471a, new cnc.t(this, 3));
    }

    public final KontomatikIncomeCheckEntryPoint.Default P2() {
        KontomatikIncomeCheckEntryPoint kontomatikIncomeCheckEntryPoint = this.f67811p.f67801c;
        KontomatikIncomeCheckEntryPoint.Default r06 = kontomatikIncomeCheckEntryPoint instanceof KontomatikIncomeCheckEntryPoint.Default ? (KontomatikIncomeCheckEntryPoint.Default) kontomatikIncomeCheckEntryPoint : null;
        if (r06 != null) {
            return r06;
        }
        throw new IllegalStateException("Sign-in steps require Default entry point with metadata");
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f67815t;
    }
}
