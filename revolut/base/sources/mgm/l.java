package mgm;

import igm.o;
import java.util.Objects;
import java.util.Optional;

/* JADX INFO: loaded from: classes14.dex */
public final class l extends ngm.a {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o f205332g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(fgm.l lVar, o oVar, int i) {
        super(lVar);
        this.f = i;
        this.f205332g = oVar;
    }

    @Override // fgm.l
    public final void onNext(Object obj2) {
        switch (this.f) {
            case 0:
                if (!this.d) {
                    int i = this.e;
                    fgm.l lVar = this.f215230a;
                    if (i != 0) {
                        lVar.onNext(null);
                    } else {
                        try {
                            Object objApply = this.f205332g.apply(obj2);
                            Objects.requireNonNull(objApply, "The mapper returned a null Optional");
                            Optional optional = (Optional) objApply;
                            if (optional.isPresent()) {
                                lVar.onNext(optional.get());
                            }
                        } catch (Throwable th10) {
                            a(th10);
                            return;
                        }
                    }
                    break;
                }
                break;
            default:
                if (!this.d) {
                    int i2 = this.e;
                    fgm.l lVar2 = this.f215230a;
                    if (i2 != 0) {
                        lVar2.onNext(null);
                    } else {
                        try {
                            Object objApply2 = this.f205332g.apply(obj2);
                            Objects.requireNonNull(objApply2, "The mapper function returned a null value.");
                            lVar2.onNext(objApply2);
                        } catch (Throwable th11) {
                            a(th11);
                        }
                    }
                    break;
                }
                break;
        }
    }

    @Override // bhm.g
    public final Object poll() {
        Optional optional;
        switch (this.f) {
            case 0:
                break;
            default:
                Object objPoll = this.f215232c.poll();
                if (objPoll == null) {
                    return null;
                }
                Object objApply = this.f205332g.apply(objPoll);
                Objects.requireNonNull(objApply, "The mapper function returned a null value.");
                return objApply;
        }
        do {
            Object objPoll2 = this.f215232c.poll();
            if (objPoll2 == null) {
                return null;
            }
            Object objApply2 = this.f205332g.apply(objPoll2);
            Objects.requireNonNull(objApply2, "The mapper returned a null Optional");
            optional = (Optional) objApply2;
        } while (!optional.isPresent());
        return optional.get();
    }
}
