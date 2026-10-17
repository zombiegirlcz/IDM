package ukm;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import skm.k2;
import yhm.m;

/* JADX INFO: loaded from: classes14.dex */
public final class g implements k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f280810a = s.f280835p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public skm.l f280811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f280812c;

    public g(q qVar) {
        this.f280812c = qVar;
    }

    public final Object a(Continuation frame) throws Throwable {
        a0 a0VarR;
        Boolean bool;
        Object obj2 = this.f280810a;
        boolean z = true;
        if (obj2 == s.f280835p || obj2 == s.f280832l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = q.i;
            q qVar = this.f280812c;
            a0 a0Var = (a0) atomicReferenceFieldUpdater.get(qVar);
            while (true) {
                if (qVar.A()) {
                    this.f280810a = s.f280832l;
                    Throwable thS = qVar.s();
                    if (thS != null) {
                        int i = zkm.u.f323124a;
                        throw thS;
                    }
                    z = false;
                } else {
                    long andIncrement = q.e.getAndIncrement(qVar);
                    long j2 = s.f280827b;
                    long j3 = andIncrement / j2;
                    int i2 = (int) (andIncrement % j2);
                    if (a0Var.f323123c != j3) {
                        a0VarR = qVar.r(j3, a0Var);
                        if (a0VarR == null) {
                            continue;
                        }
                    } else {
                        a0VarR = a0Var;
                    }
                    Object objR = qVar.R(a0VarR, i2, andIncrement, null);
                    cfm.c cVar = s.f280833m;
                    if (objR == cVar) {
                        throw new IllegalStateException("unreachable");
                    }
                    cfm.c cVar2 = s.o;
                    if (objR == cVar2) {
                        if (andIncrement < qVar.w()) {
                            a0VarR.b();
                        }
                        a0Var = a0VarR;
                    } else {
                        if (objR == s.f280834n) {
                            q qVar2 = this.f280812c;
                            skm.l lVarU = skm.e0.u(fim.h.b(frame));
                            try {
                                this.f280811b = lVarU;
                                Object objR2 = qVar2.R(a0VarR, i2, andIncrement, this);
                                Function1 function1 = qVar2.f280824b;
                                if (objR2 == cVar) {
                                    b(a0VarR, i2);
                                } else {
                                    int i3 = 13;
                                    tvh.e eVar = null;
                                    if (objR2 == cVar2) {
                                        if (andIncrement < qVar2.w()) {
                                            a0VarR.b();
                                        }
                                        a0 a0Var2 = (a0) q.i.get(qVar2);
                                        while (true) {
                                            if (qVar2.A()) {
                                                skm.l lVar = this.f280811b;
                                                Intrinsics.h(lVar);
                                                this.f280811b = null;
                                                this.f280810a = s.f280832l;
                                                Throwable thS2 = qVar.s();
                                                if (thS2 == null) {
                                                    m.Companion aVar = yhm.m.INSTANCE;
                                                    lVar.resumeWith(Boolean.FALSE);
                                                } else {
                                                    m.Companion aVar2 = yhm.m.INSTANCE;
                                                    lVar.resumeWith(yhm.o.a(thS2));
                                                }
                                            } else {
                                                long andIncrement2 = q.e.getAndIncrement(qVar2);
                                                long j5 = s.f280827b;
                                                long j16 = andIncrement2 / j5;
                                                int i5 = (int) (andIncrement2 % j5);
                                                if (a0Var2.f323123c != j16) {
                                                    a0 a0VarR2 = qVar2.r(j16, a0Var2);
                                                    if (a0VarR2 != null) {
                                                        a0Var2 = a0VarR2;
                                                    }
                                                }
                                                Object objR3 = qVar2.R(a0Var2, i5, andIncrement2, this);
                                                if (objR3 == s.f280833m) {
                                                    b(a0Var2, i5);
                                                    break;
                                                }
                                                if (objR3 == s.o) {
                                                    if (andIncrement2 < qVar2.w()) {
                                                        a0Var2.b();
                                                    }
                                                } else {
                                                    if (objR3 == s.f280834n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    a0Var2.b();
                                                    this.f280810a = objR3;
                                                    this.f280811b = null;
                                                    bool = Boolean.TRUE;
                                                    if (function1 != null) {
                                                        eVar = new tvh.e(function1, objR3, i3);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        a0VarR.b();
                                        this.f280810a = objR2;
                                        this.f280811b = null;
                                        bool = Boolean.TRUE;
                                        if (function1 != null) {
                                            eVar = new tvh.e(function1, objR2, i3);
                                        }
                                    }
                                    lVarU.e(bool, eVar);
                                }
                                Object objT = lVarU.t();
                                if (objT == fim.a.COROUTINE_SUSPENDED) {
                                    Intrinsics.checkNotNullParameter(frame, "frame");
                                }
                                return objT;
                            } catch (Throwable th10) {
                                lVarU.C();
                                throw th10;
                            }
                        }
                        a0VarR.b();
                        this.f280810a = objR;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // skm.k2
    public final void b(zkm.t tVar, int i) {
        skm.l lVar = this.f280811b;
        if (lVar != null) {
            lVar.b(tVar, i);
        }
    }

    public final Object c() throws Throwable {
        Object obj2 = this.f280810a;
        cfm.c cVar = s.f280835p;
        if (obj2 == cVar) {
            throw new IllegalStateException("`hasNext()` has not been invoked");
        }
        this.f280810a = cVar;
        if (obj2 != s.f280832l) {
            return obj2;
        }
        Throwable thT = this.f280812c.t();
        int i = zkm.u.f323124a;
        throw thT;
    }
}
