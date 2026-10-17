package com.revolut.feature_rev_points_pocket_impl.ui.flow;

import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.feature.subaccount.accounts.models.ExtendedSubaccountType;
import com.revolut.feature.tab.accounts.api.model.TabAccountsInitialPayload;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.feature_move_money.api.navigation.MoveMoneyDestination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.shared.feature.move_money.api.navigation.Action;
import com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData;
import com.revolut.shared.feature.move_money.api.navigation.StartUpPocket;
import cp5.d;
import ibb.c;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import r6f.i;
import rdi.b;
import zh9.u0;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements b {
    public final yki.a o;

    public a(RevPointsPocketFlowContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.o = d.a(this, inputData.f97810a, f0.f322471a, new i(this, 14));
    }

    public static MoveMoneyDestination I2(Long l2) {
        return new MoveMoneyDestination(new MoveMoneyInputData(new Action.MoveWithFixedAccount(StartUpPocket.RevPointsPocket.f104862a, com.revolut.shared.feature.move_money.api.navigation.b.TARGET, k8l.a.ADD, l2.longValue(), null, SyslogConstants.LOG_LOCAL6), (Set) null, 6), null);
    }

    public static BridgeDestination J2(String str, TabAccountsInitialPayload.Action action) {
        return u0.c(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(c.f160140a.f83420a, null), new TabAccountsLaunchConfig(new ProductAccountDescriptor$Value.Main(new ProductAccountId(str, ExtendedSubaccountType.RevPoints.INSTANCE), ProductId.SUBACCOUNT), action), null, 4)));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.o;
    }
}
