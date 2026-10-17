package xlm;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f307052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f307053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public b f307054c;
    public long d;

    public a(String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f307052a = name;
        this.f307053b = z;
        this.d = -1L;
    }

    public abstract long a();

    public final String toString() {
        return this.f307052a;
    }
}
