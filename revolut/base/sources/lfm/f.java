package lfm;

import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import zfm.h;

/* JADX INFO: loaded from: classes13.dex */
public final class f implements ifm.c, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinkedList f195037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f195038b;

    @Override // lfm.c
    public final boolean a(ifm.c cVar) {
        mfm.f.b(cVar, "d is null");
        if (!this.f195038b) {
            synchronized (this) {
                try {
                    if (!this.f195038b) {
                        LinkedList linkedList = this.f195037a;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f195037a = linkedList;
                        }
                        linkedList.add(cVar);
                        return true;
                    }
                } finally {
                }
            }
        }
        cVar.dispose();
        return false;
    }

    @Override // lfm.c
    public final boolean b(ifm.c cVar) {
        if (this.f195038b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f195038b) {
                    return false;
                }
                LinkedList linkedList = this.f195037a;
                if (linkedList != null && linkedList.remove(cVar)) {
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // lfm.c
    public final boolean c(ifm.c cVar) {
        if (!b(cVar)) {
            return false;
        }
        cVar.dispose();
        return true;
    }

    @Override // ifm.c
    public final void dispose() {
        if (this.f195038b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f195038b) {
                    return;
                }
                this.f195038b = true;
                LinkedList linkedList = this.f195037a;
                ArrayList arrayList = null;
                this.f195037a = null;
                if (linkedList == null) {
                    return;
                }
                Iterator it8 = linkedList.iterator();
                while (it8.hasNext()) {
                    try {
                        ((ifm.c) it8.next()).dispose();
                    } catch (Throwable th10) {
                        m70.a.u(th10);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th10);
                    }
                }
                if (arrayList != null) {
                    if (arrayList.size() != 1) {
                        throw new CompositeException(arrayList);
                    }
                    throw h.d((Throwable) arrayList.get(0));
                }
            } catch (Throwable th11) {
                throw th11;
            }
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f195038b;
    }
}
