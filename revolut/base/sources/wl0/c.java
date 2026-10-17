package wl0;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import org.jetbrains.annotations.NotNull;
import rm0.e0;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    @NotNull
    private static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vl0.a f298340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f298341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rm0.h f298342c;
    public final hn0.n d;
    public final e0 e;

    public c(vl0.a platformBiometrics, s promptChooser, rm0.h certificateManager, hn0.n securityRepositoryInteractor, e0 securityFeatureToggles) {
        Intrinsics.checkNotNullParameter(platformBiometrics, "platformBiometrics");
        Intrinsics.checkNotNullParameter(promptChooser, "promptChooser");
        Intrinsics.checkNotNullParameter(certificateManager, "certificateManager");
        Intrinsics.checkNotNullParameter(securityRepositoryInteractor, "securityRepositoryInteractor");
        Intrinsics.checkNotNullParameter(securityFeatureToggles, "securityFeatureToggles");
        this.f298340a = platformBiometrics;
        this.f298341b = promptChooser;
        this.f298342c = certificateManager;
        this.d = securityRepositoryInteractor;
        this.e = securityFeatureToggles;
    }

    public final void a() {
        rm0.b bVar = (rm0.b) this.f298342c;
        bVar.getClass();
        hn0.a alias = hn0.a.f154013a;
        Intrinsics.checkNotNullParameter(alias, "alias");
        rm0.b.l("removeCertificate(BIOKEY) started");
        ReentrantReadWriteLock reentrantReadWriteLock = bVar.i;
        reentrantReadWriteLock.writeLock().lock();
        rm0.b.l("removeCertificate(BIOKEY) writeLock locked");
        try {
            wm0.f fVarA = bVar.d.a();
            Iterator<E> it8 = rm0.r.a().iterator();
            while (it8.hasNext()) {
                hn0.k kVar = new hn0.k(alias, (rm0.r) it8.next());
                wm0.g gVar = (wm0.g) fVarA;
                if (gVar.b(kVar.c())) {
                    if (alias.equals(hn0.d.f154015a)) {
                        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                        rd0.d.b(rd0.c.WARNING, "AsymmetricCipherProvider", "Deleting Default certificate (removeCertificate)", null, null, 16);
                    }
                    gVar.c(kVar.c());
                    bVar.f255143j.remove(kVar);
                }
            }
            reentrantReadWriteLock.writeLock().unlock();
            rm0.b.l("removeCertificate(BIOKEY) writeLock unlocked");
            rm0.b.l("removeCertificate(BIOKEY) ended");
            if (this.e.a()) {
                this.d.j();
            }
        } catch (Throwable th10) {
            reentrantReadWriteLock.writeLock().unlock();
            rm0.b.l("removeCertificate(BIOKEY) writeLock unlocked");
            throw th10;
        }
    }

    public final rm0.j b() {
        rm0.j jVarB = ((rm0.b) this.f298342c).b(new hn0.k(hn0.a.f154013a, rm0.r.V2_OAEP));
        if (!this.e.a()) {
            return jVarB;
        }
        hn0.n nVar = this.d;
        synchronized (nVar) {
            try {
                mm0.q qVarB = nVar.b();
                nVar.f154028a.h(new lm0.c(qVarB.f207121b));
                String str = qVarB.d;
                if (str != null) {
                    nVar.f154028a.h(new lm0.d(str));
                } else {
                    nVar.f154028a.i(o0.f186429a.b(lm0.d.class));
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return jVarB;
    }

    public final rm0.j c() {
        o oVarB = ((vl0.c) this.f298340a).b();
        o oVar = o.NONE;
        rm0.c cVar = rm0.c.f255146a;
        if (oVarB == oVar) {
            return cVar;
        }
        e0 e0Var = this.e;
        boolean zA = e0Var.a();
        hn0.n nVar = this.d;
        if (!zA) {
            nVar.j();
        }
        boolean zA2 = nVar.f154028a.a(o0.f186429a.b(lm0.c.class));
        rm0.g gVar = rm0.g.f255157a;
        if (zA2 && !e0Var.a()) {
            a();
            return gVar;
        }
        rm0.r rVar = rm0.r.V2_OAEP;
        hn0.a aVar = hn0.a.f154013a;
        hn0.k kVar = new hn0.k(aVar, rVar);
        rm0.b bVar = (rm0.b) this.f298342c;
        rm0.j jVarD = bVar.d(kVar);
        if (!(jVarD instanceof rm0.c)) {
            return jVarD;
        }
        rm0.j jVarD2 = bVar.d(new hn0.k(aVar, rm0.r.V1_PKCS1));
        if (!e0Var.b()) {
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.DEBUG, "BiometricSignIn", "Skip disabled bio migration", null, null, 16);
            return jVarD2;
        }
        if (jVarD2.equals(cVar)) {
            return jVarD2;
        }
        if (jVarD2 instanceof rm0.f) {
            Throwable th10 = ((rm0.f) jVarD2).f255156a;
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
            rd0.d.a(rd0.c.WARNING, "BiometricSignIn", "Skip bio migration for CertificateFail", th10, h0Var);
            return jVarD2;
        }
        if (jVarD2.equals(gVar)) {
            CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
            rd0.d.b(rd0.c.WARNING, "BiometricSignIn", "Skip bio migration for CertificateInvalidated", null, null, 16);
            return jVarD2;
        }
        rm0.d dVar = rm0.d.f255149a;
        if (!jVarD2.equals(dVar)) {
            throw new NoWhenBranchMatchedException();
        }
        rm0.j jVarB = b();
        if (jVarB.equals(dVar)) {
            CopyOnWriteArrayList copyOnWriteArrayList4 = rd0.d.f253311a;
            rd0.d.b(rd0.c.WARNING, "BiometricSignIn", "bio migrated", null, null, 16);
            return jVarB;
        }
        if (jVarB.equals(cVar)) {
            h0 h0Var2 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList5 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "BiometricSignIn", "bio migration failed: CertificateAbsent", null, h0Var2);
            return jVarD2;
        }
        if (jVarB instanceof rm0.f) {
            IllegalStateException illegalStateException = new IllegalStateException(((rm0.f) jVarB).f255156a);
            h0 h0Var3 = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList6 = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, "BiometricSignIn", "bio migration failed: CertificateFail", illegalStateException, h0Var3);
            bVar.m(new hn0.k(aVar, rVar));
            return jVarD2;
        }
        if (!jVarB.equals(gVar)) {
            throw new NoWhenBranchMatchedException();
        }
        h0 h0Var4 = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList7 = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "BiometricSignIn", "bio migration failed: CertificateInvalidated", null, h0Var4);
        bVar.m(new hn0.k(aVar, rVar));
        return jVarD2;
    }

    public final o d() {
        return ((vl0.c) this.f298340a).b();
    }

    public final boolean e() {
        boolean z;
        rm0.j jVarB = b();
        if (jVarB.equals(rm0.d.f255149a)) {
            z = true;
        } else {
            if (jVarB.equals(rm0.c.f255146a)) {
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "BiometricSignIn", "Can't create biometrics: CertificateAbsent", null, h0Var);
            } else if (jVarB instanceof rm0.f) {
                Throwable th10 = ((rm0.f) jVarB).f255156a;
                h0 h0Var2 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList2 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "BiometricSignIn", "Can't create biometrics: CertificateFail", th10, h0Var2);
            } else {
                if (!jVarB.equals(rm0.g.f255157a)) {
                    throw new NoWhenBranchMatchedException();
                }
                h0 h0Var3 = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList3 = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, "BiometricSignIn", "Can't create biometrics: CertificateInvalidated", null, h0Var3);
            }
            z = false;
        }
        a();
        return z;
    }
}
