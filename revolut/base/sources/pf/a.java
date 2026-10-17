package pf;

import cf.b;
import com.google.firebase.messaging.t;
import e4m.e;
import pd.g;
import vc.s;

/* JADX INFO: loaded from: classes.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f235406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f235407b;

    public /* synthetic */ a(t tVar, int i) {
        this.f235406a = i;
        this.f235407b = tVar;
    }

    @Override // phm.a
    public final Object get() {
        switch (this.f235406a) {
            case 0:
                g gVar = (g) this.f235407b.f49543b;
                s.k(gVar);
                return gVar;
            case 1:
                df.e eVar = (df.e) this.f235407b.f49544c;
                s.k(eVar);
                return eVar;
            case 2:
                b bVar = (b) this.f235407b.d;
                s.k(bVar);
                return bVar;
            default:
                b bVar2 = (b) this.f235407b.e;
                s.k(bVar2);
                return bVar2;
        }
    }
}
