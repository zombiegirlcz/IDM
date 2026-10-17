package pfm;

import efm.d0;
import efm.f0;

/* JADX INFO: loaded from: classes13.dex */
public final class z extends d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f235779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f235780c;
    public final Object d;

    public /* synthetic */ z(Object obj2, int i, Object obj3, Object obj4) {
        this.f235778a = i;
        this.f235780c = obj2;
        this.f235779b = obj4;
        this.d = obj3;
    }

    @Override // efm.d0
    public final void r(f0 f0Var) {
        switch (this.f235778a) {
            case 0:
                ((efm.b) this.f235780c).d(new ao.h(this, f0Var, 23));
                break;
            default:
                ((d0) this.f235780c).q(new u0a.a(this, f0Var, 3));
                break;
        }
    }
}
