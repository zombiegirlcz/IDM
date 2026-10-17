package com.revolut.feature.bank_account_switching.impl.ui.review_joint;

import bp2.c;
import bp2.d;
import cli.n;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.tab.accounts.api.model.TabAccountsShotDialogAction;
import eh3.s;
import ep2.f;
import ep2.g;
import ep2.i;
import ep2.k;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import yi5.b;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements g {

    @NotNull
    public static final i Companion = new i();
    public final d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f63980p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ep2.a f63981q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f63982r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f63983s;

    public a(n stateMapper, SwitchInJointReviewScreenContract$InputData inputData, d jointAccountReviewInteractor, c switchReviewInteractor, ep2.a switchInJointDialogProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(jointAccountReviewInteractor, "jointAccountReviewInteractor");
        Intrinsics.checkNotNullParameter(switchReviewInteractor, "switchReviewInteractor");
        Intrinsics.checkNotNullParameter(switchInJointDialogProvider, "switchInJointDialogProvider");
        this.o = jointAccountReviewInteractor;
        this.f63980p = switchReviewInteractor;
        this.f63981q = switchInJointDialogProvider;
        this.f63982r = mra.d.b(this, new f(new Data(null, null, true, 3, null), inputData.f63978a), stateMapper, null, false, 12);
        this.f63983s = e.a(this, new s(this, 16));
    }

    @Override // yji.l
    public final void I1() {
        l2(new k(this, null, 1), new b(26));
    }

    public final void I2(TextLocalisedClause textLocalisedClause) {
        C1(u0.b(jbb.a.a(ibb.c.f160140a, new TabAccountsLaunchConfig(null, new TabAccountsInitialPayload.Action(new TabAccountsShotDialogAction.Success(textLocalisedClause, null))), null, null, 12)));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f63983s;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f63982r;
    }
}
