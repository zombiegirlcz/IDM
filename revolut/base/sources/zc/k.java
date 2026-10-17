package zc;

import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
public final class k extends i {
    public static final k d = new k(new Object[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient Object[] f320988c;

    public k(Object[] objArr) {
        this.f320988c = objArr;
    }

    @Override // zc.i, zc.f
    public final int a(Object[] objArr) {
        System.arraycopy(this.f320988c, 0, objArr, 0, 0);
        return 0;
    }

    @Override // zc.f
    public final int b() {
        return 0;
    }

    @Override // zc.f
    public final int c() {
        return 0;
    }

    @Override // zc.f
    public final Object[] d() {
        return this.f320988c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        vc.s.e(i, 0);
        Object obj2 = this.f320988c[i];
        Objects.requireNonNull(obj2);
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return 0;
    }
}
