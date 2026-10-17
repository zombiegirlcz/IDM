package v8;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes16.dex */
public abstract class c implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f286687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f286688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u8.c f286689c;

    public c() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // v8.l
    public final void a(u8.j jVar) {
        jVar.k(this.f286687a, this.f286688b);
    }

    @Override // v8.l
    public final void c(u8.c cVar) {
        this.f286689c = cVar;
    }

    @Override // v8.l
    public final void e(u8.j jVar) {
    }

    @Override // v8.l
    public final void f(Drawable drawable) {
    }

    @Override // v8.l
    public void g(Drawable drawable) {
    }

    @Override // v8.l
    public final u8.c getRequest() {
        return this.f286689c;
    }

    @Override // r8.j
    public void onDestroy() {
    }

    @Override // r8.j
    public final void onStart() {
    }

    @Override // r8.j
    public final void onStop() {
    }

    public c(int i, int i2) {
        if (!y8.l.i(i, i2)) {
            throw new IllegalArgumentException(a0.d.g(i, i2, "Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ", " and height: "));
        }
        this.f286687a = i;
        this.f286688b = i2;
    }
}
