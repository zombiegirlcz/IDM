package com.revolut.feature.rev10_main_screen.impl.ui;

import aii.m;
import aii.n;
import aii.w;
import com.revolut.feature.rev10_main_screen.api.MainContainerScreenDestination;
import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import com.revolut.feature.rev10_main_screen.api.action.MainScreenContainerActionData;
import com.revolut.feature.rev10_main_screen.impl.ui.MainContainerFlowContract$InputData;
import com.revolut.feature.rev10_main_screen.impl.ui.MainContainerFlowContract$Step;
import com.revolut.kompot.navigable.TransitionAnimation;
import com.revolut.kompot.navigable.flow.FlowStep;
import com.revolut.kompot.navigable.vc.flow.BackStackEntry;
import cp5.d;
import ekg.g;
import ibb.c;
import java.util.Set;
import jtb.b;
import kbb.p;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import nkm.u;
import nkm.y;
import oki.h;
import pnf.f;
import qr0.i;
import sbb.r;
import vkm.j2;
import vkm.q;
import vkm.z1;
import yji.l;
import zhm.d0;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends h implements ptb.h {
    public final MainContainerFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f83438p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Set f83439q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f83440r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final rbb.a f83441s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ttb.a f83442t;
    public final g u;
    public final p v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final kdh.b f83443w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final yki.a f83444x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final z1 f83445y;
    public final j2 z;

    public a(MainContainerFlowContract$InputData inputData, b tabControllerFactory, Set controllerModelExtensions, i tabReselectedAndScreenIsAlreadyScrolledUpListener, rbb.a debugScreenNavigationDestinationProvider, ttb.a popUpMenuMapper, g uiPersonalisationInteractor, p mainTabProvider, kdh.b tabBarCustomisationStateHelper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(tabControllerFactory, "tabControllerFactory");
        Intrinsics.checkNotNullParameter(controllerModelExtensions, "controllerModelExtensions");
        Intrinsics.checkNotNullParameter(tabReselectedAndScreenIsAlreadyScrolledUpListener, "tabReselectedAndScreenIsAlreadyScrolledUpListener");
        Intrinsics.checkNotNullParameter(debugScreenNavigationDestinationProvider, "debugScreenNavigationDestinationProvider");
        Intrinsics.checkNotNullParameter(popUpMenuMapper, "popUpMenuMapper");
        Intrinsics.checkNotNullParameter(uiPersonalisationInteractor, "uiPersonalisationInteractor");
        Intrinsics.checkNotNullParameter(mainTabProvider, "mainTabProvider");
        Intrinsics.checkNotNullParameter(tabBarCustomisationStateHelper, "tabBarCustomisationStateHelper");
        this.o = inputData;
        this.f83438p = tabControllerFactory;
        this.f83439q = controllerModelExtensions;
        this.f83440r = tabReselectedAndScreenIsAlreadyScrolledUpListener;
        this.f83441s = debugScreenNavigationDestinationProvider;
        this.f83442t = popUpMenuMapper;
        this.u = uiPersonalisationInteractor;
        this.v = mainTabProvider;
        this.f83443w = tabBarCustomisationStateHelper;
        MainScreenTab f83432b = inputData.getF83432b();
        MainContainerFlowContract$InputData.Launch launch = inputData instanceof MainContainerFlowContract$InputData.Launch ? (MainContainerFlowContract$InputData.Launch) inputData : null;
        MainContainerFlowContract$Step.Tab tab2 = new MainContainerFlowContract$Step.Tab(f83432b, launch != null ? launch.d : null);
        MainScreenTab f83432b2 = inputData.getF83432b();
        MainScreenTab mainScreenTab = c.f160140a;
        this.f83444x = d.a(this, tab2, v.l(!Intrinsics.f(f83432b2, mainScreenTab) ? new BackStackEntry(new MainContainerFlowContract$Step.Tab(mainScreenTab, null), TransitionAnimation.NONE.f98393a) : null), new plb.g(this, 28));
        this.f83445y = q.b(0, 7, null);
        this.z = q.c(Boolean.FALSE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yji.l
    public final void I1() {
        MainScreenContainerActionData mainScreenContainerActionData;
        l.a1(this, q.q(this.f83443w.W()), null, null, new f(this, 0 == true ? 1 : 0, 13), 3);
        if (this.f83444x.u() == null) {
            MainContainerFlowContract$InputData mainContainerFlowContract$InputData = this.o;
            MainContainerFlowContract$InputData.Action action = mainContainerFlowContract$InputData instanceof MainContainerFlowContract$InputData.Action ? (MainContainerFlowContract$InputData.Action) mainContainerFlowContract$InputData : null;
            if (action == null || (mainScreenContainerActionData = action.f83431c) == null) {
                return;
            }
            I2(mainScreenContainerActionData);
        }
    }

    public final void I2(MainScreenContainerActionData actionData) {
        Intrinsics.checkNotNullParameter(actionData, "actionData");
        nkm.g gVar = new nkm.g(y.n(u.i(d0.Q(this.f83439q), etb.a.class), new pp5.d(actionData, 28)));
        while (gVar.hasNext()) {
            etb.a aVar = (etb.a) gVar.next();
            aVar.getClass();
            Intrinsics.checkNotNullParameter(actionData, "actionData");
            aVar.E(actionData);
        }
    }

    public final void J2(String tabId) {
        Intrinsics.checkNotNullParameter(tabId, "tabId");
        MainScreenTab tab2 = new MainScreenTab(tabId);
        Set set = this.f83439q;
        nkm.g gVar = new nkm.g(u.i(d0.Q(set), r.class));
        while (gVar.hasNext()) {
            ((r) gVar.next()).getClass();
            Intrinsics.checkNotNullParameter(tab2, "tab");
        }
        C2(new ptb.i(tab2));
        nkm.g gVar2 = new nkm.g(u.i(d0.Q(set), r.class));
        while (gVar2.hasNext()) {
            r rVar = (r) gVar2.next();
            rVar.getClass();
            Intrinsics.checkNotNullParameter(tab2, "tab");
            if (tab2.equals(c.f160140a)) {
                rVar.f261558m.onNext(Unit.f186387a);
            }
        }
        yki.a aVar = this.f83444x;
        FlowStep flowStepD = aVar.d();
        MainContainerFlowContract$Step.Tab tab3 = flowStepD instanceof MainContainerFlowContract$Step.Tab ? (MainContainerFlowContract$Step.Tab) flowStepD : null;
        if (!Intrinsics.f(tab3 != null ? tab3.f83436a : null, tab2)) {
            h.s2(aVar, new MainContainerFlowContract$Step.Tab(tab2, null), !aVar.c(), TransitionAnimation.NONE.f98393a, true);
        }
        this.v.getClass();
        if (tab2.equals(c.f160140a)) {
            h.r2(aVar);
        }
    }

    @Override // yji.l
    public final n o2(m event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof aii.v) {
            aii.u uVar = ((aii.v) event).f5294b;
            if (uVar instanceof MainContainerScreenDestination.JustShow) {
                MainContainerScreenDestination.JustShow justShow = (MainContainerScreenDestination.JustShow) uVar;
                if (justShow.f83416c == null && justShow.f83415b == null && justShow.d == null) {
                    J2(justShow.f83414a);
                    return w.f5295a;
                }
            }
        }
        return super.o2(event);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f83444x;
    }
}
