package sgm;

import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class r1 extends ngm.a {
    public final igm.o f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Object f263115g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f263116h;

    public r1(fgm.l lVar, igm.o oVar, igm.d dVar) {
        super(lVar);
        this.f = oVar;
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        if (this.d) {
            return;
        }
        int i = this.e;
        fgm.l lVar = this.f215230a;
        if (i != 0) {
            lVar.onNext(obj2);
            return;
        }
        try {
            Object objApply = this.f.apply(obj2);
            if (this.f263116h) {
                boolean zEquals = Objects.equals(this.f263115g, objApply);
                this.f263115g = objApply;
                if (zEquals) {
                    return;
                }
            } else {
                this.f263116h = true;
                this.f263115g = objApply;
            }
            lVar.onNext(obj2);
        } catch (Throwable th10) {
            a(th10);
        }
    }

    @Override // bhm.g
    public final Object poll() {
        while (true) {
            Object objPoll = this.f215232c.poll();
            if (objPoll == null) {
                return null;
            }
            Object objApply = this.f.apply(objPoll);
            if (!this.f263116h) {
                this.f263116h = true;
                this.f263115g = objApply;
                return objPoll;
            }
            if (!Objects.equals(this.f263115g, objApply)) {
                this.f263115g = objApply;
                return objPoll;
            }
            this.f263115g = objApply;
        }
    }
}
