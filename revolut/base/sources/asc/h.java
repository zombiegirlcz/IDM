package asc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class h {

    @NotNull
    public static final g Companion = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8920b;

    public /* synthetic */ h(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(f.f8918a.getDescriptor(), i, 3);
            throw null;
        }
        this.f8919a = str;
        this.f8920b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f8919a, hVar.f8919a) && Intrinsics.f(this.f8920b, hVar.f8920b);
    }

    public final int hashCode() {
        return this.f8920b.hashCode() + (this.f8919a.hashCode() * 31);
    }
}
