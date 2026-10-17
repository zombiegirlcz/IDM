package sgm;

/* JADX INFO: loaded from: classes14.dex */
public final class s1 extends ngm.a {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f263142g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s1(fgm.l lVar, Object obj2, int i) {
        super(lVar);
        this.f = i;
        this.f263142g = obj2;
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        switch (this.f) {
            case 0:
                this.f215230a.onNext(obj2);
                if (this.e == 0) {
                    try {
                        ((igm.g) this.f263142g).accept(obj2);
                    } catch (Throwable th10) {
                        a(th10);
                        return;
                    }
                }
                break;
            default:
                int i = this.e;
                fgm.l lVar = this.f215230a;
                if (i != 0) {
                    lVar.onNext(null);
                } else {
                    try {
                        if (((igm.p) this.f263142g).test(obj2)) {
                            lVar.onNext(obj2);
                        }
                    } catch (Throwable th11) {
                        a(th11);
                        return;
                    }
                }
                break;
        }
    }

    @Override // bhm.g
    public final Object poll() {
        Object objPoll;
        switch (this.f) {
            case 0:
                Object objPoll2 = this.f215232c.poll();
                if (objPoll2 != null) {
                    ((igm.g) this.f263142g).accept(objPoll2);
                }
                return objPoll2;
        }
        do {
            objPoll = this.f215232c.poll();
            if (objPoll != null) {
            }
            return objPoll;
        } while (!((igm.p) this.f263142g).test(objPoll));
        return objPoll;
    }
}
