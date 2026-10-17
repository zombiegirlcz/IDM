package com.revolut.retail.feature.payments.peer_to_peer.impl.ui_kompot.review;

import bsf.i;
import cli.g;
import cli.y;
import com.revolut.retail.feature.payments.peer_to_peer.api.models.PeerToPeerTransferData;
import com.revolut.retail.feature.payments.peer_to_peer.api.navigation.PeerToPeerReviewScreenInputData;
import iuf.b0;
import jid.z;
import kkf.z7;
import klf.a3;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import l0c.v;
import l80.e;
import l9j.j;
import l9k.k;
import l9k.n;
import l9k.p;
import l9k.t;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vkm.q;
import yji.l;
import zhm.f0;
import zhm.h0;
import zof.f;

/* JADX INFO: loaded from: classes11.dex */
public final class a extends h implements k {

    @NotNull
    public static final p Companion = new p();
    public final com.revolut.kompot.navigable.vc.modal.a A;
    public final PeerToPeerReviewScreenInputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final z f102366p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p9k.a f102367q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f102368r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f102369s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final yof.a f102370t;
    public final e u;
    public final tga.k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final i5k.a f102371w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final vrf.h f102372x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final i f102373y;
    public final y z;

    public a(PeerToPeerReviewScreenInputData inputData, z interactor, p9k.a transferDataObserver, j60.a bottomDialogExtension, f transferFeatureScreensProvider, yof.a recipientTrustMapper, e dateProvider, tga.k pricingPlanUpgradeEntryPointItemProvider, i5k.a appFraudCheckExtension, vrf.h sectionFactory, i transferReasonLauncherExtension, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        Intrinsics.checkNotNullParameter(transferDataObserver, "transferDataObserver");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(transferFeatureScreensProvider, "transferFeatureScreensProvider");
        Intrinsics.checkNotNullParameter(recipientTrustMapper, "recipientTrustMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(pricingPlanUpgradeEntryPointItemProvider, "pricingPlanUpgradeEntryPointItemProvider");
        Intrinsics.checkNotNullParameter(appFraudCheckExtension, "appFraudCheckExtension");
        Intrinsics.checkNotNullParameter(sectionFactory, "sectionFactory");
        Intrinsics.checkNotNullParameter(transferReasonLauncherExtension, "transferReasonLauncherExtension");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f102366p = interactor;
        this.f102367q = transferDataObserver;
        this.f102368r = bottomDialogExtension;
        this.f102369s = transferFeatureScreensProvider;
        this.f102370t = recipientTrustMapper;
        this.u = dateProvider;
        this.v = pricingPlanUpgradeEntryPointItemProvider;
        this.f102371w = appFraudCheckExtension;
        this.f102372x = sectionFactory;
        this.f102373y = transferReasonLauncherExtension;
        this.z = d.b(this, new l9k.i(inputData.f102272a, inputData.f102274c, null, null, f0.f322471a), stateMapper, null, false, 12);
        this.A = hx7.e.a(this, new v(this, 20));
    }

    @Override // yji.l
    public final void I1() {
        PeerToPeerTransferData peerToPeerTransferData = this.o.f102274c;
        if (cp5.d.A(peerToPeerTransferData.f102246c) && cp5.d.A(peerToPeerTransferData.f102245b)) {
            Continuation continuation = null;
            l.a1(this, mo3.a.g(q.Q(q.q(this.z.B(new l9j.k(11))), new a3(continuation, this, 24)), null, new j(2), 1), null, null, new t(this, continuation, 0), 3);
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.A;
    }

    @Override // yji.l
    public final void T1(long j2) {
        l9j.k kVar = new l9j.k(12);
        y yVar = this.z;
        Continuation continuation = null;
        l.b1(this, q.Q(q.q(yVar.B(kVar)), new gs.n(continuation, this, 3)), null, new t(this, continuation, 1), 3);
        l.b1(this, rd0.e.d(q.Q(q.q(new z7(yVar.B(new l9j.k(13)), this, 20)), new b0(null, this.f102372x, 1)), h0.f322473a), null, new t(this, continuation, 2), 3);
    }

    @Override // cli.z
    public final g getState() {
        return this.z;
    }
}
