package com.revolut.feature.bank_account_switching.impl.ui.switch_out.review;

import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.BankAccountSwitchingReviewOutScreenContract$ModalStep;
import com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.domain.SwitchOutRequestStatus;
import com.revolut.feature.bank_account_switching.impl.ui.switch_out.review.domain.SwitchOutReview;
import com.revolut.kompot.common.ModalDestination;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import su9.c;
import uj8.j;
import up2.e;
import up2.f;
import up2.i;
import up2.k;
import up2.l;
import up2.u;
import vkm.j2;
import yi5.b;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements i {

    @NotNull
    public static final l Companion = new l();
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final bp2.c f64055p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final u f64056q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final sf0.h f64057r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f64058s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f64059t;

    public a(n stateMapper, BankAccountSwitchingReviewOutScreenContract$InputData inputData, c switchOutInteractor, bp2.c switchReviewInteractor, u switchOutDialogProvider, sf0.h serverErrorParser) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(switchOutInteractor, "switchOutInteractor");
        Intrinsics.checkNotNullParameter(switchReviewInteractor, "switchReviewInteractor");
        Intrinsics.checkNotNullParameter(switchOutDialogProvider, "switchOutDialogProvider");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.o = switchOutInteractor;
        this.f64055p = switchReviewInteractor;
        this.f64056q = switchOutDialogProvider;
        this.f64057r = serverErrorParser;
        this.f64058s = d.b(this, new e(new Data(null, null, true, 3, null), inputData.f64053a), stateMapper, null, false, 12);
        this.f64059t = hx7.e.a(this, new j(this, 25));
    }

    @Override // yji.l
    public final void I1() {
        l2(new up2.n(this, null, 0), new k(this, 0));
    }

    public final void I2() {
        wn2.d dVar;
        SwitchOutReview switchOutReview = (SwitchOutReview) ((e) ((j2) this.f64058s.f22677a).getValue()).f281817b.getContent();
        if (switchOutReview == null) {
            return;
        }
        SwitchOutRequestStatus switchOutRequestStatus = switchOutReview.f64068a;
        mn2.a aVar = switchOutRequestStatus.f64064a;
        if ((aVar == mn2.a.CASS || aVar == mn2.a.MOBILITY) && (dVar = switchOutRequestStatus.f64065b) == wn2.d.FULL) {
            C2(new f(aVar, dVar, switchOutRequestStatus.e));
        } else {
            l2(new un8.j(this, switchOutReview, null, 3), new b(26));
        }
    }

    public final void J2() {
        SwitchOutReview switchOutReview = (SwitchOutReview) ((e) ((j2) this.f64058s.f22677a).getValue()).f281817b.getContent();
        if (switchOutReview != null) {
            h.v2(this.f64059t, new BankAccountSwitchingReviewOutScreenContract$ModalStep.DirectDebits(switchOutReview), ModalDestination.Style.POPUP.f98311a);
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f64059t;
    }

    @Override // cli.z
    public final g getState() {
        return this.f64058s;
    }
}
