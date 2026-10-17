package qr2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f248618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f248619b;

    public /* synthetic */ j(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(h.f248617a.getDescriptor(), i, 3);
            throw null;
        }
        this.f248618a = str;
        this.f248619b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f248618a, jVar.f248618a) && Intrinsics.f(this.f248619b, jVar.f248619b);
    }

    public final int hashCode() {
        return this.f248619b.hashCode() + (this.f248618a.hashCode() * 31);
    }
}
