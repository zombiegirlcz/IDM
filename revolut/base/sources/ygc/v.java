package ygc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class v {

    @NotNull
    public static final u Companion = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f313632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f313633b;

    public /* synthetic */ v(int i, String str, c cVar) {
        if (3 != (i & 3)) {
            j1.f(t.f313631a.getDescriptor(), i, 3);
            throw null;
        }
        this.f313632a = str;
        this.f313633b = cVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f313632a, vVar.f313632a) && Intrinsics.f(this.f313633b, vVar.f313633b);
    }

    public final int hashCode() {
        int iHashCode = this.f313632a.hashCode() * 31;
        c cVar = this.f313633b;
        return iHashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public v(String text, c cVar) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.f313632a = text;
        this.f313633b = cVar;
    }
}
