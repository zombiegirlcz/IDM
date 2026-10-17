package xz8;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f309903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f309904b;

    public /* synthetic */ m(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(k.f309902a.getDescriptor(), i, 3);
            throw null;
        }
        this.f309903a = str;
        this.f309904b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f309903a, mVar.f309903a) && Intrinsics.f(this.f309904b, mVar.f309904b);
    }

    public final int hashCode() {
        return this.f309904b.hashCode() + (this.f309903a.hashCode() * 31);
    }
}
