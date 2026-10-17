package qy2;

import com.revolut.feature.card_input.common.CardInputContract$Configuration;
import gsi.g;
import vc.s;
import xpi.d;
import ypi.f;
import ypi.h;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements g, d, f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f250120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public xoi.d f250121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public xpi.f f250122c;
    public h d;
    public CardInputContract$Configuration e;
    public final Object f;

    public /* synthetic */ b(Object obj2, int i) {
        this.f250120a = i;
        this.f = obj2;
    }

    @Override // ypi.f
    public final Object b(h hVar) {
        switch (this.f250120a) {
            case 0:
                hVar.getClass();
                this.d = hVar;
                break;
            default:
                hVar.getClass();
                this.d = hVar;
                break;
        }
        return this;
    }

    @Override // gsi.g
    public final gsi.h build() {
        switch (this.f250120a) {
            case 0:
                s.h(this.f250121b, fsi.g.class);
                s.h(this.f250122c, xpi.f.class);
                s.h(this.d, h.class);
                s.h(this.e, CardInputContract$Configuration.class);
                return new c((a) this.f, this.f250121b, this.f250122c, this.d);
            default:
                s.h(this.f250121b, fsi.g.class);
                s.h(this.f250122c, xpi.f.class);
                s.h(this.d, h.class);
                s.h(this.e, CardInputContract$Configuration.class);
                return new sy2.a((sy2.b) this.f, this.f250121b, this.f250122c, this.d);
        }
    }

    @Override // gsi.g
    public final Object h(fsi.g gVar) {
        switch (this.f250120a) {
            case 0:
                this.f250121b = (xoi.d) gVar;
                break;
            default:
                this.f250121b = (xoi.d) gVar;
                break;
        }
        return this;
    }

    @Override // xpi.d
    public final Object k() {
        switch (this.f250120a) {
            case 0:
                this.f250122c = xpi.f.f307976c;
                break;
            default:
                this.f250122c = xpi.f.f307976c;
                break;
        }
        return this;
    }
}
