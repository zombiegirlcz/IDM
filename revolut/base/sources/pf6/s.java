package pf6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes3.dex */
@mlm.g
public final class s {

    @NotNull
    public static final r Companion = new r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f235494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f235495b;

    public /* synthetic */ s(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(q.f235493a.getDescriptor(), i, 3);
            throw null;
        }
        this.f235494a = str;
        this.f235495b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f235494a, sVar.f235494a) && Intrinsics.f(this.f235495b, sVar.f235495b);
    }

    public final int hashCode() {
        return this.f235495b.hashCode() + (this.f235494a.hashCode() * 31);
    }
}
