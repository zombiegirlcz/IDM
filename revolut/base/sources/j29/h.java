package j29;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170753b;

    public /* synthetic */ h(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(f.f170751a.getDescriptor(), i, 3);
            throw null;
        }
        this.f170752a = str;
        this.f170753b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f170752a, hVar.f170752a) && Intrinsics.f(this.f170753b, hVar.f170753b);
    }

    public final int hashCode() {
        return this.f170753b.hashCode() + (this.f170752a.hashCode() * 31);
    }
}
