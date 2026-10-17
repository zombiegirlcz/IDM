package lfm;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends AtomicReferenceArray implements ifm.c {
    public final boolean a(int i, ifm.c cVar) {
        ifm.c cVar2;
        do {
            cVar2 = (ifm.c) get(i);
            if (cVar2 == d.DISPOSED) {
                cVar.dispose();
                return false;
            }
        } while (!compareAndSet(i, cVar2, cVar));
        if (cVar2 == null) {
            return true;
        }
        cVar2.dispose();
        return true;
    }

    @Override // ifm.c
    public final void dispose() {
        ifm.c cVar;
        if (get(0) != d.DISPOSED) {
            int length = length();
            for (int i = 0; i < length; i++) {
                ifm.c cVar2 = (ifm.c) get(i);
                d dVar = d.DISPOSED;
                if (cVar2 != dVar && (cVar = (ifm.c) getAndSet(i, dVar)) != dVar && cVar != null) {
                    cVar.dispose();
                }
            }
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return get(0) == d.DISPOSED;
    }
}
