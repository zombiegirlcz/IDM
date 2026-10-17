package na4;

import com.revolut.feature.credit.application.plugins.impl.ui.backendflow.CreditBackendFlowContract$Configuration;
import hqi.i;
import vc.s;
import ypi.h;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements gsi.g, hqi.g, ypi.f, xpi.d, iqi.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f213724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public xoi.d f213725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f213726c;
    public h d;
    public xpi.f e;
    public iqi.g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CreditBackendFlowContract$Configuration f213727g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f213728h;

    public /* synthetic */ c(Object obj2, int i) {
        this.f213724a = i;
        this.f213728h = obj2;
    }

    @Override // iqi.e
    public final Object a(iqi.g gVar) {
        switch (this.f213724a) {
            case 0:
                this.f = gVar;
                break;
            case 1:
                this.f = gVar;
                break;
            default:
                this.f = gVar;
                break;
        }
        return this;
    }

    @Override // ypi.f
    public final Object b(h hVar) {
        switch (this.f213724a) {
            case 0:
                this.d = hVar;
                break;
            case 1:
                this.d = hVar;
                break;
            default:
                this.d = hVar;
                break;
        }
        return this;
    }

    @Override // gsi.g
    public final gsi.h build() {
        switch (this.f213724a) {
            case 0:
                s.h(this.f213725b, fsi.g.class);
                s.h(this.f213726c, i.class);
                s.h(this.d, h.class);
                s.h(this.e, xpi.f.class);
                s.h(this.f, iqi.g.class);
                s.h(this.f213727g, CreditBackendFlowContract$Configuration.class);
                return new d((e) this.f213728h, this.f213725b, this.f213726c, this.d, this.e, this.f, this.f213727g);
            case 1:
                s.h(this.f213725b, fsi.g.class);
                s.h(this.f213726c, i.class);
                s.h(this.d, h.class);
                s.h(this.e, xpi.f.class);
                s.h(this.f, iqi.g.class);
                s.h(this.f213727g, CreditBackendFlowContract$Configuration.class);
                return new t64.b((t64.c) this.f213728h, this.f213725b, this.f213726c, this.d, this.e, this.f, this.f213727g);
            default:
                s.h(this.f213725b, fsi.g.class);
                s.h(this.f213726c, i.class);
                s.h(this.d, h.class);
                s.h(this.e, xpi.f.class);
                s.h(this.f, iqi.g.class);
                s.h(this.f213727g, CreditBackendFlowContract$Configuration.class);
                return new xg4.c((xg4.d) this.f213728h, this.f213725b, this.f213726c, this.d, this.e, this.f, this.f213727g);
        }
    }

    @Override // hqi.g
    public final Object g(i iVar) {
        switch (this.f213724a) {
            case 0:
                iVar.getClass();
                this.f213726c = iVar;
                break;
            case 1:
                iVar.getClass();
                this.f213726c = iVar;
                break;
            default:
                iVar.getClass();
                this.f213726c = iVar;
                break;
        }
        return this;
    }

    @Override // gsi.g
    public final Object h(fsi.g gVar) {
        switch (this.f213724a) {
            case 0:
                this.f213725b = (xoi.d) gVar;
                break;
            case 1:
                this.f213725b = (xoi.d) gVar;
                break;
            default:
                this.f213725b = (xoi.d) gVar;
                break;
        }
        return this;
    }

    @Override // xpi.d
    public final Object k() {
        switch (this.f213724a) {
            case 0:
                this.e = xpi.f.d;
                break;
            case 1:
                this.e = xpi.f.d;
                break;
            default:
                this.e = xpi.f.d;
                break;
        }
        return this;
    }
}
