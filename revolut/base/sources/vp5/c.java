package vp5;

import bq.i;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.crypto.withdraw.impl.ui.addcryptobeneficiary.flow.CryptoWithdrawAddBeneficiaryFlowContract$AddAddressAction;
import com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.confirmation.CryptoWithdrawToAddressConfirmationActivity;
import com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.confirmation.CryptoWithdrawToAddressConfirmationContract$Configuration;
import fsi.g;
import gsi.h;
import java.util.Set;
import vn2.l;
import xpi.f;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements h {
    public final e4m.e A;
    public final e4m.e B;
    public final e4m.e C;
    public final e4m.e D;
    public final e4m.e E;
    public final e4m.e F;
    public final e4m.e G;
    public final e4m.e H;
    public final e4m.e I;
    public final e4m.e J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoi.d f291060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f291061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CryptoWithdrawToAddressConfirmationContract$Configuration f291062c;
    public final CryptoWithdrawToAddressConfirmationActivity d;
    public final d e;
    public final e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e4m.e f291063g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e4m.e f291064h;
    public final e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e4m.e f291065j;
    public final e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final e4m.e f291066l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e4m.e f291067m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e4m.e f291068n;
    public final e4m.e o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e4m.e f291069p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e4m.e f291070q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e4m.e f291071r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e4m.e f291072s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e4m.e f291073t;
    public final e4m.e u;
    public final e4m.e v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final e4m.e f291074w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final e4m.e f291075x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final e4m.e f291076y;
    public final e4m.e z;

    public c(d dVar, xoi.d dVar2, f fVar, CryptoWithdrawToAddressConfirmationActivity cryptoWithdrawToAddressConfirmationActivity, CryptoWithdrawToAddressConfirmationContract$Configuration cryptoWithdrawToAddressConfirmationContract$Configuration) {
        this.e = dVar;
        this.f291060a = dVar2;
        this.f291061b = fVar;
        this.f291062c = cryptoWithdrawToAddressConfirmationContract$Configuration;
        this.d = cryptoWithdrawToAddressConfirmationActivity;
        this.f = e4m.b.b(new l(dVar, this, 0, 7));
        this.f291063g = e4m.b.b(new l(dVar, this, 1, 7));
        this.f291064h = e4m.b.b(new l(dVar, this, 3, 7));
        this.i = e4m.b.b(new l(dVar, this, 2, 7));
        this.f291065j = e4m.b.b(new l(dVar, this, 4, 7));
        this.k = e4m.b.b(new l(dVar, this, 5, 7));
        this.f291066l = e4m.b.b(new l(dVar, this, 7, 7));
        this.f291067m = e4m.b.b(new l(dVar, this, 6, 7));
        this.f291068n = e4m.b.b(new l(dVar, this, 8, 7));
        this.o = e4m.b.b(new l(dVar, this, 9, 7));
        this.f291069p = e4m.b.b(new l(dVar, this, 10, 7));
        this.f291070q = e4m.b.b(new l(dVar, this, 11, 7));
        this.f291071r = e4m.b.b(new l(dVar, this, 13, 7));
        this.f291072s = e4m.b.b(new l(dVar, this, 12, 7));
        this.f291073t = e4m.b.b(new l(dVar, this, 15, 7));
        this.u = e4m.b.b(new l(dVar, this, 14, 7));
        this.v = e4m.b.b(new l(dVar, this, 16, 7));
        this.f291074w = e4m.b.b(new l(dVar, this, 18, 7));
        this.f291075x = e4m.b.b(new l(dVar, this, 17, 7));
        this.f291076y = e4m.b.b(new l(dVar, this, 19, 7));
        this.z = e4m.b.b(new l(dVar, this, 21, 7));
        this.A = e4m.b.b(new l(dVar, this, 20, 7));
        this.B = e4m.b.b(new l(dVar, this, 23, 7));
        this.C = e4m.b.b(new l(dVar, this, 22, 7));
        this.D = e4m.b.b(new l(dVar, this, 24, 7));
        this.E = e4m.b.b(new l(dVar, this, 26, 7));
        this.F = e4m.b.b(new l(dVar, this, 27, 7));
        this.G = e4m.b.b(new l(dVar, this, 28, 7));
        this.H = e4m.b.b(new l(dVar, this, 29, 7));
        this.I = e4m.b.b(new l(dVar, this, 30, 7));
        this.J = e4m.b.b(new l(dVar, this, 25, 7));
    }

    @Override // gsi.a
    public final yy0.f Q() {
        return i.j(this.f291060a);
    }

    @Override // gsi.a
    public final mz0.a V() {
        return i.p(this.f291060a);
    }

    @Override // gsi.a
    public final c01.d W() {
        return gmf.b.e(this.f291060a);
    }

    @Override // gsi.a
    public final py0.e X() {
        return gmf.b.g(this.f291060a);
    }

    @Override // gsi.a
    public final xy0.a Y() {
        return gmf.b.b(this.f291060a);
    }

    @Override // gsi.a
    public final h01.b Z() {
        return i.n(this.f291060a);
    }

    @Override // gsi.h
    public final g a() {
        return this.f291060a;
    }

    @Override // gsi.a
    public final jz0.d a0() {
        return gmf.b.d(this.f291060a);
    }

    @Override // gsi.a
    public final ty0.c b0() {
        return i.g(this.f291060a);
    }

    @Override // gsi.a
    public final lz0.g c0() {
        return gmf.b.f(this.f291060a);
    }

    @Override // gsi.a
    public final i01.b d0() {
        return gsi.d.p(this.f291060a);
    }

    @Override // gsi.a
    public final d01.g e0() {
        return gmf.b.c(this.f291060a);
    }

    @Override // gsi.a
    public final Set l0() {
        ImmutableSet.Builder builderBuilderWithExpectedSize = ImmutableSet.builderWithExpectedSize(21);
        builderBuilderWithExpectedSize.addAll((Iterable) i.k(this.f291060a));
        builderBuilderWithExpectedSize.add(this.f.get());
        builderBuilderWithExpectedSize.add(this.f291063g.get());
        builderBuilderWithExpectedSize.add(this.i.get());
        builderBuilderWithExpectedSize.add(this.f291065j.get());
        builderBuilderWithExpectedSize.add(this.k.get());
        builderBuilderWithExpectedSize.add(this.f291067m.get());
        builderBuilderWithExpectedSize.add(this.f291068n.get());
        builderBuilderWithExpectedSize.add(this.o.get());
        builderBuilderWithExpectedSize.add(this.f291069p.get());
        builderBuilderWithExpectedSize.add(this.f291070q.get());
        builderBuilderWithExpectedSize.add(this.f291072s.get());
        builderBuilderWithExpectedSize.add(this.u.get());
        d dVar = this.e;
        builderBuilderWithExpectedSize.add(new en.c((mm.d) dVar.N.get(), ImmutableMap.of(mm.e.class, (mm.b) new mm.f(), CryptoWithdrawAddBeneficiaryFlowContract$AddAddressAction.class, (mm.b) dVar.R.get(), qp5.d.class, (mm.b) dVar.U.get(), qp5.b.class, (mm.b) dVar.W.get(), op5.i.class, (mm.b) dVar.X.get())));
        builderBuilderWithExpectedSize.add(this.v.get());
        builderBuilderWithExpectedSize.add(this.f291075x.get());
        builderBuilderWithExpectedSize.add(this.f291076y.get());
        builderBuilderWithExpectedSize.add(this.A.get());
        builderBuilderWithExpectedSize.add(this.z.get());
        builderBuilderWithExpectedSize.add(this.C.get());
        return j6.a.g(this.D, builderBuilderWithExpectedSize);
    }

    @Override // gsi.a
    public final py0.f m0() {
        return gmf.b.i(this.f291060a);
    }
}
