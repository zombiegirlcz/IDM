package tfm;

/* JADX INFO: loaded from: classes13.dex */
public final class d2 extends ofm.a {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f270405g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d2(efm.y yVar, Object obj2, int i) {
        super(yVar);
        this.f = i;
        this.f270405g = obj2;
    }

    @Override // efm.y
    public final void onNext(Object obj2) {
        switch (this.f) {
            case 0:
                int i = this.e;
                efm.y yVar = this.f224907a;
                if (i != 0) {
                    yVar.onNext(null);
                } else {
                    try {
                        if (((kfm.p) this.f270405g).test(obj2)) {
                            yVar.onNext(obj2);
                        }
                    } catch (Throwable th10) {
                        c(th10);
                        return;
                    }
                }
                break;
            default:
                if (!this.d) {
                    int i2 = this.e;
                    efm.y yVar2 = this.f224907a;
                    if (i2 != 0) {
                        yVar2.onNext(null);
                    } else {
                        try {
                            Object objApply = ((kfm.o) this.f270405g).apply(obj2);
                            mfm.f.b(objApply, "The mapper function returned a null value.");
                            yVar2.onNext(objApply);
                        } catch (Throwable th11) {
                            c(th11);
                        }
                    }
                    break;
                }
                break;
        }
    }

    @Override // nfm.j
    public final Object poll() {
        Object objPoll;
        switch (this.f) {
            case 0:
                break;
            default:
                Object objPoll2 = this.f224909c.poll();
                if (objPoll2 == null) {
                    return null;
                }
                Object objApply = ((kfm.o) this.f270405g).apply(objPoll2);
                mfm.f.b(objApply, "The mapper function returned a null value.");
                return objApply;
        }
        do {
            objPoll = this.f224909c.poll();
            if (objPoll != null) {
            }
            return objPoll;
        } while (!((kfm.p) this.f270405g).test(objPoll));
        return objPoll;
    }
}
