package tgm;

import ce9.m;
import fgm.p;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import jb3.l;

/* JADX INFO: loaded from: classes14.dex */
public final class k extends AtomicReference implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f271225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f271226b;

    public k(j jVar, int i) {
        this.f271225a = jVar;
        this.f271226b = i;
    }

    @Override // fgm.p
    public final void onError(Throwable th10) {
        int i;
        j jVar = this.f271225a;
        int i2 = 0;
        if (jVar.getAndSet(0) <= 0) {
            l.v(th10);
            return;
        }
        k[] kVarArr = jVar.f271224c;
        int length = kVarArr.length;
        while (true) {
            i = this.f271226b;
            if (i2 >= i) {
                break;
            }
            k kVar = kVarArr[i2];
            kVar.getClass();
            jgm.b.a(kVar);
            i2++;
        }
        while (true) {
            i++;
            if (i >= length) {
                jVar.d = null;
                jVar.f271222a.onError(th10);
                return;
            } else {
                k kVar2 = kVarArr[i];
                kVar2.getClass();
                jgm.b.a(kVar2);
            }
        }
    }

    @Override // fgm.p
    public final void onSubscribe(Disposable disposable) {
        jgm.b.e(this, disposable);
    }

    @Override // fgm.p
    public final void onSuccess(Object obj2) {
        j jVar = this.f271225a;
        p pVar = jVar.f271222a;
        Object[] objArr = jVar.d;
        if (objArr != null) {
            objArr[this.f271226b] = obj2;
        }
        if (jVar.decrementAndGet() == 0) {
            try {
                Object objApply = jVar.f271223b.apply(objArr);
                Objects.requireNonNull(objApply, "The zipper returned a null value");
                jVar.d = null;
                pVar.onSuccess(objApply);
            } catch (Throwable th10) {
                m.F(th10);
                jVar.d = null;
                pVar.onError(th10);
            }
        }
    }
}
