package ix0;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f169226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f169227b;

    public e(int i, List letters) {
        Intrinsics.checkNotNullParameter(letters, "letters");
        this.f169226a = i;
        this.f169227b = letters;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f169226a == eVar.f169226a && Intrinsics.f(this.f169227b, eVar.f169227b);
    }

    public final int hashCode() {
        return this.f169227b.hashCode() + (Integer.hashCode(this.f169226a) * 31);
    }
}
