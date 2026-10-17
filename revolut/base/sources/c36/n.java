package c36;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20908b;

    public /* synthetic */ n(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(l.f20906a.getDescriptor(), i, 3);
            throw null;
        }
        this.f20907a = str;
        this.f20908b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f20907a, nVar.f20907a) && Intrinsics.f(this.f20908b, nVar.f20908b);
    }

    public final int hashCode() {
        return this.f20908b.hashCode() + (this.f20907a.hashCode() * 31);
    }
}
