package com.revolut.feature_move_money.impl.automation.flow;

import a01.e;
import a7i.f;
import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import org.jetbrains.annotations.NotNull;
import yki.i;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends h implements a7i.b {

    @NotNull
    public static final f Companion = new f();
    public final MoveMoneyAutomationFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zja.a f97320p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f97321q;

    public b(MoveMoneyAutomationFlowContract$InputData inputData, zja.a productArticleInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(productArticleInteractor, "productArticleInteractor");
        this.o = inputData;
        this.f97320p = productArticleInteractor;
        this.f97321q = d.a(this, new a09.b(this, 21));
    }

    @Override // yki.j
    public final void M0() {
        l2(new e(this, null, 12), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f97321q;
    }
}
