package jgm;

import ce9.m;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import vgm.q;
import ygm.g;

/* JADX INFO: loaded from: classes14.dex */
public final class d implements Disposable, ggm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinkedList f174096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f174097b;

    @Override // ggm.a
    public final boolean a(Disposable disposable) {
        if (!this.f174097b) {
            synchronized (this) {
                try {
                    if (!this.f174097b) {
                        LinkedList linkedList = this.f174096a;
                        if (linkedList == null) {
                            linkedList = new LinkedList();
                            this.f174096a = linkedList;
                        }
                        linkedList.add(disposable);
                        return true;
                    }
                } finally {
                }
            }
        }
        disposable.dispose();
        return false;
    }

    @Override // ggm.a
    public final boolean b(Disposable disposable) {
        if (this.f174097b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f174097b) {
                    return false;
                }
                LinkedList linkedList = this.f174096a;
                if (linkedList != null && linkedList.remove(disposable)) {
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // ggm.a
    public final boolean c(Disposable disposable) {
        if (!b(disposable)) {
            return false;
        }
        ((q) disposable).dispose();
        return true;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (this.f174097b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f174097b) {
                    return;
                }
                this.f174097b = true;
                LinkedList linkedList = this.f174096a;
                ArrayList arrayList = null;
                this.f174096a = null;
                if (linkedList == null) {
                    return;
                }
                Iterator it8 = linkedList.iterator();
                while (it8.hasNext()) {
                    try {
                        ((Disposable) it8.next()).dispose();
                    } catch (Throwable th10) {
                        m.F(th10);
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
                    throw g.f((Throwable) arrayList.get(0));
                }
            } catch (Throwable th11) {
                throw th11;
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f174097b;
    }
}
