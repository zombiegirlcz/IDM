package rfm;

import android.nfc.Tag;
import android.nfc.tech.IsoDep;
import io.reactivex.exceptions.CompositeException;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 extends efm.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a31.l f253944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f2i.o f253945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f2i.o f253946c;

    public h0(a31.l lVar, f2i.o oVar, f2i.o oVar2) {
        this.f253944a = lVar;
        this.f253945b = oVar;
        this.f253946c = oVar2;
    }

    @Override // efm.k
    public final void j(efm.l lVar) {
        f2i.o oVar = this.f253946c;
        try {
            IsoDep isoDep = IsoDep.get((Tag) this.f253944a.f978b);
            try {
                ((efm.k) ((efm.n) this.f253945b.apply(isoDep))).i(new g0(lVar, isoDep, oVar));
            } catch (Throwable th10) {
                m70.a.u(th10);
                try {
                    oVar.accept(isoDep);
                    lfm.e.c(th10, lVar);
                } catch (Throwable th11) {
                    m70.a.u(th11);
                    lfm.e.c(new CompositeException(th10, th11), lVar);
                }
            }
        } catch (Throwable th12) {
            m70.a.u(th12);
            lfm.e.c(th12, lVar);
        }
    }
}
