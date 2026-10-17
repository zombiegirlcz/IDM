package zfm;

import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class k implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f322037a;

    public k(Throwable th10) {
        this.f322037a = th10;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof k) {
            return mfm.f.a(this.f322037a, ((k) obj2).f322037a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f322037a.hashCode();
    }

    public final String toString() {
        return "NotificationLite.Error[" + this.f322037a + "]";
    }
}
