package zmi;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f323541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f323542b;

    public /* synthetic */ r(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(p.f323540a.getDescriptor(), i, 3);
            throw null;
        }
        this.f323541a = str;
        this.f323542b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f323541a, rVar.f323541a) && Intrinsics.f(this.f323542b, rVar.f323542b);
    }

    public final int hashCode() {
        return this.f323542b.hashCode() + (this.f323541a.hashCode() * 31);
    }
}
