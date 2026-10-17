package ang;

import akg.n;
import android.content.SharedPreferences;
import anf.p;
import dng.m;
import efm.d0;
import efm.r;
import g2e.t;
import hng.q;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import pfm.z;
import skm.a2;
import skm.p0;
import te0.w;
import w4l.k;
import zlg.r;

/* JADX INFO: loaded from: classes13.dex */
public final class f implements ylg.b {

    @NotNull
    private static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gng.a f7769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yk0.c f7770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zk0.b f7771c;
    public final zmg.d d;
    public final t e;
    public final gte.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Regex f7772g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Regex f7773h;
    public final Regex i;

    public f(gng.a userRepository, yk0.c userAvatarStorageProvider, zk0.b fileSystemRepository, zmg.d userRegisteredIdentitiesDecorator, t signinInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(userAvatarStorageProvider, "userAvatarStorageProvider");
        Intrinsics.checkNotNullParameter(fileSystemRepository, "fileSystemRepository");
        Intrinsics.checkNotNullParameter(userRegisteredIdentitiesDecorator, "userRegisteredIdentitiesDecorator");
        Intrinsics.checkNotNullParameter(signinInteractor, "signinInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f7769a = userRepository;
        this.f7770b = userAvatarStorageProvider;
        this.f7771c = fileSystemRepository;
        this.d = userRegisteredIdentitiesDecorator;
        this.e = signinInteractor;
        this.f = featureToggleInteractor;
        this.f7772g = new Regex("(?=[a-z])");
        this.f7773h = new Regex("_{2,}");
        this.i = new Regex("^[a-zA-Z0-9_]+$");
    }

    public final void d() {
        a01.f fVar = (a01.f) ((a01.b) this.f7770b.get());
        a2 a2Var = fVar.f;
        if (a2Var != null) {
            a2Var.f(null);
        }
        fVar.f = null;
        Object value = fVar.d.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        ((SharedPreferences) value).edit().clear().commit();
        fVar.b();
        zk0.b bVar = this.f7771c;
        zk0.a aVar = zk0.a.INTERNAL_CACHE;
        a80.h hVar = (a80.h) bVar;
        hVar.e(aVar, "USER_AVATAR_IMAGE_CACHE_FILE_NAME");
        hVar.e(aVar, "USER_AVATAR_WITH_NFT_METADATA_IMAGE_CACHE_FILE_NAME");
    }

    public final pfm.t e() {
        q qVar = (q) this.f7769a;
        pfm.a aVar = new pfm.a(qVar.f154114a.deleteAvatar().e(new pfm.h(new hng.h(qVar, 4), 2)), qVar.f154117g.g(Unit.f186387a, false), 0);
        Intrinsics.checkNotNullExpressionValue(aVar, "concatWith(...)");
        pfm.t tVarL = w.g0(aVar).l(new d(this, 1));
        Intrinsics.checkNotNullExpressionValue(tVarL, "doOnComplete(...)");
        return tVarL;
    }

    public final d0 f(boolean z) {
        if (z) {
            return this.d.f();
        }
        n nVarJ = j(w4l.h.f294642c);
        p0 p0Var = p0.f264001a;
        d0 d0VarFirstOrError = m70.a.g(rd0.e.c(nVarJ, qk.d.h()), null, new an4.g(14), 1).firstOrError();
        Intrinsics.h(d0VarFirstOrError);
        return d0VarFirstOrError;
    }

    public final ufm.i g() {
        d0 d0VarFirstOrError = zi0.c.J(((q) this.f7769a).f154118h.f(Unit.f186387a, false)).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return nim.a.x(d0VarFirstOrError, new p(4));
    }

    public final d0 h(boolean z) {
        gng.a aVar = this.f7769a;
        if (!z) {
            d0 d0VarFirstOrError = m70.a.g(zi0.c.J(((q) aVar).i.f(Unit.f186387a, false)), null, new an4.g(13), 1).firstOrError();
            Intrinsics.h(d0VarFirstOrError);
            return d0VarFirstOrError;
        }
        q qVar = (q) aVar;
        d0<m> usernames = qVar.f154114a.getUsernames();
        hje.e eVar = new hje.e(new hmc.a(15), 14);
        usernames.getClass();
        ufm.i iVar = new ufm.i(usernames, eVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        ufm.f fVar = new ufm.f(iVar, new hje.e(new hng.j(qVar, 0), 16), 3);
        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
        return w.i0(fVar);
    }

    public final pfm.h i() {
        q qVar = (q) this.f7769a;
        ufm.f fVar = new ufm.f(qVar.a(), new hje.e(new hng.j(qVar, 2), 19), 3);
        Intrinsics.checkNotNullExpressionValue(fVar, "doOnSuccess(...)");
        pfm.h hVar = new pfm.h(w.i0(fVar), 4);
        Intrinsics.checkNotNullExpressionValue(hVar, "ignoreElement(...)");
        return hVar;
    }

    public final n j(k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return this.d.d(loadingStrategy);
    }

    public final r k(boolean z) {
        n nVarD = this.d.d(z ? w4l.i.f294643c : w4l.h.f294642c);
        p0 p0Var = p0.f264001a;
        return rd0.e.c(nVarD, qk.d.h());
    }

    public final pfm.a l(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        q qVar = (q) this.f7769a;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(email, "email");
        pfm.a aVarE = w.g0(qVar.f154114a.sendVerificationEmail(new eng.d(email, null))).e(new pfm.h(new hng.h(qVar, 0), 2));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }

    public final z m(String username) {
        Intrinsics.checkNotNullParameter(username, "username");
        n nVarJ = j(w4l.h.f294642c);
        p0 p0Var = p0.f264001a;
        d0 d0VarFirstOrError = m70.a.g(rd0.e.c(nVarJ, qk.d.h()), null, new an4.g(12), 1).firstOrError();
        ai0.j jVar = new ai0.j(new amh.j(username, this, 8), 26);
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, jVar, 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return ue0.e.F(iVar, r.j.f323274a);
    }

    public final pfm.a n(String code) {
        Intrinsics.checkNotNullParameter(code, "code");
        q qVar = (q) this.f7769a;
        qVar.getClass();
        Intrinsics.checkNotNullParameter(code, "code");
        int i = 2;
        pfm.a aVarE = w.g0(qVar.f154114a.verifyEmailByCode(new eng.b(code))).e(new pfm.h(new hng.h(qVar, i), i));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        pfm.a aVarE2 = aVarE.e(ue0.e.v(i()));
        Intrinsics.checkNotNullExpressionValue(aVarE2, "andThen(...)");
        return aVarE2;
    }
}
