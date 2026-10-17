package f8;

import android.graphics.Bitmap;
import y8.l;

/* JADX INFO: loaded from: classes16.dex */
public final class j implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f132683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f132684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bitmap.Config f132685c;

    public j(e eVar) {
        this.f132683a = eVar;
    }

    @Override // f8.h
    public final void a() {
        this.f132683a.h(this);
    }

    public final void b(int i, Bitmap.Config config) {
        this.f132684b = i;
        this.f132685c = config;
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof j) {
            j jVar = (j) obj2;
            if (this.f132684b == jVar.f132684b && l.b(this.f132685c, jVar.f132685c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f132684b * 31;
        Bitmap.Config config = this.f132685c;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return k.c(this.f132684b, this.f132685c);
    }
}
