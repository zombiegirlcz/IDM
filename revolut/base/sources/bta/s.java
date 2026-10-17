package bta;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class s {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18501b;

    public /* synthetic */ s(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(q.f18499a.getDescriptor(), i, 3);
            throw null;
        }
        this.f18500a = str;
        this.f18501b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f18500a, sVar.f18500a) && Intrinsics.f(this.f18501b, sVar.f18501b);
    }

    public final int hashCode() {
        return this.f18501b.hashCode() + (this.f18500a.hashCode() * 31);
    }
}
