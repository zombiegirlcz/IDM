package com.revolut.feature.payments.groups.impl.ui_chat.settings;

import cli.y;
import com.revolut.data.model.Data;
import e60.s;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ks9.i;
import ks9.j;
import ks9.r0;
import oki.h;
import org.jetbrains.annotations.NotNull;
import pkf.x;
import ps9.b0;
import ps9.p;
import ps9.r;
import ps9.u;
import ps9.w;
import tqi.g;
import ukm.f;
import vkm.j2;
import vkm.q;
import vkm.z1;
import yji.l;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends h implements r {

    @NotNull
    public static final u Companion = new u();
    public final j A;
    public final z1 B;
    public final y C;
    public final com.revolut.kompot.navigable.vc.modal.a D;
    public final i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ks9.c f79385p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ps9.c f79386q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e60.a f79387r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final r0 f79388s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vr9.r f79389t;
    public final j60.a u;
    public final ks9.h v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final wj0.a f79390w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final g f79391x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final d2a.a f79392y;
    public final ks9.d z;

    public d(b0 stateMapper, i settlingExtension, GroupChatSettingsScreenContract$InputData inputData, ks9.c appFraudExtension, ps9.c interactor, e60.a mediaPicker, r0 trustingExtension, vr9.r settlementMapper, j60.a bottomExpandableDialog, ks9.h settingsExtensions, wj0.a idempotencyKeyHolder, g shareNaviCommandFactory, d2a.a wallpaperPickerControllerModelExtension, ks9.d currencyChangeExtension, j spendingBreakdownExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(settlingExtension, "settlingExtension");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(appFraudExtension, "appFraudExtension");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(mediaPicker, "mediaPicker");
        Intrinsics.checkNotNullParameter(trustingExtension, "trustingExtension");
        Intrinsics.checkNotNullParameter(settlementMapper, "settlementMapper");
        Intrinsics.checkNotNullParameter(bottomExpandableDialog, "bottomExpandableDialog");
        Intrinsics.checkNotNullParameter(settingsExtensions, "settingsExtensions");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(shareNaviCommandFactory, "shareNaviCommandFactory");
        Intrinsics.checkNotNullParameter(wallpaperPickerControllerModelExtension, "wallpaperPickerControllerModelExtension");
        Intrinsics.checkNotNullParameter(currencyChangeExtension, "currencyChangeExtension");
        Intrinsics.checkNotNullParameter(spendingBreakdownExtension, "spendingBreakdownExtension");
        this.o = settlingExtension;
        this.f79385p = appFraudExtension;
        this.f79386q = interactor;
        this.f79387r = mediaPicker;
        this.f79388s = trustingExtension;
        this.f79389t = settlementMapper;
        this.u = bottomExpandableDialog;
        this.v = settingsExtensions;
        this.f79390w = idempotencyKeyHolder;
        this.f79391x = shareNaviCommandFactory;
        this.f79392y = wallpaperPickerControllerModelExtension;
        this.z = currencyChangeExtension;
        this.A = spendingBreakdownExtension;
        z1 z1VarB = q.b(0, 2, f.DROP_OLDEST);
        z1VarB.k(Boolean.FALSE);
        this.B = z1VarB;
        this.C = mra.d.b(this, new p(inputData.f79375a, new Data(null, null, true, 3, null), false), stateMapper, null, false, 12);
        this.D = e.a(this, new plb.g(this, 24));
    }

    @Override // yji.l
    public final void I1() {
        this.f79390w.a("payments_group_invite_link_creation");
        Continuation continuation = null;
        l.a1(this, rd0.e.b(this.f79386q.b(((p) ((j2) this.C.f22677a).getValue()).f239437a)), null, null, new w(this, continuation, 0), 3);
        l.a1(this, q.Q(this.B, new x(continuation, this, 10)), null, null, new w(this, continuation, 1), 3);
        l.a1(this, rd0.e.b(((s) this.f79387r).f122868g), null, null, new w(this, continuation, 2), 3);
    }

    public final qs9.a I2() {
        Object content = ((p) ((j2) this.C.f22677a).getValue()).f239438b.getContent();
        if (content != null) {
            return (qs9.a) content;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.D;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.C;
    }
}
