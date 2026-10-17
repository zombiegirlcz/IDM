package com.revolut.feature.rev_points.impl.ui.terms_review.flow;

import com.revolut.feature.rev_points.api.navigation.terms.RevPointsTermsReviewInputData;
import com.revolut.feature.rev_points.impl.ui.terms_review.flow.RevPointsTermsReviewFlowContract$Step;
import com.revolut.feature.rev_points.models.TermsToReview;
import hw9.b;
import hx7.e;
import i0c.c;
import i0c.d;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import yki.i;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements c {

    @NotNull
    public static final d Companion = new d();
    public final RevPointsTermsReviewInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final pre.c f83846p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final qki.d f83847q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f83848r;

    public a(RevPointsTermsReviewInputData inputData, pre.c termsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        this.o = inputData;
        this.f83846p = termsInteractor;
        this.f83847q = e.b(this, new RevPointsTermsReviewFlowContract$State(0));
        this.f83848r = d8l.d.a(this, new b(this, 14));
    }

    @Override // yki.j
    public final void M0() {
        TermsToReview termsToReview = (TermsToReview) d0.e0(0, this.o.f83546a);
        if (termsToReview != null) {
            h.t2(this, this.f83848r, new RevPointsTermsReviewFlowContract$Step.ReadTerms(termsToReview), false, null, false, 12);
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Empty list of terms IDs for review");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        C2(iub.a.f168544a);
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.f83847q;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f83848r;
    }
}
