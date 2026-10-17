package com.revolut.feature.card_order_new.common.setpin.kompot;

import ang.f;
import cli.g;
import cli.n;
import cli.y;
import com.revolut.feature.card_order_new.common.setpin.kompot.SetPinScreenContract$InputData;
import i13.e;
import i13.i;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class a extends h implements i13.h {

    @NotNull
    public static final e Companion = new e();
    public final k13.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n60.a f65016p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f f65017q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l93.f f65018r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final SetPinScreenContract$InputData f65019s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f65020t;

    public a(n stateMapper, k13.a pinDialogProvider, n60.a keyboardControllerExtension, f userInteractor, l93.f revolutCardsInteractor, SetPinScreenContract$InputData inputData) {
        String str;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(pinDialogProvider, "pinDialogProvider");
        Intrinsics.checkNotNullParameter(keyboardControllerExtension, "keyboardControllerExtension");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = pinDialogProvider;
        this.f65016p = keyboardControllerExtension;
        this.f65017q = userInteractor;
        this.f65018r = revolutCardsInteractor;
        this.f65019s = inputData;
        if (inputData instanceof SetPinScreenContract$InputData.ConfirmPin) {
            str = ((SetPinScreenContract$InputData.ConfirmPin) inputData).f65011b;
        } else {
            m70.a.c(t0.f186434a);
            str = "";
        }
        this.f65020t = d.b(this, new i(str, null, false, true), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l2(new i13.f(this, null, 0), new yi5.b(26));
    }

    @Override // yji.l
    public final void T1(long j2) {
        n2(new i13.f(this, null, 1), new whi.b(6));
    }

    @Override // cli.z
    public final g getState() {
        return this.f65020t;
    }
}
