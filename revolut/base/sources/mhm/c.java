package mhm;

import java.io.Serializable;
import java.util.Objects;
import java.util.function.Supplier;
import nhm.p;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements e, Supplier, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile transient Supplier f205587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f205588b;

    public final boolean equals(Object obj2) {
        if (obj2 != this) {
            return (obj2 instanceof c) && Objects.equals(((c) obj2).get(), get());
        }
        return true;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        Object obj2;
        if (this.f205587a == null) {
            return this.f205588b;
        }
        synchronized (this) {
            try {
                Supplier supplier = this.f205587a;
                if (supplier != null) {
                    this.f205588b = supplier.get();
                    this.f205587a = null;
                }
                obj2 = this.f205588b;
            } catch (Throwable th10) {
                throw th10;
            }
        }
        return obj2;
    }

    public final int hashCode() {
        return Objects.hashCode(get());
    }

    @Override // mhm.e
    public final boolean isEmpty() {
        return false;
    }

    public final String toString() {
        return com.revolut.data.database.models.openbanking.d.t(new StringBuilder("Lazy("), this.f205587a == null ? this.f205588b : "?", ")");
    }

    @Override // java.lang.Iterable
    public final p iterator() {
        return p.of(get());
    }
}
