package com.revolut.feature_rev_points_pocket_impl.ui.add_money;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.feature_rev_points_pocket_impl.ui.add_money.RevPointsAddMoneyFlowContract$Step;
import com.revolut.shared.feature.move_money.api.navigation.Action;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import cp5.d;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import qdi.b;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements b {
    public final yki.a o;

    public a(RevPointsAddMoneyFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = d.a(this, new RevPointsAddMoneyFlowContract$Step.MoveMoney(new MoveMoneyInputData(new Action.MoveWithFixedAccount(StartUpPocket.RevPointsPocket.f104862a, com.revolut.shared.feature.move_money.api.navigation.b.TARGET, k8l.a.ADD, 0L, null, SyslogConstants.LOG_LOCAL6), (Set) null, 6)), f0.f322471a, new qce.b(this, inputData, 1));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
