package tic;

import kotlin.jvm.internal.Intrinsics;
import oki.h;
import sqd.h0;
import yki.i;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends h implements b {
    public final ugc.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e f271477p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final i f271478q;

    public d(ugc.a conciergeAlbertineInteractor, e partnershipsConciergeAlbertineRedeemStatusDialogFactory) {
        Intrinsics.checkNotNullParameter(conciergeAlbertineInteractor, "conciergeAlbertineInteractor");
        Intrinsics.checkNotNullParameter(partnershipsConciergeAlbertineRedeemStatusDialogFactory, "partnershipsConciergeAlbertineRedeemStatusDialogFactory");
        this.o = conciergeAlbertineInteractor;
        this.f271477p = partnershipsConciergeAlbertineRedeemStatusDialogFactory;
        this.f271478q = d8l.d.a(this, new tc6.b(27));
    }

    @Override // yki.j
    public final void M0() {
        l2(new h0(this, null, 27), new yi5.b(26));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f271478q;
    }
}
