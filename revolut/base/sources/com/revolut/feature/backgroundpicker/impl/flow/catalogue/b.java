package com.revolut.feature.backgroundpicker.impl.flow.catalogue;

import bn2.c;
import bn2.f;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.backgroundpicker.impl.R$string;
import e60.s;
import go.g;
import hm2.e;
import ip0.u00;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import nii.y0;
import nii.z;
import oki.h;
import org.jetbrains.annotations.NotNull;
import rhj.m;
import rm2.i;
import rm2.j;
import rm2.o;
import rm2.p;
import rm2.q;
import rm2.t;
import rm2.u;
import rm2.v;
import rm2.x;
import vkm.j2;
import yji.l;
import zhm.r0;

/* JADX INFO: loaded from: classes21.dex */
public final class b extends h implements j {

    @NotNull
    public static final t Companion = new t();
    public final i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f63751p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c f63752q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final lg3.a f63753r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e60.a f63754s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f63755t;
    public final v u;
    public final y v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f63756w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final vii.b f63757x;

    public b(x mapper, i inputData, f backgroundsCatalogInteractor, c backgroundPickerInteractor, lg3.a checklistChallengesInteractor, e60.a mediaPickerControllerExtension, e externalNavigationProvider, v dialogFactory) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(backgroundsCatalogInteractor, "backgroundsCatalogInteractor");
        Intrinsics.checkNotNullParameter(backgroundPickerInteractor, "backgroundPickerInteractor");
        Intrinsics.checkNotNullParameter(checklistChallengesInteractor, "checklistChallengesInteractor");
        Intrinsics.checkNotNullParameter(mediaPickerControllerExtension, "mediaPickerControllerExtension");
        Intrinsics.checkNotNullParameter(externalNavigationProvider, "externalNavigationProvider");
        Intrinsics.checkNotNullParameter(dialogFactory, "dialogFactory");
        this.o = inputData;
        this.f63751p = backgroundsCatalogInteractor;
        this.f63752q = backgroundPickerInteractor;
        this.f63753r = checklistChallengesInteractor;
        this.f63754s = mediaPickerControllerExtension;
        this.f63755t = externalNavigationProvider;
        this.u = dialogFactory;
        this.v = d.b(this, new rm2.h(r0.g(), null, false, null, inputData.f255191c), mapper, null, false, 12);
        this.f63756w = hx7.e.a(this, new rl8.d(this, 1));
        this.f63757x = new vii.b();
    }

    @Override // yji.l
    public final void I1() {
        Object gVar;
        q qVar = this.o.f255189a;
        Continuation continuation = null;
        if (qVar instanceof o) {
            H2(this.v, new rj7.b(28));
            gVar = vkm.q.q(mo3.a.g(this.f63752q.a(((o) qVar).f255195a), null, new m(20), 1));
        } else {
            if (!qVar.equals(p.f255196a)) {
                throw new NoWhenBranchMatchedException();
            }
            gVar = new g(null, 2);
        }
        l.a1(this, vkm.q.Q(this.f63757x, new om4.r0(continuation, gVar, this, 20)), null, null, new u(this, continuation, 0), 3);
    }

    public final void I2() {
        bn2.t tVar;
        Data data;
        List list;
        Map map = ((rm2.h) ((j2) this.v.f22677a).getValue()).f255186a;
        Integer numValueOf = (map == null || (tVar = (bn2.t) map.get(em2.b.UPLOADED)) == null || (data = tVar.f17041a) == null || (list = (List) data.getContent()) == null) ? null : Integer.valueOf(list.size());
        if (numValueOf == null || numValueOf.intValue() < 50) {
            ((s) this.f63754s).T(new e60.i(null, null, null, false, 0, 0, null, null, false, u00.BACK, null, 15871));
            return;
        }
        tji.f fVarX = X();
        this.u.getClass();
        fVarX.d(new y0(null, new z(new TextLocalisedClause(R$string.background_picker_title_limit_exceeded, null, null, 14), new TextLocalisedClause(R$string.background_picker_label_limit_exceeded, zhm.u.c(50), null, 12), new TextLocalisedClause(R$string.background_picker_button_got_it, null, null, 14), null, null, null, false, null, null, null, null, null, null, 32756), false, 5));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f63756w;
    }

    @Override // yji.l
    public final void T1(long j2) {
        l.b1(this, rd0.e.b(((s) this.f63754s).f122868g), null, new u(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.v;
    }
}
