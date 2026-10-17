package x9;

import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes16.dex */
public final class i implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient int f303508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient ConcurrentHashMap f303509b;

    public i(int i, int i2) {
        this.f303509b = new ConcurrentHashMap(i, 0.8f, 4);
        this.f303508a = i2;
    }

    public final void a(Object obj2, Serializable serializable) {
        if (this.f303509b.size() >= this.f303508a) {
            synchronized (this) {
                if (this.f303509b.size() >= this.f303508a) {
                    this.f303509b.clear();
                }
            }
        }
        this.f303509b.putIfAbsent(obj2, serializable);
    }
}
