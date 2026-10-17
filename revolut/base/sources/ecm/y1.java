package ecm;

import com.google.common.base.MoreObjects;

/* JADX INFO: loaded from: classes13.dex */
public abstract class y1 extends i {
    @Override // ecm.i
    public void a(String str, Throwable th10) {
        f().a(str, th10);
    }

    @Override // ecm.i
    public final void b() {
        f().b();
    }

    @Override // ecm.i
    public final void c() {
        f().c();
    }

    public abstract i f();

    public final String toString() {
        return MoreObjects.toStringHelper(this).add("delegate", f()).toString();
    }
}
