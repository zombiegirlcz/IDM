package com.revolut.feature.bank_account_switching.impl.ui.review;

import bp2.c;
import bp2.d;
import cli.g;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.bank_account_switching.impl.ui.review.BankAccountSwitchingReviewScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import hx7.e;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import wli.x;
import zo2.f;
import zo2.j;
import zo2.k;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends h implements f {

    @NotNull
    public static final j Companion = new j();
    public final BankAccountSwitchingReviewScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f63967p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f63968q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l61.a f63969r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final x f63970s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f63971t;
    public final com.revolut.kompot.navigable.vc.modal.a u;

    public b(n stateMapper, BankAccountSwitchingReviewScreenContract$InputData inputData, d submissionInteractor, c reviewInteractor, l61.a userCompanyInteractor, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(submissionInteractor, "submissionInteractor");
        Intrinsics.checkNotNullParameter(reviewInteractor, "reviewInteractor");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.o = inputData;
        this.f63967p = submissionInteractor;
        this.f63968q = reviewInteractor;
        this.f63969r = userCompanyInteractor;
        this.f63970s = deeplinkHandler;
        this.f63971t = mra.d.b(this, new zo2.d(inputData.f63962b, inputData.f63963c, inputData.f63961a, inputData.d, inputData.e, new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.u = e.a(this, new zo2.h(this, 0));
    }

    @Override // yji.l
    public final void I1() {
        l2(new k(this, null, 0), new yi5.b(26));
    }

    public final void I2() {
        bp2.e eVar = (bp2.e) ((zo2.d) ((j2) this.f63971t.f22677a).getValue()).f.getContent();
        if (eVar != null) {
            List list = eVar.d;
            if (!list.isEmpty()) {
                h.v2(this.u, new BankAccountSwitchingReviewScreenContract$ModalStep.TermsAndConditions(list), ModalDestination.Style.POPUP.f98311a);
                return;
            }
        }
        l2(new k(this, null, 3), new yi5.b(26));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.u;
    }

    @Override // cli.z
    public final g getState() {
        return this.f63971t;
    }
}
