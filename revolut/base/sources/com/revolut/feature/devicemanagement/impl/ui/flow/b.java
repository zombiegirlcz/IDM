package com.revolut.feature.devicemanagement.impl.ui.flow;

import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.delegates.CellDetailsStandaloneNoteDelegate;
import com.revolut.core.ui_kit.delegates.CellDetailsSwitcherDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.devicemanagement.api.navigation.DeviceManagementDestination;
import com.revolut.feature.devicemanagement.impl.R$string;
import com.revolut.feature.devicemanagement.impl.ui.flow.DeviceManagementFlowContract$Step;
import com.revolut.kompot.navigable.flow.FlowStep;
import h86.f;
import hx7.e;
import ip0.tm0;
import ip0.um0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import oki.h;
import qv0.i;
import rp0.l;
import rp0.t;
import rp0.y;
import u7k.w;
import u86.d;
import zhm.f0;
import zhm.v;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends h implements d {
    public final kdh.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r86.d f71939p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final tla.d f71940q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f71941r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final qki.d f71942s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yki.a f71943t;

    public b(DeviceManagementDestination.Config input, kdh.b deviceManagementInteractor, r86.d deviceDetailsMapper, tla.d profileAppNavigationCommandsProvider, j60.a bottomDialog) {
        FlowStep deviceDetails;
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(deviceManagementInteractor, "deviceManagementInteractor");
        Intrinsics.checkNotNullParameter(deviceDetailsMapper, "deviceDetailsMapper");
        Intrinsics.checkNotNullParameter(profileAppNavigationCommandsProvider, "profileAppNavigationCommandsProvider");
        Intrinsics.checkNotNullParameter(bottomDialog, "bottomDialog");
        this.o = deviceManagementInteractor;
        this.f71939p = deviceDetailsMapper;
        this.f71940q = profileAppNavigationCommandsProvider;
        this.f71941r = bottomDialog;
        this.f71942s = e.b(this, new DeviceManagementFlowContract$FlowState(null));
        if (Intrinsics.f(input, DeviceManagementDestination.Config.Home.f71934a)) {
            deviceDetails = DeviceManagementFlowContract$Step.DeviceList.f71937a;
        } else {
            if (!(input instanceof DeviceManagementDestination.Config.DeviceDetails)) {
                throw new NoWhenBranchMatchedException();
            }
            deviceDetails = new DeviceManagementFlowContract$Step.DeviceDetails((DeviceManagementDestination.Config.DeviceDetails) input);
        }
        this.f71943t = cp5.d.a(this, deviceDetails, f0.f322471a, new w(this, 2));
    }

    public final void I2(f logOutAction) {
        t tVar;
        List list;
        this.f71939p.getClass();
        Intrinsics.checkNotNullParameter(logOutAction, "logOutAction");
        boolean z = logOutAction instanceof h86.d;
        if (z) {
            tVar = new t(new TextLocalisedClause(R$string.devices_logout_bottom_sheet_title, null, null, 14), new TextLocalisedClause(R$string.devices_logout_bottom_sheet_subtitle, null, null, 14), null, 28);
        } else {
            if (!(logOutAction instanceof h86.e)) {
                throw new NoWhenBranchMatchedException();
            }
            tVar = new t(new TextLocalisedClause(R$string.devices_logout_bottom_sheet_title, null, null, 14), null, null, 30);
        }
        t tVar2 = tVar;
        if (z) {
            list = f0.f322471a;
        } else {
            if (!(logOutAction instanceof h86.e)) {
                throw new NoWhenBranchMatchedException();
            }
            List listK = v.k(new CellDetailsSwitcherDelegate.Model("LOG_OUT_DIALOG_FORGET_THIS_DEVICE_TITLE", new TextLocalisedClause(R$string.retail_main_logout_forget_device_title, null, null, 14), ((h86.e) logOutAction).f149946a, true, 0, null, logOutAction, null, 4016), new CellDetailsStandaloneNoteDelegate.Model("LOG_OUT_DIALOG_FORGET_THIS_DEVICE_DESCRIPTION", null, new TextLocalisedClause(R$string.retail_main_logout_forget_device_description, null, null, 14), null, null, false, null, 0, 0, 2042));
            yp0.b.k(listK, 0, R$attr.uikit_dp0, 0, 0, 29);
            list = listK;
        }
        s0 s0Var = new s0(2);
        s0Var.b(list.toArray(new i[0]));
        um0 um0Var = new um0("DEVICE_TWIN_BUTTONS_LIST_ID", new tm0(LargeActionButton.ButtonStyle.f58726b, null, new TextLocalisedClause(R$string.devices_cancel, null, null, 14), false, null, null, 56), new tm0(LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.devices_log_out, null, null, 14), false, null, null, 56), (Object) logOutAction, (AnalyticsContext) null, (AnalyticsContext) null, 0, 0, 0, 1008);
        yp0.b.r(um0Var, 0, 0, 0, 0, 15);
        s0Var.a(um0Var);
        ArrayList arrayList = s0Var.f186433a;
        this.f71941r.x(new y(v.k(arrayList.toArray(new Object[arrayList.size()])), tVar2, l.WINDOW, null, null, null, 1016));
    }

    @Override // qki.e
    public final qki.d getState() {
        return this.f71942s;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f71943t;
    }
}
