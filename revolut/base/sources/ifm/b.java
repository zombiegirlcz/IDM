package ifm;

import io.reactivex.exceptions.CompositeException;
import java.util.ArrayList;
import mfm.f;
import zfm.h;
import zfm.n;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements c, lfm.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f161041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f161042b;

    public static void e(n nVar) {
        if (nVar == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj2 : nVar.d) {
            if (obj2 instanceof c) {
                try {
                    ((c) obj2).dispose();
                } catch (Throwable th10) {
                    m70.a.u(th10);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th10);
                }
            }
        }
        if (arrayList != null) {
            if (arrayList.size() != 1) {
                throw new CompositeException(arrayList);
            }
            throw h.d((Throwable) arrayList.get(0));
        }
    }

    @Override // lfm.c
    public final boolean a(c cVar) {
        f.b(cVar, "disposable is null");
        if (!this.f161042b) {
            synchronized (this) {
                try {
                    if (!this.f161042b) {
                        n nVar = this.f161041a;
                        if (nVar == null) {
                            nVar = new n(16);
                            this.f161041a = nVar;
                        }
                        nVar.a(cVar);
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
    public final boolean b(c cVar) {
        Object obj2;
        f.b(cVar, "disposables is null");
        if (this.f161042b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f161042b) {
                    return false;
                }
                n nVar = this.f161041a;
                if (nVar != null) {
                    Object[] objArr = nVar.d;
                    int i = nVar.f322039a;
                    int iHashCode = cVar.hashCode() * (-1640531527);
                    int i2 = (iHashCode ^ (iHashCode >>> 16)) & i;
                    Object obj3 = objArr[i2];
                    if (obj3 != null) {
                        if (obj3.equals(cVar)) {
                            nVar.b(i2, i, objArr);
                        } else {
                            do {
                                i2 = (i2 + 1) & i;
                                obj2 = objArr[i2];
                                if (obj2 == null) {
                                }
                            } while (!obj2.equals(cVar));
                            nVar.b(i2, i, objArr);
                        }
                        return true;
                    }
                }
                return false;
            } finally {
            }
        }
    }

    @Override // lfm.c
    public final boolean c(c cVar) {
        if (!b(cVar)) {
            return false;
        }
        cVar.dispose();
        return true;
    }

    public final void d() {
        if (this.f161042b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f161042b) {
                    return;
                }
                n nVar = this.f161041a;
                this.f161041a = null;
                e(nVar);
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // ifm.c
    public final void dispose() {
        if (this.f161042b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f161042b) {
                    return;
                }
                this.f161042b = true;
                n nVar = this.f161041a;
                this.f161041a = null;
                e(nVar);
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final int f() {
        if (this.f161042b) {
            return 0;
        }
        synchronized (this) {
            try {
                if (this.f161042b) {
                    return 0;
                }
                n nVar = this.f161041a;
                return nVar != null ? nVar.f322040b : 0;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // ifm.c
    public final boolean isDisposed() {
        return this.f161042b;
    }
}
