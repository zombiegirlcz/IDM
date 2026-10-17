package pl9;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class s {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f237308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f237309b;

    public /* synthetic */ s(int i, String str, v vVar) {
        if (3 != (i & 3)) {
            j1.f(q.f237307a.getDescriptor(), i, 3);
            throw null;
        }
        this.f237308a = str;
        this.f237309b = vVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f237308a, sVar.f237308a) && Intrinsics.f(this.f237309b, sVar.f237309b);
    }

    public final int hashCode() {
        return this.f237309b.f237311a.hashCode() + (this.f237308a.hashCode() * 31);
    }
}
