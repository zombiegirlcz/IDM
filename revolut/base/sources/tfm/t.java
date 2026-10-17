package tfm;

import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class t extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f270828h;
    public final kfm.o i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f270829j;
    public final Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(efm.r rVar, efm.w wVar, kfm.o oVar, Object obj2, int i) {
        super(rVar);
        this.f270828h = i;
        this.k = wVar;
        this.i = oVar;
        this.f270829j = obj2;
    }

    @Override // efm.r
    public final void subscribeActual(efm.y yVar) {
        int length;
        switch (this.f270828h) {
            case 0:
                r rVar = new r(yVar, (efm.w) this.k, this.i, (Callable) this.f270829j);
                yVar.onSubscribe(rVar);
                this.f270328g.subscribe(rVar);
                break;
            case 1:
                this.f270328g.subscribe(new r3(yVar, this.i, (kfm.o) this.k, (Callable) this.f270829j));
                break;
            case 2:
                efm.w wVar = this.f270328g;
                efm.w wVar2 = (efm.w) this.k;
                kfm.o oVar = this.i;
                efm.w wVar3 = (efm.w) this.f270829j;
                if (wVar3 == null) {
                    v6 v6Var = new v6(yVar, oVar);
                    yVar.onSubscribe(v6Var);
                    if (wVar2 != null) {
                        s sVar = new s(0L, v6Var);
                        lfm.b bVar = v6Var.f270899c;
                        bVar.getClass();
                        if (lfm.d.c(bVar, sVar)) {
                            wVar2.subscribe(sVar);
                        }
                    }
                    wVar.subscribe(v6Var);
                } else {
                    u6 u6Var = new u6(wVar3, yVar, oVar);
                    yVar.onSubscribe(u6Var);
                    if (wVar2 != null) {
                        s sVar2 = new s(0L, u6Var);
                        lfm.b bVar2 = u6Var.f270869c;
                        bVar2.getClass();
                        if (lfm.d.c(bVar2, sVar2)) {
                            wVar2.subscribe(sVar2);
                        }
                    }
                    wVar.subscribe(u6Var);
                }
                break;
            default:
                efm.w[] wVarArr = (efm.w[]) this.f270829j;
                if (wVarArr == null) {
                    wVarArr = new efm.w[8];
                    try {
                        length = 0;
                        for (efm.w wVar4 : (Iterable) this.k) {
                            if (length == wVarArr.length) {
                                wVarArr = (efm.w[]) Arrays.copyOf(wVarArr, (length >> 1) + length);
                            }
                            int i = length + 1;
                            wVarArr[length] = wVar4;
                            length = i;
                        }
                    } catch (Throwable th10) {
                        m70.a.u(th10);
                        lfm.e.d(th10, yVar);
                        return;
                    }
                } else {
                    length = wVarArr.length;
                }
                if (length == 0) {
                    this.f270328g.subscribe(new d2(yVar, new t1j.b(this, 3), 1));
                } else {
                    x7 x7Var = new x7(yVar, this.i, length);
                    yVar.onSubscribe(x7Var);
                    y7[] y7VarArr = x7Var.f270946c;
                    AtomicReference atomicReference = x7Var.e;
                    for (int i2 = 0; i2 < length && !lfm.d.b((ifm.c) atomicReference.get()) && !x7Var.f270947g; i2++) {
                        wVarArr[i2].subscribe(y7VarArr[i2]);
                    }
                    this.f270328g.subscribe(x7Var);
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(efm.r rVar, kfm.o oVar, kfm.o oVar2, Callable callable) {
        super(rVar);
        this.f270828h = 1;
        this.i = oVar;
        this.k = oVar2;
        this.f270829j = callable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(efm.r rVar, efm.w[] wVarArr, kfm.o oVar) {
        super(rVar);
        this.f270828h = 3;
        this.f270829j = wVarArr;
        this.k = null;
        this.i = oVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(efm.r rVar, Iterable iterable, kfm.o oVar) {
        super(rVar);
        this.f270828h = 3;
        this.f270829j = null;
        this.k = iterable;
        this.i = oVar;
    }
}
