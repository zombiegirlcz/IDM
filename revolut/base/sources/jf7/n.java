package jf7;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@mlm.g
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f173692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f173693b;

    public /* synthetic */ n(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(l.f173689a.getDescriptor(), i, 3);
            throw null;
        }
        this.f173692a = str;
        this.f173693b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f173692a, nVar.f173692a) && Intrinsics.f(this.f173693b, nVar.f173693b);
    }

    public final int hashCode() {
        return this.f173693b.hashCode() + (this.f173692a.hashCode() * 31);
    }
}
