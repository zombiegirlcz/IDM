package evc;

import cli.y;
import eu4.b0;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;

/* JADX INFO: loaded from: classes7.dex */
public final class n extends oki.h implements dli.b {
    public final kuc.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final zrc.d f129777p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y f129778q;

    public n(k stateMapper, kuc.f gamblingBlockExtension, zrc.d cryptoScaInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(gamblingBlockExtension, "gamblingBlockExtension");
        Intrinsics.checkNotNullParameter(cryptoScaInteractor, "cryptoScaInteractor");
        this.o = gamblingBlockExtension;
        this.f129777p = cryptoScaInteractor;
        this.f129778q = mra.d.b(this, new d(kuc.a.f189766a, false), stateMapper, null, false, 12);
    }

    public final void I2() {
        Intrinsics.i(((d) ((j2) this.f129778q.f22677a).getValue()).f129766a, "null cannot be cast to non-null type com.revolut.feature.security_hub.impl.ui.gambling_block_extension.GamblingBlockExtension.GamblingBlockState.Visible");
        ((kuc.l) this.o).Z2(!((kuc.c) r0).f189768a);
    }

    @Override // yji.l
    public final void T1(long j2) {
        yji.l.b1(this, ((kuc.l) this.o).o.B(new ksk.h(16)), null, new m(this, null, 0), 3);
        yji.l.b1(this, mo3.a.e(this.f129777p.d(), new b0(20), new b0(21)), null, new m(this, null, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f129778q;
    }
}
