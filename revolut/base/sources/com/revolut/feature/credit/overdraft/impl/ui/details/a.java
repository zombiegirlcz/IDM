package com.revolut.feature.credit.overdraft.impl.ui.details;

import android.os.Parcelable;
import aw0.n6;
import cli.g;
import cli.n;
import cli.y;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.kompot.common.bottom_sheet.actions.ActionsBottomSheetController;
import com.revolut.revolut.feature_fourthline_impl.R;
import grl.k9;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import u4i.u;
import u95.i;
import u95.k;
import yji.l;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements i {

    @NotNull
    public static final k Companion = new k();
    public final OverdraftDetailsScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o95.a f70641p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f15.a f70642q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f70643r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f70644s;

    public a(OverdraftDetailsScreenContract$InputData inputData, o95.a overdraftDetailsInteractor, f15.a getCreditHelpExtension, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(overdraftDetailsInteractor, "overdraftDetailsInteractor");
        Intrinsics.checkNotNullParameter(getCreditHelpExtension, "getCreditHelpExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f70641p = overdraftDetailsInteractor;
        this.f70642q = getCreditHelpExtension;
        this.f70643r = d.b(this, new u95.h(0), stateMapper, null, false, 12);
        this.f70644s = e.a(this, new u(this, 12));
    }

    public static ActionsBottomSheetController K2(int i, int i2) {
        lw0.a aVar = new lw0.a(new TextLocalisedClause(i, null, null, 14), new TextLocalisedClause(i2, null, null, 14), null, null, false, 28);
        aw0.e eVar = new aw0.e(false, null, null, new n6(new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), null, null, 55);
        k9 k9Var = k9.Credit;
        Parcelable.Creator<AnalyticsProduct.Retail> creator = AnalyticsProduct.Retail.CREATOR;
        return new ActionsBottomSheetController(new dii.a(aVar, eVar, com.google.android.gms.internal.mlkit_vision_face.a.h(k9Var, "value", k9Var), null, null, 24));
    }

    @Override // yji.l
    public final void I1() {
        J2();
        I2();
    }

    public final void I2() {
        String facilityId = this.o.f70637a;
        o95.a aVar = this.f70641p;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        w4l.i strategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        i95.e eVar = aVar.f223070a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        l.b1(this, eVar.f.b(facilityId, strategy), null, new u95.l(this, null, 0), 3);
    }

    public final void J2() {
        String facilityId = this.o.f70637a;
        o95.a aVar = this.f70641p;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        w4l.i strategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        i95.e eVar = aVar.f223070a;
        eVar.getClass();
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        l.b1(this, eVar.e.b(facilityId, strategy), null, new u95.l(this, null, 1), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f70644s;
    }

    @Override // cli.z
    public final g getState() {
        return this.f70643r;
    }
}
