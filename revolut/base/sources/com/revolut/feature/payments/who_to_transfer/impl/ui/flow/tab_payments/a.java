package com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments;

import com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.TabPaymentsFlowContract$InputData;
import com.revolut.feature.payments.who_to_transfer.impl.ui.flow.tab_payments.TabPaymentsFlowContract$Step;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.kompot.navigable.TransitionAnimation;
import d8l.d;
import j2c.n;
import j5a.b;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import ue0.c;
import yki.i;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements b {
    public final TabPaymentsFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final pn3.a f80185p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final s70.a f80186q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k5a.a f80187r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c f80188s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f80189t;

    public a(TabPaymentsFlowContract$InputData inputData, pn3.a contactsPermissionsController, s70.a intentProvider, k5a.a findFriendsScreenProvider, c storage) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(contactsPermissionsController, "contactsPermissionsController");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(findFriendsScreenProvider, "findFriendsScreenProvider");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.o = inputData;
        this.f80185p = contactsPermissionsController;
        this.f80186q = intentProvider;
        this.f80187r = findFriendsScreenProvider;
        this.f80188s = storage;
        this.f80189t = d.a(this, new n(this, 7));
    }

    public final void I2(yki.b bVar) {
        TabPaymentsFlowContract$InputData tabPaymentsFlowContract$InputData = this.o;
        if (tabPaymentsFlowContract$InputData instanceof TabPaymentsFlowContract$InputData.ChatInputData) {
            h.t2(this, bVar, new TabPaymentsFlowContract$Step.Chats(((TabPaymentsFlowContract$InputData.ChatInputData) tabPaymentsFlowContract$InputData).f80180a), false, TransitionAnimation.FADE.f98392a, false, 8);
        } else {
            if (!Intrinsics.f(tabPaymentsFlowContract$InputData, TabPaymentsFlowContract$InputData.FindFriendsInputData.f80181a)) {
                throw new NoWhenBranchMatchedException();
            }
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Chat screen cannot be opened for this input data");
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, illegalArgumentException, h0Var);
        }
    }

    @Override // yki.j
    public final void M0() {
        TabPaymentsFlowContract$InputData.FindFriendsInputData findFriendsInputData = TabPaymentsFlowContract$InputData.FindFriendsInputData.f80181a;
        TabPaymentsFlowContract$InputData tabPaymentsFlowContract$InputData = this.o;
        boolean zF = Intrinsics.f(tabPaymentsFlowContract$InputData, findFriendsInputData);
        i iVar = this.f80189t;
        if (zF) {
            h.w2(iVar, TabPaymentsFlowContract$Step.FindFriendsScreen.f80183a, ModalDestination.Style.FULLSCREEN_SLIDE_FROM_BOTTOM.f98309a);
        } else {
            if (!(tabPaymentsFlowContract$InputData instanceof TabPaymentsFlowContract$InputData.ChatInputData)) {
                throw new NoWhenBranchMatchedException();
            }
            h.u2(this, iVar, !((Boolean) z9h.n.h(Boolean.TYPE, this.f80188s, "TAB_PAYMENTS_INITIAL_SCREEN_DISPLAYED", Boolean.FALSE)).booleanValue() ? new TabPaymentsFlowContract$Step.InitialScreen(((TabPaymentsFlowContract$InputData.ChatInputData) tabPaymentsFlowContract$InputData).f80180a) : new TabPaymentsFlowContract$Step.Chats(((TabPaymentsFlowContract$InputData.ChatInputData) tabPaymentsFlowContract$InputData).f80180a), null, 6);
        }
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f80189t;
    }
}
