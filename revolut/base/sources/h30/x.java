package h30;

import com.google.common.collect.ImmutableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes19.dex */
public final class x implements xki.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e4m.e f148979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e4m.e f148980c;
    public e4m.e d;
    public e4m.e e;
    public e4m.e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e4m.e f148981g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e4m.e f148982h;
    public e4m.e i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e4m.e f148983j;
    public e4m.e k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e4m.e f148984l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e4m.e f148985m;

    public /* synthetic */ x(int i) {
        this.f148978a = i;
    }

    @Override // xki.e
    public final Set f() {
        switch (this.f148978a) {
            case 0:
                yji.n nVar = (yji.n) this.f148983j.get();
                y9l.a aVar = (y9l.a) this.e.get();
                xhi.f.j(aVar);
                return ImmutableSet.of(nVar, (yji.n) aVar, (yji.n) this.k.get());
            default:
                yji.n nVar2 = (yji.n) this.f148983j.get();
                y9l.a aVar2 = (y9l.a) this.e.get();
                xhi.f.j(aVar2);
                return ImmutableSet.of(nVar2, (yji.n) aVar2, (yji.n) this.k.get());
        }
    }

    @Override // xki.e
    public final Set g() {
        switch (this.f148978a) {
        }
        return ImmutableSet.of((yji.d) this.d.get());
    }
}
