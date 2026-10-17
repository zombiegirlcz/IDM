package jp9;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class g implements k {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f177239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f177240b;

    public /* synthetic */ g(int i, String str, o oVar) {
        if (3 != (i & 3)) {
            j1.f(e.f177238a.getDescriptor(), i, 3);
            throw null;
        }
        this.f177239a = str;
        this.f177240b = oVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f177239a, gVar.f177239a) && Intrinsics.f(this.f177240b, gVar.f177240b);
    }

    public final int hashCode() {
        return this.f177240b.hashCode() + (this.f177239a.hashCode() * 31);
    }
}
