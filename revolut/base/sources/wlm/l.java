package wlm;

import java.io.IOException;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import le.u1;
import mmm.k0;
import ylm.s;
import ylm.u;

/* JADX INFO: loaded from: classes13.dex */
public final class l extends xlm.a {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i, String str, Object obj2) {
        super(str, true);
        this.e = i;
        this.f = obj2;
    }

    @Override // xlm.a
    public final long a() {
        long j2;
        s sVar;
        int i = 0;
        switch (this.e) {
            case 0:
                o oVar = (o) this.f;
                synchronized (oVar) {
                    if (oVar.f298564m && !oVar.f298565n) {
                        try {
                            oVar.q();
                        } catch (IOException unused) {
                            oVar.o = true;
                        }
                        try {
                            if (oVar.j()) {
                                oVar.n();
                                oVar.f298562j = 0;
                            }
                        } catch (IOException unused2) {
                            oVar.f298566p = true;
                            k0 k0Var = oVar.f298561h;
                            if (k0Var != null) {
                                vlm.h.f(k0Var);
                            }
                            oVar.f298561h = u1.b(new mmm.g());
                        }
                    }
                    break;
                }
                return -1L;
            case 1:
                ((Function0) this.f).invoke();
                return -1L;
            default:
                u uVar = (u) this.f;
                long jNanoTime = System.nanoTime();
                long j3 = (jNanoTime - uVar.f314804a) + 1;
                Iterator it8 = uVar.d.iterator();
                Intrinsics.checkNotNullExpressionValue(it8, "iterator(...)");
                long j5 = Long.MAX_VALUE;
                s sVar2 = null;
                long j16 = j3;
                s sVar3 = null;
                int i2 = 0;
                while (it8.hasNext()) {
                    s sVar4 = (s) it8.next();
                    Intrinsics.h(sVar4);
                    synchronized (sVar4) {
                        if (uVar.a(sVar4, jNanoTime) > 0) {
                            i2++;
                        } else {
                            long j22 = j16;
                            long j42 = sVar4.f314803r;
                            if (j42 < j22) {
                                sVar3 = sVar4;
                                j22 = j42;
                            }
                            i++;
                            if (j42 < j5) {
                                sVar2 = sVar4;
                                j5 = j42;
                            }
                            j16 = j22;
                        }
                        Unit unit = Unit.f186387a;
                    }
                }
                long j46 = j16;
                if (sVar3 != null) {
                    sVar = sVar3;
                    j2 = j46;
                } else if (i > 5) {
                    j2 = j5;
                    sVar = sVar2;
                } else {
                    j2 = -1;
                    sVar = null;
                }
                if (sVar == null) {
                    if (sVar2 != null) {
                        return (j5 + uVar.f314804a) - jNanoTime;
                    }
                    if (i2 > 0) {
                        return uVar.f314804a;
                    }
                    return -1L;
                }
                synchronized (sVar) {
                    if (sVar.f314802q.isEmpty() && sVar.f314803r == j2) {
                        sVar.k = true;
                        uVar.d.remove(sVar);
                        vlm.j.e(sVar.e);
                        ylm.g.a(sVar);
                        if (!uVar.d.isEmpty()) {
                            return 0L;
                        }
                        uVar.f314805b.a();
                        return 0L;
                    }
                    return 0L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, boolean z, Function0 function0) {
        super(str, z);
        this.e = 1;
        this.f = function0;
    }
}
