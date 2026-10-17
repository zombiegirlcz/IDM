package pl9;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class m {

    @NotNull
    public static final l Companion = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f237300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f237301b;

    public /* synthetic */ m(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(k.f237299a.getDescriptor(), i, 3);
            throw null;
        }
        this.f237300a = str;
        this.f237301b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f237300a, mVar.f237300a) && Intrinsics.f(this.f237301b, mVar.f237301b);
    }

    public final int hashCode() {
        return this.f237301b.hashCode() + (this.f237300a.hashCode() * 31);
    }
}
