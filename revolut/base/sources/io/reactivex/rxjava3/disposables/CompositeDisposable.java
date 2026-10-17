package io.reactivex.rxjava3.disposables;

import ce9.m;
import ggm.a;
import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.ArrayList;
import java.util.Objects;
import ygm.g;

/* JADX INFO: loaded from: classes5.dex */
public final class CompositeDisposable implements Disposable, a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ei.a f163116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f163117b;

    public static void e(ei.a aVar) {
        if (aVar == null) {
            return;
        }
        ArrayList arrayList = null;
        for (Object obj2 : aVar.d) {
            if (obj2 instanceof Disposable) {
                try {
                    ((Disposable) obj2).dispose();
                } catch (Throwable th10) {
                    m.F(th10);
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
            throw g.f((Throwable) arrayList.get(0));
        }
    }

    @Override // ggm.a
    public final boolean a(Disposable disposable) {
        Objects.requireNonNull(disposable, "disposable is null");
        if (!this.f163117b) {
            synchronized (this) {
                try {
                    if (!this.f163117b) {
                        ei.a aVar = this.f163116a;
                        if (aVar == null) {
                            aVar = new ei.a();
                            int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros(15));
                            aVar.f126321a = iNumberOfLeadingZeros - 1;
                            aVar.f126323c = (int) (0.75f * iNumberOfLeadingZeros);
                            aVar.d = new Object[iNumberOfLeadingZeros];
                            this.f163116a = aVar;
                        }
                        aVar.a(disposable);
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
        Object obj2;
        Objects.requireNonNull(disposable, "disposable is null");
        if (this.f163117b) {
            return false;
        }
        synchronized (this) {
            try {
                if (this.f163117b) {
                    return false;
                }
                ei.a aVar = this.f163116a;
                if (aVar != null) {
                    Object[] objArr = aVar.d;
                    int i = aVar.f126321a;
                    int iHashCode = disposable.hashCode() * (-1640531527);
                    int i2 = (iHashCode ^ (iHashCode >>> 16)) & i;
                    Object obj3 = objArr[i2];
                    if (obj3 != null) {
                        if (obj3.equals(disposable)) {
                            aVar.d(i2, i, objArr);
                        } else {
                            do {
                                i2 = (i2 + 1) & i;
                                obj2 = objArr[i2];
                                if (obj2 == null) {
                                }
                            } while (!obj2.equals(disposable));
                            aVar.d(i2, i, objArr);
                        }
                        return true;
                    }
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
        disposable.dispose();
        return true;
    }

    public final void d() {
        if (this.f163117b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f163117b) {
                    return;
                }
                ei.a aVar = this.f163116a;
                this.f163116a = null;
                e(aVar);
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (this.f163117b) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f163117b) {
                    return;
                }
                this.f163117b = true;
                ei.a aVar = this.f163116a;
                this.f163116a = null;
                e(aVar);
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    public final int f() {
        if (this.f163117b) {
            return 0;
        }
        synchronized (this) {
            try {
                if (this.f163117b) {
                    return 0;
                }
                ei.a aVar = this.f163116a;
                return aVar != null ? aVar.f126322b : 0;
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final boolean isDisposed() {
        return this.f163117b;
    }
}
