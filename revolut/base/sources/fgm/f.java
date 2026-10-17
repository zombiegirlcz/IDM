package fgm;

import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f135106b = new f(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f135107a;

    public f(Object obj2) {
        this.f135107a = obj2;
    }

    public final Throwable a() {
        Object obj2 = this.f135107a;
        if (obj2 instanceof ygm.j) {
            return ((ygm.j) obj2).f313674a;
        }
        return null;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof f) {
            return Objects.equals(this.f135107a, ((f) obj2).f135107a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj2 = this.f135107a;
        if (obj2 != null) {
            return obj2.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Object obj2 = this.f135107a;
        if (obj2 == null) {
            return "OnCompleteNotification";
        }
        if (!(obj2 instanceof ygm.j)) {
            return v0.a.h(obj2, "OnNextNotification[", "]");
        }
        return "OnErrorNotification[" + ((ygm.j) obj2).f313674a + "]";
    }
}
