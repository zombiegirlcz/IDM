package com.revolut.feature.defi.settings.impl.ui.recovery_phrase.screen;

import cli.g;
import cli.y;
import hx7.e;
import k50.a4;
import k66.f;
import k66.i;
import k66.k;
import k66.l;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends h implements f {

    @NotNull
    public static final k Companion = new k();
    public final c70.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final DeFiRecoveryPhraseScreenContract$InputData f71875p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f71876q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f71877r;

    public a(l mapper, c70.a clipboard, DeFiRecoveryPhraseScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = clipboard;
        this.f71875p = inputData;
        this.f71876q = e.a(this, new k3k.k(this, 8));
        this.f71877r = d.b(this, new k66.e(0), mapper, null, false, 12);
    }

    public final void I2() {
        y yVar = this.f71877r;
        if (((k66.e) ((j2) yVar.f22677a).getValue()).f181648a instanceof k66.h) {
            i iVar = ((k66.e) ((j2) yVar.f22677a).getValue()).f181648a;
            Intrinsics.i(iVar, "null cannot be cast to non-null type com.revolut.feature.defi.settings.impl.ui.recovery_phrase.screen.DeFiRecoveryPhraseScreenContract.RecoveryPhraseState.Revealed");
            ((k66.h) iVar).f181650a.close();
            H2(yVar, new a4(19));
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f71876q;
    }

    @Override // yji.l
    public final void P1() {
        I2();
    }

    @Override // cli.z
    public final g getState() {
        return this.f71877r;
    }
}
