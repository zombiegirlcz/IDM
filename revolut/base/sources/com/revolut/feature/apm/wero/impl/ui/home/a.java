package com.revolut.feature.apm.wero.impl.ui.home;

import com.revolut.feature.apm.wero.impl.ui.home.WeroHomeFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import lx1.d;
import oki.h;
import u7k.w;
import u83.f;
import uh2.c;
import yi5.b;
import zhm.f0;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements c {
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final oh2.a f63066p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final yki.a f63067q;

    public a(WeroHomeFlowContract$InputData inputData, d apmContactsInteractor, oh2.a errorHandlerExtension) {
        FlowStep flowStep;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(apmContactsInteractor, "apmContactsInteractor");
        Intrinsics.checkNotNullParameter(errorHandlerExtension, "errorHandlerExtension");
        this.o = apmContactsInteractor;
        this.f63066p = errorHandlerExtension;
        int i = uh2.d.f280056a[inputData.f63063a.ordinal()];
        if (i == 1) {
            flowStep = WeroHomeFlowContract$Step.Area.f63064a;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            flowStep = WeroHomeFlowContract$Step.PaymentArea.f63065a;
        }
        this.f63067q = cp5.d.a(this, flowStep, f0.f322471a, new w(this, 19));
    }

    @Override // yji.l
    public final void I1() {
        l2(new f(this, null, 9), new b(26));
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (((oh2.b) this.f63066p).Z2(throwable, new tyl.a(this, 20))) {
            return true;
        }
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return false;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f63067q;
    }
}
