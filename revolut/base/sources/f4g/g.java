package f4g;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g implements e4m.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f132115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f132116b;

    public /* synthetic */ g(b bVar, xki.e eVar, int i) {
        this.f132115a = i;
        this.f132116b = bVar;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f132115a) {
            case 0:
                f5g.a bookingItemMapper = new f5g.a();
                Intrinsics.checkNotNullParameter(bookingItemMapper, "bookingItemMapper");
                return new f5g.k(new f5g.n(), (b4g.j) this.f132116b.D.get());
            case 1:
                return new i6g.m(new i6g.n(), new fn2.c((b4g.a0) this.f132116b.A.get()));
            default:
                return new h5g.e(new at.r(new f5g.a()), (b4g.j) this.f132116b.D.get());
        }
    }

    public g(b bVar) {
        this.f132115a = 1;
        this.f132116b = bVar;
    }
}
