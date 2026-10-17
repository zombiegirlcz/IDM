package nhm;

import java.io.Serializable;

/* JADX INFO: loaded from: classes13.dex */
public final class e extends b implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f215587a = new e();

    @Override // nhm.b
    public final ohm.c b(int i, int i2, Object obj2) {
        return ohm.a.f225407a;
    }

    @Override // nhm.b
    public final b c(int i, int i2, Object obj2, Object obj3, c cVar) {
        return cVar == c.REMOVE ? this : new k(i2, obj2, obj3);
    }

    @Override // nhm.b
    public final p d() {
        return q.f215610a;
    }

    @Override // nhm.b
    public final boolean isEmpty() {
        return true;
    }

    @Override // nhm.b
    public final int size() {
        return 0;
    }
}
