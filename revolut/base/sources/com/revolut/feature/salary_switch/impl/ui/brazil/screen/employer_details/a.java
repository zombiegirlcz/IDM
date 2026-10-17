package com.revolut.feature.salary_switch.impl.ui.brazil.screen.employer_details;

import ak8.i;
import cli.g;
import cli.y;
import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import vh9.b;
import vqc.f;
import vqc.j;
import vqc.l;
import vqc.m;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements j {
    public final vqc.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f85289p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f85290q;

    public a(vqc.a modalsProvider, m stateMapper) {
        Intrinsics.checkNotNullParameter(modalsProvider, "modalsProvider");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = modalsProvider;
        this.f85289p = d.b(this, new f(0), stateMapper, null, false, 12);
        this.f85290q = e.a(this, new b(this, 17));
    }

    public final void I2(InputTextDelegate.TextData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        String str = data.f52597a;
        boolean zF = Intrinsics.f(str, "EMPLOYER_NAME_INPUT_ID");
        y yVar = this.f85289p;
        if (zF) {
            H2(yVar, new i(data, 29));
        } else if (Intrinsics.f(str, "CNPJ_INPUT_ID")) {
            H2(yVar, new l(data, 0));
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f85290q;
    }

    @Override // cli.z
    public final g getState() {
        return this.f85289p;
    }
}
