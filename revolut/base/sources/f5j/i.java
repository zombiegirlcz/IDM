package f5j;

import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class i {

    @NotNull
    public static final g Companion = new g();
    public static final Lazy[] e = {yhm.j.c(yhm.k.PUBLICATION, new f2i.b(7)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f132350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f132351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f132352c;
    public final String d;

    public /* synthetic */ i(int i, h hVar, String str, String str2, String str3) {
        if (15 != (i & 15)) {
            j1.f(f.f132349a.getDescriptor(), i, 15);
            throw null;
        }
        this.f132350a = hVar;
        this.f132351b = str;
        this.f132352c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f132350a == iVar.f132350a && Intrinsics.f(this.f132351b, iVar.f132351b) && Intrinsics.f(this.f132352c, iVar.f132352c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f132350a.hashCode() * 31, 31, this.f132351b), 31, this.f132352c);
    }
}
