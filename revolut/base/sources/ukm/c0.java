package ukm;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.o0;
import kotlinx.coroutines.internal.UndeliveredElementException;
import skm.k2;

/* JADX INFO: loaded from: classes14.dex */
public final class c0 extends q {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f f280802m;

    public c0(int i, f fVar, Function1 function1) {
        super(i, function1);
        this.f280802m = fVar;
        if (fVar != f.SUSPEND) {
            if (i < 1) {
                throw new IllegalArgumentException(j6.a.l(i, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + o0.f186429a.b(q.class).m() + " instead").toString());
        }
    }

    @Override // ukm.q
    public final boolean C() {
        return this.f280802m == f.DROP_OLDEST;
    }

    @Override // ukm.q
    public final void L(flm.i iVar, Object obj2) {
        Object objU = U(obj2, false);
        if (!(objU instanceof y)) {
            ((flm.h) iVar).e = Unit.f186387a;
        } else {
            if (!(objU instanceof w)) {
                throw new IllegalStateException("unreachable");
            }
            ((flm.h) iVar).e = s.f280832l;
        }
    }

    @Override // ukm.q
    public final Object N(Object obj2, c cVar) {
        Object objU = U(obj2, true);
        if (objU instanceof y) {
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    @Override // ukm.q
    public final boolean O() {
        return false;
    }

    public final Object U(Object obj2, boolean z) {
        Function1 function1;
        UndeliveredElementException undeliveredElementExceptionB;
        if (this.f280802m == f.DROP_LATEST) {
            Object objMo3647trySendJP2dKIU = super.mo3647trySendJP2dKIU(obj2);
            if (!(objMo3647trySendJP2dKIU instanceof y) || (objMo3647trySendJP2dKIU instanceof w)) {
                return objMo3647trySendJP2dKIU;
            }
            if (z && (function1 = this.f280824b) != null && (undeliveredElementExceptionB = zkm.b.b(function1, obj2, null)) != null) {
                throw undeliveredElementExceptionB;
            }
            x xVar = z.Companion;
            Unit unit = Unit.f186387a;
            xVar.getClass();
            return unit;
        }
        Object obj3 = obj2;
        Object obj4 = s.d;
        a0 a0Var = (a0) q.f280820h.get(this);
        while (true) {
            long andIncrement = q.d.getAndIncrement(this);
            long j2 = 1152921504606846975L & andIncrement;
            boolean z3 = z(andIncrement, false);
            int i = s.f280827b;
            long j3 = i;
            long j5 = j2 / j3;
            int i2 = (int) (j2 % j3);
            if (a0Var.f323123c != j5) {
                a0 a0VarA = q.a(this, j5, a0Var);
                if (a0VarA != null) {
                    a0Var = a0VarA;
                } else if (z3) {
                    x xVar2 = z.Companion;
                    Throwable thU = u();
                    xVar2.getClass();
                    return new w(thU);
                }
            }
            int iH = q.h(this, a0Var, i2, obj3, j2, obj4, z3);
            if (iH == 0) {
                a0Var.b();
                x xVar3 = z.Companion;
                Unit unit2 = Unit.f186387a;
                xVar3.getClass();
                return unit2;
            }
            if (iH == 1) {
                x xVar4 = z.Companion;
                Unit unit3 = Unit.f186387a;
                xVar4.getClass();
                return unit3;
            }
            if (iH == 2) {
                if (z3) {
                    a0Var.i();
                    x xVar5 = z.Companion;
                    Throwable thU2 = u();
                    xVar5.getClass();
                    return new w(thU2);
                }
                k2 k2Var = obj4 instanceof k2 ? (k2) obj4 : null;
                if (k2Var != null) {
                    k2Var.b(a0Var, i2 + i);
                }
                p((a0Var.f323123c * j3) + ((long) i2));
                x xVar6 = z.Companion;
                Unit unit4 = Unit.f186387a;
                xVar6.getClass();
                return unit4;
            }
            if (iH == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iH == 4) {
                if (j2 < q.e.get(this)) {
                    a0Var.b();
                }
                x xVar7 = z.Companion;
                Throwable thU3 = u();
                xVar7.getClass();
                return new w(thU3);
            }
            if (iH == 5) {
                a0Var.b();
            }
            obj3 = obj2;
        }
    }

    @Override // ukm.q, ukm.j0
    public final Object send(Object obj2, Continuation continuation) throws Throwable {
        UndeliveredElementException undeliveredElementExceptionB;
        if (!(U(obj2, true) instanceof w)) {
            return Unit.f186387a;
        }
        Function1 function1 = this.f280824b;
        if (function1 == null || (undeliveredElementExceptionB = zkm.b.b(function1, obj2, null)) == null) {
            throw u();
        }
        yhm.f.a(undeliveredElementExceptionB, u());
        throw undeliveredElementExceptionB;
    }

    @Override // ukm.q, ukm.j0
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public final Object mo3647trySendJP2dKIU(Object obj2) {
        return U(obj2, false);
    }
}
