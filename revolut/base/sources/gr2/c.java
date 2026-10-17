package gr2;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes21.dex */
@mlm.g
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f145819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f145820c;
    public final d d;

    public /* synthetic */ c(int i, String str, String str2, String str3, d dVar) {
        if (1 != (i & 1)) {
            j1.f(a.f145813a.getDescriptor(), i, 1);
            throw null;
        }
        this.f145818a = str;
        if ((i & 2) == 0) {
            this.f145819b = null;
        } else {
            this.f145819b = str2;
        }
        if ((i & 4) == 0) {
            this.f145820c = null;
        } else {
            this.f145820c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = dVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f145818a, cVar.f145818a) && Intrinsics.f(this.f145819b, cVar.f145819b) && Intrinsics.f(this.f145820c, cVar.f145820c) && Intrinsics.f(this.d, cVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f145818a.hashCode() * 31;
        String str = this.f145819b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f145820c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        d dVar = this.d;
        return iHashCode3 + (dVar != null ? dVar.hashCode() : 0);
    }
}
