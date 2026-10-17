package b05;

import com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.questionnaire.ForbearanceApplicationQuestionnaireContract$Configuration;
import gsi.g;
import hqi.i;
import vc.s;
import ypi.h;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements g, hqi.g, ypi.f, xpi.d, iqi.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public xoi.d f11569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f11570c;
    public h d;
    public xpi.f e;
    public iqi.g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ForbearanceApplicationQuestionnaireContract$Configuration f11571g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f11572h;

    public /* synthetic */ c(Object obj2, int i) {
        this.f11568a = i;
        this.f11572h = obj2;
    }

    @Override // iqi.e
    public final Object a(iqi.g gVar) {
        switch (this.f11568a) {
            case 0:
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
        switch (this.f11568a) {
            case 0:
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
        switch (this.f11568a) {
            case 0:
                s.h(this.f11569b, fsi.g.class);
                s.h(this.f11570c, i.class);
                s.h(this.d, h.class);
                s.h(this.e, xpi.f.class);
                s.h(this.f, iqi.g.class);
                s.h(this.f11571g, ForbearanceApplicationQuestionnaireContract$Configuration.class);
                return new d((e) this.f11572h, this.f11569b, this.f11570c, this.d, this.e, this.f, this.f11571g);
            default:
                s.h(this.f11569b, fsi.g.class);
                s.h(this.f11570c, i.class);
                s.h(this.d, h.class);
                s.h(this.e, xpi.f.class);
                s.h(this.f, iqi.g.class);
                s.h(this.f11571g, ForbearanceApplicationQuestionnaireContract$Configuration.class);
                return new xz4.b((xz4.d) this.f11572h, this.f11569b, this.f11570c, this.d, this.e, this.f, this.f11571g);
        }
    }

    @Override // hqi.g
    public final Object g(i iVar) {
        switch (this.f11568a) {
            case 0:
                this.f11570c = iVar;
                break;
            default:
                this.f11570c = iVar;
                break;
        }
        return this;
    }

    @Override // gsi.g
    public final Object h(fsi.g gVar) {
        switch (this.f11568a) {
            case 0:
                this.f11569b = (xoi.d) gVar;
                break;
            default:
                this.f11569b = (xoi.d) gVar;
                break;
        }
        return this;
    }

    @Override // xpi.d
    public final Object k() {
        switch (this.f11568a) {
            case 0:
                this.e = xpi.f.d;
                break;
            default:
                this.e = xpi.f.d;
                break;
        }
        return this;
    }
}
