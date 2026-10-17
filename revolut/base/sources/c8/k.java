package c8;

import ch.qos.logback.core.CoreConstants;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class k implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y8.c f22068a = new y8.c();

    public final Object a(j jVar) {
        y8.c cVar = this.f22068a;
        return cVar.containsKey(jVar) ? cVar.get(jVar) : jVar.f22065a;
    }

    @Override // c8.g
    public final boolean equals(Object obj2) {
        if (obj2 instanceof k) {
            return this.f22068a.equals(((k) obj2).f22068a);
        }
        return false;
    }

    @Override // c8.g
    public final int hashCode() {
        return this.f22068a.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.f22068a + CoreConstants.CURLY_RIGHT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c8.g
    public final void updateDiskCacheKey(MessageDigest messageDigest) {
        for (int i = 0; i < this.f22068a.getSize(); i++) {
            j jVar = (j) this.f22068a.keyAt(i);
            Object objValueAt = this.f22068a.valueAt(i);
            i iVar = jVar.f22066b;
            if (jVar.d == null) {
                jVar.d = jVar.f22067c.getBytes(g.f);
            }
            iVar.b(jVar.d, objValueAt, messageDigest);
        }
    }
}
