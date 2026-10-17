package g7;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s7.a f141025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f141026b = -1.0f;

    public d(List list) {
        this.f141025a = (s7.a) list.get(0);
    }

    @Override // g7.b
    public final s7.a a() {
        return this.f141025a;
    }

    @Override // g7.b
    public final float e() {
        return this.f141025a.b();
    }

    @Override // g7.b
    public final boolean i(float f) {
        if (this.f141026b == f) {
            return true;
        }
        this.f141026b = f;
        return false;
    }

    @Override // g7.b
    public final boolean isEmpty() {
        return false;
    }

    @Override // g7.b
    public final boolean k(float f) {
        return !this.f141025a.c();
    }

    @Override // g7.b
    public final float o() {
        return this.f141025a.a();
    }
}
