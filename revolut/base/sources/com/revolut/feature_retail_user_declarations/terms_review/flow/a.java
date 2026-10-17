package com.revolut.feature_retail_user_declarations.terms_review.flow;

import com.revolut.feature_retail_user_declarations.terms_review.TermsReviewInputData;
import com.revolut.feature_retail_user_declarations.terms_review.flow.TermsReviewFlowContract$Step;
import hx7.e;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import mci.c;
import oki.h;
import qki.d;
import yi5.b;
import yki.i;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements c {
    public final TermsReviewInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jvh.a f97745p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final d f97746q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f97747r;

    public a(TermsReviewInputData inputData, jvh.a workflowInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(workflowInteractor, "workflowInteractor");
        this.o = inputData;
        this.f97745p = workflowInteractor;
        this.f97746q = e.b(this, new TermsReviewFlowContract$State(0));
        this.f97747r = d8l.d.a(this, new m84.e(this, 9));
    }

    @Override // yki.j
    public final void M0() {
        int i = 0;
        String str = (String) d0.e0(0, this.o.f97742c);
        if (str != null) {
            h.t2(this, this.f97747r, new TermsReviewFlowContract$Step.ReadTerms(str), false, null, false, 12);
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Empty list of terms IDs for review");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        l2(new mci.e(this, null, i), new b(26));
    }

    @Override // qki.e
    public final d getState() {
        return this.f97746q;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f97747r;
    }
}
