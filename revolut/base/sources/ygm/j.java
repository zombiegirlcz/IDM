package ygm;

import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes14.dex */
public final class j implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f313674a;

    public j(Throwable th10) {
        this.f313674a = th10;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof j) {
            return Objects.equals(this.f313674a, ((j) obj2).f313674a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f313674a.hashCode();
    }

    public final String toString() {
        return "NotificationLite.Error[" + this.f313674a + "]";
    }
}
