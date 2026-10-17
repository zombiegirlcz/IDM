package h08;

import com.revolut.feature.insurance_pet.impl.ui.hub.issues.renewal.RenewalDetailsContract$Configuration;
import vc.s;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements gsi.g, xpi.d, iqi.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public xoi.d f148297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public xpi.f f148298c;
    public iqi.g d;
    public RenewalDetailsContract$Configuration e;
    public final Object f;

    public /* synthetic */ i(Object obj2, int i) {
        this.f148296a = i;
        this.f = obj2;
    }

    @Override // iqi.e
    public final Object a(iqi.g gVar) {
        switch (this.f148296a) {
            case 0:
                this.d = iqi.g.f167870b;
                break;
            default:
                this.d = iqi.g.f167870b;
                break;
        }
        return this;
    }

    @Override // gsi.g
    public final gsi.h build() {
        switch (this.f148296a) {
            case 0:
                s.h(this.f148297b, fsi.g.class);
                s.h(this.f148298c, xpi.f.class);
                s.h(this.d, iqi.g.class);
                s.h(this.e, RenewalDetailsContract$Configuration.class);
                return new j((h) this.f, this.f148297b, this.f148298c, this.d, this.e);
            default:
                s.h(this.f148297b, fsi.g.class);
                s.h(this.f148298c, xpi.f.class);
                s.h(this.d, iqi.g.class);
                s.h(this.e, RenewalDetailsContract$Configuration.class);
                return new wy7.h((wy7.f) this.f, this.f148297b, this.f148298c, this.d, this.e);
        }
    }

    @Override // gsi.g
    public final Object h(fsi.g gVar) {
        switch (this.f148296a) {
            case 0:
                this.f148297b = (xoi.d) gVar;
                break;
            default:
                this.f148297b = (xoi.d) gVar;
                break;
        }
        return this;
    }

    @Override // xpi.d
    public final Object k() {
        switch (this.f148296a) {
            case 0:
                this.f148298c = xpi.f.d;
                break;
            default:
                this.f148298c = xpi.f.d;
                break;
        }
        return this;
    }
}
