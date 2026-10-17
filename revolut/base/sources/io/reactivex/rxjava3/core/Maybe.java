package io.reactivex.rxjava3.core;

import ce9.m;
import fgm.e;
import igm.g;
import io.reactivex.rxjava3.disposables.Disposable;
import java.util.Objects;
import qgm.b;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Maybe implements MaybeSource {
    @Override // io.reactivex.rxjava3.core.MaybeSource
    public final void c(e eVar) {
        Objects.requireNonNull(eVar, "observer is null");
        try {
            e(eVar);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th10) {
            m.F(th10);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th10);
            throw nullPointerException;
        }
    }

    public final Disposable d(g gVar, g gVar2) {
        Objects.requireNonNull(gVar2, "onError is null");
        b bVar = new b(gVar, gVar2);
        c(bVar);
        return bVar;
    }

    public abstract void e(e eVar);
}
