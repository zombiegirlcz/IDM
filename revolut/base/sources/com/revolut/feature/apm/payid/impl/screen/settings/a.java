package com.revolut.feature.apm.payid.impl.screen.settings;

import b7d.c;
import bb2.b0;
import bb2.j;
import bb2.m;
import bb2.o;
import bb2.p;
import bb2.q;
import bb2.r;
import bb2.y;
import cli.g;
import cli.n;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.AliasStatus;
import com.revolut.feature.apm.payid.impl.screen.settings.SettingsScreenContract$ModalStep;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.retail.common.ui.R$string;
import eb2.l;
import hx7.e;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import nii.c0;
import nii.y0;
import nii.z;
import oki.h;
import org.jetbrains.annotations.NotNull;
import r10.w;
import rp0.g1;
import vw1.b;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends h implements m {

    @NotNull
    public static final y Companion = new y();
    public final b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wj0.a f62734p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w f62735q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c70.a f62736r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g1 f62737s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l f62738t;
    public final eb2.a u;
    public final cli.y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f62739w;

    public a(b aliasRepository, wj0.a idempotencyKeyHolder, w payIdSettingInteractor, c70.a clipboard, g1 shotDialogDisplayer, l deleteAliasInputDataMapper, eb2.a addAliasInputDataMapper, n stateMapper) {
        Intrinsics.checkNotNullParameter(aliasRepository, "aliasRepository");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(payIdSettingInteractor, "payIdSettingInteractor");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(shotDialogDisplayer, "shotDialogDisplayer");
        Intrinsics.checkNotNullParameter(deleteAliasInputDataMapper, "deleteAliasInputDataMapper");
        Intrinsics.checkNotNullParameter(addAliasInputDataMapper, "addAliasInputDataMapper");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = aliasRepository;
        this.f62734p = idempotencyKeyHolder;
        this.f62735q = payIdSettingInteractor;
        this.f62736r = clipboard;
        this.f62737s = shotDialogDisplayer;
        this.f62738t = deleteAliasInputDataMapper;
        this.u = addAliasInputDataMapper;
        this.v = d.b(this, new j(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
        this.f62739w = e.a(this, new c(this, 15));
    }

    public static final void I2(a aVar) {
        aVar.X1(new y0(null, new z(new TextLocalisedClause(R$string.error_generic, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5));
    }

    public static final void J2(a aVar) {
        aVar.X1(new y0(null, new c0(null, null, null, false, null, false, false, null, 1919), false, 5));
    }

    @Override // yji.l
    public final void I1() {
        uy1.j jVar = (uy1.j) this.o;
        jVar.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.l.a1(this, jVar.f284046g.b(Unit.f186387a, loadingStrategy), null, null, new b74.e(this, null, 12), 3);
        K2();
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f62739w;
    }

    public final void K2() {
        l2(new b0(this, null, 0), new bb2.w(this, 0));
    }

    public final void L2(r event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof q) {
            B2();
            return;
        }
        if (event instanceof p) {
            String str = ((p) event).f14150a;
            if (Intrinsics.f(str, "LIST_ID_REGISTERED_ALIASES_ERROR")) {
                M2();
                return;
            } else {
                if (Intrinsics.f(str, "LIST_ID_OTHER_ALIASES_ERROR")) {
                    K2();
                    return;
                }
                return;
            }
        }
        boolean z = event instanceof o;
        ModalDestination.Style.BOTTOM_DIALOG bottom_dialog = ModalDestination.Style.BOTTOM_DIALOG.f98301a;
        com.revolut.kompot.navigable.vc.modal.a aVar = this.f62739w;
        if (!z) {
            if (!(event instanceof bb2.n)) {
                throw new NoWhenBranchMatchedException();
            }
            h.v2(aVar, new SettingsScreenContract$ModalStep.AddAlias(((bb2.n) event).f14148a), bottom_dialog);
            return;
        }
        Alias alias = ((o) event).f14149a;
        AliasStatus aliasStatus = alias.f61880c;
        if (Intrinsics.f(aliasStatus, AliasStatus.ACTIVE.f61885b) || Intrinsics.f(aliasStatus, AliasStatus.DISABLED.f61888b)) {
            h.v2(aVar, new SettingsScreenContract$ModalStep.OpenActions(alias), bottom_dialog);
            return;
        }
        if (Intrinsics.f(aliasStatus, AliasStatus.BLOCKED.f61887b)) {
            h.v2(aVar, SettingsScreenContract$ModalStep.DisabledAliasInfo.f62732a, bottom_dialog);
            return;
        }
        throw new IllegalArgumentException(alias.f61880c + " is not supported");
    }

    public final void M2() {
        l2(new b0(this, null, 1), new bb2.w(this, 1));
    }

    @Override // cli.z
    public final g getState() {
        return this.v;
    }
}
