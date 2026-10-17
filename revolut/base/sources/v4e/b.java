package v4e;

import aw0.cb;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class b {
    private b() {
    }

    public static cb a(int i) {
        cb.Companion.getClass();
        ArrayList arrayList = cb.f10268m;
        int size = arrayList.size();
        int i2 = i % size;
        return (cb) arrayList.get(i2 + (size & (((i2 ^ size) & ((-i2) | i2)) >> 31)));
    }
}
