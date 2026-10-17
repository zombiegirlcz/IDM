package ohm;

import com.revolut.data.database.models.openbanking.d;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class b implements c, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f225408a;

    public b(Object obj2) {
        this.f225408a = obj2;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof b) {
            return Objects.equals(this.f225408a, ((b) obj2).f225408a);
        }
        return false;
    }

    @Override // ohm.c
    public final Object get() {
        return this.f225408a;
    }

    public final int hashCode() {
        return Objects.hashCode(this.f225408a);
    }

    @Override // ohm.c, mhm.e
    public final boolean isEmpty() {
        return false;
    }

    public final String toString() {
        return d.t(new StringBuilder("Some("), this.f225408a, ")");
    }
}
