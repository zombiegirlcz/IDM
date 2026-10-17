package qk0;

import kotlin.jvm.internal.Intrinsics;
import mlm.g;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@g(with = f.class)
public final class b {

    @NotNull
    public static final a Companion = new a(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f246928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f246929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f246930c;

    public b(String key, Object value, Long l2) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f246928a = key;
        this.f246929b = value;
        this.f246930c = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f246928a, bVar.f246928a) && Intrinsics.f(this.f246929b, bVar.f246929b) && Intrinsics.f(this.f246930c, bVar.f246930c);
    }

    public final int hashCode() {
        int iB = p.a.b(this.f246928a.hashCode() * 31, 31, this.f246929b);
        Long l2 = this.f246930c;
        return iB + (l2 == null ? 0 : l2.hashCode());
    }
}
