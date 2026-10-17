package com.revolut.feature.onboarding.impl.onboarding.waiting_list.awaiting;

import cli.g;
import cli.k;
import cli.n;
import cli.y;
import db9.f;
import hx7.e;
import kotlin.jvm.internal.Intrinsics;
import mra.d;
import nd.o;
import oki.h;
import r70.c;
import x2g.b;
import xb9.j;

/* JADX INFO: loaded from: classes5.dex */
public final class a extends h implements j {
    public final WaitingListAwaitingScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n8b.a f78503p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c70.a f78504q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f78505r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o f78506s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final jx0.a f78507t;
    public final f u;
    public final f01.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y f78508w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f78509x;

    public a(n stateMapper, WaitingListAwaitingScreenContract$InputData inputData, n8b.a countryInteractor, c70.a clipboard, c hapticEngine, o chooserIntentNavigationCommandFactory, jx0.a referralsInviteFriendsInteractor, f waitingListInteractor, f01.a uiKitResources) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(clipboard, "clipboard");
        Intrinsics.checkNotNullParameter(hapticEngine, "hapticEngine");
        Intrinsics.checkNotNullParameter(chooserIntentNavigationCommandFactory, "chooserIntentNavigationCommandFactory");
        Intrinsics.checkNotNullParameter(referralsInviteFriendsInteractor, "referralsInviteFriendsInteractor");
        Intrinsics.checkNotNullParameter(waitingListInteractor, "waitingListInteractor");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.o = inputData;
        this.f78503p = countryInteractor;
        this.f78504q = clipboard;
        this.f78505r = hapticEngine;
        this.f78506s = chooserIntentNavigationCommandFactory;
        this.f78507t = referralsInviteFriendsInteractor;
        this.u = waitingListInteractor;
        this.v = uiKitResources;
        this.f78508w = d.b(this, k.f25028a, stateMapper, null, false, 12);
        this.f78509x = e.a(this, new b(this, 16));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.onboarding.impl.onboarding.waiting_list.awaiting.a r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof xb9.m
            if (r0 == 0) goto L13
            r0 = r6
            xb9.m r0 = (xb9.m) r0
            int r1 = r0.f304028w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f304028w = r1
            goto L18
        L13:
            xb9.m r0 = new xb9.m
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f304028w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r6)
            goto L43
        L28:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            yhm.o.b(r6)
            wm3.j r6 = new wm3.j
            r2 = 9
            r6.<init>(r5, r3, r2)
            r0.f304028w = r4
            java.lang.Object r6 = r5.p2(r0, r6)
            if (r6 != r1) goto L43
            return r1
        L43:
            e99.a r6 = (e99.a) r6
            if (r6 == 0) goto L4d
            java.lang.String r0 = r6.f123936b
            if (r0 != 0) goto L4c
            goto L4d
        L4c:
            return r0
        L4d:
            if (r6 == 0) goto L5a
            java.lang.String r6 = r6.f123935a
            if (r6 == 0) goto L5a
            jx0.a r5 = r5.f78507t
            java.lang.String r5 = r5.i(r6)
            return r5
        L5a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.onboarding.impl.onboarding.waiting_list.awaiting.a.I2(com.revolut.feature.onboarding.impl.onboarding.waiting_list.awaiting.a, gim.c):java.lang.Object");
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f78509x;
    }

    @Override // cli.z
    public final g getState() {
        return this.f78508w;
    }
}
