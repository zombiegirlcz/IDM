package gf7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f143368b;

    public /* synthetic */ n(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(l.f143366a.getDescriptor(), i, 3);
            throw null;
        }
        this.f143367a = str;
        this.f143368b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f143367a, nVar.f143367a) && Intrinsics.f(this.f143368b, nVar.f143368b);
    }

    public final int hashCode() {
        return this.f143368b.hashCode() + (this.f143367a.hashCode() * 31);
    }
}
