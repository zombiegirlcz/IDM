package com.revolut.feature.revolutpay.impl.ui.native_move_money;

import android.content.ActivityNotFoundException;
import com.revolut.feature.revolutpay.impl.ui.native_move_money.RevolutPayMoveMoneyFlowContract$Step;
import com.revolut.kompot.common.ExternalDestination;
import cp5.d;
import e54.r;
import e9c.b;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import rd0.c;
import zhm.f0;
import zhm.h0;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements b {
    public final r8c.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f9c.a f84504p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final RevolutPayMoveMoneyFlowContract$InputData f84505q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final yki.a f84506r;

    public a(r8c.a moveMoneyNavigationProvider, f9c.a returnCommandBuilder, RevolutPayMoveMoneyFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(moveMoneyNavigationProvider, "moveMoneyNavigationProvider");
        Intrinsics.checkNotNullParameter(returnCommandBuilder, "returnCommandBuilder");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = moveMoneyNavigationProvider;
        this.f84504p = returnCommandBuilder;
        this.f84505q = inputData;
        r rVar = new r(this, 18);
        this.f84506r = d.a(this, RevolutPayMoveMoneyFlowContract$Step.MoveMoney.f84503a, f0.f322471a, rVar);
    }

    public final void I2() {
        RevolutPayMoveMoneyFlowContract$InputData revolutPayMoveMoneyFlowContract$InputData = this.f84505q;
        String str = revolutPayMoveMoneyFlowContract$InputData.f84500a;
        if (str == null) {
            str = "";
        }
        String str2 = revolutPayMoveMoneyFlowContract$InputData.f84501b;
        try {
            C1(new ExternalDestination.ByIntent(this.f84504p.a(str, str2 != null ? str2 : ""), null));
        } catch (ActivityNotFoundException e) {
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(c.ERROR, null, null, e, h0Var);
        }
        h.D2(this.f84506r);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f84506r;
    }
}
