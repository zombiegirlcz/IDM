package com.revolut.feature.card_label.ui.screen.card_label_screen;

import com.revolut.data.model.Data;
import com.revolut.feature.card_label.ui.screen.card_label_screen.CardLabelScreenContract$InputData;
import jki.g;
import jki.i;
import jki.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import vb2.r;
import vy2.f;

/* JADX INFO: loaded from: classes21.dex */
public final class d extends g implements vy2.d {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final CardLabelScreenContract$InputData f64769p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final gwh.b f64770q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vy2.c f64771r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p stateMapper, CardLabelScreenContract$InputData inputData, gwh.b changeCardLabelInteractor) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(changeCardLabelInteractor, "changeCardLabelInteractor");
        this.f64769p = inputData;
        this.f64770q = changeCardLabelInteractor;
        Data data = new Data(null, null, true, 3, null);
        m70.a.c(t0.f186434a);
        this.f64771r = new vy2.c(data, "");
    }

    @Override // yji.l
    public final void I1() {
        CardLabelScreenContract$InputData.CardInfo cardInfo = this.f64769p.f64760a;
        if (cardInfo instanceof CardLabelScreenContract$InputData.CardInfo.Id) {
            l2(new f(this, null, 1), new yi5.b(26));
        } else {
            if (!(cardInfo instanceof CardLabelScreenContract$InputData.CardInfo.Label)) {
                throw new NoWhenBranchMatchedException();
            }
            x2(new r(((CardLabelScreenContract$InputData.CardInfo.Label) cardInfo).f64765b, 21));
        }
    }

    @Override // jki.g
    public final i r2() {
        return this.f64771r;
    }
}
