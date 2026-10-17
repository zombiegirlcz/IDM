package za8;

import cli.y;
import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends oki.h implements g {
    public final hj8.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final kbb.c f320581p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o7.d f320582q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ang.f f320583r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f320584s;

    public k(l stateMapper, hj8.a juniorProfileInteractor, kbb.c juniorConfigInteractor, o7.d jisaDateOfBirthValidator, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(juniorConfigInteractor, "juniorConfigInteractor");
        Intrinsics.checkNotNullParameter(jisaDateOfBirthValidator, "jisaDateOfBirthValidator");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.o = juniorProfileInteractor;
        this.f320581p = juniorConfigInteractor;
        this.f320582q = jisaDateOfBirthValidator;
        this.f320583r = userInteractor;
        this.f320584s = mra.d.b(this, new c(new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        hj8.a aVar = this.o;
        w4l.h hVar = w4l.h.f294642c;
        yji.l.a1(this, nim.a.v(u0.i(hj8.a.e(aVar, hVar), rd0.e.b(this.f320581p.O(false)), this.f320583r.j(hVar)), new z2.a(this, 29)), null, null, new yy6.f(this, null, 20), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f320584s;
    }
}
