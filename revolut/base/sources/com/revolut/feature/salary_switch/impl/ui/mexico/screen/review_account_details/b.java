package com.revolut.feature.salary_switch.impl.ui.mexico.screen.review_account_details;

import android.os.Parcelable;
import aqc.k;
import cli.g;
import cli.n;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.kompot.common.R$string;
import hx7.e;
import koe.x;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import nii.e0;
import nii.y0;
import nii.z;
import oki.h;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends h implements krc.b {
    public final ReviewAccountDetailsContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k f85327p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f85328q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f85329r;

    public b(n stateMapper, ReviewAccountDetailsContract$InputData inputData, k salarySwitchProcessInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(salarySwitchProcessInteractor, "salarySwitchProcessInteractor");
        this.o = inputData;
        this.f85327p = salarySwitchProcessInteractor;
        this.f85328q = d.b(this, new krc.a(inputData.f85324a, inputData.f85325b), stateMapper, null, false, 12);
        this.f85329r = e.a(this, new x(26));
    }

    public final void I2(Throwable th10, TextLocalisedClause textLocalisedClause, TextLocalisedClause textLocalisedClause2) {
        X1(new y0(null, tj0.a.a(th10) ? new e0((Clause) new TextLocalisedClause(R$string.common_offline_state_title, null, null, 14), (Clause) new TextLocalisedClause(R$string.common_offline_state_description, null, null, 14), (TextLocalisedClause) null, (Parcelable) null, false, (AnalyticsProduct) null, 1020) : new z(textLocalisedClause, textLocalisedClause2, null, null, null, null, false, null, null, null, null, null, null, 32764), false, 5));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f85329r;
    }

    @Override // cli.z
    public final g getState() {
        return this.f85328q;
    }
}
