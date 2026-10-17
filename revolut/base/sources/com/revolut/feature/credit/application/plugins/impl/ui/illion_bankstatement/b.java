package com.revolut.feature.credit.application.plugins.impl.ui.illion_bankstatement;

import android.os.Parcelable;
import c84.t;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import com.revolut.feature_web_view.presentation.WebViewContract$WebViewConfiguration;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import e84.e;
import hw3.b0;
import j2c.n;
import jc4.d;
import jc4.g;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import pgi.h;
import pgi.k;
import yji.l;
import yki.i;

/* JADX INFO: loaded from: classes22.dex */
public final class b extends t implements jc4.a {

    @NotNull
    public static final d Companion = new d();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final IllionBankStatementFlowContract$InputData f67793p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final b0 f67794q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f67795r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(IllionBankStatementFlowContract$InputData inputData, b0 illionBankStatementsInteractor, e pluginControllerResolver) {
        super(pluginControllerResolver);
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(illionBankStatementsInteractor, "illionBankStatementsInteractor");
        Intrinsics.checkNotNullParameter(pluginControllerResolver, "pluginControllerResolver");
        this.f67793p = inputData;
        this.f67794q = illionBankStatementsInteractor;
        this.f67795r = d8l.d.a(this, new n(this, 28));
    }

    @Override // yki.j
    public final void M0() {
        l2(new g(this, null, 0), new yi5.b(26));
    }

    public final void P2() {
        l.a1(this, X1(new y0(null, new z(new TextLocalisedClause(R$string.credit_error_subtitle, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5)), null, null, null, 7);
    }

    public final void Q2(String str) {
        k.Companion.getClass();
        C1(new BridgeDestination(new ActivityNavigateCommand(h.f235963b, new WebViewContract$WebViewConfiguration(str, (Clause) null, R$drawable.uikit_icn_24_cross, false, true, true, (String) null, (Parcelable) null, "ILLION_BANKSTATEMENTS_WEB_VIEW_FLOW", false, false, (String) null, (String) null, (String) null, false, true, 62874), null, 333, 0, null, null, null, null, false, 1012)));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f67795r;
    }
}
