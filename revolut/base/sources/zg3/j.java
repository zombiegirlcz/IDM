package zg3;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class j {

    @NotNull
    public static final i Companion = new i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f322060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f322061b;

    public /* synthetic */ j(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(h.f322059a.getDescriptor(), i, 3);
            throw null;
        }
        this.f322060a = str;
        this.f322061b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f322060a, jVar.f322060a) && Intrinsics.f(this.f322061b, jVar.f322061b);
    }

    public final int hashCode() {
        return this.f322061b.hashCode() + (this.f322060a.hashCode() * 31);
    }
}
