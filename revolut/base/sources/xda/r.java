package xda;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f304357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f304358b;

    public /* synthetic */ r(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(p.f304355a.getDescriptor(), i, 3);
            throw null;
        }
        this.f304357a = str;
        this.f304358b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f304357a, rVar.f304357a) && Intrinsics.f(this.f304358b, rVar.f304358b);
    }

    public final int hashCode() {
        return this.f304358b.hashCode() + (this.f304357a.hashCode() * 31);
    }
}
