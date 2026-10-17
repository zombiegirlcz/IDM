package qo0;

/* JADX INFO: loaded from: classes19.dex */
public final class a {
    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a) || Float.compare(2.0f, 2.0f) != 0 || Float.compare(0.6f, 0.6f) != 0 || Float.compare(0.2f, 0.2f) != 0) {
            return false;
        }
        Object obj3 = ro0.a.f255730a;
        return obj3.equals(obj3);
    }

    public final int hashCode() {
        return ro0.a.f255730a.hashCode() + m72.b.b(0.2f, m72.b.b(0.6f, Float.hashCode(2.0f) * 31, 31), 31);
    }
}
