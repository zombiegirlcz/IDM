package cn0;

import akl.s;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.security.exception.InvalidPasscode;
import com.revolut.core.security.exception.SessionControllerUninitializedException;
import efm.r;
import hn0.n;
import ihm.j;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.p0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.KClass;
import kotlin.text.d0;
import lm0.i;
import mm0.k;
import mm0.m;
import mm0.o;
import mm0.p;
import mm0.q;
import rl0.b;
import rm0.e0;
import te0.w;
import wl0.o;
import zhm.h0;

/* JADX INFO: loaded from: classes.dex */
public final class g implements zm0.b, zm0.c, e0m.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f25338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fni.a f25339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e0 f25340c;
    public final j d;
    public final ConcurrentHashMap e;
    public final e0m.b f;

    public g(n repositoryInteractor, fni.a nativeValuesProvider, e0 securityFeatureToggles) {
        Intrinsics.checkNotNullParameter(repositoryInteractor, "repositoryInteractor");
        Intrinsics.checkNotNullParameter(nativeValuesProvider, "nativeValuesProvider");
        Intrinsics.checkNotNullParameter(securityFeatureToggles, "securityFeatureToggles");
        this.f25338a = repositoryInteractor;
        this.f25339b = nativeValuesProvider;
        this.f25340c = securityFeatureToggles;
        j jVarD = new ihm.b().d();
        Intrinsics.checkNotNullExpressionValue(jVarD, "toSerialized(...)");
        this.d = jVarD;
        this.e = new ConcurrentHashMap();
        this.f = new e0m.b(new androidx.lifecycle.b(this, 12));
    }

    public static mm0.e c(o oVar) {
        int i = oVar == null ? -1 : f.f25336a[oVar.ordinal()];
        return i != 1 ? i != 2 ? mm0.e.UNKNOWN : mm0.e.FINGER_PRINT : mm0.e.FACE_ID;
    }

    public final synchronized mm0.n a(mm0.c call) {
        mm0.n nVar;
        try {
            Intrinsics.checkNotNullParameter(call, "call");
            b();
            if (d0.W(call.a())) {
                throw new InvalidPasscode(0);
            }
            mm0.o oVarD = d();
            if (call instanceof mm0.d) {
                String strH = this.f25338a.h();
                if (!Intrinsics.f(((mm0.d) call).a(), strH)) {
                    throw new InvalidPasscode(0);
                }
                nVar = new mm0.n(this.f25338a.b(), new rl0.a(strH), mm0.e.PASSCODE);
            } else {
                if (!(call instanceof mm0.a)) {
                    if (!(call instanceof mm0.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    t0 t0Var = t0.f186434a;
                    m70.a.c(t0Var);
                    Intrinsics.checkNotNullParameter(t0Var, "<this>");
                    return new mm0.n(new q("", null, "", null), e(), c(((mm0.b) call).b()));
                }
                if (this.f25338a.f154028a.a(o0.f186429a.b(lm0.c.class)) && this.f25340c.a()) {
                    nVar = new mm0.n(this.f25338a.c(((mm0.a) call).b()), e(), c(((mm0.a) call).c()));
                } else {
                    nVar = new mm0.n(this.f25338a.b(), e(), c(((mm0.a) call).c()));
                }
            }
            if (!oVarD.equals(nVar)) {
                this.e.put(o0.f186429a.b(mm0.n.class), nVar);
                this.d.onNext(Unit.f186387a);
            }
            return nVar;
        } catch (Throwable th10) {
            throw th10;
        }
    }

    public final void b() {
        if (this.f.f121744b.f121746b) {
            return;
        }
        SessionControllerUninitializedException sessionControllerUninitializedException = new SessionControllerUninitializedException(0);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, sessionControllerUninitializedException, h0Var);
        init();
    }

    @Override // od0.e
    public final synchronized void clear() {
        b();
        this.f25338a.clear();
        i();
    }

    public final synchronized mm0.o d() {
        mm0.o mVar;
        try {
            b();
            ConcurrentHashMap concurrentHashMap = this.e;
            p0 p0Var = o0.f186429a;
            Object obj2 = concurrentHashMap.get(p0Var.b(mm0.n.class));
            mVar = obj2 instanceof mm0.n ? (mm0.n) obj2 : null;
            Object obj3 = this.e.get(p0Var.b(p.class));
            p pVar = obj3 instanceof p ? (p) obj3 : null;
            Object obj4 = this.e.get(p0Var.b(m.class));
            m mVar2 = obj4 instanceof m ? (m) obj4 : null;
            if (mVar == null) {
                mVar = pVar != null ? pVar : k(p0Var.b(mm0.n.class)) ? o.a.f207118b : mVar2 == null ? new m(new q("App", null, (String) this.f25339b.b.invoke(), null)) : mVar2;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.DEBUG, "SessionController", "getCurrentSession: " + p0Var.b(mVar.getClass()).m(), null, null, 16);
        } catch (Throwable th10) {
            throw th10;
        }
        return mVar;
    }

    public final rl0.b e() {
        n nVar = this.f25338a;
        int i = f.f25337b[nVar.d().ordinal()];
        if (i == 1) {
            return new rl0.a(nVar.h());
        }
        if (i == 2) {
            return b.a.f254907a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final r g() {
        b();
        r map = w.w0(this.d).map(new ag.j(new s(this, 6), 7));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final void h(mm0.f remove) {
        n nVar = this.f25338a;
        synchronized (nVar) {
            Intrinsics.checkNotNullParameter(remove, "remove");
            List listA = a.a(remove);
            hn0.m mVar = nVar.f154028a;
            Iterator it8 = listA.iterator();
            while (it8.hasNext()) {
                mVar.i((KClass) it8.next());
            }
        }
    }

    public final synchronized void i() {
        b();
        j();
    }

    @Override // e0m.d
    public final void init() {
        this.f.init();
    }

    public final void j() {
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(rd0.c.DEBUG, "SessionController", "reset session", null, null, 16);
        ConcurrentHashMap concurrentHashMap = this.e;
        concurrentHashMap.clear();
        String str = (String) this.f25339b.b.invoke();
        p0 p0Var = o0.f186429a;
        concurrentHashMap.put(p0Var.b(m.class), new m(new q("App", null, str, null)));
        if (k(p0Var.b(p.class))) {
            concurrentHashMap.put(p0Var.b(p.class), new p(this.f25338a.e()));
        }
        this.d.onNext(Unit.f186387a);
    }

    public final boolean k(KClass kClass) {
        p0 p0Var = o0.f186429a;
        if (Intrinsics.f(kClass, p0Var.b(m.class))) {
            return true;
        }
        boolean zF = Intrinsics.f(kClass, p0Var.b(mm0.n.class));
        n nVar = this.f25338a;
        if (zF) {
            return nVar.f154028a.a(p0Var.b(lm0.b.class));
        }
        if (!Intrinsics.f(kClass, p0Var.b(p.class))) {
            throw new IllegalArgumentException(kClass.m());
        }
        hn0.m mVar = nVar.f154028a;
        if (mVar.a(p0Var.b(lm0.m.class))) {
            return mVar.a(p0Var.b(lm0.o.class)) || mVar.a(p0Var.b(i.class));
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    public final synchronized void l(k update) {
        try {
            Intrinsics.checkNotNullParameter(update, "update");
            b();
            this.f25338a.k(update);
            mm0.o nVar = null;
            KClass kClassK = t1.k(update, ((Boolean) this.f25340c.d.getValue()).booleanValue() ? d() : null);
            p0 p0Var = o0.f186429a;
            if (Intrinsics.f(kClassK, p0Var.b(p.class))) {
                nVar = new p(this.f25338a.e());
            } else if (Intrinsics.f(kClassK, p0Var.b(mm0.n.class))) {
                h(new mm0.f(p0Var.b(p.class)));
                q qVarB = this.f25338a.b();
                rl0.b bVarE = e();
                mm0.o oVarD = d();
                nVar = new mm0.n(qVarB, bVarE, oVarD instanceof mm0.n ? ((mm0.n) oVarD).d : mm0.e.UNKNOWN);
            } else {
                Intrinsics.f(kClassK, p0Var.b(m.class));
            }
            if (kClassK != null && nVar != null) {
                this.e.put(kClassK, nVar);
                this.d.onNext(Unit.f186387a);
            }
        } catch (Throwable th10) {
            throw th10;
        }
    }
}
