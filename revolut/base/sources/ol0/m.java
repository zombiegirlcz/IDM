package ol0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f226299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f226300b;

    public m(List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f226299a = items;
        this.f226300b = 0;
    }

    @Override // ol0.e
    public final int a() {
        return this.f226300b;
    }

    @Override // ol0.e
    public final void b(int i) {
        this.f226300b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f226299a, mVar.f226299a) && this.f226300b == mVar.f226300b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f226300b) + (this.f226299a.hashCode() * 31);
    }
}
